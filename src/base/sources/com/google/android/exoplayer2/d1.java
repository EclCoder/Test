package com.google.android.exoplayer2;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h2.b f16735a = new h2.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h2.d f16736b = new h2.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p9.a f16737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ob.q f16738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f16739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f16741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a1 f16742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a1 f16743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a1 f16744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f16746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f16747m;

    public d1(p9.a aVar, ob.q qVar) {
        this.f16737c = aVar;
        this.f16738d = qVar;
    }

    private void A() {
        final com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
        for (a1 a1VarJ = this.f16742h; a1VarJ != null; a1VarJ = a1VarJ.j()) {
            aVarR.a(a1VarJ.f16440f.f16708a);
        }
        a1 a1Var = this.f16743i;
        final com.google.android.exoplayer2.source.p.b bVar = a1Var == null ? null : a1Var.f16440f.f16708a;
        this.f16738d.post(new Runnable() { // from class: com.google.android.exoplayer2.c1
            @Override // java.lang.Runnable
            public final void run() {
                this.f16720a.f16737c.O(aVarR.m(), bVar);
            }
        });
    }

    private static com.google.android.exoplayer2.source.p.b D(h2 h2Var, Object obj, long j10, long j11, h2.d dVar, h2.b bVar) {
        h2Var.l(obj, bVar);
        h2Var.r(bVar.f17000c, dVar);
        for (int iF = h2Var.f(obj); z(bVar) && iF <= dVar.f17033p; iF++) {
            h2Var.k(iF, bVar, true);
            obj = ob.a.e(bVar.f16999b);
        }
        h2Var.l(obj, bVar);
        int iH = bVar.h(j10);
        return iH == -1 ? new com.google.android.exoplayer2.source.p.b(obj, j11, bVar.g(j10)) : new com.google.android.exoplayer2.source.p.b(obj, iH, bVar.n(iH), j11);
    }

    private long F(h2 h2Var, Object obj) {
        int iF;
        int i10 = h2Var.l(obj, this.f16735a).f17000c;
        Object obj2 = this.f16746l;
        if (obj2 != null && (iF = h2Var.f(obj2)) != -1 && h2Var.j(iF, this.f16735a).f17000c == i10) {
            return this.f16747m;
        }
        for (a1 a1VarJ = this.f16742h; a1VarJ != null; a1VarJ = a1VarJ.j()) {
            if (a1VarJ.f16436b.equals(obj)) {
                return a1VarJ.f16440f.f16708a.f51202d;
            }
        }
        for (a1 a1VarJ2 = this.f16742h; a1VarJ2 != null; a1VarJ2 = a1VarJ2.j()) {
            int iF2 = h2Var.f(a1VarJ2.f16436b);
            if (iF2 != -1 && h2Var.j(iF2, this.f16735a).f17000c == i10) {
                return a1VarJ2.f16440f.f16708a.f51202d;
            }
        }
        long j10 = this.f16739e;
        this.f16739e = 1 + j10;
        if (this.f16742h == null) {
            this.f16746l = obj;
            this.f16747m = j10;
        }
        return j10;
    }

    private boolean H(h2 h2Var) {
        h2 h2Var2;
        a1 a1VarJ = this.f16742h;
        if (a1VarJ == null) {
            return true;
        }
        int iF = h2Var.f(a1VarJ.f16436b);
        while (true) {
            h2Var2 = h2Var;
            iF = h2Var2.h(iF, this.f16735a, this.f16736b, this.f16740f, this.f16741g);
            while (a1VarJ.j() != null && !a1VarJ.f16440f.f16714g) {
                a1VarJ = a1VarJ.j();
            }
            a1 a1VarJ2 = a1VarJ.j();
            if (iF == -1 || a1VarJ2 == null || h2Var2.f(a1VarJ2.f16436b) != iF) {
                break;
            }
            a1VarJ = a1VarJ2;
            h2Var = h2Var2;
        }
        boolean zC = C(a1VarJ);
        a1VarJ.f16440f = t(h2Var2, a1VarJ.f16440f);
        return !zC;
    }

    private boolean d(long j10, long j11) {
        return j10 == C.TIME_UNSET || j10 == j11;
    }

    private boolean e(b1 b1Var, b1 b1Var2) {
        return b1Var.f16709b == b1Var2.f16709b && b1Var.f16708a.equals(b1Var2.f16708a);
    }

    private b1 h(v1 v1Var) {
        return m(v1Var.f18910a, v1Var.f18911b, v1Var.f18912c, v1Var.f18927r);
    }

    private b1 i(h2 h2Var, a1 a1Var, long j10) {
        Object obj;
        long j11;
        b1 b1Var = a1Var.f16440f;
        int iH = h2Var.h(h2Var.f(b1Var.f16708a.f51199a), this.f16735a, this.f16736b, this.f16740f, this.f16741g);
        if (iH == -1) {
            return null;
        }
        int i10 = h2Var.k(iH, this.f16735a, true).f17000c;
        Object objE = ob.a.e(this.f16735a.f16999b);
        long j12 = b1Var.f16708a.f51202d;
        long j13 = 0;
        if (h2Var.r(i10, this.f16736b).f17032o == iH) {
            Pair pairO = h2Var.o(this.f16736b, this.f16735a, i10, C.TIME_UNSET, Math.max(0L, j10));
            if (pairO == null) {
                return null;
            }
            Object obj2 = pairO.first;
            long jLongValue = ((Long) pairO.second).longValue();
            a1 a1VarJ = a1Var.j();
            if (a1VarJ == null || !a1VarJ.f16436b.equals(obj2)) {
                j12 = this.f16739e;
                this.f16739e = 1 + j12;
            } else {
                j12 = a1VarJ.f16440f.f16708a.f51202d;
            }
            obj = obj2;
            j11 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            obj = objE;
            j11 = 0;
        }
        com.google.android.exoplayer2.source.p.b bVarD = D(h2Var, obj, j11, j12, this.f16736b, this.f16735a);
        if (j13 != C.TIME_UNSET && b1Var.f16710c != C.TIME_UNSET) {
            boolean zU = u(b1Var.f16708a.f51199a, h2Var);
            if (bVarD.b() && zU) {
                j13 = b1Var.f16710c;
            } else if (zU) {
                j11 = b1Var.f16710c;
            }
        }
        return m(h2Var, bVarD, j13, j11);
    }

    private b1 j(h2 h2Var, a1 a1Var, long j10) {
        b1 b1Var = a1Var.f16440f;
        long jL = (a1Var.l() + b1Var.f16712e) - j10;
        return b1Var.f16714g ? i(h2Var, a1Var, jL) : k(h2Var, a1Var, jL);
    }

    private b1 k(h2 h2Var, a1 a1Var, long j10) {
        b1 b1Var = a1Var.f16440f;
        com.google.android.exoplayer2.source.p.b bVar = b1Var.f16708a;
        h2Var.l(bVar.f51199a, this.f16735a);
        if (!bVar.b()) {
            int i10 = bVar.f51203e;
            if (i10 != -1 && this.f16735a.t(i10)) {
                return i(h2Var, a1Var, j10);
            }
            int iN = this.f16735a.n(bVar.f51203e);
            boolean z10 = this.f16735a.u(bVar.f51203e) && this.f16735a.k(bVar.f51203e, iN) == 3;
            if (iN == this.f16735a.d(bVar.f51203e) || z10) {
                return o(h2Var, bVar.f51199a, p(h2Var, bVar.f51199a, bVar.f51203e), b1Var.f16712e, bVar.f51202d);
            }
            return n(h2Var, bVar.f51199a, bVar.f51203e, iN, b1Var.f16712e, bVar.f51202d);
        }
        int i11 = bVar.f51200b;
        int iD = this.f16735a.d(i11);
        if (iD == -1) {
            return null;
        }
        int iO = this.f16735a.o(i11, bVar.f51201c);
        if (iO < iD) {
            return n(h2Var, bVar.f51199a, i11, iO, b1Var.f16710c, bVar.f51202d);
        }
        long jLongValue = b1Var.f16710c;
        if (jLongValue == C.TIME_UNSET) {
            h2.d dVar = this.f16736b;
            h2.b bVar2 = this.f16735a;
            Pair pairO = h2Var.o(dVar, bVar2, bVar2.f17000c, C.TIME_UNSET, Math.max(0L, j10));
            if (pairO == null) {
                return null;
            }
            jLongValue = ((Long) pairO.second).longValue();
        }
        return o(h2Var, bVar.f51199a, Math.max(p(h2Var, bVar.f51199a, bVar.f51200b), jLongValue), b1Var.f16710c, bVar.f51202d);
    }

    private b1 m(h2 h2Var, com.google.android.exoplayer2.source.p.b bVar, long j10, long j11) {
        h2Var.l(bVar.f51199a, this.f16735a);
        return bVar.b() ? n(h2Var, bVar.f51199a, bVar.f51200b, bVar.f51201c, j10, bVar.f51202d) : o(h2Var, bVar.f51199a, j11, j10, bVar.f51202d);
    }

    private b1 n(h2 h2Var, Object obj, int i10, int i11, long j10, long j11) {
        com.google.android.exoplayer2.source.p.b bVar = new com.google.android.exoplayer2.source.p.b(obj, i10, i11, j11);
        long jE = h2Var.l(bVar.f51199a, this.f16735a).e(bVar.f51200b, bVar.f51201c);
        long j12 = i11 == this.f16735a.n(i10) ? this.f16735a.j() : 0L;
        boolean zU = this.f16735a.u(bVar.f51200b);
        if (jE != C.TIME_UNSET && j12 >= jE) {
            j12 = Math.max(0L, jE - 1);
        }
        return new b1(bVar, j12, j10, C.TIME_UNSET, jE, zU, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    private b1 o(h2 h2Var, Object obj, long j10, long j11, long j12) {
        boolean z10;
        long j13;
        long jI;
        long j14;
        long jMax = j10;
        h2Var.l(obj, this.f16735a);
        int iG = this.f16735a.g(jMax);
        boolean z11 = iG != -1 && this.f16735a.t(iG);
        if (iG == -1) {
            if (this.f16735a.f() > 0) {
                h2.b bVar = this.f16735a;
                if (bVar.u(bVar.r())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else if (this.f16735a.u(iG)) {
            long jI2 = this.f16735a.i(iG);
            h2.b bVar2 = this.f16735a;
            if (jI2 == bVar2.f17001d && bVar2.s(iG)) {
                z10 = true;
                iG = -1;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        com.google.android.exoplayer2.source.p.b bVar3 = new com.google.android.exoplayer2.source.p.b(obj, j12, iG);
        boolean zV = v(bVar3);
        boolean zX = x(h2Var, bVar3);
        boolean zW = w(h2Var, bVar3, zV);
        boolean z12 = (iG == -1 || !this.f16735a.u(iG) || z11) ? false : true;
        if (iG == -1 || z11) {
            if (z10) {
                jI = this.f16735a.f17001d;
            } else {
                j13 = -9223372036854775807L;
            }
            if (j13 != C.TIME_UNSET || j13 == Long.MIN_VALUE) {
                j14 = this.f16735a.f17001d;
            } else {
                j14 = j13;
            }
            if (j14 != C.TIME_UNSET && jMax >= j14) {
                jMax = Math.max(0L, j14 - ((long) ((zW && z10) ? 0 : 1)));
            }
            return new b1(bVar3, jMax, j11, j13, j14, z12, zV, zX, zW);
        }
        jI = this.f16735a.i(iG);
        j13 = jI;
        if (j13 != C.TIME_UNSET) {
            j14 = this.f16735a.f17001d;
        } else {
            j14 = this.f16735a.f17001d;
        }
        if (j14 != C.TIME_UNSET) {
            jMax = Math.max(0L, j14 - ((long) ((zW && z10) ? 0 : 1)));
        }
        return new b1(bVar3, jMax, j11, j13, j14, z12, zV, zX, zW);
    }

    private long p(h2 h2Var, Object obj, int i10) {
        h2Var.l(obj, this.f16735a);
        long jI = this.f16735a.i(i10);
        return jI == Long.MIN_VALUE ? this.f16735a.f17001d : jI + this.f16735a.l(i10);
    }

    private boolean u(Object obj, h2 h2Var) {
        int iF = h2Var.l(obj, this.f16735a).f();
        int iR = this.f16735a.r();
        if (iF <= 0 || !this.f16735a.u(iR)) {
            return false;
        }
        return iF > 1 || this.f16735a.i(iR) != Long.MIN_VALUE;
    }

    private boolean v(com.google.android.exoplayer2.source.p.b bVar) {
        return !bVar.b() && bVar.f51203e == -1;
    }

    private boolean w(h2 h2Var, com.google.android.exoplayer2.source.p.b bVar, boolean z10) {
        int iF = h2Var.f(bVar.f51199a);
        return !h2Var.r(h2Var.j(iF, this.f16735a).f17000c, this.f16736b).f17026i && h2Var.v(iF, this.f16735a, this.f16736b, this.f16740f, this.f16741g) && z10;
    }

    private boolean x(h2 h2Var, com.google.android.exoplayer2.source.p.b bVar) {
        if (v(bVar)) {
            return h2Var.r(h2Var.l(bVar.f51199a, this.f16735a).f17000c, this.f16736b).f17033p == h2Var.f(bVar.f51199a);
        }
        return false;
    }

    private static boolean z(h2.b bVar) {
        int iF = bVar.f();
        if (iF != 0 && ((iF != 1 || !bVar.t(0)) && bVar.u(bVar.r()))) {
            long jL = 0;
            if (bVar.h(0L) == -1) {
                if (bVar.f17001d == 0) {
                    return true;
                }
                int i10 = iF - (bVar.t(iF + (-1)) ? 2 : 1);
                for (int i11 = 0; i11 <= i10; i11++) {
                    jL += bVar.l(i11);
                }
                if (bVar.f17001d <= jL) {
                    return true;
                }
            }
        }
        return false;
    }

    public void B(long j10) {
        a1 a1Var = this.f16744j;
        if (a1Var != null) {
            a1Var.s(j10);
        }
    }

    public boolean C(a1 a1Var) {
        boolean z10 = false;
        ob.a.g(a1Var != null);
        if (a1Var.equals(this.f16744j)) {
            return false;
        }
        this.f16744j = a1Var;
        while (a1Var.j() != null) {
            a1Var = a1Var.j();
            if (a1Var == this.f16743i) {
                this.f16743i = this.f16742h;
                z10 = true;
            }
            a1Var.t();
            this.f16745k--;
        }
        this.f16744j.w(null);
        A();
        return z10;
    }

    public com.google.android.exoplayer2.source.p.b E(h2 h2Var, Object obj, long j10) {
        long jF = F(h2Var, obj);
        h2Var.l(obj, this.f16735a);
        h2Var.r(this.f16735a.f17000c, this.f16736b);
        boolean z10 = false;
        for (int iF = h2Var.f(obj); iF >= this.f16736b.f17032o; iF--) {
            h2Var.k(iF, this.f16735a, true);
            boolean z11 = this.f16735a.f() > 0;
            z10 |= z11;
            h2.b bVar = this.f16735a;
            if (bVar.h(bVar.f17001d) != -1) {
                obj = ob.a.e(this.f16735a.f16999b);
            }
            if (z10 && (!z11 || this.f16735a.f17001d != 0)) {
                break;
            }
        }
        return D(h2Var, obj, j10, jF, this.f16736b, this.f16735a);
    }

    public boolean G() {
        a1 a1Var = this.f16744j;
        if (a1Var != null) {
            return !a1Var.f16440f.f16716i && a1Var.q() && this.f16744j.f16440f.f16712e != C.TIME_UNSET && this.f16745k < 100;
        }
        return true;
    }

    public boolean I(h2 h2Var, long j10, long j11) {
        boolean zC;
        b1 b1VarT;
        a1 a1VarJ = this.f16742h;
        a1 a1Var = null;
        while (a1VarJ != null) {
            b1 b1Var = a1VarJ.f16440f;
            if (a1Var != null) {
                b1 b1VarJ = j(h2Var, a1Var, j10);
                if (b1VarJ == null) {
                    zC = C(a1Var);
                } else if (e(b1Var, b1VarJ)) {
                    b1VarT = b1VarJ;
                } else {
                    zC = C(a1Var);
                }
                return !zC;
            }
            b1VarT = t(h2Var, b1Var);
            a1VarJ.f16440f = b1VarT.a(b1Var.f16710c);
            if (!d(b1Var.f16712e, b1VarT.f16712e)) {
                a1VarJ.A();
                long j12 = b1VarT.f16712e;
                return (C(a1VarJ) || (a1VarJ == this.f16743i && !a1VarJ.f16440f.f16713f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > C.TIME_UNSET ? 1 : (j12 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : a1VarJ.z(j12)) ? 1 : (j11 == ((j12 > C.TIME_UNSET ? 1 : (j12 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : a1VarJ.z(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            a1Var = a1VarJ;
            a1VarJ = a1VarJ.j();
        }
        return true;
    }

    public boolean J(h2 h2Var, int i10) {
        this.f16740f = i10;
        return H(h2Var);
    }

    public boolean K(h2 h2Var, boolean z10) {
        this.f16741g = z10;
        return H(h2Var);
    }

    public a1 b() {
        a1 a1Var = this.f16742h;
        if (a1Var == null) {
            return null;
        }
        if (a1Var == this.f16743i) {
            this.f16743i = a1Var.j();
        }
        this.f16742h.t();
        int i10 = this.f16745k - 1;
        this.f16745k = i10;
        if (i10 == 0) {
            this.f16744j = null;
            a1 a1Var2 = this.f16742h;
            this.f16746l = a1Var2.f16436b;
            this.f16747m = a1Var2.f16440f.f16708a.f51202d;
        }
        this.f16742h = this.f16742h.j();
        A();
        return this.f16742h;
    }

    public a1 c() {
        a1 a1Var = this.f16743i;
        ob.a.g((a1Var == null || a1Var.j() == null) ? false : true);
        this.f16743i = this.f16743i.j();
        A();
        return this.f16743i;
    }

    public void f() {
        if (this.f16745k == 0) {
            return;
        }
        a1 a1VarJ = (a1) ob.a.i(this.f16742h);
        this.f16746l = a1VarJ.f16436b;
        this.f16747m = a1VarJ.f16440f.f16708a.f51202d;
        while (a1VarJ != null) {
            a1VarJ.t();
            a1VarJ = a1VarJ.j();
        }
        this.f16742h = null;
        this.f16744j = null;
        this.f16743i = null;
        this.f16745k = 0;
        A();
    }

    public a1 g(c2[] c2VarArr, lb.a0 a0Var, nb.b bVar, s1 s1Var, b1 b1Var, lb.b0 b0Var) {
        b1 b1Var2;
        long jL;
        a1 a1Var = this.f16744j;
        if (a1Var == null) {
            jL = 1000000000000L;
            b1Var2 = b1Var;
        } else {
            b1Var2 = b1Var;
            jL = (a1Var.l() + this.f16744j.f16440f.f16712e) - b1Var2.f16709b;
        }
        a1 a1Var2 = new a1(c2VarArr, jL, a0Var, bVar, s1Var, b1Var2, b0Var);
        a1 a1Var3 = this.f16744j;
        if (a1Var3 != null) {
            a1Var3.w(a1Var2);
        } else {
            this.f16742h = a1Var2;
            this.f16743i = a1Var2;
        }
        this.f16746l = null;
        this.f16744j = a1Var2;
        this.f16745k++;
        A();
        return a1Var2;
    }

    public a1 l() {
        return this.f16744j;
    }

    public b1 q(long j10, v1 v1Var) {
        a1 a1Var = this.f16744j;
        return a1Var == null ? h(v1Var) : j(v1Var.f18910a, a1Var, j10);
    }

    public a1 r() {
        return this.f16742h;
    }

    public a1 s() {
        return this.f16743i;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    public b1 t(h2 h2Var, b1 b1Var) {
        long jM;
        long j10;
        int i10;
        boolean zU;
        int i11;
        com.google.android.exoplayer2.source.p.b bVar = b1Var.f16708a;
        boolean zV = v(bVar);
        boolean zX = x(h2Var, bVar);
        boolean zW = w(h2Var, bVar, zV);
        h2Var.l(b1Var.f16708a.f51199a, this.f16735a);
        long jI = (bVar.b() || (i11 = bVar.f51203e) == -1) ? -9223372036854775807L : this.f16735a.i(i11);
        if (!bVar.b()) {
            if (jI == C.TIME_UNSET || jI == Long.MIN_VALUE) {
                jM = this.f16735a.m();
            } else {
                j10 = jI;
            }
            if (bVar.b()) {
                zU = this.f16735a.u(bVar.f51200b);
            } else {
                i10 = bVar.f51203e;
                if (i10 == -1 && this.f16735a.u(i10)) {
                    zU = true;
                } else {
                    zU = false;
                }
            }
            return new b1(bVar, b1Var.f16709b, b1Var.f16710c, jI, j10, zU, zV, zX, zW);
        }
        jM = this.f16735a.e(bVar.f51200b, bVar.f51201c);
        j10 = jM;
        if (bVar.b()) {
            zU = this.f16735a.u(bVar.f51200b);
        } else {
            i10 = bVar.f51203e;
            if (i10 == -1) {
                zU = false;
            } else {
                zU = false;
            }
        }
        return new b1(bVar, b1Var.f16709b, b1Var.f16710c, jI, j10, zU, zV, zX, zW);
    }

    public boolean y(com.google.android.exoplayer2.source.o oVar) {
        a1 a1Var = this.f16744j;
        return a1Var != null && a1Var.f16435a == oVar;
    }
}
