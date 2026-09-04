package org.apache.http.impl.client;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.client.ClientProtocolException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class z extends h implements io.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.a f49365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oo.k f49366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qo.d f49367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final no.b f49368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final no.b f49369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final fo.f f49370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fo.g f49371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final go.a f49372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f49373i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements oo.b {
        a() {
        }

        @Override // oo.b
        public oo.d a(qo.b bVar, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // oo.b
        public ro.i b() {
            throw new UnsupportedOperationException();
        }

        @Override // oo.b
        public void shutdown() {
            z.this.f49366b.shutdown();
        }
    }

    public z(bp.a aVar, oo.k kVar, qo.d dVar, no.b bVar, no.b bVar2, fo.f fVar, fo.g gVar, go.a aVar2, List list) {
        zn.h.k(getClass());
        ip.a.h(aVar, "HTTP client exec chain");
        ip.a.h(kVar, "HTTP connection manager");
        ip.a.h(dVar, "HTTP route planner");
        this.f49365a = aVar;
        this.f49366b = kVar;
        this.f49367c = dVar;
        this.f49368d = bVar;
        this.f49369e = bVar2;
        this.f49370f = fVar;
        this.f49371g = gVar;
        this.f49372h = aVar2;
        this.f49373i = list;
    }

    private qo.b d(co.l lVar, co.o oVar, gp.f fVar) {
        if (lVar == null) {
            lVar = (co.l) oVar.getParams().getParameter("http.default-host");
        }
        return this.f49367c.a(lVar, oVar, fVar);
    }

    private void h(ko.a aVar) {
        if (aVar.getAttribute("http.auth.target-scope") == null) {
            aVar.a("http.auth.target-scope", new eo.g());
        }
        if (aVar.getAttribute("http.auth.proxy-scope") == null) {
            aVar.a("http.auth.proxy-scope", new eo.g());
        }
        if (aVar.getAttribute("http.authscheme-registry") == null) {
            aVar.a("http.authscheme-registry", this.f49369e);
        }
        if (aVar.getAttribute("http.cookiespec-registry") == null) {
            aVar.a("http.cookiespec-registry", this.f49368d);
        }
        if (aVar.getAttribute("http.cookie-store") == null) {
            aVar.a("http.cookie-store", this.f49370f);
        }
        if (aVar.getAttribute("http.auth.credentials-provider") == null) {
            aVar.a("http.auth.credentials-provider", this.f49371g);
        }
        if (aVar.getAttribute("http.request-config") == null) {
            aVar.a("http.request-config", this.f49372h);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        List list = this.f49373i;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((Closeable) it.next()).close();
                } catch (IOException e10) {
                    e10.getMessage();
                    throw null;
                }
            }
        }
    }

    @Override // org.apache.http.impl.client.h
    protected io.c doExecute(co.l lVar, co.o oVar, gp.f fVar) throws ClientProtocolException {
        ip.a.h(oVar, "HTTP request");
        io.g gVar = oVar instanceof io.g ? (io.g) oVar : null;
        try {
            io.o oVarG = io.o.g(oVar, lVar);
            if (fVar == null) {
                fVar = new gp.a();
            }
            ko.a aVarH = ko.a.h(fVar);
            go.a config = oVar instanceof io.d ? ((io.d) oVar).getConfig() : null;
            if (config == null) {
                ep.d params = oVar.getParams();
                if (!(params instanceof ep.e) || !((ep.e) params).m().isEmpty()) {
                    config = jo.a.b(params, this.f49372h);
                }
            }
            if (config != null) {
                aVarH.w(config);
            }
            h(aVarH);
            return this.f49365a.a(d(lVar, oVarG, aVarH), oVarG, aVarH, gVar);
        } catch (HttpException e10) {
            throw new ClientProtocolException(e10);
        }
    }

    @Override // io.d
    public go.a getConfig() {
        return this.f49372h;
    }

    @Override // fo.h
    public oo.b getConnectionManager() {
        return new a();
    }

    @Override // fo.h
    public ep.d getParams() {
        throw new UnsupportedOperationException();
    }
}
