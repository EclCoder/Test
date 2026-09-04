package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.inmobi.media.oi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3202oi extends Lo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f27145a;

    public C3202oi(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        this.f27145a = gestureDetectorOnGestureListenerC3228pi;
    }

    @Override // com.inmobi.media.Lo
    public final boolean a() {
        return !kotlin.jvm.internal.s.c("Hidden", this.f27145a.getViewState());
    }

    @Override // com.inmobi.media.Lo
    public final void a(Lf orientation, No finalInsets) {
        GestureDetectorOnGestureListenerC3228pi renderView;
        kotlin.jvm.internal.s.h(orientation, "orientation");
        kotlin.jvm.internal.s.h(finalInsets, "finalInsets");
        this.f27145a.a(orientation, finalInsets);
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f27145a;
        gestureDetectorOnGestureListenerC3228pi.getClass();
        finalInsets.getClass();
        kotlin.jvm.internal.s.h(orientation, "orientation");
        Mo mo2 = (Mo) finalInsets.f25373a.get(orientation);
        if (mo2 == null) {
            return;
        }
        if (mo2.f25296b == 0 && mo2.f25297c == 0) {
            return;
        }
        gestureDetectorOnGestureListenerC3228pi.setCloseAssetArea(mo2);
        fl.k kVar = Gi.f24873a;
        kotlin.jvm.internal.s.h(gestureDetectorOnGestureListenerC3228pi, "<this>");
        if (kotlin.jvm.internal.s.c(gestureDetectorOnGestureListenerC3228pi.getRoute().f25563b, "default")) {
            renderView = gestureDetectorOnGestureListenerC3228pi;
        } else {
            Bo webViewFactory = gestureDetectorOnGestureListenerC3228pi.getWebViewFactory();
            webViewFactory.getClass();
            kotlin.jvm.internal.s.h("default", "id");
            renderView = (GestureDetectorOnGestureListenerC3228pi) webViewFactory.f24572b.get("default");
        }
        if (renderView != null) {
            kotlin.jvm.internal.s.h(renderView, "renderView");
            Mo insets = gestureDetectorOnGestureListenerC3228pi.f27228f1;
            kotlin.jvm.internal.s.h(insets, "insets");
            View viewFindViewById = renderView.getRootView().findViewById(65532);
            C3163n5 c3163n5 = viewFindViewById instanceof C3163n5 ? (C3163n5) viewFindViewById : null;
            if (c3163n5 == null) {
                return;
            }
            View viewFindViewById2 = renderView.getRootView().findViewById(65531);
            C3163n5 c3163n6 = viewFindViewById2 instanceof C3163n5 ? (C3163n5) viewFindViewById2 : null;
            if (c3163n6 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = c3163n5.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = c3163n6.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            layoutParams2.setMargins(0, insets.f25296b, insets.f25297c, 0);
            layoutParams4.setMargins(0, insets.f25296b, insets.f25297c, 0);
        }
    }
}
