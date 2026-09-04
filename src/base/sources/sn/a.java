package sn;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0803a f52441a = new C0803a(null);

    /* JADX INFO: renamed from: sn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0803a {
        public /* synthetic */ C0803a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return okhttp3.internal.platform.c.f48992a.f() && Build.VERSION.SDK_INT >= 29;
        }

        private C0803a() {
        }
    }

    @Override // sn.j
    public boolean a() {
        return f52441a.b();
    }

    @Override // sn.j
    public boolean b(SSLSocket sslSocket) {
        s.h(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // sn.j
    public String c(SSLSocket sslSocket) {
        s.h(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null || s.c(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
        }
    }

    @Override // sn.j
    public void d(SSLSocket sslSocket, String str, List protocols) throws IOException {
        s.h(sslSocket, "sslSocket");
        s.h(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) okhttp3.internal.platform.c.f48992a.b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
