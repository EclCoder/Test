package te;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f53326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f53327d;

    e(g gVar, int i10, int i11) {
        super(gVar);
        this.f53326c = (short) i10;
        this.f53327d = (short) i11;
    }

    @Override // te.g
    void c(ue.a aVar, byte[] bArr) {
        aVar.d(this.f53326c, this.f53327d);
    }

    public String toString() {
        short s10 = this.f53326c;
        short s11 = this.f53327d;
        return "<" + Integer.toBinaryString((s10 & ((1 << s11) - 1)) | (1 << s11) | (1 << this.f53327d)).substring(1) + '>';
    }
}
