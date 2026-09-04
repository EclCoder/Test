package gn;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class b0 implements e.a {
    public static final b H = new b(null);
    private static final List I = hn.p.l(c0.HTTP_2, c0.HTTP_1_1);
    private static final List J = hn.p.l(m.f39720i, m.f39722k);
    private final int A;
    private final int B;
    private final int C;
    private final long D;
    private final ln.s E;
    private final kn.d F;
    private final l G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f39434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f39435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f39436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s.c f39437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f39438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f39439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final gn.b f39440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f39441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f39442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o f39443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c f39444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final r f39445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Proxy f39446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ProxySelector f39447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final gn.b f39448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final SocketFactory f39449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SSLSocketFactory f39450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final X509TrustManager f39451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f39452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f39453t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final HostnameVerifier f39454u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f39455v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final vn.c f39456w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f39457x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f39458y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f39459z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        private int A;
        private int B;
        private int C;
        private int D;
        private long E;
        private ln.s F;
        private kn.d G;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l f39461b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private gn.b f39467h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f39468i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f39469j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private o f39470k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private c f39471l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private r f39472m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Proxy f39473n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private ProxySelector f39474o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private gn.b f39475p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private SocketFactory f39476q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private SSLSocketFactory f39477r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private X509TrustManager f39478s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f39479t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private List f39480u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private HostnameVerifier f39481v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private h f39482w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private vn.c f39483x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f39484y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f39485z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q f39460a = new q();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f39462c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f39463d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s.c f39464e = hn.p.c(s.f39763b);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f39465f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f39466g = true;

        public a() {
            gn.b bVar = gn.b.f39431b;
            this.f39467h = bVar;
            this.f39468i = true;
            this.f39469j = true;
            this.f39470k = o.f39747b;
            this.f39472m = r.f39760b;
            this.f39475p = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.s.g(socketFactory, "getDefault(...)");
            this.f39476q = socketFactory;
            b bVar2 = b0.H;
            this.f39479t = bVar2.a();
            this.f39480u = bVar2.b();
            this.f39481v = vn.d.f55686a;
            this.f39482w = h.f39623d;
            this.f39485z = 10000;
            this.A = 10000;
            this.B = 10000;
            this.D = 60000;
            this.E = 1024L;
        }

        public final List A() {
            return this.f39463d;
        }

        public final int B() {
            return this.C;
        }

        public final List C() {
            return this.f39480u;
        }

        public final Proxy D() {
            return this.f39473n;
        }

        public final gn.b E() {
            return this.f39475p;
        }

        public final ProxySelector F() {
            return this.f39474o;
        }

        public final int G() {
            return this.A;
        }

        public final boolean H() {
            return this.f39465f;
        }

        public final ln.s I() {
            return this.F;
        }

        public final SocketFactory J() {
            return this.f39476q;
        }

        public final SSLSocketFactory K() {
            return this.f39477r;
        }

        public final kn.d L() {
            return this.G;
        }

        public final int M() {
            return this.D;
        }

        public final int N() {
            return this.B;
        }

        public final X509TrustManager O() {
            return this.f39478s;
        }

        public final a P(List protocols) {
            kotlin.jvm.internal.s.h(protocols, "protocols");
            List listL0 = gl.r.L0(protocols);
            c0 c0Var = c0.H2_PRIOR_KNOWLEDGE;
            if (!listL0.contains(c0Var) && !listL0.contains(c0.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listL0).toString());
            }
            if (listL0.contains(c0Var) && listL0.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listL0).toString());
            }
            if (listL0.contains(c0.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listL0).toString());
            }
            kotlin.jvm.internal.s.f(listL0, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (listL0.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            listL0.remove(c0.SPDY_3);
            if (!kotlin.jvm.internal.s.c(listL0, this.f39480u)) {
                this.F = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(listL0);
            kotlin.jvm.internal.s.g(listUnmodifiableList, "unmodifiableList(...)");
            this.f39480u = listUnmodifiableList;
            return this;
        }

        public final a Q(ProxySelector proxySelector) {
            kotlin.jvm.internal.s.h(proxySelector, "proxySelector");
            if (!kotlin.jvm.internal.s.c(proxySelector, this.f39474o)) {
                this.F = null;
            }
            this.f39474o = proxySelector;
            return this;
        }

        public final a R(long j10, TimeUnit unit) {
            kotlin.jvm.internal.s.h(unit, "unit");
            this.A = hn.p.g("timeout", j10, unit);
            return this;
        }

        public final a S(boolean z10) {
            this.f39465f = z10;
            return this;
        }

        public final void T(l lVar) {
            this.f39461b = lVar;
        }

        public final a a(z interceptor) {
            kotlin.jvm.internal.s.h(interceptor, "interceptor");
            this.f39462c.add(interceptor);
            return this;
        }

        public final a b(z interceptor) {
            kotlin.jvm.internal.s.h(interceptor, "interceptor");
            this.f39463d.add(interceptor);
            return this;
        }

        public final b0 c() {
            return new b0(this);
        }

        public final a d(c cVar) {
            this.f39471l = cVar;
            return this;
        }

        public final a e(long j10, TimeUnit unit) {
            kotlin.jvm.internal.s.h(unit, "unit");
            this.f39485z = hn.p.g("timeout", j10, unit);
            return this;
        }

        public final a f(q dispatcher) {
            kotlin.jvm.internal.s.h(dispatcher, "dispatcher");
            this.f39460a = dispatcher;
            return this;
        }

        public final a g(boolean z10) {
            this.f39468i = z10;
            return this;
        }

        public final a h(boolean z10) {
            this.f39469j = z10;
            return this;
        }

        public final gn.b i() {
            return this.f39467h;
        }

        public final c j() {
            return this.f39471l;
        }

        public final int k() {
            return this.f39484y;
        }

        public final vn.c l() {
            return this.f39483x;
        }

        public final h m() {
            return this.f39482w;
        }

        public final int n() {
            return this.f39485z;
        }

        public final l o() {
            return this.f39461b;
        }

        public final List p() {
            return this.f39479t;
        }

        public final o q() {
            return this.f39470k;
        }

        public final q r() {
            return this.f39460a;
        }

        public final r s() {
            return this.f39472m;
        }

        public final s.c t() {
            return this.f39464e;
        }

        public final boolean u() {
            return this.f39466g;
        }

        public final boolean v() {
            return this.f39468i;
        }

        public final boolean w() {
            return this.f39469j;
        }

        public final HostnameVerifier x() {
            return this.f39481v;
        }

        public final List y() {
            return this.f39462c;
        }

        public final long z() {
            return this.E;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return b0.J;
        }

        public final List b() {
            return b0.I;
        }

        private b() {
        }
    }

    public b0(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorF;
        kotlin.jvm.internal.s.h(builder, "builder");
        this.f39434a = builder.r();
        this.f39435b = hn.p.v(builder.y());
        this.f39436c = hn.p.v(builder.A());
        this.f39437d = builder.t();
        this.f39438e = builder.H();
        this.f39439f = builder.u();
        this.f39440g = builder.i();
        this.f39441h = builder.v();
        this.f39442i = builder.w();
        this.f39443j = builder.q();
        this.f39444k = builder.j();
        this.f39445l = builder.s();
        this.f39446m = builder.D();
        if (builder.D() != null) {
            proxySelectorF = tn.a.f53621a;
        } else {
            proxySelectorF = builder.F();
            if (proxySelectorF == null && (proxySelectorF = ProxySelector.getDefault()) == null) {
                proxySelectorF = tn.a.f53621a;
            }
        }
        this.f39447n = proxySelectorF;
        this.f39448o = builder.E();
        this.f39449p = builder.J();
        List listP = builder.p();
        this.f39452s = listP;
        this.f39453t = builder.C();
        this.f39454u = builder.x();
        this.f39457x = builder.k();
        this.f39458y = builder.n();
        this.f39459z = builder.G();
        this.A = builder.N();
        this.B = builder.B();
        this.C = builder.M();
        this.D = builder.z();
        ln.s sVarI = builder.I();
        this.E = sVarI == null ? new ln.s() : sVarI;
        kn.d dVarL = builder.L();
        this.F = dVarL == null ? kn.d.f43546m : dVarL;
        l lVarO = builder.o();
        if (lVarO == null) {
            lVarO = new l();
            builder.T(lVarO);
        }
        this.G = lVarO;
        List list = listP;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.f39450q = null;
            this.f39456w = null;
            this.f39451r = null;
            this.f39455v = h.f39623d;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((m) it.next()).f()) {
                    if (builder.K() != null) {
                        this.f39450q = builder.K();
                        vn.c cVarL = builder.l();
                        kotlin.jvm.internal.s.e(cVarL);
                        this.f39456w = cVarL;
                        X509TrustManager x509TrustManagerO = builder.O();
                        kotlin.jvm.internal.s.e(x509TrustManagerO);
                        this.f39451r = x509TrustManagerO;
                        this.f39455v = builder.m().g(cVarL);
                    } else {
                        okhttp3.internal.platform.c.a aVar = okhttp3.internal.platform.c.f48992a;
                        X509TrustManager x509TrustManagerQ = aVar.e().q();
                        this.f39451r = x509TrustManagerQ;
                        this.f39450q = aVar.e().p(x509TrustManagerQ);
                        vn.c cVarA = vn.c.f55685a.a(x509TrustManagerQ);
                        this.f39456w = cVarA;
                        this.f39455v = builder.m().g(cVarA);
                    }
                }
            }
            this.f39450q = null;
            this.f39456w = null;
            this.f39451r = null;
            this.f39455v = h.f39623d;
        }
        G();
    }

    private final void G() {
        List list = this.f39435b;
        kotlin.jvm.internal.s.f(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f39435b).toString());
        }
        List list2 = this.f39436c;
        kotlin.jvm.internal.s.f(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f39436c).toString());
        }
        List list3 = this.f39452s;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((m) it.next()).f()) {
                    if (this.f39450q == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f39456w == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f39451r == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f39450q != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f39456w != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f39451r != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.s.c(this.f39455v, h.f39623d)) {
            throw new IllegalStateException("Check failed.");
        }
        fl.g0 g0Var = fl.g0.f38750a;
    }

    public final Proxy A() {
        return this.f39446m;
    }

    public final gn.b B() {
        return this.f39448o;
    }

    public final ProxySelector C() {
        return this.f39447n;
    }

    public final int D() {
        return this.f39459z;
    }

    public final boolean E() {
        return this.f39438e;
    }

    public final SocketFactory F() {
        return this.f39449p;
    }

    public final int H() {
        return this.A;
    }

    public final X509TrustManager I() {
        return this.f39451r;
    }

    @Override // gn.e.a
    public e a(d0 request) {
        kotlin.jvm.internal.s.h(request, "request");
        return new ln.m(this, request, false);
    }

    public final gn.b d() {
        return this.f39440g;
    }

    public final c e() {
        return this.f39444k;
    }

    public final int f() {
        return this.f39457x;
    }

    public final vn.c g() {
        return this.f39456w;
    }

    public final h h() {
        return this.f39455v;
    }

    public final int i() {
        return this.f39458y;
    }

    public final l j() {
        return this.G;
    }

    public final List k() {
        return this.f39452s;
    }

    public final o l() {
        return this.f39443j;
    }

    public final q m() {
        return this.f39434a;
    }

    public final r n() {
        return this.f39445l;
    }

    public final s.c o() {
        return this.f39437d;
    }

    public final boolean p() {
        return this.f39439f;
    }

    public final boolean q() {
        return this.f39441h;
    }

    public final boolean r() {
        return this.f39442i;
    }

    public final ln.s s() {
        return this.E;
    }

    public final SSLSocketFactory t() {
        return this.f39450q;
    }

    public final kn.d u() {
        return this.F;
    }

    public final HostnameVerifier v() {
        return this.f39454u;
    }

    public final List w() {
        return this.f39435b;
    }

    public final List x() {
        return this.f39436c;
    }

    public final int y() {
        return this.B;
    }

    public final List z() {
        return this.f39453t;
    }

    public b0() {
        this(new a());
    }
}
