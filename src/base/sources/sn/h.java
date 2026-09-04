package sn;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f52460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i.a f52461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f52462c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements i.a {
        a() {
        }

        @Override // sn.i.a
        public boolean b(SSLSocket sslSocket) {
            s.h(sslSocket, "sslSocket");
            return h.f52460a.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // sn.i.a
        public j c(SSLSocket sslSocket) {
            s.h(sslSocket, "sslSocket");
            return new h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            if (version == null) {
                return false;
            }
            if (version.major() != i10) {
                return version.major() > i10;
            }
            if (version.minor() != i11) {
                return version.minor() > i11;
            }
            return version.patch() >= i12;
        }

        public final i.a b() {
            return h.f52461b;
        }

        public final boolean c() {
            return h.f52462c;
        }

        private b() {
        }
    }

    static {
        b bVar = new b(null);
        f52460a = bVar;
        f52461b = new a();
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, bVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && bVar.a(2, 1, 0)) {
                z10 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f52462c = z10;
    }

    @Override // sn.j
    public boolean a() {
        return f52462c;
    }

    @Override // sn.j
    public boolean b(SSLSocket sslSocket) {
        s.h(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // sn.j
    public String c(SSLSocket sslSocket) {
        s.h(sslSocket, "sslSocket");
        if (b(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // sn.j
    public void d(SSLSocket sslSocket, String str, List protocols) {
        s.h(sslSocket, "sslSocket");
        s.h(protocols, "protocols");
        if (b(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) okhttp3.internal.platform.c.f48992a.b(protocols).toArray(new String[0]));
        }
    }
}
