package um;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends x0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b0 reader, char[] buffer) {
        super(reader, buffer);
        kotlin.jvm.internal.s.h(reader, "reader");
        kotlin.jvm.internal.s.h(buffer, "buffer");
    }

    private final fl.q W(int i10) {
        int i11 = i10 + 2;
        char cCharAt = D().charAt(i10 + 1);
        if (cCharAt != '*') {
            if (cCharAt != '/') {
                return fl.w.a(Integer.valueOf(i10), Boolean.FALSE);
            }
            int I = i11;
            while (i10 != -1) {
                int iE0 = bm.r.e0(D(), '\n', I, false, 4, null);
                if (iE0 != -1) {
                    return fl.w.a(Integer.valueOf(iE0 + 1), Boolean.TRUE);
                }
                I = I(D().length());
                i10 = I;
            }
            return fl.w.a(-1, Boolean.TRUE);
        }
        boolean z10 = false;
        int iX = i11;
        while (i10 != -1) {
            int iF0 = bm.r.f0(D(), "*/", iX, false, 4, null);
            if (iF0 != -1) {
                return fl.w.a(Integer.valueOf(iF0 + 2), Boolean.TRUE);
            }
            if (D().charAt(D().length() - 1) == '*') {
                iX = X(D().length() - 1);
                if (z10) {
                    break;
                }
                z10 = true;
            } else {
                iX = I(D().length());
            }
            i10 = iX;
        }
        this.f54717a = D().length();
        a.x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int X(int i10) {
        if (D().length() - i10 > this.f54847g) {
            return i10;
        }
        this.f54717a = i10;
        u();
        return (this.f54717a != 0 || D().length() == 0) ? -1 : 0;
    }

    @Override // um.a
    public byte G() {
        u();
        j jVarD = D();
        int iK = K();
        if (iK >= jVarD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f54717a = iK;
        return b.a(jVarD.charAt(iK));
    }

    @Override // um.x0, um.a
    public int K() {
        int I;
        int i10 = this.f54717a;
        while (true) {
            I = I(i10);
            if (I == -1) {
                break;
            }
            char cCharAt = D().charAt(I);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t') {
                i10 = I + 1;
            } else {
                if (cCharAt != '/' || I + 1 >= D().length()) {
                    break;
                }
                fl.q qVarW = W(I);
                int iIntValue = ((Number) qVarW.d()).intValue();
                if (!((Boolean) qVarW.g()).booleanValue()) {
                    I = iIntValue;
                    break;
                }
                i10 = iIntValue;
            }
        }
        this.f54717a = I;
        return I;
    }

    @Override // um.x0, um.a
    public boolean e() {
        u();
        int iK = K();
        if (iK >= D().length() || iK == -1) {
            return false;
        }
        return E(D().charAt(iK));
    }

    @Override // um.x0, um.a
    public byte j() {
        u();
        j jVarD = D();
        int iK = K();
        if (iK >= jVarD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f54717a = iK + 1;
        return b.a(jVarD.charAt(iK));
    }

    @Override // um.x0, um.a
    public void l(char c10) {
        u();
        j jVarD = D();
        int iK = K();
        if (iK >= jVarD.length() || iK == -1) {
            this.f54717a = -1;
            Q(c10);
        }
        char cCharAt = jVarD.charAt(iK);
        this.f54717a = iK + 1;
        if (cCharAt == c10) {
            return;
        }
        Q(c10);
    }
}
