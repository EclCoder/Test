package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.h;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.j;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.thrid.okio.l;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends com.mbridge.msdk.thrid.okhttp.internal.http2.g.j implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f33147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f33148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Socket f33149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Socket f33150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q f33151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w f33152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http2.g f33153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okio.e f33154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okio.d f33155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f33156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f33158m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<Reference<g>> f33159n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f33160o = Long.MAX_VALUE;

    public c(i iVar, c0 c0Var) {
        this.f33147b = iVar;
        this.f33148c = c0Var;
    }

    private y e() {
        y yVarA = new y.a().a(this.f33148c.a().k()).a(HttpMethods.CONNECT, (z) null).b("Host", com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f33148c.a().k(), true)).b("Proxy-Connection", "Keep-Alive").b(Command.HTTP_HEADER_USER_AGENT, com.mbridge.msdk.thrid.okhttp.internal.d.a()).a();
        y yVarA2 = this.f33148c.a().g().a(this.f33148c, new a0.a().a(yVarA).a(w.HTTP_1_1).a(TTAdConstant.DOWNLOAD_APP_INFO_CODE).a("Preemptive Authenticate").a(com.mbridge.msdk.thrid.okhttp.internal.c.f33109c).b(-1L).a(-1L).b("Proxy-Authenticate", "OkHttp-Preemptive").a());
        return yVarA2 != null ? yVarA2 : yVarA;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:81:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:0: B:71:0x0082->B:85:?, LOOP_END, SYNTHETIC] */
    public void a(int i10, int i11, int i12, int i13, boolean z10, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws Throwable {
        com.mbridge.msdk.thrid.okhttp.d dVar2;
        o oVar2;
        IOException iOException;
        if (this.f33152g != null) {
            throw new IllegalStateException("already connected");
        }
        List<j> listB = this.f33148c.a().b();
        b bVar = new b(listB);
        if (this.f33148c.a().j() == null) {
            if (!listB.contains(j.f33470j)) {
                throw new e(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strG = this.f33148c.a().k().g();
            if (!com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().b(strG)) {
                throw new e(new UnknownServiceException("CLEARTEXT communication to " + strG + " not permitted by network security policy"));
            }
        } else if (this.f33148c.a().e().contains(w.H2_PRIOR_KNOWLEDGE)) {
            throw new e(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        e eVar = null;
        while (true) {
            try {
                if (this.f33148c.c()) {
                    try {
                        a(i10, i11, i12, dVar, oVar);
                        dVar2 = dVar;
                        oVar2 = oVar;
                        try {
                            if (this.f33149d != null) {
                                break;
                            } else {
                                break;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            iOException = e;
                            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f33150e);
                            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f33149d);
                            this.f33150e = null;
                            this.f33149d = null;
                            this.f33154i = null;
                            this.f33155j = null;
                            this.f33151f = null;
                            this.f33152g = null;
                            this.f33153h = null;
                            oVar2.connectFailed(dVar2, this.f33148c.d(), this.f33148c.b(), null, iOException);
                            if (eVar == null) {
                                eVar = new e(iOException);
                            } else {
                                eVar.a(iOException);
                            }
                            if (z10) {
                                throw eVar;
                            }
                            if (bVar.a(iOException)) {
                                throw eVar;
                            }
                        }
                    } catch (IOException e11) {
                        e = e11;
                        dVar2 = dVar;
                        oVar2 = oVar;
                    }
                } else {
                    dVar2 = dVar;
                    oVar2 = oVar;
                    a(i10, i11, dVar2, oVar2);
                }
                try {
                    a(bVar, i13, dVar2, oVar2);
                    oVar2.connectEnd(dVar2, this.f33148c.d(), this.f33148c.b(), this.f33152g);
                    break;
                } catch (IOException e12) {
                    e = e12;
                    iOException = e;
                    com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f33150e);
                    com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f33149d);
                    this.f33150e = null;
                    this.f33149d = null;
                    this.f33154i = null;
                    this.f33155j = null;
                    this.f33151f = null;
                    this.f33152g = null;
                    this.f33153h = null;
                    oVar2.connectFailed(dVar2, this.f33148c.d(), this.f33148c.b(), null, iOException);
                    if (eVar == null) {
                        eVar = new e(iOException);
                    } else {
                        eVar.a(iOException);
                    }
                    if (z10) {
                        throw eVar;
                    }
                    if (bVar.a(iOException)) {
                        throw eVar;
                    }
                }
            } catch (IOException e13) {
                e = e13;
                dVar2 = dVar;
                oVar2 = oVar;
            }
        }
        if (this.f33148c.c() && this.f33149d == null) {
            throw new e(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.f33153h != null) {
            synchronized (this.f33147b) {
                this.f33158m = this.f33153h.k();
            }
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public q b() {
        return this.f33151f;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public c0 c() {
        return this.f33148c;
    }

    public void d() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f33149d);
    }

    public boolean f() {
        return this.f33153h != null;
    }

    public Socket g() {
        return this.f33150e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f33148c.a().k().g());
        sb2.append(":");
        sb2.append(this.f33148c.a().k().j());
        sb2.append(", proxy=");
        sb2.append(this.f33148c.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f33148c.d());
        sb2.append(" cipherSuite=");
        q qVar = this.f33151f;
        sb2.append(qVar != null ? qVar.a() : DevicePublicKeyStringDef.NONE);
        sb2.append(" protocol=");
        sb2.append(this.f33152g);
        sb2.append('}');
        return sb2.toString();
    }

    private void a(int i10, int i11, int i12, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        y yVarE = e();
        s sVarG = yVarE.g();
        for (int i13 = 0; i13 < 21; i13++) {
            a(i10, i11, dVar, oVar);
            yVarE = a(i11, i12, yVarE, sVarG);
            if (yVarE == null) {
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f33149d);
            this.f33149d = null;
            this.f33155j = null;
            this.f33154i = null;
            oVar.connectEnd(dVar, this.f33148c.d(), this.f33148c.b(), null);
        }
    }

    private void a(int i10, int i11, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        Proxy proxyB = this.f33148c.b();
        this.f33149d = (proxyB.type() == Proxy.Type.DIRECT || proxyB.type() == Proxy.Type.HTTP) ? this.f33148c.a().i().createSocket() : new Socket(proxyB);
        oVar.connectStart(dVar, this.f33148c.d(), proxyB);
        this.f33149d.setSoTimeout(i11);
        try {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f33149d, this.f33148c.d(), i10);
            try {
                this.f33154i = l.a(l.b(this.f33149d));
                this.f33155j = l.a(l.a(this.f33149d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f33148c.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private void a(b bVar, int i10, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws Throwable {
        if (this.f33148c.a().j() == null) {
            List<w> listE = this.f33148c.a().e();
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (listE.contains(wVar)) {
                this.f33150e = this.f33149d;
                this.f33152g = wVar;
                a(i10);
                return;
            } else {
                this.f33150e = this.f33149d;
                this.f33152g = w.HTTP_1_1;
                return;
            }
        }
        oVar.secureConnectStart(dVar);
        a(bVar);
        oVar.secureConnectEnd(dVar, this.f33151f);
        if (this.f33152g == w.HTTP_2) {
            a(i10);
        }
    }

    private void a(int i10) throws SocketException {
        this.f33150e.setSoTimeout(0);
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVarA = new com.mbridge.msdk.thrid.okhttp.internal.http2.g.h(true).a(this.f33150e, this.f33148c.a().k().g(), this.f33154i, this.f33155j).a(this).a(i10).a();
        this.f33153h = gVarA;
        gVarA.m();
    }

    private void a(b bVar) throws Throwable {
        com.mbridge.msdk.thrid.okhttp.a aVarA = this.f33148c.a();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) aVarA.j().createSocket(this.f33149d, aVarA.k().g(), aVarA.k().j(), true);
                try {
                    j jVarA = bVar.a(sSLSocket2);
                    if (jVarA.c()) {
                        com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket2, aVarA.k().g(), aVarA.e());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    q qVarA = q.a(session);
                    if (!aVarA.d().verify(aVarA.k().g(), session)) {
                        List<Certificate> listB = qVarA.b();
                        if (!listB.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) listB.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + aVarA.k().g() + " not verified:\n    certificate: " + com.mbridge.msdk.thrid.okhttp.f.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.mbridge.msdk.thrid.okhttp.internal.tls.d.a(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + aVarA.k().g() + " not verified (no certificates)");
                    }
                    aVarA.a().a(aVarA.k().g(), qVarA.b());
                    String strB = jVarA.c() ? com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().b(sSLSocket2) : null;
                    this.f33150e = sSLSocket2;
                    this.f33154i = l.a(l.b(sSLSocket2));
                    this.f33155j = l.a(l.a(this.f33150e));
                    this.f33151f = qVarA;
                    this.f33152g = strB != null ? w.a(strB) : w.HTTP_1_1;
                    com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket2);
                } catch (AssertionError e10) {
                    e = e10;
                    if (!com.mbridge.msdk.thrid.okhttp.internal.c.a(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket);
                    }
                    com.mbridge.msdk.thrid.okhttp.internal.c.a((Socket) sSLSocket);
                    throw th;
                }
            } catch (AssertionError e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private y a(int i10, int i11, y yVar, s sVar) throws IOException {
        String str = "CONNECT " + com.mbridge.msdk.thrid.okhttp.internal.c.a(sVar, true) + " HTTP/1.1";
        while (true) {
            com.mbridge.msdk.thrid.okhttp.internal.http1.a aVar = new com.mbridge.msdk.thrid.okhttp.internal.http1.a(null, null, this.f33154i, this.f33155j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f33154i.b().a(i10, timeUnit);
            this.f33155j.b().a(i11, timeUnit);
            aVar.a(yVar.c(), str);
            aVar.a();
            a0 a0VarA = aVar.a(false).a(yVar).a();
            long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0VarA);
            if (jA == -1) {
                jA = 0;
            }
            com.mbridge.msdk.thrid.okio.s sVarB = aVar.b(jA);
            com.mbridge.msdk.thrid.okhttp.internal.c.b(sVarB, Integer.MAX_VALUE, timeUnit);
            sVarB.close();
            int iK = a0VarA.k();
            if (iK == 200) {
                if (this.f33154i.a().f() && this.f33155j.a().f()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iK == 407) {
                y yVarA = this.f33148c.a().g().a(this.f33148c, a0VarA);
                if (yVarA != null) {
                    if ("close".equalsIgnoreCase(a0VarA.b("Connection"))) {
                        return yVarA;
                    }
                    yVar = yVarA;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + a0VarA.k());
            }
        }
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, c0 c0Var) {
        if (this.f33159n.size() >= this.f33158m || this.f33156k || !com.mbridge.msdk.thrid.okhttp.internal.a.f33105a.a(this.f33148c.a(), aVar)) {
            return false;
        }
        if (aVar.k().g().equals(c().a().k().g())) {
            return true;
        }
        if (this.f33153h == null || c0Var == null) {
            return false;
        }
        Proxy.Type type = c0Var.b().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || this.f33148c.b().type() != type2 || !this.f33148c.d().equals(c0Var.d()) || c0Var.a().d() != com.mbridge.msdk.thrid.okhttp.internal.tls.d.f33464a || !a(aVar.k())) {
            return false;
        }
        try {
            aVar.a().a(aVar.k().g(), b().b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean a(s sVar) {
        if (sVar.j() != this.f33148c.a().k().j()) {
            return false;
        }
        if (sVar.g().equals(this.f33148c.a().k().g())) {
            return true;
        }
        return this.f33151f != null && com.mbridge.msdk.thrid.okhttp.internal.tls.d.f33464a.a(sVar.g(), (X509Certificate) this.f33151f.b().get(0));
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, g gVar) throws SocketException {
        if (this.f33153h != null) {
            return new com.mbridge.msdk.thrid.okhttp.internal.http2.f(vVar, aVar, gVar, this.f33153h);
        }
        this.f33150e.setSoTimeout(aVar.b());
        com.mbridge.msdk.thrid.okio.t tVarB = this.f33154i.b();
        long jB = aVar.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarB.a(jB, timeUnit);
        this.f33155j.b().a(aVar.c(), timeUnit);
        return new com.mbridge.msdk.thrid.okhttp.internal.http1.a(vVar, gVar, this.f33154i, this.f33155j);
    }

    public boolean a(boolean z10) {
        if (this.f33150e.isClosed() || this.f33150e.isInputShutdown() || this.f33150e.isOutputShutdown()) {
            return false;
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar = this.f33153h;
        if (gVar != null) {
            return gVar.f(System.nanoTime());
        }
        if (z10) {
            try {
                int soTimeout = this.f33150e.getSoTimeout();
                try {
                    this.f33150e.setSoTimeout(1);
                    if (this.f33154i.f()) {
                        this.f33150e.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.f33150e.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th2) {
                    this.f33150e.setSoTimeout(soTimeout);
                    throw th2;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) {
        iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar) {
        synchronized (this.f33147b) {
            this.f33158m = gVar.k();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public w a() {
        return this.f33152g;
    }
}
