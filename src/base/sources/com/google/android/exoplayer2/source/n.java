package com.google.android.exoplayer2.source;

import android.util.Pair;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends i0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f17862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final h2.d f17863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final h2.b f17864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f17865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private m f17866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f17867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f17868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17869t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends k {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Object f17870i = new Object();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f17871g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Object f17872h;

        private a(h2 h2Var, Object obj, Object obj2) {
            super(h2Var);
            this.f17871g = obj;
            this.f17872h = obj2;
        }

        public static a y(y0 y0Var) {
            return new a(new b(y0Var), h2.d.f17009r, f17870i);
        }

        public static a z(h2 h2Var, Object obj, Object obj2) {
            return new a(h2Var, obj, obj2);
        }

        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public int f(Object obj) {
            Object obj2;
            h2 h2Var = this.f17847f;
            if (f17870i.equals(obj) && (obj2 = this.f17872h) != null) {
                obj = obj2;
            }
            return h2Var.f(obj);
        }

        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public h2.b k(int i10, h2.b bVar, boolean z10) {
            this.f17847f.k(i10, bVar, z10);
            if (r0.c(bVar.f16999b, this.f17872h) && z10) {
                bVar.f16999b = f17870i;
            }
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public Object q(int i10) {
            Object objQ = this.f17847f.q(i10);
            return r0.c(objQ, this.f17872h) ? f17870i : objQ;
        }

        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public h2.d s(int i10, h2.d dVar, long j10) {
            this.f17847f.s(i10, dVar, j10);
            if (r0.c(dVar.f17018a, this.f17871g)) {
                dVar.f17018a = h2.d.f17009r;
            }
            return dVar;
        }

        public a x(h2 h2Var) {
            return new a(h2Var, this.f17871g, this.f17872h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends h2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final y0 f17873f;

        public b(y0 y0Var) {
            this.f17873f = y0Var;
        }

        @Override // com.google.android.exoplayer2.h2
        public int f(Object obj) {
            return obj == a.f17870i ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.h2
        public h2.b k(int i10, h2.b bVar, boolean z10) {
            bVar.w(z10 ? 0 : null, z10 ? a.f17870i : null, 0, C.TIME_UNSET, 0L, sa.c.f51554g, true);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.h2
        public int m() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.h2
        public Object q(int i10) {
            return a.f17870i;
        }

        @Override // com.google.android.exoplayer2.h2
        public h2.d s(int i10, h2.d dVar, long j10) {
            dVar.i(h2.d.f17009r, this.f17873f, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
            dVar.f17029l = true;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.h2
        public int t() {
            return 1;
        }
    }

    public n(p pVar, boolean z10) {
        super(pVar);
        this.f17862m = z10 && pVar.c();
        this.f17863n = new h2.d();
        this.f17864o = new h2.b();
        h2 h2VarD = pVar.d();
        if (h2VarD == null) {
            this.f17865p = a.y(pVar.a());
        } else {
            this.f17865p = a.z(h2VarD, null, null);
            this.f17869t = true;
        }
    }

    private Object X(Object obj) {
        return (this.f17865p.f17872h == null || !this.f17865p.f17872h.equals(obj)) ? obj : a.f17870i;
    }

    private Object Y(Object obj) {
        return (this.f17865p.f17872h == null || !obj.equals(a.f17870i)) ? obj : this.f17865p.f17872h;
    }

    private void a0(long j10) {
        m mVar = this.f17866q;
        int iF = this.f17865p.f(mVar.f17853a.f51199a);
        if (iF == -1) {
            return;
        }
        long j11 = this.f17865p.j(iF, this.f17864o).f17001d;
        if (j11 != C.TIME_UNSET && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        mVar.l(j10);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void C() {
        this.f17868s = false;
        this.f17867r = false;
        super.C();
    }

    @Override // com.google.android.exoplayer2.source.i0
    protected p.b M(p.b bVar) {
        return bVar.c(X(bVar.f51199a));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.i0
    protected void S(h2 h2Var) {
        long j10;
        p.b bVarC;
        if (this.f17868s) {
            this.f17865p = this.f17865p.x(h2Var);
            m mVar = this.f17866q;
            if (mVar != null) {
                a0(mVar.h());
            }
        } else {
            if (!h2Var.u()) {
                h2Var.r(0, this.f17863n);
                long jE = this.f17863n.e();
                Object obj = this.f17863n.f17018a;
                m mVar2 = this.f17866q;
                if (mVar2 != null) {
                    long jI = mVar2.i();
                    this.f17865p.l(this.f17866q.f17853a.f51199a, this.f17864o);
                    long jQ = this.f17864o.q() + jI;
                    if (jQ != this.f17865p.r(0, this.f17863n).e()) {
                        j10 = jQ;
                    } else {
                        j10 = jE;
                    }
                } else {
                    j10 = jE;
                }
                Pair pairN = h2Var.n(this.f17863n, this.f17864o, 0, j10);
                Object obj2 = pairN.first;
                long jLongValue = ((Long) pairN.second).longValue();
                this.f17865p = this.f17869t ? this.f17865p.x(h2Var) : a.z(h2Var, obj, obj2);
                m mVar3 = this.f17866q;
                if (mVar3 != null) {
                    a0(jLongValue);
                    p.b bVar = mVar3.f17853a;
                    bVarC = bVar.c(Y(bVar.f51199a));
                }
                this.f17869t = true;
                this.f17868s = true;
                B(this.f17865p);
                if (bVarC != null) {
                    ((m) ob.a.e(this.f17866q)).a(bVarC);
                }
            }
            this.f17865p = this.f17869t ? this.f17865p.x(h2Var) : a.z(h2Var, h2.d.f17009r, a.f17870i);
        }
        bVarC = null;
        this.f17869t = true;
        this.f17868s = true;
        B(this.f17865p);
        if (bVarC != null) {
            ((m) ob.a.e(this.f17866q)).a(bVarC);
        }
    }

    @Override // com.google.android.exoplayer2.source.i0
    public void V() {
        if (this.f17862m) {
            return;
        }
        this.f17867r = true;
        U();
    }

    @Override // com.google.android.exoplayer2.source.p
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public m o(p.b bVar, nb.b bVar2, long j10) {
        m mVar = new m(bVar, bVar2, j10);
        mVar.n(this.f17828k);
        if (this.f17868s) {
            mVar.a(bVar.c(Y(bVar.f51199a)));
            return mVar;
        }
        this.f17866q = mVar;
        if (!this.f17867r) {
            this.f17867r = true;
            U();
        }
        return mVar;
    }

    public h2 Z() {
        return this.f17865p;
    }

    @Override // com.google.android.exoplayer2.source.p
    public void l(o oVar) {
        ((m) oVar).m();
        if (oVar == this.f17866q) {
            this.f17866q = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.p
    public void maybeThrowSourceInfoRefreshError() {
    }
}
