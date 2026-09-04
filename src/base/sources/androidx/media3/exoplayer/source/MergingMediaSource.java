package androidx.media3.exoplayer.source;

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
/* JADX INFO: loaded from: classes.dex */
public final class MergingMediaSource extends c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final t1.r f5787v = new t1.r.c().d("MergingMediaSource").a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f5788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f5789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r[] f5790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final t1.a0[] f5791n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayList f5792o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final i2.e f5793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map f5794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o0 f5795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[][] f5797t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private IllegalMergeException f5798u;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class IllegalMergeException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5799a;

        public IllegalMergeException(int i10) {
            this.f5799a = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends m {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long[] f5800f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long[] f5801g;

        public a(t1.a0 a0Var, Map map) {
            super(a0Var);
            int iP = a0Var.p();
            this.f5801g = new long[a0Var.p()];
            t1.a0.c cVar = new t1.a0.c();
            for (int i10 = 0; i10 < iP; i10++) {
                this.f5801g[i10] = a0Var.n(i10, cVar).f52548m;
            }
            int i11 = a0Var.i();
            this.f5800f = new long[i11];
            t1.a0.b bVar = new t1.a0.b();
            for (int i12 = 0; i12 < i11; i12++) {
                a0Var.g(i12, bVar, true);
                long jLongValue = ((Long) w1.a.e((Long) map.get(bVar.f52520b))).longValue();
                long[] jArr = this.f5800f;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f52522d : jLongValue;
                jArr[i12] = jLongValue;
                long j10 = bVar.f52522d;
                if (j10 != C.TIME_UNSET) {
                    long[] jArr2 = this.f5801g;
                    int i13 = bVar.f52521c;
                    jArr2[i13] = jArr2[i13] - (j10 - jLongValue);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.m, t1.a0
        public t1.a0.b g(int i10, t1.a0.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f52522d = this.f5800f[i10];
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // androidx.media3.exoplayer.source.m, t1.a0
        public t1.a0.c o(int i10, t1.a0.c cVar, long j10) {
            long jMin;
            super.o(i10, cVar, j10);
            long j11 = this.f5801g[i10];
            cVar.f52548m = j11;
            if (j11 != C.TIME_UNSET) {
                long j12 = cVar.f52547l;
                if (j12 == C.TIME_UNSET) {
                    jMin = cVar.f52547l;
                } else {
                    jMin = Math.min(j12, j11);
                }
            } else {
                jMin = cVar.f52547l;
            }
            cVar.f52547l = jMin;
            return cVar;
        }
    }

    public MergingMediaSource(r... rVarArr) {
        this(false, rVarArr);
    }

    private void G() {
        t1.a0.b bVar = new t1.a0.b();
        for (int i10 = 0; i10 < this.f5796s; i10++) {
            long j10 = -this.f5791n[0].f(i10, bVar).n();
            int i11 = 1;
            while (true) {
                t1.a0[] a0VarArr = this.f5791n;
                if (i11 < a0VarArr.length) {
                    this.f5797t[i10][i11] = j10 - (-a0VarArr[i11].f(i10, bVar).n());
                    i11++;
                }
            }
        }
    }

    private void J() {
        t1.a0[] a0VarArr;
        t1.a0.b bVar = new t1.a0.b();
        for (int i10 = 0; i10 < this.f5796s; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                a0VarArr = this.f5791n;
                if (i11 >= a0VarArr.length) {
                    break;
                }
                long j11 = a0VarArr[i11].f(i10, bVar).j();
                if (j11 != C.TIME_UNSET) {
                    long j12 = j11 + this.f5797t[i10][i11];
                    if (j10 == Long.MIN_VALUE || j12 < j10) {
                        j10 = j12;
                    }
                }
                i11++;
            }
            Object objM = a0VarArr[0].m(i10);
            this.f5794q.put(objM, Long.valueOf(j10));
            Iterator it = this.f5795r.get(objM).iterator();
            while (it.hasNext()) {
                ((b) it.next()).l(0L, j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.c
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public r.b B(Integer num, r.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.c
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void E(Integer num, r rVar, t1.a0 a0Var) {
        if (this.f5798u != null) {
            return;
        }
        if (this.f5796s == -1) {
            this.f5796s = a0Var.i();
        } else if (a0Var.i() != this.f5796s) {
            this.f5798u = new IllegalMergeException(0);
            return;
        }
        if (this.f5797t.length == 0) {
            this.f5797t = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f5796s, this.f5791n.length);
        }
        this.f5792o.remove(rVar);
        this.f5791n[num.intValue()] = a0Var;
        if (this.f5792o.isEmpty()) {
            if (this.f5788k) {
                G();
            }
            t1.a0 aVar = this.f5791n[0];
            if (this.f5789l) {
                J();
                aVar = new a(aVar, this.f5794q);
            }
            y(aVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public t1.r a() {
        r[] rVarArr = this.f5790m;
        return rVarArr.length > 0 ? rVarArr[0].a() : f5787v;
    }

    @Override // androidx.media3.exoplayer.source.r
    public q f(r.b bVar, l2.b bVar2, long j10) {
        int length = this.f5790m.length;
        q[] qVarArr = new q[length];
        int iB = this.f5791n[0].b(bVar.f6055a);
        for (int i10 = 0; i10 < length; i10++) {
            qVarArr[i10] = this.f5790m[i10].f(bVar.a(this.f5791n[i10].m(iB)), bVar2, j10 - this.f5797t[iB][i10]);
        }
        v vVar = new v(this.f5793p, this.f5797t[iB], qVarArr);
        if (!this.f5789l) {
            return vVar;
        }
        b bVar3 = new b(vVar, true, 0L, ((Long) w1.a.e((Long) this.f5794q.get(bVar.f6055a))).longValue());
        this.f5795r.put(bVar.f6055a, bVar3);
        return bVar3;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void j(q qVar) {
        if (this.f5789l) {
            b bVar = (b) qVar;
            for (Map.Entry entry : this.f5795r.d()) {
                if (((b) entry.getValue()).equals(bVar)) {
                    this.f5795r.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            qVar = bVar.f5813a;
        }
        v vVar = (v) qVar;
        int i10 = 0;
        while (true) {
            r[] rVarArr = this.f5790m;
            if (i10 >= rVarArr.length) {
                return;
            }
            rVarArr[i10].j(vVar.h(i10));
            i10++;
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public void k(t1.r rVar) {
        this.f5790m[0].k(rVar);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.r
    public void maybeThrowSourceInfoRefreshError() throws IllegalMergeException {
        IllegalMergeException illegalMergeException = this.f5798u;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    protected void x(z1.m mVar) {
        super.x(mVar);
        for (int i10 = 0; i10 < this.f5790m.length; i10++) {
            F(Integer.valueOf(i10), this.f5790m[i10]);
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    protected void z() {
        super.z();
        Arrays.fill(this.f5791n, (Object) null);
        this.f5796s = -1;
        this.f5798u = null;
        this.f5792o.clear();
        Collections.addAll(this.f5792o, this.f5790m);
    }

    public MergingMediaSource(boolean z10, r... rVarArr) {
        this(z10, false, rVarArr);
    }

    public MergingMediaSource(boolean z10, boolean z11, r... rVarArr) {
        this(z10, z11, new i2.f(), rVarArr);
    }

    public MergingMediaSource(boolean z10, boolean z11, i2.e eVar, r... rVarArr) {
        this.f5788k = z10;
        this.f5789l = z11;
        this.f5790m = rVarArr;
        this.f5793p = eVar;
        this.f5792o = new ArrayList(Arrays.asList(rVarArr));
        this.f5796s = -1;
        this.f5791n = new t1.a0[rVarArr.length];
        this.f5797t = new long[0][];
        this.f5794q = new HashMap();
        this.f5795r = p0.a().a().e();
    }
}
