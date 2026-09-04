package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1784a0 implements View.OnClickListener {
    public final /* synthetic */ MC A00;

    public ViewOnClickListenerC1784a0(MC mc2) {
        this.A00 = mc2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.A9c();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
