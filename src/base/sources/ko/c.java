package ko;

import co.o;
import co.p;
import com.google.api.client.http.HttpMethods;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class c implements p {
    public c() {
        zn.h.k(getClass());
    }

    @Override // co.p
    public void c(o oVar, gp.f fVar) {
        ip.a.h(oVar, "HTTP request");
        ip.a.h(fVar, "HTTP context");
        if (oVar.getRequestLine().getMethod().equalsIgnoreCase(HttpMethods.CONNECT)) {
            return;
        }
        a aVarH = a.h(fVar);
        aVarH.m().getClass();
        aVarH.l().getClass();
        aVarH.f().getClass();
        aVarH.o().getClass();
        aVarH.s().i();
        throw null;
    }
}
