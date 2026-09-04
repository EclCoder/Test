package hm;

import em.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class x implements i0, e, im.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ i0 f40707a;
    private final z1 job;

    public x(i0 i0Var, z1 z1Var) {
        this.f40707a = i0Var;
        this.job = z1Var;
    }

    @Override // im.k
    public e a(kl.j jVar, int i10, gm.a aVar) {
        return k0.d(this, jVar, i10, aVar);
    }

    @Override // hm.z, hm.e
    public Object collect(f fVar, kl.f fVar2) {
        return this.f40707a.collect(fVar, fVar2);
    }

    @Override // hm.i0
    public Object getValue() {
        return this.f40707a.getValue();
    }
}
