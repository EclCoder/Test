package yf;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f57534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f57535b;

    public b(el.a aVar, el.a aVar2) {
        this.f57534a = aVar;
        this.f57535b = aVar2;
    }

    public static b a(el.a aVar, el.a aVar2) {
        return new b(aVar, aVar2);
    }

    public static a c(sf.e eVar, k0 k0Var) {
        return new a(eVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((sf.e) this.f57534a.get(), (k0) this.f57535b.get());
    }
}
