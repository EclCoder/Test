package yf;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j0 implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f57560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f57561b;

    public j0(el.a aVar, el.a aVar2) {
        this.f57560a = aVar;
        this.f57561b = aVar2;
    }

    public static j0 a(el.a aVar, el.a aVar2) {
        return new j0(aVar, aVar2);
    }

    public static i0 c(sf.e eVar, k0 k0Var) {
        return new i0(eVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i0 get() {
        return c((sf.e) this.f57560a.get(), (k0) this.f57561b.get());
    }
}
