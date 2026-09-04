package ko;

import co.o;
import co.p;
import com.google.api.client.http.HttpMethods;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class f implements p {
    public f() {
        zn.h.k(getClass());
    }

    @Override // co.p
    public void c(o oVar, gp.f fVar) {
        ip.a.h(oVar, "HTTP request");
        if (oVar.getRequestLine().getMethod().equalsIgnoreCase(HttpMethods.CONNECT)) {
            oVar.setHeader("Proxy-Connection", "Keep-Alive");
            return;
        }
        qo.e eVarO = a.h(fVar).o();
        eVarO.getClass();
        if ((eVarO.b() == 1 || eVarO.c()) && !oVar.containsHeader("Connection")) {
            oVar.addHeader("Connection", "Keep-Alive");
        }
        if (eVarO.b() != 2 || eVarO.c() || oVar.containsHeader("Proxy-Connection")) {
            return;
        }
        oVar.addHeader("Proxy-Connection", "Keep-Alive");
    }
}
