package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.DTSSpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DTSTrackImpl extends AbstractTrack {
    private static final int BUFFER = 67108864;
    int bcCoreBitRate;
    int bcCoreChannelMask;
    int bcCoreMaxSampleRate;
    int bitrate;
    int channelCount;
    int channelMask;
    int codecDelayAtMaxFs;
    int coreBitRate;
    int coreChannelMask;
    int coreFramePayloadInBytes;
    int coreMaxSampleRate;
    boolean coreSubStreamPresent;
    private int dataOffset;
    private DataSource dataSource;
    DTSSpecificBox ddts;
    int extAvgBitrate;
    int extFramePayloadInBytes;
    int extPeakBitrate;
    int extSmoothBuffSize;
    boolean extensionSubStreamPresent;
    int frameSize;
    boolean isVBR;
    private String lang;
    int lbrCodingPresent;
    int lsbTrimPercent;
    int maxSampleRate;
    int numExtSubStreams;
    int numFramesTotal;
    int numSamplesOrigAudioAtMaxFs;
    SampleDescriptionBox sampleDescriptionBox;
    private long[] sampleDurations;
    int sampleSize;
    int samplerate;
    private List<Sample> samples;
    int samplesPerFrame;
    int samplesPerFrameAtMaxFs;
    TrackMetaData trackMetaData;
    String type;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class LookAhead {
        ByteBuffer buffer;
        long bufferStartPos;
        private final int corePresent;
        long dataEnd;
        DataSource dataSource;
        int inBufferPos = 0;
        long start;

        LookAhead(DataSource dataSource, long j10, long j11, int i10) {
            this.dataSource = dataSource;
            this.bufferStartPos = j10;
            this.dataEnd = j11 + j10;
            this.corePresent = i10;
            fillBuffer();
        }

        private void discardByte() {
            this.inBufferPos++;
        }

        private void discardNext4AndMarkStart() {
            long j10 = this.bufferStartPos;
            int i10 = this.inBufferPos;
            this.start = j10 + ((long) i10);
            this.inBufferPos = i10 + 4;
        }

        private void discardQWord() {
            this.inBufferPos += 4;
        }

        private void fillBuffer() {
            System.err.println("Fill Buffer");
            DataSource dataSource = this.dataSource;
            long j10 = this.bufferStartPos;
            this.buffer = dataSource.map(j10, Math.min(this.dataEnd - j10, 67108864L));
        }

        private ByteBuffer getSample() {
            long j10 = this.start;
            long j11 = this.bufferStartPos;
            if (j10 < j11) {
                throw new RuntimeException("damn! NAL exceeds buffer");
            }
            this.buffer.position((int) (j10 - j11));
            ByteBuffer byteBufferSlice = this.buffer.slice();
            byteBufferSlice.limit((int) (((long) this.inBufferPos) - (this.start - this.bufferStartPos)));
            return byteBufferSlice;
        }

        private boolean nextFourEquals(byte b10, byte b11, byte b12, byte b13) throws EOFException {
            int iLimit = this.buffer.limit();
            int i10 = this.inBufferPos;
            if (iLimit - i10 >= 4) {
                return this.buffer.get(i10) == b10 && this.buffer.get(this.inBufferPos + 1) == b11 && this.buffer.get(this.inBufferPos + 2) == b12 && this.buffer.get(this.inBufferPos + 3) == b13;
            }
            if (this.bufferStartPos + ((long) i10) + 4 < this.dataSource.size()) {
                return false;
            }
            throw new EOFException();
        }

        private boolean nextFourEquals0x64582025() {
            return nextFourEquals((byte) 100, (byte) 88, (byte) 32, (byte) 37);
        }

        private boolean nextFourEquals0x64582025orEof() {
            return nextFourEqualsOrEof((byte) 100, (byte) 88, (byte) 32, (byte) 37);
        }

        private boolean nextFourEquals0x7FFE8001() {
            return nextFourEquals((byte) 127, (byte) -2, (byte) -128, (byte) 1);
        }

        private boolean nextFourEquals0x7FFE8001orEof() {
            return nextFourEqualsOrEof((byte) 127, (byte) -2, (byte) -128, (byte) 1);
        }

        private boolean nextFourEqualsOrEof(byte b10, byte b11, byte b12, byte b13) {
            int iLimit = this.buffer.limit();
            int i10 = this.inBufferPos;
            if (iLimit - i10 >= 4) {
                if ((this.bufferStartPos + ((long) i10)) % 1048576 == 0) {
                    PrintStream printStream = System.err;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(((this.bufferStartPos + ((long) this.inBufferPos)) / 1024) / 1024);
                    printStream.println(sb2.toString());
                }
                return this.buffer.get(this.inBufferPos) == b10 && this.buffer.get(this.inBufferPos + 1) == b11 && this.buffer.get(this.inBufferPos + 2) == b12 && this.buffer.get(this.inBufferPos + 3) == b13;
            }
            long j10 = this.bufferStartPos;
            long j11 = ((long) i10) + j10 + 4;
            long j12 = this.dataEnd;
            if (j11 > j12) {
                return j10 + ((long) i10) == j12;
            }
            this.bufferStartPos = this.start;
            this.inBufferPos = 0;
            fillBuffer();
            return nextFourEquals0x7FFE8001();
        }

        public ByteBuffer findNextStart() {
            while (true) {
                try {
                    if (this.corePresent == 1) {
                        if (nextFourEquals0x7FFE8001()) {
                            break;
                        }
                        discardByte();
                    } else {
                        if (nextFourEquals0x64582025()) {
                            break;
                        }
                        discardByte();
                    }
                } catch (EOFException unused) {
                    return null;
                }
            }
            discardNext4AndMarkStart();
            while (true) {
                if (this.corePresent == 1) {
                    if (nextFourEquals0x7FFE8001orEof()) {
                        break;
                    }
                    discardQWord();
                } else {
                    if (nextFourEquals0x64582025orEof()) {
                        break;
                    }
                    discardQWord();
                }
            }
            return getSample();
        }
    }

    public DTSTrackImpl(DataSource dataSource, String str) throws IOException {
        super(dataSource.toString());
        this.trackMetaData = new TrackMetaData();
        this.frameSize = 0;
        this.dataOffset = 0;
        this.ddts = new DTSSpecificBox();
        this.isVBR = false;
        this.coreSubStreamPresent = false;
        this.extensionSubStreamPresent = false;
        this.numExtSubStreams = 0;
        this.coreMaxSampleRate = 0;
        this.coreBitRate = 0;
        this.coreChannelMask = 0;
        this.coreFramePayloadInBytes = 0;
        this.extAvgBitrate = 0;
        this.extPeakBitrate = 0;
        this.extSmoothBuffSize = 0;
        this.extFramePayloadInBytes = 0;
        this.maxSampleRate = 0;
        this.lbrCodingPresent = 0;
        this.numFramesTotal = 0;
        this.samplesPerFrameAtMaxFs = 0;
        this.numSamplesOrigAudioAtMaxFs = 0;
        this.channelMask = 0;
        this.codecDelayAtMaxFs = 0;
        this.bcCoreMaxSampleRate = 0;
        this.bcCoreBitRate = 0;
        this.bcCoreChannelMask = 0;
        this.lsbTrimPercent = 0;
        this.type = DevicePublicKeyStringDef.NONE;
        this.lang = str;
        this.dataSource = dataSource;
        parse();
    }

    private List<Sample> generateSamples(DataSource dataSource, int i10, long j10, int i11) {
        LookAhead lookAhead = new LookAhead(dataSource, i10, j10, i11);
        ArrayList arrayList = new ArrayList();
        while (true) {
            final ByteBuffer byteBufferFindNextStart = lookAhead.findNextStart();
            if (byteBufferFindNextStart == null) {
                System.err.println("all samples found");
                return arrayList;
            }
            arrayList.add(new Sample() { // from class: com.googlecode.mp4parser.authoring.tracks.DTSTrackImpl.1
                @Override // com.googlecode.mp4parser.authoring.Sample
                public ByteBuffer asByteBuffer() {
                    return byteBufferFindNextStart;
                }

                @Override // com.googlecode.mp4parser.authoring.Sample
                public long getSize() {
                    return byteBufferFindNextStart.rewind().remaining();
                }

                @Override // com.googlecode.mp4parser.authoring.Sample
                public void writeTo(WritableByteChannel writableByteChannel) throws IOException {
                    writableByteChannel.write((ByteBuffer) byteBufferFindNextStart.rewind());
                }
            });
        }
    }

    private int getBitRate(int i10) throws IOException {
        switch (i10) {
            case 0:
                return 32;
            case 1:
                return 56;
            case 2:
                return 64;
            case 3:
                return 96;
            case 4:
                return Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
            case 5:
                return 128;
            case 6:
                return PsExtractor.AUDIO_STREAM;
            case 7:
                return 224;
            case 8:
                return 256;
            case 9:
                return Sdk$SDKError.b.WEBVIEW_ERROR_VALUE;
            case 10:
                return 384;
            case 11:
                return 448;
            case 12:
                return 512;
            case 13:
                return 576;
            case 14:
                return 640;
            case 15:
                return 768;
            case 16:
                return 960;
            case 17:
                return UserVerificationMethods.USER_VERIFY_ALL;
            case 18:
                return 1152;
            case 19:
                return 1280;
            case 20:
                return 1344;
            case 21:
                return 1408;
            case 22:
                return 1411;
            case 23:
                return 1472;
            case 24:
                return 1536;
            case 25:
                return -1;
            default:
                throw new IOException("Unknown bitrate value");
        }
    }

    private int getSampleRate(int i10) throws IOException {
        switch (i10) {
            case 1:
                return 8000;
            case 2:
                return 16000;
            case 3:
                return 32000;
            case 4:
            case 5:
            case 9:
            case 10:
            default:
                throw new IOException("Unknown Sample Rate");
            case 6:
                return 11025;
            case 7:
                return 22050;
            case 8:
                return 44100;
            case 11:
                return 12000;
            case 12:
                return 24000;
            case 13:
                return 48000;
        }
    }

    private void parse() throws IOException {
        if (!readVariables()) {
            throw new IOException();
        }
        this.sampleDescriptionBox = new SampleDescriptionBox();
        AudioSampleEntry audioSampleEntry = new AudioSampleEntry(this.type);
        audioSampleEntry.setChannelCount(this.channelCount);
        audioSampleEntry.setSampleRate(this.samplerate);
        audioSampleEntry.setDataReferenceIndex(1);
        audioSampleEntry.setSampleSize(16);
        audioSampleEntry.addBox(this.ddts);
        this.sampleDescriptionBox.addBox(audioSampleEntry);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setLanguage(this.lang);
        this.trackMetaData.setTimescale(this.samplerate);
    }

    private boolean parseAuprhdr(int i10, ByteBuffer byteBuffer) {
        int i11;
        byteBuffer.get();
        short s10 = byteBuffer.getShort();
        this.maxSampleRate = (byteBuffer.get() << 16) | (byteBuffer.getShort() & 65535);
        this.numFramesTotal = byteBuffer.getInt();
        this.samplesPerFrameAtMaxFs = byteBuffer.getShort();
        this.numSamplesOrigAudioAtMaxFs = (byteBuffer.get() << 32) | (byteBuffer.getInt() & 65535);
        this.channelMask = byteBuffer.getShort();
        this.codecDelayAtMaxFs = byteBuffer.getShort();
        if ((s10 & 3) == 3) {
            this.bcCoreMaxSampleRate = (byteBuffer.get() << 16) | (byteBuffer.getShort() & 65535);
            this.bcCoreBitRate = byteBuffer.getShort();
            this.bcCoreChannelMask = byteBuffer.getShort();
            i11 = 28;
        } else {
            i11 = 21;
        }
        if ((s10 & 4) > 0) {
            this.lsbTrimPercent = byteBuffer.get();
            i11++;
        }
        if ((s10 & 8) > 0) {
            this.lbrCodingPresent = 1;
        }
        while (i11 < i10) {
            byteBuffer.get();
            i11++;
        }
        return true;
    }

    private boolean parseCoressmd(int i10, ByteBuffer byteBuffer) {
        this.coreMaxSampleRate = (byteBuffer.get() << 16) | (byteBuffer.getShort() & 65535);
        this.coreBitRate = byteBuffer.getShort();
        this.coreChannelMask = byteBuffer.getShort();
        this.coreFramePayloadInBytes = byteBuffer.getInt();
        for (int i11 = 11; i11 < i10; i11++) {
            byteBuffer.get();
        }
        return true;
    }

    private void parseDtshdhdr(int i10, ByteBuffer byteBuffer) {
        byteBuffer.getInt();
        byteBuffer.get();
        byteBuffer.getInt();
        byteBuffer.get();
        short s10 = byteBuffer.getShort();
        byteBuffer.get();
        byte b10 = byteBuffer.get();
        this.numExtSubStreams = b10;
        if ((s10 & 1) == 1) {
            this.isVBR = true;
        }
        if ((s10 & 8) == 8) {
            this.coreSubStreamPresent = true;
        }
        if ((s10 & 16) == 16) {
            this.extensionSubStreamPresent = true;
            this.numExtSubStreams = b10 + 1;
        } else {
            this.numExtSubStreams = 0;
        }
        for (int i11 = 14; i11 < i10; i11++) {
            byteBuffer.get();
        }
    }

    private boolean parseExtssmd(int i10, ByteBuffer byteBuffer) {
        int i11;
        this.extAvgBitrate = (byteBuffer.get() << 16) | (byteBuffer.getShort() & 65535);
        if (this.isVBR) {
            this.extPeakBitrate = (byteBuffer.get() << 16) | (byteBuffer.getShort() & 65535);
            this.extSmoothBuffSize = byteBuffer.getShort();
            i11 = 8;
        } else {
            this.extFramePayloadInBytes = byteBuffer.getInt();
            i11 = 7;
        }
        while (i11 < i10) {
            byteBuffer.get();
            i11++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:306:0x045a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.googlecode.mp4parser.boxes.DTSSpecificBox] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [int] */
    /* JADX WARN: Type inference failed for: r5v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.googlecode.mp4parser.boxes.DTSSpecificBox] */
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
    private boolean readVariables() throws IOException {
        ?? r10;
        ?? r11;
        boolean z10;
        boolean z11;
        int i10;
        ?? r12;
        int i11;
        boolean z12;
        ByteBuffer map = this.dataSource.map(0L, 25000L);
        int i12 = map.getInt();
        int i13 = map.getInt();
        if (i12 != 1146377032 || i13 != 1145586770) {
            throw new IOException("data does not start with 'DTSHDHDR' as required for a DTS-HD file");
        }
        while (true) {
            if ((i12 == 1398035021 && i13 == 1145132097) || map.remaining() <= 100) {
                break;
            }
            int i14 = (int) map.getLong();
            if (i12 == 1146377032 && i13 == 1145586770) {
                parseDtshdhdr(i14, map);
            } else if (i12 == 1129271877 && i13 == 1397968196) {
                if (!parseCoressmd(i14, map)) {
                    return false;
                }
            } else if (i12 == 1096110162 && i13 == 759710802) {
                if (!parseAuprhdr(i14, map)) {
                    return false;
                }
            } else if (i12 == 1163416659 && i13 == 1398754628) {
                if (!parseExtssmd(i14, map)) {
                    return false;
                }
            } else {
                for (int i15 = 0; i15 < i14; i15++) {
                    map.get();
                }
            }
            i12 = map.getInt();
            i13 = map.getInt();
        }
        long j10 = map.getLong();
        this.dataOffset = map.position();
        boolean z13 = false;
        int i16 = -1;
        int i17 = 0;
        int bits = -1;
        byte b10 = -1;
        boolean z14 = false;
        boolean z15 = false;
        int i18 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        while (true) {
            int i19 = 1;
            if (z13) {
                int i20 = this.samplesPerFrame;
                if (i20 == 512) {
                    r10 = z19;
                } else if (i20 == 1024) {
                    r10 = 1;
                } else if (i20 != 2048) {
                    r10 = i20 != 4096 ? -1 : 3;
                } else {
                    r10 = 2;
                }
                if (r10 == -1) {
                    return z19;
                }
                if (bits != 0 && bits != 2) {
                    switch (bits) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            break;
                        default:
                            bits = 31;
                            break;
                    }
                }
                if (i16 == 0) {
                    if (z14) {
                        if (z17) {
                            this.type = AudioSampleEntry.TYPE12;
                            r12 = 21;
                        } else {
                            this.type = AudioSampleEntry.TYPE11;
                            r12 = 17;
                        }
                    } else if (z16) {
                        this.type = AudioSampleEntry.TYPE13;
                        r12 = 18;
                    } else if (z17) {
                        this.type = AudioSampleEntry.TYPE12;
                        if (!z18 && !z14) {
                            r12 = 19;
                        } else if (z18 && !z14) {
                            r12 = 20;
                        } else if (z18 || !z14) {
                            r12 = z19;
                        } else {
                            r12 = 21;
                        }
                    } else {
                        r12 = z19;
                    }
                    this.samplerate = this.maxSampleRate;
                    this.sampleSize = 24;
                    r11 = r12;
                } else if (b10 >= 1) {
                    this.type = AudioSampleEntry.TYPE12;
                    if (i18 == 0) {
                        if (z17 || !z18) {
                            z10 = z20;
                            z11 = z21;
                        } else {
                            z10 = z20;
                            z11 = z21;
                            if (!z10 && !z11 && !z14 && !z16) {
                                r11 = 5;
                            }
                        }
                        if (!z17 && !z18 && !z10 && z11 && !z14 && !z16) {
                            r11 = 6;
                        } else if (!z17 && z18 && !z10 && z11 && !z14 && !z16) {
                            r11 = 9;
                        } else if (!z17 && !z18 && z10 && !z11 && !z14 && !z16) {
                            r11 = 10;
                        } else if (!z17 && z18 && z10 && !z11 && !z14 && !z16) {
                            r11 = 13;
                        } else if (z17 || z18 || z10 || z11 || !z14 || z16) {
                            r11 = z19;
                        } else {
                            r11 = 14;
                        }
                    } else {
                        boolean z22 = z20;
                        boolean z23 = z21;
                        if (i17 == 0 && !z17 && !z18 && !z22 && z23 && !z14 && !z16) {
                            r11 = 7;
                        } else if (i17 == 6 && !z17 && !z18 && !z22 && z23 && !z14 && !z16) {
                            r11 = 8;
                        } else if (i17 == 0 && !z17 && !z18 && z22 && !z23 && !z14 && !z16) {
                            r11 = 11;
                        } else if (i17 == 6 && !z17 && !z18 && z22 && !z23 && !z14 && !z16) {
                            r11 = 12;
                        } else if (i17 == 0 && !z17 && !z18 && !z22 && !z23 && z14 && !z16) {
                            r11 = 15;
                        } else if (i17 != 2 || z17 || z18 || z22 || z23 || !z14 || z16) {
                            r11 = z19;
                        } else {
                            r11 = 16;
                        }
                    }
                } else if (i18 <= 0) {
                    this.type = "dtsc";
                    r11 = 1;
                } else if (i17 == 0) {
                    this.type = "dtsc";
                    r11 = 2;
                } else if (i17 == 2) {
                    this.type = "dtsc";
                    r11 = 4;
                } else if (i17 != 6) {
                    this.type = AudioSampleEntry.TYPE12;
                    r11 = z19;
                } else {
                    this.type = AudioSampleEntry.TYPE12;
                    r11 = 3;
                }
                this.ddts.setDTSSamplingFrequency(this.maxSampleRate);
                if (this.isVBR) {
                    this.ddts.setMaxBitRate((this.coreBitRate + this.extPeakBitrate) * 1000);
                } else {
                    this.ddts.setMaxBitRate((this.coreBitRate + this.extAvgBitrate) * 1000);
                }
                this.ddts.setAvgBitRate((this.coreBitRate + this.extAvgBitrate) * 1000);
                this.ddts.setPcmSampleDepth(this.sampleSize);
                this.ddts.setFrameDuration(r10);
                this.ddts.setStreamConstruction(r11);
                int i21 = this.coreChannelMask;
                if ((i21 & 8) > 0 || (i21 & 4096) > 0) {
                    this.ddts.setCoreLFEPresent(1);
                } else {
                    this.ddts.setCoreLFEPresent(z19 ? 1 : 0);
                }
                this.ddts.setCoreLayout(bits);
                this.ddts.setCoreSize(this.coreFramePayloadInBytes);
                this.ddts.setStereoDownmix(0);
                this.ddts.setRepresentationType(4);
                this.ddts.setChannelLayout(this.channelMask);
                if (this.coreMaxSampleRate <= 0 || this.extAvgBitrate <= 0) {
                    i10 = 0;
                    this.ddts.setMultiAssetFlag(0);
                } else {
                    this.ddts.setMultiAssetFlag(1);
                    i10 = 0;
                }
                this.ddts.setLBRDurationMod(this.lbrCodingPresent);
                this.ddts.setReservedBoxPresent(i10);
                this.channelCount = i10;
                int i22 = 0;
                while (i22 < 16) {
                    int i23 = i16;
                    int i24 = i19;
                    if (((this.channelMask >> i22) & i24) == i24) {
                        if (i22 == 0 || i22 == 12 || i22 == 14 || i22 == 3 || i22 == 4 || i22 == 7 || i22 == 8) {
                            this.channelCount += i24;
                        } else {
                            this.channelCount += 2;
                        }
                    }
                    i22++;
                    i16 = i23;
                    i19 = i24;
                }
                ?? r13 = i19;
                List<Sample> listGenerateSamples = generateSamples(this.dataSource, this.dataOffset, j10, i16);
                this.samples = listGenerateSamples;
                long[] jArr = new long[listGenerateSamples.size()];
                this.sampleDurations = jArr;
                Arrays.fill(jArr, this.samplesPerFrame);
                return r13;
            }
            int i25 = i16;
            z20 = z20;
            z21 = z21;
            int iPosition = map.position();
            int i26 = map.getInt();
            j10 = j10;
            if (i26 == 2147385345) {
                if (i25 == 1) {
                    i16 = i25;
                    z13 = true;
                } else {
                    BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(map);
                    int bits2 = bitReaderBuffer.readBits(1);
                    int bits3 = bitReaderBuffer.readBits(5);
                    int bits4 = bitReaderBuffer.readBits(1);
                    if (bits2 != 1 || bits3 != 31 || bits4 != 0) {
                        return false;
                    }
                    this.samplesPerFrame = (bitReaderBuffer.readBits(7) + 1) * 32;
                    int bits5 = bitReaderBuffer.readBits(14);
                    this.frameSize += bits5 + 1;
                    bits = bitReaderBuffer.readBits(6);
                    this.samplerate = getSampleRate(bitReaderBuffer.readBits(4));
                    this.bitrate = getBitRate(bitReaderBuffer.readBits(5));
                    if (bitReaderBuffer.readBits(1) != 0) {
                        return false;
                    }
                    bitReaderBuffer.readBits(1);
                    bitReaderBuffer.readBits(1);
                    bitReaderBuffer.readBits(1);
                    bitReaderBuffer.readBits(1);
                    int bits6 = bitReaderBuffer.readBits(3);
                    int bits7 = bitReaderBuffer.readBits(1);
                    bitReaderBuffer.readBits(1);
                    bitReaderBuffer.readBits(2);
                    bitReaderBuffer.readBits(1);
                    if (bits4 == 1) {
                        bitReaderBuffer.readBits(16);
                    }
                    bitReaderBuffer.readBits(1);
                    int bits8 = bitReaderBuffer.readBits(4);
                    bitReaderBuffer.readBits(2);
                    int bits9 = bitReaderBuffer.readBits(3);
                    if (bits9 == 0 || bits9 == 1) {
                        this.sampleSize = 16;
                    } else if (bits9 == 2 || bits9 == 3) {
                        this.sampleSize = 20;
                    } else {
                        if (bits9 != 5 && bits9 != 6) {
                            return false;
                        }
                        this.sampleSize = 24;
                    }
                    bitReaderBuffer.readBits(1);
                    bitReaderBuffer.readBits(1);
                    if (bits8 == 6 || bits8 != 7) {
                        bitReaderBuffer.readBits(4);
                    } else {
                        bitReaderBuffer.readBits(4);
                    }
                    map.position(iPosition + bits5 + 1);
                    i18 = bits7;
                    i17 = bits6;
                    i16 = 1;
                }
                z19 = false;
            } else {
                if (i26 != 1683496997) {
                    throw new IOException("No DTS_SYNCWORD_* found at " + map.position());
                }
                if (i25 == -1) {
                    this.samplesPerFrame = this.samplesPerFrameAtMaxFs;
                    i16 = 0;
                } else {
                    i16 = i25;
                }
                BitReaderBuffer bitReaderBuffer2 = new BitReaderBuffer(map);
                int i27 = 8;
                bitReaderBuffer2.readBits(8);
                bitReaderBuffer2.readBits(2);
                if (bitReaderBuffer2.readBits(1) == 0) {
                    i11 = 16;
                } else {
                    i27 = 12;
                    i11 = 20;
                }
                int bits10 = bitReaderBuffer2.readBits(i27) + 1;
                int bits11 = bitReaderBuffer2.readBits(i11) + 1;
                map.position(iPosition + bits10);
                int i28 = map.getInt();
                if (i28 == 1515870810) {
                    if (z15) {
                        z13 = true;
                    }
                    z15 = true;
                } else {
                    if (i28 == 1191201283) {
                        if (z18) {
                            z13 = true;
                        }
                        z18 = true;
                    } else if (i28 == 496366178) {
                        if (z20) {
                            z13 = true;
                        }
                        bits11 = bits11;
                        z12 = true;
                    } else {
                        bits11 = bits11;
                        z12 = z20;
                        if (i28 == 1700671838) {
                            if (z21) {
                                z13 = true;
                            }
                            z21 = true;
                        } else if (i28 == 176167201) {
                            if (z16) {
                                z13 = true;
                            }
                            z16 = true;
                        } else if (i28 == 1101174087) {
                            if (z14) {
                                z13 = true;
                            }
                            z14 = true;
                        } else if (i28 == 45126241) {
                            if (z17) {
                                z13 = true;
                            }
                            z17 = true;
                        }
                    }
                    if (!z13) {
                        this.frameSize += bits11;
                    }
                    map.position(iPosition + bits11);
                    z20 = z12;
                    z21 = z21;
                    z19 = false;
                    b10 = 1;
                    j10 = j10;
                }
                z12 = z20;
                if (!z13) {
                    this.frameSize += bits11;
                }
                map.position(iPosition + bits11);
                z20 = z12;
                z21 = z21;
                z19 = false;
                b10 = 1;
                j10 = j10;
            }
        }
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
        return this.sampleDurations;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        return this.samples;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }

    public DTSTrackImpl(DataSource dataSource) throws IOException {
        super(dataSource.toString());
        this.trackMetaData = new TrackMetaData();
        this.frameSize = 0;
        this.dataOffset = 0;
        this.ddts = new DTSSpecificBox();
        this.isVBR = false;
        this.coreSubStreamPresent = false;
        this.extensionSubStreamPresent = false;
        this.numExtSubStreams = 0;
        this.coreMaxSampleRate = 0;
        this.coreBitRate = 0;
        this.coreChannelMask = 0;
        this.coreFramePayloadInBytes = 0;
        this.extAvgBitrate = 0;
        this.extPeakBitrate = 0;
        this.extSmoothBuffSize = 0;
        this.extFramePayloadInBytes = 0;
        this.maxSampleRate = 0;
        this.lbrCodingPresent = 0;
        this.numFramesTotal = 0;
        this.samplesPerFrameAtMaxFs = 0;
        this.numSamplesOrigAudioAtMaxFs = 0;
        this.channelMask = 0;
        this.codecDelayAtMaxFs = 0;
        this.bcCoreMaxSampleRate = 0;
        this.bcCoreBitRate = 0;
        this.bcCoreChannelMask = 0;
        this.lsbTrimPercent = 0;
        this.type = DevicePublicKeyStringDef.NONE;
        this.lang = "eng";
        this.dataSource = dataSource;
        parse();
    }
}
