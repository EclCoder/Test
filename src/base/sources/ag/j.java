package ag;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f281c;

    public j(el.a aVar, el.a aVar2, el.a aVar3) {
        this.f279a = aVar;
        this.f280b = aVar2;
        this.f281c = aVar3;
    }

    public static j a(el.a aVar, el.a aVar2, el.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(sf.e eVar, com.squareup.moshi.r rVar, k0 k0Var) {
        return new i(eVar, rVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((sf.e) this.f279a.get(), (com.squareup.moshi.r) this.f280b.get(), (k0) this.f281c.get());
    }
}
