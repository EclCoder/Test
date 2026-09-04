package com.mbridge.msdk.thrid.okhttp;

import com.inmobi.media.core.config.models.AdConfig;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char[] f33515j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f33516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f33519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f33520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f33521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f33522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f33523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f33524i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f33525a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f33528d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List<String> f33530f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List<String> f33531g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f33532h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f33526b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f33527c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f33529e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f33530f = arrayList;
            arrayList.add("");
        }

        private boolean c(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public a a(int i10) {
            if (i10 > 0 && i10 <= 65535) {
                this.f33529e = i10;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i10);
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strA = a(str, 0, str.length());
            if (strA != null) {
                this.f33528d = strA;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        a d() {
            int size = this.f33530f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f33530f.set(i10, s.a(this.f33530f.get(i10), "[]", true, true, false, true));
            }
            List<String> list = this.f33531g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f33531g.get(i11);
                    if (str != null) {
                        this.f33531g.set(i11, s.a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f33532h;
            if (str2 != null) {
                this.f33532h = s.a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a e(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f33527c = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a f(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f33525a = "http";
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.f33525a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + str);
        }

        public a g(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f33526b = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f33525a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (!this.f33526b.isEmpty() || !this.f33527c.isEmpty()) {
                sb2.append(this.f33526b);
                if (!this.f33527c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f33527c);
                }
                sb2.append('@');
            }
            String str2 = this.f33528d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f33528d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f33528d);
                }
            }
            if (this.f33529e != -1 || this.f33525a != null) {
                int iB = b();
                String str3 = this.f33525a;
                if (str3 == null || iB != s.a(str3)) {
                    sb2.append(':');
                    sb2.append(iB);
                }
            }
            s.b(sb2, this.f33530f);
            if (this.f33531g != null) {
                sb2.append('?');
                s.a(sb2, this.f33531g);
            }
            if (this.f33532h != null) {
                sb2.append('#');
                sb2.append(this.f33532h);
            }
            return sb2.toString();
        }

        private void c() {
            List<String> list = this.f33530f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f33530f.isEmpty()) {
                this.f33530f.add("");
            } else {
                List<String> list2 = this.f33530f;
                list2.set(list2.size() - 1, "");
            }
        }

        private static int e(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
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

        public a a(String str) {
            this.f33531g = str != null ? s.d(s.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public s a() {
            if (this.f33525a != null) {
                if (this.f33528d != null) {
                    return new s(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        int b() {
            int i10 = this.f33529e;
            return i10 != -1 ? i10 : s.a(this.f33525a);
        }

        private static int b(String str, int i10, int i11) {
            try {
                int i12 = Integer.parseInt(s.a(str, i10, i11, "", false, false, false, true, null));
                if (i12 <= 0 || i12 > 65535) {
                    return -1;
                }
                return i12;
            } catch (NumberFormatException unused) {
            }
        }

        private static int c(String str, int i10, int i11) {
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

        private static int f(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        a a(s sVar, String str) {
            int iA;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iB = com.mbridge.msdk.thrid.okhttp.internal.c.b(str4, 0, str4.length());
            int iC = com.mbridge.msdk.thrid.okhttp.internal.c.c(str4, iB, str4.length());
            int iE = e(str4, iB, iC);
            if (iE != -1) {
                if (str4.regionMatches(true, iB, "https:", 0, 6)) {
                    this.f33525a = "https";
                    iB += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iB, "http:", 0, 5)) {
                        this.f33525a = "http";
                        iB += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, iE) + "'");
                    }
                }
            } else if (sVar != null) {
                this.f33525a = sVar.f33516a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iF = f(str4, iB, iC);
            char c10 = '#';
            if (iF < 2 && sVar != null && sVar.f33516a.equals(this.f33525a)) {
                this.f33526b = sVar.f();
                this.f33527c = sVar.b();
                this.f33528d = sVar.f33519d;
                this.f33529e = sVar.f33520e;
                this.f33530f.clear();
                this.f33530f.addAll(sVar.d());
                if (iB == iC || str4.charAt(iB) == '#') {
                    a(sVar.e());
                }
                str2 = str4;
            } else {
                int i11 = iB + iF;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str4, i11, iC, "@/\\?#");
                    byte bCharAt = iA != iC ? str4.charAt(iA) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z10) {
                            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str4, i11, iA, ':');
                            String strA = s.a(str, i11, iA2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strA = this.f33526b + "%40" + strA;
                            }
                            this.f33526b = strA;
                            if (iA2 != iA) {
                                i10 = iA;
                                this.f33527c = s.a(str, iA2 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                i10 = iA;
                            }
                            str3 = str;
                            z11 = true;
                        } else {
                            i10 = iA;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f33527c);
                            sb2.append("%40");
                            str3 = str;
                            sb2.append(s.a(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f33527c = sb2.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c10 = '#';
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iC2 = c(str2, i12, iA);
                int i13 = iC2 + 1;
                if (i13 < iA) {
                    this.f33528d = a(str2, i12, iC2);
                    int iB2 = b(str2, i13, iA);
                    this.f33529e = iB2;
                    if (iB2 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i13, iA) + '\"');
                    }
                } else {
                    this.f33528d = a(str2, i12, iC2);
                    this.f33529e = s.a(this.f33525a);
                }
                if (this.f33528d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i12, iC2) + '\"');
                }
                iB = iA;
            }
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str2, iB, iC, "?#");
            d(str2, iB, iA3);
            if (iA3 < iC && str2.charAt(iA3) == '?') {
                int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str2, iA3, iC, '#');
                this.f33531g = s.d(s.a(str2, iA3 + 1, iA4, " \"'<>#", true, false, true, true, null));
                iA3 = iA4;
            }
            if (iA3 < iC && str2.charAt(iA3) == '#') {
                this.f33532h = s.a(str2, iA3 + 1, iC, "", true, false, false, false, null);
            }
            return this;
        }

        private void d(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.f33530f;
                list.set(list.size() - 1, "");
            } else {
                this.f33530f.clear();
                this.f33530f.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i12, i11, "/\\");
                boolean z10 = iA < i11;
                str = str;
                a(str, i12, iA, z10, true);
                i12 = z10 ? iA + 1 : iA;
            }
        }

        private boolean d(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void a(String str, int i10, int i11, boolean z10, boolean z11) {
            String strA = s.a(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (c(strA)) {
                return;
            }
            if (d(strA)) {
                c();
                return;
            }
            List<String> list = this.f33530f;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f33530f;
                list2.set(list2.size() - 1, strA);
            } else {
                this.f33530f.add(strA);
            }
            if (z10) {
                this.f33530f.add("");
            }
        }

        private static String a(String str, int i10, int i11) {
            return com.mbridge.msdk.thrid.okhttp.internal.c.a(s.a(str, i10, i11, false));
        }
    }

    s(a aVar) {
        this.f33516a = aVar.f33525a;
        this.f33517b = a(aVar.f33526b, false);
        this.f33518c = a(aVar.f33527c, false);
        this.f33519d = aVar.f33528d;
        this.f33520e = aVar.b();
        this.f33521f = a(aVar.f33530f, false);
        List<String> list = aVar.f33531g;
        this.f33522g = list != null ? a(list, true) : null;
        String str = aVar.f33532h;
        this.f33523h = str != null ? a(str, false) : null;
        this.f33524i = aVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public String b() {
        if (this.f33518c.isEmpty()) {
            return "";
        }
        return this.f33524i.substring(this.f33524i.indexOf(58, this.f33516a.length() + 3) + 1, this.f33524i.indexOf(64));
    }

    public String c() {
        int iIndexOf = this.f33524i.indexOf(47, this.f33516a.length() + 3);
        String str = this.f33524i;
        return this.f33524i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int iIndexOf = this.f33524i.indexOf(47, this.f33516a.length() + 3);
        String str = this.f33524i;
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iA) {
            int i10 = iIndexOf + 1;
            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f33524i, i10, iA, '/');
            arrayList.add(this.f33524i.substring(i10, iA2));
            iIndexOf = iA2;
        }
        return arrayList;
    }

    public String e() {
        if (this.f33522g == null) {
            return null;
        }
        int iIndexOf = this.f33524i.indexOf(63) + 1;
        String str = this.f33524i;
        return this.f33524i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).f33524i.equals(this.f33524i);
    }

    public String f() {
        if (this.f33517b.isEmpty()) {
            return "";
        }
        int length = this.f33516a.length() + 3;
        String str = this.f33524i;
        return this.f33524i.substring(length, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.f33519d;
    }

    public boolean h() {
        return this.f33516a.equals("https");
    }

    public int hashCode() {
        return this.f33524i.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.f33525a = this.f33516a;
        aVar.f33526b = f();
        aVar.f33527c = b();
        aVar.f33528d = this.f33519d;
        aVar.f33529e = this.f33520e != a(this.f33516a) ? this.f33520e : -1;
        aVar.f33530f.clear();
        aVar.f33530f.addAll(d());
        aVar.a(e());
        aVar.f33532h = a();
        return aVar;
    }

    public int j() {
        return this.f33520e;
    }

    public String k() {
        if (this.f33522g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        a(sb2, this.f33522g);
        return sb2.toString();
    }

    public String m() {
        return this.f33516a;
    }

    public URI n() {
        String string = i().d().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public String toString() {
        return this.f33524i;
    }

    public String l() {
        return c(YSHErhbVu.tavpXkD).g("").e("").a().toString();
    }

    static void a(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    public a c(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    static void b(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public s e(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }

    static List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static s b(String str) {
        return new a().a(null, str).a();
    }

    public String a() {
        if (this.f33523h == null) {
            return null;
        }
        return this.f33524i.substring(this.f33524i.indexOf(35) + 1);
    }

    static String a(String str, boolean z10) {
        return a(str, 0, str.length(), z10);
    }

    private List<String> a(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? a(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String a(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, i12);
                a(cVar, str, i12, i11, z10);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i10 + 1));
                int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i12));
                if (iA != -1 && iA2 != -1) {
                    cVar.writeByte((iA << 4) + iA2);
                    i10 = i12;
                } else {
                    cVar.f(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z10) {
                cVar.writeByte(32);
            } else {
                cVar.f(iCodePointAt);
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    static boolean a(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i10 + 1)) != -1 && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i12)) != -1;
    }

    static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || a(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, iCharCount);
                a(cVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.mbridge.msdk.thrid.okio.c cVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    cVar.a(z10 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || a(str, i10, i11)))))) {
                    cVar.f(iCodePointAt);
                } else {
                    if (cVar2 == null) {
                        cVar2 = new com.mbridge.msdk.thrid.okio.c();
                    }
                    if (charset != null && !charset.equals(com.mbridge.msdk.thrid.okhttp.internal.c.f33116j)) {
                        cVar2.a(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        cVar2.f(iCodePointAt);
                    }
                    while (!cVar2.f()) {
                        byte b10 = cVar2.readByte();
                        int i12 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        cVar.writeByte(37);
                        char[] cArr = f33515j;
                        cVar.writeByte((int) cArr[(i12 >> 4) & 15]);
                        cVar.writeByte((int) cArr[b10 & 15]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, charset);
    }

    static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
