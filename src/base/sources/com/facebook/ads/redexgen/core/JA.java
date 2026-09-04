package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class JA {
    public static String[] A0C = {"uuzqWXLhVU5h", "MCiAyNDofRMgV8twnC7AiCrYM6kNh0jg", "HJXujHHcElJRTDtcfeo3Sy7Hv18RGZgy", "Amjr7hMXQx0e32VF8yWASHBDx37PervK", "NgKcffCH0RNam7yPBBIvJezNpINfNkiL", "oMs9elp", "apSAFH841DSL3paVepKSIoWcAWyBkdVZ", "h51QMR"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public J1 A04;
    public JR A05;
    public boolean A06;
    public final InterfaceC1305Hd A08;
    public final JQ A09 = new JQ();
    public final C10054v A07 = new C10054v();
    public final C10054v A0B = new C10054v(1);
    public final C10054v A0A = new C10054v();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final int A04(int i10, int i11) {
        C10054v c10054v;
        int length;
        JP jpA07 = A07();
        if (jpA07 == null) {
            return 0;
        }
        if (jpA07.A00 != 0) {
            c10054v = this.A09.A0H;
            length = jpA07.A00;
        } else {
            byte[] bArr = (byte[]) C5C.A0f(jpA07.A04);
            this.A0A.A0j(bArr, bArr.length);
            c10054v = this.A0A;
            length = bArr.length;
        }
        boolean zA06 = this.A09.A06(this.A01);
        boolean z10 = zA06 || i11 != 0;
        this.A0B.A0l()[0] = (byte) ((z10 ? 128 : 0) | length);
        this.A0B.A0f(0);
        this.A08.AIs(this.A0B, 1, 1);
        this.A08.AIs(c10054v, length, 1);
        if (!z10) {
            return length + 1;
        }
        if (!zA06) {
            this.A07.A0d(8);
            byte[] bArrA0l = this.A07.A0l();
            bArrA0l[0] = 0;
            bArrA0l[1] = 1;
            bArrA0l[2] = (byte) ((i11 >> 8) & 255);
            bArrA0l[3] = (byte) (i11 & 255);
            bArrA0l[4] = (byte) ((i10 >> 24) & 255);
            bArrA0l[5] = (byte) ((i10 >> 16) & 255);
            bArrA0l[6] = (byte) ((i10 >> 8) & 255);
            bArrA0l[7] = (byte) (i10 & 255);
            this.A08.AIs(this.A07, 8, 1);
            return length + 1 + 8;
        }
        C10054v c10054v2 = this.A09.A0H;
        int iA0M = c10054v2.A0M();
        c10054v2.A0g(-2);
        int i12 = (iA0M * 6) + 2;
        if (i11 != 0) {
            this.A07.A0d(i12);
            byte[] bArrA0l2 = this.A07.A0l();
            c10054v2.A0k(bArrA0l2, 0, i12);
            int i13 = (((bArrA0l2[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrA0l2[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i11;
            bArrA0l2[2] = (byte) ((i13 >> 8) & 255);
            bArrA0l2[3] = (byte) (i13 & 255);
            c10054v2 = this.A07;
        }
        this.A08.AIs(c10054v2, i12, 1);
        return length + 1 + i12;
    }

    public JA(InterfaceC1305Hd interfaceC1305Hd, JR jr, J1 j10) {
        this.A08 = interfaceC1305Hd;
        this.A05 = jr;
        this.A04 = j10;
        A0C(jr, j10);
    }

    public final int A02() {
        int i10;
        if (!this.A06) {
            i10 = this.A05.A04[this.A01];
        } else {
            boolean[] zArr = this.A09.A0G;
            int flags = this.A01;
            i10 = zArr[flags] ? 1 : 0;
        }
        if (A07() == null) {
            return i10;
        }
        String[] strArr = A0C;
        String str = strArr[3];
        String str2 = strArr[2];
        int iCharAt = str.charAt(20);
        int flags2 = str2.charAt(20);
        if (iCharAt != flags2) {
            throw new RuntimeException();
        }
        A0C[4] = "Hkeae3ogmEOju43arfP4ZrrsYFDfrpvf";
        return i10 | 1073741824;
    }

    public final int A03() {
        if (!this.A06) {
            return this.A05.A05[this.A01];
        }
        return this.A09.A0B[this.A01];
    }

    public final long A05() {
        if (!this.A06) {
            return this.A05.A06[this.A01];
        }
        return this.A09.A0E[this.A02];
    }

    public final long A06() {
        if (!this.A06) {
            return this.A05.A07[this.A01];
        }
        return this.A09.A00(this.A01);
    }

    public final JP A07() {
        JP jpA00;
        if (!this.A06) {
            return null;
        }
        int i10 = ((J1) C5C.A0f(this.A09.A06)).A02;
        if (this.A09.A07 != null) {
            jpA00 = this.A09.A07;
        } else {
            jpA00 = this.A05.A03.A00(i10);
        }
        if (jpA00 == null || !jpA00.A03) {
            return null;
        }
        JP encryptionBox = jpA00;
        return encryptionBox;
    }

    public final void A08() {
        this.A09.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A06 = false;
    }

    public final void A09() {
        JP jpA07 = A07();
        if (jpA07 == null) {
            return;
        }
        C10054v c10054v = this.A09.A0H;
        if (jpA07.A00 != 0) {
            c10054v.A0g(jpA07.A00);
        }
        if (this.A09.A06(this.A01)) {
            c10054v.A0g(c10054v.A0M() * 6);
        }
    }

    public final void A0A(long j10) {
        for (int i10 = this.A01; i10 < searchIndex && this.A09.A00(i10) <= j10; i10++) {
            if (this.A09.A0G[i10]) {
                this.A03 = i10;
            }
        }
    }

    public final void A0B(DrmInitData drmInitData) {
        JP encryptionBox = this.A05.A03.A00(((J1) C5C.A0f(this.A09.A06)).A02);
        this.A08.A6e(this.A05.A03.A07.A07().A0u(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)).A14());
    }

    public final void A0C(JR jr, J1 j10) {
        this.A05 = jr;
        this.A04 = j10;
        this.A08.A6e(jr.A03.A07);
        A08();
    }

    public final boolean A0D() {
        this.A01++;
        if (!this.A06) {
            return false;
        }
        this.A00++;
        if (this.A00 != this.A09.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
