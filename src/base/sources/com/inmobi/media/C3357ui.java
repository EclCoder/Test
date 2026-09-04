package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3357ui;

/* JADX INFO: renamed from: com.inmobi.media.ui, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3357ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3228pi f27631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27632b;

    public C3357ui(GestureDetectorOnGestureListenerC3228pi view, long j10) {
        kotlin.jvm.internal.s.h(view, "view");
        this.f27631a = view;
        this.f27632b = j10;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: yh.gc
            @Override // java.lang.Runnable
            public final void run() {
                C3357ui.a(this.f57744a);
            }
        }, this.f27632b);
    }

    public static final void a(C3357ui c3357ui) {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = c3357ui.f27631a;
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.j();
        }
        c3357ui.f27631a = null;
    }
}
