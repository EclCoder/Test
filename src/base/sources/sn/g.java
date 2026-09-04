package sn;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f52457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i.a f52458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f52459c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements i.a {
        a() {
        }

        @Override // sn.i.a
        public boolean b(SSLSocket sslSocket) {
            s.h(sslSocket, "sslSocket");
            g.f52457a.b();
            return false;
        }

        @Override // sn.i.a
        public j c(SSLSocket sslSocket) {
            s.h(sslSocket, "sslSocket");
            return new g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i.a a() {
            return g.f52458b;
        }

        public final boolean b() {
            return g.f52459c;
        }

        private b() {
        }
    }

    static {
        b bVar = new b(null);
        f52457a = bVar;
        f52458b = new a();
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, bVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f52459c = z10;
    }

    @Override // sn.j
    public boolean a() {
        return f52459c;
    }

    @Override // sn.j
    public boolean b(SSLSocket sslSocket) {
        s.h(sslSocket, "sslSocket");
        return false;
    }

    @Override // sn.j
    public String c(SSLSocket sslSocket) {
        s.h(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || s.c(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // sn.j
    public void d(SSLSocket sslSocket, String str, List protocols) {
        s.h(sslSocket, "sslSocket");
        s.h(protocols, "protocols");
        if (b(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) okhttp3.internal.platform.c.f48992a.b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
