package im;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements kl.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ kl.j f41529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f41530b;

    public i(Throwable th2, kl.j jVar) {
        this.f41529a = jVar;
        this.f41530b = th2;
    }

    @Override // kl.j
    public Object fold(Object obj, tl.o oVar) {
        return this.f41529a.fold(obj, oVar);
    }

    @Override // kl.j
    public kl.j.b get(kl.j.c cVar) {
        return this.f41529a.get(cVar);
    }

    @Override // kl.j
    public kl.j minusKey(kl.j.c cVar) {
        return this.f41529a.minusKey(cVar);
    }

    @Override // kl.j
    public kl.j plus(kl.j jVar) {
        return this.f41529a.plus(jVar);
    }
}
