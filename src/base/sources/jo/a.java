package jo;

import co.l;
import ep.d;
import java.net.InetAddress;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static go.a a(d dVar) {
        return b(dVar, go.a.f39794r);
    }

    public static go.a b(d dVar, go.a aVar) {
        go.a.C0598a c0598aP = go.a.c(aVar).q(dVar.l("http.socket.timeout", aVar.n())).r(dVar.k("http.connection.stalecheck", aVar.x())).d(dVar.l("http.connection.timeout", aVar.f())).i(dVar.k("http.protocol.expect-continue", aVar.t())).b(dVar.k("http.protocol.handle-authentication", aVar.p())).c(dVar.k("http.protocol.allow-circular-redirects", aVar.q())).e((int) dVar.i("http.conn-manager.timeout", aVar.g())).k(dVar.l("http.protocol.max-redirects", aVar.k())).o(dVar.k("http.protocol.handle-redirects", aVar.v())).p(!dVar.k("http.protocol.reject-relative-redirect", !aVar.w()));
        l lVar = (l) dVar.getParameter("http.route.default-proxy");
        if (lVar != null) {
            c0598aP.m(lVar);
        }
        InetAddress inetAddress = (InetAddress) dVar.getParameter("http.route.local-address");
        if (inetAddress != null) {
            c0598aP.j(inetAddress);
        }
        Collection collection = (Collection) dVar.getParameter("http.auth.target-scheme-pref");
        if (collection != null) {
            c0598aP.s(collection);
        }
        Collection collection2 = (Collection) dVar.getParameter("http.auth.proxy-scheme-pref");
        if (collection2 != null) {
            c0598aP.n(collection2);
        }
        String str = (String) dVar.getParameter("http.protocol.cookie-policy");
        if (str != null) {
            c0598aP.g(str);
        }
        return c0598aP.a();
    }
}
