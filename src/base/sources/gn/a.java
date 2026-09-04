package gn;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f39412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SocketFactory f39413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f39414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HostnameVerifier f39415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f39416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f39417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Proxy f39418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ProxySelector f39419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y f39420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f39421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f39422k;

    public final h a() {
        return this.f39416e;
    }

    public final List b() {
        return this.f39422k;
    }

    public final r c() {
        return this.f39412a;
    }

    public final boolean d(a that) {
        kotlin.jvm.internal.s.h(that, "that");
        return kotlin.jvm.internal.s.c(this.f39412a, that.f39412a) && kotlin.jvm.internal.s.c(this.f39417f, that.f39417f) && kotlin.jvm.internal.s.c(this.f39421j, that.f39421j) && kotlin.jvm.internal.s.c(this.f39422k, that.f39422k) && kotlin.jvm.internal.s.c(this.f39419h, that.f39419h) && kotlin.jvm.internal.s.c(this.f39418g, that.f39418g) && kotlin.jvm.internal.s.c(this.f39414c, that.f39414c) && kotlin.jvm.internal.s.c(this.f39415d, that.f39415d) && kotlin.jvm.internal.s.c(this.f39416e, that.f39416e) && this.f39420i.l() == that.f39420i.l();
    }

    public final HostnameVerifier e() {
        return this.f39415d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.s.c(this.f39420i, aVar.f39420i) && d(aVar);
    }

    public final List f() {
        return this.f39421j;
    }

    public final Proxy g() {
        return this.f39418g;
    }

    public final b h() {
        return this.f39417f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f39420i.hashCode()) * 31) + this.f39412a.hashCode()) * 31) + this.f39417f.hashCode()) * 31) + this.f39421j.hashCode()) * 31) + this.f39422k.hashCode()) * 31) + this.f39419h.hashCode()) * 31) + Objects.hashCode(this.f39418g)) * 31) + Objects.hashCode(this.f39414c)) * 31) + Objects.hashCode(this.f39415d)) * 31) + Objects.hashCode(this.f39416e);
    }

    public final ProxySelector i() {
        return this.f39419h;
    }

    public final SocketFactory j() {
        return this.f39413b;
    }

    public final SSLSocketFactory k() {
        return this.f39414c;
    }

    public final y l() {
        return this.f39420i;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f39420i.g());
        sb3.append(':');
        sb3.append(this.f39420i.l());
        sb3.append(", ");
        if (this.f39418g != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f39418g;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f39419h;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append('}');
        return sb3.toString();
    }

    public a(String uriHost, int i10, r dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, h hVar, b proxyAuthenticator, Proxy proxy, List list, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.s.h(uriHost, "uriHost");
        kotlin.jvm.internal.s.h(dns, "dns");
        kotlin.jvm.internal.s.h(socketFactory, "socketFactory");
        kotlin.jvm.internal.s.h(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.s.h(list, WwUgngZLNA.DPrVu);
        kotlin.jvm.internal.s.h(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.s.h(proxySelector, "proxySelector");
        this.f39412a = dns;
        this.f39413b = socketFactory;
        this.f39414c = sSLSocketFactory;
        this.f39415d = hostnameVerifier;
        this.f39416e = hVar;
        this.f39417f = proxyAuthenticator;
        this.f39418g = proxy;
        this.f39419h = proxySelector;
        this.f39420i = new y.a().q(sSLSocketFactory != null ? "https" : "http").e(uriHost).l(i10).a();
        this.f39421j = hn.p.v(list);
        this.f39422k = hn.p.v(connectionSpecs);
    }
}
