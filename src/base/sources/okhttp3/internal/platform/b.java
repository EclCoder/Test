package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import gl.r;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import sn.f;
import sn.g;
import sn.h;
import sn.i;
import sn.j;
import sn.k;
import vn.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends c implements rn.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48985f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f48986g = "OkHttp";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f48987h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f48988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f48989e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            if (c()) {
                return new b();
            }
            return null;
        }

        public final String b() {
            return b.f48986g;
        }

        public final boolean c() {
            return b.f48987h;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.platform.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0757b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509TrustManager f48990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f48991b;

        public C0757b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            s.h(trustManager, "trustManager");
            s.h(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f48990a = trustManager;
            this.f48991b = findByIssuerAndSignatureMethod;
        }

        @Override // vn.e
        public X509Certificate a(X509Certificate cert) {
            s.h(cert, "cert");
            try {
                Object objInvoke = this.f48991b.invoke(this.f48990a, cert);
                s.f(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0757b)) {
                return false;
            }
            C0757b c0757b = (C0757b) obj;
            return s.c(this.f48990a, c0757b.f48990a) && s.c(this.f48991b, c0757b.f48991b);
        }

        public int hashCode() {
            return (this.f48990a.hashCode() * 31) + this.f48991b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f48990a + ", findByIssuerAndSignatureMethod=" + this.f48991b + ')';
        }
    }

    static {
        f48987h = c.f48992a.f() && Build.VERSION.SDK_INT < 29;
    }

    public b() {
        List listP = r.p(k.a.b(k.f52465j, null, 1, null), new i(f.f52449f.d()), new i(h.f52460a.b()), new i(g.f52457a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((j) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f48989e = arrayList;
    }

    @Override // rn.c
    public void a(Context context) {
        this.f48988d = context;
    }

    @Override // rn.c
    public Context b() {
        return this.f48988d;
    }

    @Override // okhttp3.internal.platform.c
    public vn.c e(X509TrustManager trustManager) {
        s.h(trustManager, "trustManager");
        sn.b bVarA = sn.b.f52442d.a(trustManager);
        return bVarA != null ? bVarA : super.e(trustManager);
    }

    @Override // okhttp3.internal.platform.c
    public e f(X509TrustManager trustManager) {
        s.h(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            s.e(declaredMethod);
            return new C0757b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.f(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void g(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        s.h(sslSocket, "sslSocket");
        s.h(protocols, "protocols");
        Iterator it = this.f48989e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((j) next).b(sslSocket));
        j jVar = (j) next;
        if (jVar != null) {
            jVar.d(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void h(Socket socket, InetSocketAddress address, int i10) throws IOException {
        s.h(socket, "socket");
        s.h(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // okhttp3.internal.platform.c
    public String j(SSLSocket sslSocket) {
        Object next;
        s.h(sslSocket, "sslSocket");
        Iterator it = this.f48989e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((j) next).b(sslSocket));
        j jVar = (j) next;
        if (jVar != null) {
            return jVar.c(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.c
    public boolean l(String hostname) {
        s.h(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.c
    public void m(String message, int i10, Throwable th2) {
        s.h(message, "message");
        if (i10 == 5) {
            Log.w(f48986g, message, th2);
        } else {
            Log.i(f48986g, message, th2);
        }
    }

    @Override // okhttp3.internal.platform.c
    public SSLContext o() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.o();
    }
}
