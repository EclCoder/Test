package com.googlecode.mp4parser.boxes;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import np.a;
import qp.b;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DTSSpecificBox extends AbstractBox {
    public static final String TYPE = "ddts";
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_10 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_11 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_12 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_13 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_14 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_15 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_16 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_17 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_18 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_19 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_20 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_21 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_22 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_23 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_24 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_25 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_26 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_27 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_28 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_29 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_30 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_31 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_6 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_7 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_8 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_9 = null;
    long DTSSamplingFrequency;
    int LBRDurationMod;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;

    static {
        ajc$preClinit();
    }

    public DTSSpecificBox() {
        super(TYPE);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.DTSSamplingFrequency = IsoTypeReader.readUInt32(byteBuffer);
        this.maxBitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.avgBitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.pcmSampleDepth = IsoTypeReader.readUInt8(byteBuffer);
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.frameDuration = bitReaderBuffer.readBits(2);
        this.streamConstruction = bitReaderBuffer.readBits(5);
        this.coreLFEPresent = bitReaderBuffer.readBits(1);
        this.coreLayout = bitReaderBuffer.readBits(6);
        this.coreSize = bitReaderBuffer.readBits(14);
        this.stereoDownmix = bitReaderBuffer.readBits(1);
        this.representationType = bitReaderBuffer.readBits(3);
        this.channelLayout = bitReaderBuffer.readBits(16);
        this.multiAssetFlag = bitReaderBuffer.readBits(1);
        this.LBRDurationMod = bitReaderBuffer.readBits(1);
        this.reservedBoxPresent = bitReaderBuffer.readBits(1);
        this.reserved = bitReaderBuffer.readBits(5);
    }

    public long getAvgBitRate() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.avgBitRate;
    }

    public int getChannelLayout() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_22, this, this));
        return this.channelLayout;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt32(byteBuffer, this.DTSSamplingFrequency);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxBitRate);
        IsoTypeWriter.writeUInt32(byteBuffer, this.avgBitRate);
        IsoTypeWriter.writeUInt8(byteBuffer, this.pcmSampleDepth);
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.frameDuration, 2);
        bitWriterBuffer.writeBits(this.streamConstruction, 5);
        bitWriterBuffer.writeBits(this.coreLFEPresent, 1);
        bitWriterBuffer.writeBits(this.coreLayout, 6);
        bitWriterBuffer.writeBits(this.coreSize, 14);
        bitWriterBuffer.writeBits(this.stereoDownmix, 1);
        bitWriterBuffer.writeBits(this.representationType, 3);
        bitWriterBuffer.writeBits(this.channelLayout, 16);
        bitWriterBuffer.writeBits(this.multiAssetFlag, 1);
        bitWriterBuffer.writeBits(this.LBRDurationMod, 1);
        bitWriterBuffer.writeBits(this.reservedBoxPresent, 1);
        bitWriterBuffer.writeBits(this.reserved, 5);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 20L;
    }

    public int getCoreLFEPresent() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_12, this, this));
        return this.coreLFEPresent;
    }

    public int getCoreLayout() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_14, this, this));
        return this.coreLayout;
    }

    public int getCoreSize() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_16, this, this));
        return this.coreSize;
    }

    public long getDTSSamplingFrequency() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        return this.DTSSamplingFrequency;
    }

    @DoNotParseDetail
    public int[] getDashAudioChannelConfiguration() {
        int i10;
        int channelLayout = getChannelLayout();
        int i11 = 1;
        if ((channelLayout & 1) == 1) {
            i10 = 4;
        } else {
            i11 = 0;
            i10 = 0;
        }
        if ((channelLayout & 2) == 2) {
            i11 += 2;
            i10 |= 3;
        }
        if ((channelLayout & 4) == 4) {
            i11 += 2;
            i10 |= 48;
        }
        if ((channelLayout & 8) == 8) {
            i11++;
            i10 |= 8;
        }
        if ((channelLayout & 16) == 16) {
            i11++;
            i10 |= 256;
        }
        if ((channelLayout & 32) == 32) {
            i11 += 2;
            i10 |= CacheDataSink.DEFAULT_BUFFER_SIZE;
        }
        if ((channelLayout & 64) == 64) {
            i11 += 2;
            i10 |= 48;
        }
        if ((channelLayout & 128) == 128) {
            i11++;
            i10 |= 8192;
        }
        if ((channelLayout & 256) == 256) {
            i11++;
            i10 |= 2048;
        }
        if ((channelLayout & 512) == 512) {
            i11 += 2;
            i10 |= PsExtractor.AUDIO_STREAM;
        }
        if ((channelLayout & UserVerificationMethods.USER_VERIFY_ALL) == 1024) {
            i11 += 2;
            i10 |= 1536;
        }
        if ((channelLayout & 2048) == 2048) {
            i11 += 2;
            i10 |= 48;
        }
        if ((channelLayout & 4096) == 4096) {
            i11++;
            i10 |= 8;
        }
        if ((channelLayout & 8192) == 8192) {
            i11 += 2;
            i10 |= 48;
        }
        if ((channelLayout & 16384) == 16384) {
            i11++;
            i10 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((channelLayout & 32768) == 32768) {
            i11 += 2;
            i10 |= 163840;
        }
        if ((channelLayout & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 65536) {
            i11++;
        }
        if ((channelLayout & 131072) == 131072) {
            i11 += 2;
        }
        return new int[]{i11, i10};
    }

    public int getFrameDuration() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_8, this, this));
        return this.frameDuration;
    }

    public int getLBRDurationMod() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_26, this, this));
        return this.LBRDurationMod;
    }

    public long getMaxBitRate() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return this.maxBitRate;
    }

    public int getMultiAssetFlag() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_24, this, this));
        return this.multiAssetFlag;
    }

    public int getPcmSampleDepth() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_6, this, this));
        return this.pcmSampleDepth;
    }

    public int getRepresentationType() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_20, this, this));
        return this.representationType;
    }

    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_28, this, this));
        return this.reserved;
    }

    public int getReservedBoxPresent() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_30, this, this));
        return this.reservedBoxPresent;
    }

    public int getStereoDownmix() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_18, this, this));
        return this.stereoDownmix;
    }

    public int getStreamConstruction() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_10, this, this));
        return this.streamConstruction;
    }

    public void setAvgBitRate(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, pp.a.f(j10)));
        this.avgBitRate = j10;
    }

    public void setChannelLayout(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_23, this, this, pp.a.e(i10)));
        this.channelLayout = i10;
    }

    public void setCoreLFEPresent(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_13, this, this, pp.a.e(i10)));
        this.coreLFEPresent = i10;
    }

    public void setCoreLayout(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_15, this, this, pp.a.e(i10)));
        this.coreLayout = i10;
    }

    public void setCoreSize(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_17, this, this, pp.a.e(i10)));
        this.coreSize = i10;
    }

    public void setDTSSamplingFrequency(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, pp.a.f(j10)));
        this.DTSSamplingFrequency = j10;
    }

    public void setFrameDuration(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_9, this, this, pp.a.e(i10)));
        this.frameDuration = i10;
    }

    public void setLBRDurationMod(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_27, this, this, pp.a.e(i10)));
        this.LBRDurationMod = i10;
    }

    public void setMaxBitRate(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_5, this, this, pp.a.f(j10)));
        this.maxBitRate = j10;
    }

    public void setMultiAssetFlag(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_25, this, this, pp.a.e(i10)));
        this.multiAssetFlag = i10;
    }

    public void setPcmSampleDepth(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_7, this, this, pp.a.e(i10)));
        this.pcmSampleDepth = i10;
    }

    public void setRepresentationType(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_21, this, this, pp.a.e(i10)));
        this.representationType = i10;
    }

    public void setReserved(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_29, this, this, pp.a.e(i10)));
        this.reserved = i10;
    }

    public void setReservedBoxPresent(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_31, this, this, pp.a.e(i10)));
        this.reservedBoxPresent = i10;
    }

    public void setStereoDownmix(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_19, this, this, pp.a.e(i10)));
        this.stereoDownmix = i10;
    }

    public void setStreamConstruction(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_11, this, this, pp.a.e(i10)));
        this.streamConstruction = i10;
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("DTSSpecificBox.java", DTSSpecificBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 89);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "avgBitRate", "", "void"), 93);
        ajc$tjp_10 = bVar.h("method-execution", bVar.g("1", "getStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 129);
        ajc$tjp_11 = bVar.h("method-execution", bVar.g("1", "setStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "streamConstruction", "", "void"), Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED_VALUE);
        ajc$tjp_12 = bVar.h("method-execution", bVar.g("1", "getCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), Sdk$SDKError.b.TPAT_RETRY_FAILED_VALUE);
        ajc$tjp_13 = bVar.h("method-execution", bVar.g("1", "setCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLFEPresent", "", "void"), 141);
        ajc$tjp_14 = bVar.h("method-execution", bVar.g("1", "getCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 145);
        ajc$tjp_15 = bVar.h("method-execution", bVar.g("1", "setCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLayout", "", "void"), 149);
        ajc$tjp_16 = bVar.h("method-execution", bVar.g("1", "getCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 153);
        ajc$tjp_17 = bVar.h("method-execution", bVar.g("1", "setCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreSize", "", "void"), 157);
        ajc$tjp_18 = bVar.h("method-execution", bVar.g("1", "getStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 161);
        ajc$tjp_19 = bVar.h("method-execution", bVar.g(qnwOeeQSSWa.pHy, "setStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "stereoDownmix", "", "void"), 165);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 97);
        ajc$tjp_20 = bVar.h("method-execution", bVar.g("1", "getRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 169);
        ajc$tjp_21 = bVar.h("method-execution", bVar.g("1", "setRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "representationType", "", "void"), TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173);
        ajc$tjp_22 = bVar.h("method-execution", bVar.g("1", "getChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 177);
        ajc$tjp_23 = bVar.h("method-execution", bVar.g("1", "setChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "channelLayout", "", "void"), 181);
        ajc$tjp_24 = bVar.h("method-execution", bVar.g("1", "getMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), ModuleDescriptor.MODULE_VERSION);
        ajc$tjp_25 = bVar.h("method-execution", bVar.g("1", "setMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "multiAssetFlag", "", "void"), PsExtractor.PRIVATE_STREAM_1);
        ajc$tjp_26 = bVar.h("method-execution", bVar.g("1", "getLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 193);
        ajc$tjp_27 = bVar.h("method-execution", bVar.g("1", "setLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "LBRDurationMod", "", "void"), 197);
        ajc$tjp_28 = bVar.h("method-execution", bVar.g("1", "getReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 201);
        ajc$tjp_29 = bVar.h("method-execution", bVar.g("1", "setReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reserved", "", "void"), Sdk$SDKError.b.AD_IS_PLAYING_VALUE);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "setDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "DTSSamplingFrequency", "", "void"), 101);
        ajc$tjp_30 = bVar.h("method-execution", bVar.g("1", "getReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), Sdk$SDKError.b.INVALID_JSON_BID_PAYLOAD_VALUE);
        ajc$tjp_31 = bVar.h("method-execution", bVar.g("1", "setReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reservedBoxPresent", "", "void"), Sdk$SDKError.b.INVALID_ADUNIT_BID_PAYLOAD_VALUE);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "getMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 105);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "setMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "maxBitRate", "", "void"), 109);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "getPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE);
        ajc$tjp_7 = bVar.h("method-execution", bVar.g("1", "setPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "pcmSampleDepth", "", "void"), Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE);
        ajc$tjp_8 = bVar.h("method-execution", bVar.g("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), Sdk$SDKError.b.TPAT_ERROR_VALUE);
        ajc$tjp_9 = bVar.h("method-execution", bVar.g("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "frameDuration", "", "void"), Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE);
    }
}
