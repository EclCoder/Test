package yf;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f0 implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f57548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f57549b;

    public f0(el.a aVar, el.a aVar2) {
        this.f57548a = aVar;
        this.f57549b = aVar2;
    }

    public static f0 a(el.a aVar, el.a aVar2) {
        return new f0(aVar, aVar2);
    }

    public static e0 c(sf.e eVar, k0 k0Var) {
        return new e0(eVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e0 get() {
        return c((sf.e) this.f57548a.get(), (k0) this.f57549b.get());
    }
}
