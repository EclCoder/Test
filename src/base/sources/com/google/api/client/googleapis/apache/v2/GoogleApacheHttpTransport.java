package com.google.api.client.googleapis.apache.v2;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.mtls.MtlsProvider;
import com.google.api.client.googleapis.mtls.MtlsUtils;
import com.google.api.client.http.apache.v2.ApacheHttpTransport;
import com.google.api.client.util.SslUtils;
import java.net.ProxySelector;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import org.apache.http.conn.ssl.e;
import org.apache.http.impl.client.x;
import xo.o;
import xo.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class GoogleApacheHttpTransport {
    private GoogleApacheHttpTransport() {
    }

    public static ApacheHttpTransport newTrustedTransport() {
        return newTrustedTransport(MtlsUtils.getDefaultMtlsProvider());
    }

    public static ApacheHttpTransport newTrustedTransport(MtlsProvider mtlsProvider) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException, KeyManagementException {
        KeyStore keyStore;
        String keyStorePassword;
        boolean z10;
        if (mtlsProvider.useMtlsClientCertificate()) {
            KeyStore keyStore2 = mtlsProvider.getKeyStore();
            keyStorePassword = mtlsProvider.getKeyStorePassword();
            keyStore = keyStore2;
        } else {
            keyStore = null;
            keyStorePassword = null;
        }
        o oVar = new o(-1L, TimeUnit.MILLISECONDS);
        oVar.s(-1);
        KeyStore certificateTrustStore = GoogleUtils.getCertificateTrustStore();
        SSLContext tlsSslContext = SslUtils.getTlsSslContext();
        if (keyStore == null || keyStorePassword == null) {
            SslUtils.initSslContext(tlsSslContext, certificateTrustStore, SslUtils.getPkixTrustManagerFactory());
            z10 = false;
        } else {
            SslUtils.initSslContext(tlsSslContext, certificateTrustStore, SslUtils.getPkixTrustManagerFactory(), keyStore, keyStorePassword, SslUtils.getDefaultKeyManagerFactory());
            z10 = true;
        }
        return new ApacheHttpTransport(x.b().p().n(new e(tlsSslContext)).l(200).k(20).m(new s(ProxySelector.getDefault())).h(oVar).g().f().a(), z10);
    }
}
