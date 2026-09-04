package kn;

import fl.g0;
import hn.m;
import hn.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f43544k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Logger f43545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f43546m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f43547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Logger f43548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f43550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f43551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f43554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f43555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f43556j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        BlockingQueue a(BlockingQueue blockingQueue);

        void b(d dVar, Runnable runnable);

        void c(d dVar);

        void d(d dVar, long j10);

        long nanoTime();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f43557a;

        public c(ThreadFactory threadFactory) {
            s.h(threadFactory, "threadFactory");
            this.f43557a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // kn.d.a
        public BlockingQueue a(BlockingQueue queue) {
            s.h(queue, "queue");
            return queue;
        }

        @Override // kn.d.a
        public void b(d taskRunner, Runnable runnable) {
            s.h(taskRunner, "taskRunner");
            s.h(runnable, "runnable");
            this.f43557a.execute(runnable);
        }

        @Override // kn.d.a
        public void c(d taskRunner) {
            s.h(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // kn.d.a
        public void d(d taskRunner, long j10) throws InterruptedException {
            s.h(taskRunner, "taskRunner");
            if (p.f40722b && !Thread.holdsLock(taskRunner)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + taskRunner);
            }
            if (j10 > 0) {
                long j11 = j10 / 1000000;
                long j12 = j10 - (1000000 * j11);
                if (j11 > 0 || j10 > 0) {
                    taskRunner.wait(j11, (int) j12);
                }
            }
        }

        @Override // kn.d.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: kn.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class RunnableC0661d implements Runnable {
        RunnableC0661d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            kn.a aVarE;
            long jNanoTime;
            kn.a aVarE2;
            d dVar = d.this;
            synchronized (dVar) {
                dVar.f43553g++;
                aVarE = dVar.e();
            }
            if (aVarE == null) {
                return;
            }
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            while (true) {
                try {
                    threadCurrentThread.setName(aVarE.b());
                    Logger loggerI = d.this.i();
                    kn.c cVarD = aVarE.d();
                    s.e(cVarD);
                    boolean zIsLoggable = loggerI.isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jNanoTime = cVarD.j().h().nanoTime();
                        kn.b.c(loggerI, aVarE, cVarD, "starting");
                    } else {
                        jNanoTime = -1;
                    }
                    try {
                        long jF = aVarE.f();
                        if (zIsLoggable) {
                            kn.b.c(loggerI, aVarE, cVarD, "finished run in " + kn.b.b(cVarD.j().h().nanoTime() - jNanoTime));
                        }
                        d dVar2 = d.this;
                        synchronized (dVar2) {
                            dVar2.d(aVarE, jF, true);
                            aVarE2 = dVar2.e();
                        }
                        if (aVarE2 == null) {
                            threadCurrentThread.setName(name);
                            return;
                        }
                        aVarE = aVarE2;
                    } catch (Throwable th2) {
                        if (zIsLoggable) {
                            kn.b.c(loggerI, aVarE, cVarD, UoyZyZEcGYBpIg.VBTYnvptNXzP + kn.b.b(cVarD.j().h().nanoTime() - jNanoTime));
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        d dVar3 = d.this;
                        synchronized (dVar3) {
                            dVar3.d(aVarE, -1L, false);
                            g0 g0Var = g0.f38750a;
                            if (!(th3 instanceof InterruptedException)) {
                                throw th3;
                            }
                            Thread.currentThread().interrupt();
                            threadCurrentThread.setName(name);
                            return;
                        }
                    } catch (Throwable th4) {
                        threadCurrentThread.setName(name);
                        throw th4;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Logger logger = Logger.getLogger(d.class.getName());
        s.g(logger, "getLogger(...)");
        f43545l = logger;
        f43546m = new d(new c(p.p(p.f40723c + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    public d(a backend, Logger logger) {
        s.h(backend, "backend");
        s.h(logger, "logger");
        this.f43547a = backend;
        this.f43548b = logger;
        this.f43549c = 10000;
        this.f43554h = new ArrayList();
        this.f43555i = new ArrayList();
        this.f43556j = new RunnableC0661d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(kn.a aVar, long j10, boolean z10) {
        if (p.f40722b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        kn.c cVarD = aVar.d();
        s.e(cVarD);
        if (cVarD.e() != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zF = cVarD.f();
        cVarD.p(false);
        cVarD.o(null);
        this.f43554h.remove(cVarD);
        if (j10 != -1 && !zF && !cVarD.i()) {
            cVarD.n(aVar, j10, true);
        }
        if (cVarD.g().isEmpty()) {
            return;
        }
        this.f43555i.add(cVarD);
        if (z10) {
            return;
        }
        l();
    }

    private final void f(kn.a aVar) {
        if (p.f40722b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        kn.c cVarD = aVar.d();
        s.e(cVarD);
        cVarD.g().remove(aVar);
        this.f43555i.remove(cVarD);
        cVarD.o(aVar);
        this.f43554h.add(cVarD);
    }

    private final void l() {
        if (!p.f40722b || Thread.holdsLock(this)) {
            int i10 = this.f43552f;
            if (i10 > this.f43553g) {
                return;
            }
            this.f43552f = i10 + 1;
            this.f43547a.b(this, this.f43556j);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final kn.a e() {
        boolean z10;
        if (p.f40722b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f43555i.isEmpty()) {
            long jNanoTime = this.f43547a.nanoTime();
            Iterator it = this.f43555i.iterator();
            long jMin = Long.MAX_VALUE;
            kn.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                kn.a aVar2 = (kn.a) ((kn.c) it.next()).g().get(0);
                long jMax = Math.max(0L, aVar2.c() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                f(aVar);
                if (z10 || (!this.f43550d && !this.f43555i.isEmpty())) {
                    l();
                }
                return aVar;
            }
            if (this.f43550d) {
                if (jMin < this.f43551e - jNanoTime) {
                    this.f43547a.c(this);
                }
                return null;
            }
            this.f43550d = true;
            this.f43551e = jNanoTime + jMin;
            try {
                try {
                    this.f43547a.d(this, jMin);
                } catch (InterruptedException unused) {
                    g();
                }
                this.f43550d = false;
            } catch (Throwable th2) {
                this.f43550d = false;
                throw th2;
            }
        }
        return null;
    }

    public final void g() {
        if (p.f40722b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        int size = this.f43554h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((kn.c) this.f43554h.get(size)).b();
            }
        }
        for (int size2 = this.f43555i.size() - 1; -1 < size2; size2--) {
            kn.c cVar = (kn.c) this.f43555i.get(size2);
            cVar.b();
            if (cVar.g().isEmpty()) {
                this.f43555i.remove(size2);
            }
        }
    }

    public final a h() {
        return this.f43547a;
    }

    public final Logger i() {
        return this.f43548b;
    }

    public final void j(kn.c taskQueue) {
        s.h(taskQueue, "taskQueue");
        if (p.f40722b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.e() == null) {
            if (taskQueue.g().isEmpty()) {
                this.f43555i.remove(taskQueue);
            } else {
                m.a(this.f43555i, taskQueue);
            }
        }
        if (this.f43550d) {
            this.f43547a.c(this);
        } else {
            l();
        }
    }

    public final kn.c k() {
        int i10;
        synchronized (this) {
            i10 = this.f43549c;
            this.f43549c = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new kn.c(this, sb2.toString());
    }

    public /* synthetic */ d(a aVar, Logger logger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? f43545l : logger);
    }
}
