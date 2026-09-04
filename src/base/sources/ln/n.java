package ln;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import fl.g0;
import gn.b0;
import gn.c0;
import gn.h0;
import gn.w;
import gn.y;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import xn.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class n extends on.n.c implements gn.k, mn.d.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f44799v = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kn.d f44800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f44801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h0 f44802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Socket f44803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Socket f44804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f44805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c0 f44806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ln.a f44807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f44808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g f44809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private on.n f44810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f44811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f44812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f44813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f44814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f44815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f44816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f44817t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f44818u;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n(kn.d taskRunner, o connectionPool, h0 route, Socket rawSocket, Socket javaNetSocket, w wVar, c0 protocol, ln.a socket, int i10, g connectionListener) {
        kotlin.jvm.internal.s.h(taskRunner, "taskRunner");
        kotlin.jvm.internal.s.h(connectionPool, "connectionPool");
        kotlin.jvm.internal.s.h(route, "route");
        kotlin.jvm.internal.s.h(rawSocket, "rawSocket");
        kotlin.jvm.internal.s.h(javaNetSocket, "javaNetSocket");
        kotlin.jvm.internal.s.h(protocol, "protocol");
        kotlin.jvm.internal.s.h(socket, "socket");
        kotlin.jvm.internal.s.h(connectionListener, "connectionListener");
        this.f44800c = taskRunner;
        this.f44801d = connectionPool;
        this.f44802e = route;
        this.f44803f = rawSocket;
        this.f44804g = javaNetSocket;
        this.f44805h = wVar;
        this.f44806i = protocol;
        this.f44807j = socket;
        this.f44808k = i10;
        this.f44809l = connectionListener;
        this.f44816s = 1;
        this.f44817t = new ArrayList();
        this.f44818u = Long.MAX_VALUE;
    }

    private final boolean A(y yVar) {
        w wVar;
        if (!hn.p.f40722b || Thread.holdsLock(this)) {
            y yVarL = v().a().l();
            if (yVar.l() != yVarL.l()) {
                return false;
            }
            if (kotlin.jvm.internal.s.c(yVar.g(), yVarL.g())) {
                return true;
            }
            return (this.f44812o || (wVar = this.f44805h) == null || !c(yVar, wVar)) ? false : true;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final boolean c(y yVar, w wVar) {
        List listE = wVar.e();
        if (!listE.isEmpty()) {
            vn.d dVar = vn.d.f55686a;
            String strG = yVar.g();
            Object obj = listE.get(0);
            kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.g(strG, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    private final boolean r(List list) {
        List<h0> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (h0 h0Var : list2) {
            Proxy.Type type = h0Var.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && v().b().type() == type2 && kotlin.jvm.internal.s.c(v().d(), h0Var.d())) {
                return true;
            }
        }
        return false;
    }

    private final void z() throws SocketException {
        this.f44804g.setSoTimeout(0);
        Object obj = this.f44809l;
        on.b bVar = obj instanceof on.b ? (on.b) obj : null;
        if (bVar == null) {
            bVar = on.b.a.f49019a;
        }
        on.n nVarA = new on.n.a(true, this.f44800c).o(this.f44807j, v().a().l().g()).k(this).l(this.f44808k).b(bVar).a();
        this.f44810m = nVarA;
        this.f44816s = on.n.C.a().d();
        on.n.B1(nVarA, false, 1, null);
    }

    public final void B() throws SocketException {
        this.f44804g.setSoTimeout(0);
        w();
    }

    @Override // on.n.c
    public void a(on.n connection, on.y settings) {
        kotlin.jvm.internal.s.h(connection, "connection");
        kotlin.jvm.internal.s.h(settings, "settings");
        synchronized (this) {
            this.f44816s = settings.d();
            g0 g0Var = g0.f38750a;
        }
    }

    @Override // mn.d.a
    public void cancel() {
        hn.p.h(this.f44803f);
    }

    public final void d(b0 client, h0 failedRoute, IOException failure) {
        kotlin.jvm.internal.s.h(client, "client");
        kotlin.jvm.internal.s.h(failedRoute, "failedRoute");
        kotlin.jvm.internal.s.h(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            gn.a aVarA = failedRoute.a();
            aVarA.i().connectFailed(aVarA.l().q(), failedRoute.b().address(), failure);
        }
        client.s().b(failedRoute);
    }

    public final List e() {
        return this.f44817t;
    }

    public final g f() {
        return this.f44809l;
    }

    public final long g() {
        return this.f44818u;
    }

    public final boolean h() {
        return this.f44811n;
    }

    public final int i() {
        return this.f44813p;
    }

    public w j() {
        return this.f44805h;
    }

    public final void k() {
        synchronized (this) {
            this.f44814q++;
        }
    }

    public final boolean l(gn.a address, List list) {
        kotlin.jvm.internal.s.h(address, "address");
        if (hn.p.f40722b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f44817t.size() >= this.f44816s || this.f44811n || !v().a().d(address)) {
            return false;
        }
        if (kotlin.jvm.internal.s.c(address.l().g(), q().a().l().g())) {
            return true;
        }
        if (this.f44810m == null || list == null || !r(list) || address.e() != vn.d.f55686a || !A(address.l())) {
            return false;
        }
        try {
            gn.h hVarA = address.a();
            kotlin.jvm.internal.s.e(hVarA);
            String strG = address.l().g();
            w wVarJ = j();
            kotlin.jvm.internal.s.e(wVarJ);
            hVarA.b(strG, wVarJ.e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean m(boolean z10) {
        long j10;
        if (hn.p.f40722b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        if (this.f44803f.isClosed() || this.f44804g.isClosed() || this.f44804g.isInputShutdown() || this.f44804g.isOutputShutdown()) {
            return false;
        }
        on.n nVar = this.f44810m;
        if (nVar != null) {
            return nVar.i1(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f44818u;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        return hn.p.m(this.f44804g, this.f44807j.a());
    }

    public final boolean n() {
        return this.f44810m != null;
    }

    public final mn.d o(b0 client, mn.g chain) throws SocketException {
        kotlin.jvm.internal.s.h(client, "client");
        kotlin.jvm.internal.s.h(chain, "chain");
        ln.a aVar = this.f44807j;
        on.n nVar = this.f44810m;
        if (nVar != null) {
            return new on.s(client, this, chain, nVar);
        }
        this.f44804g.setSoTimeout(chain.C());
        r0 r0VarTimeout = aVar.a().timeout();
        long jW = chain.w();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r0VarTimeout.g(jW, timeUnit);
        aVar.b().timeout().g(chain.A(), timeUnit);
        return new nn.b(client, this, aVar);
    }

    public final void p() {
        synchronized (this) {
            this.f44812o = true;
            g0 g0Var = g0.f38750a;
        }
    }

    public h0 q() {
        return v();
    }

    public final void s(long j10) {
        this.f44818u = j10;
    }

    public final void t(boolean z10) {
        this.f44811n = z10;
    }

    public String toString() {
        Object objB;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(v().a().l().g());
        sb2.append(':');
        sb2.append(v().a().l().l());
        sb2.append(", proxy=");
        sb2.append(v().b());
        sb2.append(" hostAddress=");
        sb2.append(v().d());
        sb2.append(" cipherSuite=");
        w wVar = this.f44805h;
        if (wVar == null || (objB = wVar.b()) == null) {
            objB = DevicePublicKeyStringDef.NONE;
        }
        sb2.append(objB);
        sb2.append(" protocol=");
        sb2.append(this.f44806i);
        sb2.append('}');
        return sb2.toString();
    }

    public Socket u() {
        return this.f44804g;
    }

    @Override // mn.d.a
    public h0 v() {
        return this.f44802e;
    }

    @Override // mn.d.a
    public void w() {
        synchronized (this) {
            this.f44811n = true;
            g0 g0Var = g0.f38750a;
        }
        this.f44809l.h(this);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    @Override // mn.d.a
    public void x(m call, IOException iOException) {
        boolean z10;
        kotlin.jvm.internal.s.h(call, "call");
        synchronized (this) {
            try {
                if (iOException instanceof StreamResetException) {
                    if (((StreamResetException) iOException).errorCode == on.a.REFUSED_STREAM) {
                        int i10 = this.f44815r + 1;
                        this.f44815r = i10;
                        if (i10 > 1) {
                            z10 = !this.f44811n;
                            this.f44811n = true;
                            this.f44813p++;
                        } else {
                            z10 = false;
                        }
                    } else if (((StreamResetException) iOException).errorCode == on.a.CANCEL && call.isCanceled()) {
                        z10 = false;
                    } else {
                        z10 = !this.f44811n;
                        this.f44811n = true;
                        this.f44813p++;
                    }
                } else if (!n() || (iOException instanceof ConnectionShutdownException)) {
                    boolean z11 = !this.f44811n;
                    this.f44811n = true;
                    if (this.f44814q == 0) {
                        if (iOException != null) {
                            d(call.j(), v(), iOException);
                        }
                        this.f44813p++;
                    }
                    z10 = z11;
                } else {
                    z10 = false;
                }
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f44809l.h(this);
        }
    }

    public final void y() throws SocketException {
        this.f44818u = System.nanoTime();
        c0 c0Var = this.f44806i;
        if (c0Var == c0.HTTP_2 || c0Var == c0.H2_PRIOR_KNOWLEDGE) {
            z();
        }
    }

    @Override // on.n.c
    public void b(on.u uVar) {
        kotlin.jvm.internal.s.h(uVar, dOIDCKnIR.hdZOVx);
        uVar.g(on.a.REFUSED_STREAM, null);
    }
}
