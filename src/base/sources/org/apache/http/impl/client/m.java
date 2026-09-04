package org.apache.http.impl.client;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class m extends b {
    public m(oo.b bVar, ep.d dVar) {
        super(bVar, dVar);
    }

    public static void setDefaultHttpParams(ep.d dVar) {
        ep.f.d(dVar, co.t.f10164f);
        ep.f.b(dVar, gp.e.f39837a.name());
        ep.c.h(dVar, true);
        ep.c.f(dVar, 8192);
        ep.f.c(dVar, ip.h.c("Apache-HttpClient", "org.apache.http.client", m.class));
    }

    @Override // org.apache.http.impl.client.b
    protected ep.d createHttpParams() {
        ep.g gVar = new ep.g();
        setDefaultHttpParams(gVar);
        return gVar;
    }

    @Override // org.apache.http.impl.client.b
    protected gp.b createHttpProcessor() {
        gp.b bVar = new gp.b();
        bVar.d(new ko.g());
        bVar.d(new gp.l());
        bVar.d(new gp.n());
        bVar.d(new ko.f());
        bVar.d(new gp.o());
        bVar.d(new gp.m());
        bVar.d(new ko.c());
        bVar.f(new ko.l());
        bVar.d(new ko.d());
        bVar.d(new ko.j());
        bVar.d(new ko.i());
        return bVar;
    }

    public m() {
        super(null, null);
    }
}
