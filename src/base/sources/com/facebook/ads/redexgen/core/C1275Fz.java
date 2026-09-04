package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1275Fz implements InterfaceC1962cs {
    public final /* synthetic */ C1274Fy A00;

    public C1275Fz(C1274Fy c1274Fy) {
        this.A00 = c1274Fy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1962cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1962cs
    public final void AGY(View view) {
        AbstractC1359Jg abstractC1359Jg = (AbstractC1359Jg) view;
        abstractC1359Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1359Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
