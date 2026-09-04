package qo;

import co.l;
import ip.f;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements e, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f50922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InetAddress f50923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f50924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e.b f50925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e.a f50926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f50927f;

    private b(l lVar, InetAddress inetAddress, List list, boolean z10, e.b bVar, e.a aVar) {
        ip.a.h(lVar, "Target host");
        this.f50922a = h(lVar);
        this.f50923b = inetAddress;
        if (list == null || list.isEmpty()) {
            this.f50924c = null;
        } else {
            this.f50924c = new ArrayList(list);
        }
        if (bVar == e.b.TUNNELLED) {
            ip.a.a(this.f50924c != null, "Proxy required if tunnelled");
        }
        this.f50927f = z10;
        this.f50925d = bVar == null ? e.b.PLAIN : bVar;
        this.f50926e = aVar == null ? e.a.PLAIN : aVar;
    }

    private static l h(l lVar) {
        if (lVar.j() >= 0) {
            return lVar;
        }
        InetAddress inetAddressG = lVar.g();
        String strK = lVar.k();
        return inetAddressG != null ? new l(inetAddressG, d(strK), strK) : new l(lVar.i(), d(strK), strK);
    }

    @Override // qo.e
    public final int b() {
        List list = this.f50924c;
        if (list != null) {
            return list.size() + 1;
        }
        return 1;
    }

    @Override // qo.e
    public final boolean c() {
        return this.f50925d == e.b.TUNNELLED;
    }

    public Object clone() {
        return super.clone();
    }

    @Override // qo.e
    public final l e() {
        List list = this.f50924c;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (l) this.f50924c.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f50927f == bVar.f50927f && this.f50925d == bVar.f50925d && this.f50926e == bVar.f50926e && f.a(this.f50922a, bVar.f50922a) && f.a(this.f50923b, bVar.f50923b) && f.a(this.f50924c, bVar.f50924c)) {
                return true;
            }
        }
        return false;
    }

    @Override // qo.e
    public final l f(int i10) {
        ip.a.g(i10, "Hop index");
        int iB = b();
        ip.a.a(i10 < iB, "Hop index exceeds tracked route length");
        return i10 < iB - 1 ? (l) this.f50924c.get(i10) : this.f50922a;
    }

    @Override // qo.e
    public final l g() {
        return this.f50922a;
    }

    @Override // qo.e
    public final InetAddress getLocalAddress() {
        return this.f50923b;
    }

    public final int hashCode() {
        int iD = f.d(f.d(17, this.f50922a), this.f50923b);
        List list = this.f50924c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iD = f.d(iD, (l) it.next());
            }
        }
        return f.d(f.d(f.e(iD, this.f50927f), this.f50925d), this.f50926e);
    }

    @Override // qo.e
    public final boolean i() {
        return this.f50927f;
    }

    @Override // qo.e
    public final boolean j() {
        return this.f50926e == e.a.LAYERED;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((b() * 30) + 50);
        InetAddress inetAddress = this.f50923b;
        if (inetAddress != null) {
            sb2.append(inetAddress);
            sb2.append("->");
        }
        sb2.append('{');
        if (this.f50925d == e.b.TUNNELLED) {
            sb2.append('t');
        }
        if (this.f50926e == e.a.LAYERED) {
            sb2.append('l');
        }
        if (this.f50927f) {
            sb2.append('s');
        }
        sb2.append("}->");
        List list = this.f50924c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb2.append((l) it.next());
                sb2.append("->");
            }
        }
        sb2.append(this.f50922a);
        return sb2.toString();
    }

    private static int d(String str) {
        if (SVWsZyNSAChGIA.OOpq.equalsIgnoreCase(str)) {
            return 80;
        }
        return "https".equalsIgnoreCase(str) ? 443 : -1;
    }

    public b(l lVar, InetAddress inetAddress, boolean z10) {
        this(lVar, inetAddress, Collections.EMPTY_LIST, z10, e.b.PLAIN, e.a.PLAIN);
    }

    public b(l lVar) {
        this(lVar, null, Collections.EMPTY_LIST, false, e.b.PLAIN, e.a.PLAIN);
    }

    public b(l lVar, InetAddress inetAddress, l lVar2, boolean z10) {
        this(lVar, inetAddress, Collections.singletonList(ip.a.h(lVar2, "Proxy host")), z10, z10 ? e.b.TUNNELLED : e.b.PLAIN, z10 ? e.a.LAYERED : e.a.PLAIN);
    }
}
