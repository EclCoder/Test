package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1509Pb implements InterfaceC1840au {
    public static byte[] A01;
    public final /* synthetic */ PZ A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -19, -33, -20, -39, -36, -17, -32, -32, -33, -20, -33, -34, -39, -35, -26, -29, -35, -27, -39, -29, -37, -36, -39, -33, -14, -18, -33, -20, -24, -37, -26, -39, -24, -37, -16, -29, -31, -37, -18, -29, -23, -24};
    }

    public C1509Pb(PZ pz) {
        this.A00 = pz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1840au
    public final void ADO() {
        this.A00.A0H();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1840au
    public final void AF0() {
        this.A00.A0I(A00(0, 43, 56));
    }
}
