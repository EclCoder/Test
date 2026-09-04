package jo;

import ep.c;
import ep.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static long a(d dVar) {
        ip.a.h(dVar, "HTTP parameters");
        Long l10 = (Long) dVar.getParameter("http.conn-manager.timeout");
        return l10 != null ? l10.longValue() : c.a(dVar);
    }

    public static boolean b(d dVar) {
        ip.a.h(dVar, "HTTP parameters");
        return dVar.k("http.protocol.handle-authentication", true);
    }

    public static boolean c(d dVar) {
        ip.a.h(dVar, "HTTP parameters");
        return dVar.k("http.protocol.handle-redirects", true);
    }
}
