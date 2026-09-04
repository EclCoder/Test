package ln;

import gn.d0;
import gn.e0;
import gn.f0;
import gn.g0;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import xn.c0;
import xn.o0;
import xn.p0;
import xn.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f44739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f44740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mn.d f44741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44743e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a extends xn.n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f44744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f44745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f44746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f44747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f44748f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f44749g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f44750h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, o0 delegate, long j10, boolean z10) {
            super(delegate);
            kotlin.jvm.internal.s.h(delegate, "delegate");
            this.f44750h = hVar;
            this.f44744b = j10;
            this.f44745c = z10;
            this.f44748f = z10;
        }

        private final IOException a(IOException iOException) {
            if (this.f44746d) {
                return iOException;
            }
            this.f44746d = true;
            return h.c(this.f44750h, this.f44747e, this.f44745c, false, true, iOException, 4, null);
        }

        @Override // xn.n, xn.o0
        public void W(xn.e source, long j10) throws IOException {
            kotlin.jvm.internal.s.h(source, "source");
            if (this.f44749g) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f44744b;
            if (j11 != -1 && this.f44747e + j10 > j11) {
                throw new ProtocolException("expected " + this.f44744b + " bytes but received " + (this.f44747e + j10));
            }
            try {
                if (this.f44748f) {
                    this.f44748f = false;
                    this.f44750h.i().l().u(this.f44750h.i());
                }
                super.W(source, j10);
                this.f44747e += j10;
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                kotlin.jvm.internal.s.e(iOExceptionA);
                throw iOExceptionA;
            }
        }

        @Override // xn.n, xn.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f44749g) {
                return;
            }
            this.f44749g = true;
            long j10 = this.f44744b;
            if (j10 != -1 && this.f44747e != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                kotlin.jvm.internal.s.e(iOExceptionA);
                throw iOExceptionA;
            }
        }

        @Override // xn.n, xn.o0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                kotlin.jvm.internal.s.e(iOExceptionA);
                throw iOExceptionA;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class b extends xn.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f44751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f44752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f44753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f44754d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f44755e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f44756f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h f44757g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, q0 delegate, long j10, boolean z10) {
            super(delegate);
            kotlin.jvm.internal.s.h(delegate, "delegate");
            this.f44757g = hVar;
            this.f44751a = j10;
            this.f44752b = z10;
            this.f44754d = true;
            if (j10 == 0) {
                a(null);
            }
        }

        public final IOException a(IOException iOException) {
            if (this.f44755e) {
                return iOException;
            }
            this.f44755e = true;
            if (iOException == null && this.f44754d) {
                this.f44754d = false;
                this.f44757g.i().l().z(this.f44757g.i());
            }
            return h.c(this.f44757g, this.f44753c, this.f44752b, true, false, iOException, 8, null);
        }

        @Override // xn.o, xn.q0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f44756f) {
                return;
            }
            this.f44756f = true;
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                kotlin.jvm.internal.s.e(iOExceptionA);
                throw iOExceptionA;
            }
        }

        @Override // xn.o, xn.q0
        public long read(xn.e sink, long j10) throws IOException {
            kotlin.jvm.internal.s.h(sink, "sink");
            if (this.f44756f) {
                throw new IllegalStateException("closed");
            }
            try {
                long j11 = delegate().read(sink, j10);
                if (this.f44754d) {
                    this.f44754d = false;
                    this.f44757g.i().l().z(this.f44757g.i());
                }
                if (j11 == -1) {
                    a(null);
                    return -1L;
                }
                long j12 = this.f44753c + j11;
                long j13 = this.f44751a;
                if (j13 != -1 && j12 > j13) {
                    throw new ProtocolException("expected " + this.f44751a + " bytes but received " + j12);
                }
                this.f44753c = j12;
                if (this.f44757g.f44741c.d()) {
                    a(null);
                }
                return j11;
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                kotlin.jvm.internal.s.e(iOExceptionA);
                throw iOExceptionA;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f44758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f44759b;

        c() {
            this.f44758a = new a(h.this, h.this.f44741c.h().b(), -1L, true);
            this.f44759b = new b(h.this, h.this.f44741c.h().a(), -1L, true);
        }

        @Override // xn.p0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a b() {
            return this.f44758a;
        }

        @Override // xn.p0
        public void cancel() {
            h.this.d();
        }

        @Override // xn.p0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return this.f44759b;
        }
    }

    public h(m call, i finder, mn.d codec) {
        kotlin.jvm.internal.s.h(call, "call");
        kotlin.jvm.internal.s.h(finder, "finder");
        kotlin.jvm.internal.s.h(codec, "codec");
        this.f44739a = call;
        this.f44740b = finder;
        this.f44741c = codec;
    }

    public static /* synthetic */ IOException c(h hVar, long j10, boolean z10, boolean z11, boolean z12, IOException iOException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = -1;
        }
        return hVar.b(j10, z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, iOException);
    }

    private final void u(IOException iOException) {
        this.f44743e = true;
        this.f44741c.i().x(this.f44739a, iOException);
    }

    public final IOException b(long j10, boolean z10, boolean z11, boolean z12, IOException iOException) {
        if (iOException != null) {
            u(iOException);
        }
        if (z12) {
            if (iOException != null) {
                this.f44739a.l().v(this.f44739a, iOException);
            } else {
                this.f44739a.l().t(this.f44739a, j10);
            }
        }
        if (z11) {
            if (iOException != null) {
                this.f44739a.l().A(this.f44739a, iOException);
            } else {
                this.f44739a.l().y(this.f44739a, j10);
            }
        }
        return this.f44739a.s(this, z12 && !z10, z11 && !z10, z11 && z10, z12 && z10, iOException);
    }

    public final void d() {
        this.f44741c.cancel();
    }

    public final o0 e(d0 request, boolean z10) {
        kotlin.jvm.internal.s.h(request, "request");
        this.f44742d = z10;
        e0 e0VarA = request.a();
        kotlin.jvm.internal.s.e(e0VarA);
        long jContentLength = e0VarA.contentLength();
        this.f44739a.l().u(this.f44739a);
        return new a(this, this.f44741c.c(request, jContentLength), jContentLength, false);
    }

    public final void f() {
        this.f44741c.cancel();
        this.f44739a.s(this, true, true, true, true, null);
    }

    public final void g() {
        try {
            this.f44741c.a();
        } catch (IOException e10) {
            this.f44739a.l().v(this.f44739a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void h() {
        try {
            this.f44741c.g();
        } catch (IOException e10) {
            this.f44739a.l().v(this.f44739a, e10);
            u(e10);
            throw e10;
        }
    }

    public final m i() {
        return this.f44739a;
    }

    public final n j() {
        mn.d.a aVarI = this.f44741c.i();
        n nVar = aVarI instanceof n ? (n) aVarI : null;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public final i k() {
        return this.f44740b;
    }

    public final boolean l() {
        return this.f44743e;
    }

    public final boolean m() {
        return !kotlin.jvm.internal.s.c(this.f44740b.b().a().l().g(), this.f44741c.i().v().a().l().g());
    }

    public final boolean n() {
        return this.f44742d;
    }

    public final void o() {
        this.f44741c.i().w();
    }

    public final void p() {
        m.t(this.f44739a, this, true, false, false, false, null, 28, null);
    }

    public final g0 q(f0 response) {
        h hVar;
        kotlin.jvm.internal.s.h(response, "response");
        try {
            String strC0 = f0.c0(response, "Content-Type", null, 2, null);
            long jB = this.f44741c.b(response);
            hVar = this;
            try {
                return new mn.h(strC0, jB, c0.c(new b(hVar, this.f44741c.j(response), jB, false)));
            } catch (IOException e10) {
                e = e10;
                IOException iOException = e;
                hVar.f44739a.l().A(hVar.f44739a, iOException);
                u(iOException);
                throw iOException;
            }
        } catch (IOException e11) {
            e = e11;
            hVar = this;
        }
    }

    public final f0.a r(boolean z10) {
        try {
            f0.a aVarF = this.f44741c.f(z10);
            if (aVarF == null) {
                return aVarF;
            }
            aVarF.k(this);
            return aVarF;
        } catch (IOException e10) {
            this.f44739a.l().A(this.f44739a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void s(f0 response) {
        kotlin.jvm.internal.s.h(response, "response");
        this.f44739a.l().B(this.f44739a, response);
    }

    public final void t() {
        this.f44739a.l().C(this.f44739a);
    }

    public final p0 v() throws SocketException {
        this.f44739a.B();
        mn.d.a aVarI = this.f44741c.i();
        kotlin.jvm.internal.s.f(aVarI, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        ((n) aVarI).B();
        return new c();
    }

    public final void w(d0 request) {
        kotlin.jvm.internal.s.h(request, "request");
        try {
            this.f44739a.l().x(this.f44739a);
            this.f44741c.e(request);
            this.f44739a.l().w(this.f44739a, request);
        } catch (IOException e10) {
            this.f44739a.l().v(this.f44739a, e10);
            u(e10);
            throw e10;
        }
    }
}
