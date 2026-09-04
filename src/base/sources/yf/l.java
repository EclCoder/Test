package yf;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f57563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f57564b;

    public l(el.a aVar, el.a aVar2) {
        this.f57563a = aVar;
        this.f57564b = aVar2;
    }

    public static l a(el.a aVar, el.a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(sf.e eVar, k0 k0Var) {
        return new k(eVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((sf.e) this.f57563a.get(), (k0) this.f57564b.get());
    }
}
