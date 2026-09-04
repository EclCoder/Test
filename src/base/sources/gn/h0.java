package gn;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f39627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f39628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f39629c;

    public h0(a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.s.h(address, "address");
        kotlin.jvm.internal.s.h(proxy, "proxy");
        kotlin.jvm.internal.s.h(socketAddress, "socketAddress");
        this.f39627a = address;
        this.f39628b = proxy;
        this.f39629c = socketAddress;
    }

    public final a a() {
        return this.f39627a;
    }

    public final Proxy b() {
        return this.f39628b;
    }

    public final boolean c() {
        if (this.f39628b.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.f39627a.k() != null || this.f39627a.f().contains(c0.H2_PRIOR_KNOWLEDGE);
    }

    public final InetSocketAddress d() {
        return this.f39629c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.s.c(h0Var.f39627a, this.f39627a) && kotlin.jvm.internal.s.c(h0Var.f39628b, this.f39628b) && kotlin.jvm.internal.s.c(h0Var.f39629c, this.f39629c);
    }

    public int hashCode() {
        return ((((527 + this.f39627a.hashCode()) * 31) + this.f39628b.hashCode()) * 31) + this.f39629c.hashCode();
    }

    public String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        String strG = this.f39627a.l().g();
        InetAddress address = this.f39629c.getAddress();
        String strK = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : hn.k.k(hostAddress);
        if (bm.r.S(strG, ':', false, 2, null)) {
            sb2.append("[");
            sb2.append(strG);
            sb2.append("]");
        } else {
            sb2.append(strG);
        }
        if (this.f39627a.l().l() != this.f39629c.getPort() || kotlin.jvm.internal.s.c(strG, strK)) {
            sb2.append(":");
            sb2.append(this.f39627a.l().l());
        }
        if (!kotlin.jvm.internal.s.c(strG, strK)) {
            if (kotlin.jvm.internal.s.c(this.f39628b, Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (strK == null) {
                sb2.append("<unresolved>");
            } else if (bm.r.S(strK, ':', false, 2, null)) {
                sb2.append("[");
                sb2.append(strK);
                sb2.append("]");
            } else {
                sb2.append(strK);
            }
            sb2.append(":");
            sb2.append(this.f39629c.getPort());
        }
        return sb2.toString();
    }
}
