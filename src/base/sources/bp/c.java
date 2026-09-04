package bp;

import fo.n;
import gp.h;
import gp.j;
import io.o;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import oo.k;
import org.apache.http.HttpException;
import org.apache.http.impl.conn.ConnectionShutdownException;
import org.apache.http.impl.execchain.RequestAbortedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f9225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f9226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final co.a f9227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final oo.e f9228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f9229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final fo.c f9230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fo.c f9231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wo.e f9232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n f9233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final qo.c f9234j;

    public c(j jVar, k kVar, co.a aVar, oo.e eVar, h hVar, fo.c cVar, fo.c cVar2, n nVar) {
        zn.h.k(getClass());
        ip.a.h(jVar, "HTTP request executor");
        ip.a.h(kVar, "Client connection manager");
        ip.a.h(aVar, "Connection reuse strategy");
        ip.a.h(eVar, "Connection keep alive strategy");
        ip.a.h(hVar, "Proxy HTTP processor");
        ip.a.h(cVar, "Target authentication strategy");
        ip.a.h(cVar2, "Proxy authentication strategy");
        ip.a.h(nVar, "User token handler");
        this.f9232h = new wo.e();
        this.f9234j = new qo.a();
        this.f9225a = jVar;
        this.f9226b = kVar;
        this.f9227c = aVar;
        this.f9228d = eVar;
        this.f9229e = hVar;
        this.f9230f = cVar;
        this.f9231g = cVar2;
        this.f9233i = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bp.a
    public io.c a(qo.b bVar, o oVar, ko.a aVar, io.g gVar) throws HttpException, IOException {
        ip.a.h(bVar, "HTTP route");
        ip.a.h(oVar, "HTTP request");
        ip.a.h(aVar, "HTTP context");
        eo.g gVarT = aVar.t();
        if (gVarT == null) {
            gVarT = new eo.g();
            aVar.a("http.auth.target-scope", gVarT);
        }
        eo.g gVarQ = aVar.q();
        if (gVarQ == null) {
            gVarQ = new eo.g();
            aVar.a("http.auth.proxy-scope", gVarQ);
        }
        if (oVar instanceof co.k) {
            f.a((co.k) oVar);
        }
        oo.g gVarA = this.f9226b.a(bVar, aVar.u());
        if (gVar != null) {
            if (gVar.isAborted()) {
                gVarA.cancel();
                throw new RequestAbortedException("Request aborted");
            }
            gVar.setCancellable(gVarA);
        }
        go.a aVarS = aVar.s();
        try {
            int iG = aVarS.g();
            co.h hVar = gVarA.get(iG > 0 ? iG : 0L, TimeUnit.MILLISECONDS);
            aVar.a("http.connection", hVar);
            if (aVarS.x() && hVar.isOpen()) {
                throw null;
            }
            b bVar2 = new b(null, this.f9226b, hVar);
            if (gVar != null) {
                try {
                    try {
                        gVar.setCancellable(bVar2);
                    } catch (RuntimeException e10) {
                        bVar2.d();
                        if (gVarQ.d()) {
                            gVarQ.e();
                        }
                        if (gVarT.d()) {
                            gVarT.e();
                        }
                        throw e10;
                    }
                } catch (IOException e11) {
                    bVar2.d();
                    if (gVarQ.d()) {
                        gVarQ.e();
                    }
                    if (gVarT.d()) {
                        gVarT.e();
                    }
                    throw e11;
                } catch (Error e12) {
                    this.f9226b.shutdown();
                    throw e12;
                } catch (HttpException e13) {
                    bVar2.d();
                    throw e13;
                } catch (ConnectionShutdownException e14) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Connection has been shut down");
                    interruptedIOException.initCause(e14);
                    throw interruptedIOException;
                }
            }
            if (gVar != null && gVar.isAborted()) {
                throw new RequestAbortedException("Request aborted");
            }
            if (!hVar.isOpen()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Opening connection ");
                sb2.append(bVar);
                throw null;
            }
            int iN = aVarS.n();
            if (iN >= 0) {
                hVar.g(iN);
            }
            if (gVar == null || !gVar.isAborted()) {
                throw null;
            }
            throw new RequestAbortedException("Request aborted");
        } catch (InterruptedException e15) {
            Thread.currentThread().interrupt();
            throw new RequestAbortedException("Request aborted", e15);
        } catch (ExecutionException e16) {
            e = e16;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            throw new RequestAbortedException("Request execution failed", e);
        }
    }
}
