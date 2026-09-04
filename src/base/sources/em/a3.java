package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a3 extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a3 f37960c = new a3();

    private a3() {
    }

    @Override // em.k0
    public void T0(kl.j jVar, Runnable runnable) {
        android.support.v4.media.session.b.a(jVar.get(e3.f37995b));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // em.k0
    public boolean U0(kl.j jVar) {
        return false;
    }

    @Override // em.k0
    public k0 V0(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // em.k0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
