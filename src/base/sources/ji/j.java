package ji;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f42569a;

    public j(TrustManager[] trustManagerArr) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance(org.apache.http.conn.ssl.h.TLS);
        sSLContext.init(null, trustManagerArr, trustManagerArr != null ? new SecureRandom() : null);
        this.f42569a = sSLContext.getSocketFactory();
    }

    private final Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.f42569a.createSocket();
        s.g(socketCreateSocket, "createSocket(...)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f42569a.getDefaultCipherSuites();
        s.g(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f42569a.getSupportedCipherSuites();
        s.g(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket s10, String host, int i10, boolean z10) throws IOException {
        s.h(s10, "s");
        s.h(host, "host");
        Socket socketCreateSocket = this.f42569a.createSocket(s10, host, i10, z10);
        s.g(socketCreateSocket, "createSocket(...)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i10) throws IOException {
        s.h(host, "host");
        Socket socketCreateSocket = this.f42569a.createSocket(host, i10);
        s.g(socketCreateSocket, "createSocket(...)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i10, InetAddress localHost, int i11) throws IOException {
        s.h(host, "host");
        s.h(localHost, "localHost");
        Socket socketCreateSocket = this.f42569a.createSocket(host, i10, localHost, i11);
        s.g(socketCreateSocket, "createSocket(...)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress host, int i10) throws IOException {
        s.h(host, "host");
        Socket socketCreateSocket = this.f42569a.createSocket(host, i10);
        s.g(socketCreateSocket, "createSocket(...)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress address, int i10, InetAddress localAddress, int i11) throws IOException {
        s.h(address, "address");
        s.h(localAddress, "localAddress");
        Socket socketCreateSocket = this.f42569a.createSocket(address, i10, localAddress, i11);
        s.g(socketCreateSocket, "createSocket(...)");
        return a(socketCreateSocket);
    }
}
