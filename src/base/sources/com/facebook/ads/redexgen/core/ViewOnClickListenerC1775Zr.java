package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1775Zr implements View.OnClickListener {
    public final /* synthetic */ C1492Ok A00;
    public final /* synthetic */ C1765Zh A01;
    public final /* synthetic */ MD A02;

    public ViewOnClickListenerC1775Zr(MD md2, C1765Zh c1765Zh, C1492Ok c1492Ok) {
        this.A02 = md2;
        this.A01 = c1765Zh;
        this.A00 = c1492Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0D.AF4(this.A00);
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
