package androidx.media3.exoplayer;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class n1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c2.a f5647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.j f5648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k1.a f5649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f5650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k1 f5653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private k1 f5654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private k1 f5655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Object f5657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private o.c f5659o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t1.a0.b f5645a = new t1.a0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t1.a0.c f5646b = new t1.a0.c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f5660p = new ArrayList();

    public n1(c2.a aVar, w1.j jVar, k1.a aVar2, o.c cVar) {
        this.f5647c = aVar;
        this.f5648d = jVar;
        this.f5649e = aVar2;
        this.f5659o = cVar;
    }

    private boolean A(t1.a0 a0Var, androidx.media3.exoplayer.source.r.b bVar) {
        if (y(bVar)) {
            return a0Var.n(a0Var.h(bVar.f6055a, this.f5645a).f52521c, this.f5646b).f52550o == a0Var.b(bVar.f6055a);
        }
        return false;
    }

    private static boolean C(t1.a0.b bVar) {
        int iC = bVar.c();
        if (iC != 0 && ((iC != 1 || !bVar.q(0)) && bVar.r(bVar.o()))) {
            long jI = 0;
            if (bVar.e(0L) == -1) {
                if (bVar.f52522d == 0) {
                    return true;
                }
                int i10 = iC - (bVar.q(iC + (-1)) ? 2 : 1);
                for (int i11 = 0; i11 <= i10; i11++) {
                    jI += bVar.i(i11);
                }
                if (bVar.f52522d <= jI) {
                    return true;
                }
            }
        }
        return false;
    }

    private void D() {
        final com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
        for (k1 k1VarK = this.f5653i; k1VarK != null; k1VarK = k1VarK.k()) {
            aVarR.a(k1VarK.f5446f.f5477a);
        }
        k1 k1Var = this.f5654j;
        final androidx.media3.exoplayer.source.r.b bVar = k1Var == null ? null : k1Var.f5446f.f5477a;
        this.f5648d.post(new Runnable() { // from class: androidx.media3.exoplayer.m1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5503a.f5647c.n(aVarR.m(), bVar);
            }
        });
    }

    private void F(List list) {
        for (int i10 = 0; i10 < this.f5660p.size(); i10++) {
            ((k1) this.f5660p.get(i10)).v();
        }
        this.f5660p = list;
    }

    private k1 I(l1 l1Var) {
        for (int i10 = 0; i10 < this.f5660p.size(); i10++) {
            if (((k1) this.f5660p.get(i10)).d(l1Var)) {
                return (k1) this.f5660p.remove(i10);
            }
        }
        return null;
    }

    private static androidx.media3.exoplayer.source.r.b J(t1.a0 a0Var, Object obj, long j10, long j11, t1.a0.c cVar, t1.a0.b bVar) {
        a0Var.h(obj, bVar);
        a0Var.n(bVar.f52521c, cVar);
        for (int iB = a0Var.b(obj); C(bVar) && iB <= cVar.f52550o; iB++) {
            a0Var.g(iB, bVar, true);
            obj = w1.a.e(bVar.f52520b);
        }
        a0Var.h(obj, bVar);
        int iE = bVar.e(j10);
        return iE == -1 ? new androidx.media3.exoplayer.source.r.b(obj, j11, bVar.d(j10)) : new androidx.media3.exoplayer.source.r.b(obj, iE, bVar.k(iE), j11);
    }

    private long L(t1.a0 a0Var, Object obj) {
        int iB;
        int i10 = a0Var.h(obj, this.f5645a).f52521c;
        Object obj2 = this.f5657m;
        if (obj2 != null && (iB = a0Var.b(obj2)) != -1 && a0Var.f(iB, this.f5645a).f52521c == i10) {
            return this.f5658n;
        }
        for (k1 k1VarK = this.f5653i; k1VarK != null; k1VarK = k1VarK.k()) {
            if (k1VarK.f5442b.equals(obj)) {
                return k1VarK.f5446f.f5477a.f6058d;
            }
        }
        for (k1 k1VarK2 = this.f5653i; k1VarK2 != null; k1VarK2 = k1VarK2.k()) {
            int iB2 = a0Var.b(k1VarK2.f5442b);
            if (iB2 != -1 && a0Var.f(iB2, this.f5645a).f52521c == i10) {
                return k1VarK2.f5446f.f5477a.f6058d;
            }
        }
        long jM = M(obj);
        if (jM != -1) {
            return jM;
        }
        long j10 = this.f5650f;
        this.f5650f = 1 + j10;
        if (this.f5653i == null) {
            this.f5657m = obj;
            this.f5658n = j10;
        }
        return j10;
    }

    private long M(Object obj) {
        for (int i10 = 0; i10 < this.f5660p.size(); i10++) {
            k1 k1Var = (k1) this.f5660p.get(i10);
            if (k1Var.f5442b.equals(obj)) {
                return k1Var.f5446f.f5477a.f6058d;
            }
        }
        return -1L;
    }

    private boolean O(t1.a0 a0Var) {
        t1.a0 a0Var2;
        k1 k1VarK = this.f5653i;
        if (k1VarK == null) {
            return true;
        }
        int iB = a0Var.b(k1VarK.f5442b);
        while (true) {
            a0Var2 = a0Var;
            iB = a0Var2.d(iB, this.f5645a, this.f5646b, this.f5651g, this.f5652h);
            while (((k1) w1.a.e(k1VarK)).k() != null && !k1VarK.f5446f.f5483g) {
                k1VarK = k1VarK.k();
            }
            k1 k1VarK2 = k1VarK.k();
            if (iB == -1 || k1VarK2 == null || a0Var2.b(k1VarK2.f5442b) != iB) {
                break;
            }
            k1VarK = k1VarK2;
            a0Var = a0Var2;
        }
        boolean zH = H(k1VarK);
        k1VarK.f5446f = v(a0Var2, k1VarK.f5446f);
        return !zH;
    }

    static boolean d(long j10, long j11) {
        return j10 == C.TIME_UNSET || j10 == j11;
    }

    private boolean e(l1 l1Var, l1 l1Var2) {
        return l1Var.f5478b == l1Var2.f5478b && l1Var.f5477a.equals(l1Var2.f5477a);
    }

    private Pair h(t1.a0 a0Var, Object obj, long j10) {
        int iE = a0Var.e(a0Var.h(obj, this.f5645a).f52521c, this.f5651g, this.f5652h);
        if (iE != -1) {
            return a0Var.k(this.f5646b, this.f5645a, iE, C.TIME_UNSET, j10);
        }
        return null;
    }

    private l1 i(c2 c2Var) {
        return n(c2Var.f5125a, c2Var.f5126b, c2Var.f5127c, c2Var.f5143s);
    }

    private l1 j(t1.a0 a0Var, k1 k1Var, long j10) {
        Object obj;
        long j11;
        l1 l1Var = k1Var.f5446f;
        int iD = a0Var.d(a0Var.b(l1Var.f5477a.f6055a), this.f5645a, this.f5646b, this.f5651g, this.f5652h);
        if (iD == -1) {
            return null;
        }
        int i10 = a0Var.g(iD, this.f5645a, true).f52521c;
        Object objE = w1.a.e(this.f5645a.f52520b);
        long j12 = l1Var.f5477a.f6058d;
        long j13 = 0;
        if (a0Var.n(i10, this.f5646b).f52549n == iD) {
            Pair pairK = a0Var.k(this.f5646b, this.f5645a, i10, C.TIME_UNSET, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            Object obj2 = pairK.first;
            long jLongValue = ((Long) pairK.second).longValue();
            k1 k1VarK = k1Var.k();
            if (k1VarK == null || !k1VarK.f5442b.equals(obj2)) {
                long jM = M(obj2);
                if (jM == -1) {
                    jM = this.f5650f;
                    this.f5650f = 1 + jM;
                }
                j12 = jM;
            } else {
                j12 = k1VarK.f5446f.f5477a.f6058d;
            }
            obj = obj2;
            j11 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            obj = objE;
            j11 = 0;
        }
        androidx.media3.exoplayer.source.r.b bVarJ = J(a0Var, obj, j11, j12, this.f5646b, this.f5645a);
        if (j13 != C.TIME_UNSET && l1Var.f5479c != C.TIME_UNSET) {
            boolean zW = w(l1Var.f5477a.f6055a, a0Var);
            if (bVarJ.b() && zW) {
                j13 = l1Var.f5479c;
            } else if (zW) {
                j11 = l1Var.f5479c;
            }
        }
        return n(a0Var, bVarJ, j13, j11);
    }

    private l1 k(t1.a0 a0Var, k1 k1Var, long j10) {
        l1 l1Var = k1Var.f5446f;
        long jM = (k1Var.m() + l1Var.f5481e) - j10;
        return l1Var.f5483g ? j(a0Var, k1Var, jM) : l(a0Var, k1Var, jM);
    }

    private l1 l(t1.a0 a0Var, k1 k1Var, long j10) {
        l1 l1Var = k1Var.f5446f;
        androidx.media3.exoplayer.source.r.b bVar = l1Var.f5477a;
        a0Var.h(bVar.f6055a, this.f5645a);
        if (!bVar.b()) {
            int i10 = bVar.f6059e;
            if (i10 != -1 && this.f5645a.q(i10)) {
                return j(a0Var, k1Var, j10);
            }
            int iK = this.f5645a.k(bVar.f6059e);
            boolean z10 = this.f5645a.r(bVar.f6059e) && this.f5645a.h(bVar.f6059e, iK) == 3;
            if (iK == this.f5645a.a(bVar.f6059e) || z10) {
                return p(a0Var, bVar.f6055a, r(a0Var, bVar.f6055a, bVar.f6059e), l1Var.f5481e, bVar.f6058d);
            }
            return o(a0Var, bVar.f6055a, bVar.f6059e, iK, l1Var.f5481e, bVar.f6058d);
        }
        int i11 = bVar.f6056b;
        int iA = this.f5645a.a(i11);
        if (iA == -1) {
            return null;
        }
        int iL = this.f5645a.l(i11, bVar.f6057c);
        if (iL < iA) {
            return o(a0Var, bVar.f6055a, i11, iL, l1Var.f5479c, bVar.f6058d);
        }
        long jLongValue = l1Var.f5479c;
        if (jLongValue == C.TIME_UNSET) {
            t1.a0.c cVar = this.f5646b;
            t1.a0.b bVar2 = this.f5645a;
            Pair pairK = a0Var.k(cVar, bVar2, bVar2.f52521c, C.TIME_UNSET, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            jLongValue = ((Long) pairK.second).longValue();
        }
        return p(a0Var, bVar.f6055a, Math.max(r(a0Var, bVar.f6055a, bVar.f6056b), jLongValue), l1Var.f5479c, bVar.f6058d);
    }

    private l1 n(t1.a0 a0Var, androidx.media3.exoplayer.source.r.b bVar, long j10, long j11) {
        a0Var.h(bVar.f6055a, this.f5645a);
        return bVar.b() ? o(a0Var, bVar.f6055a, bVar.f6056b, bVar.f6057c, j10, bVar.f6058d) : p(a0Var, bVar.f6055a, j11, j10, bVar.f6058d);
    }

    private l1 o(t1.a0 a0Var, Object obj, int i10, int i11, long j10, long j11) {
        androidx.media3.exoplayer.source.r.b bVar = new androidx.media3.exoplayer.source.r.b(obj, i10, i11, j11);
        long jB = a0Var.h(bVar.f6055a, this.f5645a).b(bVar.f6056b, bVar.f6057c);
        long jG = i11 == this.f5645a.k(i10) ? this.f5645a.g() : 0L;
        boolean zR = this.f5645a.r(bVar.f6056b);
        if (jB != C.TIME_UNSET && jG >= jB) {
            jG = Math.max(0L, jB - 1);
        }
        return new l1(bVar, jG, j10, C.TIME_UNSET, jB, zR, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    private l1 p(t1.a0 a0Var, Object obj, long j10, long j11, long j12) {
        boolean z10;
        long j13;
        long jF;
        long j14;
        long jMax = j10;
        a0Var.h(obj, this.f5645a);
        int iD = this.f5645a.d(jMax);
        boolean z11 = iD != -1 && this.f5645a.q(iD);
        if (iD == -1) {
            if (this.f5645a.c() > 0) {
                t1.a0.b bVar = this.f5645a;
                if (bVar.r(bVar.o())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else if (this.f5645a.r(iD)) {
            long jF2 = this.f5645a.f(iD);
            t1.a0.b bVar2 = this.f5645a;
            if (jF2 == bVar2.f52522d && bVar2.p(iD)) {
                z10 = true;
                iD = -1;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        androidx.media3.exoplayer.source.r.b bVar3 = new androidx.media3.exoplayer.source.r.b(obj, j12, iD);
        boolean zY = y(bVar3);
        boolean zA = A(a0Var, bVar3);
        boolean z12 = z(a0Var, bVar3, zY);
        boolean z13 = (iD == -1 || !this.f5645a.r(iD) || z11) ? false : true;
        if (iD == -1 || z11) {
            if (z10) {
                jF = this.f5645a.f52522d;
            } else {
                j13 = -9223372036854775807L;
            }
            if (j13 != C.TIME_UNSET || j13 == Long.MIN_VALUE) {
                j14 = this.f5645a.f52522d;
            } else {
                j14 = j13;
            }
            if (j14 != C.TIME_UNSET && jMax >= j14) {
                jMax = Math.max(0L, j14 - ((long) ((z12 && z10) ? 0 : 1)));
            }
            return new l1(bVar3, jMax, j11, j13, j14, z13, zY, zA, z12);
        }
        jF = this.f5645a.f(iD);
        j13 = jF;
        if (j13 != C.TIME_UNSET) {
            j14 = this.f5645a.f52522d;
        } else {
            j14 = this.f5645a.f52522d;
        }
        if (j14 != C.TIME_UNSET) {
            jMax = Math.max(0L, j14 - ((long) ((z12 && z10) ? 0 : 1)));
        }
        return new l1(bVar3, jMax, j11, j13, j14, z13, zY, zA, z12);
    }

    private l1 q(t1.a0 a0Var, Object obj, long j10, long j11) {
        androidx.media3.exoplayer.source.r.b bVarJ = J(a0Var, obj, j10, j11, this.f5646b, this.f5645a);
        return bVarJ.b() ? o(a0Var, bVarJ.f6055a, bVarJ.f6056b, bVarJ.f6057c, j10, bVarJ.f6058d) : p(a0Var, bVarJ.f6055a, j10, C.TIME_UNSET, bVarJ.f6058d);
    }

    private long r(t1.a0 a0Var, Object obj, int i10) {
        a0Var.h(obj, this.f5645a);
        long jF = this.f5645a.f(i10);
        return jF == Long.MIN_VALUE ? this.f5645a.f52522d : jF + this.f5645a.i(i10);
    }

    private boolean w(Object obj, t1.a0 a0Var) {
        int iC = a0Var.h(obj, this.f5645a).c();
        int iO = this.f5645a.o();
        if (iC <= 0 || !this.f5645a.r(iO)) {
            return false;
        }
        return iC > 1 || this.f5645a.f(iO) != Long.MIN_VALUE;
    }

    private boolean y(androidx.media3.exoplayer.source.r.b bVar) {
        return !bVar.b() && bVar.f6059e == -1;
    }

    private boolean z(t1.a0 a0Var, androidx.media3.exoplayer.source.r.b bVar, boolean z10) {
        int iB = a0Var.b(bVar.f6055a);
        return !a0Var.n(a0Var.f(iB, this.f5645a).f52521c, this.f5646b).f52544i && a0Var.r(iB, this.f5645a, this.f5646b, this.f5651g, this.f5652h) && z10;
    }

    public boolean B(androidx.media3.exoplayer.source.q qVar) {
        k1 k1Var = this.f5655k;
        return k1Var != null && k1Var.f5441a == qVar;
    }

    public void E(long j10) {
        k1 k1Var = this.f5655k;
        if (k1Var != null) {
            k1Var.u(j10);
        }
    }

    public void G() {
        if (this.f5660p.isEmpty()) {
            return;
        }
        F(new ArrayList());
    }

    public boolean H(k1 k1Var) {
        w1.a.i(k1Var);
        boolean z10 = false;
        if (k1Var.equals(this.f5655k)) {
            return false;
        }
        this.f5655k = k1Var;
        while (k1Var.k() != null) {
            k1Var = (k1) w1.a.e(k1Var.k());
            if (k1Var == this.f5654j) {
                this.f5654j = this.f5653i;
                z10 = true;
            }
            k1Var.v();
            this.f5656l--;
        }
        ((k1) w1.a.e(this.f5655k)).y(null);
        D();
        return z10;
    }

    public androidx.media3.exoplayer.source.r.b K(t1.a0 a0Var, Object obj, long j10) {
        long jL = L(a0Var, obj);
        a0Var.h(obj, this.f5645a);
        a0Var.n(this.f5645a.f52521c, this.f5646b);
        boolean z10 = false;
        for (int iB = a0Var.b(obj); iB >= this.f5646b.f52549n; iB--) {
            a0Var.g(iB, this.f5645a, true);
            boolean z11 = this.f5645a.c() > 0;
            z10 |= z11;
            t1.a0.b bVar = this.f5645a;
            if (bVar.e(bVar.f52522d) != -1) {
                obj = w1.a.e(this.f5645a.f52520b);
            }
            if (z10 && (!z11 || this.f5645a.f52522d != 0)) {
                break;
            }
        }
        return J(a0Var, obj, j10, jL, this.f5646b, this.f5645a);
    }

    public boolean N() {
        k1 k1Var = this.f5655k;
        if (k1Var != null) {
            return !k1Var.f5446f.f5485i && k1Var.s() && this.f5655k.f5446f.f5481e != C.TIME_UNSET && this.f5656l < 100;
        }
        return true;
    }

    public void P(t1.a0 a0Var, o.c cVar) {
        this.f5659o = cVar;
        x(a0Var);
    }

    public boolean Q(t1.a0 a0Var, long j10, long j11) {
        boolean zH;
        l1 l1VarV;
        k1 k1VarK = this.f5653i;
        k1 k1Var = null;
        while (k1VarK != null) {
            l1 l1Var = k1VarK.f5446f;
            if (k1Var != null) {
                l1 l1VarK = k(a0Var, k1Var, j10);
                if (l1VarK == null) {
                    zH = H(k1Var);
                } else if (e(l1Var, l1VarK)) {
                    l1VarV = l1VarK;
                } else {
                    zH = H(k1Var);
                }
                return !zH;
            }
            l1VarV = v(a0Var, l1Var);
            k1VarK.f5446f = l1VarV.a(l1Var.f5479c);
            if (!d(l1Var.f5481e, l1VarV.f5481e)) {
                k1VarK.C();
                long j12 = l1VarV.f5481e;
                return (H(k1VarK) || (k1VarK == this.f5654j && !k1VarK.f5446f.f5482f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > C.TIME_UNSET ? 1 : (j12 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : k1VarK.B(j12)) ? 1 : (j11 == ((j12 > C.TIME_UNSET ? 1 : (j12 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : k1VarK.B(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            k1Var = k1VarK;
            k1VarK = k1VarK.k();
        }
        return true;
    }

    public boolean R(t1.a0 a0Var, int i10) {
        this.f5651g = i10;
        return O(a0Var);
    }

    public boolean S(t1.a0 a0Var, boolean z10) {
        this.f5652h = z10;
        return O(a0Var);
    }

    public k1 b() {
        k1 k1Var = this.f5653i;
        if (k1Var == null) {
            return null;
        }
        if (k1Var == this.f5654j) {
            this.f5654j = k1Var.k();
        }
        this.f5653i.v();
        int i10 = this.f5656l - 1;
        this.f5656l = i10;
        if (i10 == 0) {
            this.f5655k = null;
            k1 k1Var2 = this.f5653i;
            this.f5657m = k1Var2.f5442b;
            this.f5658n = k1Var2.f5446f.f5477a.f6058d;
        }
        this.f5653i = this.f5653i.k();
        D();
        return this.f5653i;
    }

    public k1 c() {
        this.f5654j = ((k1) w1.a.i(this.f5654j)).k();
        D();
        return (k1) w1.a.i(this.f5654j);
    }

    public void f() {
        if (this.f5656l == 0) {
            return;
        }
        k1 k1VarK = (k1) w1.a.i(this.f5653i);
        this.f5657m = k1VarK.f5442b;
        this.f5658n = k1VarK.f5446f.f5477a.f6058d;
        while (k1VarK != null) {
            k1VarK.v();
            k1VarK = k1VarK.k();
        }
        this.f5653i = null;
        this.f5655k = null;
        this.f5654j = null;
        this.f5656l = 0;
        D();
    }

    public k1 g(l1 l1Var) {
        k1 k1Var = this.f5655k;
        long jM = k1Var == null ? 1000000000000L : (k1Var.m() + this.f5655k.f5446f.f5481e) - l1Var.f5478b;
        k1 k1VarI = I(l1Var);
        if (k1VarI == null) {
            k1VarI = this.f5649e.a(l1Var, jM);
        } else {
            k1VarI.f5446f = l1Var;
            k1VarI.z(jM);
        }
        k1 k1Var2 = this.f5655k;
        if (k1Var2 != null) {
            k1Var2.y(k1VarI);
        } else {
            this.f5653i = k1VarI;
            this.f5654j = k1VarI;
        }
        this.f5657m = null;
        this.f5655k = k1VarI;
        this.f5656l++;
        D();
        return k1VarI;
    }

    public k1 m() {
        return this.f5655k;
    }

    public l1 s(long j10, c2 c2Var) {
        k1 k1Var = this.f5655k;
        return k1Var == null ? i(c2Var) : k(c2Var.f5125a, k1Var, j10);
    }

    public k1 t() {
        return this.f5653i;
    }

    public k1 u() {
        return this.f5654j;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    public l1 v(t1.a0 a0Var, l1 l1Var) {
        long j10;
        long j11;
        int i10;
        boolean zR;
        int i11;
        androidx.media3.exoplayer.source.r.b bVar = l1Var.f5477a;
        boolean zY = y(bVar);
        boolean zA = A(a0Var, bVar);
        boolean z10 = z(a0Var, bVar, zY);
        a0Var.h(l1Var.f5477a.f6055a, this.f5645a);
        long jF = (bVar.b() || (i11 = bVar.f6059e) == -1) ? -9223372036854775807L : this.f5645a.f(i11);
        if (!bVar.b()) {
            if (jF == C.TIME_UNSET || jF == Long.MIN_VALUE) {
                j10 = this.f5645a.j();
            } else {
                j11 = jF;
            }
            if (bVar.b()) {
                zR = this.f5645a.r(bVar.f6056b);
            } else {
                i10 = bVar.f6059e;
                if (i10 == -1 && this.f5645a.r(i10)) {
                    zR = true;
                } else {
                    zR = false;
                }
            }
            return new l1(bVar, l1Var.f5478b, l1Var.f5479c, jF, j11, zR, zY, zA, z10);
        }
        j10 = this.f5645a.b(bVar.f6056b, bVar.f6057c);
        j11 = j10;
        if (bVar.b()) {
            zR = this.f5645a.r(bVar.f6056b);
        } else {
            i10 = bVar.f6059e;
            if (i10 == -1) {
                zR = false;
            } else {
                zR = false;
            }
        }
        return new l1(bVar, l1Var.f5478b, l1Var.f5479c, jF, j11, zR, zY, zA, z10);
    }

    public void x(t1.a0 a0Var) {
        k1 k1Var;
        if (this.f5659o.f5692a == C.TIME_UNSET || (k1Var = this.f5655k) == null) {
            G();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair pairH = h(a0Var, k1Var.f5446f.f5477a.f6055a, 0L);
        if (pairH != null && !a0Var.n(a0Var.h(pairH.first, this.f5645a).f52521c, this.f5646b).f()) {
            long jM = M(pairH.first);
            if (jM == -1) {
                jM = this.f5650f;
                this.f5650f = 1 + jM;
            }
            l1 l1VarQ = q(a0Var, pairH.first, ((Long) pairH.second).longValue(), jM);
            k1 k1VarI = I(l1VarQ);
            if (k1VarI == null) {
                k1VarI = this.f5649e.a(l1VarQ, (k1Var.m() + k1Var.f5446f.f5481e) - l1VarQ.f5478b);
            }
            arrayList.add(k1VarI);
        }
        F(arrayList);
    }
}
