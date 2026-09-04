package yf;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f57552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f57553b;

    public h(el.a aVar, el.a aVar2) {
        this.f57552a = aVar;
        this.f57553b = aVar2;
    }

    public static h a(el.a aVar, el.a aVar2) {
        return new h(aVar, aVar2);
    }

    public static g c(sf.e eVar, k0 k0Var) {
        return new g(eVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c((sf.e) this.f57552a.get(), (k0) this.f57553b.get());
    }
}
