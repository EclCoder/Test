package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3372v7;
import com.inmobi.media.GestureDetectorOnGestureListenerC3228pi;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.v7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3372v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f27688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Lf f27689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f27690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f27692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3228pi f27693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f27694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27695h;

    public C3372v7(WeakReference activityRef, GestureDetectorOnGestureListenerC3228pi adContainer, RelativeLayout adBackgroundView) {
        kotlin.jvm.internal.s.h(activityRef, "activityRef");
        kotlin.jvm.internal.s.h(adContainer, "adContainer");
        kotlin.jvm.internal.s.h(adBackgroundView, "adBackgroundView");
        kotlin.jvm.internal.s.h(adBackgroundView, "adBackgroundView");
        this.f27688a = adBackgroundView;
        this.f27689b = Mf.a(N5.g());
        this.f27690c = 1.0f;
        this.f27692e = activityRef;
        this.f27693f = adContainer;
        this.f27694g = adBackgroundView;
    }

    public final void a(final Lf orientation) {
        kotlin.jvm.internal.s.h(orientation, "orientation");
        kotlin.jvm.internal.s.h(orientation, "orientation");
        this.f27689b = orientation;
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f27693f;
        kotlin.jvm.internal.s.f(gestureDetectorOnGestureListenerC3228pi, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
        gestureDetectorOnGestureListenerC3228pi.getWebViewFactory().a(new Function1() { // from class: yh.ic
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3372v7.a(orientation, (GestureDetectorOnGestureListenerC3228pi) obj);
            }
        });
    }

    public final void b() {
        Activity activity = (Activity) this.f27692e.get();
        if (!(activity instanceof InMobiAdActivity) ? false : ((InMobiAdActivity) activity).f24410e) {
            try {
                B fullScreenEventsListener = this.f27693f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    C3046ii c3046ii = (C3046ii) fullScreenEventsListener;
                    InterfaceC3322t9 interfaceC3322t9 = c3046ii.f26753a.f27233i;
                    if (interfaceC3322t9 != null) {
                        String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
                        kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
                        ((C3348u9) interfaceC3322t9).a(str, "onAdScreenDismissed");
                    }
                    if (kotlin.jvm.internal.s.c("Default", c3046ii.f26753a.getViewState())) {
                        c3046ii.f26753a.setAndUpdateViewState("Hidden");
                    }
                    c3046ii.f26753a.W();
                    fl.g0 g0Var = fl.g0.f38750a;
                }
            } catch (Exception e10) {
                e10.getMessage();
                Sb.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                fl.g0 g0Var2 = fl.g0.f38750a;
            }
        } else {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f27693f;
            kotlin.jvm.internal.s.f(gestureDetectorOnGestureListenerC3228pi, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC3228pi.setFullScreenActivityContext(null);
            try {
                gestureDetectorOnGestureListenerC3228pi.n();
            } catch (Exception e11) {
                e11.getMessage();
                Sb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
            SparseArray sparseArray = InMobiAdActivity.f24404t;
            GestureDetectorOnGestureListenerC3228pi container = this.f27693f;
            kotlin.jvm.internal.s.h(container, "container");
            InMobiAdActivity.f24404t.remove(container.hashCode());
        }
        this.f27693f.b();
    }

    public final void c() {
        M5 m10;
        RelativeLayout.LayoutParams layoutParams;
        if (this.f27690c == 1.0f) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.f27688a.setLayoutParams(layoutParams2);
            return;
        }
        if (this.f27691d) {
            P5 p10 = N5.f25313a;
            Context context = this.f27688a.getContext();
            kotlin.jvm.internal.s.g(context, "getContext(...)");
            m10 = N5.b(context);
        } else {
            P5 p11 = N5.f25313a;
            Context context2 = this.f27688a.getContext();
            kotlin.jvm.internal.s.g(context2, "getContext(...)");
            kotlin.jvm.internal.s.h(context2, "context");
            Display displayA = N5.a(context2);
            if (displayA == null) {
                m10 = N5.f25314b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                displayA.getMetrics(displayMetrics);
                m10 = new M5(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        int i10 = m10.f25247a;
        Objects.toString(this.f27689b);
        if (Mf.b(this.f27689b)) {
            layoutParams = new RelativeLayout.LayoutParams(vl.a.b(m10.f25247a * this.f27690c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, vl.a.b(m10.f25248b * this.f27690c));
            layoutParams3.addRule(10);
            layoutParams = layoutParams3;
        }
        this.f27688a.setLayoutParams(layoutParams);
    }

    public final void d() {
        this.f27694g.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        Wn viewableAd = this.f27693f.getViewableAd();
        View viewC = viewableAd != null ? viewableAd.c() : null;
        if (viewC != null) {
            ViewParent parent = viewC.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewC);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this.f27694g.getContext());
            relativeLayout.addView(viewC, new RelativeLayout.LayoutParams(-1, -1));
            this.f27694g.addView(relativeLayout, layoutParams);
            this.f27693f.a(relativeLayout);
        }
    }

    public final void e() {
        if (1 == this.f27693f.getPlacementType()) {
            try {
                HashMap map = new HashMap();
                Wn viewableAd = this.f27693f.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(map);
                }
            } catch (Exception e10) {
                e10.getMessage();
                B fullScreenEventsListener = this.f27693f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    ((C3046ii) fullScreenEventsListener).a();
                }
            }
        }
    }

    public final void a() {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f27693f;
        if (gestureDetectorOnGestureListenerC3228pi == null) {
            gestureDetectorOnGestureListenerC3228pi = null;
        }
        if (gestureDetectorOnGestureListenerC3228pi == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3228pi.getWebViewFactory().a(new Function1() { // from class: yh.jc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3372v7.a((GestureDetectorOnGestureListenerC3228pi) obj);
            }
        });
        if (gestureDetectorOnGestureListenerC3228pi.L) {
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3228pi.n();
        } catch (Exception e10) {
            e10.getMessage();
            Sb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    public static final fl.g0 a(GestureDetectorOnGestureListenerC3228pi it) {
        kotlin.jvm.internal.s.h(it, "it");
        it.r();
        return fl.g0.f38750a;
    }

    public static final fl.g0 a(Lf lf2, GestureDetectorOnGestureListenerC3228pi it) {
        kotlin.jvm.internal.s.h(it, "it");
        it.b(lf2);
        return fl.g0.f38750a;
    }
}
