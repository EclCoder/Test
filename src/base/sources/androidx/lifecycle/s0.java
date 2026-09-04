package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends em.k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f4481c = new m();

    @Override // em.k0
    public void T0(kl.j context, Runnable block) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(block, "block");
        this.f4481c.c(context, block);
    }

    @Override // em.k0
    public boolean U0(kl.j context) {
        kotlin.jvm.internal.s.h(context, "context");
        if (em.c1.c().X0().U0(context)) {
            return true;
        }
        return !this.f4481c.b();
    }
}
