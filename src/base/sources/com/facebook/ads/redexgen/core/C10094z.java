package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10094z {
    public static byte[] A02;
    public static final C10094z A03;
    public static final C10094z A04;
    public final int A00;
    public final int A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-28};
    }

    static {
        A01();
        A03 = new C10094z(-1, -1);
        A04 = new C10094z(0, 0);
    }

    public C10094z(int i10, int i11) {
        AbstractC09823y.A07((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.A01 = i10;
        this.A00 = i11;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10094z)) {
            return false;
        }
        C10094z c10094z = (C10094z) obj;
        return this.A01 == c10094z.A01 && this.A00 == c10094z.A00;
    }

    public final int hashCode() {
        return this.A00 ^ ((this.A01 << 16) | (this.A01 >>> 16));
    }

    public final String toString() {
        return this.A01 + A00(0, 1, 44) + this.A00;
    }
}
