package ob;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f48358d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f48359e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.common.collect.g0 f48360f = com.google.common.collect.g0.D(sc.e.f52292a, sc.e.f52294c, sc.e.f52297f, sc.e.f52295d, sc.e.f52296e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f48361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48363c;

    public d0() {
        this.f48361a = r0.f48430f;
    }

    private void W(Charset charset) {
        if (m(charset, f48358d) == '\r') {
            m(charset, f48359e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[SYNTHETIC] */
    private int d(Charset charset) {
        int i10;
        byte[] bArr;
        if (charset.equals(sc.e.f52294c) || charset.equals(sc.e.f52292a)) {
            i10 = 1;
        } else {
            if (!charset.equals(sc.e.f52297f) && !charset.equals(sc.e.f52296e) && !charset.equals(sc.e.f52295d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f48362b;
        while (true) {
            int i12 = this.f48363c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((!charset.equals(sc.e.f52294c) && !charset.equals(sc.e.f52292a)) || !r0.C0(this.f48361a[i11])) {
                if (charset.equals(sc.e.f52297f) || charset.equals(sc.e.f52295d)) {
                    byte[] bArr2 = this.f48361a;
                    if (bArr2[i11] != 0 || !r0.C0(bArr2[i11 + 1])) {
                        if (charset.equals(sc.e.f52296e)) {
                            bArr = this.f48361a;
                            if (bArr[i11 + 1] != 0 || !r0.C0(bArr[i11])) {
                            }
                        }
                        i11 += i10;
                    }
                } else {
                    if (charset.equals(sc.e.f52296e)) {
                        bArr = this.f48361a;
                        if (bArr[i11 + 1] != 0) {
                            continue;
                        }
                    }
                    i11 += i10;
                }
            }
            return i11;
        }
    }

    private int i(Charset charset) {
        byte bA;
        char c10;
        int i10 = 1;
        if ((charset.equals(sc.e.f52294c) || charset.equals(sc.e.f52292a)) && a() >= 1) {
            bA = (byte) com.google.common.primitives.c.a(com.google.common.primitives.j.b(this.f48361a[this.f48362b]));
        } else {
            if ((charset.equals(sc.e.f52297f) || charset.equals(sc.e.f52295d)) && a() >= 2) {
                byte[] bArr = this.f48361a;
                int i11 = this.f48362b;
                c10 = com.google.common.primitives.c.c(bArr[i11], bArr[i11 + 1]);
            } else {
                if (!charset.equals(sc.e.f52296e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f48361a;
                int i12 = this.f48362b;
                c10 = com.google.common.primitives.c.c(bArr2[i12 + 1], bArr2[i12]);
            }
            bA = (byte) c10;
            i10 = 2;
        }
        return (com.google.common.primitives.c.a(bA) << 16) + i10;
    }

    private char m(Charset charset, char[] cArr) {
        int i10 = i(charset);
        if (i10 == 0) {
            return (char) 0;
        }
        char c10 = (char) (i10 >> 16);
        if (!com.google.common.primitives.c.b(cArr, c10)) {
            return (char) 0;
        }
        this.f48362b += i10 & 65535;
        return c10;
    }

    public long A() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f48362b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f48362b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f48362b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f48362b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f48362b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f48362b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f48362b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public String B() {
        return n((char) 0);
    }

    public String C(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f48362b;
        int i12 = (i11 + i10) - 1;
        String strF = r0.F(this.f48361a, i11, (i12 >= this.f48363c || this.f48361a[i12] != 0) ? i10 : i10 - 1);
        this.f48362b += i10;
        return strF;
    }

    public short D() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f48362b = i10 + 2;
        return (short) ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12);
    }

    public String E(int i10) {
        return F(i10, sc.e.f52294c);
    }

    public String F(int i10, Charset charset) {
        String str = new String(this.f48361a, this.f48362b, i10, charset);
        this.f48362b += i10;
        return str;
    }

    public int G() {
        return (H() << 21) | (H() << 14) | (H() << 7) | H();
    }

    public int H() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        this.f48362b = i10 + 1;
        return bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public int I() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f48362b = i10 + 2;
        int i13 = (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12;
        this.f48362b = i10 + 4;
        return i13;
    }

    public long J() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f48362b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f48362b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f48362b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public int K() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        int i13 = i10 + 2;
        this.f48362b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f48362b = i10 + 3;
        return (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i14;
    }

    public int L() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public long M() {
        long jA = A();
        if (jA >= 0) {
            return jA;
        }
        throw new IllegalStateException("Top bit not zero: " + jA);
    }

    public int N() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f48362b = i10 + 2;
        return (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12;
    }

    public long O() {
        int i10;
        int i11;
        long j10 = this.f48361a[this.f48362b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f48361a[this.f48362b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f48362b += i11;
        return j10;
    }

    public Charset P() {
        if (a() >= 3) {
            byte[] bArr = this.f48361a;
            int i10 = this.f48362b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f48362b = i10 + 3;
                return sc.e.f52294c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f48361a;
        int i11 = this.f48362b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f48362b = i11 + 2;
            return sc.e.f52295d;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f48362b = i11 + 2;
        return sc.e.f52296e;
    }

    public void Q(int i10) {
        S(b() < i10 ? new byte[i10] : this.f48361a, i10);
    }

    public void R(byte[] bArr) {
        S(bArr, bArr.length);
    }

    public void S(byte[] bArr, int i10) {
        this.f48361a = bArr;
        this.f48363c = i10;
        this.f48362b = 0;
    }

    public void T(int i10) {
        a.a(i10 >= 0 && i10 <= this.f48361a.length);
        this.f48363c = i10;
    }

    public void U(int i10) {
        a.a(i10 >= 0 && i10 <= this.f48363c);
        this.f48362b = i10;
    }

    public void V(int i10) {
        U(this.f48362b + i10);
    }

    public int a() {
        return this.f48363c - this.f48362b;
    }

    public int b() {
        return this.f48361a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f48361a = Arrays.copyOf(this.f48361a, i10);
        }
    }

    public byte[] e() {
        return this.f48361a;
    }

    public int f() {
        return this.f48362b;
    }

    public int g() {
        return this.f48363c;
    }

    public char h(Charset charset) {
        a.b(f48360f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.f48361a[this.f48362b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public void k(c0 c0Var, int i10) {
        l(c0Var.f48353a, 0, i10);
        c0Var.p(0);
    }

    public void l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f48361a, this.f48362b, bArr, i10, i11);
        this.f48362b += i11;
    }

    public String n(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f48362b;
        while (i10 < this.f48363c && this.f48361a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f48361a;
        int i11 = this.f48362b;
        String strF = r0.F(bArr, i11, i10 - i11);
        this.f48362b = i10;
        if (i10 < this.f48363c) {
            this.f48362b = i10 + 1;
        }
        return strF;
    }

    public double o() {
        return Double.longBitsToDouble(A());
    }

    public float p() {
        return Float.intBitsToFloat(q());
    }

    public int q() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        int i13 = i10 + 2;
        this.f48362b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i12;
        int i15 = i10 + 3;
        this.f48362b = i15;
        int i16 = i14 | ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f48362b = i10 + 4;
        return (bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i16;
    }

    public int r() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        int i12 = ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
        int i13 = i10 + 2;
        this.f48362b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f48362b = i10 + 3;
        return (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i14;
    }

    public String s() {
        return t(sc.e.f52294c);
    }

    public String t(Charset charset) {
        a.b(f48360f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(sc.e.f52292a)) {
            P();
        }
        String strF = F(d(charset) - this.f48362b, charset);
        if (this.f48362b == this.f48363c) {
            return strF;
        }
        W(charset);
        return strF;
    }

    public int u() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.f48362b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        int i15 = i10 + 3;
        this.f48362b = i15;
        int i16 = i14 | ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f48362b = i10 + 4;
        return ((bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i16;
    }

    public long v() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f48362b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f48362b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f48362b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f48362b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f48362b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f48362b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f48362b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public short w() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f48362b = i10 + 2;
        return (short) (((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12);
    }

    public long x() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f48362b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f48362b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f48362b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public int y() {
        int iU = u();
        if (iU >= 0) {
            return iU;
        }
        throw new IllegalStateException("Top bit not zero: " + iU);
    }

    public int z() {
        byte[] bArr = this.f48361a;
        int i10 = this.f48362b;
        int i11 = i10 + 1;
        this.f48362b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f48362b = i10 + 2;
        return ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
    }

    public d0(int i10) {
        this.f48361a = new byte[i10];
        this.f48363c = i10;
    }

    public d0(byte[] bArr) {
        this.f48361a = bArr;
        this.f48363c = bArr.length;
    }

    public d0(byte[] bArr, int i10) {
        this.f48361a = bArr;
        this.f48363c = i10;
    }
}
