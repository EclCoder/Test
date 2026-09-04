package yn;

import xn.n0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(n0 n0Var, int i10) {
        kotlin.jvm.internal.s.h(n0Var, "<this>");
        int iA = a(n0Var.M(), i10 + 1, 0, n0Var.N().length);
        return iA >= 0 ? iA : ~iA;
    }
}
