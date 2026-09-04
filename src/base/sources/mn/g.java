package mn;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import gn.b0;
import gn.d0;
import gn.f0;
import gn.l;
import gn.o;
import gn.r;
import gn.y;
import gn.z;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import ln.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f46484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f46485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ln.h f46487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f46488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f46489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f46490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f46491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final gn.b f46492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final gn.c f46493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final gn.h f46494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final l f46495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final o f46496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final r f46497n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final HostnameVerifier f46498o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Proxy f46499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final gn.b f46500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ProxySelector f46501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f46502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SocketFactory f46503t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final SSLSocketFactory f46504u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final X509TrustManager f46505v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final vn.c f46506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f46507x;

    public g(m call, List interceptors, int i10, ln.h hVar, d0 request, int i11, int i12, int i13, gn.b authenticator, gn.c cVar, gn.h certificatePinner, l connectionPool, o cookieJar, r dns, HostnameVerifier hostnameVerifier, Proxy proxy, gn.b proxyAuthenticator, ProxySelector proxySelector, boolean z10, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, vn.c cVar2) {
        s.h(call, "call");
        s.h(interceptors, "interceptors");
        s.h(request, "request");
        s.h(authenticator, "authenticator");
        s.h(certificatePinner, "certificatePinner");
        s.h(connectionPool, "connectionPool");
        s.h(cookieJar, "cookieJar");
        s.h(dns, "dns");
        s.h(hostnameVerifier, "hostnameVerifier");
        s.h(proxyAuthenticator, "proxyAuthenticator");
        s.h(proxySelector, "proxySelector");
        s.h(socketFactory, "socketFactory");
        this.f46484a = call;
        this.f46485b = interceptors;
        this.f46486c = i10;
        this.f46487d = hVar;
        this.f46488e = request;
        this.f46489f = i11;
        this.f46490g = i12;
        this.f46491h = i13;
        this.f46492i = authenticator;
        this.f46493j = cVar;
        this.f46494k = certificatePinner;
        this.f46495l = connectionPool;
        this.f46496m = cookieJar;
        this.f46497n = dns;
        this.f46498o = hostnameVerifier;
        this.f46499p = proxy;
        this.f46500q = proxyAuthenticator;
        this.f46501r = proxySelector;
        this.f46502s = z10;
        this.f46503t = socketFactory;
        this.f46504u = sSLSocketFactory;
        this.f46505v = x509TrustManager;
        this.f46506w = cVar2;
    }

    public static /* synthetic */ g m(g gVar, int i10, ln.h hVar, d0 d0Var, int i11, int i12, int i13, gn.b bVar, gn.c cVar, gn.h hVar2, l lVar, o oVar, r rVar, HostnameVerifier hostnameVerifier, Proxy proxy, gn.b bVar2, ProxySelector proxySelector, boolean z10, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, vn.c cVar2, int i14, Object obj) {
        return gVar.l((i14 & 1) != 0 ? gVar.f46486c : i10, (i14 & 2) != 0 ? gVar.f46487d : hVar, (i14 & 4) != 0 ? gVar.f46488e : d0Var, (i14 & 8) != 0 ? gVar.f46489f : i11, (i14 & 16) != 0 ? gVar.f46490g : i12, (i14 & 32) != 0 ? gVar.f46491h : i13, (i14 & 64) != 0 ? gVar.g() : bVar, (i14 & 128) != 0 ? gVar.i() : cVar, (i14 & 256) != 0 ? gVar.o() : hVar2, (i14 & 512) != 0 ? gVar.q() : lVar, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? gVar.b() : oVar, (i14 & 2048) != 0 ? gVar.r() : rVar, (i14 & 4096) != 0 ? gVar.t() : hostnameVerifier, (i14 & 8192) != 0 ? gVar.u() : proxy, (i14 & 16384) != 0 ? gVar.d() : bVar2, (i14 & 32768) != 0 ? gVar.v() : proxySelector, (i14 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? gVar.f() : z10, (i14 & 131072) != 0 ? gVar.y() : socketFactory, (i14 & MediaHttpUploader.MINIMUM_CHUNK_SIZE) != 0 ? gVar.z() : sSLSocketFactory, (i14 & 524288) != 0 ? gVar.B() : x509TrustManager, (i14 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? gVar.f46506w : cVar2);
    }

    public final int A() {
        return this.f46491h;
    }

    public X509TrustManager B() {
        return this.f46505v;
    }

    public int C() {
        return this.f46490g;
    }

    @Override // gn.z.a
    public boolean a() {
        return this.f46484a.j().q();
    }

    @Override // gn.z.a
    public o b() {
        return this.f46496m;
    }

    @Override // gn.z.a
    public f0 c(d0 request) {
        s.h(request, "request");
        if (this.f46486c >= this.f46485b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f46507x++;
        ln.h hVar = this.f46487d;
        if (hVar != null) {
            if (!hVar.k().b().e(request.m())) {
                throw new IllegalStateException(("network interceptor " + this.f46485b.get(this.f46486c - 1) + " must retain the same host and port").toString());
            }
            if (this.f46507x != 1) {
                throw new IllegalStateException(("network interceptor " + this.f46485b.get(this.f46486c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarM = m(this, this.f46486c + 1, null, request, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097146, null);
        z zVar = (z) this.f46485b.get(this.f46486c);
        f0 f0VarIntercept = zVar.intercept(gVarM);
        if (f0VarIntercept == null) {
            throw new NullPointerException("interceptor " + zVar + " returned null");
        }
        if (this.f46487d == null || this.f46486c + 1 >= this.f46485b.size() || gVarM.f46507x == 1) {
            return f0VarIntercept;
        }
        throw new IllegalStateException(("network interceptor " + zVar + " must call proceed() exactly once").toString());
    }

    @Override // gn.z.a
    public gn.e call() {
        return this.f46484a;
    }

    @Override // gn.z.a
    public gn.b d() {
        return this.f46500q;
    }

    @Override // gn.z.a
    public d0 e() {
        return this.f46488e;
    }

    @Override // gn.z.a
    public boolean f() {
        return this.f46502s;
    }

    @Override // gn.z.a
    public gn.b g() {
        return this.f46492i;
    }

    @Override // gn.z.a
    public gn.s h() {
        return this.f46484a.l();
    }

    @Override // gn.z.a
    public gn.c i() {
        return this.f46493j;
    }

    @Override // gn.z.a
    public boolean j() {
        return this.f46484a.j().r();
    }

    public final gn.a k(y url) {
        SSLSocketFactory sSLSocketFactoryZ;
        HostnameVerifier hostnameVerifierT;
        gn.h hVarO;
        s.h(url, "url");
        if (url.h()) {
            sSLSocketFactoryZ = z();
            hostnameVerifierT = t();
            hVarO = o();
        } else {
            sSLSocketFactoryZ = null;
            hostnameVerifierT = null;
            hVarO = null;
        }
        return new gn.a(url.g(), url.l(), r(), y(), sSLSocketFactoryZ, hostnameVerifierT, hVarO, d(), u(), this.f46484a.j().z(), this.f46484a.j().k(), v());
    }

    public final g l(int i10, ln.h hVar, d0 request, int i11, int i12, int i13, gn.b authenticator, gn.c cVar, gn.h certificatePinner, l connectionPool, o cookieJar, r dns, HostnameVerifier hostnameVerifier, Proxy proxy, gn.b proxyAuthenticator, ProxySelector proxySelector, boolean z10, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, vn.c cVar2) {
        s.h(request, "request");
        s.h(authenticator, "authenticator");
        s.h(certificatePinner, "certificatePinner");
        s.h(connectionPool, "connectionPool");
        s.h(cookieJar, "cookieJar");
        s.h(dns, "dns");
        s.h(hostnameVerifier, "hostnameVerifier");
        s.h(proxyAuthenticator, "proxyAuthenticator");
        s.h(proxySelector, "proxySelector");
        s.h(socketFactory, "socketFactory");
        return new g(this.f46484a, this.f46485b, i10, hVar, request, i11, i12, i13, authenticator, cVar, certificatePinner, connectionPool, cookieJar, dns, hostnameVerifier, proxy, proxyAuthenticator, proxySelector, z10, socketFactory, sSLSocketFactory, x509TrustManager, cVar2);
    }

    public final m n() {
        return this.f46484a;
    }

    public gn.h o() {
        return this.f46494k;
    }

    public final int p() {
        return this.f46489f;
    }

    public l q() {
        return this.f46495l;
    }

    public r r() {
        return this.f46497n;
    }

    public final ln.h s() {
        return this.f46487d;
    }

    public HostnameVerifier t() {
        return this.f46498o;
    }

    public Proxy u() {
        return this.f46499p;
    }

    public ProxySelector v() {
        return this.f46501r;
    }

    public final int w() {
        return this.f46490g;
    }

    public final d0 x() {
        return this.f46488e;
    }

    public SocketFactory y() {
        return this.f46503t;
    }

    public SSLSocketFactory z() {
        return this.f46504u;
    }

    public /* synthetic */ g(m mVar, List list, int i10, Void r11, d0 d0Var, b0 b0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, list, i10, r11, d0Var, (i11 & 32) != 0 ? mVar.j() : b0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(m call, List interceptors, int i10, Void r29, d0 request, b0 client) {
        this(call, interceptors, i10, (ln.h) r29, request, client.i(), client.D(), client.H(), client.d(), client.e(), client.h(), client.j(), client.l(), client.n(), client.v(), client.A(), client.B(), client.C(), client.E(), client.F(), client.t(), client.I(), client.g());
        s.h(call, "call");
        s.h(interceptors, "interceptors");
        s.h(request, "request");
        s.h(client, "client");
    }
}
