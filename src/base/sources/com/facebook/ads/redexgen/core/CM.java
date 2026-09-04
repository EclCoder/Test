package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC2192gc {
    public final EnumC2184gU A00;
    public final AbstractC09392d A01;

    public CM(AbstractC09392d abstractC09392d, EnumC2184gU enumC2184gU) {
        this.A01 = abstractC09392d;
        this.A00 = enumC2184gU;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2192gc
    public void A4D(Map<InterfaceC2174gK, EnumC2197gh> map, Map<SyncModifiableBundle, EnumC2184gU> map2) {
        map2.put(null, this.A00);
    }
}
