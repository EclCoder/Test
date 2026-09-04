package un;

import fl.g0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.s;
import xn.c0;
import xn.g;
import xn.h;
import xn.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f54852b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f54853c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f54854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f54855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IOException f54856f;

    private final void f() {
        try {
            g gVarC = c0.c(e());
            try {
                h hVarF0 = gVarC.f0(gVarC.readInt());
                h hVarF1 = gVarC.f0(gVarC.readInt());
                g0 g0Var = g0.f38750a;
                ql.b.a(gVarC, null);
                synchronized (this) {
                    s.e(hVarF0);
                    h(hVarF0);
                    s.e(hVarF1);
                    i(hVarF1);
                }
                this.f54853c.countDown();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.b.a(gVarC, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            this.f54853c.countDown();
            throw th4;
        }
    }

    private final void g() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    f();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    this.f54856f = e10;
                    if (!z10) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (!z10) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    @Override // un.d
    public h a() {
        h hVar = this.f54854d;
        if (hVar != null) {
            return hVar;
        }
        s.w("bytes");
        return null;
    }

    @Override // un.d
    public void b() {
        if (this.f54852b.get() || !this.f54852b.compareAndSet(false, true)) {
            try {
                this.f54853c.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            g();
        }
        if (this.f54854d != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + d() + " resource.");
        illegalStateException.initCause(this.f54856f);
        throw illegalStateException;
    }

    @Override // un.d
    public h c() {
        h hVar = this.f54855e;
        if (hVar != null) {
            return hVar;
        }
        s.w("exceptionBytes");
        return null;
    }

    public abstract Object d();

    public abstract q0 e();

    public void h(h hVar) {
        s.h(hVar, "<set-?>");
        this.f54854d = hVar;
    }

    public void i(h hVar) {
        s.h(hVar, "<set-?>");
        this.f54855e = hVar;
    }
}
