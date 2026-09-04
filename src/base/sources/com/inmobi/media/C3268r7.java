package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.r7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3268r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f27378a;

    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    public final boolean a(View rootView, View adView, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.s.h(rootView, "rootView");
        kotlin.jvm.internal.s.h(adView, "adView");
        ViewParent parent = rootView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        boolean z14 = viewGroup == null || a(viewGroup, adView, i10);
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int iIndexOfChild = viewGroup.indexOfChild(rootView) + 1; iIndexOfChild < childCount; iIndexOfChild++) {
                View childAt = viewGroup.getChildAt(iIndexOfChild);
                kotlin.jvm.internal.s.g(childAt, "getChildAt(...)");
                if (childAt.getVisibility() == 0) {
                    if (adView instanceof GestureDetectorOnGestureListenerC3228pi) {
                        if (!(childAt instanceof C3248qc)) {
                            if (!(childAt instanceof C3435xi)) {
                                GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) adView;
                                Map<View, FriendlyObstructionPurpose> friendlyViews = gestureDetectorOnGestureListenerC3228pi.getFriendlyViews();
                                if (!(friendlyViews != null ? friendlyViews.containsKey(childAt) : false)) {
                                    Rect rect = new Rect();
                                    adView.getGlobalVisibleRect(rect);
                                    Rect rect2 = new Rect();
                                    childAt.getGlobalVisibleRect(rect2);
                                    Rect rect3 = new Rect();
                                    boolean intersect = rect3.setIntersect(rect, rect2);
                                    kotlin.jvm.internal.s.h(rect, "<this>");
                                    int i11 = (rect.bottom - rect.top) * (rect.right - rect.left);
                                    kotlin.jvm.internal.s.h(rect3, "<this>");
                                    int i12 = i11 - ((rect3.bottom - rect3.top) * (rect3.right - rect3.left));
                                    float configuredArea = (i10 / 100) * gestureDetectorOnGestureListenerC3228pi.getConfiguredArea();
                                    if (intersect && i12 < configuredArea) {
                                        if (childAt.getAlpha() > 0.3f) {
                                            if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                                if (childAt.getBackground() instanceof ColorDrawable) {
                                                    Drawable background = childAt.getBackground();
                                                    kotlin.jvm.internal.s.f(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                                    if (((ColorDrawable) background).getColor() == 0) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                } else if (childAt.getBackground() == null) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (childAt.getForeground() instanceof ColorDrawable) {
                                                    Drawable foreground = childAt.getForeground();
                                                    kotlin.jvm.internal.s.f(foreground, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                                    if (((ColorDrawable) foreground).getColor() == 0) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                } else if (childAt.getForeground() == null) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (z12 && z13) {
                                                    z11 = true;
                                                }
                                            }
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        if (!z11) {
                                        }
                                    }
                                }
                            }
                            z10 = true;
                        }
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        return false;
                    }
                }
            }
        }
        return z14;
    }

    public final boolean b(View view, View view2, int i10) {
        if (view2 != null && view2.getVisibility() == 0) {
            if ((view != null ? view.getParent() : null) != null && view2.isShown()) {
                GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = view2 instanceof GestureDetectorOnGestureListenerC3228pi ? (GestureDetectorOnGestureListenerC3228pi) view2 : null;
                if (gestureDetectorOnGestureListenerC3228pi == null) {
                    return false;
                }
                if (gestureDetectorOnGestureListenerC3228pi.getPlacementType() != 1 && (gestureDetectorOnGestureListenerC3228pi.getHeight() <= 0 || gestureDetectorOnGestureListenerC3228pi.getWidth() <= 0)) {
                    return false;
                }
                Rect rect = new Rect();
                if (!gestureDetectorOnGestureListenerC3228pi.getGlobalVisibleRect(rect)) {
                    return false;
                }
                this.f27378a = ((long) rect.height()) * ((long) rect.width());
                if (gestureDetectorOnGestureListenerC3228pi.getPlacementType() == 1) {
                    gestureDetectorOnGestureListenerC3228pi.setConfiguredArea(gestureDetectorOnGestureListenerC3228pi.getHeight() * gestureDetectorOnGestureListenerC3228pi.getWidth());
                }
                if (gestureDetectorOnGestureListenerC3228pi.getArea() > 0) {
                    if (((long) 100) * this.f27378a >= gestureDetectorOnGestureListenerC3228pi.getConfiguredArea() * ((long) i10)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
