package zo;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class m extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f59048b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

    public m(String[] strArr, n.a aVar) {
        super(new o(), new f(), aVar == n.a.SECURITYLEVEL_IE_MEDIUM ? new a() : new i(), new h(), new j(), new e(), new g(strArr != null ? (String[]) strArr.clone() : f59048b));
    }

    @Override // uo.g
    public List b(co.d dVar, uo.f fVar) throws MalformedCookieException {
        ip.c cVar;
        org.apache.http.message.u uVar;
        ip.a.h(dVar, "Header");
        ip.a.h(fVar, "Cookie origin");
        if (!dVar.getName().equalsIgnoreCase("Set-Cookie")) {
            throw new MalformedCookieException("Unrecognized cookie header '" + dVar.toString() + "'");
        }
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
            return g(eVarArrG, fVar);
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
        co.e eVarA = vVar.a(cVar, uVar);
        String name = eVarA.getName();
        String value2 = eVarA.getValue();
        if (name == null || name.isEmpty()) {
            throw new MalformedCookieException("Cookie name may not be empty");
        }
        d dVar2 = new d(name, value2);
        dVar2.h(p.f(fVar));
        dVar2.e(p.e(fVar));
        co.u[] parameters = eVarA.getParameters();
        for (int length = parameters.length - 1; length >= 0; length--) {
            co.u uVar2 = parameters[length];
            String lowerCase = uVar2.getName().toLowerCase(Locale.ROOT);
            dVar2.n(lowerCase, uVar2.getValue());
            uo.d dVarC = c(lowerCase);
            if (dVarC != null) {
                dVarC.c(dVar2, uVar2.getValue());
            }
        }
        if (z10) {
            dVar2.setVersion(0);
        }
        return Collections.singletonList(dVar2);
    }

    @Override // uo.g
    public int getVersion() {
        return 0;
    }

    public String toString() {
        return "compatibility";
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends i {
        a() {
        }

        @Override // zo.i, uo.d
        public void a(uo.c cVar, uo.f fVar) {
        }
    }
}
