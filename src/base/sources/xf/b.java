package xf;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f56842a;

    public b(el.a aVar) {
        this.f56842a = aVar;
    }

    public static b a(el.a aVar) {
        return new b(aVar);
    }

    public static a c(k0 k0Var) {
        return new a(k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((k0) this.f56842a.get());
    }
}
