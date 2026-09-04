package j$.time.format;

import java.text.ParsePosition;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f41705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f41706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f41707e;

    public boolean b(char c10, char c11) {
        return c10 == c11;
    }

    public k(String str, String str2, k kVar) {
        this.f41703a = str;
        this.f41704b = str2;
        this.f41706d = kVar;
        if (str.isEmpty()) {
            this.f41705c = (char) 65535;
        } else {
            this.f41705c = this.f41703a.charAt(0);
        }
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f41703a.length() + index;
        k kVar = this.f41706d;
        if (kVar != null && length2 != length) {
            while (!b(kVar.f41705c, charSequence.charAt(length2))) {
                kVar = kVar.f41707e;
                if (kVar == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strC = kVar.c(charSequence, parsePosition);
            if (strC != null) {
                return strC;
            }
        }
        parsePosition.setIndex(length2);
        return this.f41704b;
    }

    public k d(String str, String str2, k kVar) {
        return new k(str, str2, kVar);
    }

    public boolean e(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f41703a, i10);
        }
        int length = this.f41703a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!b(this.f41703a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }

    public final boolean a(String str, String str2) {
        int i10 = 0;
        while (i10 < str.length() && i10 < this.f41703a.length() && b(str.charAt(i10), this.f41703a.charAt(i10))) {
            i10++;
        }
        if (i10 == this.f41703a.length()) {
            if (i10 < str.length()) {
                String strSubstring = str.substring(i10);
                for (k kVar = this.f41706d; kVar != null; kVar = kVar.f41707e) {
                    if (b(kVar.f41705c, strSubstring.charAt(0))) {
                        return kVar.a(strSubstring, str2);
                    }
                }
                k kVarD = d(strSubstring, str2, null);
                kVarD.f41707e = this.f41706d;
                this.f41706d = kVarD;
                return true;
            }
            this.f41704b = str2;
            return true;
        }
        k kVarD2 = d(this.f41703a.substring(i10), this.f41704b, this.f41706d);
        this.f41703a = str.substring(0, i10);
        this.f41706d = kVarD2;
        if (i10 < str.length()) {
            this.f41706d.f41707e = d(str.substring(i10), str2, null);
            this.f41704b = null;
            return true;
        }
        this.f41704b = str2;
        return true;
    }
}
