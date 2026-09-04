package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1825af implements View.OnClickListener {
    public final /* synthetic */ M6 A00;

    public ViewOnClickListenerC1825af(M6 m10) {
        this.A00 = m10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A08.canGoForward()) {
                this.A00.A08.goForward();
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
