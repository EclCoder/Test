package gn;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f39731k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f39732l = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f39733m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f39734n = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f39735o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f39738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f39739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f39740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f39741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f39742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f39743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f39744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f39745j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (kotlin.jvm.internal.s.c(str, str2)) {
                return true;
            }
            return bm.r.z(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !hn.k.a(str);
        }

        private final String f(String str) {
            if (bm.r.z(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strK = hn.k.k(bm.r.y0(str, "."));
            if (strK != null) {
                return strK;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i10, int i11) {
            int iA = a(str, i10, i11, false);
            Matcher matcher = n.f39735o.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iF0 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iA < i11) {
                int iA2 = a(str, iA + 1, i11, true);
                matcher.region(iA, iA2);
                if (i13 == -1 && matcher.usePattern(n.f39735o).matches()) {
                    String strGroup = matcher.group(1);
                    kotlin.jvm.internal.s.g(strGroup, "group(...)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    kotlin.jvm.internal.s.g(strGroup2, "group(...)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    kotlin.jvm.internal.s.g(strGroup3, "group(...)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(n.f39734n).matches()) {
                    String strGroup4 = matcher.group(1);
                    kotlin.jvm.internal.s.g(strGroup4, "group(...)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iF0 == -1 && matcher.usePattern(n.f39733m).matches()) {
                    String strGroup5 = matcher.group(1);
                    kotlin.jvm.internal.s.g(strGroup5, "group(...)");
                    Locale US = Locale.US;
                    kotlin.jvm.internal.s.g(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
                    String strPattern = n.f39733m.pattern();
                    kotlin.jvm.internal.s.g(strPattern, "pattern(...)");
                    iF0 = bm.r.f0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(n.f39732l).matches()) {
                    String strGroup6 = matcher.group(1);
                    kotlin.jvm.internal.s.g(strGroup6, "group(...)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iF0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(hn.p.f40721a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iF0 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new bm.o("-?\\d+").h(str)) {
                    return bm.r.N(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final n c(y url, String setCookie) {
            kotlin.jvm.internal.s.h(url, "url");
            kotlin.jvm.internal.s.h(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        public final n d(long j10, y url, String setCookie) {
            long j11;
            kotlin.jvm.internal.s.h(url, "url");
            kotlin.jvm.internal.s.h(setCookie, "setCookie");
            int iL = hn.m.l(setCookie, ';', 0, 0, 6, null);
            int iL2 = hn.m.l(setCookie, '=', 0, iL, 2, null);
            n nVar = null;
            if (iL2 == iL) {
                return null;
            }
            String strF = hn.m.F(setCookie, 0, iL2, 1, null);
            if (strF.length() == 0 || hn.m.p(strF) != -1) {
                return null;
            }
            String strE = hn.m.E(setCookie, iL2 + 1, iL);
            if (hn.m.p(strE) != -1) {
                return null;
            }
            int i10 = iL + 1;
            int length = setCookie.length();
            String strF2 = null;
            String str = null;
            String str2 = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i10 < length) {
                int iJ = hn.m.j(setCookie, ';', i10, length);
                int iJ2 = hn.m.j(setCookie, '=', i10, iJ);
                String strE2 = hn.m.E(setCookie, i10, iJ2);
                String strE3 = iJ2 < iJ ? hn.m.E(setCookie, iJ2 + 1, iJ) : "";
                n nVar2 = nVar;
                if (bm.r.A(strE2, "expires", true)) {
                    try {
                        jG = g(strE3, 0, strE3.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (bm.r.A(strE2, "max-age", true)) {
                    jH = h(strE3);
                    z11 = true;
                } else if (bm.r.A(strE2, "domain", true)) {
                    strF2 = f(strE3);
                    z13 = false;
                } else if (bm.r.A(strE2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH, true)) {
                    str = strE3;
                } else if (bm.r.A(strE2, "secure", true)) {
                    z12 = true;
                } else if (bm.r.A(strE2, "httponly", true)) {
                    z10 = true;
                } else if (bm.r.A(strE2, "samesite", true)) {
                    str2 = strE3;
                }
                i10 = iJ + 1;
                nVar = nVar2;
            }
            n nVar3 = nVar;
            if (jH == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j12 = j10 + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                j11 = (j12 < j10 || j12 > 253402300799999L) ? 253402300799999L : j12;
            } else {
                j11 = jG;
            }
            String strG = url.g();
            if (strF2 == null) {
                strF2 = strG;
            } else if (!b(strG, strF2)) {
                return nVar3;
            }
            if (strG.length() != strF2.length() && un.c.f54857b.c().c(strF2) == null) {
                return nVar3;
            }
            String strSubstring = "/";
            if (str == null || !bm.r.N(str, "/", false, 2, nVar3)) {
                String strC = url.c();
                int iK0 = bm.r.k0(strC, '/', 0, false, 6, null);
                if (iK0 != 0) {
                    strSubstring = strC.substring(0, iK0);
                    kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                }
                str = strSubstring;
            }
            return new n(strF, strE, j11, strF2, str, z12, z10, z11, z13, str2, null);
        }

        public final List e(y url, x headers) {
            kotlin.jvm.internal.s.h(url, "url");
            kotlin.jvm.internal.s.h(headers, "headers");
            List listK = headers.k("Set-Cookie");
            int size = listK.size();
            List listUnmodifiableList = null;
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                n nVarC = c(url, (String) listK.get(i10));
                if (nVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(nVarC);
                }
            }
            if (arrayList != null) {
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                kotlin.jvm.internal.s.g(listUnmodifiableList, "unmodifiableList(...)");
            }
            return listUnmodifiableList == null ? gl.r.l() : listUnmodifiableList;
        }

        private a() {
        }
    }

    public /* synthetic */ n(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13, str5);
    }

    public final String e() {
        return this.f39736a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.s.c(nVar.f39736a, this.f39736a) && kotlin.jvm.internal.s.c(nVar.f39737b, this.f39737b) && nVar.f39738c == this.f39738c && kotlin.jvm.internal.s.c(nVar.f39739d, this.f39739d) && kotlin.jvm.internal.s.c(nVar.f39740e, this.f39740e) && nVar.f39741f == this.f39741f && nVar.f39742g == this.f39742g && nVar.f39743h == this.f39743h && nVar.f39744i == this.f39744i && kotlin.jvm.internal.s.c(nVar.f39745j, this.f39745j);
    }

    public final String f(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f39736a);
        sb2.append('=');
        sb2.append(this.f39737b);
        if (this.f39743h) {
            if (this.f39738c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(mn.c.b(new Date(this.f39738c)));
            }
        }
        if (!this.f39744i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f39739d);
        }
        sb2.append("; path=");
        sb2.append(this.f39740e);
        if (this.f39741f) {
            sb2.append("; secure");
        }
        if (this.f39742g) {
            sb2.append("; httponly");
        }
        if (this.f39745j != null) {
            sb2.append("; samesite=");
            sb2.append(this.f39745j);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    public final String g() {
        return this.f39737b;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((527 + this.f39736a.hashCode()) * 31) + this.f39737b.hashCode()) * 31) + Long.hashCode(this.f39738c)) * 31) + this.f39739d.hashCode()) * 31) + this.f39740e.hashCode()) * 31) + Boolean.hashCode(this.f39741f)) * 31) + Boolean.hashCode(this.f39742g)) * 31) + Boolean.hashCode(this.f39743h)) * 31) + Boolean.hashCode(this.f39744i)) * 31;
        String str = this.f39745j;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return f(false);
    }

    private n(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        this.f39736a = str;
        this.f39737b = str2;
        this.f39738c = j10;
        this.f39739d = str3;
        this.f39740e = str4;
        this.f39741f = z10;
        this.f39742g = z11;
        this.f39743h = z12;
        this.f39744i = z13;
        this.f39745j = str5;
    }
}
