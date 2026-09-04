package ob;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f48353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48356d;

    public c0() {
        this.f48353a = r0.f48430f;
    }

    private void a() {
        int i10;
        int i11 = this.f48354b;
        a.g(i11 >= 0 && (i11 < (i10 = this.f48356d) || (i11 == i10 && this.f48355c == 0)));
    }

    public int b() {
        return ((this.f48356d - this.f48354b) * 8) - this.f48355c;
    }

    public void c() {
        if (this.f48355c == 0) {
            return;
        }
        this.f48355c = 0;
        this.f48354b++;
        a();
    }

    public int d() {
        a.g(this.f48355c == 0);
        return this.f48354b;
    }

    public int e() {
        return (this.f48354b * 8) + this.f48355c;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int iMin = Math.min(8 - this.f48355c, i11);
        int i12 = this.f48355c;
        int i13 = (8 - i12) - iMin;
        byte[] bArr = this.f48353a;
        int i14 = this.f48354b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - iMin;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f48353a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f48353a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        r(i11);
        a();
    }

    public boolean g() {
        boolean z10 = (this.f48353a[this.f48354b] & (128 >> this.f48355c)) != 0;
        q();
        return z10;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f48355c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f48355c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f48355c = i13;
            byte[] bArr = this.f48353a;
            int i14 = this.f48354b;
            this.f48354b = i14 + 1;
            i12 |= (bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i13;
        }
        byte[] bArr2 = this.f48353a;
        int i15 = this.f48354b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i11)));
        if (i11 == 8) {
            this.f48355c = 0;
            this.f48354b = i15 + 1;
        }
        a();
        return i16;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f48353a;
            int i13 = this.f48354b;
            int i14 = i13 + 1;
            this.f48354b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f48355c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i16));
        bArr[i12] = b12;
        int i17 = this.f48355c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f48353a;
            int i18 = this.f48354b;
            this.f48354b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i17));
            this.f48355c = i17 - 8;
        }
        int i19 = this.f48355c + i16;
        this.f48355c = i19;
        byte[] bArr4 = this.f48353a;
        int i20 = this.f48354b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f48355c = 0;
            this.f48354b = i20 + 1;
        }
        a();
    }

    public long j(int i10) {
        return i10 <= 32 ? r0.h1(h(i10)) : r0.g1(h(i10 - 32), h(32));
    }

    public void k(byte[] bArr, int i10, int i11) {
        a.g(this.f48355c == 0);
        System.arraycopy(this.f48353a, this.f48354b, bArr, i10, i11);
        this.f48354b += i11;
        a();
    }

    public String l(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void m(d0 d0Var) {
        o(d0Var.e(), d0Var.g());
        p(d0Var.f() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i10) {
        this.f48353a = bArr;
        this.f48354b = 0;
        this.f48355c = 0;
        this.f48356d = i10;
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.f48354b = i11;
        this.f48355c = i10 - (i11 * 8);
        a();
    }

    public void q() {
        int i10 = this.f48355c + 1;
        this.f48355c = i10;
        if (i10 == 8) {
            this.f48355c = 0;
            this.f48354b++;
        }
        a();
    }

    public void r(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f48354b + i11;
        this.f48354b = i12;
        int i13 = this.f48355c + (i10 - (i11 * 8));
        this.f48355c = i13;
        if (i13 > 7) {
            this.f48354b = i12 + 1;
            this.f48355c = i13 - 8;
        }
        a();
    }

    public void s(int i10) {
        a.g(this.f48355c == 0);
        this.f48354b += i10;
        a();
    }

    public c0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public c0(byte[] bArr, int i10) {
        this.f48353a = bArr;
        this.f48356d = i10;
    }
}
