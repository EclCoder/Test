package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class LJ {
    public static byte[] A02;
    public static String[] A03 = {"5V45xVrzlJXesqnrbjrZeT76qkPwv", "706Txtts1K7q5FoHp33PEv9HaNMSsjAK", "qupHUySH2p9zJgxISfihn0myWA92wmd9", "5DvGIEuDVuIxxSW2dLmZtZYg2a6kN8VU", "n2fidlshYBQzN55WQs4Vi6", "kTscsm2f8c9DflsdA4bvXVbGUagx", "", "mbeoGjxKtAefmgmFA563kx"};
    public final List<C2758qI> A00;
    public final InterfaceC1305Hd[] A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[5].length() == 31) {
                throw new RuntimeException();
            }
            A03[0] = "BUpOOmvQBkZMcHt4Z";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 6);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-114, -77, -69, -90, -79, -82, -87, 101, -88, -79, -76, -72, -86, -87, 101, -88, -90, -75, -71, -82, -76, -77, 101, -78, -82, -78, -86, 101, -71, -66, -75, -86, 101, -75, -73, -76, -69, -82, -87, -86, -87, 127, 101, -38, -23, -23, -27, -30, -36, -38, -19, -30, -24, -25, -88, -36, -34, -38, -90, -81, -87, -79, -116, -101, -101, -105, -108, -114, -116, -97, -108, -102, -103, 90, -114, -112, -116, 88, 98, 91, 99};
    }

    static {
        A01();
    }

    public LJ(List<C2758qI> list) {
        this.A00 = list;
        this.A01 = new InterfaceC1305Hd[list.size()];
    }

    public final void A02(long j10, C10054v c10054v) {
        if (c10054v.A07() < 9) {
            return;
        }
        int userDataIdentifier = c10054v.A0C();
        int iA0C = c10054v.A0C();
        int iA0I = c10054v.A0I();
        if (userDataIdentifier == 434) {
            int userDataIdentifier2 = A03[3].charAt(2);
            if (userDataIdentifier2 != 118) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "5ag0VzOfRdhx9UNauvnxAz";
            strArr[4] = "f0o3UWjxlhBFesYxHlhgg4";
            if (iA0C == 1195456820 && iA0I == 3) {
                H3.A04(j10, c10054v, this.A01);
            }
        }
    }

    public final void A03(HA ha2, LG lg2) {
        for (int i10 = 0; i10 < i; i10++) {
            lg2.A05();
            InterfaceC1305Hd interfaceC1305HdAKS = ha2.AKS(lg2.A03(), 3);
            C2758qI c2758qI = this.A00.get(i10);
            String str = c2758qI.A0W;
            AbstractC09823y.A09(A00(43, 19, Sdk$SDKError.b.INVALID_INDEX_URL_VALUE).equals(str) || A00(62, 19, 37).equals(str), A00(0, 43, 63) + str);
            C09492p c09492pA11 = new C09492p().A0y(lg2.A04()).A11(str);
            int i11 = c2758qI.A0H;
            C09492p c09492pA10 = c09492pA11.A0n(i11).A10(c2758qI.A0V);
            int i12 = c2758qI.A03;
            interfaceC1305HdAKS.A6e(c09492pA10.A0Z(i12).A12(c2758qI.A0X).A14());
            this.A01[i10] = interfaceC1305HdAKS;
        }
    }
}
