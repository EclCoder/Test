package uj;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import javax.net.ssl.TrustManager;
import ji.j;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f54691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TrustManager[] f54692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Socket f54693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BufferedInputStream f54694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BufferedOutputStream f54695h;

    public b(String host, int i10, boolean z10, TrustManager[] trustManagerArr) {
        s.h(host, "host");
        this.f54689b = host;
        this.f54690c = i10;
        this.f54691d = z10;
        this.f54692e = trustManagerArr;
        this.f54693f = new Socket();
        this.f54694g = new BufferedInputStream(new ByteArrayInputStream(new byte[0]), 8192);
        this.f54695h = new BufferedOutputStream(new ByteArrayOutputStream(), 8192);
    }

    @Override // uj.a
    public void a() {
        try {
            if (this.f54693f.isConnected()) {
                this.f54693f.getInputStream().close();
                this.f54694g.close();
                this.f54695h.close();
                this.f54693f.close();
            }
        } catch (Exception unused) {
        }
    }

    @Override // uj.a
    public void b() throws IOException {
        if (this.f54691d) {
            try {
                this.f54693f = new j(this.f54692e).createSocket(this.f54689b, this.f54690c);
            } catch (GeneralSecurityException e10) {
                throw new IOException("Create SSL socket failed: " + e10.getMessage());
            }
        } else {
            this.f54693f = new Socket();
            this.f54693f.connect(new InetSocketAddress(this.f54689b, this.f54690c), g());
        }
        OutputStream outputStream = this.f54693f.getOutputStream();
        s.g(outputStream, "getOutputStream(...)");
        this.f54695h = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        InputStream inputStream = this.f54693f.getInputStream();
        s.g(inputStream, "getInputStream(...)");
        this.f54694g = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
        this.f54693f.setSoTimeout(g());
    }

    @Override // uj.a
    public void c(boolean z10) throws IOException {
        f().flush();
    }

    @Override // uj.a
    public InputStream e() {
        return this.f54694g;
    }

    @Override // uj.a
    public OutputStream f() {
        return this.f54695h;
    }

    @Override // uj.a
    public boolean h() {
        return this.f54693f.isConnected();
    }

    @Override // uj.a
    public boolean i() {
        InetAddress inetAddress = this.f54693f.getInetAddress();
        if (inetAddress != null) {
            return inetAddress.isReachable(5000);
        }
        return false;
    }
}
