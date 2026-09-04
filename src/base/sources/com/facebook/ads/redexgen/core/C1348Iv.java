package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1348Iv {
    public static byte[] A09;
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final C10054v A06;
    public final C10054v A07;
    public final boolean A08;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-42, -39, -30, -29, -28, -49, -45, -40, -27, -34, -37, -112, -35, -27, -29, -28, -112, -46, -43, -112, -95};
    }

    public C1348Iv(C10054v c10054v, C10054v c10054v2, boolean z10) throws C3K {
        this.A07 = c10054v;
        this.A06 = c10054v2;
        this.A08 = z10;
        c10054v2.A0f(12);
        this.A05 = c10054v2.A0L();
        c10054v.A0f(12);
        this.A04 = c10054v.A0L();
        HB.A01(c10054v.A0C() == 1, A00(0, 21, 34));
        this.A00 = -1;
    }

    public final boolean A02() {
        long jA0Q;
        int iA0L;
        int i10 = this.A00 + 1;
        this.A00 = i10;
        if (i10 == this.A05) {
            return false;
        }
        if (this.A08) {
            jA0Q = this.A06.A0R();
        } else {
            jA0Q = this.A06.A0Q();
        }
        this.A02 = jA0Q;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0L();
            this.A07.A0g(4);
            int i11 = this.A04 - 1;
            this.A04 = i11;
            if (i11 > 0) {
                iA0L = this.A07.A0L() - 1;
            } else {
                iA0L = -1;
            }
            this.A03 = iA0L;
        }
        return true;
    }
}
