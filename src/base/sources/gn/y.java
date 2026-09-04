package gn;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f39776j = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f39779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f39780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f39781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f39782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f39783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f39784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f39785i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(List list, StringBuilder sb2) {
            yl.d dVarL = yl.g.l(yl.g.m(0, list.size()), 2);
            int iA = dVarL.a();
            int iB = dVarL.b();
            int iD = dVarL.d();
            if ((iD <= 0 || iA > iB) && (iD >= 0 || iB > iA)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iA);
                String str2 = (String) list.get(iA + 1);
                if (iA > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (iA == iB) {
                    return;
                } else {
                    iA += iD;
                }
            }
        }

        public final y c(String str) {
            kotlin.jvm.internal.s.h(str, "<this>");
            return new a().h(null, str).a();
        }

        public final y d(String str) {
            kotlin.jvm.internal.s.h(str, "<this>");
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private b() {
        }

        public final int b(String scheme) {
            kotlin.jvm.internal.s.h(scheme, "scheme");
            if (kotlin.jvm.internal.s.c(scheme, "http")) {
                return 80;
            }
            return kotlin.jvm.internal.s.c(scheme, qEagQqzJZsd.rTwTfFsf) ? 443 : -1;
        }
    }

    public /* synthetic */ y(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i10, list, list2, str5, str6);
    }

    public static final y k(String str) {
        return f39776j.d(str);
    }

    public final String a() {
        if (this.f39784h == null) {
            return null;
        }
        String strSubstring = this.f39785i.substring(bm.r.e0(this.f39785i, '#', 0, false, 6, null) + 1);
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String b() {
        if (this.f39779c.length() == 0) {
            return "";
        }
        String strSubstring = this.f39785i.substring(bm.r.e0(this.f39785i, ':', this.f39777a.length() + 3, false, 4, null) + 1, bm.r.e0(this.f39785i, '@', 0, false, 6, null));
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String c() {
        int iE0 = bm.r.e0(this.f39785i, '/', this.f39777a.length() + 3, false, 4, null);
        String str = this.f39785i;
        String strSubstring = this.f39785i.substring(iE0, hn.m.k(str, "?#", iE0, str.length()));
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final List d() {
        int iE0 = bm.r.e0(this.f39785i, '/', this.f39777a.length() + 3, false, 4, null);
        String str = this.f39785i;
        int iK = hn.m.k(str, "?#", iE0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iE0 < iK) {
            int i10 = iE0 + 1;
            int iJ = hn.m.j(this.f39785i, '/', i10, iK);
            String strSubstring = this.f39785i.substring(i10, iJ);
            kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iE0 = iJ;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f39783g == null) {
            return null;
        }
        int iE0 = bm.r.e0(this.f39785i, '?', 0, false, 6, null) + 1;
        String str = this.f39785i;
        String strSubstring = this.f39785i.substring(iE0, hn.m.j(str, '#', iE0, str.length()));
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && kotlin.jvm.internal.s.c(((y) obj).f39785i, this.f39785i);
    }

    public final String f() {
        if (this.f39778b.length() == 0) {
            return "";
        }
        int length = this.f39777a.length() + 3;
        String str = this.f39785i;
        String strSubstring = this.f39785i.substring(length, hn.m.k(str, ":@", length, str.length()));
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String g() {
        return this.f39780d;
    }

    public final boolean h() {
        return kotlin.jvm.internal.s.c(this.f39777a, "https");
    }

    public int hashCode() {
        return this.f39785i.hashCode();
    }

    public final a i() {
        a aVar = new a();
        aVar.x(this.f39777a);
        aVar.u(f());
        aVar.t(b());
        aVar.v(this.f39780d);
        aVar.w(this.f39781e != f39776j.b(this.f39777a) ? this.f39781e : -1);
        aVar.d().clear();
        aVar.d().addAll(d());
        aVar.c(e());
        aVar.s(a());
        return aVar;
    }

    public final a j(String link) {
        kotlin.jvm.internal.s.h(link, "link");
        try {
            return new a().h(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int l() {
        return this.f39781e;
    }

    public final String m() {
        if (this.f39783g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f39776j.e(this.f39783g, sb2);
        return sb2.toString();
    }

    public final String n() {
        a aVarJ = j("/...");
        kotlin.jvm.internal.s.e(aVarJ);
        return aVarJ.B("").j("").a().toString();
    }

    public final y o(String link) {
        kotlin.jvm.internal.s.h(link, "link");
        a aVarJ = j(link);
        if (aVarJ != null) {
            return aVarJ.a();
        }
        return null;
    }

    public final String p() {
        return this.f39777a;
    }

    public final URI q() {
        String string = i().o().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new bm.o("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").i(string, ""));
                kotlin.jvm.internal.s.e(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL r() {
        try {
            return new URL(this.f39785i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f39785i;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f39786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f39787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f39788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f39789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f39790e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f39791f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f39792g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f39793h;

        private final List A(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iE0 = bm.r.e0(str2, '&', i10, false, 4, null);
                if (iE0 == -1) {
                    iE0 = str2.length();
                }
                int iE1 = bm.r.e0(str2, '=', i10, false, 4, null);
                if (iE1 == -1 || iE1 > iE0) {
                    String strSubstring = str2.substring(i10, iE0);
                    kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iE1);
                    kotlin.jvm.internal.s.g(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iE1 + 1, iE0);
                    kotlin.jvm.internal.s.g(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i10 = iE0 + 1;
                str = str2;
            }
            return arrayList;
        }

        private final int b() {
            int i10 = this.f39790e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = y.f39776j;
            String str = this.f39786a;
            kotlin.jvm.internal.s.e(str);
            return bVar.b(str);
        }

        private final boolean f(String str) {
            return kotlin.jvm.internal.s.c(str, ".") || bm.r.A(str, "%2e", true);
        }

        private final boolean g(String str) {
            return kotlin.jvm.internal.s.c(str, "..") || bm.r.A(str, "%2e.", true) || bm.r.A(str, ".%2e", true) || bm.r.A(str, "%2e%2e", true);
        }

        private final int i(String str, int i10, int i11) {
            try {
                int i12 = Integer.parseInt(wn.a.b(str, i10, i11, "", false, false, false, false, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, null));
                if (1 > i12 || i12 >= 65536) {
                    return -1;
                }
                return i12;
            } catch (NumberFormatException unused) {
            }
        }

        private final void k() {
            List list = this.f39791f;
            if (((String) list.remove(list.size() - 1)).length() != 0 || this.f39791f.isEmpty()) {
                this.f39791f.add("");
            } else {
                List list2 = this.f39791f;
                list2.set(list2.size() - 1, "");
            }
        }

        private final int m(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private final void n(String str, int i10, int i11, boolean z10, boolean z11) {
            String strB = wn.a.b(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, null);
            if (f(strB)) {
                return;
            }
            if (g(strB)) {
                k();
                return;
            }
            List list = this.f39791f;
            if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                List list2 = this.f39791f;
                list2.set(list2.size() - 1, strB);
            } else {
                this.f39791f.add(strB);
            }
            if (z10) {
                this.f39791f.add("");
            }
        }

        private final void p(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f39791f.clear();
                this.f39791f.add("");
                i10++;
            } else {
                List list = this.f39791f;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iK = hn.m.k(str, "/\\", i12, i11);
                boolean z10 = iK < i11;
                str = str;
                n(str, i12, iK, z10, true);
                i12 = z10 ? iK + 1 : iK;
            }
        }

        private final int r(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((kotlin.jvm.internal.s.i(cCharAt, 97) >= 0 && kotlin.jvm.internal.s.i(cCharAt, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE) <= 0) || (kotlin.jvm.internal.s.i(cCharAt, 65) >= 0 && kotlin.jvm.internal.s.i(cCharAt, 90) <= 0)) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private final int y(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '/' && cCharAt != '\\') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        private final void z(List list, StringBuilder sb2) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append((String) list.get(i10));
            }
        }

        public final a B(String username) {
            kotlin.jvm.internal.s.h(username, "username");
            this.f39787b = wn.a.b(username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE, null);
            return this;
        }

        public final y a() {
            ArrayList arrayList;
            String str = this.f39786a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strG = wn.a.g(this.f39787b, 0, 0, false, 7, null);
            String strG2 = wn.a.g(this.f39788c, 0, 0, false, 7, null);
            String str2 = this.f39789d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            List list = this.f39791f;
            ArrayList arrayList2 = new ArrayList(gl.r.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(wn.a.g((String) it.next(), 0, 0, false, 7, null));
            }
            List list2 = this.f39792g;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(gl.r.v(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? wn.a.g(str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f39793h;
            return new y(str, strG, strG2, str2, iB, arrayList2, arrayList, str4 != null ? wn.a.g(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        public final a c(String str) {
            String strB;
            this.f39792g = (str == null || (strB = wn.a.b(str, 0, 0, " \"'<>#", true, false, true, false, 83, null)) == null) ? null : A(strB);
            return this;
        }

        public final List d() {
            return this.f39791f;
        }

        public final a e(String host) {
            kotlin.jvm.internal.s.h(host, "host");
            String strK = hn.k.k(wn.a.g(host, 0, 0, false, 7, null));
            if (strK != null) {
                this.f39789d = strK;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final a h(y yVar, String str) {
            int iK;
            boolean z10;
            int i10;
            int i11;
            char c10;
            String input = str;
            kotlin.jvm.internal.s.h(input, "input");
            int iR = hn.m.r(input, 0, 0, 3, null);
            int iT = hn.m.t(input, iR, 0, 2, null);
            int iR2 = r(input, iR, iT);
            boolean z11 = true;
            if (iR2 != -1) {
                if (bm.r.K(input, "https:", iR, true)) {
                    this.f39786a = "https";
                    iR += 6;
                } else {
                    if (!bm.r.K(input, "http:", iR, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iR2);
                        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f39786a = "http";
                    iR += 5;
                }
            } else {
                if (yVar == null) {
                    if (input.length() > 6) {
                        input = bm.r.e1(input, 6) + "...";
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + input);
                }
                this.f39786a = yVar.p();
            }
            int iY = y(input, iR, iT);
            char c11 = '?';
            char c12 = '#';
            if (iY >= 2 || yVar == null || !kotlin.jvm.internal.s.c(yVar.p(), this.f39786a)) {
                boolean z12 = false;
                boolean z13 = false;
                int i12 = iR + iY;
                while (true) {
                    iK = hn.m.k(input, "@/\\?#", i12, iT);
                    byte bCharAt = iK != iT ? input.charAt(iK) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c12 || bCharAt == 47 || bCharAt == 92 || bCharAt == c11) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z12) {
                            z10 = z11;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f39788c);
                            sb3.append("%40");
                            input = str;
                            i10 = iK;
                            sb3.append(wn.a.b(input, i12, iK, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, null));
                            this.f39788c = sb3.toString();
                        } else {
                            int iJ = hn.m.j(input, ':', i12, iK);
                            z10 = z11;
                            String strB = wn.a.b(input, i12, iJ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, null);
                            if (z13) {
                                strB = this.f39787b + "%40" + strB;
                            }
                            this.f39787b = strB;
                            if (iJ != iK) {
                                i11 = iK;
                                this.f39788c = wn.a.b(str, iJ + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE, null);
                                z12 = z10;
                            } else {
                                i11 = iK;
                            }
                            input = str;
                            i10 = i11;
                            z13 = z10;
                        }
                        i12 = i10 + 1;
                        z11 = z10;
                        c12 = '#';
                        c11 = '?';
                    }
                }
                int iM = m(input, i12, iK);
                int i13 = iM + 1;
                if (i13 < iK) {
                    this.f39789d = hn.k.k(wn.a.g(input, i12, iM, false, 4, null));
                    int i14 = i(input, i13, iK);
                    this.f39790e = i14;
                    if (i14 == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i13, iK);
                        kotlin.jvm.internal.s.g(strSubstring2, "substring(...)");
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    this.f39789d = hn.k.k(wn.a.g(input, i12, iM, false, 4, null));
                    b bVar = y.f39776j;
                    String str2 = this.f39786a;
                    kotlin.jvm.internal.s.e(str2);
                    this.f39790e = bVar.b(str2);
                }
                if (this.f39789d == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i12, iM);
                    kotlin.jvm.internal.s.g(strSubstring3, "substring(...)");
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iR = iK;
            } else {
                this.f39787b = yVar.f();
                this.f39788c = yVar.b();
                this.f39789d = yVar.g();
                this.f39790e = yVar.l();
                this.f39791f.clear();
                this.f39791f.addAll(yVar.d());
                if (iR == iT || input.charAt(iR) == '#') {
                    c(yVar.e());
                }
            }
            int iK2 = hn.m.k(input, "?#", iR, iT);
            p(input, iR, iK2);
            if (iK2 >= iT || input.charAt(iK2) != '?') {
                c10 = '#';
            } else {
                c10 = '#';
                int iJ2 = hn.m.j(input, '#', iK2, iT);
                this.f39792g = A(wn.a.b(input, iK2 + 1, iJ2, " \"'<>#", true, false, true, false, 80, null));
                iK2 = iJ2;
            }
            if (iK2 < iT && input.charAt(iK2) == c10) {
                this.f39793h = wn.a.b(input, iK2 + 1, iT, "", true, false, false, true, 48, null);
            }
            return this;
        }

        public final a j(String password) {
            kotlin.jvm.internal.s.h(password, "password");
            this.f39788c = wn.a.b(password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE, null);
            return this;
        }

        public final a l(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f39790e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final a o() {
            String str = this.f39789d;
            this.f39789d = str != null ? new bm.o("[\"<>^`{|}]").i(str, "") : null;
            int size = this.f39791f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f39791f;
                list.set(i10, wn.a.b((String) list.get(i10), 0, 0, "[]", true, true, false, false, 99, null));
            }
            List list2 = this.f39792g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? wn.a.b(str2, 0, 0, "\\^`{|}", true, true, true, false, 67, null) : null);
                }
            }
            String str3 = this.f39793h;
            this.f39793h = str3 != null ? wn.a.b(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 35, null) : null;
            return this;
        }

        public final a q(String scheme) {
            kotlin.jvm.internal.s.h(scheme, "scheme");
            if (bm.r.A(scheme, "http", true)) {
                this.f39786a = "http";
                return this;
            }
            if (bm.r.A(scheme, "https", true)) {
                this.f39786a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final void s(String str) {
            this.f39793h = str;
        }

        public final void t(String str) {
            kotlin.jvm.internal.s.h(str, "<set-?>");
            this.f39788c = str;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0085  */
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f39786a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.f39787b.length() > 0 || this.f39788c.length() > 0) {
                sb2.append(this.f39787b);
                if (this.f39788c.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.f39788c);
                }
                sb2.append('@');
            }
            String str2 = this.f39789d;
            if (str2 != null) {
                kotlin.jvm.internal.s.e(str2);
                if (bm.r.S(str2, ':', false, 2, null)) {
                    sb2.append('[');
                    sb2.append(this.f39789d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f39789d);
                }
            }
            if (this.f39790e != -1 || this.f39786a != null) {
                int iB = b();
                String str3 = this.f39786a;
                if (str3 != null) {
                    b bVar = y.f39776j;
                    kotlin.jvm.internal.s.e(str3);
                    if (iB != bVar.b(str3)) {
                        sb2.append(':');
                        sb2.append(iB);
                    }
                } else {
                    sb2.append(':');
                    sb2.append(iB);
                }
            }
            z(this.f39791f, sb2);
            if (this.f39792g != null) {
                sb2.append('?');
                b bVar2 = y.f39776j;
                List list = this.f39792g;
                kotlin.jvm.internal.s.e(list);
                bVar2.e(list, sb2);
            }
            if (this.f39793h != null) {
                sb2.append('#');
                sb2.append(this.f39793h);
            }
            return sb2.toString();
        }

        public final void u(String str) {
            kotlin.jvm.internal.s.h(str, "<set-?>");
            this.f39787b = str;
        }

        public final void v(String str) {
            this.f39789d = str;
        }

        public final void w(int i10) {
            this.f39790e = i10;
        }

        public final void x(String str) {
            this.f39786a = str;
        }

        public a() {
            String str = SVWsZyNSAChGIA.VjZf;
            this.f39787b = str;
            this.f39788c = str;
            this.f39790e = -1;
            this.f39791f = gl.r.q(str);
        }
    }

    private y(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6) {
        this.f39777a = str;
        this.f39778b = str2;
        this.f39779c = str3;
        this.f39780d = str4;
        this.f39781e = i10;
        this.f39782f = list;
        this.f39783g = list2;
        this.f39784h = str5;
        this.f39785i = str6;
    }
}
