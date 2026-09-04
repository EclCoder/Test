package x1;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f56618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f56619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f56620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f56621d;

    public e(byte[] bArr, int i10, int i11) {
        i(bArr, i10, i11);
    }

    private void a() {
        int i10;
        int i11 = this.f56620c;
        w1.a.g(i11 >= 0 && (i11 < (i10 = this.f56619b) || (i11 == i10 && this.f56621d == 0)));
    }

    private int f() {
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? e(i10) : 0);
    }

    private boolean j(int i10) {
        if (2 > i10 || i10 >= this.f56619b) {
            return false;
        }
        byte[] bArr = this.f56618a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public boolean b(int i10) {
        int i11 = this.f56620c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f56621d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f56619b) {
                break;
            }
            if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f56619b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean c() {
        int i10 = this.f56620c;
        int i11 = this.f56621d;
        int i12 = 0;
        while (this.f56620c < this.f56619b && !d()) {
            i12++;
        }
        boolean z10 = this.f56620c == this.f56619b;
        this.f56620c = i10;
        this.f56621d = i11;
        return !z10 && b((i12 * 2) + 1);
    }

    public boolean d() {
        boolean z10 = (this.f56618a[this.f56620c] & (128 >> this.f56621d)) != 0;
        k();
        return z10;
    }

    public int e(int i10) {
        int i11;
        this.f56621d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f56621d;
            int i13 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f56621d = i14;
            byte[] bArr = this.f56618a;
            int i15 = this.f56620c;
            i12 |= (bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i14;
            if (!j(i15 + 1)) {
                i13 = 1;
            }
            this.f56620c = i15 + i13;
        }
        byte[] bArr2 = this.f56618a;
        int i16 = this.f56620c;
        int i17 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i16] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i11)));
        if (i11 == 8) {
            this.f56621d = 0;
            this.f56620c = i16 + (j(i16 + 1) ? 2 : 1);
        }
        a();
        return i17;
    }

    public int g() {
        int iF = f();
        return (iF % 2 == 0 ? -1 : 1) * ((iF + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i10, int i11) {
        this.f56618a = bArr;
        this.f56620c = i10;
        this.f56619b = i11;
        this.f56621d = 0;
        a();
    }

    public void k() {
        int i10 = this.f56621d + 1;
        this.f56621d = i10;
        if (i10 == 8) {
            this.f56621d = 0;
            int i11 = this.f56620c;
            this.f56620c = i11 + (j(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int i10) {
        int i11 = this.f56620c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f56620c = i13;
        int i14 = this.f56621d + (i10 - (i12 * 8));
        this.f56621d = i14;
        if (i14 > 7) {
            this.f56620c = i13 + 1;
            this.f56621d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f56620c) {
                a();
                return;
            } else if (j(i11)) {
                this.f56620c++;
                i11 += 2;
            }
        }
    }
}
