package cm;

import bm.r;
import kotlin.jvm.internal.s;
import yl.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j10, int i10) {
        return a.h((j10 << 1) + ((long) i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10) {
        return a.h((j10 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? j(g.j(j10, -4611686018427387903L, 4611686018427387903L)) : l(n(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return a.h(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? j(o(j10)) : l(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j10) {
        return j10 / ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(String str, boolean z10) {
        int i10;
        char cCharAt;
        char cCharAt2;
        int i11;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        a.C0139a c0139a = a.f10121b;
        long jB = c0139a.b();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z11 = length2 > 0;
        boolean z12 = z11 && r.I0(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c10 = ':';
        char c11 = '0';
        if (str.charAt(length2) == 'P') {
            int i12 = length2 + 1;
            if (i12 == length) {
                throw new IllegalArgumentException();
            }
            boolean z13 = false;
            d dVar = null;
            while (i12 < length) {
                if (str.charAt(i12) != 'T') {
                    int i13 = i12;
                    while (true) {
                        if (i13 >= str.length()) {
                            i11 = length;
                            break;
                        }
                        char cCharAt4 = str.charAt(i13);
                        if (c11 > cCharAt4 || cCharAt4 >= c10) {
                            i11 = length;
                            if (!r.S("+-.", cCharAt4, false, 2, null)) {
                                break;
                            }
                        } else {
                            i11 = length;
                        }
                        i13++;
                        length = i11;
                        c11 = '0';
                        c10 = ':';
                    }
                    s.f(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i12, i13);
                    s.g(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i12 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    i12 = length3 + 1;
                    d dVarD = f.d(cCharAt5, z13);
                    if (dVar != null && dVar.compareTo(dVarD) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iE0 = r.e0(strSubstring, '.', 0, false, 6, null);
                    if (dVarD != d.SECONDS || iE0 <= 0) {
                        jB = a.B(jB, t(q(strSubstring), dVarD));
                    } else {
                        s.f(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iE0);
                        s.g(strSubstring2, "substring(...)");
                        long jB2 = a.B(jB, t(q(strSubstring2), dVarD));
                        s.f(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iE0);
                        s.g(strSubstring3, "substring(...)");
                        jB = a.B(jB2, r(Double.parseDouble(strSubstring3), dVarD));
                    }
                    z13 = z13;
                    dVar = dVarD;
                    length = i11;
                    c11 = '0';
                    c10 = ':';
                } else {
                    if (z13 || (i12 = i12 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z13 = true;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            char c12 = '0';
            if (r.D(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jB = c0139a.a();
            } else {
                boolean z14 = !z11;
                if (z11 && str.charAt(length2) == '(' && r.b1(str) == ')') {
                    length2++;
                    int i14 = length - 1;
                    if (length2 == i14) {
                        throw new IllegalArgumentException("No components");
                    }
                    i10 = i14;
                    z14 = true;
                } else {
                    i10 = length;
                }
                boolean z15 = false;
                d dVar2 = null;
                while (length2 < i10) {
                    if (z15 && z14) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i15 = length2;
                    while (i15 < str.length() && ((c12 <= (cCharAt2 = str.charAt(i15)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i15++;
                    }
                    s.f(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i15);
                    s.g(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i16 = length4;
                    while (i16 < str.length() && 'a' <= (cCharAt = str.charAt(i16)) && cCharAt < '{') {
                        i16++;
                    }
                    s.f(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i16);
                    s.g(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    d dVarE = f.e(strSubstring5);
                    if (dVar2 != null && dVar2.compareTo(dVarE) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iE1 = r.e0(strSubstring4, '.', 0, false, 6, null);
                    if (iE1 > 0) {
                        s.f(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iE1);
                        s.g(strSubstring6, "substring(...)");
                        long jB3 = a.B(jB, t(Long.parseLong(strSubstring6), dVarE));
                        s.f(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iE1);
                        s.g(strSubstring7, "substring(...)");
                        jB = a.B(jB3, r(Double.parseDouble(strSubstring7), dVarE));
                        if (length2 < i10) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jB = a.B(jB, t(Long.parseLong(strSubstring4), dVarE));
                    }
                    dVar2 = dVarE;
                    z15 = true;
                    c12 = '0';
                }
            }
        }
        return z12 ? a.F(jB) : jB;
    }

    private static final long q(String str) {
        char cCharAt;
        int length = str.length();
        int i10 = (length <= 0 || !r.S("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 >= length) {
                    if (length - i11 <= 16) {
                        break;
                    }
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 == '0') {
                    if (i11 == i10) {
                        i11++;
                    }
                } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                    break;
                }
                i10++;
            }
        }
        return (!r.N(str, "+", false, 2, null) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(r.Y0(str, 1));
    }

    public static final long r(double d10, d unit) {
        s.h(unit, "unit");
        double dA = e.a(d10, unit, d.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jC = vl.a.c(dA);
        return (-4611686018426999999L > jC || jC >= 4611686018427000000L) ? k(vl.a.c(e.a(d10, unit, d.MILLISECONDS))) : l(jC);
    }

    public static final long s(int i10, d unit) {
        s.h(unit, "unit");
        return unit.compareTo(d.SECONDS) <= 0 ? l(e.c(i10, unit, d.NANOSECONDS)) : t(i10, unit);
    }

    public static final long t(long j10, d unit) {
        s.h(unit, "unit");
        d dVar = d.NANOSECONDS;
        long jC = e.c(4611686018426999999L, dVar, unit);
        return ((-jC) > j10 || j10 > jC) ? j(g.j(e.b(j10, unit, d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : l(e.c(j10, unit, dVar));
    }
}
