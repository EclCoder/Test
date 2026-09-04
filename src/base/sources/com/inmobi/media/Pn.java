package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Pn implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ em.o0 f25515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sn f25516b;

    public Pn(em.o0 o0Var, Sn sn2) {
        this.f25516b = sn2;
        this.f25515a = o0Var;
    }

    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        em.o0 o0Var = this.f25515a;
        boolean z10 = true;
        if (((EnumC2949eo) obj) == EnumC2949eo.VISIBLE) {
            Tn tn2 = this.f25516b.f25719d;
            if (!tn2.f25774b) {
                em.z1 z1Var = tn2.f25773a;
                if (!(z1Var != null ? z1Var.isActive() : false)) {
                    z10 = false;
                }
            }
            if (!z10) {
                Sn sn2 = this.f25516b;
                sn2.f25719d.f25773a = em.k.d(o0Var, null, null, new Rn(sn2, null), 3, null);
            }
        } else {
            Sn sn3 = this.f25516b;
            em.z1 z1Var2 = sn3.f25719d.f25773a;
            if (z1Var2 != null) {
                em.z1.c0(z1Var2, null, 1, null);
            }
            sn3.f25719d.f25773a = null;
        }
        return fl.g0.f38750a;
    }
}
