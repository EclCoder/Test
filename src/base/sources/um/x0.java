package um;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class x0 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f54845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final char[] f54846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f54847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f54848h;

    public x0(b0 reader, char[] buffer) {
        kotlin.jvm.internal.s.h(reader, "reader");
        kotlin.jvm.internal.s.h(buffer, "buffer");
        this.f54845e = reader;
        this.f54846f = buffer;
        this.f54847g = 128;
        this.f54848h = new j(buffer);
        U(0);
    }

    private final void U(int i10) {
        char[] cArrB = D().b();
        if (i10 != 0) {
            int i11 = this.f54717a;
            gl.j.g(cArrB, cArrB, 0, i11, i11 + i10);
        }
        int length = D().length();
        while (i10 != length) {
            int iA = this.f54845e.a(cArrB, i10, length - i10);
            if (iA == -1) {
                D().f(i10);
                this.f54847g = -1;
                break;
            }
            i10 += iA;
        }
        this.f54717a = 0;
    }

    @Override // um.a
    public String F(String keyToMatch, boolean z10) {
        kotlin.jvm.internal.s.h(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // um.a
    public int I(int i10) {
        if (i10 < D().length()) {
            return i10;
        }
        this.f54717a = i10;
        u();
        return (this.f54717a != 0 || D().length() == 0) ? -1 : 0;
    }

    @Override // um.a
    public int K() {
        int I;
        char cCharAt;
        int i10 = this.f54717a;
        while (true) {
            I = I(i10);
            if (I == -1 || !((cCharAt = D().charAt(I)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i10 = I + 1;
        }
        this.f54717a = I;
        return I;
    }

    @Override // um.a
    public String L(int i10, int i11) {
        return D().e(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // um.a
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public j D() {
        return this.f54848h;
    }

    public int T(char c10, int i10) {
        j jVarD = D();
        int length = jVarD.length();
        while (i10 < length) {
            if (jVarD.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void V() {
        p.f54801c.c(this.f54846f);
    }

    @Override // um.a
    protected void d(int i10, int i11) {
        StringBuilder sbC = C();
        sbC.append(D().b(), i10, i11 - i10);
        kotlin.jvm.internal.s.g(sbC, "append(...)");
    }

    @Override // um.a
    public boolean e() {
        u();
        int i10 = this.f54717a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f54717a = I;
                return false;
            }
            char cCharAt = D().charAt(I);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f54717a = I;
                return E(cCharAt);
            }
            i10 = I + 1;
        }
    }

    @Override // um.a
    public String i() {
        l('\"');
        int i10 = this.f54717a;
        int iT = T('\"', i10);
        if (iT == -1) {
            int I = I(i10);
            if (I != -1) {
                return p(D(), this.f54717a, I);
            }
            a.z(this, (byte) 1, false, 2, null);
            throw new KotlinNothingValueException();
        }
        for (int i11 = i10; i11 < iT; i11++) {
            if (D().charAt(i11) == '\\') {
                return p(D(), this.f54717a, i11);
            }
        }
        this.f54717a = iT + 1;
        return L(i10, iT);
    }

    @Override // um.a
    public byte j() {
        u();
        j jVarD = D();
        int i10 = this.f54717a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f54717a = I;
                return (byte) 10;
            }
            int i11 = I + 1;
            byte bA = b.a(jVarD.charAt(I));
            if (bA != 3) {
                this.f54717a = i11;
                return bA;
            }
            i10 = i11;
        }
    }

    @Override // um.a
    public void l(char c10) {
        u();
        j jVarD = D();
        int i10 = this.f54717a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f54717a = I;
                Q(c10);
                return;
            }
            int i11 = I + 1;
            char cCharAt = jVarD.charAt(I);
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
    }

    @Override // um.a
    public void u() {
        int length = D().length() - this.f54717a;
        if (length > this.f54847g) {
            return;
        }
        U(length);
    }
}
