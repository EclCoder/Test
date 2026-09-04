package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Yh implements InterfaceC3053j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f26088a;

    public Yh(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        this.f26088a = gestureDetectorOnGestureListenerC3228pi;
    }

    public final void a(Float f10) {
        this.f26088a.h("window.mraidview.broadcastEvent('audioVolumeChange', " + f10 + ");");
    }
}
