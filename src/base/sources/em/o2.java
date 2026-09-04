package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class o2 extends d2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q f38035e;

    public o2(q qVar) {
        this.f38035e = qVar;
    }

    @Override // em.d2
    public boolean v() {
        return false;
    }

    @Override // em.d2
    public void w(Throwable th2) {
        Object objZ = u().Z();
        if (objZ instanceof d0) {
            q qVar = this.f38035e;
            fl.r.a aVar = fl.r.f38769b;
            qVar.resumeWith(fl.r.b(fl.s.a(((d0) objZ).f37973a)));
        } else {
            q qVar2 = this.f38035e;
            fl.r.a aVar2 = fl.r.f38769b;
            qVar2.resumeWith(fl.r.b(f2.h(objZ)));
        }
    }
}
