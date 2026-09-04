package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC2192gc {
    public final C1176Cb A00;
    public final EnumC2197gh A01;

    public CL(C1176Cb c1176Cb, EnumC2197gh enumC2197gh) {
        this.A00 = c1176Cb;
        this.A01 = enumC2197gh;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2192gc
    public void A4D(Map<InterfaceC2174gK, EnumC2197gh> map, Map<SyncModifiableBundle, EnumC2184gU> map2) {
        map.put(this.A00, this.A01);
    }
}
