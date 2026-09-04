package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class L9 {
    public static byte[] A02;
    public final List<C2758qI> A00;
    public final InterfaceC1305Hd[] A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{119, -100, -92, -113, -102, -105, -110, 78, -111, -102, -99, -95, -109, -110, 78, -111, -113, -98, -94, -105, -99, -100, 78, -101, -105, -101, -109, 78, -94, -89, -98, -109, 78, -98, -96, -99, -92, -105, -110, -109, -110, 104, 78, -123, -108, -108, -112, -115, -121, -123, -104, -115, -109, -110, 83, -121, -119, -123, 81, 90, 84, 92, -49, -34, -34, -38, -41, -47, -49, -30, -41, -35, -36, -99, -47, -45, -49, -101, -91, -98, -90};
    }

    public L9(List<C2758qI> list) {
        this.A00 = list;
        this.A01 = new InterfaceC1305Hd[list.size()];
    }

    public final void A02(long j10, C10054v c10054v) {
        H3.A03(j10, c10054v, this.A01);
    }

    public final void A03(HA ha2, LG lg2) {
        for (int i10 = 0; i10 < i; i10++) {
            lg2.A05();
            InterfaceC1305Hd interfaceC1305HdAKS = ha2.AKS(lg2.A03(), 3);
            C2758qI c2758qI = this.A00.get(i10);
            String str = c2758qI.A0W;
            AbstractC09823y.A09(A00(43, 19, 7).equals(str) || A00(62, 19, 81).equals(str), A00(0, 43, 17) + str);
            C09492p c09492pA11 = new C09492p().A0y(c2758qI.A0T != null ? c2758qI.A0T : lg2.A04()).A11(str);
            int i11 = c2758qI.A0H;
            C09492p c09492pA10 = c09492pA11.A0n(i11).A10(c2758qI.A0V);
            int i12 = c2758qI.A03;
            interfaceC1305HdAKS.A6e(c09492pA10.A0Z(i12).A12(c2758qI.A0X).A14());
            this.A01[i10] = interfaceC1305HdAKS;
        }
    }
}
