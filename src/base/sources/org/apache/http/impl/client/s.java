package org.apache.http.impl.client;

import com.google.api.client.http.HttpMethods;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class s implements fo.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final oo.b f49300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final qo.d f49301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final co.a f49302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final oo.e f49303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final gp.j f49304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final gp.h f49305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final fo.i f49306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final fo.j f49307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final fo.k f49308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final fo.b f49309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final fo.c f49310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final fo.b f49311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final fo.c f49312m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final fo.n f49313n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final ep.d f49314o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected oo.p f49315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final eo.g f49316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final eo.g f49317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final w f49318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f49319t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f49320u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f49321v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private co.l f49322w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(zn.a aVar, gp.j jVar, oo.b bVar, co.a aVar2, oo.e eVar, qo.d dVar, gp.h hVar, fo.i iVar, fo.k kVar, fo.b bVar2, fo.b bVar3, fo.n nVar, ep.d dVar2) {
        this((zn.a) null, jVar, bVar, aVar2, eVar, dVar, hVar, iVar, kVar, new c(bVar2), new c(bVar3), nVar, dVar2);
        zn.h.k(s.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() {
        /*
            r2 = this;
            oo.p r0 = r2.f49315p
            if (r0 == 0) goto L10
            r1 = 0
            r2.f49315p = r1
            r0.d()     // Catch: java.io.IOException -> Lf
            r0.h()     // Catch: java.io.IOException -> Le
            return
        Le:
            throw r1
        Lf:
            throw r1
        L10:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.s.a():void");
    }

    private void j(d0 d0Var, gp.f fVar) throws HttpException, IOException {
        qo.b bVarB = d0Var.b();
        fVar.a("http.request", d0Var.a());
        try {
            if (this.f49315p.isOpen()) {
                this.f49315p.g(ep.c.b(this.f49314o));
            } else {
                this.f49315p.b(bVarB, fVar, this.f49314o);
            }
            f(bVarB, fVar);
        } catch (IOException e10) {
            try {
                this.f49315p.close();
            } catch (IOException unused) {
            }
            if (!this.f49306g.a(e10, 1, fVar)) {
                throw e10;
            }
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private co.q k(org.apache.http.impl.client.d0 r2, gp.f r3) {
        /*
            r1 = this;
            org.apache.http.impl.client.c0 r3 = r2.a()
            qo.b r2 = r2.b()
            int r0 = r1.f49319t
            int r0 = r0 + 1
            r1.f49319t = r0
            r3.e()
            boolean r3 = r3.f()
            r0 = 0
            if (r3 == 0) goto L2a
            oo.p r3 = r1.f49315p     // Catch: java.io.IOException -> L29
            boolean r3 = r3.isOpen()     // Catch: java.io.IOException -> L29
            if (r3 != 0) goto L28
            boolean r2 = r2.c()     // Catch: java.io.IOException -> L29
            if (r2 != 0) goto L27
            throw r0
        L27:
            throw r0
        L28:
            throw r0
        L29:
            throw r0
        L2a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.s.k(org.apache.http.impl.client.d0, gp.f):co.q");
    }

    private c0 l(co.o oVar) {
        return oVar instanceof co.k ? new v((co.k) oVar) : new c0(oVar);
    }

    protected co.o b(qo.b bVar, gp.f fVar) {
        co.l lVarG = bVar.g();
        String strI = lVarG.i();
        int iJ = lVarG.j();
        if (iJ < 0) {
            iJ = this.f49300a.b().c(lVarG.k()).a();
        }
        StringBuilder sb2 = new StringBuilder(strI.length() + 6);
        sb2.append(strI);
        sb2.append(':');
        sb2.append(Integer.toString(iJ));
        return new org.apache.http.message.h(HttpMethods.CONNECT, sb2.toString(), ep.f.a(this.f49314o));
    }

    protected boolean c(qo.b bVar, int i10, gp.f fVar) throws HttpException {
        throw new HttpException("Proxy chains are not supported.");
    }

    protected boolean d(qo.b bVar, gp.f fVar) throws HttpException, IOException {
        gp.f fVar2;
        co.l lVarE = bVar.e();
        co.l lVarG = bVar.g();
        while (true) {
            if (!this.f49315p.isOpen()) {
                this.f49315p.b(bVar, fVar, this.f49314o);
            }
            co.o oVarB = b(bVar, fVar);
            oVarB.setParams(this.f49314o);
            fVar.a("http.target_host", lVarG);
            fVar.a("http.route", bVar);
            fVar.a("http.proxy_host", lVarE);
            fVar.a("http.connection", this.f49315p);
            fVar.a("http.request", oVarB);
            this.f49304e.g(oVarB, this.f49305f, fVar);
            co.q qVarE = this.f49304e.e(oVarB, this.f49315p, fVar);
            qVarE.setParams(this.f49314o);
            this.f49304e.f(qVarE, this.f49305f, fVar);
            if (qVarE.b().getStatusCode() < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + qVarE.b());
            }
            if (jo.b.b(this.f49314o)) {
                fVar2 = fVar;
                if (!this.f49318s.b(lVarE, qVarE, this.f49312m, this.f49317r, fVar2) || !this.f49318s.c(lVarE, qVarE, this.f49312m, this.f49317r, fVar2)) {
                    if (qVarE.b().getStatusCode() <= 299) {
                        this.f49315p.U();
                        return false;
                    }
                    co.j entity = qVarE.getEntity();
                    if (entity != null) {
                        qVarE.setEntity(new org.apache.http.entity.b(entity));
                    }
                    this.f49315p.close();
                    throw new TunnelRefusedException("CONNECT refused by proxy: " + qVarE.b(), qVarE);
                }
                if (this.f49302c.a(qVarE, fVar2)) {
                    throw null;
                }
                this.f49315p.close();
            } else {
                fVar2 = fVar;
            }
            fVar = fVar2;
        }
    }

    protected qo.b e(co.l lVar, co.o oVar, gp.f fVar) {
        qo.d dVar = this.f49301b;
        if (lVar == null) {
            lVar = (co.l) oVar.getParams().getParameter("http.default-host");
        }
        return dVar.a(lVar, oVar, fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:?, code lost:
    
        throw null;
     */
    @Override // fo.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public co.q execute(co.l r13, co.o r14, gp.f r15) throws org.apache.http.HttpException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.s.execute(co.l, co.o, gp.f):co.q");
    }

    protected void f(qo.b bVar, gp.f fVar) throws HttpException, IOException {
        int iA;
        qo.a aVar = new qo.a();
        do {
            qo.b bVarV = this.f49315p.v();
            iA = aVar.a(bVar, bVarV);
            switch (iA) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + bVar + "; current = " + bVarV);
                case 0:
                    break;
                case 1:
                case 2:
                    this.f49315p.b(bVar, fVar, this.f49314o);
                    break;
                case 3:
                    d(bVar, fVar);
                    throw null;
                case 4:
                    c(bVar, bVarV.b() - 1, fVar);
                    throw null;
                case 5:
                    this.f49315p.p(fVar, this.f49314o);
                    break;
                default:
                    throw new IllegalStateException("Unknown step indicator " + iA + " from RouteDirector.");
            }
        } while (iA > 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (r13.f49318s.c(r1, r15, r13.f49312m, r13.f49317r, r5) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected org.apache.http.impl.client.d0 g(org.apache.http.impl.client.d0 r14, co.q r15, gp.f r16) throws org.apache.http.ProtocolException {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.s.g(org.apache.http.impl.client.d0, co.q, gp.f):org.apache.http.impl.client.d0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void h() {
        /*
            r2 = this;
            r0 = 0
            oo.p r1 = r2.f49315p     // Catch: java.io.IOException -> L9
            r1.h()     // Catch: java.io.IOException -> L9
            r2.f49315p = r0
            return
        L9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.s.h():void");
    }

    protected void i(c0 c0Var, qo.b bVar) throws ProtocolException {
        URI uriC;
        try {
            URI uri = c0Var.getURI();
            if (bVar.e() == null || bVar.c()) {
                uriC = uri.isAbsolute() ? lo.d.c(uri, null, lo.d.f44884d) : lo.d.b(uri);
            } else {
                uriC = !uri.isAbsolute() ? lo.d.c(uri, bVar.g(), lo.d.f44884d) : lo.d.b(uri);
            }
            c0Var.setURI(uriC);
        } catch (URISyntaxException e10) {
            throw new ProtocolException("Invalid URI: " + c0Var.getRequestLine().getUri(), e10);
        }
    }

    public s(zn.a aVar, gp.j jVar, oo.b bVar, co.a aVar2, oo.e eVar, qo.d dVar, gp.h hVar, fo.i iVar, fo.k kVar, fo.c cVar, fo.c cVar2, fo.n nVar, ep.d dVar2) {
        ip.a.h(aVar, "Log");
        ip.a.h(jVar, "Request executor");
        ip.a.h(bVar, "Client connection manager");
        ip.a.h(aVar2, "Connection reuse strategy");
        ip.a.h(eVar, "Connection keep alive strategy");
        ip.a.h(dVar, "Route planner");
        ip.a.h(hVar, "HTTP protocol processor");
        ip.a.h(iVar, "HTTP request retry handler");
        ip.a.h(kVar, "Redirect strategy");
        ip.a.h(cVar, "Target authentication strategy");
        ip.a.h(cVar2, "Proxy authentication strategy");
        ip.a.h(nVar, "User token handler");
        ip.a.h(dVar2, "HTTP parameters");
        this.f49318s = new w(aVar);
        this.f49304e = jVar;
        this.f49300a = bVar;
        this.f49302c = aVar2;
        this.f49303d = eVar;
        this.f49301b = dVar;
        this.f49305f = hVar;
        this.f49306g = iVar;
        this.f49308i = kVar;
        this.f49310k = cVar;
        this.f49312m = cVar2;
        this.f49313n = nVar;
        this.f49314o = dVar2;
        if (kVar instanceof r) {
            this.f49307h = ((r) kVar).c();
        } else {
            this.f49307h = null;
        }
        if (cVar instanceof c) {
            this.f49309j = ((c) cVar).b();
        } else {
            this.f49309j = null;
        }
        if (cVar2 instanceof c) {
            this.f49311l = ((c) cVar2).b();
        } else {
            this.f49311l = null;
        }
        this.f49315p = null;
        this.f49319t = 0;
        this.f49320u = 0;
        this.f49316q = new eo.g();
        this.f49317r = new eo.g();
        this.f49321v = dVar2.l("http.protocol.max-redirects", 100);
    }
}
