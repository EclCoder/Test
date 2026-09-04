package org.apache.http.conn.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.KeyStore;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import oo.n;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class h implements so.a, ro.f, ro.b, ro.c {
    public static final String SSL = "SSL";
    public static final String SSLV2 = "SSLv2";
    public static final String TLS = "TLS";
    private volatile l hostnameVerifier;
    private final ro.a nameResolver;
    private final javax.net.ssl.SSLSocketFactory socketfactory;
    private final String[] supportedCipherSuites;
    private final String[] supportedProtocols;
    public static final l ALLOW_ALL_HOSTNAME_VERIFIER = new b();
    public static final l BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new c();
    public static final l STRICT_HOSTNAME_VERIFIER = new i();

    public h(KeyStore keyStore) {
        this(g.b().b(keyStore).a(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    private void a(SSLSocket sSLSocket) {
        String[] strArr = this.supportedProtocols;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.supportedCipherSuites;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        prepareSocket(sSLSocket);
    }

    private static String[] b(String str) {
        if (ip.g.b(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    private void c(SSLSocket sSLSocket, String str) throws IOException {
        try {
            this.hostnameVerifier.b(str, sSLSocket);
        } catch (IOException e10) {
            try {
                sSLSocket.close();
            } catch (Exception unused) {
            }
            throw e10;
        }
    }

    public static h getSocketFactory() {
        return new h(g.a(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public static h getSystemSocketFactory() {
        return new h((javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault(), b(System.getProperty("https.protocols")), b(System.getProperty("https.cipherSuites")), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, ep.d dVar) throws SocketException {
        ip.a.h(inetSocketAddress, "Remote address");
        ip.a.h(dVar, "HTTP parameters");
        co.l lVarD = inetSocketAddress instanceof n ? ((n) inetSocketAddress).d() : new co.l(inetSocketAddress.getHostName(), inetSocketAddress.getPort(), "https");
        int iB = ep.c.b(dVar);
        int iA = ep.c.a(dVar);
        socket.setSoTimeout(iB);
        return connectSocket(iA, socket, lVarD, inetSocketAddress, inetSocketAddress2, (gp.f) null);
    }

    public Socket createLayeredSocket(Socket socket, String str, int i10, ep.d dVar) {
        return createLayeredSocket(socket, str, i10, (gp.f) null);
    }

    public Socket createSocket(ep.d dVar) {
        return createSocket((gp.f) null);
    }

    public l getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public boolean isSecure(Socket socket) {
        ip.a.h(socket, "Socket");
        ip.b.a(socket instanceof SSLSocket, "Socket not created by this factory");
        ip.b.a(!socket.isClosed(), "Socket is closed");
        return true;
    }

    public void setHostnameVerifier(l lVar) {
        ip.a.h(lVar, "Hostname verifier");
        this.hostnameVerifier = lVar;
    }

    public h(SSLContext sSLContext, l lVar) {
        this(((SSLContext) ip.a.h(sSLContext, "SSL context")).getSocketFactory(), null, null, lVar);
    }

    public Socket createLayeredSocket(Socket socket, String str, int i10, boolean z10) {
        return createLayeredSocket(socket, str, i10, (gp.f) null);
    }

    public Socket createSocket(gp.f fVar) {
        return SocketFactory.getDefault().createSocket();
    }

    public h(javax.net.ssl.SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, l lVar) {
        this.socketfactory = (javax.net.ssl.SSLSocketFactory) ip.a.h(sSLSocketFactory, "SSL socket factory");
        this.supportedProtocols = strArr;
        this.supportedCipherSuites = strArr2;
        this.hostnameVerifier = lVar == null ? BROWSER_COMPATIBLE_HOSTNAME_VERIFIER : lVar;
    }

    public Socket createLayeredSocket(Socket socket, String str, int i10, gp.f fVar) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.socketfactory.createSocket(socket, str, i10, true);
        a(sSLSocket);
        sSLSocket.startHandshake();
        c(sSLSocket, str);
        return sSLSocket;
    }

    public Socket connectSocket(Socket socket, String str, int i10, InetAddress inetAddress, int i11, ep.d dVar) throws UnknownHostException {
        InetSocketAddress inetSocketAddress;
        InetAddress byName = InetAddress.getByName(str);
        if (inetAddress != null || i11 > 0) {
            if (i11 <= 0) {
                i11 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i11);
        } else {
            inetSocketAddress = null;
        }
        return connectSocket(socket, new n(new co.l(str, i10), byName, i10), inetSocketAddress, dVar);
    }

    public Socket connectSocket(int i10, Socket socket, co.l lVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, gp.f fVar) throws IOException {
        ip.a.h(lVar, "HTTP host");
        ip.a.h(inetSocketAddress, "Remote address");
        if (socket == null) {
            socket = createSocket(fVar);
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            socket.connect(inetSocketAddress, i10);
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                sSLSocket.startHandshake();
                c(sSLSocket, lVar.i());
                return socket;
            }
            return createLayeredSocket(socket, lVar.i(), inetSocketAddress.getPort(), fVar);
        } catch (SocketTimeoutException unused) {
            throw new ConnectTimeoutException("Connect to " + inetSocketAddress + " timed out");
        }
    }

    protected void prepareSocket(SSLSocket sSLSocket) {
    }
}
