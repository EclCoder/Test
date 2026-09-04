package jm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements em.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kl.j f42644a;

    public e(kl.j jVar) {
        this.f42644a = jVar;
    }

    @Override // em.o0
    public kl.j i0() {
        return this.f42644a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + i0() + ')';
    }
}
