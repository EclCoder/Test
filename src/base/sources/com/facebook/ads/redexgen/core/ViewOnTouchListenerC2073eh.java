package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC2073eh implements View.OnTouchListener {
    public final /* synthetic */ C1235Ek A00;

    public ViewOnTouchListenerC2073eh(C1235Ek c1235Ek) {
        this.A00 = c1235Ek;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0C.A02(new C1219Du(view, motionEvent));
        return false;
    }
}
