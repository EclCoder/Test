package um;

import kotlin.KotlinNothingValueException;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d1 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f54749e;

    public d1(String source) {
        kotlin.jvm.internal.s.h(source, "source");
        this.f54749e = source;
    }

    @Override // um.a
    public String F(String keyToMatch, boolean z10) {
        kotlin.jvm.internal.s.h(keyToMatch, "keyToMatch");
        int i10 = this.f54717a;
        try {
            if (j() == 6 && kotlin.jvm.internal.s.c(H(z10), keyToMatch)) {
                t();
                if (j() == 5) {
                    return H(z10);
                }
            }
            return null;
        } finally {
            this.f54717a = i10;
            t();
        }
    }

    @Override // um.a
    public int I(int i10) {
        if (i10 < D().length()) {
            return i10;
        }
        return -1;
    }

    @Override // um.a
    public int K() {
        char cCharAt;
        int i10 = this.f54717a;
        if (i10 == -1) {
            return i10;
        }
        String strD = D();
        while (i10 < strD.length() && ((cCharAt = strD.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f54717a = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // um.a
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public String D() {
        return this.f54749e;
    }

    @Override // um.a
    public boolean e() {
        int i10 = this.f54717a;
        if (i10 == -1) {
            return false;
        }
        String strD = D();
        while (i10 < strD.length()) {
            char cCharAt = strD.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f54717a = i10;
                return E(cCharAt);
            }
            i10++;
        }
        this.f54717a = i10;
        return false;
    }

    @Override // um.a
    public byte j() {
        String strD = D();
        int i10 = this.f54717a;
        while (i10 != -1 && i10 < strD.length()) {
            int i11 = i10 + 1;
            char cCharAt = strD.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f54717a = i11;
                return b.a(cCharAt);
            }
            i10 = i11;
        }
        this.f54717a = strD.length();
        return (byte) 10;
    }

    @Override // um.a
    public void l(char c10) {
        if (this.f54717a == -1) {
            Q(c10);
        }
        String strD = D();
        int i10 = this.f54717a;
        while (i10 < strD.length()) {
            int i11 = i10 + 1;
            char cCharAt = strD.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f54717a = i11;
                if (cCharAt == c10) {
                    return;
                } else {
                    Q(c10);
                }
            }
            i10 = i11;
        }
        this.f54717a = -1;
        Q(c10);
    }

    @Override // um.a
    public String i() {
        l('\"');
        int i10 = this.f54717a;
        int iE0 = bm.r.e0(D(), '\"', i10, false, 4, null);
        if (iE0 == -1) {
            q();
            y((byte) 1, false);
            throw new KotlinNothingValueException();
        }
        for (int i11 = i10; i11 < iE0; i11++) {
            if (D().charAt(i11) == '\\') {
                return p(D(), this.f54717a, i11);
            }
        }
        this.f54717a = iE0 + 1;
        String strSubstring = D().substring(i10, iE0);
        kotlin.jvm.internal.s.g(strSubstring, OGoz.yxIqFoJog);
        return strSubstring;
    }
}
