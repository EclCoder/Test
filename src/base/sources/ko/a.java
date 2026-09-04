package ko;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class a extends gp.g {
    public a(gp.f fVar) {
        super(fVar);
    }

    public static a h(gp.f fVar) {
        return fVar instanceof a ? (a) fVar : new a(fVar);
    }

    private no.b p(String str, Class cls) {
        return (no.b) c(str, no.b.class);
    }

    public fo.a i() {
        return (fo.a) c("http.auth.auth-cache", fo.a.class);
    }

    public uo.f j() {
        return (uo.f) c("http.cookie-origin", uo.f.class);
    }

    public uo.g k() {
        return (uo.g) c("http.cookie-spec", uo.g.class);
    }

    public no.b l() {
        return p("http.cookiespec-registry", uo.i.class);
    }

    public fo.f m() {
        return (fo.f) c("http.cookie-store", fo.f.class);
    }

    public fo.g n() {
        return (fo.g) c("http.auth.credentials-provider", fo.g.class);
    }

    public qo.e o() {
        return (qo.e) c("http.route", qo.b.class);
    }

    public eo.g q() {
        return (eo.g) c("http.auth.proxy-scope", eo.g.class);
    }

    public List r() {
        return (List) c("http.protocol.redirect-locations", List.class);
    }

    public go.a s() {
        go.a aVar = (go.a) c("http.request-config", go.a.class);
        return aVar != null ? aVar : go.a.f39794r;
    }

    public eo.g t() {
        return (eo.g) c("http.auth.target-scope", eo.g.class);
    }

    public Object u() {
        return getAttribute("http.user-token");
    }

    public void v(fo.g gVar) {
        a("http.auth.credentials-provider", gVar);
    }

    public void w(go.a aVar) {
        a("http.request-config", aVar);
    }
}
