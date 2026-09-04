package com.google.android.material.carousel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f19735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f19736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f19737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f19738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f19739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f19740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f19741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f19742h;

    public a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f19735a = i10;
        this.f19736b = h0.a.a(f10, f11, f12);
        this.f19737c = i11;
        this.f19739e = f13;
        this.f19738d = i12;
        this.f19740f = f14;
        this.f19741g = i13;
        d(f15, f11, f12, f14);
        this.f19742h = b(f14);
    }

    private float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    private float b(float f10) {
        if (g()) {
            return Math.abs(f10 - this.f19740f) * this.f19735a;
        }
        return Float.MAX_VALUE;
    }

    public static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f19742h < aVar.f19742h) {
                        if (aVar2.f19742h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    private void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f19737c;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.f19736b;
            this.f19736b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.f19736b;
            this.f19736b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i11 = this.f19737c;
        float f17 = i11 > 0 ? this.f19736b : 0.0f;
        this.f19736b = f17;
        float fA = a(f10, i11, f17, this.f19738d, this.f19741g);
        this.f19740f = fA;
        float f18 = (this.f19736b + fA) / 2.0f;
        this.f19739e = f18;
        int i12 = this.f19738d;
        if (i12 <= 0 || fA == f13) {
            return;
        }
        float f19 = (f13 - fA) * this.f19741g;
        float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
        if (f19 > 0.0f) {
            this.f19739e -= fMin / this.f19738d;
            this.f19740f += fMin / this.f19741g;
        } else {
            this.f19739e += fMin / this.f19738d;
            this.f19740f -= fMin / this.f19741g;
        }
    }

    private float f() {
        return (this.f19740f * this.f19741g) + (this.f19739e * this.f19738d) + (this.f19736b * this.f19737c);
    }

    private boolean g() {
        int i10 = this.f19741g;
        if (i10 <= 0 || this.f19737c <= 0 || this.f19738d <= 0) {
            return i10 <= 0 || this.f19737c <= 0 || this.f19740f > this.f19736b;
        }
        float f10 = this.f19740f;
        float f11 = this.f19739e;
        return f10 > f11 && f11 > this.f19736b;
    }

    int e() {
        return this.f19737c + this.f19738d + this.f19741g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f19735a + ", smallCount=" + this.f19737c + ", smallSize=" + this.f19736b + ", mediumCount=" + this.f19738d + ", mediumSize=" + this.f19739e + ", largeCount=" + this.f19741g + ", largeSize=" + this.f19740f + ", cost=" + this.f19742h + "]";
    }
}
