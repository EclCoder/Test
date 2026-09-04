package com.google.android.exoplayer2;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends h2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f16431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.e0 f16432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f16433h;

    public a(boolean z10, com.google.android.exoplayer2.source.e0 e0Var) {
        this.f16433h = z10;
        this.f16432g = e0Var;
        this.f16431f = e0Var.getLength();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object C(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int F(int i10, boolean z10) {
        if (z10) {
            return this.f16432g.getNextIndex(i10);
        }
        if (i10 < this.f16431f - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int G(int i10, boolean z10) {
        if (z10) {
            return this.f16432g.getPreviousIndex(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public static Object z(Object obj) {
        return ((Pair) obj).second;
    }

    protected abstract Object B(int i10);

    protected abstract int D(int i10);

    protected abstract int E(int i10);

    protected abstract h2 H(int i10);

    @Override // com.google.android.exoplayer2.h2
    public int e(boolean z10) {
        if (this.f16431f == 0) {
            return -1;
        }
        if (this.f16433h) {
            z10 = false;
        }
        int firstIndex = z10 ? this.f16432g.getFirstIndex() : 0;
        while (H(firstIndex).u()) {
            firstIndex = F(firstIndex, z10);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return E(firstIndex) + H(firstIndex).e(z10);
    }

    @Override // com.google.android.exoplayer2.h2
    public final int f(Object obj) {
        int iF;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objA = A(obj);
        Object objZ = z(obj);
        int iW = w(objA);
        if (iW == -1 || (iF = H(iW).f(objZ)) == -1) {
            return -1;
        }
        return D(iW) + iF;
    }

    @Override // com.google.android.exoplayer2.h2
    public int g(boolean z10) {
        int i10 = this.f16431f;
        if (i10 == 0) {
            return -1;
        }
        if (this.f16433h) {
            z10 = false;
        }
        int lastIndex = z10 ? this.f16432g.getLastIndex() : i10 - 1;
        while (H(lastIndex).u()) {
            lastIndex = G(lastIndex, z10);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return E(lastIndex) + H(lastIndex).g(z10);
    }

    @Override // com.google.android.exoplayer2.h2
    public int i(int i10, int i11, boolean z10) {
        if (this.f16433h) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iY = y(i10);
        int iE = E(iY);
        int i12 = H(iY).i(i10 - iE, i11 != 2 ? i11 : 0, z10);
        if (i12 != -1) {
            return iE + i12;
        }
        int iF = F(iY, z10);
        while (iF != -1 && H(iF).u()) {
            iF = F(iF, z10);
        }
        if (iF != -1) {
            return E(iF) + H(iF).e(z10);
        }
        if (i11 == 2) {
            return e(z10);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.h2
    public final h2.b k(int i10, h2.b bVar, boolean z10) {
        int iX = x(i10);
        int iE = E(iX);
        H(iX).k(i10 - D(iX), bVar, z10);
        bVar.f17000c += iE;
        if (z10) {
            bVar.f16999b = C(B(iX), ob.a.e(bVar.f16999b));
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.h2
    public final h2.b l(Object obj, h2.b bVar) {
        Object objA = A(obj);
        Object objZ = z(obj);
        int iW = w(objA);
        int iE = E(iW);
        H(iW).l(objZ, bVar);
        bVar.f17000c += iE;
        bVar.f16999b = obj;
        return bVar;
    }

    @Override // com.google.android.exoplayer2.h2
    public int p(int i10, int i11, boolean z10) {
        if (this.f16433h) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iY = y(i10);
        int iE = E(iY);
        int iP = H(iY).p(i10 - iE, i11 != 2 ? i11 : 0, z10);
        if (iP != -1) {
            return iE + iP;
        }
        int iG = G(iY, z10);
        while (iG != -1 && H(iG).u()) {
            iG = G(iG, z10);
        }
        if (iG != -1) {
            return E(iG) + H(iG).g(z10);
        }
        if (i11 == 2) {
            return g(z10);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.h2
    public final Object q(int i10) {
        int iX = x(i10);
        return C(B(iX), H(iX).q(i10 - D(iX)));
    }

    @Override // com.google.android.exoplayer2.h2
    public final h2.d s(int i10, h2.d dVar, long j10) {
        int iY = y(i10);
        int iE = E(iY);
        int iD = D(iY);
        H(iY).s(i10 - iE, dVar, j10);
        Object objB = B(iY);
        if (!h2.d.f17009r.equals(dVar.f17018a)) {
            objB = C(objB, dVar.f17018a);
        }
        dVar.f17018a = objB;
        dVar.f17032o += iD;
        dVar.f17033p += iD;
        return dVar;
    }

    protected abstract int w(Object obj);

    protected abstract int x(int i10);

    protected abstract int y(int i10);
}
