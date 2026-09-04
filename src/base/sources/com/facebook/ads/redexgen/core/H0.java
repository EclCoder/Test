package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class H0 implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC1685Wc A01;
    public final /* synthetic */ AbstractC1285Gj A02;
    public final /* synthetic */ DZ A03;

    public H0(AbstractC1285Gj abstractC1285Gj, int i10, DZ dz, AbstractRunnableC1685Wc abstractRunnableC1685Wc) {
        this.A02 = abstractC1285Gj;
        this.A00 = i10;
        this.A03 = dz;
        this.A01 = abstractRunnableC1685Wc;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f10) {
        this.A02.A09.setProgress(100.0f * (1.0f - (f10 / this.A00)));
        if (this.A03 != null) {
            DZ dz = this.A03;
            float percentage = this.A00;
            dz.A07((int) ((percentage - f10) * 1000.0f));
        }
    }
}
