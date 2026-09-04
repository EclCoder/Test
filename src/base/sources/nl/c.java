package nl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    private static final int a(int i10, int i11, int i12) {
        return c(c(i10, i12) - c(i11, i12), i12);
    }

    public static final int b(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                return i11 - a(i11, i10, i12);
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                return i11 + a(i10, i11, -i12);
            }
        }
        return i11;
    }

    private static final int c(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }
}
