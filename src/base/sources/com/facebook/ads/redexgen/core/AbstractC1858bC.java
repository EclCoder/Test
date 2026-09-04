package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1858bC {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z10) {
                return;
            }
            ViewOnClickListenerC1857bB viewOnClickListenerC1857bB = new ViewOnClickListenerC1857bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1857bB);
            view.setOnTouchListener(new ViewOnTouchListenerC1856bA(viewOnClickListenerC1857bB));
        }
    }
}
