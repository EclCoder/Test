package com.mbridge.msdk.thrid.okhttp;

import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.thrid.okhttp.internal.publicsuffix.PublicSuffixDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f33479j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f33480k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f33481l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f33482m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f33486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f33487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f33488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f33489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f33490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f33491i;

    private k(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f33483a = str;
        this.f33484b = str2;
        this.f33485c = j10;
        this.f33486d = str3;
        this.f33487e = str4;
        this.f33488f = z10;
        this.f33489g = z11;
        this.f33491i = z12;
        this.f33490h = z13;
    }

    public String a() {
        return this.f33483a;
    }

    public String b() {
        return this.f33484b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f33483a.equals(this.f33483a) && kVar.f33484b.equals(this.f33484b) && kVar.f33486d.equals(this.f33486d) && kVar.f33487e.equals(this.f33487e) && kVar.f33485c == this.f33485c && kVar.f33488f == this.f33488f && kVar.f33489g == this.f33489g && kVar.f33490h == this.f33490h && kVar.f33491i == this.f33491i;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f33483a.hashCode() + 527) * 31) + this.f33484b.hashCode()) * 31) + this.f33486d.hashCode()) * 31) + this.f33487e.hashCode()) * 31;
        long j10 = this.f33485c;
        return ((((((((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (!this.f33488f ? 1 : 0)) * 31) + (!this.f33489g ? 1 : 0)) * 31) + (!this.f33490h ? 1 : 0)) * 31) + (!this.f33491i ? 1 : 0);
    }

    public String toString() {
        return a(false);
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !com.mbridge.msdk.thrid.okhttp.internal.c.d(str);
    }

    private static long b(String str) {
        try {
            long j10 = Long.parseLong(str);
            if (j10 <= 0) {
                return Long.MIN_VALUE;
            }
            return j10;
        } catch (NumberFormatException e10) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e10;
        }
    }

    public static k a(s sVar, String str) {
        return a(System.currentTimeMillis(), sVar, str);
    }

    static k a(long j10, s sVar, String str) {
        long j11;
        String str2;
        String str3;
        int length = str.length();
        char c10 = ';';
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, length, ';');
        int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, iA, '=');
        String strA = null;
        if (iA2 == iA) {
            return null;
        }
        String strD = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, 0, iA2);
        if (strD.isEmpty() || com.mbridge.msdk.thrid.okhttp.internal.c.c(strD) != -1) {
            return null;
        }
        String strD2 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, iA2 + 1, iA);
        if (com.mbridge.msdk.thrid.okhttp.internal.c.c(strD2) != -1) {
            return null;
        }
        int i10 = iA + 1;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = true;
        long jA = 253402300799999L;
        long jB = -1;
        String strSubstring = null;
        while (i10 < length) {
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i10, length, c10);
            int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i10, iA3, '=');
            String strD3 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, i10, iA4);
            String strD4 = iA4 < iA3 ? com.mbridge.msdk.thrid.okhttp.internal.c.d(str, iA4 + 1, iA3) : "";
            if (strD3.equalsIgnoreCase("expires")) {
                try {
                    jA = a(strD4, 0, strD4.length());
                    z10 = true;
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (strD3.equalsIgnoreCase("max-age")) {
                jB = b(strD4);
                z10 = true;
            } else if (strD3.equalsIgnoreCase("domain")) {
                strA = a(strD4);
                z13 = false;
            } else if (strD3.equalsIgnoreCase(MBridgeConstans.DYNAMIC_VIEW_WX_PATH)) {
                strSubstring = strD4;
            } else if (strD3.equalsIgnoreCase("secure")) {
                z11 = true;
            } else if (strD3.equalsIgnoreCase("httponly")) {
                z12 = true;
            }
            i10 = iA3 + 1;
            c10 = ';';
        }
        if (jB == Long.MIN_VALUE) {
            j11 = Long.MIN_VALUE;
        } else if (jB != -1) {
            long j12 = j10 + (jB <= 9223372036854775L ? jB * 1000 : Long.MAX_VALUE);
            j11 = (j12 < j10 || j12 > 253402300799999L) ? 253402300799999L : j12;
        } else {
            j11 = jA;
        }
        String strG = sVar.g();
        if (strA == null) {
            str2 = strG;
        } else {
            if (!a(strG, strA)) {
                return null;
            }
            str2 = strA;
        }
        if (strG.length() != str2.length() && PublicSuffixDatabase.a().a(str2) == null) {
            return null;
        }
        if (strSubstring == null || !strSubstring.startsWith("/")) {
            String strC = sVar.c();
            int iLastIndexOf = strC.lastIndexOf(47);
            if (iLastIndexOf != 0) {
                strSubstring = strC.substring(0, iLastIndexOf);
                str3 = strSubstring;
            } else {
                str3 = "/";
            }
        } else {
            str3 = strSubstring;
        }
        return new k(strD, strD2, j11, str2, str3, z11, z12, z13, z10);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    private static long a(String str, int i10, int i11) {
        int iA = a(str, i10, i11, false);
        Matcher matcher = f33482m.matcher(str);
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int iIndexOf = -1;
        int i15 = -1;
        int i16 = -1;
        while (iA < i11) {
            int iA2 = a(str, iA + 1, i11, true);
            matcher.region(iA, iA2);
            if (i13 == -1 && matcher.usePattern(f33482m).matches()) {
                i13 = Integer.parseInt(matcher.group(1));
                i15 = Integer.parseInt(matcher.group(2));
                i16 = Integer.parseInt(matcher.group(3));
            } else if (i14 == -1 && matcher.usePattern(f33481l).matches()) {
                i14 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern = f33480k;
                if (matcher.usePattern(pattern).matches()) {
                    iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i12 != -1 && matcher.usePattern(f33479j).matches()) {
                    i12 = Integer.parseInt(matcher.group(1));
                }
            } else if (i12 != -1) {
            }
            iA = a(str, iA2 + 1, i11, false);
        }
        if (i12 >= 70 && i12 <= 99) {
            i12 += 1900;
        }
        if (i12 >= 0 && i12 <= 69) {
            i12 += 2000;
        }
        if (i12 < 1601) {
            throw new IllegalArgumentException();
        }
        if (iIndexOf == -1) {
            throw new IllegalArgumentException();
        }
        if (i14 < 1 || i14 > 31) {
            throw new IllegalArgumentException();
        }
        if (i13 < 0 || i13 > 23) {
            throw new IllegalArgumentException();
        }
        if (i15 < 0 || i15 > 59) {
            throw new IllegalArgumentException();
        }
        if (i16 >= 0 && i16 <= 59) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(com.mbridge.msdk.thrid.okhttp.internal.c.f33122p);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iIndexOf - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        throw new IllegalArgumentException();
    }

    private static int a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    private static String a(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String strA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str);
            if (strA != null) {
                return strA;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static List<k> a(s sVar, r rVar) {
        List<String> listC = rVar.c("Set-Cookie");
        int size = listC.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            k kVarA = a(sVar, listC.get(i10));
            if (kVarA != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVarA);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    String a(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33483a);
        sb2.append('=');
        sb2.append(this.f33484b);
        if (this.f33490h) {
            if (this.f33485c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(com.mbridge.msdk.thrid.okhttp.internal.http.d.a(new Date(this.f33485c)));
            }
        }
        if (!this.f33491i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f33486d);
        }
        sb2.append("; path=");
        sb2.append(this.f33487e);
        if (this.f33488f) {
            sb2.append("; secure");
        }
        if (this.f33489g) {
            sb2.append(IAoPeRfJn.dhvbTztbUq);
        }
        return sb2.toString();
    }
}
