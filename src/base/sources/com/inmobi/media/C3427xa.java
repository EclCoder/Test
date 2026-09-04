package com.inmobi.media;

import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.xa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3427xa extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ca f27838a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3427xa(Ca ca2, kl.f fVar) {
        super(2, fVar);
        this.f27838a = ca2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3427xa(this.f27838a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3427xa(this.f27838a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        ll.b.f();
        fl.s.b(obj);
        InterfaceC3322t9 interfaceC3322t9 = this.f27838a.f24585c;
        if (interfaceC3322t9 != null) {
            String str = Da.f24644a;
            kotlin.jvm.internal.s.g(str, "access$getTAG$p(...)");
            ((C3348u9) interfaceC3322t9).a(str, "destroyVideoPlayer is called");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f27838a.f24583a;
        gestureDetectorOnGestureListenerC3228pi.f27216b1 = null;
        C3475z8 c3475z8 = gestureDetectorOnGestureListenerC3228pi.Z0;
        if (c3475z8 != null) {
            c3475z8.a();
        }
        return fl.g0.f38750a;
    }
}
