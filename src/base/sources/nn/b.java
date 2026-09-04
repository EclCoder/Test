package nn;

import bm.r;
import gn.b0;
import gn.d0;
import gn.e0;
import gn.f0;
import gn.o;
import gn.x;
import gn.y;
import hn.m;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import mn.i;
import mn.k;
import xn.o0;
import xn.p;
import xn.q0;
import xn.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements mn.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f47860g = new d(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final x f47861h = x.f39772b.b("OkHttp-Response-Body", "Truncated");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f47862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mn.d.a f47863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ln.a f47864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nn.a f47866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x f47867f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private abstract class a implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f47868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p f47869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f47870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f47871d;

        public a(b bVar, y url) {
            s.h(url, "url");
            this.f47871d = bVar;
            this.f47868a = url;
            this.f47869b = new p(bVar.h().a().timeout());
        }

        protected final boolean d() {
            return this.f47870c;
        }

        public final void h(x trailers) {
            b0 b0Var;
            o oVarL;
            s.h(trailers, "trailers");
            if (this.f47871d.f47865d == 6) {
                return;
            }
            if (this.f47871d.f47865d != 5) {
                throw new IllegalStateException("state: " + this.f47871d.f47865d);
            }
            this.f47871d.r(this.f47869b);
            this.f47871d.f47867f = trailers;
            this.f47871d.f47865d = 6;
            if (trailers.size() <= 0 || (b0Var = this.f47871d.f47862a) == null || (oVarL = b0Var.l()) == null) {
                return;
            }
            mn.e.f(oVarL, this.f47868a, trailers);
        }

        protected final void i(boolean z10) {
            this.f47870c = z10;
        }

        @Override // xn.q0
        public long read(xn.e sink, long j10) throws IOException {
            s.h(sink, "sink");
            try {
                return this.f47871d.h().a().read(sink, j10);
            } catch (IOException e10) {
                this.f47871d.i().w();
                h(b.f47861h);
                throw e10;
            }
        }

        @Override // xn.q0
        public r0 timeout() {
            return this.f47869b;
        }
    }

    /* JADX INFO: renamed from: nn.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class C0735b implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f47872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f47873b;

        public C0735b() {
            this.f47872a = new p(b.this.h().b().timeout());
        }

        @Override // xn.o0
        public void W(xn.e source, long j10) {
            s.h(source, "source");
            if (this.f47873b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            xn.f fVarB = b.this.h().b();
            fVarB.A0(j10);
            fVarB.N("\r\n");
            fVarB.W(source, j10);
            fVarB.N("\r\n");
        }

        @Override // xn.o0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f47873b) {
                return;
            }
            this.f47873b = true;
            b.this.h().b().N("0\r\n\r\n");
            b.this.r(this.f47872a);
            b.this.f47865d = 3;
        }

        @Override // xn.o0, java.io.Flushable
        public synchronized void flush() {
            if (this.f47873b) {
                return;
            }
            b.this.h().b().flush();
        }

        @Override // xn.o0
        public r0 timeout() {
            return this.f47872a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f47875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f47876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f47877g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, y url) {
            super(bVar, url);
            s.h(url, "url");
            this.f47877g = bVar;
            this.f47875e = -1L;
            this.f47876f = true;
        }

        private final void k() throws ProtocolException {
            if (this.f47875e != -1) {
                this.f47877g.h().a().R();
            }
            try {
                this.f47875e = this.f47877g.h().a().R0();
                String string = r.V0(this.f47877g.h().a().R()).toString();
                if (this.f47875e >= 0 && (string.length() <= 0 || r.N(string, ";", false, 2, null))) {
                    if (this.f47875e == 0) {
                        this.f47876f = false;
                        h(this.f47877g.f47866e.a());
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f47875e + string + '\"');
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (d()) {
                return;
            }
            if (this.f47876f && !hn.p.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f47877g.i().w();
                h(b.f47861h);
            }
            i(true);
        }

        @Override // nn.b.a, xn.q0
        public long read(xn.e sink, long j10) throws IOException {
            s.h(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (d()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f47876f) {
                return -1L;
            }
            long j11 = this.f47875e;
            if (j11 == 0 || j11 == -1) {
                k();
                if (!this.f47876f) {
                    return -1L;
                }
            }
            long j12 = super.read(sink, Math.min(j10, this.f47875e));
            if (j12 != -1) {
                this.f47875e -= j12;
                return j12;
            }
            this.f47877g.i().w();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            h(b.f47861h);
            throw protocolException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f47878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f47879f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar, y url, long j10) {
            super(bVar, url);
            s.h(url, "url");
            this.f47879f = bVar;
            this.f47878e = j10;
            if (j10 == 0) {
                h(x.f39773c);
            }
        }

        @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (d()) {
                return;
            }
            if (this.f47878e != 0 && !hn.p.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f47879f.i().w();
                h(b.f47861h);
            }
            i(true);
        }

        @Override // nn.b.a, xn.q0
        public long read(xn.e sink, long j10) throws IOException {
            s.h(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (d()) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f47878e;
            if (j11 == 0) {
                return -1L;
            }
            long j12 = super.read(sink, Math.min(j11, j10));
            if (j12 == -1) {
                this.f47879f.i().w();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                h(b.f47861h);
                throw protocolException;
            }
            long j13 = this.f47878e - j12;
            this.f47878e = j13;
            if (j13 == 0) {
                h(x.f39773c);
            }
            return j12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class f implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f47880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f47881b;

        public f() {
            this.f47880a = new p(b.this.h().b().timeout());
        }

        @Override // xn.o0
        public void W(xn.e source, long j10) {
            s.h(source, "source");
            if (this.f47881b) {
                throw new IllegalStateException("closed");
            }
            m.e(source.size(), 0L, j10);
            b.this.h().b().W(source, j10);
        }

        @Override // xn.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f47881b) {
                return;
            }
            this.f47881b = true;
            b.this.r(this.f47880a);
            b.this.f47865d = 3;
        }

        @Override // xn.o0, java.io.Flushable
        public void flush() {
            if (this.f47881b) {
                return;
            }
            b.this.h().b().flush();
        }

        @Override // xn.o0
        public r0 timeout() {
            return this.f47880a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class g extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f47883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f47884f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b bVar, y url) {
            super(bVar, url);
            s.h(url, "url");
            this.f47884f = bVar;
        }

        @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (d()) {
                return;
            }
            if (!this.f47883e) {
                h(b.f47861h);
            }
            i(true);
        }

        @Override // nn.b.a, xn.q0
        public long read(xn.e sink, long j10) throws IOException {
            s.h(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (d()) {
                throw new IllegalStateException("closed");
            }
            if (this.f47883e) {
                return -1L;
            }
            long j11 = super.read(sink, j10);
            if (j11 != -1) {
                return j11;
            }
            this.f47883e = true;
            h(x.f39773c);
            return -1L;
        }
    }

    public b(b0 b0Var, mn.d.a carrier, ln.a socket) {
        s.h(carrier, "carrier");
        s.h(socket, "socket");
        this.f47862a = b0Var;
        this.f47863b = carrier;
        this.f47864c = socket;
        this.f47866e = new nn.a(h().a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(p pVar) {
        r0 r0VarI = pVar.i();
        pVar.j(r0.f56980e);
        r0VarI.a();
        r0VarI.b();
    }

    private final boolean t(d0 d0Var) {
        return r.A("chunked", d0Var.e("Transfer-Encoding"), true);
    }

    private final boolean u(f0 f0Var) {
        return r.A("chunked", f0.c0(f0Var, "Transfer-Encoding", null, 2, null), true);
    }

    private final o0 v() {
        if (this.f47865d == 1) {
            this.f47865d = 2;
            return new C0735b();
        }
        throw new IllegalStateException(("state: " + this.f47865d).toString());
    }

    private final q0 w(y yVar) {
        if (this.f47865d == 4) {
            this.f47865d = 5;
            return new c(this, yVar);
        }
        throw new IllegalStateException(("state: " + this.f47865d).toString());
    }

    private final q0 x(y yVar, long j10) {
        if (this.f47865d == 4) {
            this.f47865d = 5;
            return new e(this, yVar, j10);
        }
        throw new IllegalStateException(("state: " + this.f47865d).toString());
    }

    private final o0 y() {
        if (this.f47865d == 1) {
            this.f47865d = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f47865d).toString());
    }

    private final q0 z(y yVar) {
        if (this.f47865d == 4) {
            this.f47865d = 5;
            i().w();
            return new g(this, yVar);
        }
        throw new IllegalStateException(("state: " + this.f47865d).toString());
    }

    public final void A(f0 response) {
        s.h(response, "response");
        long jK = hn.p.k(response);
        if (jK == -1) {
            return;
        }
        q0 q0VarX = x(response.U0().m(), jK);
        hn.p.o(q0VarX, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        q0VarX.close();
    }

    public final void B(x headers, String requestLine) {
        s.h(headers, "headers");
        s.h(requestLine, "requestLine");
        if (this.f47865d != 0) {
            throw new IllegalStateException(("state: " + this.f47865d).toString());
        }
        h().b().N(requestLine).N("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            h().b().N(headers.d(i10)).N(": ").N(headers.h(i10)).N("\r\n");
        }
        h().b().N("\r\n");
        this.f47865d = 1;
    }

    @Override // mn.d
    public void a() {
        h().b().flush();
    }

    @Override // mn.d
    public long b(f0 response) {
        s.h(response, "response");
        if (!mn.e.b(response)) {
            return 0L;
        }
        if (u(response)) {
            return -1L;
        }
        return hn.p.k(response);
    }

    @Override // mn.d
    public o0 c(d0 request, long j10) throws ProtocolException {
        s.h(request, "request");
        e0 e0VarA = request.a();
        if (e0VarA != null && e0VarA.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (t(request)) {
            return v();
        }
        if (j10 != -1) {
            return y();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // mn.d
    public void cancel() {
        i().cancel();
    }

    @Override // mn.d
    public boolean d() {
        return this.f47865d == 6;
    }

    @Override // mn.d
    public void e(d0 request) {
        s.h(request, "request");
        i iVar = i.f46511a;
        Proxy.Type type = i().v().b().type();
        s.g(type, "type(...)");
        B(request.f(), iVar.a(request, type));
    }

    @Override // mn.d
    public f0.a f(boolean z10) throws IOException {
        int i10 = this.f47865d;
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f47865d).toString());
        }
        try {
            k kVarA = k.f46513d.a(this.f47866e.b());
            f0.a aVarJ = new f0.a().o(kVarA.f46514a).f(kVarA.f46515b).l(kVarA.f46516c).j(this.f47866e.a());
            if (z10 && kVarA.f46515b == 100) {
                return null;
            }
            int i11 = kVarA.f46515b;
            if (i11 == 100) {
                this.f47865d = 3;
                return aVarJ;
            }
            if (102 > i11 || i11 >= 200) {
                this.f47865d = 4;
                return aVarJ;
            }
            this.f47865d = 3;
            return aVarJ;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + i().v().a().l().n(), e10);
        }
    }

    @Override // mn.d
    public void g() {
        h().b().flush();
    }

    @Override // mn.d
    public mn.d.a i() {
        return this.f47863b;
    }

    @Override // mn.d
    public q0 j(f0 response) {
        s.h(response, "response");
        if (!mn.e.b(response)) {
            return x(response.U0().m(), 0L);
        }
        if (u(response)) {
            return w(response.U0().m());
        }
        long jK = hn.p.k(response);
        return jK != -1 ? x(response.U0().m(), jK) : z(response.U0().m());
    }

    @Override // mn.d
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public ln.a h() {
        return this.f47864c;
    }
}
