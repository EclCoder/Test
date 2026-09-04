package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class EC3TrackImpl extends AbstractTrack {
    private static final long MAX_FRAMES_PER_MMAP = 20;
    private List<BitStreamInfo> bitStreamInfos;
    private int bitrate;
    private final DataSource dataSource;
    private long[] decodingTimes;
    private int frameSize;
    SampleDescriptionBox sampleDescriptionBox;
    private List<Sample> samples;
    TrackMetaData trackMetaData;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class BitStreamInfo extends EC3SpecificBox.Entry {
        public int bitrate;
        public int chanmap;
        public int frameSize;
        public int samplerate;
        public int strmtyp;
        public int substreamid;

        @Override // com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry
        public String toString() {
            return "BitStreamInfo{frameSize=" + this.frameSize + ", substreamid=" + this.substreamid + ", bitrate=" + this.bitrate + ", samplerate=" + this.samplerate + ", strmtyp=" + this.strmtyp + ", chanmap=" + this.chanmap + '}';
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public EC3TrackImpl(DataSource dataSource) throws IOException {
        super(dataSource.toString());
        this.trackMetaData = new TrackMetaData();
        this.bitStreamInfos = new LinkedList();
        this.dataSource = dataSource;
        boolean z10 = false;
        while (!z10) {
            BitStreamInfo variables = readVariables();
            if (variables == null) {
                throw new IOException();
            }
            for (BitStreamInfo bitStreamInfo : this.bitStreamInfos) {
                if (variables.strmtyp != 1 && bitStreamInfo.substreamid == variables.substreamid) {
                    z10 = true;
                }
            }
            if (!z10) {
                this.bitStreamInfos.add(variables);
            }
        }
        if (this.bitStreamInfos.size() == 0) {
            throw new IOException();
        }
        int i10 = this.bitStreamInfos.get(0).samplerate;
        this.sampleDescriptionBox = new SampleDescriptionBox();
        AudioSampleEntry audioSampleEntry = new AudioSampleEntry(AudioSampleEntry.TYPE9);
        audioSampleEntry.setChannelCount(2);
        long j10 = i10;
        audioSampleEntry.setSampleRate(j10);
        audioSampleEntry.setDataReferenceIndex(1);
        audioSampleEntry.setSampleSize(16);
        EC3SpecificBox eC3SpecificBox = new EC3SpecificBox();
        int[] iArr = new int[this.bitStreamInfos.size()];
        int[] iArr2 = new int[this.bitStreamInfos.size()];
        for (BitStreamInfo bitStreamInfo2 : this.bitStreamInfos) {
            if (bitStreamInfo2.strmtyp == 1) {
                int i11 = bitStreamInfo2.substreamid;
                iArr[i11] = iArr[i11] + 1;
                int i12 = bitStreamInfo2.chanmap;
                iArr2[i11] = ((i12 >> 5) & 255) | ((i12 >> 6) & 256);
            }
        }
        for (BitStreamInfo bitStreamInfo3 : this.bitStreamInfos) {
            if (bitStreamInfo3.strmtyp != 1) {
                EC3SpecificBox.Entry entry = new EC3SpecificBox.Entry();
                entry.fscod = bitStreamInfo3.fscod;
                entry.bsid = bitStreamInfo3.bsid;
                entry.bsmod = bitStreamInfo3.bsmod;
                entry.acmod = bitStreamInfo3.acmod;
                entry.lfeon = bitStreamInfo3.lfeon;
                entry.reserved = 0;
                int i13 = bitStreamInfo3.substreamid;
                entry.num_dep_sub = iArr[i13];
                entry.chan_loc = iArr2[i13];
                entry.reserved2 = 0;
                eC3SpecificBox.addEntry(entry);
            }
            this.bitrate += bitStreamInfo3.bitrate;
            this.frameSize += bitStreamInfo3.frameSize;
        }
        eC3SpecificBox.setDataRate(this.bitrate / 1000);
        audioSampleEntry.addBox(eC3SpecificBox);
        this.sampleDescriptionBox.addBox(audioSampleEntry);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setTimescale(j10);
        this.trackMetaData.setVolume(1.0f);
        dataSource.position(0L);
        List<Sample> samples = readSamples();
        this.samples = samples;
        long[] jArr = new long[samples.size()];
        this.decodingTimes = jArr;
        Arrays.fill(jArr, 1536L);
    }

    private List<Sample> readSamples() {
        int iL2i = CastUtils.l2i((this.dataSource.size() - this.dataSource.position()) / ((long) this.frameSize));
        ArrayList arrayList = new ArrayList(iL2i);
        for (int i10 = 0; i10 < iL2i; i10++) {
            final int i11 = this.frameSize * i10;
            arrayList.add(new Sample() { // from class: com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl.1
                @Override // com.googlecode.mp4parser.authoring.Sample
                public ByteBuffer asByteBuffer() {
                    try {
                        return EC3TrackImpl.this.dataSource.map(i11, EC3TrackImpl.this.frameSize);
                    } catch (IOException e10) {
                        throw new RuntimeException(e10);
                    }
                }

                @Override // com.googlecode.mp4parser.authoring.Sample
                public long getSize() {
                    return EC3TrackImpl.this.frameSize;
                }

                @Override // com.googlecode.mp4parser.authoring.Sample
                public void writeTo(WritableByteChannel writableByteChannel) {
                    EC3TrackImpl.this.dataSource.transferTo(i11, EC3TrackImpl.this.frameSize, writableByteChannel);
                }
            });
        }
        return arrayList;
    }

    private BitStreamInfo readVariables() {
        int bits;
        int bits2;
        int i10;
        long jPosition = this.dataSource.position();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        this.dataSource.read(byteBufferAllocate);
        byteBufferAllocate.rewind();
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBufferAllocate);
        if (bitReaderBuffer.readBits(16) != 2935) {
            return null;
        }
        BitStreamInfo bitStreamInfo = new BitStreamInfo();
        bitStreamInfo.strmtyp = bitReaderBuffer.readBits(2);
        bitStreamInfo.substreamid = bitReaderBuffer.readBits(3);
        bitStreamInfo.frameSize = (bitReaderBuffer.readBits(11) + 1) * 2;
        int bits3 = bitReaderBuffer.readBits(2);
        bitStreamInfo.fscod = bits3;
        if (bits3 == 3) {
            bits2 = bitReaderBuffer.readBits(2);
            bits = 3;
        } else {
            bits = bitReaderBuffer.readBits(2);
            bits2 = -1;
        }
        if (bits == 0) {
            i10 = 1;
        } else if (bits == 1) {
            i10 = 2;
        } else if (bits != 2) {
            i10 = bits != 3 ? 0 : 6;
        } else {
            i10 = 3;
        }
        bitStreamInfo.frameSize *= 6 / i10;
        bitStreamInfo.acmod = bitReaderBuffer.readBits(3);
        bitStreamInfo.lfeon = bitReaderBuffer.readBits(1);
        bitStreamInfo.bsid = bitReaderBuffer.readBits(5);
        bitReaderBuffer.readBits(5);
        if (1 == bitReaderBuffer.readBits(1)) {
            bitReaderBuffer.readBits(8);
        }
        if (bitStreamInfo.acmod == 0) {
            bitReaderBuffer.readBits(5);
            if (1 == bitReaderBuffer.readBits(1)) {
                bitReaderBuffer.readBits(8);
            }
        }
        if (1 == bitStreamInfo.strmtyp && 1 == bitReaderBuffer.readBits(1)) {
            bitStreamInfo.chanmap = bitReaderBuffer.readBits(16);
        }
        if (1 == bitReaderBuffer.readBits(1)) {
            if (bitStreamInfo.acmod > 2) {
                bitReaderBuffer.readBits(2);
            }
            int i11 = bitStreamInfo.acmod;
            if (1 == (i11 & 1) && i11 > 2) {
                bitReaderBuffer.readBits(3);
                bitReaderBuffer.readBits(3);
            }
            if ((bitStreamInfo.acmod & 4) > 0) {
                bitReaderBuffer.readBits(3);
                bitReaderBuffer.readBits(3);
            }
            if (1 == bitStreamInfo.lfeon && 1 == bitReaderBuffer.readBits(1)) {
                bitReaderBuffer.readBits(5);
            }
            if (bitStreamInfo.strmtyp == 0) {
                if (1 == bitReaderBuffer.readBits(1)) {
                    bitReaderBuffer.readBits(6);
                }
                if (bitStreamInfo.acmod == 0 && 1 == bitReaderBuffer.readBits(1)) {
                    bitReaderBuffer.readBits(6);
                }
                if (1 == bitReaderBuffer.readBits(1)) {
                    bitReaderBuffer.readBits(6);
                }
                int bits4 = bitReaderBuffer.readBits(2);
                if (1 == bits4) {
                    bitReaderBuffer.readBits(5);
                } else if (2 == bits4) {
                    bitReaderBuffer.readBits(12);
                } else if (3 == bits4) {
                    int bits5 = bitReaderBuffer.readBits(5);
                    if (1 == bitReaderBuffer.readBits(1)) {
                        bitReaderBuffer.readBits(5);
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            if (1 == bitReaderBuffer.readBits(1)) {
                                bitReaderBuffer.readBits(4);
                            }
                            if (1 == bitReaderBuffer.readBits(1)) {
                                bitReaderBuffer.readBits(4);
                            }
                        }
                    }
                    if (1 == bitReaderBuffer.readBits(1)) {
                        bitReaderBuffer.readBits(5);
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(7);
                            if (1 == bitReaderBuffer.readBits(1)) {
                                bitReaderBuffer.readBits(8);
                            }
                        }
                    }
                    for (int i12 = 0; i12 < bits5 + 2; i12++) {
                        bitReaderBuffer.readBits(8);
                    }
                    bitReaderBuffer.byteSync();
                }
                if (bitStreamInfo.acmod < 2) {
                    if (1 == bitReaderBuffer.readBits(1)) {
                        bitReaderBuffer.readBits(14);
                    }
                    if (bitStreamInfo.acmod == 0 && 1 == bitReaderBuffer.readBits(1)) {
                        bitReaderBuffer.readBits(14);
                    }
                    if (1 == bitReaderBuffer.readBits(1)) {
                        if (bits == 0) {
                            bitReaderBuffer.readBits(5);
                        } else {
                            for (int i13 = 0; i13 < i10; i13++) {
                                if (1 == bitReaderBuffer.readBits(1)) {
                                    bitReaderBuffer.readBits(5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (1 == bitReaderBuffer.readBits(1)) {
            bitStreamInfo.bsmod = bitReaderBuffer.readBits(3);
        }
        int i14 = bitStreamInfo.fscod;
        if (i14 == 0) {
            bitStreamInfo.samplerate = 48000;
        } else if (i14 == 1) {
            bitStreamInfo.samplerate = 44100;
        } else if (i14 == 2) {
            bitStreamInfo.samplerate = 32000;
        } else if (i14 == 3) {
            if (bits2 == 0) {
                bitStreamInfo.samplerate = 24000;
            } else if (bits2 == 1) {
                bitStreamInfo.samplerate = 22050;
            } else if (bits2 == 2) {
                bitStreamInfo.samplerate = 16000;
            } else if (bits2 == 3) {
                bitStreamInfo.samplerate = 0;
            }
        }
        int i15 = bitStreamInfo.samplerate;
        if (i15 == 0) {
            return null;
        }
        int i16 = bitStreamInfo.frameSize;
        bitStreamInfo.bitrate = (int) ((((double) i15) / 1536.0d) * ((double) i16) * 8.0d);
        this.dataSource.position(jPosition + ((long) i16));
        return bitStreamInfo;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.dataSource.close();
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return "soun";
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
        return this.decodingTimes;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        return this.samples;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }

    public String toString() {
        return "EC3TrackImpl{bitrate=" + this.bitrate + ", bitStreamInfos=" + this.bitStreamInfos + '}';
    }
}
