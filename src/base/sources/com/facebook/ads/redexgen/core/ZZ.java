package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ZZ implements View.OnClickListener {
    public final /* synthetic */ C1759Zb A00;

    public ZZ(C1759Zb c1759Zb) {
        this.A00 = c1759Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A04.AAp();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
