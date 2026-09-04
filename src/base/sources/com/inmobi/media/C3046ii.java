package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ii, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3046ii implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f26753a;

    public C3046ii(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        this.f26753a = gestureDetectorOnGestureListenerC3228pi;
    }

    public final void a() {
        InterfaceC3322t9 interfaceC3322t9 = this.f26753a.f27233i;
        if (interfaceC3322t9 != null) {
            String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
            kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
            ((C3348u9) interfaceC3322t9).a(str, "onAdScreenDisplayFailed");
        }
        this.f26753a.getListener().c();
    }

    public final void b() {
        InterfaceC3322t9 interfaceC3322t9 = this.f26753a.f27233i;
        if (interfaceC3322t9 != null) {
            String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
            kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
            ((C3348u9) interfaceC3322t9).a(str, "onAdScreenDisplayed");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f26753a;
        if (gestureDetectorOnGestureListenerC3228pi.f27214b == 0) {
            gestureDetectorOnGestureListenerC3228pi.Q = false;
        }
        gestureDetectorOnGestureListenerC3228pi.getListener().f(this.f26753a);
    }
}
