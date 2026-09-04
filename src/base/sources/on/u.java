package on;

import f8.Ygx.FuoITeVPeXAj;
import fl.g0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.StreamResetException;
import xn.o0;
import xn.p0;
import xn.q0;
import xn.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class u implements p0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f49149n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f49151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pn.a f49152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f49153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f49154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f49155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f49157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f49158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f49159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f49160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private on.a f49161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IOException f49162m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class b implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f49163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final xn.e f49164b = new xn.e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private gn.x f49165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f49166d;

        public b(boolean z10) {
            this.f49163a = z10;
        }

        private final void a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            u uVar = u.this;
            synchronized (uVar) {
                try {
                    uVar.u().s();
                    while (uVar.t() >= uVar.s() && !this.f49163a && !this.f49166d && uVar.l() == null) {
                        try {
                            uVar.E();
                        } catch (Throwable th2) {
                            uVar.u().A();
                            throw th2;
                        }
                    }
                    uVar.u().A();
                    uVar.f();
                    jMin = Math.min(uVar.s() - uVar.t(), this.f49164b.size());
                    uVar.C(uVar.t() + jMin);
                    z11 = z10 && jMin == this.f49164b.size();
                    g0 g0Var = g0.f38750a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            u.this.u().s();
            try {
                u.this.k().D1(u.this.n(), z11, this.f49164b, jMin);
            } finally {
                u.this.u().A();
            }
        }

        @Override // xn.o0
        public void W(xn.e source, long j10) throws IOException {
            kotlin.jvm.internal.s.h(source, "source");
            u uVar = u.this;
            if (!hn.p.f40722b || !Thread.holdsLock(uVar)) {
                this.f49164b.W(source, j10);
                while (this.f49164b.size() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + uVar);
            }
        }

        @Override // xn.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            u uVar = u.this;
            if (hn.p.f40722b && Thread.holdsLock(uVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + uVar);
            }
            u uVar2 = u.this;
            synchronized (uVar2) {
                if (this.f49166d) {
                    return;
                }
                boolean z10 = uVar2.l() == null;
                g0 g0Var = g0.f38750a;
                if (!u.this.b().f49163a) {
                    boolean z11 = this.f49164b.size() > 0;
                    if (this.f49165c != null) {
                        while (this.f49164b.size() > 0) {
                            a(false);
                        }
                        n nVarK = u.this.k();
                        int iN = u.this.n();
                        gn.x xVar = this.f49165c;
                        kotlin.jvm.internal.s.e(xVar);
                        nVarK.E1(iN, z10, hn.p.r(xVar));
                    } else if (z11) {
                        while (this.f49164b.size() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        u.this.k().D1(u.this.n(), true, null, 0L);
                    }
                }
                u uVar3 = u.this;
                synchronized (uVar3) {
                    this.f49166d = true;
                    kotlin.jvm.internal.s.f(uVar3, "null cannot be cast to non-null type java.lang.Object");
                    uVar3.notifyAll();
                    g0 g0Var2 = g0.f38750a;
                }
                u.this.k().flush();
                u.this.e();
            }
        }

        public final boolean d() {
            return this.f49166d;
        }

        @Override // xn.o0, java.io.Flushable
        public void flush() throws IOException {
            u uVar = u.this;
            if (hn.p.f40722b && Thread.holdsLock(uVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + uVar);
            }
            u uVar2 = u.this;
            synchronized (uVar2) {
                uVar2.f();
                g0 g0Var = g0.f38750a;
            }
            while (this.f49164b.size() > 0) {
                a(false);
                u.this.k().flush();
            }
        }

        public final boolean h() {
            return this.f49163a;
        }

        @Override // xn.o0
        public r0 timeout() {
            return u.this.u();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class c implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f49168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f49169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final xn.e f49170c = new xn.e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final xn.e f49171d = new xn.e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private gn.x f49172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f49173f;

        public c(long j10, boolean z10) {
            this.f49168a = j10;
            this.f49169b = z10;
        }

        private final void r(long j10) {
            u uVar = u.this;
            if (!hn.p.f40722b || !Thread.holdsLock(uVar)) {
                u.this.k().C1(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + uVar);
        }

        @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            u uVar = u.this;
            synchronized (uVar) {
                this.f49173f = true;
                size = this.f49171d.size();
                this.f49171d.k();
                kotlin.jvm.internal.s.f(uVar, "null cannot be cast to non-null type java.lang.Object");
                uVar.notifyAll();
                g0 g0Var = g0.f38750a;
            }
            if (size > 0) {
                r(size);
            }
            u.this.e();
        }

        public final boolean d() {
            return this.f49173f;
        }

        public final boolean h() {
            return this.f49169b;
        }

        public final xn.e k() {
            return this.f49171d;
        }

        public final void l(xn.g source, long j10) throws EOFException {
            boolean z10;
            boolean z11;
            kotlin.jvm.internal.s.h(source, "source");
            u uVar = u.this;
            if (hn.p.f40722b && Thread.holdsLock(uVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + uVar);
            }
            long j11 = j10;
            while (j11 > 0) {
                synchronized (u.this) {
                    z10 = this.f49169b;
                    z11 = this.f49171d.size() + j11 > this.f49168a;
                    g0 g0Var = g0.f38750a;
                }
                if (z11) {
                    source.skip(j11);
                    u.this.i(on.a.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.skip(j11);
                    return;
                }
                long j12 = source.read(this.f49170c, j11);
                if (j12 == -1) {
                    throw new EOFException();
                }
                j11 -= j12;
                u uVar2 = u.this;
                synchronized (uVar2) {
                    try {
                        if (this.f49173f) {
                            this.f49170c.k();
                        } else {
                            boolean z12 = this.f49171d.size() == 0;
                            this.f49171d.C0(this.f49170c);
                            if (z12) {
                                kotlin.jvm.internal.s.f(uVar2, "null cannot be cast to non-null type java.lang.Object");
                                uVar2.notifyAll();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            r(j10);
            u.this.k().Y0().a(u.this.n(), u.this.o(), this.f49171d.size());
        }

        public final void m(boolean z10) {
            this.f49169b = z10;
        }

        public final void q(gn.x xVar) {
            this.f49172e = xVar;
        }

        @Override // xn.q0
        public long read(xn.e sink, long j10) throws IOException {
            IOException iOExceptionM;
            boolean z10;
            long j11;
            kotlin.jvm.internal.s.h(sink, "sink");
            long j12 = 0;
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            while (true) {
                u uVar = u.this;
                synchronized (uVar) {
                    boolean zJ = uVar.j();
                    if (zJ) {
                        uVar.p().s();
                    }
                    try {
                        if (uVar.l() == null || this.f49169b) {
                            iOExceptionM = null;
                        } else {
                            iOExceptionM = uVar.m();
                            if (iOExceptionM == null) {
                                on.a aVarL = uVar.l();
                                kotlin.jvm.internal.s.e(aVarL);
                                iOExceptionM = new StreamResetException(aVarL);
                            }
                        }
                        if (this.f49173f) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.f49171d.size() > j12) {
                            xn.e eVar = this.f49171d;
                            j11 = eVar.read(sink, Math.min(j10, eVar.size()));
                            pn.a.c(uVar.o(), j11, 0L, 2, null);
                            long jA = uVar.o().a();
                            if (iOExceptionM == null && jA >= uVar.k().c1().c() / 2) {
                                uVar.k().K1(uVar.n(), jA);
                                pn.a.c(uVar.o(), 0L, jA, 1, null);
                            }
                        } else {
                            if (!this.f49169b && iOExceptionM == null) {
                                uVar.E();
                                z10 = true;
                            }
                            j11 = -1;
                        }
                        if (zJ) {
                            uVar.p().A();
                        }
                        g0 g0Var = g0.f38750a;
                    } catch (Throwable th2) {
                        if (zJ) {
                            uVar.p().A();
                        }
                        throw th2;
                    }
                    throw th;
                }
                u.this.k().Y0().a(u.this.n(), u.this.o(), this.f49171d.size());
                if (!z10) {
                    if (j11 != -1) {
                        return j11;
                    }
                    if (iOExceptionM == null) {
                        return -1L;
                    }
                    throw iOExceptionM;
                }
                j12 = 0;
            }
        }

        @Override // xn.q0
        public r0 timeout() {
            return u.this.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class d extends xn.c {
        public d() {
        }

        public final void A() throws IOException {
            if (t()) {
                throw v(null);
            }
        }

        @Override // xn.c
        protected IOException v(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // xn.c
        protected void z() {
            u.this.i(on.a.CANCEL);
            u.this.k().w1();
        }
    }

    public u(int i10, n connection, boolean z10, boolean z11, gn.x xVar) {
        kotlin.jvm.internal.s.h(connection, "connection");
        this.f49150a = i10;
        this.f49151b = connection;
        this.f49152c = new pn.a(i10);
        this.f49154e = connection.d1().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f49155f = arrayDeque;
        this.f49157h = new c(connection.c1().c(), z11);
        this.f49158i = new b(z10);
        this.f49159j = new d();
        this.f49160k = new d();
        if (xVar == null) {
            if (!v()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (v()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(xVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        return !this.f49151b.W0() || b().d() || b().h();
    }

    public final void A(gn.x headers, boolean z10) {
        boolean zW;
        kotlin.jvm.internal.s.h(headers, "headers");
        if (hn.p.f40722b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f49156g && headers.a(":status") == null && headers.a(":method") == null) {
                    a().q(headers);
                } else {
                    this.f49156g = true;
                    this.f49155f.add(headers);
                }
                if (z10) {
                    a().m(true);
                }
                zW = w();
                kotlin.jvm.internal.s.f(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zW) {
            return;
        }
        this.f49151b.u1(this.f49150a);
    }

    public final void B(on.a errorCode) {
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        synchronized (this) {
            try {
                if (l() == null) {
                    this.f49161l = errorCode;
                    kotlin.jvm.internal.s.f(this, "null cannot be cast to non-null type java.lang.Object");
                    notifyAll();
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void C(long j10) {
        this.f49153d = j10;
    }

    public final gn.x D(boolean z10) {
        gn.x xVar;
        synchronized (this) {
            while (this.f49155f.isEmpty() && l() == null) {
                try {
                    boolean z11 = z10 || j();
                    if (z11) {
                        this.f49159j.s();
                    }
                    try {
                        E();
                        if (z11) {
                            this.f49159j.A();
                        }
                    } catch (Throwable th2) {
                        if (z11) {
                            this.f49159j.A();
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.f49155f.isEmpty()) {
                IOException iOException = this.f49162m;
                if (iOException != null) {
                    throw iOException;
                }
                on.a aVarL = l();
                kotlin.jvm.internal.s.e(aVarL);
                throw new StreamResetException(aVarL);
            }
            Object objRemoveFirst = this.f49155f.removeFirst();
            kotlin.jvm.internal.s.g(objRemoveFirst, "removeFirst(...)");
            xVar = (gn.x) objRemoveFirst;
        }
        return xVar;
    }

    public final void E() throws InterruptedIOException {
        try {
            kotlin.jvm.internal.s.f(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final r0 F() {
        return this.f49160k;
    }

    @Override // xn.p0
    public void cancel() {
        i(on.a.CANCEL);
    }

    public final void d(long j10) {
        this.f49154e += j10;
        if (j10 > 0) {
            kotlin.jvm.internal.s.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void e() {
        boolean z10;
        boolean zW;
        if (hn.p.f40722b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !a().h() && a().d() && (b().h() || b().d());
                zW = w();
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            g(on.a.CANCEL, null);
        } else {
            if (zW) {
                return;
            }
            this.f49151b.u1(this.f49150a);
        }
    }

    public final void f() throws IOException {
        if (b().d()) {
            throw new IOException("stream closed");
        }
        if (b().h()) {
            throw new IOException("stream finished");
        }
        if (l() != null) {
            IOException iOException = this.f49162m;
            if (iOException != null) {
                throw iOException;
            }
            on.a aVarL = l();
            kotlin.jvm.internal.s.e(aVarL);
            throw new StreamResetException(aVarL);
        }
    }

    public final void g(on.a rstStatusCode, IOException iOException) {
        kotlin.jvm.internal.s.h(rstStatusCode, "rstStatusCode");
        if (h(rstStatusCode, iOException)) {
            this.f49151b.G1(this.f49150a, rstStatusCode);
        }
    }

    public final void i(on.a errorCode) {
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        if (h(errorCode, null)) {
            this.f49151b.I1(this.f49150a, errorCode);
        }
    }

    public final n k() {
        return this.f49151b;
    }

    public final on.a l() {
        on.a aVar;
        synchronized (this) {
            aVar = this.f49161l;
        }
        return aVar;
    }

    public final IOException m() {
        return this.f49162m;
    }

    public final int n() {
        return this.f49150a;
    }

    public final pn.a o() {
        return this.f49152c;
    }

    public final d p() {
        return this.f49159j;
    }

    @Override // xn.p0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public b b() {
        return this.f49158i;
    }

    @Override // xn.p0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public c a() {
        return this.f49157h;
    }

    public final long s() {
        return this.f49154e;
    }

    public final long t() {
        return this.f49153d;
    }

    public final d u() {
        return this.f49160k;
    }

    public final boolean v() {
        return this.f49151b.W0() == ((this.f49150a & 1) == 1);
    }

    public final boolean w() {
        synchronized (this) {
            try {
                if (l() != null) {
                    return false;
                }
                if (a().h() || a().d()) {
                    if ((b().h() || b().d()) && this.f49156g) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean x() {
        boolean z10;
        synchronized (this) {
            z10 = a().h() && a().k().n0();
        }
        return z10;
    }

    public final r0 y() {
        return this.f49159j;
    }

    public final void z(xn.g source, int i10) {
        kotlin.jvm.internal.s.h(source, "source");
        if (!hn.p.f40722b || !Thread.holdsLock(this)) {
            a().l(source, i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    private final boolean h(on.a aVar, IOException iOException) {
        if (hn.p.f40722b && Thread.holdsLock(this)) {
            throw new AssertionError(FuoITeVPeXAj.CkDCoD + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (l() != null) {
                return false;
            }
            this.f49161l = aVar;
            this.f49162m = iOException;
            kotlin.jvm.internal.s.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (a().h() && b().h()) {
                return false;
            }
            g0 g0Var = g0.f38750a;
            this.f49151b.u1(this.f49150a);
            return true;
        }
    }
}
