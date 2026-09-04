package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2461lG implements InterfaceC1400Kv {
    public static String[] A0C = {"sfI6nyeMmjCQTVuCF4qtLy1yjQ", "oMMkuqn3AEHt3nTJ2MOQ2D2uSIMoL5hR", "njiJ7f0cFz7yvYhslZfI3p6AsrETAKAq", "CO", "QYzjeJ7DBautBSe7mq0LOiDdFPwmAbmn", "JPkUATb4vKYtG67zqSLtKl3hIns3qHla", "LddklOggznimrifNDzyDRJC2bK2Jwwl3", "KQOf5F07mNCBpldsJ3B6cw89YczO0oD4"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public InterfaceC1305Hd A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final C10054v A09;
    public final HN A0A;
    public final String A0B;

    public C2461lG() {
        this(null);
    }

    public C2461lG(String str) {
        this.A02 = 0;
        this.A09 = new C10054v(4);
        this.A09.A0l()[0] = -1;
        this.A0A = new HN();
        this.A04 = C.TIME_UNSET;
        this.A0B = str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    private void A00(C10054v c10054v) {
        boolean z10;
        byte[] bArrA0l = c10054v.A0l();
        int iA0A = c10054v.A0A();
        for (int iA09 = c10054v.A09(); iA09 < iA0A; iA09++) {
            int startOffset = bArrA0l[iA09];
            boolean z11 = (startOffset & 255) == 255;
            if (this.A08) {
                int startOffset2 = bArrA0l[iA09];
                if ((startOffset2 & 224) == 224) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            this.A08 = z11;
            String[] strArr = A0C;
            String str = strArr[1];
            String str2 = strArr[4];
            int startOffset3 = str.charAt(11);
            if (startOffset3 != str2.charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "cXytat7P8iKtLP6TqIlLVzlvPDaZG4kX";
            strArr2[4] = "jOC7bwxKPNAtckDXCFNPXzZbhL30f8uL";
            if (z10) {
                c10054v.A0f(iA09 + 1);
                this.A08 = false;
                this.A09.A0l()[1] = bArrA0l[iA09];
                this.A00 = 2;
                this.A02 = 1;
                return;
            }
        }
        c10054v.A0f(iA0A);
    }

    @RequiresNonNull({"output"})
    private void A01(C10054v c10054v) {
        int iMin = Math.min(c10054v.A07(), this.A01 - this.A00);
        this.A05.AIr(c10054v, iMin);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + iMin;
        int i10 = this.A00;
        int bytesToRead2 = this.A01;
        if (i10 < bytesToRead2) {
            return;
        }
        if (this.A04 != C.TIME_UNSET) {
            InterfaceC1305Hd interfaceC1305Hd = this.A05;
            String[] strArr = A0C;
            String str = strArr[5];
            String str2 = strArr[6];
            int iCharAt = str.charAt(20);
            int bytesToRead3 = str2.charAt(20);
            if (iCharAt == bytesToRead3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[2] = "FJBco80YTxCtRjQ9gQqQy4qETqBIMl0G";
            strArr2[7] = "R9O1kZ0wfg8ZyFlwYf0hmCttc3ths7ud";
            interfaceC1305Hd.AIu(this.A04, 1, this.A01, 0, null);
            this.A04 += this.A03;
        }
        this.A00 = 0;
        this.A02 = 0;
    }

    @RequiresNonNull({"output"})
    private void A02(C10054v c10054v) {
        int iMin = Math.min(c10054v.A07(), 4 - this.A00);
        byte[] bArrA0l = this.A09.A0l();
        int bytesToRead = this.A00;
        c10054v.A0k(bArrA0l, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        if (bytesToRead3 < 4) {
            return;
        }
        this.A09.A0f(0);
        HN hn2 = this.A0A;
        int bytesToRead4 = this.A09.A0C();
        if (!hn2.A00(bytesToRead4)) {
            this.A00 = 0;
            this.A02 = 1;
            return;
        }
        int bytesToRead5 = this.A0A.A02;
        this.A01 = bytesToRead5;
        if (!this.A07) {
            int bytesToRead6 = this.A0A.A04;
            long j10 = ((long) bytesToRead6) * 1000000;
            int bytesToRead7 = this.A0A.A03;
            this.A03 = j10 / ((long) bytesToRead7);
            C09492p c09492pA0h = new C09492p().A0y(this.A06).A11(this.A0A.A06).A0h(4096);
            int bytesToRead8 = this.A0A.A01;
            C09492p c09492pA0b = c09492pA0h.A0b(bytesToRead8);
            int bytesToRead9 = this.A0A.A03;
            this.A05.A6e(c09492pA0b.A0m(bytesToRead9).A10(this.A0B).A14());
            this.A07 = true;
        }
        this.A09.A0f(0);
        this.A05.AIr(this.A09, 4);
        this.A02 = 2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void A5A(C10054v c10054v) {
        AbstractC09823y.A02(this.A05);
        while (c10054v.A07() > 0) {
            switch (this.A02) {
                case 0:
                    A00(c10054v);
                    break;
                case 1:
                    A02(c10054v);
                    break;
                case 2:
                    A01(c10054v);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void A5c(HA ha2, LG lg2) {
        lg2.A05();
        this.A06 = lg2.A04();
        this.A05 = ha2.AKS(lg2.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void AGq(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.A04 = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1400Kv
    public final void AJ5() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A04 = C.TIME_UNSET;
    }
}
