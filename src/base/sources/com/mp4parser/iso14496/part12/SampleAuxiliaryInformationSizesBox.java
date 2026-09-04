package com.mp4parser.iso14496.part12;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "saiz";
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_10 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_11 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_6 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_7 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_8 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_9 = null;
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private short defaultSampleInfoSize;
    private int sampleCount;
    private short[] sampleInfoSizes;

    static {
        ajc$preClinit();
    }

    public SampleAuxiliaryInformationSizesBox() {
        super(TYPE);
        this.sampleInfoSizes = new short[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("SampleAuxiliaryInformationSizesBox.java", SampleAuxiliaryInformationSizesBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "index", "", "short"), 57);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 106);
        ajc$tjp_10 = bVar.h("method-execution", bVar.g("1", "setSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "sampleCount", "", "void"), 146);
        ajc$tjp_11 = bVar.h("method-execution", bVar.g("1", "toString", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 151);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", "void"), 110);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "getDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "setDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "defaultSampleInfoSize", "", "void"), Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        ajc$tjp_7 = bVar.h("method-execution", bVar.g("1", "getSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "[S"), Sdk$SDKError.b.MRAID_JS_WRITE_FAILED_VALUE);
        ajc$tjp_8 = bVar.h("method-execution", bVar.g("1", "setSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "[S", "sampleInfoSizes", "", "void"), Sdk$SDKError.b.TPAT_RETRY_FAILED_VALUE);
        ajc$tjp_9 = bVar.h("method-execution", bVar.g("1", "getSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 142);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.auxInfoType = IsoTypeReader.read4cc(byteBuffer);
            this.auxInfoTypeParameter = IsoTypeReader.read4cc(byteBuffer);
        }
        this.defaultSampleInfoSize = (short) IsoTypeReader.readUInt8(byteBuffer);
        int iL2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.sampleCount = iL2i;
        if (this.defaultSampleInfoSize == 0) {
            this.sampleInfoSizes = new short[iL2i];
            for (int i10 = 0; i10 < this.sampleCount; i10++) {
                this.sampleInfoSizes[i10] = (short) IsoTypeReader.readUInt8(byteBuffer);
            }
        }
    }

    public String getAuxInfoType() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_1, this, this));
        return this.auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_3, this, this));
        return this.auxInfoTypeParameter;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(IsoFile.fourCCtoBytes(this.auxInfoType));
            byteBuffer.put(IsoFile.fourCCtoBytes(this.auxInfoTypeParameter));
        }
        IsoTypeWriter.writeUInt8(byteBuffer, this.defaultSampleInfoSize);
        if (this.defaultSampleInfoSize != 0) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.sampleCount);
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.sampleInfoSizes.length);
        for (short s10 : this.sampleInfoSizes) {
            IsoTypeWriter.writeUInt8(byteBuffer, s10);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return ((getFlags() & 1) == 1 ? 12 : 4) + 5 + (this.defaultSampleInfoSize == 0 ? this.sampleInfoSizes.length : 0);
    }

    public int getDefaultSampleInfoSize() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_5, this, this));
        return this.defaultSampleInfoSize;
    }

    public int getSampleCount() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_9, this, this));
        return this.sampleCount;
    }

    public short[] getSampleInfoSizes() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_7, this, this));
        short[] sArr = this.sampleInfoSizes;
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    public short getSize(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_0, this, this, pp.a.e(i10)));
        return getDefaultSampleInfoSize() == 0 ? this.sampleInfoSizes[i10] : this.defaultSampleInfoSize;
    }

    public void setAuxInfoType(String str) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_2, this, this, str));
        this.auxInfoType = str;
    }

    public void setAuxInfoTypeParameter(String str) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_4, this, this, str));
        this.auxInfoTypeParameter = str;
    }

    public void setDefaultSampleInfoSize(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_6, this, this, pp.a.e(i10)));
        this.defaultSampleInfoSize = (short) i10;
    }

    public void setSampleCount(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_10, this, this, pp.a.e(i10)));
        this.sampleCount = i10;
    }

    public void setSampleInfoSizes(short[] sArr) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_8, this, this, sArr));
        short[] sArr2 = new short[sArr.length];
        this.sampleInfoSizes = sArr2;
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_11, this, this));
        return "SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=" + ((int) this.defaultSampleInfoSize) + ", sampleCount=" + this.sampleCount + ", auxInfoType='" + this.auxInfoType + "', auxInfoTypeParameter='" + this.auxInfoTypeParameter + "'}";
    }
}
