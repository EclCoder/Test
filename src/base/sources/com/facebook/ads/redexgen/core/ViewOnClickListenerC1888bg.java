package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1888bg implements View.OnClickListener {
    public final /* synthetic */ C1890bi A00;

    public ViewOnClickListenerC1888bg(C1890bi c1890bi) {
        this.A00 = c1890bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
