package ag;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class t implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f299c;

    public t(el.a aVar, el.a aVar2, el.a aVar3) {
        this.f297a = aVar;
        this.f298b = aVar2;
        this.f299c = aVar3;
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
        return c((sf.e) this.f297a.get(), (com.squareup.moshi.r) this.f298b.get(), (k0) this.f299c.get());
    }
}
