package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import f8.Ygx.FuoITeVPeXAj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.mo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3156mo {
    public static final boolean a(View adView, D5 minDimension) {
        kotlin.jvm.internal.s.h(adView, "adView");
        kotlin.jvm.internal.s.h(minDimension, "minDimension");
        if (adView.getVisibility() == 0 && adView.getParent() != null && adView.isShown() && adView.getWidth() >= minDimension.f24638a && adView.getHeight() >= minDimension.f24639b) {
            if (adView.getHeight() * adView.getWidth() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(View adView, Rect rect, int i10, D5 minDimension) {
        kotlin.jvm.internal.s.h(adView, "adView");
        kotlin.jvm.internal.s.h(rect, FuoITeVPeXAj.JVZZolUmkd);
        kotlin.jvm.internal.s.h(minDimension, "minDimension");
        if (a(adView, minDimension)) {
            return ((long) 100) * (((long) rect.height()) * ((long) rect.width())) >= ((long) (i10 * (adView.getHeight() * adView.getWidth())));
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    public static final boolean a(View adView, Rect adViewRect, int i10, List friendlyViews) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.s.h(adView, "adView");
        kotlin.jvm.internal.s.h(adViewRect, "adViewRect");
        kotlin.jvm.internal.s.h(friendlyViews, "friendlyViews");
        float height = (i10 / 100.0f) * adView.getHeight() * adView.getWidth();
        View view = adView;
        while (view.getParent() instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            kotlin.jvm.internal.s.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            Iterable iterableM = yl.g.m(viewGroup.indexOfChild(view) + 1, viewGroup.getChildCount());
            if (!(iterableM instanceof Collection) || !((Collection) iterableM).isEmpty()) {
                Iterator it = iterableM.iterator();
                while (it.hasNext()) {
                    View childAt = viewGroup.getChildAt(((gl.j0) it).nextInt());
                    if (childAt.getVisibility() == 0) {
                        kotlin.jvm.internal.s.e(childAt);
                        if (friendlyViews.contains(childAt)) {
                            continue;
                        } else {
                            Rect rect = new Rect();
                            childAt.getGlobalVisibleRect(rect);
                            Rect rect2 = new Rect();
                            boolean intersect = rect2.setIntersect(adViewRect, rect);
                            kotlin.jvm.internal.s.h(adViewRect, "<this>");
                            int i11 = (adViewRect.bottom - adViewRect.top) * (adViewRect.right - adViewRect.left);
                            kotlin.jvm.internal.s.h(rect2, "<this>");
                            int i12 = i11 - ((rect2.bottom - rect2.top) * (rect2.right - rect2.left));
                            if (intersect && i12 < height) {
                                kotlin.jvm.internal.s.h(childAt, "<this>");
                                if (childAt.getAlpha() > 0.3f) {
                                    if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                        if (childAt.getBackground() instanceof ColorDrawable) {
                                            Drawable background = childAt.getBackground();
                                            kotlin.jvm.internal.s.f(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                            if (((ColorDrawable) background).getColor() == 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                        } else if (childAt.getBackground() == null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (childAt.getForeground() instanceof ColorDrawable) {
                                            Drawable foreground = childAt.getForeground();
                                            kotlin.jvm.internal.s.f(foreground, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                            if (((ColorDrawable) foreground).getColor() == 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                        } else if (childAt.getForeground() == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (!z10 || !z11) {
                                        }
                                    }
                                    return false;
                                }
                                continue;
                            }
                        }
                    }
                }
            }
            view = viewGroup;
        }
        return true;
    }
}
