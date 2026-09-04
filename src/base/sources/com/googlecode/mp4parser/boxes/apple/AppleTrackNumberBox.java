package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.nio.ByteBuffer;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AppleTrackNumberBox extends AppleDataBox {
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_2 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_3 = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f22494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22495b;

    static {
        ajc$preClinit();
    }

    public AppleTrackNumberBox() {
        super("trkn", 0);
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("AppleTrackNumberBox.java", AppleTrackNumberBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getA", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", "int"), 16);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setA", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "int", "a", "", "void"), 20);
        ajc$tjp_2 = bVar.h("method-execution", bVar.g("1", "getB", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", "int"), 24);
        ajc$tjp_3 = bVar.h("method-execution", bVar.g("1", "setB", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "int", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "void"), 28);
    }

    public int getA() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.f22494a;
    }

    public int getB() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_2, this, this));
        return this.f22495b;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return 8;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        this.f22494a = byteBuffer.getInt();
        this.f22495b = byteBuffer.getInt();
    }

    public void setA(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, pp.a.e(i10)));
        this.f22494a = i10;
    }

    public void setB(int i10) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_3, this, this, pp.a.e(i10)));
        this.f22495b = i10;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(this.f22494a);
        byteBufferAllocate.putInt(this.f22495b);
        return byteBufferAllocate.array();
    }
}
