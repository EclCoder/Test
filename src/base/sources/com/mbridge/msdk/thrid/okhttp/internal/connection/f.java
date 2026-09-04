package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.a f33164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f33165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f33166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f33167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<Proxy> f33168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<InetSocketAddress> f33170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<c0> f33171h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c0> f33172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f33173b = 0;

        a(List<c0> list) {
            this.f33172a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.f33172a);
        }

        public boolean b() {
            return this.f33173b < this.f33172a.size();
        }

        public c0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<c0> list = this.f33172a;
            int i10 = this.f33173b;
            this.f33173b = i10 + 1;
            return list.get(i10);
        }
    }

    public f(com.mbridge.msdk.thrid.okhttp.a aVar, d dVar, com.mbridge.msdk.thrid.okhttp.d dVar2, o oVar) {
        List list = Collections.EMPTY_LIST;
        this.f33168e = list;
        this.f33170g = list;
        this.f33171h = new ArrayList();
        this.f33164a = aVar;
        this.f33165b = dVar;
        this.f33166c = dVar2;
        this.f33167d = oVar;
        a(aVar.k(), aVar.f());
    }

    private boolean b() {
        return this.f33169f < this.f33168e.size();
    }

    private Proxy d() throws SocketException, UnknownHostException {
        if (b()) {
            List<Proxy> list = this.f33168e;
            int i10 = this.f33169f;
            this.f33169f = i10 + 1;
            Proxy proxy = list.get(i10);
            a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f33164a.k().g() + "; exhausted proxy configurations: " + this.f33168e);
    }

    public boolean a() {
        return b() || !this.f33171h.isEmpty();
    }

    public a c() throws SocketException, UnknownHostException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            int size = this.f33170g.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var = new c0(this.f33164a, proxyD, this.f33170g.get(i10));
                if (this.f33165b.c(c0Var)) {
                    this.f33171h.add(c0Var);
                } else {
                    arrayList.add(c0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f33171h);
            this.f33171h.clear();
        }
        return new a(arrayList);
    }

    public void a(c0 c0Var, IOException iOException) {
        if (c0Var.b().type() != Proxy.Type.DIRECT && this.f33164a.h() != null) {
            this.f33164a.h().connectFailed(this.f33164a.k().n(), c0Var.b().address(), iOException);
        }
        this.f33165b.b(c0Var);
    }

    private void a(s sVar, Proxy proxy) {
        List<Proxy> listA;
        if (proxy != null) {
            this.f33168e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f33164a.h().select(sVar.n());
            if (listSelect != null && !listSelect.isEmpty()) {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(listSelect);
            } else {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(Proxy.NO_PROXY);
            }
            this.f33168e = listA;
        }
        this.f33169f = 0;
    }

    private void a(Proxy proxy) throws SocketException, UnknownHostException {
        String strG;
        int iJ;
        this.f33170g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress socketAddressAddress = proxy.address();
            if (socketAddressAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strG = a(inetSocketAddress);
                iJ = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
        } else {
            strG = this.f33164a.k().g();
            iJ = this.f33164a.k().j();
        }
        if (iJ >= 1 && iJ <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f33170g.add(InetSocketAddress.createUnresolved(strG, iJ));
                return;
            }
            this.f33167d.dnsStart(this.f33166c, strG);
            List<InetAddress> listA = this.f33164a.c().a(strG);
            if (!listA.isEmpty()) {
                this.f33167d.dnsEnd(this.f33166c, strG, listA);
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f33170g.add(new InetSocketAddress(listA.get(i10), iJ));
                }
                return;
            }
            throw new UnknownHostException(this.f33164a.c() + " returned no addresses for " + strG);
        }
        throw new SocketException("No route to " + strG + ":" + iJ + "; port is out of range");
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
