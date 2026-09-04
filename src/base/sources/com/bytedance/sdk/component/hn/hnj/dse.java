package com.bytedance.sdk.component.hn.hnj;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.inmobi.media.core.config.models.AdConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class dse {
    private static final char[] gjv = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final List<String> aq;
    private final String dkl;
    private final List<String> dse;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    final String f12858hn;
    final String hnj;
    private final String ojm;
    final int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final String f12859sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final String f12860ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class hnj {
        String aq;
        final List<String> dkl;
        List<String> dse;
        String gjv;
        String hnj;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        String f12861hn = "";
        String qor = "";

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        int f12862sk = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.hn.hnj.dse$hnj$hnj, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes.dex */
        enum EnumC0191hnj {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public hnj() {
            ArrayList arrayList = new ArrayList();
            this.dkl = arrayList;
            arrayList.add("");
        }

        private boolean dkl(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private boolean sk(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public hnj gjv(String str) {
            this.dse = str != null ? dse.hn(dse.hnj(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public hnj hn(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strSk = sk(str, 0, str.length());
            if (strSk == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.gjv = strSk;
            return this;
        }

        public hnj hnj(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.hnj = "http";
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.hnj = "https";
            return this;
        }

        public hnj qor(String str) {
            if (str != null) {
                return hnj(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.hnj);
            sb2.append("://");
            if (!this.f12861hn.isEmpty() || !this.qor.isEmpty()) {
                sb2.append(this.f12861hn);
                if (!this.qor.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.qor);
                }
                sb2.append('@');
            }
            if (this.gjv.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.gjv);
                sb2.append(']');
            } else {
                sb2.append(this.gjv);
            }
            int iHnj = hnj();
            if (iHnj != dse.hnj(this.hnj)) {
                sb2.append(':');
                sb2.append(iHnj);
            }
            dse.hnj(sb2, this.dkl);
            if (this.dse != null) {
                sb2.append('?');
                dse.hn(sb2, this.dse);
            }
            if (this.aq != null) {
                sb2.append('#');
                sb2.append(this.aq);
            }
            return sb2.toString();
        }

        private static String sk(String str, int i10, int i11) {
            return com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(dse.hnj(str, i10, i11, false));
        }

        private static int gjv(String str, int i10, int i11) {
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

        private void qor() {
            List<String> list = this.dkl;
            if (list.remove(list.size() - 1).isEmpty() && !this.dkl.isEmpty()) {
                List<String> list2 = this.dkl;
                list2.set(list2.size() - 1, "");
            } else {
                this.dkl.add("");
            }
        }

        private static int dkl(String str, int i10, int i11) {
            try {
                int i12 = Integer.parseInt(dse.hnj(str, i10, i11, "", false, false, false, true, null));
                if (i12 <= 0 || i12 > 65535) {
                    return -1;
                }
                return i12;
            } catch (NumberFormatException unused) {
            }
        }

        public dse hn() {
            if (this.hnj != null) {
                if (this.gjv != null) {
                    return new dse(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int qor(String str, int i10, int i11) {
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

        int hnj() {
            int i10 = this.f12862sk;
            return i10 != -1 ? i10 : dse.hnj(this.hnj);
        }

        private hnj hnj(String str, boolean z10) {
            int i10 = 0;
            while (true) {
                int iHnj = com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str, i10, str.length(), "/\\");
                hnj(str, i10, iHnj, iHnj < str.length(), z10);
                i10 = iHnj + 1;
                if (i10 > str.length()) {
                    return this;
                }
                str = str;
                z10 = z10;
            }
        }

        private static int hn(String str, int i10, int i11) {
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

        public hnj hnj(String str, String str2) {
            if (str != null) {
                if (this.dse == null) {
                    this.dse = new ArrayList();
                }
                this.dse.add(dse.hnj(str, " \"'<>#&=", true, false, true, true));
                this.dse.add(str2 != null ? dse.hnj(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        EnumC0191hnj hnj(dse dseVar, String str) {
            int iHnj;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iHnj2 = com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str4, 0, str4.length());
            int iHn = com.bytedance.sdk.component.hn.hnj.hn.ojm.hn(str4, iHnj2, str4.length());
            if (hn(str4, iHnj2, iHn) != -1) {
                if (str4.regionMatches(true, iHnj2, "https:", 0, 6)) {
                    this.hnj = "https";
                    iHnj2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iHnj2, "http:", 0, 5)) {
                        this.hnj = "http";
                        iHnj2 += 5;
                    } else {
                        return EnumC0191hnj.UNSUPPORTED_SCHEME;
                    }
                }
            } else if (dseVar != null) {
                this.hnj = dseVar.hnj;
            } else {
                return EnumC0191hnj.MISSING_SCHEME;
            }
            int iQor = qor(str4, iHnj2, iHn);
            char c10 = '#';
            if (iQor < 2 && dseVar != null && dseVar.hnj.equals(this.hnj)) {
                this.f12861hn = dseVar.hn();
                this.qor = dseVar.qor();
                this.gjv = dseVar.f12858hn;
                this.f12862sk = dseVar.qor;
                this.dkl.clear();
                this.dkl.addAll(dseVar.gjv());
                if (iHnj2 == iHn || str4.charAt(iHnj2) == '#') {
                    gjv(dseVar.sk());
                }
                str2 = str4;
            } else {
                int i11 = iHnj2 + iQor;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iHnj = com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str4, i11, iHn, "@/\\?#");
                    byte bCharAt = iHnj != iHn ? str4.charAt(iHnj) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z10) {
                            int iHnj3 = com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str4, i11, iHnj, ':');
                            String strHnj = dse.hnj(str, i11, iHnj3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strHnj = this.f12861hn + "%40" + strHnj;
                            }
                            this.f12861hn = strHnj;
                            if (iHnj3 != iHnj) {
                                i10 = iHnj;
                                this.qor = dse.hnj(str, iHnj3 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                i10 = iHnj;
                            }
                            str3 = str;
                            z11 = true;
                        } else {
                            i10 = iHnj;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.qor);
                            sb2.append("%40");
                            str3 = str;
                            sb2.append(dse.hnj(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.qor = sb2.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c10 = '#';
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iGjv = gjv(str2, i12, iHnj);
                int i13 = iGjv + 1;
                if (i13 < iHnj) {
                    this.gjv = sk(str2, i12, iGjv);
                    int iDkl = dkl(str2, i13, iHnj);
                    this.f12862sk = iDkl;
                    if (iDkl == -1) {
                        return EnumC0191hnj.INVALID_PORT;
                    }
                } else {
                    this.gjv = sk(str2, i12, iGjv);
                    this.f12862sk = dse.hnj(this.hnj);
                }
                if (this.gjv == null) {
                    return EnumC0191hnj.INVALID_HOST;
                }
                iHnj2 = iHnj;
            }
            int iHnj4 = com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str2, iHnj2, iHn, "?#");
            hnj(str2, iHnj2, iHnj4);
            if (iHnj4 < iHn && str2.charAt(iHnj4) == '?') {
                int iHnj5 = com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str2, iHnj4, iHn, '#');
                this.dse = dse.hn(dse.hnj(str2, iHnj4 + 1, iHnj5, " \"'<>#", true, false, true, true, null));
                iHnj4 = iHnj5;
            }
            if (iHnj4 < iHn && str2.charAt(iHnj4) == '#') {
                this.aq = dse.hnj(str2, iHnj4 + 1, iHn, dOIDCKnIR.qiFBzI, true, false, false, false, null);
            }
            return EnumC0191hnj.SUCCESS;
        }

        private void hnj(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.dkl;
                list.set(list.size() - 1, "");
            } else {
                this.dkl.clear();
                this.dkl.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iHnj = com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str, i12, i11, "/\\");
                boolean z10 = iHnj < i11;
                String str2 = str;
                hnj(str2, i12, iHnj, z10, true);
                if (z10) {
                    iHnj++;
                }
                i12 = iHnj;
                str = str2;
            }
        }

        private void hnj(String str, int i10, int i11, boolean z10, boolean z11) {
            String strHnj = dse.hnj(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (sk(strHnj)) {
                return;
            }
            if (dkl(strHnj)) {
                qor();
                return;
            }
            List<String> list = this.dkl;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.dkl;
                list2.set(list2.size() - 1, strHnj);
            } else {
                this.dkl.add(strHnj);
            }
            if (z10) {
                this.dkl.add("");
            }
        }
    }

    dse(hnj hnjVar) {
        this.hnj = hnjVar.hnj;
        this.f12859sk = hnj(hnjVar.f12861hn, false);
        this.dkl = hnj(hnjVar.qor, false);
        this.f12858hn = hnjVar.gjv;
        this.qor = hnjVar.hnj();
        this.dse = hnj(hnjVar.dkl, false);
        List<String> list = hnjVar.dse;
        this.aq = list != null ? hnj(list, true) : null;
        String str = hnjVar.aq;
        this.ojm = str != null ? hnj(str, false) : null;
        this.f12860ta = hnjVar.toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof dse) && ((dse) obj).f12860ta.equals(this.f12860ta);
    }

    public List<String> gjv() {
        int iIndexOf = this.f12860ta.indexOf(47, this.hnj.length() + 3);
        String str = this.f12860ta;
        int iHnj = com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iHnj) {
            int i10 = iIndexOf + 1;
            int iHnj2 = com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(this.f12860ta, i10, iHnj, '/');
            arrayList.add(this.f12860ta.substring(i10, iHnj2));
            iIndexOf = iHnj2;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f12860ta.hashCode();
    }

    public String hn() {
        if (this.f12859sk.isEmpty()) {
            return "";
        }
        int length = this.hnj.length() + 3;
        String str = this.f12860ta;
        return this.f12860ta.substring(length, com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str, length, str.length(), ":@"));
    }

    public URL hnj() {
        try {
            return new URL(this.f12860ta);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String qor() {
        if (this.dkl.isEmpty()) {
            return "";
        }
        return this.f12860ta.substring(this.f12860ta.indexOf(58, this.hnj.length() + 3) + 1, this.f12860ta.indexOf(64));
    }

    public String sk() {
        if (this.aq == null) {
            return null;
        }
        int iIndexOf = this.f12860ta.indexOf(63) + 1;
        String str = this.f12860ta;
        return this.f12860ta.substring(iIndexOf, com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str, iIndexOf, str.length(), '#'));
    }

    public String toString() {
        return this.f12860ta;
    }

    public static int hnj(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static void hn(StringBuilder sb2, List<String> list) {
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

    static void hnj(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public static dse qor(String str) {
        hnj hnjVar = new hnj();
        if (hnjVar.hnj((dse) null, str) == hnj.EnumC0191hnj.SUCCESS) {
            return hnjVar.hn();
        }
        return null;
    }

    static String hnj(String str, boolean z10) {
        return hnj(str, 0, str.length(), z10);
    }

    private List<String> hnj(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? hnj(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static List<String> hn(String str) {
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

    static String hnj(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.bytedance.sdk.component.hn.hnj.hn.hnj hnjVar = new com.bytedance.sdk.component.hn.hnj.hn.hnj();
                hnjVar.hnj(str, i10, i12);
                hnj(hnjVar, str, i12, i11, z10);
                return hnjVar.qor();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    static void hnj(com.bytedance.sdk.component.hn.hnj.hn.hnj hnjVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iHnj = com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str.charAt(i10 + 1));
                int iHnj2 = com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str.charAt(i12));
                if (iHnj != -1 && iHnj2 != -1) {
                    hnjVar.hn((iHnj << 4) + iHnj2);
                    i10 = i12;
                } else {
                    hnjVar.hnj(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z10) {
                hnjVar.hn(32);
            } else {
                hnjVar.hnj(iCodePointAt);
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    static boolean hnj(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str.charAt(i10 + 1)) != -1 && com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj(str.charAt(i12)) != -1;
    }

    static String hnj(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || hnj(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.bytedance.sdk.component.hn.hnj.hn.hnj hnjVar = new com.bytedance.sdk.component.hn.hnj.hn.hnj();
                hnjVar.hnj(str, i10, iCharCount);
                hnj(hnjVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return hnjVar.qor();
            }
        }
        return str.substring(i10, i11);
    }

    static void hnj(com.bytedance.sdk.component.hn.hnj.hn.hnj hnjVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.bytedance.sdk.component.hn.hnj.hn.hnj hnjVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    hnjVar.hnj(z10 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || hnj(str, i10, i11)))))) {
                    hnjVar.hnj(iCodePointAt);
                } else {
                    if (hnjVar2 == null) {
                        hnjVar2 = new com.bytedance.sdk.component.hn.hnj.hn.hnj();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.hn.hnj.hn.ojm.hnj)) {
                        hnjVar2.hnj(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        hnjVar2.hnj(iCodePointAt);
                    }
                    while (!hnjVar2.hnj()) {
                        byte bHn = hnjVar2.hn();
                        int i12 = bHn & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        hnjVar.hn(37);
                        char[] cArr = gjv;
                        hnjVar.hn((int) cArr[(i12 >> 4) & 15]);
                        hnjVar.hn((int) cArr[bHn & 15]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    static String hnj(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return hnj(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
