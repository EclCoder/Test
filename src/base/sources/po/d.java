package po;

import co.l;
import java.net.InetAddress;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f50273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qo.b f50274b;

    static {
        l lVar = new l("127.0.0.255", 0, "no-host");
        f50273a = lVar;
        f50274b = new qo.b(lVar);
    }

    public static l a(ep.d dVar) {
        ip.a.h(dVar, "Parameters");
        l lVar = (l) dVar.getParameter("http.route.default-proxy");
        if (lVar == null || !f50273a.equals(lVar)) {
            return lVar;
        }
        return null;
    }

    public static qo.b b(ep.d dVar) {
        ip.a.h(dVar, "Parameters");
        qo.b bVar = (qo.b) dVar.getParameter("http.route.forced-route");
        if (bVar == null || !f50274b.equals(bVar)) {
            return bVar;
        }
        return null;
    }

    public static void d(ep.d dVar, l lVar) {
        ip.a.h(dVar, "Parameters");
        dVar.setParameter("http.route.default-proxy", lVar);
    }

    public static InetAddress c(ep.d dVar) {
        ip.a.h(dVar, YSHErhbVu.nsDAOCqLMUb);
        return (InetAddress) dVar.getParameter("http.route.local-address");
    }
}
