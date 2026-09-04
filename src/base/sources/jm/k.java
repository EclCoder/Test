package jm;

import em.e1;
import em.u0;
import em.x0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends em.k0 implements x0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f42654i = AtomicIntegerFieldUpdater.newUpdater(k.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ x0 f42655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final em.k0 f42656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f42658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f42659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f42660h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f42661a;

        public a(Runnable runnable) {
            this.f42661a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f42661a.run();
                } catch (Throwable th2) {
                    em.m0.a(kl.k.f43531a, th2);
                }
                try {
                    Runnable runnableC1 = k.this.c1();
                    if (runnableC1 == null) {
                        return;
                    }
                    this.f42661a = runnableC1;
                    i10++;
                    if (i10 >= 16 && i.d(k.this.f42656d, k.this)) {
                        i.c(k.this.f42656d, k.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = k.this.f42660h;
                    k kVar = k.this;
                    synchronized (obj) {
                        k.b1().decrementAndGet(kVar);
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(em.k0 k0Var, int i10, String str) {
        x0 x0Var = k0Var instanceof x0 ? (x0) k0Var : null;
        this.f42655c = x0Var == null ? u0.a() : x0Var;
        this.f42656d = k0Var;
        this.f42657e = i10;
        this.f42658f = str;
        this.f42659g = new p(false);
        this.f42660h = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater b1() {
        return f42654i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable c1() {
        while (true) {
            Runnable runnable = (Runnable) this.f42659g.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f42660h) {
                f42654i.decrementAndGet(this);
                if (this.f42659g.c() == 0) {
                    return null;
                }
                f42654i.incrementAndGet(this);
            }
        }
    }

    private final boolean d1() {
        synchronized (this.f42660h) {
            if (f42654i.get(this) >= this.f42657e) {
                return false;
            }
            f42654i.incrementAndGet(this);
            return true;
        }
    }

    @Override // em.k0
    public void T0(kl.j jVar, Runnable runnable) {
        Runnable runnableC1;
        this.f42659g.a(runnable);
        if (f42654i.get(this) >= this.f42657e || !d1() || (runnableC1 = c1()) == null) {
            return;
        }
        try {
            i.c(this.f42656d, this, new a(runnableC1));
        } catch (Throwable th2) {
            f42654i.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // em.k0
    public em.k0 V0(int i10, String str) {
        l.a(i10);
        return i10 >= this.f42657e ? l.b(this, str) : super.V0(i10, str);
    }

    @Override // em.x0
    public e1 i(long j10, Runnable runnable, kl.j jVar) {
        return this.f42655c.i(j10, runnable, jVar);
    }

    @Override // em.x0
    public void i0(long j10, em.o oVar) {
        this.f42655c.i0(j10, oVar);
    }

    @Override // em.k0
    public String toString() {
        String str = this.f42658f;
        if (str != null) {
            return str;
        }
        return this.f42656d + ".limitedParallelism(" + this.f42657e + ')';
    }
}
