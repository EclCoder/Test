package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1283Gh implements InterfaceC2018dm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1280Ge A01;

    public C1283Gh(C1280Ge c1280Ge, int i10) {
        this.A01 = c1280Ge;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2018dm
    public final void ACQ() {
        this.A01.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2018dm
    public final void ADA() {
        this.A01.A0X(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2018dm
    public final void ADc(int i10) {
        C1280Ge.A03(this.A01, i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2018dm
    public final void ADw(float f10) {
        if (!this.A01.A08) {
            this.A01.A0L(f10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2018dm
    public final void AFw(boolean z10) {
        this.A01.A0W(z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2018dm
    public final void AGQ(String str) {
        this.A01.A0D.A0F().A3a(str);
        if (this.A01.A0A.A2H() && this.A01.A00 < this.A01.A0A.A23()) {
            this.A01.A0D.A0F().AC2();
            this.A01.A0X(false, this.A00);
        } else {
            this.A01.A0I.A4j(this.A01.A0J.A81());
            this.A01.A0M(3);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2018dm
    public final void AKc() {
        this.A01.setUnskippableSecondsComplete(false);
        this.A01.A0H.setProgressImmediate(0.0f);
        this.A01.A0H.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2018dm
    public final void AKd(float f10) {
        this.A01.A0H.setProgress(100.0f * f10);
    }
}
