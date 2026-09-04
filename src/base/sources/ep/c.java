package ep;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static int a(d dVar) {
        ip.a.h(dVar, "HTTP parameters");
        return dVar.l("http.connection.timeout", 0);
    }

    public static int b(d dVar) {
        ip.a.h(dVar, "HTTP parameters");
        return dVar.l("http.socket.timeout", 0);
    }

    public static boolean c(d dVar) {
        ip.a.h(dVar, "HTTP parameters");
        return dVar.k("http.connection.stalecheck", true);
    }

    public static void d(d dVar, int i10) {
        ip.a.h(dVar, "HTTP parameters");
        dVar.h("http.connection.timeout", i10);
    }

    public static void e(d dVar, int i10) {
        ip.a.h(dVar, "HTTP parameters");
        dVar.h("http.socket.timeout", i10);
    }

    public static void f(d dVar, int i10) {
        ip.a.h(dVar, "HTTP parameters");
        dVar.h("http.socket.buffer-size", i10);
    }

    public static void g(d dVar, boolean z10) {
        ip.a.h(dVar, "HTTP parameters");
        dVar.j("http.connection.stalecheck", z10);
    }

    public static void h(d dVar, boolean z10) {
        ip.a.h(dVar, "HTTP parameters");
        dVar.j("http.tcp.nodelay", z10);
    }
}
