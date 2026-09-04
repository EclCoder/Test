package ed;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class j implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f37676f = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f37677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque f37678b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f37679c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f37680d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f37681e = new b(this, null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f37682a;

        a(Runnable runnable) {
            this.f37682a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37682a.run();
        }

        public String toString() {
            return this.f37682a.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Runnable f37684a;

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
        
            r8.f37684a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            ed.j.f37676f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f37684a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.f37684a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
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
                ed.j r2 = ed.j.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = ed.j.a(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                ed.j r0 = ed.j.this     // Catch: java.lang.Throwable -> L20
                ed.j$c r0 = ed.j.b(r0)     // Catch: java.lang.Throwable -> L20
                ed.j$c r3 = ed.j.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L48
            L20:
                r0 = move-exception
                goto L7d
            L22:
                ed.j r0 = ed.j.this     // Catch: java.lang.Throwable -> L20
                ed.j.e(r0)     // Catch: java.lang.Throwable -> L20
                ed.j r0 = ed.j.this     // Catch: java.lang.Throwable -> L20
                ed.j.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                ed.j r3 = ed.j.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = ed.j.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f37684a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                ed.j r0 = ed.j.this     // Catch: java.lang.Throwable -> L20
                ed.j$c r3 = ed.j.c.IDLE     // Catch: java.lang.Throwable -> L20
                ed.j.c(r0, r3)     // Catch: java.lang.Throwable -> L20
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
                java.lang.Runnable r3 = r8.f37684a     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            L55:
                r8.f37684a = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r0 = move-exception
                goto L7f
            L5a:
                r0 = move-exception
                goto L7a
            L5c:
                r3 = move-exception
                java.util.logging.Logger r4 = ed.j.f()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.f37684a     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7a:
                r8.f37684a = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L7d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L58
            L7f:
                if (r1 == 0) goto L88
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L88:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ed.j.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (j.this.f37678b) {
                    j.this.f37679c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f37684a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + j.this.f37679c + "}";
        }

        /* synthetic */ b(j jVar, a aVar) {
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

    j(Executor executor) {
        this.f37677a = (Executor) Preconditions.checkNotNull(executor);
    }

    static /* synthetic */ long e(j jVar) {
        long j10 = jVar.f37680d;
        jVar.f37680d = 1 + j10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f37678b) {
            c cVar2 = this.f37679c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f37680d;
                a aVar = new a(runnable);
                this.f37678b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f37679c = cVar3;
                try {
                    this.f37677a.execute(this.f37681e);
                    if (this.f37679c != cVar3) {
                        return;
                    }
                    synchronized (this.f37678b) {
                        try {
                            if (this.f37680d == j10 && this.f37679c == cVar3) {
                                this.f37679c = cVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f37678b) {
                        try {
                            c cVar4 = this.f37679c;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z10 = false;
                            } else if (this.f37678b.removeLastOccurrence(aVar)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
            }
            this.f37678b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f37677a + "}";
    }
}
