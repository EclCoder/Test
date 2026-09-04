package bg;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class t implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f8899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f8900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f8901c;

    public t(el.a aVar, el.a aVar2, el.a aVar3) {
        this.f8899a = aVar;
        this.f8900b = aVar2;
        this.f8901c = aVar3;
    }

    public static t a(el.a aVar, el.a aVar2, el.a aVar3) {
        return new t(aVar, aVar2, aVar3);
    }

    public static s c(sf.e eVar, com.squareup.moshi.r rVar, k0 k0Var) {
        return new s(eVar, rVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c((sf.e) this.f8899a.get(), (com.squareup.moshi.r) this.f8900b.get(), (k0) this.f8901c.get());
    }
}
