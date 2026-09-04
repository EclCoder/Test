package com.google.api.client.googleapis.apache;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.http.apache.ApacheHttpTransport;
import com.google.api.client.util.SslUtils;
import java.net.ProxySelector;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import no.e;
import org.apache.http.impl.client.x;
import xo.o;
import xo.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class GoogleApacheHttpTransport {
    private GoogleApacheHttpTransport() {
    }

    public static ApacheHttpTransport newTrustedTransport() throws KeyStoreException, KeyManagementException {
        e eVarA = e.c().b(8192).c(8192).a();
        o oVar = new o(-1L, TimeUnit.MILLISECONDS);
        oVar.s(-1);
        KeyStore certificateTrustStore = GoogleUtils.getCertificateTrustStore();
        SSLContext tlsSslContext = SslUtils.getTlsSslContext();
        SslUtils.initSslContext(tlsSslContext, certificateTrustStore, SslUtils.getPkixTrustManagerFactory());
        return new ApacheHttpTransport(x.b().p().n(new org.apache.http.conn.ssl.e(tlsSslContext)).j(eVarA).l(200).k(20).m(new s(ProxySelector.getDefault())).h(oVar).g().f().a());
    }
}
