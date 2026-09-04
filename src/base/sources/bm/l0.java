package bm;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 {
    public static final String a(int i10, int i11) {
        return fl.i0.c(((long) i10) & 4294967295L, b.a(i11));
    }

    public static final byte b(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        fl.x xVarC = c(str);
        if (xVarC != null) {
            return xVarC.f();
        }
        b0.p(str);
        throw new KotlinNothingValueException();
    }

    public static final fl.x c(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        return d(str, 10);
    }

    public static final fl.x d(String str, int i10) {
        kotlin.jvm.internal.s.h(str, "<this>");
        fl.z zVarG = g(str, i10);
        if (zVarG == null) {
            return null;
        }
        int iF = zVarG.f();
        if (Integer.compare(iF ^ Integer.MIN_VALUE, fl.z.b(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return fl.x.a(fl.x.b((byte) iF));
    }

    public static final int e(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        fl.z zVarF = f(str);
        if (zVarF != null) {
            return zVarF.f();
        }
        b0.p(str);
        throw new KotlinNothingValueException();
    }

    public static final fl.z f(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        return g(str, 10);
    }

    public static final fl.z g(String str, int i10) {
        int i11;
        kotlin.jvm.internal.s.h(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.s.i(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iB = fl.z.b(i10);
        int iA = 119304647;
        while (i11 < length) {
            int iB2 = b.b(str.charAt(i11), i10);
            if (iB2 < 0) {
                return null;
            }
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                if (iA == 119304647) {
                    iA = k0.a(-1, iB);
                    if (Integer.compare(i12 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iB3 = fl.z.b(i12 * iB);
            int iB4 = fl.z.b(fl.z.b(iB2) + iB3);
            if (Integer.compare(iB4 ^ Integer.MIN_VALUE, iB3 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            i12 = iB4;
        }
        return fl.z.a(i12);
    }

    public static final long h(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        fl.b0 b0VarI = i(str);
        if (b0VarI != null) {
            return b0VarI.f();
        }
        b0.p(str);
        throw new KotlinNothingValueException();
    }

    public static final fl.b0 i(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        return j(str, 10);
    }

    public static final fl.b0 j(String str, int i10) {
        kotlin.jvm.internal.s.h(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.s.i(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jB = fl.b0.b(i10);
        long j10 = 0;
        long jA = 512409557603043100L;
        while (i11 < length) {
            int iB = b.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if (Long.compare(j10 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                if (jA == 512409557603043100L) {
                    jA = i0.a(-1L, jB);
                    if (Long.compare(j10 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jB2 = fl.b0.b(j10 * jB);
            long jB3 = fl.b0.b(fl.b0.b(((long) fl.z.b(iB)) & 4294967295L) + jB2);
            if (Long.compare(jB3 ^ Long.MIN_VALUE, jB2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            j10 = jB3;
        }
        return fl.b0.a(j10);
    }

    public static final short k(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        fl.e0 e0VarL = l(str);
        if (e0VarL != null) {
            return e0VarL.f();
        }
        b0.p(str);
        throw new KotlinNothingValueException();
    }

    public static final fl.e0 l(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        return m(str, 10);
    }

    public static final fl.e0 m(String str, int i10) {
        kotlin.jvm.internal.s.h(str, "<this>");
        fl.z zVarG = g(str, i10);
        if (zVarG == null) {
            return null;
        }
        int iF = zVarG.f();
        if (Integer.compare(iF ^ Integer.MIN_VALUE, fl.z.b(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return fl.e0.a(fl.e0.b((short) iF));
    }
}
