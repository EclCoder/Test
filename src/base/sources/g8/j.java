package g8;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class j extends c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final char[] f39024v = com.fasterxml.jackson.core.io.a.e();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final Writer f39025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected char f39026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected char[] f39027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f39028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f39029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f39030r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected char[] f39031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected com.fasterxml.jackson.core.j f39032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected char[] f39033u;

    public j(com.fasterxml.jackson.core.io.b bVar, int i10, com.fasterxml.jackson.core.h hVar, Writer writer, char c10) {
        super(bVar, i10, hVar);
        this.f39025m = writer;
        char[] cArrD = bVar.d();
        this.f39027o = cArrD;
        this.f39030r = cArrD.length;
        this.f39026n = c10;
        if (c10 != '\"') {
            this.f38969h = com.fasterxml.jackson.core.io.a.g(c10);
        }
    }

    private char[] g1() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.f39031s = cArr;
        return cArr;
    }

    private int i1(char[] cArr, int i10, int i11, char c10, int i12) throws IOException {
        int i13;
        if (i12 >= 0) {
            if (i10 > 1 && i10 < i11) {
                int i14 = i10 - 2;
                cArr[i14] = '\\';
                cArr[i10 - 1] = (char) i12;
                return i14;
            }
            char[] cArrG1 = this.f39031s;
            if (cArrG1 == null) {
                cArrG1 = g1();
            }
            cArrG1[1] = (char) i12;
            this.f39025m.write(cArrG1, 0, 2);
            return i10;
        }
        if (i12 == -2) {
            this.f39032t.getClass();
            String value = this.f39032t.getValue();
            this.f39032t = null;
            int length = value.length();
            if (i10 < length || i10 >= i11) {
                this.f39025m.write(value);
                return i10;
            }
            int i15 = i10 - length;
            value.getChars(0, length, cArr, i15);
            return i15;
        }
        if (i10 <= 5 || i10 >= i11) {
            char[] cArrG2 = this.f39031s;
            if (cArrG2 == null) {
                cArrG2 = g1();
            }
            this.f39028p = this.f39029q;
            if (c10 <= 255) {
                char[] cArr2 = f39024v;
                cArrG2[6] = cArr2[c10 >> 4];
                cArrG2[7] = cArr2[c10 & 15];
                this.f39025m.write(cArrG2, 2, 6);
                return i10;
            }
            int i16 = c10 >> '\b';
            char[] cArr3 = f39024v;
            cArrG2[10] = cArr3[(i16 & 255) >> 4];
            cArrG2[11] = cArr3[i16 & 15];
            cArrG2[12] = cArr3[(c10 & 255) >> 4];
            cArrG2[13] = cArr3[c10 & 15];
            this.f39025m.write(cArrG2, 8, 6);
            return i10;
        }
        cArr[i10 - 6] = '\\';
        int i17 = i10 - 4;
        cArr[i10 - 5] = 'u';
        if (c10 > 255) {
            int i18 = c10 >> '\b';
            int i19 = i10 - 3;
            char[] cArr4 = f39024v;
            cArr[i17] = cArr4[(i18 & 255) >> 4];
            i13 = i10 - 2;
            cArr[i19] = cArr4[i18 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i20 = i10 - 3;
            cArr[i17] = '0';
            i13 = i10 - 2;
            cArr[i20] = '0';
        }
        char[] cArr5 = f39024v;
        cArr[i13] = cArr5[c10 >> 4];
        cArr[i13 + 1] = cArr5[c10 & 15];
        return i13 - 4;
    }

    private void j1(char c10, int i10) throws IOException {
        int i11;
        if (i10 >= 0) {
            int i12 = this.f39029q;
            if (i12 >= 2) {
                int i13 = i12 - 2;
                this.f39028p = i13;
                char[] cArr = this.f39027o;
                cArr[i13] = '\\';
                cArr[i12 - 1] = (char) i10;
                return;
            }
            char[] cArrG1 = this.f39031s;
            if (cArrG1 == null) {
                cArrG1 = g1();
            }
            this.f39028p = this.f39029q;
            cArrG1[1] = (char) i10;
            this.f39025m.write(cArrG1, 0, 2);
            return;
        }
        if (i10 == -2) {
            this.f39032t.getClass();
            String value = this.f39032t.getValue();
            this.f39032t = null;
            int length = value.length();
            int i14 = this.f39029q;
            if (i14 < length) {
                this.f39028p = i14;
                this.f39025m.write(value);
                return;
            } else {
                int i15 = i14 - length;
                this.f39028p = i15;
                value.getChars(0, length, this.f39027o, i15);
                return;
            }
        }
        int i16 = this.f39029q;
        if (i16 < 6) {
            char[] cArrG2 = this.f39031s;
            if (cArrG2 == null) {
                cArrG2 = g1();
            }
            this.f39028p = this.f39029q;
            if (c10 <= 255) {
                char[] cArr2 = f39024v;
                cArrG2[6] = cArr2[c10 >> 4];
                cArrG2[7] = cArr2[c10 & 15];
                this.f39025m.write(cArrG2, 2, 6);
                return;
            }
            int i17 = c10 >> '\b';
            char[] cArr3 = f39024v;
            cArrG2[10] = cArr3[(i17 & 255) >> 4];
            cArrG2[11] = cArr3[i17 & 15];
            cArrG2[12] = cArr3[(c10 & 255) >> 4];
            cArrG2[13] = cArr3[c10 & 15];
            this.f39025m.write(cArrG2, 8, 6);
            return;
        }
        char[] cArr4 = this.f39027o;
        int i18 = i16 - 6;
        this.f39028p = i18;
        cArr4[i18] = '\\';
        cArr4[i16 - 5] = 'u';
        if (c10 > 255) {
            int i19 = c10 >> '\b';
            char[] cArr5 = f39024v;
            cArr4[i16 - 4] = cArr5[(i19 & 255) >> 4];
            i11 = i16 - 3;
            cArr4[i11] = cArr5[i19 & 15];
            c10 = (char) (c10 & 255);
        } else {
            cArr4[i16 - 4] = '0';
            i11 = i16 - 3;
            cArr4[i11] = '0';
        }
        char[] cArr6 = f39024v;
        cArr4[i11 + 1] = cArr6[c10 >> 4];
        cArr4[i11 + 2] = cArr6[c10 & 15];
    }

    private void n1(String str) throws IOException {
        h1();
        int length = str.length();
        int i10 = 0;
        while (true) {
            int i11 = this.f39030r;
            if (i10 + i11 > length) {
                i11 = length - i10;
            }
            int i12 = i10 + i11;
            str.getChars(i10, i12, this.f39027o, 0);
            int i13 = this.f38970i;
            if (i13 != 0) {
                u1(i11, i13);
            } else {
                t1(i11);
            }
            if (i12 >= length) {
                return;
            } else {
                i10 = i12;
            }
        }
    }

    private final void o1() throws IOException {
        if (this.f39029q + 4 >= this.f39030r) {
            h1();
        }
        int i10 = this.f39029q;
        char[] cArr = this.f39027o;
        cArr[i10] = 'n';
        cArr[i10 + 1] = 'u';
        cArr[i10 + 2] = 'l';
        cArr[i10 + 3] = 'l';
        this.f39029q = i10 + 4;
    }

    private void q1(int i10) throws IOException {
        if (this.f39029q + 13 >= this.f39030r) {
            h1();
        }
        char[] cArr = this.f39027o;
        int i11 = this.f39029q;
        int i12 = i11 + 1;
        this.f39029q = i12;
        cArr[i11] = this.f39026n;
        int iR = com.fasterxml.jackson.core.io.f.r(i10, cArr, i12);
        char[] cArr2 = this.f39027o;
        this.f39029q = iR + 1;
        cArr2[iR] = this.f39026n;
    }

    private void r1(long j10) throws IOException {
        if (this.f39029q + 23 >= this.f39030r) {
            h1();
        }
        char[] cArr = this.f39027o;
        int i10 = this.f39029q;
        int i11 = i10 + 1;
        this.f39029q = i11;
        cArr[i10] = this.f39026n;
        int iT = com.fasterxml.jackson.core.io.f.t(j10, cArr, i11);
        char[] cArr2 = this.f39027o;
        this.f39029q = iT + 1;
        cArr2[iT] = this.f39026n;
    }

    private void s1(String str) throws IOException {
        if (this.f39029q >= this.f39030r) {
            h1();
        }
        char[] cArr = this.f39027o;
        int i10 = this.f39029q;
        this.f39029q = i10 + 1;
        cArr[i10] = this.f39026n;
        N0(str);
        if (this.f39029q >= this.f39030r) {
            h1();
        }
        char[] cArr2 = this.f39027o;
        int i11 = this.f39029q;
        this.f39029q = i11 + 1;
        cArr2[i11] = this.f39026n;
    }

    private void t1(int i10) throws IOException {
        char[] cArr;
        char c10;
        int[] iArr = this.f38969h;
        int length = iArr.length;
        int i11 = 0;
        int iI1 = 0;
        while (i11 < i10) {
            do {
                cArr = this.f39027o;
                c10 = cArr[i11];
                if (c10 < length && iArr[c10] != 0) {
                    break;
                } else {
                    i11++;
                }
            } while (i11 < i10);
            int i12 = i11 - iI1;
            if (i12 > 0) {
                this.f39025m.write(cArr, iI1, i12);
                if (i11 >= i10) {
                    return;
                }
            }
            int i13 = i11 + 1;
            iI1 = i1(this.f39027o, i13, i10, c10, iArr[c10]);
            i11 = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e A[PHI: r4
      0x001e: PHI (r4v7 int) = (r4v2 int), (r4v8 int) binds: [B:9:0x001a, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    private void u1(int i10, int i11) throws IOException {
        char[] cArr;
        char c10;
        int[] iArr = this.f38969h;
        int iMin = Math.min(iArr.length, i11 + 1);
        int i12 = 0;
        int iI1 = 0;
        int i13 = 0;
        while (i12 < i10) {
            do {
                cArr = this.f39027o;
                c10 = cArr[i12];
                if (c10 < iMin) {
                    i13 = iArr[c10];
                    if (i13 != 0) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    if (c10 > i11) {
                        i13 = -1;
                        break;
                    }
                    i12++;
                }
            } while (i12 < i10);
            int i14 = i13;
            int i15 = i12 - iI1;
            if (i15 > 0) {
                this.f39025m.write(cArr, iI1, i15);
                if (i12 >= i10) {
                    return;
                }
            }
            int i16 = i12 + 1;
            iI1 = i1(this.f39027o, i16, i10, c10, i14);
            i12 = i16;
            i13 = i14;
        }
    }

    private void v1(String str) throws IOException {
        int length = str.length();
        int i10 = this.f39030r;
        if (length > i10) {
            n1(str);
            return;
        }
        if (this.f39029q + length > i10) {
            h1();
        }
        str.getChars(0, length, this.f39027o, this.f39029q);
        int i11 = this.f38970i;
        if (i11 != 0) {
            x1(length, i11);
        } else {
            w1(length);
        }
    }

    private void w1(int i10) throws IOException {
        int i11;
        int i12 = this.f39029q + i10;
        int[] iArr = this.f38969h;
        int length = iArr.length;
        while (this.f39029q < i12) {
            do {
                char[] cArr = this.f39027o;
                int i13 = this.f39029q;
                char c10 = cArr[i13];
                if (c10 >= length || iArr[c10] == 0) {
                    i11 = i13 + 1;
                    this.f39029q = i11;
                } else {
                    int i14 = this.f39028p;
                    int i15 = i13 - i14;
                    if (i15 > 0) {
                        this.f39025m.write(cArr, i14, i15);
                    }
                    char[] cArr2 = this.f39027o;
                    int i16 = this.f39029q;
                    this.f39029q = i16 + 1;
                    char c11 = cArr2[i16];
                    j1(c11, iArr[c11]);
                }
            } while (i11 < i12);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:22:0x002a A[SYNTHETIC] */
    private void x1(int i10, int i11) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f39029q + i10;
        int[] iArr = this.f38969h;
        int iMin = Math.min(iArr.length, i11 + 1);
        while (this.f39029q < i16) {
            do {
                char[] cArr = this.f39027o;
                int i17 = this.f39029q;
                char c10 = cArr[i17];
                if (c10 < iMin) {
                    i12 = iArr[c10];
                    if (i12 != 0) {
                        i13 = this.f39028p;
                        i14 = i17 - i13;
                        if (i14 > 0) {
                            this.f39025m.write(cArr, i13, i14);
                        }
                        this.f39029q++;
                        j1(c10, i12);
                    }
                    i15 = i17 + 1;
                    this.f39029q = i15;
                } else {
                    if (c10 > i11) {
                        i12 = -1;
                        i13 = this.f39028p;
                        i14 = i17 - i13;
                        if (i14 > 0) {
                            this.f39025m.write(cArr, i13, i14);
                        }
                        this.f39029q++;
                        j1(c10, i12);
                    }
                    i15 = i17 + 1;
                    this.f39029q = i15;
                }
            } while (i15 < i16);
            return;
        }
    }

    private void y1(String str) throws IOException {
        int i10 = this.f39030r;
        int i11 = this.f39029q;
        int i12 = i10 - i11;
        str.getChars(0, i12, this.f39027o, i11);
        this.f39029q += i12;
        h1();
        int length = str.length() - i12;
        while (true) {
            int i13 = this.f39030r;
            if (length <= i13) {
                str.getChars(i12, i12 + length, this.f39027o, 0);
                this.f39028p = 0;
                this.f39029q = length;
                return;
            } else {
                int i14 = i12 + i13;
                str.getChars(i12, i14, this.f39027o, 0);
                this.f39028p = 0;
                this.f39029q = i13;
                h1();
                length -= i13;
                i12 = i14;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public void F0(char c10) throws IOException {
        if (this.f39029q >= this.f39030r) {
            h1();
        }
        char[] cArr = this.f39027o;
        int i10 = this.f39029q;
        this.f39029q = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // com.fasterxml.jackson.core.c
    public void K0(com.fasterxml.jackson.core.j jVar) throws IOException {
        int iA = jVar.a(this.f39027o, this.f39029q);
        if (iA < 0) {
            N0(jVar.getValue());
        } else {
            this.f39029q += iA;
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public void N0(String str) throws IOException {
        int length = str.length();
        int i10 = this.f39030r - this.f39029q;
        if (i10 == 0) {
            h1();
            i10 = this.f39030r - this.f39029q;
        }
        if (i10 < length) {
            y1(str);
        } else {
            str.getChars(0, length, this.f39027o, this.f39029q);
            this.f39029q += length;
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public void T0(char[] cArr, int i10, int i11) throws IOException {
        if (i11 >= 32) {
            h1();
            this.f39025m.write(cArr, i10, i11);
        } else {
            if (i11 > this.f39030r - this.f39029q) {
                h1();
            }
            System.arraycopy(cArr, i10, this.f39027o, this.f39029q, i11);
            this.f39029q += i11;
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public void U0() throws IOException {
        l1("start an array");
        this.f38339d = this.f38339d.j();
        com.fasterxml.jackson.core.i iVar = this.f16150a;
        if (iVar != null) {
            iVar.k(this);
            return;
        }
        if (this.f39029q >= this.f39030r) {
            h1();
        }
        char[] cArr = this.f39027o;
        int i10 = this.f39029q;
        this.f39029q = i10 + 1;
        cArr[i10] = '[';
    }

    @Override // com.fasterxml.jackson.core.c
    public void V0() throws IOException {
        l1("start an object");
        this.f38339d = this.f38339d.k();
        com.fasterxml.jackson.core.i iVar = this.f16150a;
        if (iVar != null) {
            iVar.a(this);
            return;
        }
        if (this.f39029q >= this.f39030r) {
            h1();
        }
        char[] cArr = this.f39027o;
        int i10 = this.f39029q;
        this.f39029q = i10 + 1;
        cArr[i10] = '{';
    }

    @Override // com.fasterxml.jackson.core.c
    public void W0(String str) throws IOException {
        l1("write a string");
        if (str == null) {
            o1();
            return;
        }
        if (this.f39029q >= this.f39030r) {
            h1();
        }
        char[] cArr = this.f39027o;
        int i10 = this.f39029q;
        this.f39029q = i10 + 1;
        cArr[i10] = this.f39026n;
        v1(str);
        if (this.f39029q >= this.f39030r) {
            h1();
        }
        char[] cArr2 = this.f39027o;
        int i11 = this.f39029q;
        this.f39029q = i11 + 1;
        cArr2[i11] = this.f39026n;
    }

    @Override // com.fasterxml.jackson.core.c
    public void c0(float f10) throws IOException {
        if (this.f38338c || (com.fasterxml.jackson.core.io.f.p(f10) && b1(com.fasterxml.jackson.core.c.a.QUOTE_NON_NUMERIC_NUMBERS))) {
            W0(String.valueOf(f10));
        } else {
            l1("write a number");
            N0(String.valueOf(f10));
        }
    }

    @Override // f8.a, com.fasterxml.jackson.core.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f39027o != null && b1(com.fasterxml.jackson.core.c.a.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                com.fasterxml.jackson.core.f fVarA1 = a1();
                if (!fVarA1.d()) {
                    if (!fVarA1.e()) {
                        break;
                    } else {
                        q();
                    }
                } else {
                    m();
                }
            }
        }
        h1();
        this.f39028p = 0;
        this.f39029q = 0;
        if (this.f39025m != null) {
            if (this.f38968g.l() || b1(com.fasterxml.jackson.core.c.a.AUTO_CLOSE_TARGET)) {
                this.f39025m.close();
            } else if (b1(com.fasterxml.jackson.core.c.a.FLUSH_PASSED_TO_STREAM)) {
                this.f39025m.flush();
            }
        }
        k1();
    }

    @Override // com.fasterxml.jackson.core.c
    public void d0(int i10) throws IOException {
        l1("write a number");
        if (this.f38338c) {
            q1(i10);
            return;
        }
        if (this.f39029q + 11 >= this.f39030r) {
            h1();
        }
        this.f39029q = com.fasterxml.jackson.core.io.f.r(i10, this.f39027o, this.f39029q);
    }

    @Override // com.fasterxml.jackson.core.c, java.io.Flushable
    public void flush() throws IOException {
        h1();
        if (this.f39025m == null || !b1(com.fasterxml.jackson.core.c.a.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.f39025m.flush();
    }

    @Override // com.fasterxml.jackson.core.c
    public void g0(long j10) throws IOException {
        l1("write a number");
        if (this.f38338c) {
            r1(j10);
            return;
        }
        if (this.f39029q + 21 >= this.f39030r) {
            h1();
        }
        this.f39029q = com.fasterxml.jackson.core.io.f.t(j10, this.f39027o, this.f39029q);
    }

    protected void h1() throws IOException {
        int i10 = this.f39029q;
        int i11 = this.f39028p;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this.f39028p = 0;
            this.f39029q = 0;
            this.f39025m.write(this.f39027o, i11, i12);
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public void i0(String str) throws IOException {
        l1("write a number");
        if (this.f38338c) {
            s1(str);
        } else {
            N0(str);
        }
    }

    protected void k1() {
        char[] cArr = this.f39027o;
        if (cArr != null) {
            this.f39027o = null;
            this.f38968g.m(cArr);
        }
        char[] cArr2 = this.f39033u;
        if (cArr2 != null) {
            this.f39033u = null;
            this.f38968g.n(cArr2);
        }
    }

    @Override // com.fasterxml.jackson.core.c
    public void l(boolean z10) throws IOException {
        int i10;
        l1("write a boolean value");
        if (this.f39029q + 5 >= this.f39030r) {
            h1();
        }
        int i11 = this.f39029q;
        char[] cArr = this.f39027o;
        if (z10) {
            cArr[i11] = 't';
            cArr[i11 + 1] = 'r';
            cArr[i11 + 2] = 'u';
            i10 = i11 + 3;
            cArr[i10] = 'e';
        } else {
            cArr[i11] = 'f';
            cArr[i11 + 1] = 'a';
            cArr[i11 + 2] = 'l';
            cArr[i11 + 3] = 's';
            i10 = i11 + 4;
            cArr[i10] = 'e';
        }
        this.f39029q = i10 + 1;
    }

    protected final void l1(String str) throws IOException {
        char c10;
        int iO = this.f38339d.o();
        if (this.f16150a != null) {
            d1(str, iO);
            return;
        }
        if (iO == 1) {
            c10 = ',';
        } else {
            if (iO != 2) {
                if (iO != 3) {
                    if (iO != 5) {
                        return;
                    }
                    c1(str);
                    return;
                } else {
                    com.fasterxml.jackson.core.j jVar = this.f38971j;
                    if (jVar != null) {
                        N0(jVar.getValue());
                        return;
                    }
                    return;
                }
            }
            c10 = ':';
        }
        if (this.f39029q >= this.f39030r) {
            h1();
        }
        char[] cArr = this.f39027o;
        int i10 = this.f39029q;
        this.f39029q = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // com.fasterxml.jackson.core.c
    public void m() throws IOException {
        if (!this.f38339d.d()) {
            c("Current context not Array but " + this.f38339d.g());
        }
        com.fasterxml.jackson.core.i iVar = this.f16150a;
        if (iVar != null) {
            iVar.h(this, this.f38339d.c());
        } else {
            if (this.f39029q >= this.f39030r) {
                h1();
            }
            char[] cArr = this.f39027o;
            int i10 = this.f39029q;
            this.f39029q = i10 + 1;
            cArr[i10] = ']';
        }
        this.f38339d = this.f38339d.i();
    }

    @Override // com.fasterxml.jackson.core.c
    public void m0(BigDecimal bigDecimal) throws IOException {
        l1("write a number");
        if (bigDecimal == null) {
            o1();
        } else if (this.f38338c) {
            s1(X0(bigDecimal));
        } else {
            N0(X0(bigDecimal));
        }
    }

    protected final void m1(String str, boolean z10) throws IOException {
        if (this.f16150a != null) {
            p1(str, z10);
            return;
        }
        if (this.f39029q + 1 >= this.f39030r) {
            h1();
        }
        if (z10) {
            char[] cArr = this.f39027o;
            int i10 = this.f39029q;
            this.f39029q = i10 + 1;
            cArr[i10] = ',';
        }
        if (this.f38972k) {
            v1(str);
            return;
        }
        char[] cArr2 = this.f39027o;
        int i11 = this.f39029q;
        this.f39029q = i11 + 1;
        cArr2[i11] = this.f39026n;
        v1(str);
        if (this.f39029q >= this.f39030r) {
            h1();
        }
        char[] cArr3 = this.f39027o;
        int i12 = this.f39029q;
        this.f39029q = i12 + 1;
        cArr3[i12] = this.f39026n;
    }

    @Override // com.fasterxml.jackson.core.c
    public void p0(BigInteger bigInteger) throws IOException {
        l1("write a number");
        if (bigInteger == null) {
            o1();
        } else if (this.f38338c) {
            s1(bigInteger.toString());
        } else {
            N0(bigInteger.toString());
        }
    }

    protected final void p1(String str, boolean z10) throws IOException {
        if (z10) {
            this.f16150a.g(this);
        } else {
            this.f16150a.d(this);
        }
        if (this.f38972k) {
            v1(str);
            return;
        }
        if (this.f39029q >= this.f39030r) {
            h1();
        }
        char[] cArr = this.f39027o;
        int i10 = this.f39029q;
        this.f39029q = i10 + 1;
        cArr[i10] = this.f39026n;
        v1(str);
        if (this.f39029q >= this.f39030r) {
            h1();
        }
        char[] cArr2 = this.f39027o;
        int i11 = this.f39029q;
        this.f39029q = i11 + 1;
        cArr2[i11] = this.f39026n;
    }

    @Override // com.fasterxml.jackson.core.c
    public void q() throws IOException {
        if (!this.f38339d.e()) {
            c("Current context not Object but " + this.f38339d.g());
        }
        com.fasterxml.jackson.core.i iVar = this.f16150a;
        if (iVar != null) {
            iVar.j(this, this.f38339d.c());
        } else {
            if (this.f39029q >= this.f39030r) {
                h1();
            }
            char[] cArr = this.f39027o;
            int i10 = this.f39029q;
            this.f39029q = i10 + 1;
            cArr[i10] = '}';
        }
        this.f38339d = this.f38339d.i();
    }

    @Override // com.fasterxml.jackson.core.c
    public void r(String str) throws IOException {
        int iN = this.f38339d.n(str);
        if (iN == 4) {
            c("Can not write a field name, expecting a value");
        }
        m1(str, iN == 1);
    }

    @Override // com.fasterxml.jackson.core.c
    public void s() throws IOException {
        l1("write a null");
        o1();
    }

    @Override // com.fasterxml.jackson.core.c
    public void t(double d10) throws IOException {
        if (this.f38338c || (com.fasterxml.jackson.core.io.f.o(d10) && b1(com.fasterxml.jackson.core.c.a.QUOTE_NON_NUMERIC_NUMBERS))) {
            W0(String.valueOf(d10));
        } else {
            l1("write a number");
            N0(String.valueOf(d10));
        }
    }
}
