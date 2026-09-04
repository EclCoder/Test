package qe;

import ne.x0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f50707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe.e f50708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pe.e f50709c;

    private n(pe.e eVar, pe.e eVar2, pe.e eVar3) {
        this.f50707a = eVar;
        this.f50708b = eVar2;
        this.f50709c = eVar3;
    }

    public static n a(pe.e eVar, pe.e eVar2, pe.e eVar3) {
        return new n(eVar, eVar2, eVar3);
    }

    public static m c(kl.j jVar, x0 x0Var, z0.h hVar) {
        return new m(jVar, x0Var, hVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c((kl.j) this.f50707a.get(), (x0) this.f50708b.get(), (z0.h) this.f50709c.get());
    }
}
