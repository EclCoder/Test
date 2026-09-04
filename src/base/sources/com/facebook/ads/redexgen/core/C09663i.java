package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C09663i {
    public static byte[] A04;
    public static final C09663i A05;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-23, -35, 32, 37, 30, 43, 43, 34, 41, 0, 44, 50, 43, 49, -6, 14, 2, 71, 80, 69, 81, 70, 75, 80, 73, 31, -33, 19, 2, 7, 13, -28, 13, 16, 11, -1, 18, -7, 17, -1, 11, 14, 10, 3, -16, -1, 18, 3, -37};
    }

    static {
        A01();
        A05 = new C09663i(-1, -1, -1);
    }

    public C09663i(int i10, int i11, int i12) {
        int iA06;
        this.A03 = i10;
        this.A01 = i11;
        this.A02 = i12;
        if (C5C.A15(i12)) {
            iA06 = C5C.A06(i12, i11);
        } else {
            iA06 = -1;
        }
        this.A00 = iA06;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09663i)) {
            return false;
        }
        C09663i c09663i = (C09663i) obj;
        return this.A03 == c09663i.A03 && this.A01 == c09663i.A01 && this.A02 == c09663i.A02;
    }

    public final int hashCode() {
        return CB.A00(Integer.valueOf(this.A03), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public final String toString() {
        return A00(26, 23, 59) + this.A03 + A00(0, 15, 90) + this.A01 + A00(15, 11, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + this.A02 + ']';
    }
}
