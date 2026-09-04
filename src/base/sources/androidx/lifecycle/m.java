package androidx.lifecycle;

import em.i2;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4436c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4434a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f4437d = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(m mVar, Runnable runnable) {
        mVar.f(runnable);
    }

    private final void f(Runnable runnable) {
        if (!this.f4437d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        e();
    }

    public final boolean b() {
        return this.f4435b || !this.f4434a;
    }

    public final void c(kl.j context, final Runnable runnable) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(runnable, "runnable");
        i2 i2VarX0 = em.c1.c().X0();
        if (i2VarX0.U0(context) || b()) {
            i2VarX0.T0(context, new Runnable() { // from class: androidx.lifecycle.l
                @Override // java.lang.Runnable
                public final void run() {
                    m.d(this.f4430a, runnable);
                }
            });
        } else {
            f(runnable);
        }
    }

    public final void e() {
        if (this.f4436c) {
            return;
        }
        try {
            this.f4436c = true;
            while (!this.f4437d.isEmpty() && b()) {
                Runnable runnable = (Runnable) this.f4437d.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
            this.f4436c = false;
        } catch (Throwable th2) {
            this.f4436c = false;
            throw th2;
        }
    }

    public final void g() {
        this.f4435b = true;
        e();
    }

    public final void h() {
        this.f4434a = true;
    }

    public final void i() {
        if (this.f4434a) {
            if (this.f4435b) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.f4434a = false;
            e();
        }
    }
}
