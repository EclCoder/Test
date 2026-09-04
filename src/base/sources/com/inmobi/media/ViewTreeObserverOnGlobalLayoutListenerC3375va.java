package com.inmobi.media;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.inmobi.media.va, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3375va implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f27701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3322t9 f27702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final em.y f27705e;

    public ViewTreeObserverOnGlobalLayoutListenerC3375va(FrameLayout view, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(view, "view");
        this.f27701a = view;
        this.f27702b = interfaceC3322t9;
        this.f27705e = em.a0.b(fl.g0.f38750a);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        try {
            InterfaceC3322t9 interfaceC3322t9 = this.f27702b;
            if (interfaceC3322t9 != null) {
                String str = Da.f24644a;
                kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t9).a(str, "close called");
            }
            this.f27703c = J3.b(this.f27701a.getWidth() / N5.b());
            this.f27704d = J3.b(this.f27701a.getHeight() / N5.b());
            this.f27701a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            em.k.d(H9.f24930c, null, null, new C3349ua(this, null), 3, null);
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t10 = this.f27702b;
            if (interfaceC3322t10 != null) {
                String str2 = Da.f24644a;
                kotlin.jvm.internal.s.g(str2, "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t10).b(str2, "SDK encountered unexpected error in JavaScriptBridge$1.onGlobalLayout(); " + e10.getMessage());
            }
        }
    }
}
