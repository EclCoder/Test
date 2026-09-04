package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.hi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3021hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f26686a;

    public C3021hi(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        this.f26686a = gestureDetectorOnGestureListenerC3228pi;
    }

    public final void a(C2959f8 obj) {
        kotlin.jvm.internal.s.h(obj, "error");
        InterfaceC3322t9 interfaceC3322t9 = this.f26686a.f27233i;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("HtmlVideoPlayer", "onVideoLoadFailed " + ((int) obj.f26542b));
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f26686a;
        EnumC3321t8 enumC3321t8 = EnumC3321t8.VIDEO_PLAYBACK_ERROR;
        kotlin.jvm.internal.s.h(obj, "obj");
        gestureDetectorOnGestureListenerC3228pi.a(enumC3321t8, AbstractC3323ta.a(obj, obj.getClass()));
    }
}
