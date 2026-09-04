package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class So implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnWindowFocusChangeListener f25723c;

    public So(ViewGroup viewGroup, ViewGroup viewGroup2, ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener) {
        this.f25721a = viewGroup;
        this.f25722b = viewGroup2;
        this.f25723c = onWindowFocusChangeListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        kotlin.jvm.internal.s.h(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        kotlin.jvm.internal.s.h(view, "view");
        this.f25721a.removeOnAttachStateChangeListener(this);
        this.f25722b.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f25723c);
    }
}
