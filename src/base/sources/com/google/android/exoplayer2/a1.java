package com.google.android.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.o f16435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ra.s[] f16437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b1 f16440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f16442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c2[] f16443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final lb.a0 f16444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s1 f16445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a1 f16446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ra.x f16447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private lb.b0 f16448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f16449o;

    public a1(c2[] c2VarArr, long j10, lb.a0 a0Var, nb.b bVar, s1 s1Var, b1 b1Var, lb.b0 b0Var) {
        this.f16443i = c2VarArr;
        this.f16449o = j10;
        this.f16444j = a0Var;
        this.f16445k = s1Var;
        com.google.android.exoplayer2.source.p.b bVar2 = b1Var.f16708a;
        this.f16436b = bVar2.f51199a;
        this.f16440f = b1Var;
        this.f16447m = ra.x.f51253d;
        this.f16448n = b0Var;
        this.f16437c = new ra.s[c2VarArr.length];
        this.f16442h = new boolean[c2VarArr.length];
        this.f16435a = e(bVar2, s1Var, bVar, b1Var.f16709b, b1Var.f16711d);
    }

    private void c(ra.s[] sVarArr) {
        int i10 = 0;
        while (true) {
            c2[] c2VarArr = this.f16443i;
            if (i10 >= c2VarArr.length) {
                return;
            }
            if (c2VarArr[i10].getTrackType() == -2 && this.f16448n.c(i10)) {
                sVarArr[i10] = new ra.h();
            }
            i10++;
        }
    }

    private static com.google.android.exoplayer2.source.o e(com.google.android.exoplayer2.source.p.b bVar, s1 s1Var, nb.b bVar2, long j10, long j11) {
        com.google.android.exoplayer2.source.o oVarH = s1Var.h(bVar, bVar2, j10);
        return j11 != C.TIME_UNSET ? new com.google.android.exoplayer2.source.b(oVarH, true, 0L, j11) : oVarH;
    }

    private void f() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            lb.b0 b0Var = this.f16448n;
            if (i10 >= b0Var.f44106a) {
                return;
            }
            boolean zC = b0Var.c(i10);
            lb.r rVar = this.f16448n.f44108c[i10];
            if (zC && rVar != null) {
                rVar.disable();
            }
            i10++;
        }
    }

    private void g(ra.s[] sVarArr) {
        int i10 = 0;
        while (true) {
            c2[] c2VarArr = this.f16443i;
            if (i10 >= c2VarArr.length) {
                return;
            }
            if (c2VarArr[i10].getTrackType() == -2) {
                sVarArr[i10] = null;
            }
            i10++;
        }
    }

    private void h() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            lb.b0 b0Var = this.f16448n;
            if (i10 >= b0Var.f44106a) {
                return;
            }
            boolean zC = b0Var.c(i10);
            lb.r rVar = this.f16448n.f44108c[i10];
            if (zC && rVar != null) {
                rVar.enable();
            }
            i10++;
        }
    }

    private boolean r() {
        return this.f16446l == null;
    }

    private static void u(s1 s1Var, com.google.android.exoplayer2.source.o oVar) {
        try {
            if (oVar instanceof com.google.android.exoplayer2.source.b) {
                s1Var.y(((com.google.android.exoplayer2.source.b) oVar).f17412a);
            } else {
                s1Var.y(oVar);
            }
        } catch (RuntimeException e10) {
            ob.u.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A() {
        com.google.android.exoplayer2.source.o oVar = this.f16435a;
        if (oVar instanceof com.google.android.exoplayer2.source.b) {
            long j10 = this.f16440f.f16711d;
            if (j10 == C.TIME_UNSET) {
                j10 = Long.MIN_VALUE;
            }
            ((com.google.android.exoplayer2.source.b) oVar).l(0L, j10);
        }
    }

    public long a(lb.b0 b0Var, long j10, boolean z10) {
        return b(b0Var, j10, z10, new boolean[this.f16443i.length]);
    }

    public long b(lb.b0 b0Var, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= b0Var.f44106a) {
                break;
            }
            boolean[] zArr2 = this.f16442h;
            if (z10 || !b0Var.b(this.f16448n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f16437c);
        f();
        this.f16448n = b0Var;
        h();
        long jF = this.f16435a.f(b0Var.f44108c, this.f16442h, this.f16437c, zArr, j10);
        c(this.f16437c);
        this.f16439e = false;
        int i11 = 0;
        while (true) {
            ra.s[] sVarArr = this.f16437c;
            if (i11 >= sVarArr.length) {
                return jF;
            }
            if (sVarArr[i11] != null) {
                ob.a.g(b0Var.c(i11));
                if (this.f16443i[i11].getTrackType() != -2) {
                    this.f16439e = true;
                }
            } else {
                ob.a.g(b0Var.f44108c[i11] == null);
            }
            i11++;
        }
    }

    public void d(long j10) {
        ob.a.g(r());
        this.f16435a.continueLoading(y(j10));
    }

    public long i() {
        if (!this.f16438d) {
            return this.f16440f.f16709b;
        }
        long bufferedPositionUs = this.f16439e ? this.f16435a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f16440f.f16712e : bufferedPositionUs;
    }

    public a1 j() {
        return this.f16446l;
    }

    public long k() {
        if (this.f16438d) {
            return this.f16435a.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long l() {
        return this.f16449o;
    }

    public long m() {
        return this.f16440f.f16709b + this.f16449o;
    }

    public ra.x n() {
        return this.f16447m;
    }

    public lb.b0 o() {
        return this.f16448n;
    }

    public void p(float f10, h2 h2Var) {
        this.f16438d = true;
        this.f16447m = this.f16435a.getTrackGroups();
        lb.b0 b0VarV = v(f10, h2Var);
        b1 b1Var = this.f16440f;
        long jMax = b1Var.f16709b;
        long j10 = b1Var.f16712e;
        if (j10 != C.TIME_UNSET && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(b0VarV, jMax, false);
        long j11 = this.f16449o;
        b1 b1Var2 = this.f16440f;
        this.f16449o = j11 + (b1Var2.f16709b - jA);
        this.f16440f = b1Var2.b(jA);
    }

    public boolean q() {
        if (this.f16438d) {
            return !this.f16439e || this.f16435a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public void s(long j10) {
        ob.a.g(r());
        if (this.f16438d) {
            this.f16435a.reevaluateBuffer(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f16445k, this.f16435a);
    }

    public lb.b0 v(float f10, h2 h2Var) {
        lb.b0 b0VarK = this.f16444j.k(this.f16443i, n(), this.f16440f.f16708a, h2Var);
        for (lb.r rVar : b0VarK.f44108c) {
            if (rVar != null) {
                rVar.onPlaybackSpeed(f10);
            }
        }
        return b0VarK;
    }

    public void w(a1 a1Var) {
        if (a1Var == this.f16446l) {
            return;
        }
        f();
        this.f16446l = a1Var;
        h();
    }

    public void x(long j10) {
        this.f16449o = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
