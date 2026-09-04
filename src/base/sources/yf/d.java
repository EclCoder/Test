package yf;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f57540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f57541b;

    public d(el.a aVar, el.a aVar2) {
        this.f57540a = aVar;
        this.f57541b = aVar2;
    }

    public static d a(el.a aVar, el.a aVar2) {
        return new d(aVar, aVar2);
    }

    public static c c(sf.e eVar, k0 k0Var) {
        return new c(eVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((sf.e) this.f57540a.get(), (k0) this.f57541b.get());
    }
}
