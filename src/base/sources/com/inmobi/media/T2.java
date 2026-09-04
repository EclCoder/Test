package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U2 f25729a;

    public T2(U2 u10) {
        this.f25729a = u10;
    }

    public final void a(boolean z10) {
        C2840ai c2840ai;
        if (z10 && (c2840ai = (C2840ai) this.f25729a.f25802i.get()) != null) {
            GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
            c2840ai.a(Vh.a("IN_NATIVE_BROWSER", "onInteraction"));
        }
        C2840ai c2840ai2 = (C2840ai) this.f25729a.f25802i.get();
        if (c2840ai2 != null) {
            GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
            c2840ai2.a(Vh.a("IN_NATIVE_BROWSER", "onClose"));
        }
    }
}
