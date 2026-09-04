package lb;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import com.google.common.collect.i0;
import com.google.common.collect.k0;
import com.google.common.collect.p0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nb.d f44078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f44079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f44080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f44081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f44082l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f44083m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f44084n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f44085o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c0 f44086p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ob.d f44087q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f44088r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f44089s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f44090t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f44091u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ta.n f44092v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f44093w;

    /* JADX INFO: renamed from: lb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0671a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f44094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f44095b;

        public C0671a(long j10, long j11) {
            this.f44094a = j10;
            this.f44095b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0671a)) {
                return false;
            }
            C0671a c0671a = (C0671a) obj;
            return this.f44094a == c0671a.f44094a && this.f44095b == c0671a.f44095b;
        }

        public int hashCode() {
            return (((int) this.f44094a) * 31) + ((int) this.f44095b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements r.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f44096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f44097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f44098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f44099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f44100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f44101f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f44102g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ob.d f44103h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0015  */
        @Override // lb.r.b
        public final r[] a(r.a[] aVarArr, nb.d dVar, com.google.android.exoplayer2.source.p.b bVar, h2 h2Var) {
            nb.d dVar2;
            r rVarB;
            c0 c0VarN = a.n(aVarArr);
            r[] rVarArr = new r[aVarArr.length];
            int i10 = 0;
            while (i10 < aVarArr.length) {
                r.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f44220b;
                    if (iArr.length == 0) {
                        dVar2 = dVar;
                    } else {
                        if (iArr.length == 1) {
                            rVarB = new s(aVar.f44219a, iArr[0], aVar.f44221c);
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            rVarB = b(aVar.f44219a, iArr, aVar.f44221c, dVar2, (c0) c0VarN.get(i10));
                        }
                        rVarArr[i10] = rVarB;
                    }
                } else {
                    dVar2 = dVar;
                }
                i10++;
                dVar = dVar2;
            }
            return rVarArr;
        }

        protected a b(ra.v vVar, int[] iArr, int i10, nb.d dVar, c0 c0Var) {
            return new a(vVar, iArr, i10, dVar, this.f44096a, this.f44097b, this.f44098c, this.f44099d, this.f44100e, this.f44101f, this.f44102g, c0Var, this.f44103h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, ob.d.f48357a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, ob.d dVar) {
            this.f44096a = i10;
            this.f44097b = i11;
            this.f44098c = i12;
            this.f44099d = i13;
            this.f44100e = i14;
            this.f44101f = f10;
            this.f44102g = f11;
            this.f44103h = dVar;
        }
    }

    protected a(ra.v vVar, int[] iArr, int i10, nb.d dVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, ob.d dVar2) {
        long j13;
        super(vVar, iArr, i10);
        if (j12 < j10) {
            ob.u.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f44078h = dVar;
        this.f44079i = j10 * 1000;
        this.f44080j = j11 * 1000;
        this.f44081k = j13 * 1000;
        this.f44082l = i11;
        this.f44083m = i12;
        this.f44084n = f10;
        this.f44085o = f11;
        this.f44086p = c0.x(list);
        this.f44087q = dVar2;
        this.f44088r = 1.0f;
        this.f44090t = 0;
        this.f44091u = C.TIME_UNSET;
        this.f44093w = Long.MIN_VALUE;
    }

    private static void k(List list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            c0.a aVar = (c0.a) list.get(i10);
            if (aVar != null) {
                aVar.a(new C0671a(j10, jArr[i10]));
            }
        }
    }

    private int m(long j10, long j11) {
        long jO = o(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f44112b; i11++) {
            if (j10 == Long.MIN_VALUE || !d(i11, j10)) {
                v0 format = getFormat(i11);
                if (l(format, format.f18864h, jO)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c0 n(r.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (r.a aVar : aVarArr) {
            if (aVar == null || aVar.f44220b.length <= 1) {
                arrayList.add(null);
            } else {
                c0.a aVarR = c0.r();
                aVarR.a(new C0671a(0L, 0L));
                arrayList.add(aVarR);
            }
        }
        long[][] jArrS = s(aVarArr);
        int[] iArr = new int[jArrS.length];
        long[] jArr = new long[jArrS.length];
        for (int i10 = 0; i10 < jArrS.length; i10++) {
            long[] jArr2 = jArrS[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        k(arrayList, jArr);
        c0 c0VarT = t(jArrS);
        for (int i11 = 0; i11 < c0VarT.size(); i11++) {
            int iIntValue = ((Integer) c0VarT.get(i11)).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = jArrS[iIntValue][i12];
            k(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        k(arrayList, jArr);
        c0.a aVarR2 = c0.r();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            c0.a aVar2 = (c0.a) arrayList.get(i14);
            aVarR2.a(aVar2 == null ? c0.C() : aVar2.m());
        }
        return aVarR2.m();
    }

    private long o(long j10) {
        long jU = u(j10);
        if (this.f44086p.isEmpty()) {
            return jU;
        }
        int i10 = 1;
        while (i10 < this.f44086p.size() - 1 && ((C0671a) this.f44086p.get(i10)).f44094a < jU) {
            i10++;
        }
        C0671a c0671a = (C0671a) this.f44086p.get(i10 - 1);
        C0671a c0671a2 = (C0671a) this.f44086p.get(i10);
        long j11 = c0671a.f44094a;
        float f10 = (jU - j11) / (c0671a2.f44094a - j11);
        long j12 = c0671a.f44095b;
        return j12 + ((long) (f10 * (c0671a2.f44095b - j12)));
    }

    private long p(List list) {
        if (list.isEmpty()) {
            return C.TIME_UNSET;
        }
        ta.n nVar = (ta.n) i0.d(list);
        long j10 = nVar.f53217g;
        if (j10 != C.TIME_UNSET) {
            long j11 = nVar.f53218h;
            if (j11 != C.TIME_UNSET) {
                return j11 - j10;
            }
        }
        return C.TIME_UNSET;
    }

    private long r(ta.o[] oVarArr, List list) {
        int i10 = this.f44089s;
        if (i10 < oVarArr.length && oVarArr[i10].next()) {
            ta.o oVar = oVarArr[this.f44089s];
            return oVar.b() - oVar.a();
        }
        for (ta.o oVar2 : oVarArr) {
            if (oVar2.next()) {
                return oVar2.b() - oVar2.a();
            }
        }
        return p(list);
    }

    private static long[][] s(r.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            r.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f44220b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f44220b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f44219a.c(iArr[i11]).f18864h;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static c0 t(long[][] jArr) {
        k0 k0VarE = p0.c().a().e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d10 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d11 = dArr[i13];
                    i13++;
                    k0VarE.put(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i13]) * 0.5d) - dArr[0]) / d10), Integer.valueOf(i10));
                }
            }
        }
        return c0.x(k0VarE.values());
    }

    private long u(long j10) {
        long bitrateEstimate = this.f44078h.getBitrateEstimate();
        this.f44093w = bitrateEstimate;
        long j11 = (long) (bitrateEstimate * this.f44084n);
        long jB = this.f44078h.b();
        if (jB == C.TIME_UNSET || j10 == C.TIME_UNSET) {
            return (long) (j11 / this.f44088r);
        }
        float f10 = j10;
        return (long) ((j11 * Math.max((f10 / this.f44088r) - jB, 0.0f)) / f10);
    }

    private long v(long j10, long j11) {
        if (j10 == C.TIME_UNSET) {
            return this.f44079i;
        }
        if (j11 != C.TIME_UNSET) {
            j10 -= j11;
        }
        return Math.min((long) (j10 * this.f44085o), this.f44079i);
    }

    @Override // lb.c, lb.r
    public void disable() {
        this.f44092v = null;
    }

    @Override // lb.r
    public void e(long j10, long j11, long j12, List list, ta.o[] oVarArr) {
        long jElapsedRealtime = this.f44087q.elapsedRealtime();
        long jR = r(oVarArr, list);
        int i10 = this.f44090t;
        if (i10 == 0) {
            this.f44090t = 1;
            this.f44089s = m(jElapsedRealtime, jR);
            return;
        }
        int i11 = this.f44089s;
        int iH = list.isEmpty() ? -1 : h(((ta.n) i0.d(list)).f53214d);
        if (iH != -1) {
            i10 = ((ta.n) i0.d(list)).f53215e;
            i11 = iH;
        }
        int iM = m(jElapsedRealtime, jR);
        if (iM != i11 && !d(i11, jElapsedRealtime)) {
            v0 format = getFormat(i11);
            v0 format2 = getFormat(iM);
            long jV = v(j12, jR);
            int i12 = format2.f18864h;
            int i13 = format.f18864h;
            if ((i12 > i13 && j11 < jV) || (i12 < i13 && j11 >= this.f44080j)) {
                iM = i11;
            }
        }
        if (iM != i11) {
            i10 = 3;
        }
        this.f44090t = i10;
        this.f44089s = iM;
    }

    @Override // lb.c, lb.r
    public void enable() {
        this.f44091u = C.TIME_UNSET;
        this.f44092v = null;
    }

    @Override // lb.c, lb.r
    public int evaluateQueueSize(long j10, List list) {
        int i10;
        int i11;
        long jElapsedRealtime = this.f44087q.elapsedRealtime();
        if (!w(jElapsedRealtime, list)) {
            return list.size();
        }
        this.f44091u = jElapsedRealtime;
        this.f44092v = list.isEmpty() ? null : (ta.n) i0.d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jI0 = r0.i0(((ta.n) list.get(size - 1)).f53217g - j10, this.f44088r);
        long jQ = q();
        if (jI0 >= jQ) {
            v0 format = getFormat(m(jElapsedRealtime, p(list)));
            for (int i12 = 0; i12 < size; i12++) {
                ta.n nVar = (ta.n) list.get(i12);
                v0 v0Var = nVar.f53214d;
                if (r0.i0(nVar.f53217g - j10, this.f44088r) >= jQ && v0Var.f18864h < format.f18864h && (i10 = v0Var.f18874r) != -1 && i10 <= this.f44083m && (i11 = v0Var.f18873q) != -1 && i11 <= this.f44082l && i10 < format.f18874r) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // lb.r
    public int getSelectedIndex() {
        return this.f44089s;
    }

    @Override // lb.r
    public Object getSelectionData() {
        return null;
    }

    @Override // lb.r
    public int getSelectionReason() {
        return this.f44090t;
    }

    protected boolean l(v0 v0Var, int i10, long j10) {
        return ((long) i10) <= j10;
    }

    @Override // lb.c, lb.r
    public void onPlaybackSpeed(float f10) {
        this.f44088r = f10;
    }

    protected long q() {
        return this.f44081k;
    }

    protected boolean w(long j10, List list) {
        long j11 = this.f44091u;
        if (j11 == C.TIME_UNSET || j10 - j11 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((ta.n) i0.d(list)).equals(this.f44092v)) ? false : true;
    }
}
