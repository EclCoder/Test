package gn;

import com.google.api.client.http.HttpStatusCodes;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import java.io.Closeable;
import java.util.List;
import xn.p0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class f0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f39579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f39580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f39581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f39583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f39584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g0 f39585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p0 f39586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f0 f39587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f0 f39588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f0 f39589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f39590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f39591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ln.h f39592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j0 f39593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f39594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f39595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f39596r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d0 f39597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c0 f39598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f39599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f39600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private w f39601e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private x.a f39602f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private g0 f39603g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private p0 f39604h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private f0 f39605i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f0 f39606j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private f0 f39607k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f39608l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f39609m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ln.h f39610n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private j0 f39611o;

        public a() {
            this.f39599c = -1;
            this.f39603g = g0.EMPTY;
            this.f39611o = j0.f39713b;
            this.f39602f = new x.a();
        }

        private final void e(String str, f0 f0Var) {
            if (f0Var != null) {
                if (f0Var.p0() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (f0Var.k() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (f0Var.K0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a b(g0 body) {
            kotlin.jvm.internal.s.h(body, "body");
            this.f39603g = body;
            return this;
        }

        public f0 c() {
            int i10 = this.f39599c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f39599c).toString());
            }
            d0 d0Var = this.f39597a;
            if (d0Var == null) {
                throw new IllegalStateException("request == null");
            }
            c0 c0Var = this.f39598b;
            if (c0Var == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f39600d;
            if (str != null) {
                return new f0(d0Var, c0Var, str, i10, this.f39601e, this.f39602f.d(), this.f39603g, this.f39604h, this.f39605i, this.f39606j, this.f39607k, this.f39608l, this.f39609m, this.f39610n, this.f39611o);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(f0 f0Var) {
            e("cacheResponse", f0Var);
            this.f39606j = f0Var;
            return this;
        }

        public a f(int i10) {
            this.f39599c = i10;
            return this;
        }

        public final int g() {
            return this.f39599c;
        }

        public a h(w wVar) {
            this.f39601e = wVar;
            return this;
        }

        public a i(String name, String value) {
            kotlin.jvm.internal.s.h(name, "name");
            kotlin.jvm.internal.s.h(value, "value");
            this.f39602f.h(name, value);
            return this;
        }

        public a j(x headers) {
            kotlin.jvm.internal.s.h(headers, "headers");
            this.f39602f = headers.f();
            return this;
        }

        public final void k(ln.h exchange) {
            kotlin.jvm.internal.s.h(exchange, "exchange");
            this.f39610n = exchange;
        }

        public a l(String message) {
            kotlin.jvm.internal.s.h(message, "message");
            this.f39600d = message;
            return this;
        }

        public a m(f0 f0Var) {
            e("networkResponse", f0Var);
            this.f39605i = f0Var;
            return this;
        }

        public a n(f0 f0Var) {
            this.f39607k = f0Var;
            return this;
        }

        public a o(c0 protocol) {
            kotlin.jvm.internal.s.h(protocol, "protocol");
            this.f39598b = protocol;
            return this;
        }

        public a p(long j10) {
            this.f39609m = j10;
            return this;
        }

        public a q(d0 request) {
            kotlin.jvm.internal.s.h(request, "request");
            this.f39597a = request;
            return this;
        }

        public a r(long j10) {
            this.f39608l = j10;
            return this;
        }

        public a s(p0 socket) {
            kotlin.jvm.internal.s.h(socket, "socket");
            this.f39604h = socket;
            return this;
        }

        public a t(j0 trailersSource) {
            kotlin.jvm.internal.s.h(trailersSource, "trailersSource");
            this.f39611o = trailersSource;
            return this;
        }

        public a a(String name, String str) {
            kotlin.jvm.internal.s.h(name, "name");
            kotlin.jvm.internal.s.h(str, KPtaxpyICj.NFrefahFiQmSc);
            this.f39602f.a(name, str);
            return this;
        }

        public a(f0 response) {
            kotlin.jvm.internal.s.h(response, "response");
            this.f39599c = -1;
            this.f39603g = g0.EMPTY;
            this.f39611o = j0.f39713b;
            this.f39597a = response.U0();
            this.f39598b = response.N0();
            this.f39599c = response.m();
            this.f39600d = response.m0();
            this.f39601e = response.r();
            this.f39602f = response.d0().f();
            this.f39603g = response.d();
            this.f39604h = response.W0();
            this.f39605i = response.p0();
            this.f39606j = response.k();
            this.f39607k = response.K0();
            this.f39608l = response.V0();
            this.f39609m = response.T0();
            this.f39610n = response.q();
            this.f39611o = response.f39593o;
        }
    }

    public f0(d0 request, c0 protocol, String message, int i10, w wVar, x headers, g0 body, p0 p0Var, f0 f0Var, f0 f0Var2, f0 f0Var3, long j10, long j11, ln.h hVar, j0 trailersSource) {
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(protocol, "protocol");
        kotlin.jvm.internal.s.h(message, "message");
        kotlin.jvm.internal.s.h(headers, "headers");
        kotlin.jvm.internal.s.h(body, "body");
        kotlin.jvm.internal.s.h(trailersSource, "trailersSource");
        this.f39579a = request;
        this.f39580b = protocol;
        this.f39581c = message;
        this.f39582d = i10;
        this.f39583e = wVar;
        this.f39584f = headers;
        this.f39585g = body;
        this.f39586h = p0Var;
        this.f39587i = f0Var;
        this.f39588j = f0Var2;
        this.f39589k = f0Var3;
        this.f39590l = j10;
        this.f39591m = j11;
        this.f39592n = hVar;
        this.f39593o = trailersSource;
        boolean z10 = true;
        this.f39595q = 200 <= i10 && i10 < 300;
        if (i10 != 307 && i10 != 308) {
            switch (i10) {
                case HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES /* 300 */:
                case 301:
                case 302:
                case HttpStatusCodes.STATUS_CODE_SEE_OTHER /* 303 */:
                    break;
                default:
                    z10 = false;
                    break;
            }
        }
        this.f39596r = z10;
    }

    public static /* synthetic */ String c0(f0 f0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return f0Var.t(str, str2);
    }

    public final a F0() {
        return new a(this);
    }

    public final f0 K0() {
        return this.f39589k;
    }

    public final c0 N0() {
        return this.f39580b;
    }

    public final long T0() {
        return this.f39591m;
    }

    public final d0 U0() {
        return this.f39579a;
    }

    public final long V0() {
        return this.f39590l;
    }

    public final p0 W0() {
        return this.f39586h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39585g.close();
    }

    public final g0 d() {
        return this.f39585g;
    }

    public final x d0() {
        return this.f39584f;
    }

    public final boolean g0() {
        return this.f39596r;
    }

    public final d h() {
        d dVar = this.f39594p;
        if (dVar != null) {
            return dVar;
        }
        d dVarA = d.f39529n.a(this.f39584f);
        this.f39594p = dVarA;
        return dVarA;
    }

    public final boolean i0() {
        return this.f39595q;
    }

    public final f0 k() {
        return this.f39588j;
    }

    public final List l() {
        String str;
        x xVar = this.f39584f;
        int i10 = this.f39582d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return gl.r.l();
            }
            str = "Proxy-Authenticate";
        }
        return mn.e.a(xVar, str);
    }

    public final int m() {
        return this.f39582d;
    }

    public final String m0() {
        return this.f39581c;
    }

    public final f0 p0() {
        return this.f39587i;
    }

    public final ln.h q() {
        return this.f39592n;
    }

    public final w r() {
        return this.f39583e;
    }

    public final String s(String name) {
        kotlin.jvm.internal.s.h(name, "name");
        return c0(this, name, null, 2, null);
    }

    public final String t(String name, String str) {
        kotlin.jvm.internal.s.h(name, "name");
        String strA = this.f39584f.a(name);
        return strA == null ? str : strA;
    }

    public String toString() {
        return "Response{protocol=" + this.f39580b + ", code=" + this.f39582d + ", message=" + this.f39581c + ", url=" + this.f39579a.m() + '}';
    }
}
