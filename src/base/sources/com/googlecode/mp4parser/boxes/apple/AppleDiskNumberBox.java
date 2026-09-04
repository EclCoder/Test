package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.nio.ByteBuffer;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AppleDiskNumberBox extends AppleDataBox {
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f22491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    short f22492b;

    static {
        ajc$preClinit();
    }

    public AppleDiskNumberBox() {
        super("disk", 0);
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("AppleDiskNumberBox.java", AppleDiskNumberBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getA", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "", "", "", "int"), 16);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setA", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "int", "a", "", "void"), 20);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getB", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "", "", "", "short"), 24);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "setB", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "short", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "void"), 28);
    }

    public int getA() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.f22491a;
    }

    public short getB() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        return this.f22492b;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return 6;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        this.f22491a = byteBuffer.getInt();
        this.f22492b = byteBuffer.getShort();
    }

    public void setA(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, pp.a.e(i10)));
        this.f22491a = i10;
    }

    public void setB(short s10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, pp.a.g(s10)));
        this.f22492b = s10;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.putInt(this.f22491a);
        byteBufferAllocate.putShort(this.f22492b);
        return byteBufferAllocate.array();
    }
}
