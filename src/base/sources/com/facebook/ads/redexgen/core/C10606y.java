package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10606y implements InterfaceC1628Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C10606y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACm() {
        WT.A00(new C1623Tq(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACq() {
        WT.A00(new C1624Tr(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ADp(C1670Vm c1670Vm) {
        WT.A00(new C1626Tt(this, c1670Vm));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void AEl() {
        WT.A00(new C1622Tp(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1628Tv
    public final void AEq() {
        WT.A00(new C1625Ts(this));
    }
}
