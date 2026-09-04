package k2;

import android.util.Pair;
import androidx.media3.exoplayer.g2;
import androidx.media3.exoplayer.h2;
import java.util.Arrays;
import t1.a0;
import t1.b0;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f42956c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f42957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f42958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f42959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final i2.v[] f42960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f42961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[][][] f42962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final i2.v f42963g;

        a(String[] strArr, int[] iArr, i2.v[] vVarArr, int[] iArr2, int[][][] iArr3, i2.v vVar) {
            this.f42958b = strArr;
            this.f42959c = iArr;
            this.f42960d = vVarArr;
            this.f42962f = iArr3;
            this.f42961e = iArr2;
            this.f42963g = vVar;
            this.f42957a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f42960d[i10].b(i11).f52572a;
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
                String str2 = this.f42960d[i10].b(i11).a(iArr[i12]).f52757n;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !c0.c(str, str2);
                }
                iMin = Math.min(iMin, g2.g(this.f42962f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f42961e[i10]) : iMin;
        }

        public int c(int i10, int i11, int i12) {
            return this.f42962f[i10][i11][i12];
        }

        public int d() {
            return this.f42957a;
        }

        public int e(int i10) {
            return this.f42959c[i10];
        }

        public i2.v f(int i10) {
            return this.f42960d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return g2.m(c(i10, i11, i12));
        }

        public i2.v h() {
            return this.f42963g;
        }
    }

    private static int l(g2[] g2VarArr, b0 b0Var, int[] iArr, boolean z10) {
        int length = g2VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < g2VarArr.length; i11++) {
            g2 g2Var = g2VarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < b0Var.f52572a; i12++) {
                iMax = Math.max(iMax, g2.m(g2Var.a(b0Var.a(i12))));
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

    private static int[] m(g2 g2Var, b0 b0Var) {
        int[] iArr = new int[b0Var.f52572a];
        for (int i10 = 0; i10 < b0Var.f52572a; i10++) {
            iArr[i10] = g2Var.a(b0Var.a(i10));
        }
        return iArr;
    }

    private static int[] n(g2[] g2VarArr) {
        int length = g2VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = g2VarArr[i10].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    @Override // k2.v
    public final void h(Object obj) {
        this.f42956c = (a) obj;
    }

    @Override // k2.v
    public final w j(g2[] g2VarArr, i2.v vVar, androidx.media3.exoplayer.source.r.b bVar, a0 a0Var) {
        int[] iArr = new int[g2VarArr.length + 1];
        int length = g2VarArr.length + 1;
        b0[][] b0VarArr = new b0[length][];
        int[][][] iArr2 = new int[g2VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = vVar.f40818a;
            b0VarArr[i10] = new b0[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrN = n(g2VarArr);
        for (int i12 = 0; i12 < vVar.f40818a; i12++) {
            b0 b0VarB = vVar.b(i12);
            int iL = l(g2VarArr, b0VarB, iArr, b0VarB.f52574c == 5);
            int[] iArrM = iL == g2VarArr.length ? new int[b0VarB.f52572a] : m(g2VarArr[iL], b0VarB);
            int i13 = iArr[iL];
            b0VarArr[iL][i13] = b0VarB;
            iArr2[iL][i13] = iArrM;
            iArr[iL] = i13 + 1;
        }
        i2.v[] vVarArr = new i2.v[g2VarArr.length];
        String[] strArr = new String[g2VarArr.length];
        int[] iArr3 = new int[g2VarArr.length];
        for (int i14 = 0; i14 < g2VarArr.length; i14++) {
            int i15 = iArr[i14];
            vVarArr[i14] = new i2.v((b0[]) c0.I0(b0VarArr[i14], i15));
            iArr2[i14] = (int[][]) c0.I0(iArr2[i14], i15);
            strArr[i14] = g2VarArr[i14].getName();
            iArr3[i14] = g2VarArr[i14].getTrackType();
        }
        a aVar = new a(strArr, iArr3, vVarArr, iArrN, iArr2, new i2.v((b0[]) c0.I0(b0VarArr[g2VarArr.length], iArr[g2VarArr.length])));
        Pair pairO = o(aVar, iArr2, iArrN, bVar, a0Var);
        return new w((h2[]) pairO.first, (q[]) pairO.second, u.b(aVar, (t[]) pairO.second), aVar);
    }

    protected abstract Pair o(a aVar, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.source.r.b bVar, a0 a0Var);
}
