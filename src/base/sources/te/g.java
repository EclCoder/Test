package te;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final g f53333b = new e(null, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f53334a;

    g(g gVar) {
        this.f53334a = gVar;
    }

    final g a(int i10, int i11) {
        return new e(this, i10, i11);
    }

    final g b(int i10, int i11) {
        return new b(this, i10, i11);
    }

    abstract void c(ue.a aVar, byte[] bArr);

    final g d() {
        return this.f53334a;
    }
}
