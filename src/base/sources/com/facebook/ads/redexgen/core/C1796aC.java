package com.facebook.ads.redexgen.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1796aC extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C1803aJ A01;

    public C1796aC(C1803aJ c1803aJ, float f10) {
        this.A01 = c1803aJ;
        this.A00 = f10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(XV.A00, XV.A00, view.getWidth(), view.getHeight(), this.A00);
    }
}
