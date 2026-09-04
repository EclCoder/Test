package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import gl.r;
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
import vn.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends c implements rn.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0756a f48981f = new C0756a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f48982g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f48983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f48984e;

    /* JADX INFO: renamed from: okhttp3.internal.platform.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0756a {
        public /* synthetic */ C0756a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f48982g;
        }

        private C0756a() {
        }
    }

    static {
        f48982g = c.f48992a.f() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List listP = r.p(sn.a.f52441a.a(), new i(f.f52449f.d()), new i(h.f52460a.b()), new i(g.f52457a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((j) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f48984e = arrayList;
    }

    @Override // rn.c
    public void a(Context context) {
        this.f48983d = context;
    }

    @Override // rn.c
    public Context b() {
        return this.f48983d;
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.f(trustManager);
    }

    @Override // okhttp3.internal.platform.c
    public void g(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        s.h(sslSocket, "sslSocket");
        s.h(protocols, "protocols");
        Iterator it = this.f48984e.iterator();
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
    public String j(SSLSocket sslSocket) {
        Object next;
        s.h(sslSocket, "sslSocket");
        Iterator it = this.f48984e.iterator();
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
    public Object k(String closer) {
        s.h(closer, "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.k(closer);
        }
        CloseGuard closeGuardA = rn.a.a();
        closeGuardA.open(closer);
        return closeGuardA;
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
            Log.w(b.f48985f.b(), message, th2);
        } else {
            Log.i(b.f48985f.b(), message, th2);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void n(String message, Object obj) {
        s.h(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.n(message, obj);
        } else {
            s.f(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            rn.b.a(obj).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.c
    public SSLContext o() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.o();
    }
}
