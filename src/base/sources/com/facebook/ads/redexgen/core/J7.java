package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class J7 {
    public static String[] A0A = {"EJzHBf6C0sknf46Vq1Osr72lZWU", "EzVPMe4nRAbvxSng0PXVwtyqLeoR1KIv", "OkBxNGbCc3SGP6NNAhHfxcRtiUQBpmsu", "1fihPQnAv3tt3xF1xxV2XjfJNe5jiXUE", "EaQIZLU4UTAcxpaH6Zb3hTUPzu", "nXVDjS3P8WK4na35on8K5ox1mEuGJ9Tn", "34qesDVsFPLU35m5e8V9GlfuLx1oAXXP", "IwUkif7926Fg"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public J1 A04;
    public JO A05;
    public final InterfaceC1305Hd A06;
    public final JQ A07 = new JQ();
    public final C10054v A09 = new C10054v(1);
    public final C10054v A08 = new C10054v();

    public J7(InterfaceC1305Hd interfaceC1305Hd) {
        this.A06 = interfaceC1305Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JP A00() {
        JP encryptionBox;
        int i10 = this.A07.A06.A02;
        if (this.A07.A07 != null) {
            encryptionBox = this.A07.A07;
        } else {
            encryptionBox = this.A05.A00(i10);
        }
        if (encryptionBox == null || !encryptionBox.A03) {
            return null;
        }
        return encryptionBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        JP jpA00 = A00();
        if (jpA00 == null) {
            return;
        }
        C10054v c10054v = this.A07.A0H;
        if (jpA00.A00 != 0) {
            c10054v.A0g(jpA00.A00);
        }
        if (this.A07.A06(this.A01)) {
            c10054v.A0g(c10054v.A0M() * 6);
        }
    }

    public final int A04() {
        C10054v c10054v;
        int vectorSize;
        JP jpA00 = A00();
        if (jpA00 == null) {
            return 0;
        }
        if (jpA00.A00 != 0) {
            c10054v = this.A07.A0H;
            vectorSize = jpA00.A00;
        } else {
            byte[] initVectorData = jpA00.A04;
            this.A08.A0j(initVectorData, initVectorData.length);
            c10054v = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean zA06 = this.A07.A06(this.A01);
        this.A09.A00[0] = (byte) ((zA06 ? 128 : 0) | vectorSize);
        this.A09.A0f(0);
        InterfaceC1305Hd interfaceC1305Hd = this.A06;
        C10054v initializationVectorData = this.A09;
        interfaceC1305Hd.AIr(initializationVectorData, 1);
        this.A06.AIr(c10054v, vectorSize);
        if (!zA06) {
            int vectorSize2 = vectorSize + 1;
            if (A0A[2].charAt(9) == '1') {
                throw new RuntimeException();
            }
            A0A[3] = "cKav7mEAu9tQ2Y9RA5SJHOCCBpQ48rqR";
            return vectorSize2;
        }
        C10054v c10054v2 = this.A07.A0H;
        int iA0M = c10054v2.A0M();
        c10054v2.A0g(-2);
        int i10 = (iA0M * 6) + 2;
        this.A06.AIr(c10054v2, i10);
        return vectorSize + 1 + i10;
    }

    public final void A05() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A06(long j10) {
        for (int i10 = this.A01; i10 < searchIndex && this.A07.A00(i10) < j10; i10++) {
            if (this.A07.A0G[i10]) {
                this.A03 = i10;
            }
        }
    }

    public final void A07(DrmInitData drmInitData) {
        JP encryptionBox = this.A05.A00(this.A07.A06.A02);
        this.A06.A6e(this.A05.A07.A09(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A08(JO jo2, J1 j10) {
        this.A05 = (JO) AbstractC09823y.A01(jo2);
        this.A04 = (J1) AbstractC09823y.A01(j10);
        this.A06.A6e(jo2.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        if (this.A00 != this.A07.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
