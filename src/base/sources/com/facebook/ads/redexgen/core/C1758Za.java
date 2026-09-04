package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1758Za {
    public int A00;
    public YM A01;
    public InterfaceC1763Zf A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C2198gi A0B;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A08 = true;
    public boolean A07 = true;
    public final boolean A0C = true;

    public C1758Za(C2198gi c2198gi, InterfaceC1763Zf interfaceC1763Zf) {
        this.A0B = c2198gi;
        this.A02 = interfaceC1763Zf;
    }

    public final C1758Za A0C(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1758Za A0D(YM ym2) {
        this.A01 = ym2;
        return this;
    }

    public final C1758Za A0E(String str) {
        this.A03 = str;
        return this;
    }

    public final C1758Za A0F(String str) {
        this.A04 = str;
        return this;
    }

    public final C1758Za A0G(String str) {
        this.A05 = str;
        return this;
    }

    public final C1758Za A0H(String str) {
        this.A06 = str;
        return this;
    }

    public final C1758Za A0I(boolean z10) {
        this.A08 = z10;
        return this;
    }

    public final C1758Za A0J(boolean z10) {
        this.A09 = z10;
        return this;
    }

    public final C1758Za A0K(boolean z10) {
        this.A0A = z10;
        return this;
    }

    public final C1759Zb A0L() {
        return new C1759Zb(this, null);
    }
}
