package com.facebook.ads.redexgen.core;

import java.util.Collection;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2404kJ implements InterfaceC1453Mw {
    public final /* synthetic */ C2198gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C2404kJ(JSONObject jSONObject, C2198gi c2198gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c2198gi;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1453Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1453Mw
    public final Collection<String> A7p() {
        return AbstractC1454Mx.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1453Mw
    public final EnumC1452Mv A8K() {
        return AbstractC1454Mx.A00(this.A02);
    }
}
