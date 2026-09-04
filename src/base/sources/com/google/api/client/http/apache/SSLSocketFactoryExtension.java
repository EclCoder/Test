package com.google.api.client.http.apache;

import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class SSLSocketFactoryExtension extends h {
    private final SSLSocketFactory socketFactory;

    SSLSocketFactoryExtension(SSLContext sSLContext) {
        super(null);
        this.socketFactory = sSLContext.getSocketFactory();
    }

    public Socket createSocket() {
        return this.socketFactory.createSocket();
    }

    public Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        SSLSocket sSLSocket = (SSLSocket) this.socketFactory.createSocket(socket, str, i10, z10);
        getHostnameVerifier().b(str, sSLSocket);
        return sSLSocket;
    }
}
