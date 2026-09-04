package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.y0;
import com.google.common.collect.o0;
import com.google.common.collect.p0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class MergingMediaSource extends c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final y0 f17378v = new y0.c().d("MergingMediaSource").a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f17379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f17380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p[] f17381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final h2[] f17382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayList f17383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ra.d f17384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map f17385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o0 f17386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[][] f17388t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private IllegalMergeException f17389u;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class IllegalMergeException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17390a;

        public IllegalMergeException(int i10) {
            this.f17390a = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long[] f17391g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long[] f17392h;

        public a(h2 h2Var, Map map) {
            super(h2Var);
            int iT = h2Var.t();
            this.f17392h = new long[h2Var.t()];
            h2.d dVar = new h2.d();
            for (int i10 = 0; i10 < iT; i10++) {
                this.f17392h[i10] = h2Var.r(i10, dVar).f17031n;
            }
            int iM = h2Var.m();
            this.f17391g = new long[iM];
            h2.b bVar = new h2.b();
            for (int i11 = 0; i11 < iM; i11++) {
                h2Var.k(i11, bVar, true);
                long jLongValue = ((Long) ob.a.e((Long) map.get(bVar.f16999b))).longValue();
                long[] jArr = this.f17391g;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f17001d : jLongValue;
                jArr[i11] = jLongValue;
                long j10 = bVar.f17001d;
                if (j10 != C.TIME_UNSET) {
                    long[] jArr2 = this.f17392h;
                    int i12 = bVar.f17000c;
                    jArr2[i12] = jArr2[i12] - (j10 - jLongValue);
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public h2.b k(int i10, h2.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f17001d = this.f17391g[i10];
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public h2.d s(int i10, h2.d dVar, long j10) {
            long jMin;
            super.s(i10, dVar, j10);
            long j11 = this.f17392h[i10];
            dVar.f17031n = j11;
            if (j11 != C.TIME_UNSET) {
                long j12 = dVar.f17030m;
                if (j12 == C.TIME_UNSET) {
                    jMin = dVar.f17030m;
                } else {
                    jMin = Math.min(j12, j11);
                }
            } else {
                jMin = dVar.f17030m;
            }
            dVar.f17030m = jMin;
            return dVar;
        }
    }

    public MergingMediaSource(p... pVarArr) {
        this(false, pVarArr);
    }

    private void M() {
        h2.b bVar = new h2.b();
        for (int i10 = 0; i10 < this.f17387s; i10++) {
            long j10 = -this.f17382n[0].j(i10, bVar).q();
            int i11 = 1;
            while (true) {
                h2[] h2VarArr = this.f17382n;
                if (i11 < h2VarArr.length) {
                    this.f17388t[i10][i11] = j10 - (-h2VarArr[i11].j(i10, bVar).q());
                    i11++;
                }
            }
        }
    }

    private void P() {
        h2[] h2VarArr;
        h2.b bVar = new h2.b();
        for (int i10 = 0; i10 < this.f17387s; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                h2VarArr = this.f17382n;
                if (i11 >= h2VarArr.length) {
                    break;
                }
                long jM = h2VarArr[i11].j(i10, bVar).m();
                if (jM != C.TIME_UNSET) {
                    long j11 = jM + this.f17388t[i10][i11];
                    if (j10 == Long.MIN_VALUE || j11 < j10) {
                        j10 = j11;
                    }
                }
                i11++;
            }
            Object objQ = h2VarArr[0].q(i10);
            this.f17385q.put(objQ, Long.valueOf(j10));
            Iterator it = this.f17386r.get(objQ).iterator();
            while (it.hasNext()) {
                ((b) it.next()).l(0L, j10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void A(nb.a0 a0Var) {
        super.A(a0Var);
        for (int i10 = 0; i10 < this.f17381m.length; i10++) {
            K(Integer.valueOf(i10), this.f17381m[i10]);
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void C() {
        super.C();
        Arrays.fill(this.f17382n, (Object) null);
        this.f17387s = -1;
        this.f17389u = null;
        this.f17383o.clear();
        Collections.addAll(this.f17383o, this.f17381m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public p.b G(Integer num, p.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void J(Integer num, p pVar, h2 h2Var) {
        if (this.f17389u != null) {
            return;
        }
        if (this.f17387s == -1) {
            this.f17387s = h2Var.m();
        } else if (h2Var.m() != this.f17387s) {
            this.f17389u = new IllegalMergeException(0);
            return;
        }
        if (this.f17388t.length == 0) {
            this.f17388t = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f17387s, this.f17382n.length);
        }
        this.f17383o.remove(pVar);
        this.f17382n[num.intValue()] = h2Var;
        if (this.f17383o.isEmpty()) {
            if (this.f17379k) {
                M();
            }
            h2 aVar = this.f17382n[0];
            if (this.f17380l) {
                P();
                aVar = new a(aVar, this.f17385q);
            }
            B(aVar);
        }
    }

    @Override // com.google.android.exoplayer2.source.p
    public y0 a() {
        p[] pVarArr = this.f17381m;
        return pVarArr.length > 0 ? pVarArr[0].a() : f17378v;
    }

    @Override // com.google.android.exoplayer2.source.p
    public void l(o oVar) {
        if (this.f17380l) {
            b bVar = (b) oVar;
            for (Map.Entry entry : this.f17386r.d()) {
                if (((b) entry.getValue()).equals(bVar)) {
                    this.f17386r.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            oVar = bVar.f17412a;
        }
        s sVar = (s) oVar;
        int i10 = 0;
        while (true) {
            p[] pVarArr = this.f17381m;
            if (i10 >= pVarArr.length) {
                return;
            }
            pVarArr[i10].l(sVar.a(i10));
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.p
    public void maybeThrowSourceInfoRefreshError() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.f17389u;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.p
    public o o(p.b bVar, nb.b bVar2, long j10) {
        int length = this.f17381m.length;
        o[] oVarArr = new o[length];
        int iF = this.f17382n[0].f(bVar.f51199a);
        for (int i10 = 0; i10 < length; i10++) {
            oVarArr[i10] = this.f17381m[i10].o(bVar.c(this.f17382n[i10].q(iF)), bVar2, j10 - this.f17388t[iF][i10]);
        }
        s sVar = new s(this.f17384p, this.f17388t[iF], oVarArr);
        if (!this.f17380l) {
            return sVar;
        }
        b bVar3 = new b(sVar, true, 0L, ((Long) ob.a.e((Long) this.f17385q.get(bVar.f51199a))).longValue());
        this.f17386r.put(bVar.f51199a, bVar3);
        return bVar3;
    }

    public MergingMediaSource(boolean z10, p... pVarArr) {
        this(z10, false, pVarArr);
    }

    public MergingMediaSource(boolean z10, boolean z11, p... pVarArr) {
        this(z10, z11, new ra.f(), pVarArr);
    }

    public MergingMediaSource(boolean z10, boolean z11, ra.d dVar, p... pVarArr) {
        this.f17379k = z10;
        this.f17380l = z11;
        this.f17381m = pVarArr;
        this.f17384p = dVar;
        this.f17383o = new ArrayList(Arrays.asList(pVarArr));
        this.f17387s = -1;
        this.f17382n = new h2[pVarArr.length];
        this.f17388t = new long[0][];
        this.f17385q = new HashMap();
        this.f17386r = p0.a().a().e();
    }
}
