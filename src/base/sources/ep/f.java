package ep;

import co.t;
import co.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f {
    public static v a(d dVar) {
        ip.a.h(dVar, "HTTP parameters");
        Object parameter = dVar.getParameter("http.protocol.version");
        return parameter == null ? t.f10164f : (v) parameter;
    }

    public static void b(d dVar, String str) {
        ip.a.h(dVar, "HTTP parameters");
        dVar.setParameter("http.protocol.content-charset", str);
    }

    public static void c(d dVar, String str) {
        ip.a.h(dVar, "HTTP parameters");
        dVar.setParameter("http.useragent", str);
    }

    public static void d(d dVar, v vVar) {
        ip.a.h(dVar, "HTTP parameters");
        dVar.setParameter("http.protocol.version", vVar);
    }
}
