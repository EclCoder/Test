package com.google.android.exoplayer2.audio;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f16658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f16659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f16660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f16661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f16662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f16663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f16664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f16665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f16667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f16668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f16669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f16670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f16671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f16672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f16674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f16675t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f16676u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f16677v;

    public m(int i10, int i11, float f10, float f11, int i12) {
        this.f16656a = i10;
        this.f16657b = i11;
        this.f16658c = f10;
        this.f16659d = f11;
        this.f16660e = i10 / i12;
        this.f16661f = i10 / 400;
        int i13 = i10 / 65;
        this.f16662g = i13;
        int i14 = i13 * 2;
        this.f16663h = i14;
        this.f16664i = new short[i14];
        this.f16665j = new short[i14 * i11];
        this.f16667l = new short[i14 * i11];
        this.f16669n = new short[i14 * i11];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f16668m == i10) {
            return;
        }
        int i13 = this.f16656a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        o(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f16670o;
            if (i15 >= i16 - 1) {
                u(i16 - 1);
                return;
            }
            while (true) {
                i11 = this.f16671p;
                int i17 = (i11 + 1) * i14;
                i12 = this.f16672q;
                if (i17 <= i12 * i13) {
                    break;
                }
                this.f16667l = f(this.f16667l, this.f16668m, 1);
                int i18 = 0;
                while (true) {
                    int i19 = this.f16657b;
                    if (i18 < i19) {
                        this.f16667l[(this.f16668m * i19) + i18] = n(this.f16669n, (i19 * i15) + i18, i13, i14);
                        i18++;
                    }
                }
                this.f16672q++;
                this.f16668m++;
            }
            int i20 = i11 + 1;
            this.f16671p = i20;
            if (i20 == i13) {
                this.f16671p = 0;
                ob.a.g(i12 == i14);
                this.f16672q = 0;
            }
            i15++;
        }
    }

    private void b(float f10) {
        int iW;
        int i10 = this.f16666k;
        if (i10 < this.f16663h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f16673r > 0) {
                iW = c(i11);
            } else {
                int iG = g(this.f16665j, i11);
                iW = ((double) f10) > 1.0d ? iG + w(this.f16665j, i11, f10, iG) : m(this.f16665j, i11, f10, iG);
            }
            i11 += iW;
        } while (this.f16663h + i11 <= i10);
        v(i11);
    }

    private int c(int i10) {
        int iMin = Math.min(this.f16663h, this.f16673r);
        d(this.f16665j, i10, iMin);
        this.f16673r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f16667l, this.f16668m, i11);
        this.f16667l = sArrF;
        int i12 = this.f16657b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f16668m * i12, i12 * i11);
        this.f16668m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f16663h / i11;
        int i13 = this.f16657b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f16664i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f16657b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f16656a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f16657b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f16661f, this.f16662g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f16664i, 0, this.f16661f / i12, this.f16662g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f16661f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f16662g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f16657b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f16664i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = q(this.f16676u, this.f16677v) ? this.f16674s : iH;
        this.f16675t = this.f16676u;
        this.f16674s = iH;
        return i19;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f16657b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f16676u = i15 / i16;
        this.f16677v = i17 / i14;
        return i16;
    }

    private int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f16673r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f16667l, this.f16668m, i13);
        this.f16667l = sArrF;
        int i14 = this.f16657b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f16668m * i14, i14 * i11);
        p(i12, this.f16657b, this.f16667l, this.f16668m + i11, sArr, i10 + i11, sArr, i10);
        this.f16668m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f16657b];
        int i13 = this.f16672q * i11;
        int i14 = this.f16671p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    private void o(int i10) {
        int i11 = this.f16668m - i10;
        short[] sArrF = f(this.f16669n, this.f16670o, i11);
        this.f16669n = sArrF;
        short[] sArr = this.f16667l;
        int i12 = this.f16657b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f16670o * i12, i12 * i11);
        this.f16668m = i10;
        this.f16670o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f16674s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f16675t * 3;
    }

    private void r() {
        int i10 = this.f16668m;
        float f10 = this.f16658c;
        float f11 = this.f16659d;
        float f12 = f10 / f11;
        float f13 = this.f16660e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f16665j, 0, this.f16666k);
            this.f16666k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f16669n;
        int i11 = this.f16657b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f16670o - i10) * i11);
        this.f16670o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f16666k - i10;
        short[] sArr = this.f16665j;
        int i12 = this.f16657b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f16666k = i11;
    }

    private int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f16673r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] sArrF = f(this.f16667l, this.f16668m, i12);
        this.f16667l = sArrF;
        p(i12, this.f16657b, sArrF, this.f16668m, sArr, i10, sArr, i10 + i11);
        this.f16668m += i12;
        return i12;
    }

    public void i() {
        this.f16666k = 0;
        this.f16668m = 0;
        this.f16670o = 0;
        this.f16671p = 0;
        this.f16672q = 0;
        this.f16673r = 0;
        this.f16674s = 0;
        this.f16675t = 0;
        this.f16676u = 0;
        this.f16677v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f16657b, this.f16668m);
        shortBuffer.put(this.f16667l, 0, this.f16657b * iMin);
        int i10 = this.f16668m - iMin;
        this.f16668m = i10;
        short[] sArr = this.f16667l;
        int i11 = this.f16657b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f16668m * this.f16657b * 2;
    }

    public int l() {
        return this.f16666k * this.f16657b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f16666k;
        float f10 = this.f16658c;
        float f11 = this.f16659d;
        int i12 = this.f16668m + ((int) ((((i11 / (f10 / f11)) + this.f16670o) / (this.f16660e * f11)) + 0.5f));
        this.f16665j = f(this.f16665j, i11, (this.f16663h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f16663h;
            int i14 = this.f16657b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f16665j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f16666k += i10 * 2;
        r();
        if (this.f16668m > i12) {
            this.f16668m = i12;
        }
        this.f16666k = 0;
        this.f16673r = 0;
        this.f16670o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f16657b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f16665j, this.f16666k, i11);
        this.f16665j = sArrF;
        shortBuffer.get(sArrF, this.f16666k * this.f16657b, ((i10 * i11) * 2) / 2);
        this.f16666k += i11;
        r();
    }
}
