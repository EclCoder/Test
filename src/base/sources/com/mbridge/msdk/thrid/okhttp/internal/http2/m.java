package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f33424b = new int[10];

    void a() {
        this.f33423a = 0;
        Arrays.fill(this.f33424b, 0);
    }

    int b() {
        if ((this.f33423a & 2) != 0) {
            return this.f33424b[1];
        }
        return -1;
    }

    int c(int i10) {
        return (this.f33423a & 32) != 0 ? this.f33424b[5] : i10;
    }

    boolean d(int i10) {
        return ((1 << i10) & this.f33423a) != 0;
    }

    int b(int i10) {
        return (this.f33423a & 16) != 0 ? this.f33424b[4] : i10;
    }

    int c() {
        if ((this.f33423a & 128) != 0) {
            return this.f33424b[7];
        }
        return 65535;
    }

    int d() {
        return Integer.bitCount(this.f33423a);
    }

    m a(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f33424b;
            if (i10 < iArr.length) {
                this.f33423a = (1 << i10) | this.f33423a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    int a(int i10) {
        return this.f33424b[i10];
    }

    void a(m mVar) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.d(i10)) {
                a(i10, mVar.a(i10));
            }
        }
    }
}
