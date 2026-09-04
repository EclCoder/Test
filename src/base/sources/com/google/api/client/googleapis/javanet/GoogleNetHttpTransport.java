package com.google.api.client.googleapis.javanet;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.mtls.MtlsProvider;
import com.google.api.client.googleapis.mtls.MtlsUtils;
import com.google.api.client.http.javanet.NetHttpTransport;
import java.security.KeyStore;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class GoogleNetHttpTransport {
    private GoogleNetHttpTransport() {
    }

    public static NetHttpTransport newTrustedTransport() {
        return newTrustedTransport(MtlsUtils.getDefaultMtlsProvider());
    }

    public static NetHttpTransport newTrustedTransport(MtlsProvider mtlsProvider) {
        KeyStore keyStore;
        String keyStorePassword;
        if (mtlsProvider.useMtlsClientCertificate()) {
            keyStore = mtlsProvider.getKeyStore();
            keyStorePassword = mtlsProvider.getKeyStorePassword();
        } else {
            keyStore = null;
            keyStorePassword = null;
        }
        return (keyStore == null || keyStorePassword == null) ? new NetHttpTransport.Builder().trustCertificates(GoogleUtils.getCertificateTrustStore()).build() : new NetHttpTransport.Builder().trustCertificates(GoogleUtils.getCertificateTrustStore(), keyStore, keyStorePassword).build();
    }
}
