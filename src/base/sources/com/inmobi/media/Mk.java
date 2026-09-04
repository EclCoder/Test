package com.inmobi.media;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Mk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3228pi f25285a;

    public Mk(GestureDetectorOnGestureListenerC3228pi mListener) {
        kotlin.jvm.internal.s.h(mListener, "mListener");
        this.f25285a = mListener;
    }

    public final void a(MotionEvent event) {
        kotlin.jvm.internal.s.h(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f25285a.a(event.getX(), event.getY());
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f25285a.b(event.getX(), event.getY());
        }
    }
}
