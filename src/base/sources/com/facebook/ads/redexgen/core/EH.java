package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class EH extends AbstractC1485Od {
    public final /* synthetic */ EF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EH(EF ef2, double d10, double d11, double d12, boolean z10) {
        super(d10, d11, d12, z10);
        this.A00 = ef2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1485Od
    public final void A00(boolean z10, boolean z11, C1487Of c1487Of) {
        if ((!C1648Up.A0z(this.A00.A0D) || !this.A00.A09) && z11) {
            this.A00.A09 = true;
            this.A00.A0R(this.A00.A0J, this.A00.A0J(EnumC2076ek.A03));
        }
    }
}
