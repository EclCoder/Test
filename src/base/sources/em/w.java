package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class w extends d2 implements v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f38064e;

    public w(x xVar) {
        this.f38064e = xVar;
    }

    @Override // em.v
    public boolean a(Throwable th2) {
        return u().M(th2);
    }

    @Override // em.v
    public z1 getParent() {
        return u();
    }

    @Override // em.d2
    public boolean v() {
        return true;
    }

    @Override // em.d2
    public void w(Throwable th2) {
        this.f38064e.p0(u());
    }
}
