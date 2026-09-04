package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class QF implements InterfaceC1723Xr {
    public final C1722Xq A00;
    public final InterfaceC1723Xr A01;

    public QF(InterfaceC1723Xr interfaceC1723Xr, int i10, int i11) {
        this.A01 = interfaceC1723Xr;
        this.A00 = new C1722Xq(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1723Xr
    public final void AH8(String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && AbstractC1725Xt.A08(this.A00)) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1723Xr
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (AbstractC1725Xt.A08(this.A00)) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
