package zo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class h0 extends a0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends i {
        a() {
        }

        @Override // zo.i, uo.d
        public void a(uo.c cVar, uo.f fVar) throws CookieRestrictionViolationException {
            if (d(cVar, fVar)) {
                return;
            }
            throw new CookieRestrictionViolationException("Illegal 'path' attribute \"" + cVar.w() + "\". Path of origin: \"" + fVar.b() + "\"");
        }
    }

    public h0(String[] strArr, boolean z10) {
        super(z10, new j0(), new a(), new f0(), new g0(), new h(), new j(), new e(), new g(strArr != null ? (String[]) strArr.clone() : a0.f59023c), new d0(), new e0());
    }

    private static uo.f h(uo.f fVar) {
        String strA = fVar.a();
        for (int i10 = 0; i10 < strA.length(); i10++) {
            char cCharAt = strA.charAt(i10);
            if (cCharAt == '.' || cCharAt == ':') {
                return fVar;
            }
        }
        return new uo.f(strA + ".local", fVar.c(), fVar.b(), fVar.d());
    }

    private List i(co.e[] eVarArr, uo.f fVar) throws MalformedCookieException {
        ArrayList arrayList = new ArrayList(eVarArr.length);
        for (co.e eVar : eVarArr) {
            String name = eVar.getName();
            String value = eVar.getValue();
            if (name == null || name.isEmpty()) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            c cVar = new c(name, value);
            cVar.h(p.f(fVar));
            cVar.e(p.e(fVar));
            cVar.m(new int[]{fVar.c()});
            co.u[] parameters = eVar.getParameters();
            HashMap map = new HashMap(parameters.length);
            for (int length = parameters.length - 1; length >= 0; length--) {
                co.u uVar = parameters[length];
                map.put(uVar.getName().toLowerCase(Locale.ROOT), uVar);
            }
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                co.u uVar2 = (co.u) ((Map.Entry) it.next()).getValue();
                String lowerCase = uVar2.getName().toLowerCase(Locale.ROOT);
                cVar.n(lowerCase, uVar2.getValue());
                uo.d dVarC = c(lowerCase);
                if (dVarC != null) {
                    dVarC.c(cVar, uVar2.getValue());
                }
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // zo.a0, zo.p, uo.g
    public void a(uo.c cVar, uo.f fVar) {
        ip.a.h(cVar, "Cookie");
        ip.a.h(fVar, "Cookie origin");
        super.a(cVar, h(fVar));
    }

    @Override // zo.a0, uo.g
    public List b(co.d dVar, uo.f fVar) throws MalformedCookieException {
        ip.a.h(dVar, "Header");
        ip.a.h(fVar, "Cookie origin");
        if (dVar.getName().equalsIgnoreCase("Set-Cookie2")) {
            return i(dVar.g(), h(fVar));
        }
        throw new MalformedCookieException("Unrecognized cookie header '" + dVar.toString() + "'");
    }

    @Override // zo.p
    protected List g(co.e[] eVarArr, uo.f fVar) {
        return i(eVarArr, h(fVar));
    }

    @Override // zo.a0, uo.g
    public int getVersion() {
        return 1;
    }

    @Override // zo.a0
    public String toString() {
        return "rfc2965";
    }

    h0(boolean z10, uo.b... bVarArr) {
        super(z10, bVarArr);
    }
}
