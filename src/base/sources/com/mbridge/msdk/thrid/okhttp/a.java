package com.mbridge.msdk.thrid.okhttp;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s f32945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n f32946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final SocketFactory f32947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f32948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<w> f32949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<j> f32950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final ProxySelector f32951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Proxy f32952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final SSLSocketFactory f32953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final HostnameVerifier f32954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final f f32955k;

    public a(String str, int i10, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List<w> list, List<j> list2, ProxySelector proxySelector) {
        this.f32945a = new s.a().f(sSLSocketFactory != null ? "https" : "http").b(str).a(i10).a();
        if (nVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f32946b = nVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f32947c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f32948d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f32949e = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f32950f = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f32951g = proxySelector;
        this.f32952h = proxy;
        this.f32953i = sSLSocketFactory;
        this.f32954j = hostnameVerifier;
        this.f32955k = fVar;
    }

    public f a() {
        return this.f32955k;
    }

    public List<j> b() {
        return this.f32950f;
    }

    public n c() {
        return this.f32946b;
    }

    public HostnameVerifier d() {
        return this.f32954j;
    }

    public List<w> e() {
        return this.f32949e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f32945a.equals(aVar.f32945a) && a(aVar);
    }

    public Proxy f() {
        return this.f32952h;
    }

    public b g() {
        return this.f32948d;
    }

    public ProxySelector h() {
        return this.f32951g;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.f32945a.hashCode() + 527) * 31) + this.f32946b.hashCode()) * 31) + this.f32948d.hashCode()) * 31) + this.f32949e.hashCode()) * 31) + this.f32950f.hashCode()) * 31) + this.f32951g.hashCode()) * 31;
        Proxy proxy = this.f32952h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f32953i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f32954j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f32955k;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public SocketFactory i() {
        return this.f32947c;
    }

    public SSLSocketFactory j() {
        return this.f32953i;
    }

    public s k() {
        return this.f32945a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f32945a.g());
        sb2.append(":");
        sb2.append(this.f32945a.j());
        if (this.f32952h != null) {
            sb2.append(", proxy=");
            sb2.append(this.f32952h);
        } else {
            sb2.append(", proxySelector=");
            sb2.append(this.f32951g);
        }
        sb2.append("}");
        return sb2.toString();
    }

    boolean a(a aVar) {
        return this.f32946b.equals(aVar.f32946b) && this.f32948d.equals(aVar.f32948d) && this.f32949e.equals(aVar.f32949e) && this.f32950f.equals(aVar.f32950f) && this.f32951g.equals(aVar.f32951g) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f32952h, aVar.f32952h) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f32953i, aVar.f32953i) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f32954j, aVar.f32954j) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f32955k, aVar.f32955k) && k().j() == aVar.k().j();
    }
}
