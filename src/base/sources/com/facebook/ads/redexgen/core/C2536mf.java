package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2536mf extends AbstractC1322Hu {
    public static byte[] A03;
    public static String[] A04 = {"lB4dHhjpy3abWZhQq1wH5EBAR", "ZuPpDuw", "FbPLOQU", "", "U7rP1AfGJoZ3goBfYNThYKT2IP", "TmhX3SF8er8D0wPa9QxyxNkwR", "Alay8YZwXgHUhbAemAZh94CmGu", "aeAWKwor"};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        String[] strArr = A04;
        if (strArr[6].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[6] = "jv2UBL9GlnQlzNWQDlysyfO0pU";
        strArr2[4] = "rlPmYvRzpLfwn1KnxKXQ0LEEGB";
        A03 = new byte[]{-37, 15, -2, 3, 9, -70, 0, 9, 12, 7, -5, 14, -70, 8, 9, 14, -70, 13, 15, 10, 10, 9, 12, 14, -1, -2, -44, -70, -33, -13, -30, -25, -19, -83, -27, -75, -81, -81, -85, -33, -22, -33, -11, -88, -68, -85, -80, -74, 118, -82, 126, 120, 120, 116, -76, -77, -88, -66, 126, -110, -127, -122, -116, 76, -118, -115, 81, 126, 74, -119, 126, -111, -118, -72, -52, -69, -64, -58, -122, -60, -57, -68, -66};
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C2536mf(InterfaceC1305Hd interfaceC1305Hd) {
        super(interfaceC1305Hd);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322Hu
    public final boolean A0B(C10054v c10054v) throws C2532mb {
        if (!this.A02) {
            int iA0I = c10054v.A0I();
            int header = iA0I >> 4;
            this.A00 = header & 15;
            if (this.A00 == 2) {
                int header2 = iA0I >> 2;
                super.A00.A6e(new C09492p().A11(A00(73, 10, 58)).A0b(1).A0m(A05[header2 & 3]).A14());
                this.A01 = true;
            } else if (this.A00 == 7 || this.A00 == 8) {
                super.A00.A6e(new C09492p().A11(this.A00 == 7 ? A00(28, 15, 97) : A00(43, 15, 42)).A0b(1).A0m(8000).A14());
                this.A01 = true;
            } else if (this.A00 != 10) {
                throw new C2532mb(A00(0, 28, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE) + this.A00);
            }
            this.A02 = true;
        } else {
            c10054v.A0g(1);
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322Hu
    public final boolean A0C(C10054v c10054v, long j10) throws C3K {
        if (this.A00 == 2) {
            int iA07 = c10054v.A07();
            super.A00.AIr(c10054v, iA07);
            super.A00.AIu(j10, 1, iA07, 0, null);
            return true;
        }
        int iA0I = c10054v.A0I();
        if (iA0I == 0 && !this.A01) {
            int packetType = c10054v.A07();
            byte[] bArr = new byte[packetType];
            int packetType2 = bArr.length;
            c10054v.A0k(bArr, 0, packetType2);
            C1288Gm c1288GmA03 = AbstractC1289Gn.A03(bArr);
            C09492p c09492pA0w = new C09492p().A11(A00(58, 15, 0)).A0w(c1288GmA03.A02);
            int packetType3 = c1288GmA03.A00;
            C09492p c09492pA0b = c09492pA0w.A0b(packetType3);
            int packetType4 = c1288GmA03.A01;
            super.A00.A6e(c09492pA0b.A0m(packetType4).A12(Collections.singletonList(bArr)).A14());
            this.A01 = true;
            return false;
        }
        if (this.A00 == 10 && iA0I != 1) {
            return false;
        }
        int iA08 = c10054v.A07();
        super.A00.AIr(c10054v, iA08);
        super.A00.AIu(j10, 1, iA08, 0, null);
        return true;
    }
}
