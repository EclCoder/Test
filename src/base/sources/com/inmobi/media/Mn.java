package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Mn {
    public static final void a(ProgressBar progressBar, int i10) {
        kotlin.jvm.internal.s.h(progressBar, "<this>");
        progressBar.setProgress(i10, true);
    }

    public static final boolean b(View view, ViewGroup parentView) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(parentView, "parentView");
        if (view.isAttachedToWindow()) {
            return a(view, parentView);
        }
        return false;
    }

    public static final boolean a(View view, ViewGroup parentView) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(parentView, "parentView");
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            if (kotlin.jvm.internal.s.c(parent, parentView)) {
                return true;
            }
            parent = parent instanceof ViewGroup ? ((ViewGroup) parent).getParent() : null;
        }
        return false;
    }

    public static final void a(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
