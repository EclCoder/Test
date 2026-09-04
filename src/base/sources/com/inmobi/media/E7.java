package com.inmobi.media;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class E7 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f24699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R7 f24700b;

    public E7(View view, R7 r10) {
        this.f24699a = view;
        this.f24700b = r10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        kotlin.jvm.internal.s.h(view, "view");
        this.f24699a.removeOnAttachStateChangeListener(this);
        InterfaceC3322t9 interfaceC3322t9 = this.f24700b.f25589b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("HtmlMediaPlayer", "inflate: MediaPlayerLayout is attached to window");
        }
        this.f24700b.a(C3347u8.f27612a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        kotlin.jvm.internal.s.h(view, "view");
    }
}
