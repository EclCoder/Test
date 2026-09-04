package em;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Thread f38004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i1 f38005e;

    public g(kl.j jVar, Thread thread, i1 i1Var) {
        super(jVar, true, true);
        this.f38004d = thread;
        this.f38005e = i1Var;
    }

    @Override // em.e2
    protected void D(Object obj) {
        if (kotlin.jvm.internal.s.c(Thread.currentThread(), this.f38004d)) {
            return;
        }
        Thread thread = this.f38004d;
        c.a();
        LockSupport.unpark(thread);
    }

    public final Object U0() throws Throwable {
        c.a();
        try {
            i1 i1Var = this.f38005e;
            if (i1Var != null) {
                i1.d1(i1Var, false, 1, null);
            }
            while (true) {
                try {
                    i1 i1Var2 = this.f38005e;
                    long jG1 = i1Var2 != null ? i1Var2.g1() : Long.MAX_VALUE;
                    if (h()) {
                        break;
                    }
                    c.a();
                    LockSupport.parkNanos(this, jG1);
                    if (Thread.interrupted()) {
                        G(new InterruptedException());
                    }
                } catch (Throwable th2) {
                    i1 i1Var3 = this.f38005e;
                    if (i1Var3 != null) {
                        i1.Y0(i1Var3, false, 1, null);
                    }
                    throw th2;
                }
            }
            i1 i1Var4 = this.f38005e;
            if (i1Var4 != null) {
                i1.Y0(i1Var4, false, 1, null);
            }
            c.a();
            Object objH = f2.h(Z());
            d0 d0Var = objH instanceof d0 ? (d0) objH : null;
            if (d0Var == null) {
                return objH;
            }
            throw d0Var.f37973a;
        } catch (Throwable th3) {
            c.a();
            throw th3;
        }
    }

    @Override // em.e2
    protected boolean k0() {
        return true;
    }
}
