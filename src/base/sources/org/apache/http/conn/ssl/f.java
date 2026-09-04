package org.apache.http.conn.ssl;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f49228b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f49229c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SecureRandom f49230d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements X509TrustManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509TrustManager f49231a;

        a(X509TrustManager x509TrustManager, k kVar) {
            this.f49231a = x509TrustManager;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            this.f49231a.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            throw null;
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.f49231a.getAcceptedIssuers();
        }
    }

    public SSLContext a() throws NoSuchAlgorithmException, KeyManagementException {
        KeyManager[] keyManagerArr;
        String str = this.f49227a;
        if (str == null) {
            str = h.TLS;
        }
        SSLContext sSLContext = SSLContext.getInstance(str);
        TrustManager[] trustManagerArr = null;
        if (this.f49228b.isEmpty()) {
            keyManagerArr = null;
        } else {
            Set set = this.f49228b;
            keyManagerArr = (KeyManager[]) set.toArray(new KeyManager[set.size()]);
        }
        if (!this.f49229c.isEmpty()) {
            Set set2 = this.f49229c;
            trustManagerArr = (TrustManager[]) set2.toArray(new TrustManager[set2.size()]);
        }
        sSLContext.init(keyManagerArr, trustManagerArr, this.f49230d);
        return sSLContext;
    }

    public f b(KeyStore keyStore) {
        return c(keyStore, null);
    }

    public f c(KeyStore keyStore, k kVar) throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers != null) {
            if (kVar != null) {
                for (int i10 = 0; i10 < trustManagers.length; i10++) {
                    TrustManager trustManager = trustManagers[i10];
                    if (trustManager instanceof X509TrustManager) {
                        trustManagers[i10] = new a((X509TrustManager) trustManager, kVar);
                    }
                }
            }
            for (TrustManager trustManager2 : trustManagers) {
                this.f49229c.add(trustManager2);
            }
        }
        return this;
    }
}
