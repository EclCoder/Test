package lb;

import android.util.Pair;
import com.google.android.exoplayer2.c2;
import com.google.android.exoplayer2.h2;
import java.util.Arrays;
import o9.h0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f44224c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f44225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f44226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f44227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ra.x[] f44228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f44229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[][][] f44230f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ra.x f44231g;

        a(String[] strArr, int[] iArr, ra.x[] xVarArr, int[] iArr2, int[][][] iArr3, ra.x xVar) {
            this.f44226b = strArr;
            this.f44227c = iArr;
            this.f44228d = xVarArr;
            this.f44230f = iArr3;
            this.f44229e = iArr2;
            this.f44231g = xVar;
            this.f44225a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f44228d[i10].b(i11).f51248a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int iG = g(i10, i11, i14);
                if (iG == 4 || (z10 && iG == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f44228d[i10].b(i11).c(iArr[i12]).f18868l;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !r0.c(str, str2);
                }
                iMin = Math.min(iMin, c2.g(this.f44230f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f44229e[i10]) : iMin;
        }

        public int c(int i10, int i11, int i12) {
            return this.f44230f[i10][i11][i12];
        }

        public int d() {
            return this.f44225a;
        }

        public int e(int i10) {
            return this.f44227c[i10];
        }

        public ra.x f(int i10) {
            return this.f44228d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return c2.m(c(i10, i11, i12));
        }

        public ra.x h() {
            return this.f44231g;
        }
    }

    private static int n(c2[] c2VarArr, ra.v vVar, int[] iArr, boolean z10) {
        int length = c2VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < c2VarArr.length; i11++) {
            c2 c2Var = c2VarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < vVar.f51248a; i12++) {
                iMax = Math.max(iMax, c2.m(c2Var.a(vVar.c(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    private static int[] o(c2 c2Var, ra.v vVar) {
        int[] iArr = new int[vVar.f51248a];
        for (int i10 = 0; i10 < vVar.f51248a; i10++) {
            iArr[i10] = c2Var.a(vVar.c(i10));
        }
        return iArr;
    }

    private static int[] p(c2[] c2VarArr) {
        int length = c2VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = c2VarArr[i10].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    @Override // lb.a0
    public final void i(Object obj) {
        this.f44224c = (a) obj;
    }

    @Override // lb.a0
    public final b0 k(c2[] c2VarArr, ra.x xVar, com.google.android.exoplayer2.source.p.b bVar, h2 h2Var) {
        int[] iArr = new int[c2VarArr.length + 1];
        int length = c2VarArr.length + 1;
        ra.v[][] vVarArr = new ra.v[length][];
        int[][][] iArr2 = new int[c2VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = xVar.f51256a;
            vVarArr[i10] = new ra.v[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrP = p(c2VarArr);
        for (int i12 = 0; i12 < xVar.f51256a; i12++) {
            ra.v vVarB = xVar.b(i12);
            int iN = n(c2VarArr, vVarB, iArr, vVarB.f51250c == 5);
            int[] iArrO = iN == c2VarArr.length ? new int[vVarB.f51248a] : o(c2VarArr[iN], vVarB);
            int i13 = iArr[iN];
            vVarArr[iN][i13] = vVarB;
            iArr2[iN][i13] = iArrO;
            iArr[iN] = i13 + 1;
        }
        ra.x[] xVarArr = new ra.x[c2VarArr.length];
        String[] strArr = new String[c2VarArr.length];
        int[] iArr3 = new int[c2VarArr.length];
        for (int i14 = 0; i14 < c2VarArr.length; i14++) {
            int i15 = iArr[i14];
            xVarArr[i14] = new ra.x((ra.v[]) r0.M0(vVarArr[i14], i15));
            iArr2[i14] = (int[][]) r0.M0(iArr2[i14], i15);
            strArr[i14] = c2VarArr[i14].getName();
            iArr3[i14] = c2VarArr[i14].getTrackType();
        }
        a aVar = new a(strArr, iArr3, xVarArr, iArrP, iArr2, new ra.x((ra.v[]) r0.M0(vVarArr[c2VarArr.length], iArr[c2VarArr.length])));
        Pair pairQ = q(aVar, iArr2, iArrP, bVar, h2Var);
        return new b0((h0[]) pairQ.first, (r[]) pairQ.second, z.b(aVar, (u[]) pairQ.second), aVar);
    }

    protected abstract Pair q(a aVar, int[][][] iArr, int[] iArr2, com.google.android.exoplayer2.source.p.b bVar, h2 h2Var);
}
