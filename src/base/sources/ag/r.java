package ag;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class r implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f295c;

    public r(el.a aVar, el.a aVar2, el.a aVar3) {
        this.f293a = aVar;
        this.f294b = aVar2;
        this.f295c = aVar3;
    }

    public static r a(el.a aVar, el.a aVar2, el.a aVar3) {
        return new r(aVar, aVar2, aVar3);
    }

    public static q c(sf.e eVar, com.squareup.moshi.r rVar, k0 k0Var) {
        return new q(eVar, rVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c((sf.e) this.f293a.get(), (com.squareup.moshi.r) this.f294b.get(), (k0) this.f295c.get());
    }
}
