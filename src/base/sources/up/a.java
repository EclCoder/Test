package up;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str + " must not be null");
    }

    public static int b(int i10, int i11) {
        int i12 = i10 + i11;
        if ((i10 ^ i12) >= 0 || (i10 ^ i11) < 0) {
            return i12;
        }
        throw new ArithmeticException("Addition overflows an int: " + i10 + " + " + i11);
    }

    public static int c(int i10, int i11) {
        long j10 = ((long) i10) * ((long) i11);
        if (j10 >= -2147483648L && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new ArithmeticException("Multiplication overflows an int: " + i10 + " * " + i11);
    }
}
