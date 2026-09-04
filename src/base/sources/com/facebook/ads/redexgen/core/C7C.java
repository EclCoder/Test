package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C2227hB {
    public InterfaceC2070ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C2198gi c2198gi, NativeAd nativeAd, C1662Vd c1662Vd) {
        C1892bk c1892bk = new C1892bk(c2198gi);
        MediaView mediaView = new MediaView(c2198gi);
        AdOptionsView adOptionsView = new AdOptionsView(c2198gi, nativeAd, nativeAdLayout);
        c1662Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c2198gi, nativeAd, c1662Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c1892bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c1662Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1892bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C1568Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
