package ln;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f44763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kn.d f44764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f44765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f44766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList f44767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue f44768f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends kn.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ t.b f44769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k f44770f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, t.b bVar, k kVar) {
            super(str, false, 2, null);
            this.f44769e = bVar;
            this.f44770f = kVar;
        }

        @Override // kn.a
        public long f() throws InterruptedException {
            t.a aVar;
            try {
                aVar = this.f44769e.d();
            } catch (Throwable th2) {
                aVar = new t.a(this.f44769e, null, th2, 2, null);
            }
            if (!this.f44770f.f44767e.contains(this.f44769e)) {
                return -1L;
            }
            this.f44770f.f44768f.put(aVar);
            return -1L;
        }
    }

    public k(t routePlanner, kn.d taskRunner) {
        kotlin.jvm.internal.s.h(routePlanner, "routePlanner");
        kotlin.jvm.internal.s.h(taskRunner, "taskRunner");
        this.f44763a = routePlanner;
        this.f44764b = taskRunner;
        this.f44765c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f44766d = Long.MIN_VALUE;
        this.f44767e = new CopyOnWriteArrayList();
        this.f44768f = taskRunner.h().a(new LinkedBlockingDeque());
    }

    private final t.a e(long j10, TimeUnit timeUnit) {
        t.a aVar;
        if (this.f44767e.isEmpty() || (aVar = (t.a) this.f44768f.poll(j10, timeUnit)) == null) {
            return null;
        }
        this.f44767e.remove(aVar.d());
        return aVar;
    }

    private final void f() {
        Iterator it = this.f44767e.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            t.b bVar = (t.b) it.next();
            bVar.cancel();
            t.b bVarC = bVar.c();
            if (bVarC != null) {
                b().b().addLast(bVarC);
            }
        }
        this.f44767e.clear();
    }

    private final t.a g() {
        t.b jVar;
        if (t.d(b(), null, 1, null)) {
            try {
                jVar = b().c();
            } catch (Throwable th2) {
                jVar = new j(th2);
            }
            if (jVar.isReady()) {
                return new t.a(jVar, null, null, 6, null);
            }
            if (jVar instanceof j) {
                return ((j) jVar).f();
            }
            this.f44767e.add(jVar);
            kn.c.m(this.f44764b.k(), new a(hn.p.f40723c + " connect " + b().a().l().n(), jVar, this), 0L, 2, null);
        }
        return null;
    }

    @Override // ln.i
    public n a() throws IOException {
        t.a aVarG;
        long j10;
        IOException iOException = null;
        while (true) {
            try {
                if (this.f44767e.isEmpty() && !t.d(b(), null, 1, null)) {
                    f();
                    kotlin.jvm.internal.s.e(iOException);
                    throw iOException;
                }
                if (b().isCanceled()) {
                    throw new IOException("Canceled");
                }
                long jNanoTime = this.f44764b.h().nanoTime();
                long j11 = this.f44766d - jNanoTime;
                if (this.f44767e.isEmpty() || j11 <= 0) {
                    aVarG = g();
                    j10 = this.f44765c;
                    this.f44766d = jNanoTime + j10;
                } else {
                    j10 = j11;
                    aVarG = null;
                }
                if (aVarG != null || (aVarG = e(j10, TimeUnit.NANOSECONDS)) != null) {
                    if (aVarG.f()) {
                        f();
                        if (!aVarG.d().isReady()) {
                            aVarG = aVarG.d().b();
                        }
                        if (aVarG.f()) {
                            n nVarA = aVarG.d().a();
                            f();
                            return nVarA;
                        }
                    }
                    Throwable thE = aVarG.e();
                    if (thE != null) {
                        if (!(thE instanceof IOException)) {
                            throw thE;
                        }
                        if (iOException == null) {
                            iOException = (IOException) thE;
                        } else {
                            fl.e.a(iOException, thE);
                        }
                    }
                    t.b bVarC = aVarG.c();
                    if (bVarC != null) {
                        b().b().addFirst(bVarC);
                    }
                }
            } catch (Throwable th2) {
                f();
                throw th2;
            }
        }
    }

    @Override // ln.i
    public t b() {
        return this.f44763a;
    }
}
