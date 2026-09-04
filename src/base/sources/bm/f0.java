package bm;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import v7.XOSD.qnwOeeQSSWa;
import wc.XtO.NpmRNZ;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 extends c0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements am.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f9105a;

        public a(CharSequence charSequence) {
            this.f9105a = charSequence;
        }

        @Override // am.g
        public Iterator iterator() {
            return new i(this.f9105a);
        }
    }

    public static final void A0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List B0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        kotlin.jvm.internal.s.h(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return D0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableL = am.j.l(t0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(gl.r.v(iterableL, 10));
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            arrayList.add(K0(charSequence, (yl.f) it.next()));
        }
        return arrayList;
    }

    public static final List C0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        kotlin.jvm.internal.s.h(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return D0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableL = am.j.l(u0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(gl.r.v(iterableL, 10));
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            arrayList.add(K0(charSequence, (yl.f) it.next()));
        }
        return arrayList;
    }

    private static final List D0(CharSequence charSequence, String str, boolean z10, int i10) {
        A0(i10);
        int length = 0;
        int iB0 = b0(charSequence, str, 0, z10);
        if (iB0 == -1 || i10 == 1) {
            return gl.r.e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? yl.g.f(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iB0).toString());
            length = str.length() + iB0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iB0 = b0(charSequence, str, length, z10);
        } while (iB0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List E0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return B0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List F0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return C0(charSequence, strArr, z10, i10);
    }

    public static final boolean G0(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        return charSequence.length() > 0 && c.e(charSequence.charAt(0), c10, z10);
    }

    public static final boolean H0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? c0.N((String) charSequence, (String) prefix, false, 2, null) : x0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean I0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return G0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean J0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return H0(charSequence, charSequence2, z10);
    }

    public static final String K0(CharSequence charSequence, yl.f range) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        kotlin.jvm.internal.s.h(range, "range");
        return charSequence.subSequence(range.m().intValue(), range.k().intValue() + 1).toString();
    }

    public static String L0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(missingDelimiterValue, "missingDelimiterValue");
        int iE0 = e0(str, c10, 0, false, 6, null);
        if (iE0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iE0 + 1, str.length());
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String M0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(delimiter, "delimiter");
        kotlin.jvm.internal.s.h(missingDelimiterValue, "missingDelimiterValue");
        int iF0 = f0(str, delimiter, 0, false, 6, null);
        if (iF0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iF0 + delimiter.length(), str.length());
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String N0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return L0(str, c10, str2);
    }

    public static /* synthetic */ String O0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return M0(str, str2, str3);
    }

    public static String P0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(missingDelimiterValue, "missingDelimiterValue");
        int iK0 = k0(str, c10, 0, false, 6, null);
        if (iK0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iK0 + 1, str.length());
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean Q(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        return e0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static final String Q0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(missingDelimiterValue, "missingDelimiterValue");
        int iE0 = e0(str, c10, 0, false, 6, null);
        if (iE0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iE0);
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean R(CharSequence charSequence, CharSequence other, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        kotlin.jvm.internal.s.h(other, "other");
        if (other instanceof String) {
            return f0(charSequence, (String) other, 0, z10, 2, null) >= 0;
        }
        return d0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    public static /* synthetic */ String R0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return Q0(str, c10, str2);
    }

    public static /* synthetic */ boolean S(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Q(charSequence, c10, z10);
    }

    public static final String S0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(delimiter, "delimiter");
        kotlin.jvm.internal.s.h(missingDelimiterValue, "missingDelimiterValue");
        int iL0 = l0(str, delimiter, 0, false, 6, null);
        if (iL0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iL0);
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean T(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return R(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String T0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return S0(str, str2, str3);
    }

    public static final boolean U(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        return charSequence.length() > 0 && c.e(charSequence.charAt(Z(charSequence)), c10, z10);
    }

    public static Boolean U0(String str) {
        kotlin.jvm.internal.s.h(str, "<this>");
        if (kotlin.jvm.internal.s.c(str, "true")) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.s.c(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final boolean V(CharSequence charSequence, CharSequence suffix, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        kotlin.jvm.internal.s.h(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? c0.z((String) charSequence, (String) suffix, false, 2, null) : x0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static CharSequence V0(CharSequence charSequence) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = b.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static /* synthetic */ boolean W(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return U(charSequence, c10, z10);
    }

    public static String W0(String str, char... chars) {
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zM = gl.j.M(chars, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zM) {
                    break;
                }
                length--;
            } else if (zM) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static /* synthetic */ boolean X(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return V(charSequence, charSequence2, z10);
    }

    public static String X0(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(chars, "chars");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (!gl.j.M(chars, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i10 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i10;
        }
        return charSequenceSubSequence.toString();
    }

    private static final fl.q Y(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) gl.r.v0(collection);
            int iF0 = !z11 ? f0(charSequence, str, i10, false, 4, null) : l0(charSequence, str, i10, false, 4, null);
            if (iF0 < 0) {
                return null;
            }
            return fl.w.a(Integer.valueOf(iF0), str);
        }
        CharSequence charSequence3 = charSequence;
        yl.d fVar = !z11 ? new yl.f(yl.g.d(i10, 0), charSequence3.length()) : yl.g.k(yl.g.f(i10, Z(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iA = fVar.a();
            int iB = fVar.b();
            int iD = fVar.d();
            if ((iD > 0 && iA <= iB) || (iD < 0 && iB <= iA)) {
                int i11 = iA;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (c0.D(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return fl.w.a(Integer.valueOf(i11), str3);
                    }
                    if (i11 != iB) {
                        i11 += iD;
                        z10 = z12;
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iA2 = fVar.a();
            int iB2 = fVar.b();
            int iD2 = fVar.d();
            if ((iD2 > 0 && iA2 <= iB2) || (iD2 < 0 && iB2 <= iA2)) {
                int i12 = iA2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (x0(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return fl.w.a(Integer.valueOf(i12), str5);
                    }
                    if (i12 != iB2) {
                        i12 += iD2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    public static final int Z(CharSequence charSequence) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int a0(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? g0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static final int b0(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        kotlin.jvm.internal.s.h(string, "string");
        return (z10 || !(charSequence instanceof String)) ? d0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    private static final int c0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        yl.d fVar = !z11 ? new yl.f(yl.g.d(i10, 0), yl.g.f(i11, charSequence.length())) : yl.g.k(yl.g.f(i10, Z(charSequence)), yl.g.d(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iA = fVar.a();
            int iB = fVar.b();
            int iD = fVar.d();
            if ((iD <= 0 || iA > iB) && (iD >= 0 || iB > iA)) {
                return -1;
            }
            int i12 = iA;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (c0.D(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == iB) {
                    return -1;
                }
                i12 += iD;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iA2 = fVar.a();
            int iB2 = fVar.b();
            int iD2 = fVar.d();
            if ((iD2 <= 0 || iA2 > iB2) && (iD2 >= 0 || iB2 > iA2)) {
                return -1;
            }
            int i13 = iA2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (x0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iB2) {
                    return -1;
                }
                i13 += iD2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    static /* synthetic */ int d0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return c0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ int e0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return a0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int f0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return b0(charSequence, str, i10, z10);
    }

    public static final int g0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        kotlin.jvm.internal.s.h(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(gl.j.n0(chars), i10);
        }
        int iD = yl.g.d(i10, 0);
        int iZ = Z(charSequence);
        if (iD > iZ) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iD);
            for (char c10 : chars) {
                if (c.e(c10, cCharAt, z10)) {
                    return iD;
                }
            }
            if (iD == iZ) {
                return -1;
            }
            iD++;
        }
    }

    public static boolean h0(CharSequence charSequence) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!b.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final int j0(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        kotlin.jvm.internal.s.h(string, "string");
        return (z10 || !(charSequence instanceof String)) ? c0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int k0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Z(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return i0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int l0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Z(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return j0(charSequence, str, i10, z10);
    }

    public static final int m0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        kotlin.jvm.internal.s.h(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(gl.j.n0(chars), i10);
        }
        for (int iF = yl.g.f(i10, Z(charSequence)); -1 < iF; iF--) {
            char cCharAt = charSequence.charAt(iF);
            for (char c10 : chars) {
                if (c.e(c10, cCharAt, z10)) {
                    return iF;
                }
            }
        }
        return -1;
    }

    public static final am.g n0(CharSequence charSequence) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List o0(CharSequence charSequence) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        return am.j.B(n0(charSequence));
    }

    public static final CharSequence p0(CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    private static final am.g r0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        A0(i11);
        return new e(charSequence, i10, i11, new tl.o() { // from class: bm.d0
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return f0.v0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    private static final am.g s0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        A0(i11);
        final List listE = gl.j.e(strArr);
        return new e(charSequence, i10, i11, new tl.o() { // from class: bm.e0
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return f0.w0(listE, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static /* synthetic */ am.g t0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return r0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ am.g u0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return s0(charSequence, strArr, i10, z10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.q v0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        kotlin.jvm.internal.s.h(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iG0 = g0(DelimitedRangesSequence, cArr, i10, z10);
        if (iG0 < 0) {
            return null;
        }
        return fl.w.a(Integer.valueOf(iG0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.q w0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        kotlin.jvm.internal.s.h(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        fl.q qVarY = Y(DelimitedRangesSequence, list, i10, z10, false);
        if (qVarY != null) {
            return fl.w.a(qVarY.h(), Integer.valueOf(((String) qVarY.i()).length()));
        }
        return null;
    }

    public static final boolean x0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, "<this>");
        kotlin.jvm.internal.s.h(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!c.e(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String y0(String str, CharSequence prefix) {
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        if (!J0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int i0(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.s.h(charSequence, PvZsvNiPV.RAwlZ);
        return (z10 || !(charSequence instanceof String)) ? m0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static String q0(String str, int i10, char c10) {
        kotlin.jvm.internal.s.h(str, qnwOeeQSSWa.svQESwKn);
        return p0(str, i10, c10).toString();
    }

    public static String z0(String str, CharSequence suffix) {
        kotlin.jvm.internal.s.h(str, "<this>");
        kotlin.jvm.internal.s.h(suffix, "suffix");
        if (!X(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.s.g(strSubstring, NpmRNZ.TVoyHXsVtv);
        return strSubstring;
    }
}
