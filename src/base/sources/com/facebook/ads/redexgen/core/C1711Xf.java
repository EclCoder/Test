package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1711Xf implements ViewpointAction<C1655Uw, V1> {
    public XM A00;

    public C1711Xf(XM xm2) {
        this.A00 = xm2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6R(C2807rN<C1655Uw, V1> c2807rN, InterfaceC2798rD interfaceC2798rD) {
        switch (interfaceC2798rD.A9U(c2807rN)) {
            case A02:
            case A04:
                this.A00.A02(c2807rN, interfaceC2798rD);
                break;
        }
    }
}
