package jm;

import em.e1;
import em.u0;
import em.x0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends em.k0 implements x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ x0 f42689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final em.k0 f42690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f42691e;

    /* JADX WARN: Multi-variable type inference failed */
    public v(em.k0 k0Var, String str) {
        x0 x0Var = k0Var instanceof x0 ? (x0) k0Var : null;
        this.f42689c = x0Var == null ? u0.a() : x0Var;
        this.f42690d = k0Var;
        this.f42691e = str;
    }

    @Override // em.k0
    public void T0(kl.j jVar, Runnable runnable) {
        this.f42690d.T0(jVar, runnable);
    }

    @Override // em.k0
    public boolean U0(kl.j jVar) {
        return this.f42690d.U0(jVar);
    }

    @Override // em.x0
    public e1 i(long j10, Runnable runnable, kl.j jVar) {
        return this.f42689c.i(j10, runnable, jVar);
    }

    @Override // em.x0
    public void i0(long j10, em.o oVar) {
        this.f42689c.i0(j10, oVar);
    }

    @Override // em.k0
    public String toString() {
        return this.f42691e;
    }
}
