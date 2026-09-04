package ln;

import fl.g0;
import gn.c0;
import gn.d0;
import gn.f0;
import gn.h0;
import gn.w;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xn.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements t.b, mn.d.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f44712x = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kn.d f44713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f44714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f44716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f44717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f44718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f44719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f44720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m f44721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p f44722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final h0 f44723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f44724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f44725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d0 f44726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f44727o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f44728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f44729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Socket f44730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Socket f44731s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private w f44732t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c0 f44733u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ln.a f44734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private n f44735w;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44736a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f44736a = iArr;
        }
    }

    public f(kn.d taskRunner, o connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, m call, p routePlanner, h0 route, List list, int i15, d0 d0Var, int i16, boolean z11) {
        kotlin.jvm.internal.s.h(taskRunner, "taskRunner");
        kotlin.jvm.internal.s.h(connectionPool, "connectionPool");
        kotlin.jvm.internal.s.h(call, "call");
        kotlin.jvm.internal.s.h(routePlanner, "routePlanner");
        kotlin.jvm.internal.s.h(route, "route");
        this.f44713a = taskRunner;
        this.f44714b = connectionPool;
        this.f44715c = i10;
        this.f44716d = i11;
        this.f44717e = i12;
        this.f44718f = i13;
        this.f44719g = i14;
        this.f44720h = z10;
        this.f44721i = call;
        this.f44722j = routePlanner;
        this.f44723k = route;
        this.f44724l = list;
        this.f44725m = i15;
        this.f44726n = d0Var;
        this.f44727o = i16;
        this.f44728p = z11;
    }

    private final void h() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = v().b().type();
        int i10 = type == null ? -1 : b.f44736a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = v().a().j().createSocket();
            kotlin.jvm.internal.s.e(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(v().b());
        }
        this.f44730r = socketCreateSocket;
        if (this.f44729q) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f44718f);
        try {
            okhttp3.internal.platform.c.f48992a.e().h(socketCreateSocket, v().d(), this.f44717e);
            try {
                this.f44734v = ln.b.a(socketCreateSocket);
            } catch (NullPointerException e10) {
                if (kotlin.jvm.internal.s.c(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + v().d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private final void i(SSLSocket sSLSocket, gn.m mVar) {
        final gn.a aVarA = v().a();
        try {
            if (mVar.h()) {
                okhttp3.internal.platform.c.f48992a.e().g(sSLSocket, aVarA.l().g(), aVarA.f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            w.a aVar = w.f39767e;
            kotlin.jvm.internal.s.e(session);
            final w wVarD = aVar.d(session);
            HostnameVerifier hostnameVerifierE = aVarA.e();
            kotlin.jvm.internal.s.e(hostnameVerifierE);
            if (hostnameVerifierE.verify(aVarA.l().g(), session)) {
                final gn.h hVarA = aVarA.a();
                kotlin.jvm.internal.s.e(hVarA);
                final w wVar = new w(wVarD.g(), wVarD.b(), wVarD.d(), new tl.a() { // from class: ln.d
                    @Override // tl.a
                    public final Object invoke() {
                        return f.j(hVarA, wVarD, aVarA);
                    }
                });
                this.f44732t = wVar;
                hVarA.d(aVarA.l().g(), new tl.a() { // from class: ln.e
                    @Override // tl.a
                    public final Object invoke() {
                        return f.k(wVar);
                    }
                });
                String strJ = mVar.h() ? okhttp3.internal.platform.c.f48992a.e().j(sSLSocket) : null;
                this.f44731s = sSLSocket;
                this.f44734v = ln.b.a(sSLSocket);
                this.f44733u = strJ != null ? c0.f39518b.a(strJ) : c0.HTTP_1_1;
                okhttp3.internal.platform.c.f48992a.e().d(sSLSocket);
                return;
            }
            List listE = wVarD.e();
            if (listE.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + aVarA.l().g() + " not verified (no certificates)");
            }
            Object obj = listE.get(0);
            kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(bm.r.l("\n            |Hostname " + aVarA.l().g() + " not verified:\n            |    certificate: " + gn.h.f39622c.a(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + vn.d.f55686a.c(x509Certificate) + "\n            ", null, 1, null));
        } catch (Throwable th2) {
            okhttp3.internal.platform.c.f48992a.e().d(sSLSocket);
            hn.p.h(sSLSocket);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(gn.h hVar, w wVar, gn.a aVar) {
        vn.c cVarF = hVar.f();
        kotlin.jvm.internal.s.e(cVarF);
        return cVarF.a(wVar.e(), aVar.l().g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(w wVar) {
        List<Certificate> listE = wVar.e();
        ArrayList arrayList = new ArrayList(gl.r.v(listE, 10));
        for (Certificate certificate : listE) {
            kotlin.jvm.internal.s.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    private final f m(int i10, d0 d0Var, int i11, boolean z10) {
        return new f(this.f44713a, this.f44714b, this.f44715c, this.f44716d, this.f44717e, this.f44718f, this.f44719g, this.f44720h, this.f44721i, this.f44722j, v(), this.f44724l, i10, d0Var, i11, z10);
    }

    static /* synthetic */ f n(f fVar, int i10, d0 d0Var, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = fVar.f44725m;
        }
        if ((i12 & 2) != 0) {
            d0Var = fVar.f44726n;
        }
        if ((i12 & 4) != 0) {
            i11 = fVar.f44727o;
        }
        if ((i12 & 8) != 0) {
            z10 = fVar.f44728p;
        }
        return fVar.m(i10, d0Var, i11, z10);
    }

    private final d0 o() throws IOException {
        d0 d0Var = this.f44726n;
        kotlin.jvm.internal.s.e(d0Var);
        String str = "CONNECT " + hn.p.t(v().a().l(), true) + " HTTP/1.1";
        while (true) {
            ln.a aVar = this.f44734v;
            if (aVar == null) {
                kotlin.jvm.internal.s.w("socket");
                aVar = null;
            }
            nn.b bVar = new nn.b(null, this, aVar);
            ln.a aVar2 = this.f44734v;
            if (aVar2 == null) {
                kotlin.jvm.internal.s.w("socket");
                aVar2 = null;
            }
            r0 r0VarTimeout = aVar2.a().timeout();
            long j10 = this.f44715c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            r0VarTimeout.g(j10, timeUnit);
            ln.a aVar3 = this.f44734v;
            if (aVar3 == null) {
                kotlin.jvm.internal.s.w("socket");
                aVar3 = null;
            }
            aVar3.b().timeout().g(this.f44716d, timeUnit);
            bVar.B(d0Var.f(), str);
            bVar.a();
            f0.a aVarF = bVar.f(false);
            kotlin.jvm.internal.s.e(aVarF);
            f0 f0VarC = aVarF.q(d0Var).c();
            bVar.A(f0VarC);
            int iM = f0VarC.m();
            if (iM == 200) {
                return null;
            }
            if (iM != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + f0VarC.m());
            }
            d0 d0VarA = v().a().h().a(v(), f0VarC);
            if (d0VarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (bm.r.A("close", f0.c0(f0VarC, "Connection", null, 2, null), true)) {
                return d0VarA;
            }
            d0Var = d0VarA;
        }
    }

    @Override // ln.t.b
    public n a() {
        this.f44721i.j().s().a(v());
        n nVar = this.f44735w;
        kotlin.jvm.internal.s.e(nVar);
        nVar.f().b(nVar, v(), this.f44721i);
        r rVarL = this.f44722j.l(this, this.f44724l);
        if (rVarL != null) {
            return rVarL.h();
        }
        synchronized (nVar) {
            this.f44714b.f(nVar);
            this.f44721i.d(nVar);
            g0 g0Var = g0.f38750a;
        }
        this.f44721i.l().k(this.f44721i, nVar);
        nVar.f().e(nVar, this.f44721i);
        return nVar;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01dc  */
    @Override // ln.t.b
    public t.a b() throws Throwable {
        IOException iOException;
        f fVar;
        Socket socket;
        Socket socket2 = this.f44730r;
        if (socket2 == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (isReady()) {
            throw new IllegalStateException("already connected");
        }
        List listB = v().a().b();
        this.f44721i.p().add(this);
        f fVar2 = null;
        boolean z10 = false;
        try {
            try {
                if (this.f44726n != null) {
                    t.a aVarL = l();
                    if (aVarL.c() != null || aVarL.e() != null) {
                        this.f44721i.p().remove(this);
                        Socket socket3 = this.f44731s;
                        if (socket3 != null) {
                            hn.p.h(socket3);
                        }
                        hn.p.h(socket2);
                        return aVarL;
                    }
                }
                if (v().a().k() != null) {
                    ln.a aVar = this.f44734v;
                    if (aVar == null) {
                        kotlin.jvm.internal.s.w("socket");
                        aVar = null;
                    }
                    if (aVar.a().u().n0()) {
                        ln.a aVar2 = this.f44734v;
                        if (aVar2 == null) {
                            kotlin.jvm.internal.s.w("socket");
                            aVar2 = null;
                        }
                        if (aVar2.b().u().n0()) {
                            this.f44721i.l().G(this.f44721i);
                            Socket socketCreateSocket = v().a().k().createSocket(socket2, v().a().l().g(), v().a().l().l(), true);
                            kotlin.jvm.internal.s.f(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            f fVarR = r(listB, sSLSocket);
                            gn.m mVar = (gn.m) listB.get(fVarR.f44727o);
                            f fVarQ = fVarR.q(listB, sSLSocket);
                            try {
                                mVar.b(sSLSocket, fVarR.f44728p);
                                i(sSLSocket, mVar);
                                this.f44721i.l().F(this.f44721i, this.f44732t);
                                fVar = fVarQ;
                            } catch (IOException e10) {
                                iOException = e10;
                                fVar = fVarQ;
                                this.f44721i.l().i(this.f44721i, v().d(), v().b(), null, iOException);
                                this.f44714b.d().c(v(), this.f44721i, iOException);
                                if (this.f44720h && q.a(iOException)) {
                                    fVar2 = fVar;
                                }
                                t.a aVar3 = new t.a(this, fVar2, iOException);
                                this.f44721i.p().remove(this);
                                if (!z10) {
                                    socket = this.f44731s;
                                    if (socket != null) {
                                        hn.p.h(socket);
                                    }
                                    hn.p.h(socket2);
                                }
                                return aVar3;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.f44731s = socket2;
                List listF = v().a().f();
                c0 c0Var = c0.H2_PRIOR_KNOWLEDGE;
                if (!listF.contains(c0Var)) {
                    c0Var = c0.HTTP_1_1;
                }
                this.f44733u = c0Var;
                fVar = null;
                try {
                    kn.d dVar = this.f44713a;
                    o oVar = this.f44714b;
                    h0 h0VarV = v();
                    Socket socket4 = this.f44731s;
                    kotlin.jvm.internal.s.e(socket4);
                    w wVar = this.f44732t;
                    c0 c0Var2 = this.f44733u;
                    kotlin.jvm.internal.s.e(c0Var2);
                    ln.a aVar4 = this.f44734v;
                    if (aVar4 == null) {
                        kotlin.jvm.internal.s.w("socket");
                        aVar4 = null;
                    }
                    n nVar = new n(dVar, oVar, h0VarV, socket2, socket4, wVar, c0Var2, aVar4, this.f44719g, this.f44714b.d());
                    this.f44735w = nVar;
                    nVar.y();
                    this.f44721i.l().h(this.f44721i, v().d(), v().b(), this.f44733u);
                    try {
                        t.a aVar5 = new t.a(this, null, null, 6, null);
                        this.f44721i.p().remove(this);
                        return aVar5;
                    } catch (IOException e11) {
                        iOException = e11;
                        z10 = true;
                        this.f44721i.l().i(this.f44721i, v().d(), v().b(), null, iOException);
                        this.f44714b.d().c(v(), this.f44721i, iOException);
                        if (this.f44720h) {
                            fVar2 = fVar;
                        }
                        t.a aVar6 = new t.a(this, fVar2, iOException);
                        this.f44721i.p().remove(this);
                        if (!z10) {
                            socket = this.f44731s;
                            if (socket != null) {
                                hn.p.h(socket);
                            }
                            hn.p.h(socket2);
                        }
                        return aVar6;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        this.f44721i.p().remove(this);
                        if (!z10) {
                            Socket socket5 = this.f44731s;
                            if (socket5 != null) {
                                hn.p.h(socket5);
                            }
                            hn.p.h(socket2);
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    iOException = e12;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            iOException = e13;
            fVar = null;
        }
    }

    @Override // ln.t.b
    public t.b c() {
        return new f(this.f44713a, this.f44714b, this.f44715c, this.f44716d, this.f44717e, this.f44718f, this.f44719g, this.f44720h, this.f44721i, this.f44722j, v(), this.f44724l, this.f44725m, this.f44726n, this.f44727o, this.f44728p);
    }

    @Override // ln.t.b, mn.d.a
    public void cancel() {
        this.f44729q = true;
        Socket socket = this.f44730r;
        if (socket != null) {
            hn.p.h(socket);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00fb  */
    @Override // ln.t.b
    public t.a d() throws Throwable {
        f fVar;
        f fVar2;
        Socket socket;
        Socket socket2;
        if (this.f44730r != null) {
            throw new IllegalStateException("TCP already connected");
        }
        this.f44721i.p().add(this);
        boolean z10 = false;
        try {
            try {
                this.f44721i.l().j(this.f44721i, v().d(), v().b());
                this.f44714b.d().d(v(), this.f44721i);
                h();
                z10 = true;
                fVar2 = this;
                try {
                    t.a aVar = new t.a(fVar2, null, null, 6, null);
                    fVar2.f44721i.p().remove(this);
                    return aVar;
                } catch (IOException e10) {
                    e = e10;
                    IOException iOException = e;
                    if (v().a().g() == null && v().b().type() != Proxy.Type.DIRECT) {
                        v().a().i().connectFailed(v().a().l().q(), v().b().address(), iOException);
                    }
                    fVar2.f44721i.l().i(fVar2.f44721i, v().d(), v().b(), null, iOException);
                    fVar2.f44714b.d().c(v(), fVar2.f44721i, iOException);
                    f fVar3 = fVar2;
                    try {
                        t.a aVar2 = new t.a(fVar3, null, iOException, 2, null);
                        fVar2.f44721i.p().remove(this);
                        if (!z10 && (socket2 = fVar2.f44730r) != null) {
                            hn.p.h(socket2);
                        }
                        return aVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        fVar = fVar3;
                        fVar.f44721i.p().remove(this);
                        if (!z10) {
                            hn.p.h(socket);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fVar.f44721i.p().remove(this);
                if (!z10 && (socket = fVar.f44730r) != null) {
                    hn.p.h(socket);
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            fVar2 = this;
        } catch (Throwable th4) {
            th = th4;
            fVar = this;
            fVar.f44721i.p().remove(this);
            if (!z10) {
                hn.p.h(socket);
            }
            throw th;
        }
    }

    public final void g() {
        Socket socket = this.f44731s;
        if (socket != null) {
            hn.p.h(socket);
        }
    }

    @Override // ln.t.b
    public boolean isReady() {
        return this.f44733u != null;
    }

    public final t.a l() throws IOException {
        d0 d0VarO = o();
        if (d0VarO == null) {
            return new t.a(this, null, null, 6, null);
        }
        Socket socket = this.f44730r;
        if (socket != null) {
            hn.p.h(socket);
        }
        int i10 = this.f44725m + 1;
        if (i10 < 21) {
            this.f44721i.l().h(this.f44721i, v().d(), v().b(), null);
            return new t.a(this, n(this, i10, d0VarO, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.f44721i.l().i(this.f44721i, v().d(), v().b(), null, protocolException);
        this.f44714b.d().c(v(), this.f44721i, protocolException);
        return new t.a(this, null, protocolException, 2, null);
    }

    public final List p() {
        return this.f44724l;
    }

    public final f q(List connectionSpecs, SSLSocket sslSocket) {
        kotlin.jvm.internal.s.h(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.s.h(sslSocket, "sslSocket");
        int i10 = this.f44727o + 1;
        int size = connectionSpecs.size();
        for (int i11 = i10; i11 < size; i11++) {
            if (((gn.m) connectionSpecs.get(i11)).e(sslSocket)) {
                return n(this, 0, null, i11, this.f44727o != -1, 3, null);
            }
        }
        return null;
    }

    public final f r(List connectionSpecs, SSLSocket sslSocket) throws UnknownServiceException {
        kotlin.jvm.internal.s.h(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.s.h(sslSocket, "sslSocket");
        if (this.f44727o != -1) {
            return this;
        }
        f fVarQ = q(connectionSpecs, sslSocket);
        if (fVarQ != null) {
            return fVarQ;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f44728p);
        sb2.append(", modes=");
        sb2.append(connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        kotlin.jvm.internal.s.e(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        kotlin.jvm.internal.s.g(string, "toString(...)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    @Override // mn.d.a
    public h0 v() {
        return this.f44723k;
    }

    @Override // mn.d.a
    public void x(m call, IOException iOException) {
        kotlin.jvm.internal.s.h(call, "call");
    }

    @Override // mn.d.a
    public void w() {
    }
}
