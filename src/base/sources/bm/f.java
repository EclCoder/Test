package bm;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f9101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f9102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f9103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f9104d;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f9101a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f9102b = iArr2;
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f9103c = iArr3;
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f9104d = jArr;
    }

    private static final void a(String str, int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if (i13 < 1) {
            j(str, i10, i11, "at least", 1);
        } else if (i13 > i12) {
            c(str, i10, (i13 + i10) - i12);
        }
    }

    private static final void b(String str, int i10, int i11, String str2, String str3, boolean z10, int i12) {
        if ((i11 - i10) - str2.length() <= str3.length()) {
            k(str, i10, i11, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i13 = 0; i13 < length; i13++) {
                if (!c.e(str2.charAt(i13), str.charAt(i10 + i13), z10)) {
                    l(str, i10, i11, str2, "prefix");
                }
            }
            i10 += str2.length();
        }
        int length2 = i11 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i14 = 0; i14 < length3; i14++) {
                if (!c.e(str3.charAt(i14), str.charAt(length2 + i14), z10)) {
                    l(str, length2, i11, str3, "suffix");
                }
            }
        }
        a(str, i10, length2, i12);
    }

    private static final void c(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i10 + ", but was '" + str.charAt(i10) + "'.\nThe result won't fit the type being parsed.");
            }
            i10++;
        }
    }

    public static final int[] d() {
        return f9101a;
    }

    public static final long e(String str, int i10, int i11, g format) {
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(format, "format");
        return g(str, i10, i11, format, 16);
    }

    public static /* synthetic */ long f(String str, int i10, int i11, g gVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            gVar = g.f9106d.a();
        }
        return e(str, i10, i11, gVar);
    }

    private static final long g(String str, int i10, int i11, g gVar, int i12) {
        gl.d.f39316a.a(i10, i11, str.length());
        g.c cVarB = gVar.b();
        if (cVarB.f()) {
            a(str, i10, i11, i12);
            return h(str, i10, i11);
        }
        String strD = cVarB.d();
        String strE = cVarB.e();
        b(str, i10, i11, strD, strE, cVarB.c(), i12);
        return h(str, i10 + strD.length(), i11 - strE.length());
    }

    private static final long h(String str, int i10, int i11) {
        long j10 = 0;
        while (i10 < i11) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f9104d[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i10++;
                }
            }
            i(str, i10);
            throw new KotlinNothingValueException();
        }
        return j10;
    }

    private static final Void i(String str, int i10) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i10 + ", but was " + str.charAt(i10));
    }

    private static final void j(String str, int i10, int i11, String str2, int i12) {
        kotlin.jvm.internal.s.f(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i12 + " hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + (i11 - i10));
    }

    private static final void k(String str, int i10, int i11, String str2, String str3) {
        kotlin.jvm.internal.s.f(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    private static final void l(String str, int i10, int i11, String str2, String str3) {
        int iF = yl.g.f(str2.length() + i10, i11);
        kotlin.jvm.internal.s.f(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, iF);
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i10 + ", but was " + strSubstring);
    }
}
