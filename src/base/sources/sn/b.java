package sn;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends vn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f52442d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X509TrustManager f52443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X509TrustManagerExtensions f52444c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            s.h(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new b(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        private a() {
        }
    }

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        s.h(trustManager, "trustManager");
        s.h(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f52443b = trustManager;
        this.f52444c = x509TrustManagerExtensions;
    }

    @Override // vn.c
    public List a(List chain, String hostname) throws SSLPeerUnverifiedException {
        s.h(chain, "chain");
        s.h(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f52444c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            s.g(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f52443b == this.f52443b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f52443b);
    }
}
