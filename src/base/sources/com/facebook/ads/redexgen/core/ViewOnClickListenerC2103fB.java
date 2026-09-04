package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2103fB implements View.OnClickListener {
    public final /* synthetic */ C1204Df A00;

    public ViewOnClickListenerC2103fB(C1204Df c1204Df) {
        this.A00 = c1204Df;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A04.A04(VH.A0l, null);
            this.A00.A03.A0F().A3m();
            if (this.A00.A00 != null) {
                if (this.A00.A07()) {
                    this.A00.A00.setVolume(1.0f);
                } else {
                    this.A00.A00.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
