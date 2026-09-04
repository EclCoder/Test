package zo;

import java.util.List;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class w extends p {
    public w(String[] strArr) {
        super(new i(), new u(), new j(), new e(), new g(strArr != null ? (String[]) strArr.clone() : new String[]{"EEE, dd-MMM-yy HH:mm:ss z"}));
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
        return g(new co.e[]{vVar.a(cVar, uVar)}, fVar);
    }

    @Override // uo.g
    public int getVersion() {
        return 0;
    }

    public String toString() {
        return "netscape";
    }

    w(uo.b... bVarArr) {
        super(bVarArr);
    }
}
