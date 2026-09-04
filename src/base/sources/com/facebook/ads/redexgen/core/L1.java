package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class L1 {
    public static String[] A0G = {"4S0ZR9", "9atY4pLS3", "JCkQ", "0FGnuhRUJbXFjAeocMQA4", "Bc2FjzyWuEwoYoDKosvue", "DSb6itpNp95G1DjaOdl5F45O", "d2IfSwPvc8yd2jGVLBTV47FBT3G8Pl4J", "SXUDcryZ"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public HR A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public L1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A00(L1 l10) {
        if (!this.A0F) {
            return false;
        }
        if (!l10.A0F) {
            return true;
        }
        HR hr = (HR) AbstractC09823y.A02(this.A09);
        HR spsData = l10.A09;
        HR otherSpsData = (HR) AbstractC09823y.A02(spsData);
        if (this.A03 == l10.A03 && this.A07 == l10.A07 && this.A0C == l10.A0C && ((!this.A0B || !l10.A0B || this.A0A == l10.A0A) && ((this.A05 == l10.A05 || (this.A05 != 0 && l10.A05 != 0)) && ((hr.A07 != 0 || otherSpsData.A07 != 0 || (this.A06 == l10.A06 && this.A02 == l10.A02)) && ((hr.A07 != 1 || otherSpsData.A07 != 1 || (this.A00 == l10.A00 && this.A01 == l10.A01)) && this.A0E == l10.A0E))))) {
            boolean z10 = this.A0E;
            if (A0G[6].charAt(8) == '9') {
                throw new RuntimeException();
            }
            A0G[6] = "vYoSPXEMP2H1rloX7Zmdh99svIQCcR37";
            if (!z10 || this.A04 == l10.A04) {
                return false;
            }
        }
        return true;
    }

    public final void A02() {
        this.A0D = false;
        this.A0F = false;
    }

    public final void A03(int i10) {
        this.A08 = i10;
        this.A0D = true;
    }

    public final void A04(HR hr, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
        this.A09 = hr;
        this.A05 = i10;
        this.A08 = i11;
        this.A03 = i12;
        this.A07 = i13;
        this.A0C = z10;
        this.A0B = z11;
        this.A0A = z12;
        this.A0E = z13;
        this.A04 = i14;
        this.A06 = i15;
        this.A02 = i16;
        this.A00 = i17;
        this.A01 = i18;
        this.A0F = true;
        this.A0D = true;
    }

    public final boolean A05() {
        return this.A0D && (this.A08 == 7 || this.A08 == 2);
    }
}
