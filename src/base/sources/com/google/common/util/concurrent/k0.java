package com.google.common.util.concurrent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class k0 implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c0 f21995f = new c0(k0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f21996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque f21997b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f21998c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f21999d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f22000e = new b(this, null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f22001a;

        a(k0 k0Var, Runnable runnable) {
            this.f22001a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22001a.run();
        }

        public String toString() {
            return this.f22001a.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Runnable f22002a;

        private b() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x003d A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.f22002a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            com.google.common.util.concurrent.k0.f21995f.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f22002a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
        
            r8.f22002a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.common.util.concurrent.k0 r2 = com.google.common.util.concurrent.k0.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = com.google.common.util.concurrent.k0.a(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                com.google.common.util.concurrent.k0 r0 = com.google.common.util.concurrent.k0.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.k0$c r0 = com.google.common.util.concurrent.k0.b(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.k0$c r3 = com.google.common.util.concurrent.k0.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L48
            L20:
                r0 = move-exception
                goto L81
            L22:
                com.google.common.util.concurrent.k0 r0 = com.google.common.util.concurrent.k0.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.k0.e(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.k0 r0 = com.google.common.util.concurrent.k0.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.k0.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                com.google.common.util.concurrent.k0 r3 = com.google.common.util.concurrent.k0.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = com.google.common.util.concurrent.k0.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f22002a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                com.google.common.util.concurrent.k0 r0 = com.google.common.util.concurrent.k0.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.k0$c r3 = com.google.common.util.concurrent.k0.c.IDLE     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.k0.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
                goto L18
            L48:
                return
            L49:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f22002a     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            L55:
                r8.f22002a = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r0 = move-exception
                goto L83
            L5a:
                r0 = move-exception
                goto L7e
            L5c:
                r3 = move-exception
                com.google.common.util.concurrent.c0 r4 = com.google.common.util.concurrent.k0.f()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.f22002a     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7e:
                r8.f22002a = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L81:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L58
            L83:
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.k0.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (k0.this.f21997b) {
                    k0.this.f21998c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f22002a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + k0.this.f21998c + "}";
        }

        /* synthetic */ b(k0 k0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    k0(Executor executor) {
        this.f21996a = (Executor) sc.p.o(executor);
    }

    static /* synthetic */ long e(k0 k0Var) {
        long j10 = k0Var.f21999d;
        k0Var.f21999d = 1 + j10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x005f  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        sc.p.o(runnable);
        synchronized (this.f21997b) {
            c cVar2 = this.f21998c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f21999d;
                a aVar = new a(this, runnable);
                this.f21997b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f21998c = cVar3;
                try {
                    this.f21996a.execute(this.f22000e);
                    if (this.f21998c != cVar3) {
                        return;
                    }
                    synchronized (this.f21997b) {
                        try {
                            if (this.f21999d == j10 && this.f21998c == cVar3) {
                                this.f21998c = cVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    synchronized (this.f21997b) {
                        try {
                            c cVar4 = this.f21998c;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z10 = false;
                            } else if (this.f21997b.removeLastOccurrence(aVar)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!(th3 instanceof RejectedExecutionException) || z10) {
                                throw th3;
                            }
                            return;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            this.f21997b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f21996a + "}";
    }
}
