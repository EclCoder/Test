package com.mp4parser.iso14496.part12;

import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class BitRateBox extends AbstractBox {
    public static final String TYPE = "btrt";
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_4 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_5 = null;
    private long avgBitrate;
    private long bufferSizeDb;
    private long maxBitrate;

    static {
        ajc$preClinit();
    }

    public BitRateBox() {
        super(TYPE);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.bufferSizeDb = IsoTypeReader.readUInt32(byteBuffer);
        this.maxBitrate = IsoTypeReader.readUInt32(byteBuffer);
        this.avgBitrate = IsoTypeReader.readUInt32(byteBuffer);
    }

    public long getAvgBitrate() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_4, this, this));
        return this.avgBitrate;
    }

    public long getBufferSizeDb() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.bufferSizeDb;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt32(byteBuffer, this.bufferSizeDb);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxBitrate);
        IsoTypeWriter.writeUInt32(byteBuffer, this.avgBitrate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return 12L;
    }

    public long getMaxBitrate() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        return this.maxBitrate;
    }

    public void setAvgBitrate(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_5, this, this, pp.a.f(j10)));
        this.avgBitrate = j10;
    }

    public void setBufferSizeDb(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, pp.a.f(j10)));
        this.bufferSizeDb = j10;
    }

    public void setMaxBitrate(long j10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, pp.a.f(j10)));
        this.maxBitrate = j10;
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("BitRateBox.java", BitRateBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"), 74);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "long", "bufferSizeDb", "", "void"), 82);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"), 90);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", QGbBllacZSmHKn.kavWmsuezLxQ, "com.mp4parser.iso14496.part12.BitRateBox", "long", "maxBitrate", "", "void"), 98);
        ajc$tjp_4 = bVar.h("method-execution", bVar.g("1", "getAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"), 106);
        ajc$tjp_5 = bVar.h("method-execution", bVar.g(NhHRaDJCHtCTJR.UqiPGfXwGVJy, "setAvgBitrate", dOIDCKnIR.nOejmQClarc, "long", "avgBitrate", "", "void"), Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE);
    }
}
