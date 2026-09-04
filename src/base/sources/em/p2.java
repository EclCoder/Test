package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class p2 extends d2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kl.f f38038e;

    public p2(kl.f fVar) {
        this.f38038e = fVar;
    }

    @Override // em.d2
    public boolean v() {
        return false;
    }

    @Override // em.d2
    public void w(Throwable th2) {
        kl.f fVar = this.f38038e;
        fl.r.a aVar = fl.r.f38769b;
        fVar.resumeWith(fl.r.b(fl.g0.f38750a));
    }
}
