package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1679Vw extends N2 {
    public static byte[] A01;
    public final /* synthetic */ UK A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, 127, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, 127, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, 127, 98, 63};
    }

    public C1679Vw(UK uk2) {
        this.A00 = uk2;
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0B(C2380ju c2380ju) {
        this.A00.A1d(c2380ju);
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0C() {
        if (this.A00.A0I != null) {
            this.A00.A0I.ACm();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0F(N1 n10) {
        if (this.A00.A0B != null) {
            this.A00.A0B.A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0G(C1670Vm c1670Vm) {
        this.A00.A16().A0F().A3N(Y1.A01(this.A00.A00), c1670Vm.A03().getErrorCode(), c1670Vm.A04());
        if (this.A00.A0I != null) {
            this.A00.A0I.ADp(c1670Vm);
        }
    }
}
