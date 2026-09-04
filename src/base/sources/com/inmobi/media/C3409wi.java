package com.inmobi.media;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.inmobi.media.C3409wi;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.wi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3409wi extends AbstractC3279ri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3435xi f27799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bo f27800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Qi f27801c;

    public C3409wi(C3435xi c3435xi, Bo bo2, Qi qi2) {
        this.f27799a = c3435xi;
        this.f27800b = bo2;
        this.f27801c = qi2;
    }

    public static final void a(Bo bo2, Qi qi2, C3435xi c3435xi, GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        String id2 = qi2.f25562a;
        bo2.getClass();
        kotlin.jvm.internal.s.h(id2, "id");
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = (GestureDetectorOnGestureListenerC3228pi) bo2.f24572b.get(id2);
        if (gestureDetectorOnGestureListenerC3228pi2 == null) {
            InterfaceC3322t9 logger = c3435xi.getLogger();
            if (logger != null) {
                ((C3348u9) logger).b(c3435xi.f27864m1, "Source RenderView not found for id: " + qi2.f25562a);
                return;
            }
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC3228pi.getWvStateMachine().a(3);
        if (numA != null) {
            int iIntValue = numA.intValue();
            InterfaceC3322t9 logger2 = c3435xi.getLogger();
            if (logger2 != null) {
                ((C3348u9) logger2).b(c3435xi.f27864m1, "Failed to transition to FIRE_AD_FAILED state: " + iIntValue);
            }
            gestureDetectorOnGestureListenerC3228pi2.a("loadWebView", Gi.a(gestureDetectorOnGestureListenerC3228pi.getRoute().f25563b, iIntValue));
        }
    }

    public static final void b(Bo bo2, Qi qi2, C3435xi c3435xi, GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) throws JSONException {
        String id2 = qi2.f25562a;
        bo2.getClass();
        kotlin.jvm.internal.s.h(id2, "id");
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = (GestureDetectorOnGestureListenerC3228pi) bo2.f24572b.get(id2);
        if (gestureDetectorOnGestureListenerC3228pi2 == null) {
            InterfaceC3322t9 logger = c3435xi.getLogger();
            if (logger != null) {
                ((C3348u9) logger).b(c3435xi.f27864m1, "Source RenderView not found for id: " + qi2.f25562a);
                return;
            }
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC3228pi.getWvStateMachine().a(2);
        if (numA == null) {
            c3435xi.b(gestureDetectorOnGestureListenerC3228pi2, qi2.f25563b);
            return;
        }
        int iIntValue = numA.intValue();
        InterfaceC3322t9 logger2 = c3435xi.getLogger();
        if (logger2 != null) {
            ((C3348u9) logger2).b(c3435xi.f27864m1, "Failed to transition to FIRE_AD_READY state: " + iIntValue);
        }
        gestureDetectorOnGestureListenerC3228pi2.a("loadWebView", Gi.a(gestureDetectorOnGestureListenerC3228pi.getRoute().f25563b, iIntValue));
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void c() {
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void e(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        GestureDetectorOnGestureListenerC3228pi adRenderView = this.f27799a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().e(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void g(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void h(final GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
        final Bo bo2 = this.f27800b;
        final Qi qi2 = this.f27801c;
        final C3435xi c3435xi = this.f27799a;
        Runnable runnable = new Runnable() { // from class: yh.mc
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                C3409wi.b(bo2, qi2, c3435xi, renderView);
            }
        };
        executorC2937ec.getClass();
        kotlin.jvm.internal.s.h(runnable, "runnable");
        executorC2937ec.f26488a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void i(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void j(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        GestureDetectorOnGestureListenerC3228pi adRenderView = this.f27799a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().j(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void f(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        kotlin.jvm.internal.s.h(gestureDetectorOnGestureListenerC3228pi, qEagQqzJZsd.dGDEt);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(GestureDetectorOnGestureListenerC3228pi renderView, final boolean z10) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
        final C3435xi c3435xi = this.f27799a;
        final Qi qi2 = this.f27801c;
        Runnable runnable = new Runnable() { // from class: yh.lc
            @Override // java.lang.Runnable
            public final void run() {
                C3409wi.a(c3435xi, qi2, z10);
            }
        };
        executorC2937ec.getClass();
        kotlin.jvm.internal.s.h(runnable, "runnable");
        executorC2937ec.f26488a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void b(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        GestureDetectorOnGestureListenerC3228pi adRenderView = this.f27799a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().b(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(C3437xk telemetryOnAdImpression) {
        AbstractC3279ri listener;
        kotlin.jvm.internal.s.h(telemetryOnAdImpression, "telemetryOnAdImpression");
        GestureDetectorOnGestureListenerC3228pi adRenderView = this.f27799a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(telemetryOnAdImpression);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(final GestureDetectorOnGestureListenerC3228pi renderView, String errorCode) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
        final Bo bo2 = this.f27800b;
        final Qi qi2 = this.f27801c;
        final C3435xi c3435xi = this.f27799a;
        Runnable runnable = new Runnable() { // from class: yh.kc
            @Override // java.lang.Runnable
            public final void run() {
                C3409wi.a(bo2, qi2, c3435xi, renderView);
            }
        };
        executorC2937ec.getClass();
        kotlin.jvm.internal.s.h(runnable, "runnable");
        executorC2937ec.f26488a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(HashMap params) {
        kotlin.jvm.internal.s.h(params, "params");
        GestureDetectorOnGestureListenerC3228pi adRenderView = this.f27799a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.a(params);
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(String eventType, HashMap kv) {
        AbstractC3279ri listener;
        kotlin.jvm.internal.s.h(eventType, "eventType");
        kotlin.jvm.internal.s.h(kv, "kv");
        GestureDetectorOnGestureListenerC3228pi adRenderView = this.f27799a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(eventType, kv);
    }

    @Override // com.inmobi.media.AbstractC3279ri, com.inmobi.media.InterfaceC3282rl
    public final void a() {
        AbstractC3279ri listener;
        GestureDetectorOnGestureListenerC3228pi adRenderView = this.f27799a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a();
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(GestureDetectorOnGestureListenerC3228pi renderView, String trackerName, Map macros) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        kotlin.jvm.internal.s.h(trackerName, "trackerName");
        kotlin.jvm.internal.s.h(macros, "macros");
        GestureDetectorOnGestureListenerC3228pi adRenderView = this.f27799a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, trackerName, macros);
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(V1 audioStatusInternal) {
        AbstractC3279ri listener;
        kotlin.jvm.internal.s.h(audioStatusInternal, "audioStatusInternal");
        GestureDetectorOnGestureListenerC3228pi adRenderView = this.f27799a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(audioStatusInternal);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(boolean z10) {
        AbstractC3279ri listener;
        GestureDetectorOnGestureListenerC3228pi adRenderView = this.f27799a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(z10);
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final void a(String data) {
        AbstractC3279ri listener;
        kotlin.jvm.internal.s.h(data, "data");
        GestureDetectorOnGestureListenerC3228pi adRenderView = this.f27799a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(data);
    }

    public static final void a(C3435xi c3435xi, Qi qi2, boolean z10) {
        if (c3435xi.getWvStateMachine().a(4) != null) {
            c3435xi.a("loadWebView", Gi.a(qi2.f25563b, 307));
        }
        GestureDetectorOnGestureListenerC3228pi adRenderView = c3435xi.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, z10);
        }
    }
}
