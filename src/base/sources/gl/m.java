package gl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends l {
    public static int[] A(int[] iArr, int[] elements) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        kotlin.jvm.internal.s.h(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        kotlin.jvm.internal.s.e(iArrCopyOf);
        return iArrCopyOf;
    }

    public static long[] B(long[] jArr, long[] elements) {
        kotlin.jvm.internal.s.h(jArr, "<this>");
        kotlin.jvm.internal.s.h(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        kotlin.jvm.internal.s.e(jArrCopyOf);
        return jArrCopyOf;
    }

    public static Object[] C(Object[] objArr, Object[] elements) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        kotlin.jvm.internal.s.h(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        kotlin.jvm.internal.s.e(objArrCopyOf);
        return objArrCopyOf;
    }

    public static boolean[] D(boolean[] zArr, boolean[] elements) {
        kotlin.jvm.internal.s.h(zArr, "<this>");
        kotlin.jvm.internal.s.h(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        kotlin.jvm.internal.s.e(zArrCopyOf);
        return zArrCopyOf;
    }

    public static void E(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void F(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        kotlin.jvm.internal.s.h(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static Boolean[] G(boolean[] zArr) {
        kotlin.jvm.internal.s.h(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static Float[] H(float[] fArr) {
        kotlin.jvm.internal.s.h(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static Integer[] I(int[] iArr) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    public static Long[] J(long[] jArr) {
        kotlin.jvm.internal.s.h(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    public static List e(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        List listA = p.a(objArr);
        kotlin.jvm.internal.s.g(listA, "asList(...)");
        return listA;
    }

    public static byte[] f(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.s.h(bArr, "<this>");
        kotlin.jvm.internal.s.h(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static char[] g(char[] cArr, char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.s.h(cArr, "<this>");
        kotlin.jvm.internal.s.h(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static final float[] h(float[] fArr, float[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.s.h(fArr, "<this>");
        kotlin.jvm.internal.s.h(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static int[] i(int[] iArr, int[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        kotlin.jvm.internal.s.h(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static long[] j(long[] jArr, long[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.s.h(jArr, "<this>");
        kotlin.jvm.internal.s.h(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static Object[] k(Object[] objArr, Object[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        kotlin.jvm.internal.s.h(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] l(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return f(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ float[] m(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return h(fArr, fArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] n(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return i(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] o(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return k(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] p(byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.s.h(bArr, "<this>");
        k.c(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        kotlin.jvm.internal.s.g(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] q(Object[] objArr, int i10, int i11) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        k.c(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        kotlin.jvm.internal.s.g(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void r(byte[] bArr, byte b10, int i10, int i11) {
        kotlin.jvm.internal.s.h(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }

    public static final void s(int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final void t(long[] jArr, long j10, int i10, int i11) {
        kotlin.jvm.internal.s.h(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static void u(Object[] objArr, Object obj, int i10, int i11) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static /* synthetic */ void v(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        s(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void w(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        t(jArr, j10, i10, i11);
    }

    public static /* synthetic */ void x(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        u(objArr, obj, i10, i11);
    }

    public static byte[] y(byte[] bArr, byte[] elements) {
        kotlin.jvm.internal.s.h(bArr, "<this>");
        kotlin.jvm.internal.s.h(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        kotlin.jvm.internal.s.e(bArrCopyOf);
        return bArrCopyOf;
    }

    public static float[] z(float[] fArr, float[] elements) {
        kotlin.jvm.internal.s.h(fArr, "<this>");
        kotlin.jvm.internal.s.h(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        kotlin.jvm.internal.s.e(fArrCopyOf);
        return fArrCopyOf;
    }
}
