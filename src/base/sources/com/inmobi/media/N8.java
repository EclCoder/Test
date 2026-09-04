package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class N8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f25324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f25325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X7 f25326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f25328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M8 f25329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f25330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3294s7 f25331h;

    public N8(AdConfig.ViewabilityConfig viewabilityConfig, X7 visibilityTracker, C3294s7 listener) {
        kotlin.jvm.internal.s.h(viewabilityConfig, "viewabilityConfig");
        kotlin.jvm.internal.s.h(visibilityTracker, "visibilityTracker");
        kotlin.jvm.internal.s.h(listener, "listener");
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f25324a = weakHashMap;
        this.f25325b = weakHashMap2;
        this.f25326c = visibilityTracker;
        this.f25327d = N8.class.getSimpleName();
        this.f25330g = viewabilityConfig.getImpressionPollIntervalMillis();
        K8 k10 = new K8(this);
        InterfaceC3322t9 interfaceC3322t9 = visibilityTracker.f26878d;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        visibilityTracker.f26882h = k10;
        this.f25328e = handler;
        this.f25329f = new M8(this);
        this.f25331h = listener;
    }

    public final void a(View view) {
        kotlin.jvm.internal.s.h(view, "view");
        this.f25324a.remove(view);
        this.f25325b.remove(view);
        this.f25326c.a(view);
    }
}
