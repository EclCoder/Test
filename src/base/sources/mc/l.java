package mc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f45653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f45654b;

    public l(g gVar, float f10) {
        this.f45653a = gVar;
        this.f45654b = f10;
    }

    @Override // mc.g
    boolean b() {
        return this.f45653a.b();
    }

    @Override // mc.g
    public void c(float f10, float f11, float f12, r rVar) {
        this.f45653a.c(f10, f11 - this.f45654b, f12, rVar);
    }
}
