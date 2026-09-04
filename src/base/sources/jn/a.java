package jn;

import bm.r;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import gn.d0;
import gn.f0;
import gn.x;
import gn.z;
import hn.m;
import hn.p;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import xn.c0;
import xn.q0;
import xn.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0645a f42694a = new C0645a(null);

    /* JADX INFO: renamed from: jn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0645a {
        public /* synthetic */ C0645a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final x b(x xVar, x xVar2) {
            x.a aVar = new x.a();
            int size = xVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strD = xVar.d(i10);
                String strH = xVar.h(i10);
                if ((!r.A("Warning", strD, true) || !r.N(strH, "1", false, 2, null)) && (c(strD) || !d(strD) || xVar2.a(strD) == null)) {
                    aVar.c(strD, strH);
                }
            }
            int size2 = xVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strD2 = xVar2.d(i11);
                if (!c(strD2) && d(strD2)) {
                    aVar.c(strD2, xVar2.h(i11));
                }
            }
            return aVar.d();
        }

        private final boolean c(String str) {
            return r.A("Content-Length", str, true) || r.A("Content-Encoding", str, true) || r.A("Content-Type", str, true);
        }

        private C0645a() {
        }

        private final boolean d(String str) {
            return (r.A("Connection", str, true) || r.A("Keep-Alive", str, true) || r.A("Proxy-Authenticate", str, true) || r.A("Proxy-Authorization", str, true) || r.A("TE", str, true) || r.A("Trailers", str, true) || r.A("Transfer-Encoding", str, true) || r.A(IAoPeRfJn.yMhntDoFxQShgb, str, true)) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f42695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xn.g f42696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f42697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ xn.f f42698d;

        b(xn.g gVar, c cVar, xn.f fVar) {
            this.f42696b = gVar;
            this.f42697c = cVar;
            this.f42698d = fVar;
        }

        @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f42695a && !p.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f42695a = true;
                this.f42697c.a();
            }
            this.f42696b.close();
        }

        @Override // xn.q0
        public long read(xn.e sink, long j10) throws IOException {
            s.h(sink, "sink");
            try {
                long j11 = this.f42696b.read(sink, j10);
                if (j11 != -1) {
                    sink.r(this.f42698d.u(), sink.size() - j11, j11);
                    this.f42698d.J();
                    return j11;
                }
                if (!this.f42695a) {
                    this.f42695a = true;
                    this.f42698d.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (this.f42695a) {
                    throw e10;
                }
                this.f42695a = true;
                this.f42697c.a();
                throw e10;
            }
        }

        @Override // xn.q0
        public r0 timeout() {
            return this.f42696b.timeout();
        }
    }

    private final f0 a(c cVar, f0 f0Var) {
        if (cVar == null) {
            return f0Var;
        }
        b bVar = new b(f0Var.d().source(), cVar, c0.b(cVar.b()));
        return f0Var.F0().b(new mn.h(f0.c0(f0Var, "Content-Type", null, 2, null), f0Var.d().contentLength(), c0.c(bVar))).c();
    }

    @Override // gn.z
    public f0 intercept(z.a chain) {
        s.h(chain, "chain");
        gn.e eVarCall = chain.call();
        gn.c cVarI = chain.i();
        f0 f0VarC = cVarI != null ? cVarI.c(jn.b.b(chain.e())) : null;
        d dVarB = new d.b(System.currentTimeMillis(), chain.e(), f0VarC).b();
        d0 d0VarB = dVarB.b();
        f0 f0VarA = dVarB.a();
        if (cVarI != null) {
            cVarI.q(dVarB);
        }
        if (f0VarC != null && f0VarA == null) {
            m.f(f0VarC.d());
        }
        if (d0VarB == null && f0VarA == null) {
            f0 f0VarC2 = new f0.a().q(chain.e()).o(gn.c0.HTTP_1_1).f(PglCryptUtils.BASE64_FAILED).l("Unsatisfiable Request (only-if-cached)").r(-1L).p(System.currentTimeMillis()).c();
            chain.h().E(eVarCall, f0VarC2);
            return f0VarC2;
        }
        if (d0VarB == null) {
            s.e(f0VarA);
            f0 f0VarC3 = f0VarA.F0().d(hn.h.a(f0VarA)).c();
            chain.h().b(eVarCall, f0VarC3);
            return f0VarC3;
        }
        if (f0VarA != null) {
            chain.h().a(eVarCall, f0VarA);
        } else if (cVarI != null) {
            chain.h().c(eVarCall);
        }
        try {
            f0 f0VarC4 = chain.c(d0VarB);
            if (f0VarC4 == null && f0VarC != null) {
                m.f(f0VarC.d());
            }
            if (f0VarA != null) {
                if (f0VarC4 != null && f0VarC4.m() == 304) {
                    f0 f0VarC5 = f0VarA.F0().j(f42694a.b(f0VarA.d0(), f0VarC4.d0())).r(f0VarC4.V0()).p(f0VarC4.T0()).d(hn.h.a(f0VarA)).m(hn.h.a(f0VarC4)).c();
                    f0VarC4.d().close();
                    s.e(cVarI);
                    cVarI.m();
                    cVarI.r(f0VarA, f0VarC5);
                    chain.h().b(eVarCall, f0VarC5);
                    return f0VarC5;
                }
                m.f(f0VarA.d());
            }
            s.e(f0VarC4);
            f0 f0VarC6 = f0VarC4.F0().d(f0VarA != null ? hn.h.a(f0VarA) : null).m(hn.h.a(f0VarC4)).c();
            if (cVarI != null) {
                d0 d0VarB2 = jn.b.b(d0VarB);
                if (mn.e.b(f0VarC6) && d.f42699c.a(f0VarC6, d0VarB2)) {
                    f0 f0VarA2 = a(cVarI.i(f0VarC6.F0().q(d0VarB2).c()), f0VarC6);
                    if (f0VarA != null) {
                        chain.h().c(eVarCall);
                    }
                    return f0VarA2;
                }
                if (mn.f.a(d0VarB.i())) {
                    try {
                        cVarI.j(d0VarB);
                    } catch (IOException unused) {
                    }
                }
            }
            return f0VarC6;
        } catch (Throwable th2) {
            if (f0VarC != null) {
                m.f(f0VarC.d());
            }
            throw th2;
        }
    }
}
