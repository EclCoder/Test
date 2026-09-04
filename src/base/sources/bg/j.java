package bg;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f8884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f8885b;

    public j(el.a aVar, el.a aVar2) {
        this.f8884a = aVar;
        this.f8885b = aVar2;
    }

    public static j a(el.a aVar, el.a aVar2) {
        return new j(aVar, aVar2);
    }

    public static i c(sf.e eVar, k0 k0Var) {
        return new i(eVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((sf.e) this.f8884a.get(), (k0) this.f8885b.get());
    }
}
