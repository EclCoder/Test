package po;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f50270a = new C0770a();

    /* JADX INFO: renamed from: po.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0770a implements b {
        C0770a() {
        }
    }

    public static b a(ep.d dVar) {
        ip.a.h(dVar, "HTTP parameters");
        b bVar = (b) dVar.getParameter("http.conn-manager.max-per-route");
        return bVar == null ? f50270a : bVar;
    }

    public static int b(ep.d dVar) {
        ip.a.h(dVar, "HTTP parameters");
        return dVar.l("http.conn-manager.max-total", 20);
    }

    public static void c(ep.d dVar, b bVar) {
        ip.a.h(dVar, "HTTP parameters");
        dVar.setParameter("http.conn-manager.max-per-route", bVar);
    }

    public static void d(ep.d dVar, int i10) {
        ip.a.h(dVar, "HTTP parameters");
        dVar.h("http.conn-manager.max-total", i10);
    }

    public static void e(ep.d dVar, long j10) {
        ip.a.h(dVar, "HTTP parameters");
        dVar.n("http.conn-manager.timeout", j10);
    }
}
