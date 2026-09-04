package androidx.media3.exoplayer.source;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class p extends l0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f6042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final t1.a0.c f6043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t1.a0.b f6044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f6045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private o f6046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f6047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f6048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f6049t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends m {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f6050h = new Object();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f6051f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f6052g;

        private a(t1.a0 a0Var, Object obj, Object obj2) {
            super(a0Var);
            this.f6051f = obj;
            this.f6052g = obj2;
        }

        public static a u(t1.r rVar) {
            return new a(new b(rVar), t1.a0.c.f52526q, f6050h);
        }

        public static a v(t1.a0 a0Var, Object obj, Object obj2) {
            return new a(a0Var, obj, obj2);
        }

        @Override // androidx.media3.exoplayer.source.m, t1.a0
        public int b(Object obj) {
            Object obj2;
            t1.a0 a0Var = this.f6027e;
            if (f6050h.equals(obj) && (obj2 = this.f6052g) != null) {
                obj = obj2;
            }
            return a0Var.b(obj);
        }

        @Override // androidx.media3.exoplayer.source.m, t1.a0
        public t1.a0.b g(int i10, t1.a0.b bVar, boolean z10) {
            this.f6027e.g(i10, bVar, z10);
            if (w1.c0.c(bVar.f52520b, this.f6052g) && z10) {
                bVar.f52520b = f6050h;
            }
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.m, t1.a0
        public Object m(int i10) {
            Object objM = this.f6027e.m(i10);
            return w1.c0.c(objM, this.f6052g) ? f6050h : objM;
        }

        @Override // androidx.media3.exoplayer.source.m, t1.a0
        public t1.a0.c o(int i10, t1.a0.c cVar, long j10) {
            this.f6027e.o(i10, cVar, j10);
            if (w1.c0.c(cVar.f52536a, this.f6051f)) {
                cVar.f52536a = t1.a0.c.f52526q;
            }
            return cVar;
        }

        public a t(t1.a0 a0Var) {
            return new a(a0Var, this.f6051f, this.f6052g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t1.a0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final t1.r f6053e;

        public b(t1.r rVar) {
            this.f6053e = rVar;
        }

        @Override // t1.a0
        public int b(Object obj) {
            return obj == a.f6050h ? 0 : -1;
        }

        @Override // t1.a0
        public t1.a0.b g(int i10, t1.a0.b bVar, boolean z10) {
            bVar.t(z10 ? 0 : null, z10 ? a.f6050h : null, 0, C.TIME_UNSET, 0L, t1.a.f52480g, true);
            return bVar;
        }

        @Override // t1.a0
        public int i() {
            return 1;
        }

        @Override // t1.a0
        public Object m(int i10) {
            return a.f6050h;
        }

        @Override // t1.a0
        public t1.a0.c o(int i10, t1.a0.c cVar, long j10) {
            cVar.g(t1.a0.c.f52526q, this.f6053e, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
            cVar.f52546k = true;
            return cVar;
        }

        @Override // t1.a0
        public int p() {
            return 1;
        }
    }

    public p(r rVar, boolean z10) {
        super(rVar);
        this.f6042m = z10 && rVar.c();
        this.f6043n = new t1.a0.c();
        this.f6044o = new t1.a0.b();
        t1.a0 a0VarD = rVar.d();
        if (a0VarD == null) {
            this.f6045p = a.u(rVar.a());
        } else {
            this.f6045p = a.v(a0VarD, null, null);
            this.f6049t = true;
        }
    }

    private Object R(Object obj) {
        return (this.f6045p.f6052g == null || !this.f6045p.f6052g.equals(obj)) ? obj : a.f6050h;
    }

    private Object S(Object obj) {
        return (this.f6045p.f6052g == null || !obj.equals(a.f6050h)) ? obj : this.f6045p.f6052g;
    }

    private boolean U(long j10) {
        o oVar = this.f6046q;
        int iB = this.f6045p.b(oVar.f6033a.f6055a);
        if (iB == -1) {
            return false;
        }
        long j11 = this.f6045p.f(iB, this.f6044o).f52522d;
        if (j11 != C.TIME_UNSET && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        oVar.l(j10);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.l0
    protected r.b G(r.b bVar) {
        return bVar.a(R(bVar.f6055a));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.l0
    protected void N(t1.a0 a0Var) {
        long j10;
        r.b bVarA;
        if (this.f6048s) {
            this.f6045p = this.f6045p.t(a0Var);
            o oVar = this.f6046q;
            if (oVar != null) {
                U(oVar.h());
            }
        } else {
            if (!a0Var.q()) {
                a0Var.n(0, this.f6043n);
                long jC = this.f6043n.c();
                Object obj = this.f6043n.f52536a;
                o oVar2 = this.f6046q;
                if (oVar2 != null) {
                    long jI = oVar2.i();
                    this.f6045p.h(this.f6046q.f6033a.f6055a, this.f6044o);
                    long jN = this.f6044o.n() + jI;
                    if (jN != this.f6045p.n(0, this.f6043n).c()) {
                        j10 = jN;
                    } else {
                        j10 = jC;
                    }
                } else {
                    j10 = jC;
                }
                Pair pairJ = a0Var.j(this.f6043n, this.f6044o, 0, j10);
                Object obj2 = pairJ.first;
                long jLongValue = ((Long) pairJ.second).longValue();
                this.f6045p = this.f6049t ? this.f6045p.t(a0Var) : a.v(a0Var, obj, obj2);
                o oVar3 = this.f6046q;
                if (oVar3 != null && U(jLongValue)) {
                    r.b bVar = oVar3.f6033a;
                    bVarA = bVar.a(S(bVar.f6055a));
                }
                this.f6049t = true;
                this.f6048s = true;
                y(this.f6045p);
                if (bVarA != null) {
                    ((o) w1.a.e(this.f6046q)).b(bVarA);
                }
            }
            this.f6045p = this.f6049t ? this.f6045p.t(a0Var) : a.v(a0Var, t1.a0.c.f52526q, a.f6050h);
        }
        bVarA = null;
        this.f6049t = true;
        this.f6048s = true;
        y(this.f6045p);
        if (bVarA != null) {
            ((o) w1.a.e(this.f6046q)).b(bVarA);
        }
    }

    @Override // androidx.media3.exoplayer.source.l0
    public void P() {
        if (this.f6042m) {
            return;
        }
        this.f6047r = true;
        O();
    }

    @Override // androidx.media3.exoplayer.source.r
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public o f(r.b bVar, l2.b bVar2, long j10) {
        o oVar = new o(bVar, bVar2, j10);
        oVar.n(this.f6026k);
        if (this.f6048s) {
            oVar.b(bVar.a(S(bVar.f6055a)));
            return oVar;
        }
        this.f6046q = oVar;
        if (!this.f6047r) {
            this.f6047r = true;
            O();
        }
        return oVar;
    }

    public t1.a0 T() {
        return this.f6045p;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void j(q qVar) {
        ((o) qVar).m();
        if (qVar == this.f6046q) {
            this.f6046q = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.l0, androidx.media3.exoplayer.source.r
    public void k(t1.r rVar) {
        if (this.f6049t) {
            this.f6045p = this.f6045p.t(new i2.t(this.f6045p.f6027e, rVar));
        } else {
            this.f6045p = a.u(rVar);
        }
        this.f6026k.k(rVar);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public void z() {
        this.f6048s = false;
        this.f6047r = false;
        super.z();
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.r
    public void maybeThrowSourceInfoRefreshError() {
    }
}
