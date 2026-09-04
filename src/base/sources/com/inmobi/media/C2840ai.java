package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ai, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2840ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f26222a;

    public C2840ai(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        this.f26222a = gestureDetectorOnGestureListenerC3228pi;
    }

    public final void a(JSONObject jsonObject) {
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        InterfaceC3322t9 interfaceC3322t9 = this.f26222a.f27233i;
        if (interfaceC3322t9 != null) {
            String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
            kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
            ((C3348u9) interfaceC3322t9).a(str, "onCCTLifeCycleEvent");
        }
        this.f26222a.c(jsonObject);
    }
}
