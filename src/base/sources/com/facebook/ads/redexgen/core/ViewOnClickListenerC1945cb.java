package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1945cb implements View.OnClickListener {
    public final /* synthetic */ KB A00;

    public ViewOnClickListenerC1945cb(KB kb2) {
        this.A00 = kb2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A08 != null) {
                this.A00.A08.AJz();
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
