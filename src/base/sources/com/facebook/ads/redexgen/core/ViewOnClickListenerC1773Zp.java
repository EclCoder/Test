package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1773Zp implements View.OnClickListener {
    public final /* synthetic */ C1765Zh A00;
    public final /* synthetic */ MD A01;

    public ViewOnClickListenerC1773Zp(MD md2, C1765Zh c1765Zh) {
        this.A01 = md2;
        this.A00 = c1765Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AAq();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
