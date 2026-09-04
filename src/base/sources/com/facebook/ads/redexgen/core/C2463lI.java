package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2463lI implements InterfaceC1400Kv {
    public static byte[] A06;
    public static String[] A07 = {"fELf", "CRtzdmwc22mVTvWtUEGrb2L89Zsi6Y", "N3iDT79zWT", "QE0dTL1WJBlTTMSZUybObct7Yruejf", "2s0f3KF", "nKh6xiyrNv58iMY1QpFjB2stIkByl4C1", "EQbEmjPFrv4Ln5yY3rHDWiHWauO7RbEC", "22fQYQCo1Sa4pTb3FTlk"};
    public int A00;
    public int A01;
    public InterfaceC1305Hd A03;
    public boolean A04;
    public final C10054v A05 = new C10054v(10);
    public long A02 = C.TIME_UNSET;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-73, -36, -26, -42, -44, -27, -41, -36, -31, -38, -109, -36, -31, -23, -44, -33, -36, -41, -109, -68, -73, -90, -109, -25, -44, -38, -91, -64, -113, -82, -63, -67, -64, -63, -50, -120, -105, -105, -109, -112, -118, -120, -101, -112, -106, -107, 86, -112, -117, 90};
        String[] strArr = A07;
        if (strArr[0].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[0] = "lwVQ";
        strArr2[7] = "W4X85THKeh5ui5hEjPAl";
        A06 = bArr;
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void A5A(C10054v c10054v) {
        AbstractC09823y.A02(this.A03);
        if (!this.A04) {
            return;
        }
        int iA07 = c10054v.A07();
        int bytesAvailable = this.A00;
        if (bytesAvailable < 10) {
            int bytesAvailable2 = this.A00;
            int iMin = Math.min(iA07, 10 - bytesAvailable2);
            byte[] bArrA0l = c10054v.A0l();
            int iA09 = c10054v.A09();
            byte[] bArrA0l2 = this.A05.A0l();
            int bytesAvailable3 = this.A00;
            System.arraycopy(bArrA0l, iA09, bArrA0l2, bytesAvailable3, iMin);
            int bytesAvailable4 = this.A00;
            if (bytesAvailable4 + iMin == 10) {
                this.A05.A0f(0);
                int iA0I = this.A05.A0I();
                String[] strArr = A07;
                String str = strArr[5];
                String str2 = strArr[6];
                int headerBytesAvailable = str.charAt(9);
                int bytesAvailable5 = str2.charAt(9);
                if (headerBytesAvailable != bytesAvailable5) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A07;
                strArr2[3] = "8jY5LvW7YbHaTZ44u3JYImlIbCOMqh";
                strArr2[1] = "1oUslOQnEnplG8ZTymW4i1r8pTNeUj";
                if (73 == iA0I) {
                    int headerBytesAvailable2 = this.A05.A0I();
                    if (68 == headerBytesAvailable2) {
                        int headerBytesAvailable3 = this.A05.A0I();
                        if (51 == headerBytesAvailable3) {
                            this.A05.A0g(3);
                            int bytesAvailable6 = this.A05.A0H();
                            this.A01 = bytesAvailable6 + 10;
                        }
                    }
                }
                AbstractC09904g.A07(A00(26, 9, 89), A00(0, 26, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE));
                this.A04 = false;
                return;
            }
        }
        int headerBytesAvailable4 = this.A01;
        int bytesAvailable7 = this.A00;
        int iMin2 = Math.min(iA07, headerBytesAvailable4 - bytesAvailable7);
        this.A03.AIr(c10054v, iMin2);
        int i10 = this.A00;
        int bytesToWrite = A07[2].length();
        if (bytesToWrite == 7) {
            this.A00 = i10 + iMin2;
        } else {
            A07[2] = "dnD6Rrkwc9mF5nVn4sILdynL2747n3";
            this.A00 = i10 + iMin2;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void A5c(HA ha2, LG lg2) {
        lg2.A05();
        this.A03 = ha2.AKS(lg2.A03(), 5);
        this.A03.A6e(new C09492p().A0y(lg2.A04()).A11(A00(35, 15, 36)).A14());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void AGp() {
        AbstractC09823y.A02(this.A03);
        if (!this.A04 || this.A01 == 0 || this.A00 != this.A01) {
            return;
        }
        if (this.A02 != C.TIME_UNSET) {
            this.A03.AIu(this.A02, 1, this.A01, 0, null);
        }
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void AGq(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.A04 = true;
        if (j10 != C.TIME_UNSET) {
            this.A02 = j10;
        }
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void AJ5() {
        this.A04 = false;
        this.A02 = C.TIME_UNSET;
    }
}
