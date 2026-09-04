package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Uo implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnWindowVisibilityChangeListener f25862c;

    public Uo(ViewGroup viewGroup, ViewGroup viewGroup2, ViewTreeObserver.OnWindowVisibilityChangeListener onWindowVisibilityChangeListener) {
        this.f25860a = viewGroup;
        this.f25861b = viewGroup2;
        this.f25862c = onWindowVisibilityChangeListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        kotlin.jvm.internal.s.h(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        kotlin.jvm.internal.s.h(view, "view");
        this.f25860a.removeOnAttachStateChangeListener(this);
        this.f25861b.getViewTreeObserver().removeOnWindowVisibilityChangeListener(this.f25862c);
    }
}
