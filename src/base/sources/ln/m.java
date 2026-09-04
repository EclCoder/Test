package ln;

import androidx.core.app.NotificationCompat;
import fl.g0;
import gn.b0;
import gn.d0;
import gn.f0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class m implements gn.e, Cloneable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final c f44771v = new c(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f44772w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f44773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f44774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f44775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f44776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile gn.s f44777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f44778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f44779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f44780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i f44781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n f44782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f44783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private h f44784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f44785m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f44786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f44787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f44788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f44789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile boolean f44790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile h f44791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CopyOnWriteArrayList f44792t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AtomicReference f44793u;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final gn.f f44794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile AtomicInteger f44795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f44796c;

        public a(m mVar, gn.f responseCallback) {
            kotlin.jvm.internal.s.h(responseCallback, "responseCallback");
            this.f44796c = mVar;
            this.f44794a = responseCallback;
            this.f44795b = new AtomicInteger(0);
        }

        public static /* synthetic */ void c(a aVar, RejectedExecutionException rejectedExecutionException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rejectedExecutionException = null;
            }
            aVar.b(rejectedExecutionException);
        }

        public final void a(ExecutorService executorService) {
            kotlin.jvm.internal.s.h(executorService, "executorService");
            hn.p.e(this.f44796c.j().m());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    b(e10);
                    this.f44796c.j().m().e(this);
                }
            } catch (Throwable th2) {
                this.f44796c.j().m().e(this);
                throw th2;
            }
        }

        public final void b(RejectedExecutionException rejectedExecutionException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(rejectedExecutionException);
            this.f44796c.u(interruptedIOException);
            this.f44794a.onFailure(this.f44796c, interruptedIOException);
        }

        public final m d() {
            return this.f44796c;
        }

        public final AtomicInteger e() {
            return this.f44795b;
        }

        public final String f() {
            return this.f44796c.o().m().g();
        }

        public final void g(a other) {
            kotlin.jvm.internal.s.h(other, "other");
            this.f44795b = other.f44795b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th2;
            IOException e10;
            b0 b0VarJ;
            String str = "OkHttp " + this.f44796c.v();
            m mVar = this.f44796c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                mVar.f44778f.s();
                try {
                    try {
                        z10 = true;
                        try {
                            this.f44794a.onResponse(mVar, mVar.q());
                            b0VarJ = mVar.j();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z10) {
                                okhttp3.internal.platform.c.f48992a.e().m("Callback failure for " + mVar.A(), 4, e10);
                            } else {
                                this.f44794a.onFailure(mVar, e10);
                            }
                            b0VarJ = mVar.j();
                        } catch (Throwable th3) {
                            th2 = th3;
                            mVar.cancel();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th2);
                                iOException.initCause(th2);
                                this.f44794a.onFailure(mVar, iOException);
                            }
                            if (!(th2 instanceof InterruptedException)) {
                                throw th2;
                            }
                            Thread.currentThread().interrupt();
                            b0VarJ = mVar.j();
                        }
                    } catch (Throwable th4) {
                        mVar.j().m().e(this);
                        throw th4;
                    }
                } catch (IOException e12) {
                    z10 = false;
                    e10 = e12;
                } catch (Throwable th5) {
                    z10 = false;
                    th2 = th5;
                }
                b0VarJ.m().e(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th6) {
                threadCurrentThread.setName(name);
                throw th6;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f44797a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m referent, Object obj) {
            super(referent);
            kotlin.jvm.internal.s.h(referent, "referent");
            this.f44797a = obj;
        }

        public final Object a() {
            return this.f44797a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends xn.c {
        d() {
        }

        @Override // xn.c
        protected void z() {
            m.this.cancel();
        }
    }

    static {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(m.class, gn.s.class, "e");
        kotlin.jvm.internal.s.g(atomicReferenceFieldUpdaterNewUpdater, "newUpdater(...)");
        f44772w = atomicReferenceFieldUpdaterNewUpdater;
    }

    public m(b0 client, d0 originalRequest, boolean z10) {
        kotlin.jvm.internal.s.h(client, "client");
        kotlin.jvm.internal.s.h(originalRequest, "originalRequest");
        this.f44773a = client;
        this.f44774b = originalRequest;
        this.f44775c = z10;
        this.f44776d = client.j().a();
        this.f44777e = client.o().a(this);
        d dVar = new d();
        dVar.g(client.f(), TimeUnit.MILLISECONDS);
        this.f44778f = dVar;
        this.f44779g = new AtomicBoolean();
        this.f44789q = true;
        this.f44792t = new CopyOnWriteArrayList();
        this.f44793u = new AtomicReference(originalRequest.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String A() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "canceled " : "");
        sb2.append(this.f44775c ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb2.append(" to ");
        sb2.append(v());
        return sb2.toString();
    }

    private final IOException e(IOException iOException) {
        Socket socketW;
        boolean z10 = hn.p.f40722b;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        n nVar = this.f44782j;
        if (nVar != null) {
            if (z10 && Thread.holdsLock(nVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + nVar);
            }
            synchronized (nVar) {
                socketW = w();
            }
            if (this.f44782j == null) {
                if (socketW != null) {
                    hn.p.h(socketW);
                }
                this.f44777e.l(this, nVar);
                nVar.f().g(nVar, this);
                if (socketW != null) {
                    nVar.f().f(nVar);
                }
            } else if (socketW != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionZ = z(iOException);
        if (iOException == null) {
            this.f44777e.d(this);
            return iOExceptionZ;
        }
        gn.s sVar = this.f44777e;
        kotlin.jvm.internal.s.e(iOExceptionZ);
        sVar.e(this, iOExceptionZ);
        return iOExceptionZ;
    }

    private final void f() {
        this.f44780h = okhttp3.internal.platform.c.f48992a.e().k("response.body().close()");
        this.f44777e.f(this);
    }

    public static /* synthetic */ IOException t(m mVar, h hVar, boolean z10, boolean z11, boolean z12, boolean z13, IOException iOException, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        if ((i10 & 16) != 0) {
            z13 = false;
        }
        return mVar.s(hVar, z10, z11, z12, z13, iOException);
    }

    private final IOException z(IOException iOException) {
        if (this.f44783k || !this.f44778f.t()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void B() {
        y();
        synchronized (this) {
            if (this.f44791s == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f44787o || this.f44788p) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f44785m) {
                throw new IllegalStateException("Check failed.");
            }
            if (!this.f44786n) {
                throw new IllegalStateException("Check failed.");
            }
            this.f44786n = false;
            this.f44787o = true;
            this.f44788p = true;
            g0 g0Var = g0.f38750a;
        }
    }

    @Override // gn.e
    public void a(gn.f responseCallback) {
        kotlin.jvm.internal.s.h(responseCallback, "responseCallback");
        if (!this.f44779g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        f();
        this.f44773a.m().a(new a(this, responseCallback));
    }

    public final void d(n connection) {
        kotlin.jvm.internal.s.h(connection, "connection");
        if (!hn.p.f40722b || Thread.holdsLock(connection)) {
            if (this.f44782j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f44782j = connection;
            connection.e().add(new b(this, this.f44780h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // gn.e
    public f0 execute() {
        if (!this.f44779g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f44778f.s();
        f();
        try {
            this.f44773a.m().b(this);
            return q();
        } finally {
            this.f44773a.m().f(this);
        }
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public gn.e clone() {
        return new m(this.f44773a, this.f44774b, this.f44775c);
    }

    public final void h(d0 request, boolean z10, mn.g chain) {
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(chain, "chain");
        if (this.f44784l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f44786n) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f44785m || this.f44788p || this.f44787o) {
                throw new IllegalStateException("Check failed.");
            }
            g0 g0Var = g0.f38750a;
        }
        if (z10) {
            p pVar = new p(this.f44773a.u(), chain.q().a(), chain.w(), chain.A(), chain.p(), chain.w(), this.f44773a.y(), chain.f(), this.f44773a.p(), chain.k(request.m()), this.f44773a.s(), this, request);
            this.f44781i = this.f44773a.p() ? new k(pVar, this.f44773a.u()) : new v(pVar);
        }
    }

    public final void i(boolean z10) {
        h hVar;
        synchronized (this) {
            if (!this.f44789q) {
                throw new IllegalStateException("released");
            }
            g0 g0Var = g0.f38750a;
        }
        if (z10 && (hVar = this.f44791s) != null) {
            hVar.f();
        }
        this.f44784l = null;
    }

    @Override // gn.e
    public boolean isCanceled() {
        return this.f44790r;
    }

    public final b0 j() {
        return this.f44773a;
    }

    public final n k() {
        return this.f44782j;
    }

    public final gn.s l() {
        return this.f44777e;
    }

    public final boolean m() {
        return this.f44775c;
    }

    public final h n() {
        return this.f44784l;
    }

    public final d0 o() {
        return this.f44774b;
    }

    public final CopyOnWriteArrayList p() {
        return this.f44792t;
    }

    public final f0 q() {
        ArrayList arrayList = new ArrayList();
        gl.r.z(arrayList, this.f44773a.w());
        arrayList.add(new mn.j());
        arrayList.add(new mn.a());
        arrayList.add(new jn.a());
        arrayList.add(ln.c.f44707a);
        if (!this.f44775c) {
            gl.r.z(arrayList, this.f44773a.x());
        }
        arrayList.add(mn.b.f46475a);
        try {
            try {
                f0 f0VarC = new mn.g(this, arrayList, 0, null, this.f44774b, null, 32, null).c(this.f44774b);
                if (isCanceled()) {
                    hn.m.f(f0VarC);
                    throw new IOException("Canceled");
                }
                u(null);
                return f0VarC;
            } catch (IOException e10) {
                IOException iOExceptionU = u(e10);
                kotlin.jvm.internal.s.f(iOExceptionU, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionU;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                u(null);
            }
            throw th2;
        }
    }

    public final h r(mn.g chain) throws IOException {
        kotlin.jvm.internal.s.h(chain, "chain");
        synchronized (this) {
            if (!this.f44789q) {
                throw new IllegalStateException("released");
            }
            if (this.f44786n || this.f44785m || this.f44788p || this.f44787o) {
                throw new IllegalStateException("Check failed.");
            }
            g0 g0Var = g0.f38750a;
        }
        i iVar = this.f44781i;
        kotlin.jvm.internal.s.e(iVar);
        h hVar = new h(this, iVar, iVar.a().o(this.f44773a, chain));
        this.f44784l = hVar;
        this.f44791s = hVar;
        synchronized (this) {
            this.f44785m = true;
            this.f44786n = true;
        }
        if (this.f44790r) {
            throw new IOException("Canceled");
        }
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002f A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:8:0x0013, B:23:0x002f, B:25:0x0033, B:27:0x0037, B:29:0x003b, B:30:0x003d, B:32:0x0042, B:34:0x0046, B:36:0x004a, B:41:0x0053, B:46:0x005d, B:14:0x001d, B:17:0x0023, B:20:0x0029), top: B:58:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0033 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:8:0x0013, B:23:0x002f, B:25:0x0033, B:27:0x0037, B:29:0x003b, B:30:0x003d, B:32:0x0042, B:34:0x0046, B:36:0x004a, B:41:0x0053, B:46:0x005d, B:14:0x001d, B:17:0x0023, B:20:0x0029), top: B:58:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0037 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:8:0x0013, B:23:0x002f, B:25:0x0033, B:27:0x0037, B:29:0x003b, B:30:0x003d, B:32:0x0042, B:34:0x0046, B:36:0x004a, B:41:0x0053, B:46:0x005d, B:14:0x001d, B:17:0x0023, B:20:0x0029), top: B:58:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x003b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:8:0x0013, B:23:0x002f, B:25:0x0033, B:27:0x0037, B:29:0x003b, B:30:0x003d, B:32:0x0042, B:34:0x0046, B:36:0x004a, B:41:0x0053, B:46:0x005d, B:14:0x001d, B:17:0x0023, B:20:0x0029), top: B:58:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0050  */
    public final IOException s(h exchange, boolean z10, boolean z11, boolean z12, boolean z13, IOException iOException) {
        boolean z14;
        boolean z15;
        boolean z16;
        kotlin.jvm.internal.s.h(exchange, "exchange");
        if (kotlin.jvm.internal.s.c(exchange, this.f44791s)) {
            synchronized (this) {
                z14 = false;
                if (z10) {
                    try {
                        if (this.f44785m) {
                            if (z10) {
                                this.f44785m = false;
                            }
                            if (z11) {
                                this.f44786n = false;
                            }
                            if (z13) {
                                this.f44787o = false;
                            }
                            if (z12) {
                                this.f44788p = false;
                            }
                            if (this.f44785m) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                z14 = true;
                            }
                            boolean z17 = z16;
                            z15 = z14;
                            z14 = z17;
                        } else if ((!z11 && this.f44786n) || ((z13 && this.f44787o) || (z12 && this.f44788p))) {
                            if (z10) {
                                this.f44785m = false;
                            }
                            if (z11) {
                                this.f44786n = false;
                            }
                            if (z13) {
                                this.f44787o = false;
                            }
                            if (z12) {
                                this.f44788p = false;
                            }
                            if (this.f44785m || this.f44786n || this.f44787o || this.f44788p) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            if (z16 && !this.f44789q) {
                                z14 = true;
                            }
                            boolean z18 = z16;
                            z15 = z14;
                            z14 = z18;
                        }
                        g0 g0Var = g0.f38750a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    z15 = !z11 ? false : false;
                    g0 g0Var2 = g0.f38750a;
                }
            }
            if (z14) {
                this.f44791s = null;
                n nVar = this.f44782j;
                if (nVar != null) {
                    nVar.k();
                }
            }
            if (z15) {
                return e(iOException);
            }
        }
        return iOException;
    }

    public final IOException u(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f44789q) {
                    this.f44789q = false;
                    if (!this.f44785m && !this.f44786n && !this.f44787o && !this.f44788p) {
                        z10 = true;
                    }
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? e(iOException) : iOException;
    }

    public final String v() {
        return this.f44774b.m().n();
    }

    public final Socket w() {
        n nVar = this.f44782j;
        kotlin.jvm.internal.s.e(nVar);
        if (hn.p.f40722b && !Thread.holdsLock(nVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + nVar);
        }
        List listE = nVar.e();
        Iterator it = listE.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (kotlin.jvm.internal.s.c(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listE.remove(i10);
        this.f44782j = null;
        if (listE.isEmpty()) {
            nVar.s(System.nanoTime());
            if (this.f44776d.c(nVar)) {
                return nVar.u();
            }
        }
        return null;
    }

    public final boolean x() {
        h hVar = this.f44791s;
        if (hVar == null || !hVar.l()) {
            return false;
        }
        i iVar = this.f44781i;
        kotlin.jvm.internal.s.e(iVar);
        t tVarB = iVar.b();
        h hVar2 = this.f44791s;
        return tVarB.f(hVar2 != null ? hVar2.j() : null);
    }

    public final void y() {
        if (this.f44783k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f44783k = true;
        this.f44778f.t();
    }

    @Override // gn.e
    public void cancel() {
        if (this.f44790r) {
            return;
        }
        this.f44790r = true;
        h hVar = this.f44791s;
        if (hVar != null) {
            hVar.d();
        }
        Iterator it = this.f44792t.iterator();
        kotlin.jvm.internal.s.g(it, OGoz.slvUdeycykz);
        while (it.hasNext()) {
            ((t.b) it.next()).cancel();
        }
        this.f44777e.g(this);
    }
}
