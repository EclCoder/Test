package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.nio.ByteBuffer;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AppleCoverBox extends AppleDataBox {
    private static final int IMAGE_TYPE_JPG = 13;
    private static final int IMAGE_TYPE_PNG = 14;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private byte[] data;

    static {
        ajc$preClinit();
    }

    public AppleCoverBox() {
        super("covr", 1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("AppleCoverBox.java", AppleCoverBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getCoverData", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "", "", "", "[B"), 21);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setJpg", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "[B", DataSchemeDataSource.SCHEME_DATA, "", "void"), 25);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "setPng", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "[B", DataSchemeDataSource.SCHEME_DATA, "", "void"), 29);
    }

    private void setImageData(byte[] bArr, int i10) {
        this.data = bArr;
        this.dataType = i10;
    }

    public byte[] getCoverData() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.data;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return this.data.length;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.limit()];
        this.data = bArr;
        byteBuffer.get(bArr);
    }

    public void setJpg(byte[] bArr) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, bArr));
        setImageData(bArr, 13);
    }

    public void setPng(byte[] bArr) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_2, this, this, bArr));
        setImageData(bArr, 14);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        return this.data;
    }
}
