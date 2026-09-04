package yf;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f57536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f57537b;

    public b0(el.a aVar, el.a aVar2) {
        this.f57536a = aVar;
        this.f57537b = aVar2;
    }

    public static b0 a(el.a aVar, el.a aVar2) {
        return new b0(aVar, aVar2);
    }

    public static a0 c(sf.e eVar, k0 k0Var) {
        return new a0(eVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a0 get() {
        return c((sf.e) this.f57536a.get(), (k0) this.f57537b.get());
    }
}
