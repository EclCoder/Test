package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1777Zt implements View.OnClickListener {
    public final /* synthetic */ C1779Zv A00;

    public ViewOnClickListenerC1777Zt(C1779Zv c1779Zv) {
        this.A00 = c1779Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A9c();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
