package ln;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.foundation.download.Command;
import gn.c0;
import gn.d0;
import gn.f0;
import gn.h0;
import gn.y;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kn.d f44827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f44828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f44830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f44831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f44832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f44833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f44834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f44835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final gn.a f44836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s f44837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m f44838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f44839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u.b f44840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private u f44841o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private h0 f44842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final gl.i f44843q;

    private final d0 g(h0 h0Var) {
        d0 d0VarB = new d0.a().u(h0Var.a().l()).p(HttpMethods.CONNECT, null).n("Host", hn.p.t(h0Var.a().l(), true)).n("Proxy-Connection", "Keep-Alive").n(Command.HTTP_HEADER_USER_AGENT, "okhttp/5.4.0").b();
        d0 d0VarA = h0Var.a().h().a(h0Var, new f0.a().q(d0VarB).o(c0.HTTP_1_1).f(TTAdConstant.DOWNLOAD_APP_INFO_CODE).l("Preemptive Authenticate").r(-1L).p(-1L).i("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return d0VarA == null ? d0VarB : d0VarA;
    }

    public static /* synthetic */ f j(p pVar, h0 h0Var, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        return pVar.i(h0Var, list);
    }

    private final r k() {
        Socket socketW;
        boolean z10;
        n nVarK = this.f44838l.k();
        if (nVarK == null) {
            return null;
        }
        boolean zM = nVarK.m(this.f44839m);
        synchronized (nVarK) {
            try {
                if (!zM) {
                    z10 = !nVarK.h();
                    nVarK.t(true);
                    socketW = this.f44838l.w();
                } else if (nVarK.h() || !e(nVarK.q().a().l())) {
                    socketW = this.f44838l.w();
                    z10 = false;
                } else {
                    z10 = false;
                    socketW = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f44838l.k() != null) {
            if (socketW == null) {
                return new r(nVarK);
            }
            throw new IllegalStateException("Check failed.");
        }
        if (socketW != null) {
            hn.p.h(socketW);
        }
        this.f44838l.l().l(this.f44838l, nVarK);
        nVarK.f().g(nVarK, this.f44838l);
        if (socketW != null) {
            nVarK.f().f(nVarK);
        } else if (z10) {
            nVarK.f().h(nVarK);
        }
        return null;
    }

    public static /* synthetic */ r m(p pVar, f fVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = null;
        }
        if ((i10 & 2) != 0) {
            list = null;
        }
        return pVar.l(fVar, list);
    }

    private final h0 n(n nVar) {
        h0 h0VarQ;
        synchronized (nVar) {
            h0VarQ = null;
            if (nVar.i() == 0 && nVar.h() && hn.p.f(nVar.q().a().l(), a().l())) {
                h0VarQ = nVar.q();
            }
        }
        return h0VarQ;
    }

    @Override // ln.t
    public gn.a a() {
        return this.f44836j;
    }

    @Override // ln.t
    public gl.i b() {
        return this.f44843q;
    }

    @Override // ln.t
    public t.b c() throws IOException {
        r rVarK = k();
        if (rVarK != null) {
            return rVarK;
        }
        r rVarM = m(this, null, null, 3, null);
        if (rVarM != null) {
            return rVarM;
        }
        if (!b().isEmpty()) {
            return (t.b) b().removeFirst();
        }
        f fVarH = h();
        r rVarL = l(fVarH, fVarH.p());
        return rVarL != null ? rVarL : fVarH;
    }

    @Override // ln.t
    public boolean e(y url) {
        kotlin.jvm.internal.s.h(url, "url");
        y yVarL = a().l();
        return url.l() == yVarL.l() && kotlin.jvm.internal.s.c(url.g(), yVarL.g());
    }

    @Override // ln.t
    public boolean f(n nVar) {
        u uVar;
        h0 h0VarN;
        if (!b().isEmpty() || this.f44842p != null) {
            return true;
        }
        if (nVar != null && (h0VarN = n(nVar)) != null) {
            this.f44842p = h0VarN;
            return true;
        }
        u.b bVar = this.f44840n;
        if ((bVar == null || !bVar.b()) && (uVar = this.f44841o) != null) {
            return uVar.a();
        }
        return true;
    }

    public final f h() throws IOException {
        h0 h0Var = this.f44842p;
        if (h0Var != null) {
            this.f44842p = null;
            return j(this, h0Var, null, 2, null);
        }
        u.b bVar = this.f44840n;
        if (bVar != null && bVar.b()) {
            return j(this, bVar.c(), null, 2, null);
        }
        u uVar = this.f44841o;
        if (uVar == null) {
            uVar = new u(a(), this.f44837k, this.f44838l, this.f44835i);
            this.f44841o = uVar;
        }
        if (!uVar.a()) {
            throw new IOException("exhausted all routes");
        }
        u.b bVarC = uVar.c();
        this.f44840n = bVarC;
        if (isCanceled()) {
            throw new IOException("Canceled");
        }
        return i(bVarC.c(), bVarC.a());
    }

    public final f i(h0 route, List list) throws UnknownServiceException {
        kotlin.jvm.internal.s.h(route, "route");
        if (route.a().k() == null) {
            if (!route.a().b().contains(gn.m.f39722k)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String strG = route.a().l().g();
            if (!okhttp3.internal.platform.c.f48992a.e().l(strG)) {
                throw new UnknownServiceException("CLEARTEXT communication to " + strG + " not permitted by network security policy");
            }
        } else if (route.a().f().contains(c0.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new f(this.f44827a, this.f44828b, this.f44829c, this.f44830d, this.f44831e, this.f44832f, this.f44833g, this.f44834h, this.f44838l, this, route, list, 0, route.c() ? g(route) : null, -1, false);
    }

    @Override // ln.t
    public boolean isCanceled() {
        return this.f44838l.isCanceled();
    }

    public final r l(f fVar, List list) {
        n nVarA = this.f44828b.a(this.f44839m, a(), this.f44838l, list, fVar != null && fVar.isReady());
        if (nVarA == null) {
            return null;
        }
        if (fVar != null) {
            this.f44842p = fVar.v();
            fVar.g();
        }
        this.f44838l.l().k(this.f44838l, nVarA);
        nVarA.f().e(nVarA, this.f44838l);
        return new r(nVarA);
    }

    public p(kn.d taskRunner, o connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, gn.a address, s routeDatabase, m mVar, d0 request) {
        kotlin.jvm.internal.s.h(taskRunner, "taskRunner");
        kotlin.jvm.internal.s.h(connectionPool, "connectionPool");
        kotlin.jvm.internal.s.h(address, "address");
        kotlin.jvm.internal.s.h(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.s.h(mVar, YSHErhbVu.zQyxXybeJnLtsE);
        kotlin.jvm.internal.s.h(request, "request");
        this.f44827a = taskRunner;
        this.f44828b = connectionPool;
        this.f44829c = i10;
        this.f44830d = i11;
        this.f44831e = i12;
        this.f44832f = i13;
        this.f44833g = i14;
        this.f44834h = z10;
        this.f44835i = z11;
        this.f44836j = address;
        this.f44837k = routeDatabase;
        this.f44838l = mVar;
        this.f44839m = !kotlin.jvm.internal.s.c(request.i(), HttpMethods.GET);
        this.f44843q = new gl.i();
    }
}
