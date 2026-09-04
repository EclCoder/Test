package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class b0 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f21963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f21964b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0 f21965a;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public String toString() {
            return this.f21965a.toString();
        }

        private b(b0 b0Var) {
            this.f21965a = b0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f21963a = new c();
        f21964b = new c();
    }

    b0() {
    }

    private void j(Thread thread) {
        Runnable runnable = (Runnable) get();
        b bVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof b;
            if (!z11 && runnable != f21964b) {
                break;
            }
            if (z11) {
                bVar = (b) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f21964b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    abstract void a(Throwable th2);

    abstract void b(Object obj);

    final void d() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.b(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(f21963a)) == f21964b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean g();

    abstract Object h();

    abstract String i();

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objH = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zG = g();
            if (!zG) {
                try {
                    objH = h();
                } catch (Throwable th2) {
                    try {
                        j0.b(th2);
                        if (!compareAndSet(threadCurrentThread, f21963a)) {
                            j(threadCurrentThread);
                        }
                        if (zG) {
                            return;
                        }
                        a(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, f21963a)) {
                            j(threadCurrentThread);
                        }
                        if (!zG) {
                            b(h0.a(null));
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f21963a)) {
                j(threadCurrentThread);
            }
            if (zG) {
                return;
            }
            b(h0.a(objH));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f21963a) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + i();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
