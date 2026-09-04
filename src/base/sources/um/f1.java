package um;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends d1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(String source) {
        super(source);
        kotlin.jvm.internal.s.h(source, "source");
    }

    @Override // um.a
    public byte G() {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f54717a = iK;
        return b.a(strD.charAt(iK));
    }

    @Override // um.d1, um.a
    public int K() {
        int i10;
        int iE0 = this.f54717a;
        if (iE0 == -1) {
            return iE0;
        }
        String strD = D();
        while (iE0 < strD.length()) {
            char cCharAt = strD.charAt(iE0);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i10 = iE0 + 1) >= strD.length()) {
                    break;
                }
                char cCharAt2 = strD.charAt(i10);
                if (cCharAt2 == '*') {
                    int iF0 = bm.r.f0(strD, "*/", iE0 + 2, false, 4, null);
                    if (iF0 == -1) {
                        this.f54717a = strD.length();
                        a.x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    iE0 = iF0 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iE0 = bm.r.e0(strD, '\n', iE0 + 2, false, 4, null);
                    iE0 = iE0 == -1 ? strD.length() : iE0 + 1;
                }
            }
        }
        this.f54717a = iE0;
        return iE0;
    }

    @Override // um.d1, um.a
    public boolean e() {
        int iK = K();
        if (iK >= D().length() || iK == -1) {
            return false;
        }
        return E(D().charAt(iK));
    }

    @Override // um.d1, um.a
    public byte j() {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f54717a = iK + 1;
        return b.a(strD.charAt(iK));
    }

    @Override // um.d1, um.a
    public void l(char c10) {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            this.f54717a = -1;
            Q(c10);
        }
        char cCharAt = strD.charAt(iK);
        this.f54717a = iK + 1;
        if (cCharAt == c10) {
            return;
        }
        Q(c10);
    }
}
