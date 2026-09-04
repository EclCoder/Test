package com.googlecode.mp4parser.authoring.tracks;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.MultiFileDataSourceImpl;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Mp4Arrays;
import com.googlecode.mp4parser.util.Path;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class H263TrackImpl extends AbstractH26XTrack {
    private static Logger LOG = Logger.getLogger(ESDescriptor.class.getName());
    int BINARY;
    int BINARY_ONLY;
    int GRAYSCALE;
    int RECTANGULAR;
    boolean esdsComplete;
    List<ByteBuffer> esdsStuff;
    int fixed_vop_time_increment;
    List<Sample> samples;
    SampleDescriptionBox stsd;
    int vop_time_increment_resolution;

    public static void main(String[] strArr) {
        FileDataSourceImpl fileDataSourceImpl = new FileDataSourceImpl("C:\\content\\bbb.h263");
        Movie movie = new Movie();
        movie.addTrack(new H263TrackImpl(fileDataSourceImpl));
        new DefaultMp4Builder().build(movie).writeContainer(Channels.newChannel(new FileOutputStream("output.mp4")));
    }

    public static void main1(String[] strArr) {
        File[] fileArrListFiles = new File("C:\\dev\\mp4parser\\frames").listFiles();
        Arrays.sort(fileArrListFiles);
        Movie movie = new Movie();
        movie.addTrack(new H263TrackImpl(new MultiFileDataSourceImpl(fileArrListFiles)));
        new DefaultMp4Builder().build(movie).writeContainer(Channels.newChannel(new FileOutputStream("output.mp4")));
    }

    public static void main2(String[] strArr) throws IOException {
        ESDescriptorBox eSDescriptorBox = (ESDescriptorBox) Path.getPath(new IsoFile("C:\\content\\bbb.mp4"), "/moov[0]/trak[0]/mdia[0]/minf[0]/stbl[0]/stsd[0]/mp4v[0]/esds[0]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        eSDescriptorBox.getBox(Channels.newChannel(byteArrayOutputStream));
        System.err.println(Hex.encodeHex(byteArrayOutputStream.toByteArray()));
        System.err.println(eSDescriptorBox.getEsDescriptor());
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        eSDescriptorBox.getBox(Channels.newChannel(byteArrayOutputStream2));
        System.err.println(Hex.encodeHex(byteArrayOutputStream2.toByteArray()));
    }

    private int parse0x05Unit(ByteBuffer byteBuffer) {
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        if (!bitReaderBuffer.readBool()) {
            return 0;
        }
        int bits = bitReaderBuffer.readBits(4);
        bitReaderBuffer.readBits(3);
        return bits;
    }

    private void parse0x20Unit(ByteBuffer byteBuffer, int i10, VisualSampleEntry visualSampleEntry) {
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        bitReaderBuffer.readBool();
        bitReaderBuffer.readBits(8);
        if (bitReaderBuffer.readBool()) {
            i10 = bitReaderBuffer.readBits(4);
            bitReaderBuffer.readBits(3);
        }
        if (bitReaderBuffer.readBits(4) == 15) {
            bitReaderBuffer.readBits(8);
            bitReaderBuffer.readBits(8);
        }
        if (bitReaderBuffer.readBool()) {
            bitReaderBuffer.readBits(2);
            bitReaderBuffer.readBool();
            if (bitReaderBuffer.readBool()) {
                throw new RuntimeException("Implemented when needed");
            }
        }
        int bits = bitReaderBuffer.readBits(2);
        if (bits == this.GRAYSCALE && i10 != 1) {
            bitReaderBuffer.readBits(4);
        }
        bitReaderBuffer.readBool();
        this.vop_time_increment_resolution = bitReaderBuffer.readBits(16);
        bitReaderBuffer.readBool();
        if (bitReaderBuffer.readBool()) {
            LOG.info("Fixed Frame Rate");
            int i11 = 0;
            while (this.vop_time_increment_resolution >= (1 << i11)) {
                i11++;
            }
            this.fixed_vop_time_increment = bitReaderBuffer.readBits(i11);
        }
        if (bits == this.BINARY_ONLY) {
            throw new RuntimeException("Please implmenet me");
        }
        if (bits == this.RECTANGULAR) {
            bitReaderBuffer.readBool();
            visualSampleEntry.setWidth(bitReaderBuffer.readBits(13));
            bitReaderBuffer.readBool();
            visualSampleEntry.setHeight(bitReaderBuffer.readBits(13));
            bitReaderBuffer.readBool();
        }
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack
    protected Sample createSampleObject(List<? extends ByteBuffer> list) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[]{0, 0, 1});
        ByteBuffer[] byteBufferArr = new ByteBuffer[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = i10 * 2;
            byteBufferArr[i11] = byteBufferWrap;
            byteBufferArr[i11 + 1] = list.get(i10);
        }
        return new SampleImpl(byteBufferArr);
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return "vide";
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.stsd;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        return this.samples;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H263TrackImpl(DataSource dataSource) {
        int i10;
        super(dataSource, false);
        int i11 = 0;
        this.RECTANGULAR = 0;
        this.BINARY = 1;
        int i12 = 2;
        this.BINARY_ONLY = 2;
        this.GRAYSCALE = 3;
        this.samples = new ArrayList();
        this.esdsStuff = new ArrayList();
        this.esdsComplete = false;
        this.fixed_vop_time_increment = -1;
        this.vop_time_increment_resolution = 0;
        AbstractH26XTrack.LookAhead lookAhead = new AbstractH26XTrack.LookAhead(dataSource);
        List<? extends ByteBuffer> arrayList = new ArrayList<>();
        VisualSampleEntry visualSampleEntry = new VisualSampleEntry(obFGmWgqyy.mMBLwGOrsXc);
        SampleDescriptionBox sampleDescriptionBox = new SampleDescriptionBox();
        this.stsd = sampleDescriptionBox;
        sampleDescriptionBox.addBox(visualSampleEntry);
        long j10 = 0;
        int i13 = 0;
        long j11 = -1;
        while (true) {
            ByteBuffer byteBufferFindNextNal = findNextNal(lookAhead);
            if (byteBufferFindNextNal == null) {
                long[] jArr = this.decodingTimes;
                long[] jArr2 = new long[1];
                jArr2[i11] = jArr[jArr.length - 1];
                this.decodingTimes = Mp4Arrays.copyOfAndAppend(jArr, jArr2);
                ESDescriptor eSDescriptor = new ESDescriptor();
                eSDescriptor.setEsId(1);
                DecoderConfigDescriptor decoderConfigDescriptor = new DecoderConfigDescriptor();
                decoderConfigDescriptor.setObjectTypeIndication(32);
                decoderConfigDescriptor.setStreamType(4);
                DecoderSpecificInfo decoderSpecificInfo = new DecoderSpecificInfo();
                Sample sampleCreateSampleObject = createSampleObject(this.esdsStuff);
                byte[] bArr = new byte[CastUtils.l2i(sampleCreateSampleObject.getSize())];
                sampleCreateSampleObject.asByteBuffer().get(bArr);
                decoderSpecificInfo.setData(bArr);
                decoderConfigDescriptor.setDecoderSpecificInfo(decoderSpecificInfo);
                eSDescriptor.setDecoderConfigDescriptor(decoderConfigDescriptor);
                SLConfigDescriptor sLConfigDescriptor = new SLConfigDescriptor();
                sLConfigDescriptor.setPredefined(i12);
                eSDescriptor.setSlConfigDescriptor(sLConfigDescriptor);
                ESDescriptorBox eSDescriptorBox = new ESDescriptorBox();
                eSDescriptorBox.setEsDescriptor(eSDescriptor);
                visualSampleEntry.addBox(eSDescriptorBox);
                this.trackMetaData.setTimescale(this.vop_time_increment_resolution);
                return;
            }
            i11 = i11;
            ByteBuffer byteBufferDuplicate = byteBufferFindNextNal.duplicate();
            int uInt8 = IsoTypeReader.readUInt8(byteBufferFindNextNal);
            if (uInt8 == 176 || uInt8 == 181 || uInt8 == 0 || uInt8 == 32 || uInt8 == 178) {
                lookAhead = lookAhead;
                int i14 = i13;
                if (this.esdsComplete) {
                    i10 = i14;
                } else {
                    this.esdsStuff.add(byteBufferDuplicate);
                    if (uInt8 == 32) {
                        i10 = i14;
                        parse0x20Unit(byteBufferFindNextNal, i10, visualSampleEntry);
                    } else {
                        i10 = i14;
                        i13 = uInt8 == 181 ? parse0x05Unit(byteBufferFindNextNal) : i13;
                    }
                }
                i13 = i10;
            } else {
                if (uInt8 == 179) {
                    this.esdsComplete = true;
                    int bits = new BitReaderBuffer(byteBufferFindNextNal).readBits(18);
                    j10 = (bits & 63) + (((bits >>> 7) & 63) * 60) + (((bits >>> 13) & 31) * 3600);
                    this.stss.add(Integer.valueOf(this.samples.size() + 1));
                    arrayList.add(byteBufferDuplicate);
                    i11 = i11;
                } else {
                    if (uInt8 != 182) {
                        throw new RuntimeException("Got start code I don't know. Ask Sebastian via mp4parser mailing list what to do");
                    }
                    BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBufferFindNextNal);
                    bitReaderBuffer.readBits(2);
                    while (bitReaderBuffer.readBool()) {
                        j10++;
                    }
                    bitReaderBuffer.readBool();
                    int i15 = i11;
                    while (this.vop_time_increment_resolution >= (1 << i15)) {
                        i15++;
                    }
                    int bits2 = bitReaderBuffer.readBits(i15);
                    int i16 = this.vop_time_increment_resolution;
                    int i17 = i13;
                    long j12 = (((long) i16) * j10) + ((long) (bits2 % i16));
                    if (j11 != -1) {
                        long[] jArr3 = this.decodingTimes;
                        long[] jArr4 = new long[1];
                        jArr4[i11] = j12 - j11;
                        this.decodingTimes = Mp4Arrays.copyOfAndAppend(jArr3, jArr4);
                    }
                    System.err.println("Frame increment: " + (j12 - j11) + NhHRaDJCHtCTJR.syzpErdBdQf + bits2 + " last_sync_point: " + j10 + " time_code: " + j12);
                    arrayList.add(byteBufferDuplicate);
                    this.samples.add(createSampleObject(arrayList));
                    arrayList.clear();
                    j11 = j12;
                    i13 = i17;
                }
                i12 = 2;
            }
            lookAhead = lookAhead;
            i12 = 2;
        }
    }
}
