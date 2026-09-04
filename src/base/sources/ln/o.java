package ln;

import fl.g0;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f44819g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f44820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f44821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f44822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kn.c f44823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f44824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConcurrentLinkedQueue f44825f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends kn.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // kn.a
        public long f() {
            return o.this.b(System.nanoTime());
        }
    }

    public o(kn.d taskRunner, int i10, long j10, TimeUnit timeUnit, g connectionListener) {
        kotlin.jvm.internal.s.h(taskRunner, "taskRunner");
        kotlin.jvm.internal.s.h(timeUnit, "timeUnit");
        kotlin.jvm.internal.s.h(connectionListener, "connectionListener");
        this.f44820a = i10;
        this.f44821b = connectionListener;
        this.f44822c = timeUnit.toNanos(j10);
        this.f44823d = taskRunner.k();
        this.f44824e = new b(hn.p.f40723c + " ConnectionPool connection closer");
        this.f44825f = new ConcurrentLinkedQueue();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    private final int e(n nVar, long j10) {
        if (hn.p.f40722b && !Thread.holdsLock(nVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + nVar);
        }
        List listE = nVar.e();
        int i10 = 0;
        while (i10 < listE.size()) {
            Reference reference = (Reference) listE.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                kotlin.jvm.internal.s.f(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                okhttp3.internal.platform.c.f48992a.e().n("A connection to " + nVar.q().a().l() + " was leaked. Did you forget to close a response body?", ((m.b) reference).a());
                listE.remove(i10);
                if (listE.isEmpty()) {
                    nVar.s(j10 - this.f44822c);
                    return 0;
                }
            }
        }
        return listE.size();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0029, B:14:0x0032, B:17:0x0039), top: B:38:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0029, B:14:0x0032, B:17:0x0039), top: B:38:0x0029 }] */
    public final n a(boolean z10, gn.a address, m call, List list, boolean z11) {
        boolean z12;
        boolean zH;
        Socket socketW;
        kotlin.jvm.internal.s.h(address, "address");
        kotlin.jvm.internal.s.h(call, "call");
        Iterator it = this.f44825f.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            n nVar = (n) it.next();
            kotlin.jvm.internal.s.e(nVar);
            synchronized (nVar) {
                z12 = false;
                if (z11) {
                    try {
                        if (nVar.n()) {
                            if (!nVar.l(address, list)) {
                                call.d(nVar);
                                z12 = true;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (!nVar.l(address, list)) {
                    call.d(nVar);
                    z12 = true;
                }
            }
            if (z12) {
                if (nVar.m(z10)) {
                    return nVar;
                }
                synchronized (nVar) {
                    zH = nVar.h();
                    nVar.t(true);
                    socketW = call.w();
                }
                if (socketW != null) {
                    hn.p.h(socketW);
                    this.f44821b.f(nVar);
                } else if (!zH) {
                    this.f44821b.h(nVar);
                }
            }
        }
        return null;
    }

    public final long b(long j10) {
        long j11 = (j10 - this.f44822c) + 1;
        Iterator it = this.f44825f.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        n nVar = null;
        long j12 = Long.MAX_VALUE;
        int i10 = 0;
        n nVar2 = null;
        n nVar3 = null;
        int i11 = 0;
        while (it.hasNext()) {
            n nVar4 = (n) it.next();
            kotlin.jvm.internal.s.e(nVar4);
            synchronized (nVar4) {
                if (e(nVar4, j10) > 0) {
                    i11++;
                } else {
                    long jG = nVar4.g();
                    if (jG < j11) {
                        nVar2 = nVar4;
                        j11 = jG;
                    }
                    i10++;
                    if (jG < j12) {
                        nVar3 = nVar4;
                        j12 = jG;
                    }
                }
                g0 g0Var = g0.f38750a;
            }
        }
        if (nVar2 != null) {
            nVar = nVar2;
        } else if (i10 > this.f44820a) {
            j11 = j12;
            nVar = nVar3;
        } else {
            j11 = -1;
        }
        if (nVar == null) {
            if (nVar3 != null) {
                return (j12 + this.f44822c) - j10;
            }
            if (i11 > 0) {
                return this.f44822c;
            }
            return -1L;
        }
        synchronized (nVar) {
            if (!nVar.e().isEmpty()) {
                return 0L;
            }
            if (nVar.g() != j11) {
                return 0L;
            }
            nVar.t(true);
            this.f44825f.remove(nVar);
            hn.p.h(nVar.u());
            this.f44821b.f(nVar);
            if (this.f44825f.isEmpty()) {
                this.f44823d.a();
            }
            return 0L;
        }
    }

    public final boolean c(n connection) {
        kotlin.jvm.internal.s.h(connection, "connection");
        if (hn.p.f40722b && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.h() && this.f44820a != 0) {
            g();
            return false;
        }
        connection.t(true);
        this.f44825f.remove(connection);
        if (this.f44825f.isEmpty()) {
            this.f44823d.a();
        }
        return true;
    }

    public final g d() {
        return this.f44821b;
    }

    public final void f(n connection) {
        kotlin.jvm.internal.s.h(connection, "connection");
        if (!hn.p.f40722b || Thread.holdsLock(connection)) {
            this.f44825f.add(connection);
            g();
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final void g() {
        kn.c.m(this.f44823d, this.f44824e, 0L, 2, null);
    }
}
