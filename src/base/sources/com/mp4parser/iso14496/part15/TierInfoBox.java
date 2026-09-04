package com.mp4parser.iso14496.part15;

import c1.pGX.geAgcEazw;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class TierInfoBox extends AbstractBox {
    public static final String TYPE = "tiri";
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
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_6 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_7 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_8 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_9 = null;
    int constantFrameRate;
    int discardable;
    int frameRate;
    int levelIndication;
    int profileIndication;
    int profile_compatibility;
    int reserved1;
    int reserved2;
    int tierID;
    int visualHeight;
    int visualWidth;

    static {
        ajc$preClinit();
    }

    public TierInfoBox() {
        super(TYPE);
        this.reserved1 = 0;
        this.reserved2 = 0;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        this.tierID = IsoTypeReader.readUInt16(byteBuffer);
        this.profileIndication = IsoTypeReader.readUInt8(byteBuffer);
        this.profile_compatibility = IsoTypeReader.readUInt8(byteBuffer);
        this.levelIndication = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved1 = IsoTypeReader.readUInt8(byteBuffer);
        this.visualWidth = IsoTypeReader.readUInt16(byteBuffer);
        this.visualHeight = IsoTypeReader.readUInt16(byteBuffer);
        int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.discardable = (uInt8 & PsExtractor.AUDIO_STREAM) >> 6;
        this.constantFrameRate = (uInt8 & 48) >> 4;
        this.reserved2 = uInt8 & 15;
        this.frameRate = IsoTypeReader.readUInt16(byteBuffer);
    }

    public int getConstantFrameRate() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_16, this, this));
        return this.constantFrameRate;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt16(byteBuffer, this.tierID);
        IsoTypeWriter.writeUInt8(byteBuffer, this.profileIndication);
        IsoTypeWriter.writeUInt8(byteBuffer, this.profile_compatibility);
        IsoTypeWriter.writeUInt8(byteBuffer, this.levelIndication);
        IsoTypeWriter.writeUInt8(byteBuffer, this.reserved1);
        IsoTypeWriter.writeUInt16(byteBuffer, this.visualWidth);
        IsoTypeWriter.writeUInt16(byteBuffer, this.visualHeight);
        IsoTypeWriter.writeUInt8(byteBuffer, (this.discardable << 6) + (this.constantFrameRate << 4) + this.reserved2);
        IsoTypeWriter.writeUInt16(byteBuffer, this.frameRate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 13L;
    }

    public int getDiscardable() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_14, this, this));
        return this.discardable;
    }

    public int getFrameRate() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_20, this, this));
        return this.frameRate;
    }

    public int getLevelIndication() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_6, this, this));
        return this.levelIndication;
    }

    public int getProfileIndication() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        return this.profileIndication;
    }

    public int getProfile_compatibility() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return this.profile_compatibility;
    }

    public int getReserved1() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_8, this, this));
        return this.reserved1;
    }

    public int getReserved2() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_18, this, this));
        return this.reserved2;
    }

    public int getTierID() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.tierID;
    }

    public int getVisualHeight() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_12, this, this));
        return this.visualHeight;
    }

    public int getVisualWidth() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_10, this, this));
        return this.visualWidth;
    }

    public void setConstantFrameRate(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_17, this, this, pp.a.e(i10)));
        this.constantFrameRate = i10;
    }

    public void setDiscardable(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_15, this, this, pp.a.e(i10)));
        this.discardable = i10;
    }

    public void setFrameRate(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_21, this, this, pp.a.e(i10)));
        this.frameRate = i10;
    }

    public void setLevelIndication(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_7, this, this, pp.a.e(i10)));
        this.levelIndication = i10;
    }

    public void setProfileIndication(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, pp.a.e(i10)));
        this.profileIndication = i10;
    }

    public void setProfile_compatibility(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_5, this, this, pp.a.e(i10)));
        this.profile_compatibility = i10;
    }

    public void setReserved1(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_9, this, this, pp.a.e(i10)));
        this.reserved1 = i10;
    }

    public void setReserved2(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_19, this, this, pp.a.e(i10)));
        this.reserved2 = i10;
    }

    public void setTierID(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, pp.a.e(i10)));
        this.tierID = i10;
    }

    public void setVisualHeight(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_13, this, this, pp.a.e(i10)));
        this.visualHeight = i10;
    }

    public void setVisualWidth(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_11, this, this, pp.a.e(i10)));
        this.visualWidth = i10;
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("TierInfoBox.java", TierInfoBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 69);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "tierID", "", "void"), 73);
        ajc$tjp_10 = bVar.h("method-execution", bVar.g("1", "getVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 109);
        ajc$tjp_11 = bVar.h("method-execution", bVar.g("1", "setVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "visualWidth", "", "void"), Sdk$SDKError.b.ASSET_RESPONSE_DATA_ERROR_VALUE);
        ajc$tjp_12 = bVar.h("method-execution", bVar.g("1", "getVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE);
        ajc$tjp_13 = bVar.h("method-execution", bVar.g("1", "setVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "visualHeight", "", "void"), Sdk$SDKError.b.TPAT_ERROR_VALUE);
        ajc$tjp_14 = bVar.h("method-execution", bVar.g("1", "getDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", mDXVAtwcaFMHJ.dsvn, "", "", "int"), Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE);
        ajc$tjp_15 = bVar.h("method-execution", bVar.g("1", "setDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "discardable", "", "void"), 129);
        ajc$tjp_16 = bVar.h("method-execution", bVar.g("1", "getConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), Sdk$SDKError.b.OMSDK_JS_WRITE_FAILED_VALUE);
        ajc$tjp_17 = bVar.h("method-execution", bVar.g("1", "setConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "constantFrameRate", "", "void"), Sdk$SDKError.b.TPAT_RETRY_FAILED_VALUE);
        ajc$tjp_18 = bVar.h("method-execution", bVar.g("1", "getReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 141);
        ajc$tjp_19 = bVar.h("method-execution", bVar.g("1", "setReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "reserved2", "", "void"), 145);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 77);
        ajc$tjp_20 = bVar.h("method-execution", bVar.g("1", "getFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 149);
        ajc$tjp_21 = bVar.h("method-execution", bVar.g("1", "setFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "frameRate", geAgcEazw.eQtuNQaBhdlDJ, "void"), 153);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "setProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "profileIndication", "", "void"), 81);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "getProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 85);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g("1", "setProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "profile_compatibility", "", "void"), 89);
        ajc$tjp_6 = bVar.h("method-execution", bVar.g("1", "getLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 93);
        ajc$tjp_7 = bVar.h("method-execution", bVar.g("1", "setLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "levelIndication", "", "void"), 97);
        ajc$tjp_8 = bVar.h("method-execution", bVar.g("1", "getReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 101);
        ajc$tjp_9 = bVar.h("method-execution", bVar.g("1", "setReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "reserved1", "", "void"), 105);
    }
}
