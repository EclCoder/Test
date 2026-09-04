package zo;

import java.util.List;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class q implements uo.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f59054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f59055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f59056c;

    public q(String[] strArr, boolean z10) {
        this.f59054a = new h0(z10, new j0(), new i(), new f0(), new g0(), new h(), new j(), new e(), new d0(), new e0());
        this.f59055b = new a0(z10, new c0(), new i(), new z(), new h(), new j(), new e());
        this.f59056c = new w(new f(), new i(), new j(), new e(), new g(strArr != null ? (String[]) strArr.clone() : new String[]{"EEE, dd-MMM-yy HH:mm:ss z"}));
    }

    @Override // uo.g
    public void a(uo.c cVar, uo.f fVar) {
        ip.a.h(cVar, "Cookie");
        ip.a.h(fVar, "Cookie origin");
        if (cVar.getVersion() <= 0) {
            this.f59056c.a(cVar, fVar);
        } else if (cVar instanceof uo.k) {
            this.f59054a.a(cVar, fVar);
        } else {
            this.f59055b.a(cVar, fVar);
        }
    }

    @Override // uo.g
    public List b(co.d dVar, uo.f fVar) throws MalformedCookieException {
        ip.c cVar;
        org.apache.http.message.u uVar;
        ip.a.h(dVar, "Header");
        ip.a.h(fVar, "Cookie origin");
        co.e[] eVarArrG = dVar.g();
        boolean z10 = false;
        boolean z11 = false;
        for (co.e eVar : eVarArrG) {
            if (eVar.b("version") != null) {
                z11 = true;
            }
            if (eVar.b("expires") != null) {
                z10 = true;
            }
        }
        if (!z10 && z11) {
            return "Set-Cookie2".equals(dVar.getName()) ? this.f59054a.g(eVarArrG, fVar) : this.f59055b.g(eVarArrG, fVar);
        }
        v vVar = v.f59064b;
        if (dVar instanceof co.c) {
            co.c cVar2 = (co.c) dVar;
            cVar = cVar2.u();
            uVar = new org.apache.http.message.u(cVar2.v(), cVar.length());
        } else {
            String value = dVar.getValue();
            if (value == null) {
                throw new MalformedCookieException("Header value is null");
            }
            cVar = new ip.c(value.length());
            cVar.b(value);
            uVar = new org.apache.http.message.u(0, cVar.length());
        }
        return this.f59056c.g(new co.e[]{vVar.a(cVar, uVar)}, fVar);
    }

    @Override // uo.g
    public int getVersion() {
        return this.f59054a.getVersion();
    }
}
