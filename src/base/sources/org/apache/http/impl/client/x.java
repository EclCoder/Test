package org.apache.http.impl.client;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Closeable;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class x {
    private String A;
    private co.l B;
    private Collection C;
    private no.e D;
    private no.a E;
    private go.a F;
    private boolean G;
    private boolean H;
    private long I;
    private TimeUnit J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private int S = 0;
    private int T = 0;
    private long U = -1;
    private TimeUnit V = TimeUnit.MILLISECONDS;
    private List W;
    private to.f X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gp.j f49327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HostnameVerifier f49328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private so.a f49329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SSLContext f49330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private oo.k f49331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private oo.r f49333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private co.a f49334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private oo.e f49335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private fo.c f49336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private fo.c f49337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private fo.n f49338l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private gp.h f49339m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private oo.h f49340n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LinkedList f49341o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LinkedList f49342p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private LinkedList f49343q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private LinkedList f49344r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private fo.i f49345s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private qo.d f49346t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private fo.k f49347u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private no.b f49348v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private no.b f49349w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map f49350x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private fo.f f49351y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private fo.g f49352z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f49353a;

        a(y yVar) {
            this.f49353a = yVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f49353a.e();
            try {
                this.f49353a.d(1L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ oo.k f49355a;

        b(oo.k kVar) {
            this.f49355a = kVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f49355a.shutdown();
        }
    }

    protected x() {
    }

    public static x b() {
        return new x();
    }

    private static String[] o(String str) {
        if (ip.g.b(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    public h a() {
        oo.k kVar;
        TimeUnit timeUnit;
        TimeUnit timeUnit2;
        org.apache.http.conn.ssl.e eVar;
        to.f fVarA = this.X;
        if (fVarA == null) {
            fVarA = to.g.a();
        }
        to.f fVar = fVarA;
        gp.j jVar = this.f49327a;
        if (jVar == null) {
            jVar = new gp.j();
        }
        oo.k kVar2 = this.f49331e;
        if (kVar2 == null) {
            Object eVar2 = this.f49329c;
            if (eVar2 == null) {
                String[] strArrO = this.K ? o(System.getProperty("https.protocols")) : null;
                String[] strArrO2 = this.K ? o(System.getProperty("https.cipherSuites")) : null;
                HostnameVerifier dVar = this.f49328b;
                if (dVar == null) {
                    dVar = new org.apache.http.conn.ssl.d(fVar);
                }
                if (this.f49330d != null) {
                    eVar = new org.apache.http.conn.ssl.e(this.f49330d, strArrO, strArrO2, dVar);
                } else if (this.K) {
                    eVar = new org.apache.http.conn.ssl.e((SSLSocketFactory) SSLSocketFactory.getDefault(), strArrO, strArrO2, dVar);
                } else {
                    eVar2 = new org.apache.http.conn.ssl.e(hp.a.a(), dVar);
                }
                eVar2 = eVar;
            }
            no.c cVarA = no.d.b().c("http", so.b.a()).c("https", eVar2).a();
            oo.h hVar = this.f49340n;
            long j10 = this.U;
            TimeUnit timeUnit3 = this.V;
            if (timeUnit3 == null) {
                timeUnit3 = TimeUnit.MILLISECONDS;
            }
            xo.o oVar = new xo.o(cVarA, null, null, hVar, j10, timeUnit3);
            no.e eVar3 = this.D;
            if (eVar3 != null) {
                oVar.q(eVar3);
            }
            if (this.K && "true".equalsIgnoreCase(System.getProperty("http.keepAlive", "true"))) {
                int i10 = Integer.parseInt(System.getProperty("http.maxConnections", CampaignEx.CLICKMODE_ON));
                oVar.m(i10);
                oVar.r(i10 * 2);
            }
            int i11 = this.S;
            if (i11 > 0) {
                oVar.r(i11);
            }
            int i12 = this.T;
            if (i12 > 0) {
                oVar.m(i12);
            }
            kVar = oVar;
        } else {
            kVar = kVar2;
        }
        co.a aVar = this.f49334h;
        if (aVar == null) {
            aVar = (!this.K || "true".equalsIgnoreCase(System.getProperty("http.keepAlive", "true"))) ? k.f49291b : vo.f.f55692a;
        }
        co.a aVar2 = aVar;
        oo.e eVar4 = this.f49335i;
        if (eVar4 == null) {
            eVar4 = l.f49292a;
        }
        oo.e eVar5 = eVar4;
        fo.c cVar = this.f49336j;
        if (cVar == null) {
            cVar = f0.f49284d;
        }
        fo.c cVar2 = cVar;
        fo.c cVar3 = this.f49337k;
        if (cVar3 == null) {
            cVar3 = b0.f49267d;
        }
        fo.c cVar4 = cVar3;
        fo.n nVar = this.f49338l;
        if (nVar == null) {
            nVar = !this.Q ? u.f49323a : a0.f49266a;
        }
        fo.n nVar2 = nVar;
        String strC = this.A;
        if (strC == null) {
            if (this.K) {
                strC = System.getProperty("http.agent");
            }
            if (strC == null && !this.R) {
                strC = ip.h.c("Apache-HttpClient", "org.apache.http.client", getClass());
            }
        }
        String str = strC;
        bp.a aVarD = d(c(jVar, kVar, aVar2, eVar5, new gp.k(new gp.n(), new gp.o(str)), cVar2, cVar4, nVar2));
        gp.h hVarI = this.f49339m;
        if (hVarI == null) {
            gp.i iVarJ = gp.i.j();
            LinkedList linkedList = this.f49341o;
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    iVarJ.e((co.p) it.next());
                }
            }
            LinkedList linkedList2 = this.f49343q;
            if (linkedList2 != null) {
                Iterator it2 = linkedList2.iterator();
                while (it2.hasNext()) {
                    iVarJ.f((co.s) it2.next());
                }
            }
            iVarJ.c(new ko.g(this.C), new gp.l(), new gp.n(), new ko.f(), new gp.o(str), new ko.h());
            if (!this.O) {
                iVarJ.a(new ko.c());
            }
            if (!this.N) {
                if (this.f49350x != null) {
                    ArrayList arrayList = new ArrayList(this.f49350x.keySet());
                    Collections.sort(arrayList);
                    iVarJ.a(new ko.b(arrayList));
                } else {
                    iVarJ.a(new ko.b());
                }
            }
            if (!this.P) {
                iVarJ.a(new ko.d());
            }
            if (!this.O) {
                iVarJ.b(new ko.l());
            }
            if (!this.N) {
                if (this.f49350x != null) {
                    no.d dVarB = no.d.b();
                    for (Map.Entry entry : this.f49350x.entrySet()) {
                        dVarB.c((String) entry.getKey(), entry.getValue());
                    }
                    iVarJ.b(new ko.k(dVarB.a()));
                } else {
                    iVarJ.b(new ko.k());
                }
            }
            LinkedList linkedList3 = this.f49342p;
            if (linkedList3 != null) {
                Iterator it3 = linkedList3.iterator();
                while (it3.hasNext()) {
                    iVarJ.g((co.p) it3.next());
                }
            }
            LinkedList linkedList4 = this.f49344r;
            if (linkedList4 != null) {
                Iterator it4 = linkedList4.iterator();
                while (it4.hasNext()) {
                    iVarJ.h((co.s) it4.next());
                }
            }
            hVarI = iVarJ.i();
        }
        bp.a aVarE = e(new bp.d(aVarD, hVarI));
        if (!this.M) {
            fo.i iVar = this.f49345s;
            if (iVar == null) {
                iVar = n.f49293d;
            }
            aVarE = new bp.g(aVarE, iVar);
        }
        qo.d jVar2 = this.f49346t;
        if (jVar2 == null) {
            oo.r rVar = this.f49333g;
            if (rVar == null) {
                rVar = xo.l.f57021a;
            }
            co.l lVar = this.B;
            jVar2 = lVar != null ? new xo.j(lVar, rVar) : this.K ? new xo.s(rVar, ProxySelector.getDefault()) : new xo.k(rVar);
        }
        if (!this.L) {
            fo.k kVar3 = this.f49347u;
            if (kVar3 == null) {
                kVar3 = q.f49297b;
            }
            aVarE = new bp.e(aVarE, jVar2, kVar3);
        }
        no.b bVarA = this.f49348v;
        if (bVarA == null) {
            bVarA = no.d.b().c("Basic", new wo.c()).c("Digest", new wo.d()).c("NTLM", new wo.g()).c("Negotiate", new wo.i()).c("Kerberos", new wo.f()).a();
        }
        no.b bVarA2 = this.f49349w;
        if (bVarA2 == null) {
            bVarA2 = j.a(fVar);
        }
        fo.f eVar6 = this.f49351y;
        if (eVar6 == null) {
            eVar6 = new e();
        }
        fo.g e0Var = this.f49352z;
        if (e0Var == null) {
            e0Var = this.K ? new e0() : new f();
        }
        ArrayList arrayList2 = this.W != null ? new ArrayList(this.W) : null;
        if (!this.f49332f) {
            if (arrayList2 == null) {
                arrayList2 = new ArrayList(1);
            }
            if (this.G || this.H) {
                long j11 = this.I;
                long j12 = j11 > 0 ? j11 : 10L;
                TimeUnit timeUnit4 = this.J;
                if (timeUnit4 != null) {
                    timeUnit2 = timeUnit4;
                    timeUnit = timeUnit2;
                } else {
                    timeUnit = timeUnit4;
                    timeUnit2 = TimeUnit.SECONDS;
                }
                oo.k kVar4 = kVar;
                y yVar = new y(kVar4, j12, timeUnit2, j11, timeUnit);
                kVar = kVar4;
                arrayList2.add(new a(yVar));
                yVar.f();
            }
            arrayList2.add(new b(kVar));
        }
        ArrayList arrayList3 = arrayList2;
        go.a aVar3 = this.F;
        if (aVar3 == null) {
            aVar3 = go.a.f39794r;
        }
        return new z(aVarE, kVar, jVar2, bVarA2, bVarA, eVar6, e0Var, aVar3, arrayList3);
    }

    protected bp.a c(gp.j jVar, oo.k kVar, co.a aVar, oo.e eVar, gp.h hVar, fo.c cVar, fo.c cVar2, fo.n nVar) {
        return new bp.c(jVar, kVar, aVar, eVar, hVar, cVar, cVar2, nVar);
    }

    public final x f() {
        this.M = true;
        return this;
    }

    public final x g() {
        this.L = true;
        return this;
    }

    public final x h(oo.k kVar) {
        this.f49331e = kVar;
        return this;
    }

    public final x i(long j10, TimeUnit timeUnit) {
        this.U = j10;
        this.V = timeUnit;
        return this;
    }

    public final x j(no.e eVar) {
        this.D = eVar;
        return this;
    }

    public final x k(int i10) {
        this.T = i10;
        return this;
    }

    public final x l(int i10) {
        this.S = i10;
        return this;
    }

    public final x m(qo.d dVar) {
        this.f49346t = dVar;
        return this;
    }

    public final x n(so.a aVar) {
        this.f49329c = aVar;
        return this;
    }

    public final x p() {
        this.K = true;
        return this;
    }

    protected bp.a d(bp.a aVar) {
        return aVar;
    }

    protected bp.a e(bp.a aVar) {
        return aVar;
    }
}
