package sn;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f52463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f52464b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        boolean b(SSLSocket sSLSocket);

        j c(SSLSocket sSLSocket);
    }

    public i(a socketAdapterFactory) {
        s.h(socketAdapterFactory, "socketAdapterFactory");
        this.f52463a = socketAdapterFactory;
    }

    private final synchronized j e(SSLSocket sSLSocket) {
        try {
            if (this.f52464b == null && this.f52463a.b(sSLSocket)) {
                this.f52464b = this.f52463a.c(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f52464b;
    }

    @Override // sn.j
    public boolean a() {
        return true;
    }

    @Override // sn.j
    public boolean b(SSLSocket sslSocket) {
        s.h(sslSocket, "sslSocket");
        return this.f52463a.b(sslSocket);
    }

    @Override // sn.j
    public String c(SSLSocket sslSocket) {
        s.h(sslSocket, "sslSocket");
        j jVarE = e(sslSocket);
        if (jVarE != null) {
            return jVarE.c(sslSocket);
        }
        return null;
    }

    @Override // sn.j
    public void d(SSLSocket sslSocket, String str, List protocols) {
        s.h(sslSocket, "sslSocket");
        s.h(protocols, "protocols");
        j jVarE = e(sslSocket);
        if (jVarE != null) {
            jVarE.d(sslSocket, str, protocols);
        }
    }
}
