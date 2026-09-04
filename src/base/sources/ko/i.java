package ko;

import co.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class i extends e {
    @Override // co.p
    public void c(o oVar, gp.f fVar) {
        ip.a.h(oVar, "HTTP request");
        ip.a.h(fVar, "HTTP context");
        if (oVar.containsHeader("Proxy-Authorization")) {
            return;
        }
        oo.o oVar2 = (oo.o) fVar.getAttribute("http.connection");
        oVar2.getClass();
        if (oVar2.v().c()) {
            return;
        }
        ((eo.g) fVar.getAttribute("http.auth.proxy-scope")).getClass();
        throw null;
    }
}
