package com.google.api.client.http.apache;

import co.l;
import co.t;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.SslUtils;
import ep.b;
import ep.c;
import ep.d;
import ep.f;
import fo.h;
import io.e;
import io.i;
import io.j;
import io.n;
import io.p;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProxySelector;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import org.apache.http.impl.client.m;
import po.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ApacheHttpTransport extends HttpTransport {
    private final h httpClient;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Builder {
        private org.apache.http.conn.ssl.h socketFactory = org.apache.http.conn.ssl.h.getSocketFactory();
        private d params = ApacheHttpTransport.newDefaultHttpParams();
        private ProxySelector proxySelector = ProxySelector.getDefault();

        public ApacheHttpTransport build() {
            return new ApacheHttpTransport(ApacheHttpTransport.newDefaultHttpClient(this.socketFactory, this.params, this.proxySelector));
        }

        public Builder doNotValidateCertificate() {
            SSLSocketFactoryExtension sSLSocketFactoryExtension = new SSLSocketFactoryExtension(SslUtils.trustAllSSLContext());
            this.socketFactory = sSLSocketFactoryExtension;
            sSLSocketFactoryExtension.setHostnameVerifier(org.apache.http.conn.ssl.h.ALLOW_ALL_HOSTNAME_VERIFIER);
            return this;
        }

        public d getHttpParams() {
            return this.params;
        }

        public org.apache.http.conn.ssl.h getSSLSocketFactory() {
            return this.socketFactory;
        }

        public Builder setProxy(l lVar) {
            po.d.d(this.params, lVar);
            if (lVar != null) {
                this.proxySelector = null;
            }
            return this;
        }

        public Builder setProxySelector(ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
            if (proxySelector != null) {
                po.d.d(this.params, null);
            }
            return this;
        }

        public Builder setSocketFactory(org.apache.http.conn.ssl.h hVar) {
            this.socketFactory = (org.apache.http.conn.ssl.h) Preconditions.checkNotNull(hVar);
            return this;
        }

        public Builder trustCertificates(KeyStore keyStore) throws KeyStoreException, KeyManagementException {
            SSLContext tlsSslContext = SslUtils.getTlsSslContext();
            SslUtils.initSslContext(tlsSslContext, keyStore, SslUtils.getPkixTrustManagerFactory());
            return setSocketFactory(new SSLSocketFactoryExtension(tlsSslContext));
        }

        public Builder trustCertificatesFromJavaKeyStore(InputStream inputStream, String str) throws IOException {
            KeyStore javaKeyStore = SecurityUtils.getJavaKeyStore();
            SecurityUtils.loadKeyStore(javaKeyStore, inputStream, str);
            return trustCertificates(javaKeyStore);
        }

        public Builder trustCertificatesFromStream(InputStream inputStream) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
            KeyStore javaKeyStore = SecurityUtils.getJavaKeyStore();
            javaKeyStore.load(null, null);
            SecurityUtils.loadKeyStoreFromCertificates(javaKeyStore, SecurityUtils.getX509CertificateFactory(), inputStream);
            return trustCertificates(javaKeyStore);
        }
    }

    public ApacheHttpTransport() {
        this(newDefaultHttpClient());
    }

    public static m newDefaultHttpClient() {
        return newDefaultHttpClient(org.apache.http.conn.ssl.h.getSocketFactory(), newDefaultHttpParams(), ProxySelector.getDefault());
    }

    static d newDefaultHttpParams() {
        b bVar = new b();
        c.g(bVar, false);
        c.f(bVar, 8192);
        a.d(bVar, 200);
        a.c(bVar, new po.c(20));
        return bVar;
    }

    public h getHttpClient() {
        return this.httpClient;
    }

    @Override // com.google.api.client.http.HttpTransport
    public void shutdown() {
        this.httpClient.getConnectionManager().shutdown();
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean supportsMethod(String str) {
        return true;
    }

    public ApacheHttpTransport(h hVar) {
        this.httpClient = hVar;
        d params = hVar.getParams();
        params = params == null ? newDefaultHttpClient().getParams() : params;
        f.d(params, t.f10164f);
        params.j("http.protocol.handle-redirects", false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.api.client.http.HttpTransport
    public ApacheHttpRequest buildRequest(String str, String str2) {
        n jVar;
        if (str.equals(HttpMethods.DELETE)) {
            jVar = new e(str2);
        } else if (str.equals(HttpMethods.GET)) {
            jVar = new io.h(str2);
        } else if (str.equals(HttpMethods.HEAD)) {
            jVar = new i(str2);
        } else if (str.equals(HttpMethods.POST)) {
            jVar = new io.l(str2);
        } else if (str.equals(HttpMethods.PUT)) {
            jVar = new io.m(str2);
        } else if (str.equals(HttpMethods.TRACE)) {
            jVar = new p(str2);
        } else {
            jVar = str.equals(HttpMethods.OPTIONS) ? new j(str2) : new HttpExtensionMethod(str, str2);
        }
        return new ApacheHttpRequest(this.httpClient, jVar);
    }

    static m newDefaultHttpClient(org.apache.http.conn.ssl.h hVar, d dVar, ProxySelector proxySelector) {
        ro.i iVar = new ro.i();
        iVar.d(new ro.e("http", ro.d.a(), 80));
        iVar.d(new ro.e("https", hVar, 443));
        m mVar = new m(new yo.d(dVar, iVar), dVar);
        mVar.setHttpRequestRetryHandler(new org.apache.http.impl.client.n(0, false));
        if (proxySelector != null) {
            mVar.setRoutePlanner(new xo.p(iVar, proxySelector));
        }
        return mVar;
    }
}
