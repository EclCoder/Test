package okhttp3.internal.platform;

import gl.r;
import gn.b0;
import gn.c0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.apache.http.conn.ssl.h;
import xn.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c f48993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f48994c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c d() {
            return d.f48995a.a();
        }

        public final List b(List protocols) {
            s.h(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((c0) obj) != c0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(r.v(arrayList, 10));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                arrayList2.add(((c0) obj2).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List protocols) {
            s.h(protocols, "protocols");
            e eVar = new e();
            for (String str : b(protocols)) {
                eVar.writeByte(str.length());
                eVar.N(str);
            }
            return eVar.l0();
        }

        public final c e() {
            return c.f48993b;
        }

        public final boolean f() {
            return d.f48995a.c();
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f48992a = aVar;
        f48993b = aVar.d();
        f48994c = Logger.getLogger(b0.class.getName());
    }

    public void d(SSLSocket sslSocket) {
        s.h(sslSocket, "sslSocket");
    }

    public vn.c e(X509TrustManager trustManager) {
        s.h(trustManager, "trustManager");
        return new vn.a(f(trustManager));
    }

    public vn.e f(X509TrustManager trustManager) {
        s.h(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new vn.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public abstract void g(SSLSocket sSLSocket, String str, List list);

    public void h(Socket socket, InetSocketAddress address, int i10) throws IOException {
        s.h(socket, "socket");
        s.h(address, "address");
        socket.connect(address, i10);
    }

    public final String i() {
        return "OkHttp";
    }

    public abstract String j(SSLSocket sSLSocket);

    public Object k(String closer) {
        s.h(closer, "closer");
        if (f48994c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public abstract boolean l(String str);

    public abstract void m(String str, int i10, Throwable th2);

    public void n(String message, Object obj) {
        s.h(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m(message, 5, (Throwable) obj);
    }

    public SSLContext o() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance(h.TLS);
        s.g(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public SSLSocketFactory p(X509TrustManager trustManager) {
        s.h(trustManager, "trustManager");
        try {
            SSLContext sSLContextO = o();
            sSLContextO.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextO.getSocketFactory();
            s.g(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager q() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        s.e(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                s.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        s.g(string, "toString(...)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        s.g(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
