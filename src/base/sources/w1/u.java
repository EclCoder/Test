package w1;

import com.google.common.collect.g0;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f55841d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f55842e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g0 f55843f = g0.D(sc.e.f52292a, sc.e.f52294c, sc.e.f52297f, sc.e.f52295d, sc.e.f52296e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f55844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f55845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55846c;

    public u() {
        this.f55844a = c0.f55774f;
    }

    private void V(Charset charset) {
        if (m(charset, f55841d) == '\r') {
            m(charset, f55842e);
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
        int i11 = this.f55845b;
        while (true) {
            int i12 = this.f55846c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((!charset.equals(sc.e.f52294c) && !charset.equals(sc.e.f52292a)) || !c0.y0(this.f55844a[i11])) {
                if (charset.equals(sc.e.f52297f) || charset.equals(sc.e.f52295d)) {
                    byte[] bArr2 = this.f55844a;
                    if (bArr2[i11] != 0 || !c0.y0(bArr2[i11 + 1])) {
                        if (charset.equals(sc.e.f52296e)) {
                            bArr = this.f55844a;
                            if (bArr[i11 + 1] != 0 || !c0.y0(bArr[i11])) {
                            }
                        }
                        i11 += i10;
                    }
                } else {
                    if (charset.equals(sc.e.f52296e)) {
                        bArr = this.f55844a;
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
            bA = (byte) com.google.common.primitives.c.a(com.google.common.primitives.j.b(this.f55844a[this.f55845b]));
        } else {
            if ((charset.equals(sc.e.f52297f) || charset.equals(sc.e.f52295d)) && a() >= 2) {
                byte[] bArr = this.f55844a;
                int i11 = this.f55845b;
                c10 = com.google.common.primitives.c.c(bArr[i11], bArr[i11 + 1]);
            } else {
                if (!charset.equals(sc.e.f52296e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f55844a;
                int i12 = this.f55845b;
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
        this.f55845b += i10 & 65535;
        return c10;
    }

    public String A() {
        return n((char) 0);
    }

    public String B(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f55845b;
        int i12 = (i11 + i10) - 1;
        String strH = c0.H(this.f55844a, i11, (i12 >= this.f55846c || this.f55844a[i12] != 0) ? i10 : i10 - 1);
        this.f55845b += i10;
        return strH;
    }

    public short C() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f55845b = i10 + 2;
        return (short) ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12);
    }

    public String D(int i10) {
        return E(i10, sc.e.f52294c);
    }

    public String E(int i10, Charset charset) {
        String str = new String(this.f55844a, this.f55845b, i10, charset);
        this.f55845b += i10;
        return str;
    }

    public int F() {
        return (G() << 21) | (G() << 14) | (G() << 7) | G();
    }

    public int G() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        this.f55845b = i10 + 1;
        return bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public int H() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f55845b = i10 + 2;
        int i13 = (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12;
        this.f55845b = i10 + 4;
        return i13;
    }

    public long I() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f55845b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f55845b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f55845b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public int J() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        int i13 = i10 + 2;
        this.f55845b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f55845b = i10 + 3;
        return (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i14;
    }

    public int K() {
        int iP = p();
        if (iP >= 0) {
            return iP;
        }
        throw new IllegalStateException("Top bit not zero: " + iP);
    }

    public long L() {
        long jZ = z();
        if (jZ >= 0) {
            return jZ;
        }
        throw new IllegalStateException("Top bit not zero: " + jZ);
    }

    public int M() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f55845b = i10 + 2;
        return (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i12;
    }

    public long N() {
        int i10;
        int i11;
        long j10 = this.f55844a[this.f55845b];
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
            byte b10 = this.f55844a[this.f55845b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f55845b += i11;
        return j10;
    }

    public Charset O() {
        if (a() >= 3) {
            byte[] bArr = this.f55844a;
            int i10 = this.f55845b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f55845b = i10 + 3;
                return sc.e.f52294c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f55844a;
        int i11 = this.f55845b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f55845b = i11 + 2;
            return sc.e.f52295d;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f55845b = i11 + 2;
        return sc.e.f52296e;
    }

    public void P(int i10) {
        R(b() < i10 ? new byte[i10] : this.f55844a, i10);
    }

    public void Q(byte[] bArr) {
        R(bArr, bArr.length);
    }

    public void R(byte[] bArr, int i10) {
        this.f55844a = bArr;
        this.f55846c = i10;
        this.f55845b = 0;
    }

    public void S(int i10) {
        a.a(i10 >= 0 && i10 <= this.f55844a.length);
        this.f55846c = i10;
    }

    public void T(int i10) {
        a.a(i10 >= 0 && i10 <= this.f55846c);
        this.f55845b = i10;
    }

    public void U(int i10) {
        T(this.f55845b + i10);
    }

    public int a() {
        return this.f55846c - this.f55845b;
    }

    public int b() {
        return this.f55844a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f55844a = Arrays.copyOf(this.f55844a, i10);
        }
    }

    public byte[] e() {
        return this.f55844a;
    }

    public int f() {
        return this.f55845b;
    }

    public int g() {
        return this.f55846c;
    }

    public char h(Charset charset) {
        a.b(f55843f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.f55844a[this.f55845b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public void k(t tVar, int i10) {
        l(tVar.f55837a, 0, i10);
        tVar.p(0);
    }

    public void l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f55844a, this.f55845b, bArr, i10, i11);
        this.f55845b += i11;
    }

    public String n(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f55845b;
        while (i10 < this.f55846c && this.f55844a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f55844a;
        int i11 = this.f55845b;
        String strH = c0.H(bArr, i11, i10 - i11);
        this.f55845b = i10;
        if (i10 < this.f55846c) {
            this.f55845b = i10 + 1;
        }
        return strH;
    }

    public double o() {
        return Double.longBitsToDouble(z());
    }

    public int p() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        int i12 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        int i13 = i10 + 2;
        this.f55845b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i12;
        int i15 = i10 + 3;
        this.f55845b = i15;
        int i16 = i14 | ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f55845b = i10 + 4;
        return (bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i16;
    }

    public int q() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        int i12 = ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
        int i13 = i10 + 2;
        this.f55845b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        this.f55845b = i10 + 3;
        return (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i14;
    }

    public String r() {
        return s(sc.e.f52294c);
    }

    public String s(Charset charset) {
        a.b(f55843f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(sc.e.f52292a)) {
            O();
        }
        String strE = E(d(charset) - this.f55845b, charset);
        if (this.f55845b == this.f55846c) {
            return strE;
        }
        V(charset);
        return strE;
    }

    public int t() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i10 + 2;
        this.f55845b = i13;
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
        int i15 = i10 + 3;
        this.f55845b = i15;
        int i16 = i14 | ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f55845b = i10 + 4;
        return ((bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i16;
    }

    public long u() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f55845b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f55845b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f55845b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f55845b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f55845b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f55845b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f55845b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public short v() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f55845b = i10 + 2;
        return (short) (((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12);
    }

    public long w() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f55845b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f55845b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f55845b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public int x() {
        int iT = t();
        if (iT >= 0) {
            return iT;
        }
        throw new IllegalStateException("Top bit not zero: " + iT);
    }

    public int y() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f55845b = i10 + 2;
        return ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
    }

    public long z() {
        byte[] bArr = this.f55844a;
        int i10 = this.f55845b;
        int i11 = i10 + 1;
        this.f55845b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f55845b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f55845b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f55845b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f55845b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f55845b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f55845b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f55845b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public u(int i10) {
        this.f55844a = new byte[i10];
        this.f55846c = i10;
    }

    public u(byte[] bArr) {
        this.f55844a = bArr;
        this.f55846c = bArr.length;
    }

    public u(byte[] bArr, int i10) {
        this.f55844a = bArr;
        this.f55846c = i10;
    }
}
