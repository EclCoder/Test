package ln;

import gn.h0;
import gn.y;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f44850i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gn.a f44851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f44852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f44853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f44854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f44855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f44856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f44857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f44858h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            kotlin.jvm.internal.s.h(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                kotlin.jvm.internal.s.g(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            kotlin.jvm.internal.s.g(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f44859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f44860b;

        public b(List routes) {
            kotlin.jvm.internal.s.h(routes, "routes");
            this.f44859a = routes;
        }

        public final List a() {
            return this.f44859a;
        }

        public final boolean b() {
            return this.f44860b < this.f44859a.size();
        }

        public final h0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.f44859a;
            int i10 = this.f44860b;
            this.f44860b = i10 + 1;
            return (h0) list.get(i10);
        }
    }

    public u(gn.a address, s routeDatabase, m call, boolean z10) {
        kotlin.jvm.internal.s.h(address, "address");
        kotlin.jvm.internal.s.h(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.s.h(call, "call");
        this.f44851a = address;
        this.f44852b = routeDatabase;
        this.f44853c = call;
        this.f44854d = z10;
        this.f44855e = gl.r.l();
        this.f44857g = gl.r.l();
        this.f44858h = new ArrayList();
        f(address.l(), address.g());
    }

    private final boolean b() {
        return this.f44856f < this.f44855e.size();
    }

    private final Proxy d() throws SocketException, UnknownHostException {
        if (b()) {
            List list = this.f44855e;
            int i10 = this.f44856f;
            this.f44856f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f44851a.l().g() + "; exhausted proxy configurations: " + this.f44855e);
    }

    private final void e(Proxy proxy) throws SocketException, UnknownHostException {
        String strG;
        int iL;
        List listA;
        ArrayList arrayList = new ArrayList();
        this.f44857g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strG = this.f44851a.l().g();
            iL = this.f44851a.l().l();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strG = f44850i.a(inetSocketAddress);
            iL = inetSocketAddress.getPort();
        }
        if (1 > iL || iL >= 65536) {
            throw new SocketException("No route to " + strG + ':' + iL + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strG, iL));
            return;
        }
        if (hn.k.a(strG)) {
            listA = gl.r.e(InetAddress.getByName(strG));
        } else {
            this.f44853c.l().p(this.f44853c, strG);
            listA = this.f44851a.c().a(strG);
            if (listA.isEmpty()) {
                throw new UnknownHostException(this.f44851a.c() + " returned no addresses for " + strG);
            }
            this.f44853c.l().o(this.f44853c, strG, listA);
        }
        if (this.f44854d) {
            listA = l.a(listA);
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iL));
        }
    }

    private final void f(y yVar, Proxy proxy) {
        this.f44853c.l().s(this.f44853c, yVar);
        this.f44855e = g(proxy, yVar, this);
        this.f44856f = 0;
        this.f44853c.l().r(this.f44853c, yVar, this.f44855e);
    }

    private static final List g(Proxy proxy, y yVar, u uVar) {
        if (proxy != null) {
            return gl.r.e(proxy);
        }
        URI uriQ = yVar.q();
        if (uriQ.getHost() == null) {
            return hn.p.l(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = uVar.f44851a.i().select(uriQ);
        List<Proxy> list = listSelect;
        return (list == null || list.isEmpty()) ? hn.p.l(Proxy.NO_PROXY) : hn.p.v(listSelect);
    }

    public final boolean a() {
        return b() || !this.f44858h.isEmpty();
    }

    public final b c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator it = this.f44857g.iterator();
            while (it.hasNext()) {
                h0 h0Var = new h0(this.f44851a, proxyD, (InetSocketAddress) it.next());
                if (this.f44852b.c(h0Var)) {
                    this.f44858h.add(h0Var);
                } else {
                    arrayList.add(h0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            gl.r.z(arrayList, this.f44858h);
            this.f44858h.clear();
        }
        return new b(arrayList);
    }
}
