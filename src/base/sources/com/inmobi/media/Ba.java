package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.VideoViewPosition;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ba extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ca f24526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoViewPosition f24527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ba(Ca ca2, VideoViewPosition videoViewPosition, String str, kl.f fVar) {
        super(2, fVar);
        this.f24526a = ca2;
        this.f24527b = videoViewPosition;
        this.f24528c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Ba(this.f24526a, this.f24527b, this.f24528c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Ba) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24526a.f24583a;
        VideoViewPosition newVideoViewPosition = this.f24527b;
        String str = this.f24528c;
        gestureDetectorOnGestureListenerC3228pi.getClass();
        kotlin.jvm.internal.s.h(newVideoViewPosition, "videoViewPosition");
        C3475z8 c3475z8 = gestureDetectorOnGestureListenerC3228pi.Z0;
        if (c3475z8 != null) {
            kotlin.jvm.internal.s.h(newVideoViewPosition, "newVideoViewPosition");
            if (!c3475z8.f27992g.get()) {
                EnumC3399w8[] enumC3399w8Arr = {EnumC3399w8.LOADED, EnumC3399w8.PLAYING, EnumC3399w8.PAUSED, EnumC3399w8.COMPLETED};
                EnumC2933e8[] enumC2933e8Arr = EnumC2933e8.f26475a;
                if (C3475z8.a(c3475z8, enumC3399w8Arr, "updateVideoPlayerPosition", "updateVideoPosition", null, 8)) {
                    c3475z8.f27996k.a(newVideoViewPosition);
                }
            }
            gestureDetectorOnGestureListenerC3228pi.a(EnumC3321t8.VIDEO_PLAYER_POSITION_UPDATED, str);
        } else {
            EnumC3321t8 enumC3321t8 = EnumC3321t8.VIDEO_COMMAND_ERROR;
            EnumC2933e8[] enumC2933e8Arr2 = EnumC2933e8.f26475a;
            C2856b8 obj2 = new C2856b8((Object) str);
            kotlin.jvm.internal.s.h(obj2, "obj");
            gestureDetectorOnGestureListenerC3228pi.a(enumC3321t8, AbstractC3323ta.a(obj2, C2856b8.class));
        }
        return fl.g0.f38750a;
    }
}
