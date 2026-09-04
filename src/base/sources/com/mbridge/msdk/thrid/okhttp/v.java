package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class v implements Cloneable {
    static final List<w> A = com.mbridge.msdk.thrid.okhttp.internal.c.a(w.HTTP_2, w.HTTP_1_1);
    static final List<j> B = com.mbridge.msdk.thrid.okhttp.internal.c.a(j.f33468h, j.f33470j);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final m f33539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Proxy f33540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<w> f33541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final List<j> f33542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<t> f33543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<t> f33544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final o.c f33545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final ProxySelector f33546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final l f33547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final SocketFactory f33548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final SSLSocketFactory f33549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.tls.c f33550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final HostnameVerifier f33551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final f f33552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.b f33553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.b f33554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final i f33555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final n f33556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final boolean f33557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final boolean f33558t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final boolean f33559u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final int f33560v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final int f33561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final int f33562x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final int f33563y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final int f33564z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends com.mbridge.msdk.thrid.okhttp.internal.a {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str) {
            aVar.a(str);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void b(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            iVar.b(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str, String str2) {
            aVar.b(str, str2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            return iVar.a(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
            return iVar.a(aVar, gVar, c0Var);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.a aVar2) {
            return aVar.a(aVar2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public Socket a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
            return iVar.a(aVar, gVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.d a(i iVar) {
            return iVar.f33102e;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public int a(a0.a aVar) {
            return aVar.f32971c;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(j jVar, SSLSocket sSLSocket, boolean z10) {
            jVar.a(sSLSocket, z10);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public IOException a(d dVar, IOException iOException) {
            return ((x) dVar).a(iOException);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        m f33565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Proxy f33566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<w> f33567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List<j> f33568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final List<t> f33569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List<t> f33570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        o.c f33571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ProxySelector f33572h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        l f33573i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        SocketFactory f33574j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        SSLSocketFactory f33575k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.internal.tls.c f33576l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        HostnameVerifier f33577m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        f f33578n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.b f33579o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.b f33580p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        i f33581q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        n f33582r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f33583s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f33584t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f33585u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f33586v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f33587w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f33588x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f33589y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f33590z;

        public b() {
            this.f33569e = new ArrayList();
            this.f33570f = new ArrayList();
            this.f33565a = new m();
            this.f33567c = v.A;
            this.f33568d = v.B;
            this.f33571g = o.factory(o.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f33572h = proxySelector;
            if (proxySelector == null) {
                this.f33572h = new com.mbridge.msdk.thrid.okhttp.internal.proxy.a();
            }
            this.f33573i = l.f33492a;
            this.f33574j = SocketFactory.getDefault();
            this.f33577m = com.mbridge.msdk.thrid.okhttp.internal.tls.d.f33464a;
            this.f33578n = f.f33018c;
            com.mbridge.msdk.thrid.okhttp.b bVar = com.mbridge.msdk.thrid.okhttp.b.f32981a;
            this.f33579o = bVar;
            this.f33580p = bVar;
            this.f33581q = new i();
            this.f33582r = n.f33501a;
            this.f33583s = true;
            this.f33584t = true;
            this.f33585u = true;
            this.f33586v = 0;
            this.f33587w = 10000;
            this.f33588x = 10000;
            this.f33589y = 10000;
            this.f33590z = 0;
        }

        public b a(long j10, TimeUnit timeUnit) {
            this.f33586v = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b b(long j10, TimeUnit timeUnit) {
            this.f33587w = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b c(long j10, TimeUnit timeUnit) {
            this.f33590z = com.mbridge.msdk.thrid.okhttp.internal.c.a("interval", j10, timeUnit);
            return this;
        }

        public b d(long j10, TimeUnit timeUnit) {
            this.f33588x = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b e(long j10, TimeUnit timeUnit) {
            this.f33589y = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b a(n nVar) {
            if (nVar == null) {
                throw new NullPointerException("dns == null");
            }
            this.f33582r = nVar;
            return this;
        }

        public b b(boolean z10) {
            this.f33585u = z10;
            return this;
        }

        public b a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f33577m = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public b a(i iVar) {
            if (iVar != null) {
                this.f33581q = iVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        public b a(boolean z10) {
            this.f33584t = z10;
            return this;
        }

        public b a(m mVar) {
            if (mVar != null) {
                this.f33565a = mVar;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        public b a(List<w> list) {
            ArrayList arrayList = new ArrayList(list);
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(wVar) && !arrayList.contains(w.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(wVar) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (!arrayList.contains(w.HTTP_1_0)) {
                if (!arrayList.contains(null)) {
                    arrayList.remove(w.SPDY_3);
                    this.f33567c = Collections.unmodifiableList(arrayList);
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            }
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
        }

        public b a(o oVar) {
            if (oVar != null) {
                this.f33571g = o.factory(oVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        public v a() {
            return new v(this);
        }

        b(v vVar) {
            ArrayList arrayList = new ArrayList();
            this.f33569e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f33570f = arrayList2;
            this.f33565a = vVar.f33539a;
            this.f33566b = vVar.f33540b;
            this.f33567c = vVar.f33541c;
            this.f33568d = vVar.f33542d;
            arrayList.addAll(vVar.f33543e);
            arrayList2.addAll(vVar.f33544f);
            this.f33571g = vVar.f33545g;
            this.f33572h = vVar.f33546h;
            this.f33573i = vVar.f33547i;
            this.f33574j = vVar.f33548j;
            this.f33575k = vVar.f33549k;
            this.f33576l = vVar.f33550l;
            this.f33577m = vVar.f33551m;
            this.f33578n = vVar.f33552n;
            this.f33579o = vVar.f33553o;
            this.f33580p = vVar.f33554p;
            this.f33581q = vVar.f33555q;
            this.f33582r = vVar.f33556r;
            this.f33583s = vVar.f33557s;
            this.f33584t = vVar.f33558t;
            this.f33585u = vVar.f33559u;
            this.f33586v = vVar.f33560v;
            this.f33587w = vVar.f33561w;
            this.f33588x = vVar.f33562x;
            this.f33589y = vVar.f33563y;
            this.f33590z = vVar.f33564z;
        }
    }

    static {
        com.mbridge.msdk.thrid.okhttp.internal.a.f33105a = new a();
    }

    public v() {
        this(new b());
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextE = com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().e();
            sSLContextE.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextE.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("No System TLS", (Exception) e10);
        }
    }

    public SocketFactory A() {
        return this.f33548j;
    }

    public SSLSocketFactory B() {
        return this.f33549k;
    }

    public int C() {
        return this.f33563y;
    }

    public int b() {
        return this.f33560v;
    }

    public f c() {
        return this.f33552n;
    }

    public int e() {
        return this.f33561w;
    }

    public i f() {
        return this.f33555q;
    }

    public List<j> g() {
        return this.f33542d;
    }

    public l i() {
        return this.f33547i;
    }

    public m j() {
        return this.f33539a;
    }

    public n k() {
        return this.f33556r;
    }

    public o.c l() {
        return this.f33545g;
    }

    public boolean m() {
        return this.f33558t;
    }

    public boolean n() {
        return this.f33557s;
    }

    public HostnameVerifier o() {
        return this.f33551m;
    }

    public List<t> p() {
        return this.f33543e;
    }

    com.mbridge.msdk.thrid.okhttp.internal.cache.c q() {
        return null;
    }

    public List<t> r() {
        return this.f33544f;
    }

    public b s() {
        return new b(this);
    }

    public int t() {
        return this.f33564z;
    }

    public List<w> u() {
        return this.f33541c;
    }

    public Proxy v() {
        return this.f33540b;
    }

    public com.mbridge.msdk.thrid.okhttp.b w() {
        return this.f33553o;
    }

    public ProxySelector x() {
        return this.f33546h;
    }

    public int y() {
        return this.f33562x;
    }

    public boolean z() {
        return this.f33559u;
    }

    v(b bVar) {
        boolean z10;
        this.f33539a = bVar.f33565a;
        this.f33540b = bVar.f33566b;
        this.f33541c = bVar.f33567c;
        List<j> list = bVar.f33568d;
        this.f33542d = list;
        this.f33543e = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f33569e);
        this.f33544f = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f33570f);
        this.f33545g = bVar.f33571g;
        this.f33546h = bVar.f33572h;
        this.f33547i = bVar.f33573i;
        this.f33548j = bVar.f33574j;
        Iterator<j> it = list.iterator();
        loop0: while (true) {
            z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z10 = (z10 || it.next().b()) ? true : z10;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f33575k;
        if (sSLSocketFactory == null && z10) {
            X509TrustManager x509TrustManagerA = com.mbridge.msdk.thrid.okhttp.internal.c.a();
            this.f33549k = a(x509TrustManagerA);
            this.f33550l = com.mbridge.msdk.thrid.okhttp.internal.tls.c.a(x509TrustManagerA);
        } else {
            this.f33549k = sSLSocketFactory;
            this.f33550l = bVar.f33576l;
        }
        if (this.f33549k != null) {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f33549k);
        }
        this.f33551m = bVar.f33577m;
        this.f33552n = bVar.f33578n.a(this.f33550l);
        this.f33553o = bVar.f33579o;
        this.f33554p = bVar.f33580p;
        this.f33555q = bVar.f33581q;
        this.f33556r = bVar.f33582r;
        this.f33557s = bVar.f33583s;
        this.f33558t = bVar.f33584t;
        this.f33559u = bVar.f33585u;
        this.f33560v = bVar.f33586v;
        this.f33561w = bVar.f33587w;
        this.f33562x = bVar.f33588x;
        this.f33563y = bVar.f33589y;
        this.f33564z = bVar.f33590z;
        if (this.f33543e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f33543e);
        }
        if (this.f33544f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f33544f);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.b a() {
        return this.f33554p;
    }

    public d a(y yVar) {
        return x.a(this, yVar, false);
    }
}
