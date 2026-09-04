package gm;

import em.m0;
import fl.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class r extends h implements s {
    public r(kl.j jVar, g gVar) {
        super(jVar, gVar, true, true);
    }

    @Override // em.a
    protected void R0(Throwable th2, boolean z10) {
        if (U0().w(th2) || z10) {
            return;
        }
        m0.a(getContext(), th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // em.a
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public void S0(g0 g0Var) {
        u.f(U0(), null, 1, null);
    }

    @Override // em.a, em.e2, em.z1
    public boolean isActive() {
        return super.isActive();
    }
}
