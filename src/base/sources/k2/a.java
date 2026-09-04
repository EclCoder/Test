package k2;

import com.google.common.collect.c0;
import com.google.common.collect.k0;
import com.google.common.collect.p0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t1.a0;
import t1.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l2.d f42827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f42828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f42829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f42830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f42831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f42832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f42833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f42834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c0 f42835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final w1.d f42836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f42837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f42838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f42839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f42840u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f42841v;

    /* JADX INFO: renamed from: k2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0651a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f42842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f42843b;

        public C0651a(long j10, long j11) {
            this.f42842a = j10;
            this.f42843b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0651a)) {
                return false;
            }
            C0651a c0651a = (C0651a) obj;
            return this.f42842a == c0651a.f42842a && this.f42843b == c0651a.f42843b;
        }

        public int hashCode() {
            return (((int) this.f42842a) * 31) + ((int) this.f42843b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements q.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f42844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f42845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f42846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f42847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f42848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f42849f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f42850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final w1.d f42851h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0015  */
        @Override // k2.q.b
        public final q[] a(q.a[] aVarArr, l2.d dVar, androidx.media3.exoplayer.source.r.b bVar, a0 a0Var) {
            l2.d dVar2;
            q qVarB;
            c0 c0VarG = a.g(aVarArr);
            q[] qVarArr = new q[aVarArr.length];
            int i10 = 0;
            while (i10 < aVarArr.length) {
                q.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f42952b;
                    if (iArr.length == 0) {
                        dVar2 = dVar;
                    } else {
                        if (iArr.length == 1) {
                            qVarB = new r(aVar.f42951a, iArr[0], aVar.f42953c);
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            qVarB = b(aVar.f42951a, iArr, aVar.f42953c, dVar2, (c0) c0VarG.get(i10));
                        }
                        qVarArr[i10] = qVarB;
                    }
                } else {
                    dVar2 = dVar;
                }
                i10++;
                dVar = dVar2;
            }
            return qVarArr;
        }

        protected a b(b0 b0Var, int[] iArr, int i10, l2.d dVar, c0 c0Var) {
            return new a(b0Var, iArr, i10, dVar, this.f42844a, this.f42845b, this.f42846c, this.f42847d, this.f42848e, this.f42849f, this.f42850g, c0Var, this.f42851h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, w1.d.f55786a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, w1.d dVar) {
            this.f42844a = i10;
            this.f42845b = i11;
            this.f42846c = i12;
            this.f42847d = i13;
            this.f42848e = i14;
            this.f42849f = f10;
            this.f42850g = f11;
            this.f42851h = dVar;
        }
    }

    protected a(b0 b0Var, int[] iArr, int i10, l2.d dVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, w1.d dVar2) {
        long j13;
        super(b0Var, iArr, i10);
        if (j12 < j10) {
            w1.n.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f42827h = dVar;
        this.f42828i = j10 * 1000;
        this.f42829j = j11 * 1000;
        this.f42830k = j13 * 1000;
        this.f42831l = i11;
        this.f42832m = i12;
        this.f42833n = f10;
        this.f42834o = f11;
        this.f42835p = c0.x(list);
        this.f42836q = dVar2;
        this.f42837r = 1.0f;
        this.f42839t = 0;
        this.f42840u = C.TIME_UNSET;
        this.f42841v = -2147483647L;
    }

    private static void f(List list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            c0.a aVar = (c0.a) list.get(i10);
            if (aVar != null) {
                aVar.a(new C0651a(j10, jArr[i10]));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c0 g(q.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (q.a aVar : aVarArr) {
            if (aVar == null || aVar.f42952b.length <= 1) {
                arrayList.add(null);
            } else {
                c0.a aVarR = c0.r();
                aVarR.a(new C0651a(0L, 0L));
                arrayList.add(aVarR);
            }
        }
        long[][] jArrH = h(aVarArr);
        int[] iArr = new int[jArrH.length];
        long[] jArr = new long[jArrH.length];
        for (int i10 = 0; i10 < jArrH.length; i10++) {
            long[] jArr2 = jArrH[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        f(arrayList, jArr);
        c0 c0VarI = i(jArrH);
        for (int i11 = 0; i11 < c0VarI.size(); i11++) {
            int iIntValue = ((Integer) c0VarI.get(i11)).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = jArrH[iIntValue][i12];
            f(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        f(arrayList, jArr);
        c0.a aVarR2 = c0.r();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            c0.a aVar2 = (c0.a) arrayList.get(i14);
            aVarR2.a(aVar2 == null ? c0.C() : aVar2.m());
        }
        return aVarR2.m();
    }

    private static long[][] h(q.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            q.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f42952b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f42952b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f42951a.a(iArr[i11]).f52752i;
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

    private static c0 i(long[][] jArr) {
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

    @Override // k2.c, k2.q
    public void enable() {
        this.f42840u = C.TIME_UNSET;
    }

    @Override // k2.q
    public int getSelectedIndex() {
        return this.f42838s;
    }

    @Override // k2.c, k2.q
    public void onPlaybackSpeed(float f10) {
        this.f42837r = f10;
    }

    @Override // k2.c, k2.q
    public void disable() {
    }
}
