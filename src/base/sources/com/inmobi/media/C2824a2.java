package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C2824a2;
import com.inmobi.media.EnumC2931e6;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.a2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class C2824a2 extends AbstractC3107l1 implements Application.ActivityLifecycleCallbacks {
    public final String F;
    public final String G;
    public boolean H;
    public int I;
    public final C2850b2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2824a2(Context context, C3365v0 placement, Uk uk2) {
        super(context, placement, uk2);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(placement, "placement");
        String TAG = C2824a2.class.getSimpleName();
        this.F = TAG;
        this.G = "InMobi";
        this.J = new C2850b2();
        kotlin.jvm.internal.s.g(TAG, "TAG");
        long j10 = placement.f27659a;
        a(context, placement, uk2);
    }

    public static final void a(C2824a2 c2824a2, GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, int i10) {
        int iIndexOf = c2824a2.f26896h.indexOf(gestureDetectorOnGestureListenerC3228pi);
        try {
            AbstractC2978g1 abstractC2978g1N = c2824a2.n();
            C3348u9 c3348u9 = c2824a2.f26897i;
            if (c3348u9 != null) {
                String TAG = c2824a2.F;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                c3348u9.c(TAG, "callback onShowNextPodAd");
            }
            if (abstractC2978g1N != null) {
                abstractC2978g1N.a(i10, iIndexOf, gestureDetectorOnGestureListenerC3228pi);
            }
        } catch (Exception unused) {
            c2824a2.b(iIndexOf, false);
            c2824a2.e(iIndexOf);
        }
    }

    public static final void b(C2824a2 c2824a2) {
        try {
            if (c2824a2.f26890b == 7) {
                int i10 = c2824a2.I - 1;
                c2824a2.I = i10;
                if (i10 == 0) {
                    c2824a2.c((byte) 6);
                    AbstractC2978g1 abstractC2978g1N = c2824a2.n();
                    if (abstractC2978g1N != null) {
                        abstractC2978g1N.a();
                    }
                }
            }
        } catch (Exception e10) {
            C3348u9 c3348u9 = c2824a2.f26897i;
            if (c3348u9 != null) {
                String TAG = c2824a2.F;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                c3348u9.b(TAG, "BannerAdUnit.onAdScreenDismissed threw unexpected error: " + e10.getMessage());
            }
        }
    }

    public static final void c(C2824a2 c2824a2) {
        try {
            if (c2824a2.f26890b != 6) {
                if (c2824a2.f26890b == 7) {
                    c2824a2.I++;
                    return;
                }
                return;
            }
            c2824a2.I++;
            c2824a2.c((byte) 7);
            C3348u9 c3348u9 = c2824a2.f26897i;
            if (c3348u9 != null) {
                String TAG = c2824a2.F;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                c3348u9.d(TAG, "AdUnit " + c2824a2 + " state - ACTIVE");
            }
            C3348u9 c3348u10 = c2824a2.f26897i;
            if (c3348u10 != null) {
                c3348u10.c(c2824a2.G, "Successfully displayed banner ad for placement Id : " + c2824a2.f26900l);
            }
            AbstractC2978g1 abstractC2978g1N = c2824a2.n();
            if (abstractC2978g1N != null) {
                c2824a2.a(abstractC2978g1N);
            }
        } catch (Exception e10) {
            C3348u9 c3348u11 = c2824a2.f26897i;
            if (c3348u11 != null) {
                String TAG2 = c2824a2.F;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                c3348u11.b(TAG2, "BannerAdUnit.onAdScreenDisplayed threw unexpected error: " + e10.getMessage());
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void D() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "load " + this);
        }
        if (W()) {
            super.D();
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final boolean F() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 == null) {
            return false;
        }
        String TAG = this.F;
        kotlin.jvm.internal.s.g(TAG, "TAG");
        c3348u9.c(TAG, "missingPrerequisitesForAd " + this);
        return false;
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void G() {
        AbstractC2978g1 abstractC2978g1N;
        super.G();
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            c3348u9.c(this.G, "Banner ad fetch successful for placement id: " + this.f26900l);
        }
        if (!kotlin.jvm.internal.s.c(t(), "html") && !kotlin.jvm.internal.s.c(t(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
        }
        if (this.f26890b != 2 || (abstractC2978g1N = n()) == null) {
            return;
        }
        c(abstractC2978g1N);
    }

    public boolean W() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "canProceedToLoad " + this);
        }
        F();
        if (1 == this.f26890b || 2 == this.f26890b) {
            Sb.a((byte) 1, this.G, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                String TAG2 = this.F;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                c3348u10.b(TAG2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == this.f26890b) {
                b((short) 2008);
            } else {
                b((short) 2011);
            }
            return false;
        }
        if (7 != this.f26890b) {
            C3348u9 c3348u11 = this.f26897i;
            if (c3348u11 != null) {
                c3348u11.c(this.G, "Fetching a Banner ad for placement id: " + this.f26900l);
            }
            E();
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        C3348u9 c3348u12 = this.f26897i;
        if (c3348u12 != null) {
            String TAG3 = this.F;
            kotlin.jvm.internal.s.g(TAG3, "TAG");
            c3348u12.b(TAG3, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.f26900l.f27659a);
        }
        return false;
    }

    public final void X() {
        Wn viewableAd;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "onPause " + this);
        }
        byte b10 = this.f26890b;
        if (b10 == 4 || b10 == 6 || b10 == 7) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piJ = j();
            Context contextO = o();
            if (gestureDetectorOnGestureListenerC3228piJ == null || contextO == null || (viewableAd = gestureDetectorOnGestureListenerC3228piJ.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextO, (byte) 1);
        }
    }

    public final void Y() {
        Wn viewableAd;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "onResume " + this);
        }
        byte b10 = this.f26890b;
        if (b10 == 4 || b10 == 6 || b10 == 7) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228piJ = j();
            Context contextO = o();
            if (gestureDetectorOnGestureListenerC3228piJ == null || contextO == null || (viewableAd = gestureDetectorOnGestureListenerC3228piJ.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextO, (byte) 0);
        }
    }

    public final void Z() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "registerLifeCycleCallbacks " + this);
        }
        Context contextO = o();
        if (contextO != null) {
            Xi.a(contextO, this);
        }
    }

    public final void a0() {
        AdConfig adConfig;
        if (kotlin.jvm.internal.s.c(this.f26900l.f27664f, "AB") && (adConfig = this.f26891c) != null && adConfig.getSkipNetCheckHB()) {
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                String TAG = this.F;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                c3348u9.a(TAG, "renderAd without internet check");
            }
            b0();
            return;
        }
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            String TAG2 = this.F;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            c3348u10.a(TAG2, "renderAd");
        }
        a(new tl.a() { // from class: yh.w6
            @Override // tl.a
            public final Object invoke() {
                return C2824a2.e(this.f57988a);
            }
        }, new Function1() { // from class: yh.x6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2824a2.a(this.f58005a, (EnumC2931e6) obj);
            }
        });
    }

    public final void b0() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "renderAdPostInternetCheck");
        }
        try {
            if (N()) {
                return;
            }
            C3262r1 c3262r1 = this.f26914z;
            c3262r1.getClass();
            c3262r1.f27367g = SystemClock.elapsedRealtime();
            Handler handler = this.f26898j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: yh.v6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2824a2.f(this.f57973a);
                    }
                });
            }
        } catch (IllegalStateException e10) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                String TAG2 = this.F;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                c3348u10.a(TAG2, "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void c0() {
        Application application;
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "unregisterLifeCycleCallbacks " + this);
        }
        Context contextO = o();
        Activity activity = contextO instanceof Activity ? (Activity) contextO : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void d() {
        this.J.f26243a = false;
        super.d();
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final synchronized void e(GestureDetectorOnGestureListenerC3228pi renderView) {
        try {
            kotlin.jvm.internal.s.h(renderView, "renderView");
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                String TAG = this.F;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                c3348u9.a(TAG, "onAdScreenDismissed " + this);
            }
            super.e(renderView);
            Handler handler = this.f26898j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: yh.a7
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2824a2.b(this.f57602a);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public final synchronized void f(GestureDetectorOnGestureListenerC3228pi renderView) {
        try {
            kotlin.jvm.internal.s.h(renderView, "renderView");
            C3348u9 c3348u9 = this.f26897i;
            if (c3348u9 != null) {
                String TAG = this.F;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                c3348u9.a(TAG, "onAdScreenDisplayed " + this);
            }
            super.f(renderView);
            Handler handler = this.f26898j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: yh.z6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2824a2.c(this.f58042a);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void i() {
        if (this.f26896h.isEmpty()) {
            return;
        }
        if (this.f26907s) {
            Integer num = (Integer) gl.r.c0(this.f26906r);
            if (num != null) {
                GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) gl.r.e0(this.f26896h, num.intValue());
                if (kotlin.jvm.internal.s.c(gestureDetectorOnGestureListenerC3228pi != null ? gestureDetectorOnGestureListenerC3228pi.getMarkupType() : null, "htmlUrl")) {
                    b(gestureDetectorOnGestureListenerC3228pi, AbstractC3107l1.p(gestureDetectorOnGestureListenerC3228pi));
                    gestureDetectorOnGestureListenerC3228pi.g();
                    return;
                }
                return;
            }
            return;
        }
        int size = this.f26896h.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f26906r.contains(Integer.valueOf(i10))) {
                GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(i10);
                if (kotlin.jvm.internal.s.c(gestureDetectorOnGestureListenerC3228pi2 != null ? gestureDetectorOnGestureListenerC3228pi2.getMarkupType() : null, "htmlUrl")) {
                    b(gestureDetectorOnGestureListenerC3228pi2, AbstractC3107l1.p(gestureDetectorOnGestureListenerC3228pi2));
                    gestureDetectorOnGestureListenerC3228pi2.g();
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final HashMap l() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "adSpecificRequestParams getter " + this);
        }
        HashMap map = new HashMap();
        map.put("u-rt", this.H ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        map.put("mk-ad-slot", this.f26900l.f27666h);
        return map;
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public String m() {
        return "banner";
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void o(GestureDetectorOnGestureListenerC3228pi renderView) {
        int iIndexOf;
        kotlin.jvm.internal.s.h(renderView, "renderView");
        if (this.f26907s && (iIndexOf = this.f26896h.indexOf(renderView)) > this.f26904p && renderView.J != Yn.VISIBLE) {
            this.f26906r.remove(Integer.valueOf(iIndexOf));
        } else {
            V();
            super.o(renderView);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.s.h(activity, "activity");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "onActivityCreated " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "onActivityDestroyed " + this);
        }
        Context contextO = o();
        if (kotlin.jvm.internal.s.c(contextO, activity)) {
            kotlin.jvm.internal.s.f(contextO, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextO).getApplication().unregisterActivityLifecycleCallbacks(this);
            d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "onActivityPaused " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "onActivityResumed " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(outState, "outState");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "onActivitySaveInstanceState " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "onActivityStarted " + this);
        }
        if (kotlin.jvm.internal.s.c(o(), activity)) {
            Y();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "onActivityStopped " + this);
        }
        if (kotlin.jvm.internal.s.c(o(), activity)) {
            X();
        }
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final GestureDetectorOnGestureListenerC3228pi r() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "htmlAdContainer getter " + this);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (this.f26896h.size() <= 0 || this.f26904p >= this.f26896h.size()) ? null : (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(this.f26904p);
        if (this.f26900l.f27668j && gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.l();
        }
        return gestureDetectorOnGestureListenerC3228pi;
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final byte u() {
        return (byte) 0;
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void m(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "handleRenderViewSignaledAdReady " + this);
        }
        super.m(gestureDetectorOnGestureListenerC3228pi);
        if (this.f26907s && this.f26896h.indexOf(gestureDetectorOnGestureListenerC3228pi) > 0 && this.f26890b == 6) {
            b((byte) 1);
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(this.f26904p);
            if (gestureDetectorOnGestureListenerC3228pi2 != null) {
                gestureDetectorOnGestureListenerC3228pi2.a(true);
                return;
            }
            return;
        }
        if (this.f26890b != 2) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                String TAG2 = this.F;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                c3348u10.a(TAG2, "AdUnit is not in available state, ignoring the ad ready signal - " + ((int) this.f26890b));
                return;
            }
            return;
        }
        b((byte) 1);
        c((byte) 4);
        C3348u9 c3348u11 = this.f26897i;
        if (c3348u11 != null) {
            String TAG3 = this.F;
            kotlin.jvm.internal.s.g(TAG3, "TAG");
            c3348u11.d(TAG3, "AdUnit " + this + " state - READY");
        }
        C3262r1 c3262r1 = this.f26914z;
        c3262r1.getClass();
        c3262r1.f27369i = SystemClock.elapsedRealtime();
        Q();
        T();
        C3348u9 c3348u12 = this.f26897i;
        if (c3348u12 != null) {
            c3348u12.c(this.G, "Successfully loaded Banner ad markup in the WebView for placement id: " + this.f26900l);
        }
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N != null) {
            d(abstractC2978g1N);
        } else {
            C3348u9 c3348u13 = this.f26897i;
            if (c3348u13 != null) {
                String TAG4 = this.F;
                kotlin.jvm.internal.s.g(TAG4, "TAG");
                c3348u13.b(TAG4, "AdUnit listener is null");
            }
        }
        h();
    }

    public static final void d(C2824a2 c2824a2) {
        try {
            if (c2824a2.f26890b == 4) {
                c2824a2.c((byte) 6);
                C3348u9 c3348u9 = c2824a2.f26897i;
                if (c3348u9 != null) {
                    String TAG = c2824a2.F;
                    kotlin.jvm.internal.s.g(TAG, "TAG");
                    c3348u9.d(TAG, "AdUnit " + c2824a2 + " state - RENDERED");
                }
            }
        } catch (Exception e10) {
            C3348u9 c3348u10 = c2824a2.f26897i;
            if (c3348u10 != null) {
                String TAG2 = c2824a2.F;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                c3348u10.b(TAG2, "BannerAdUnit.onRenderViewVisible threw unexpected error: " + e10.getMessage());
            }
        }
    }

    public static final fl.g0 e(C2824a2 c2824a2) {
        C3348u9 c3348u9 = c2824a2.f26897i;
        if (c3348u9 != null) {
            String TAG = c2824a2.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "loadWithRetry success");
        }
        c2824a2.b0();
        return fl.g0.f38750a;
    }

    public static final void f(C2824a2 c2824a2) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        if (c2824a2.f26907s) {
            c2824a2.f26905q = System.currentTimeMillis();
            AdSet adSetS = c2824a2.s();
            if (adSetS != null && (ads = adSetS.getAds()) != null) {
                int i10 = 0;
                for (Object obj : ads) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        gl.r.u();
                    }
                    c2824a2.f26906r.add(Integer.valueOf(i10));
                    i10 = i11;
                }
            }
        }
        c2824a2.O();
    }

    @Override // com.inmobi.media.AbstractC3107l1
    public final void a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, short s10, String failureErrorCode) throws JSONException {
        kotlin.jvm.internal.s.h(failureErrorCode, "failureErrorCode");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "handleRenderViewSignaledAdFailed " + this);
        }
        super.a(gestureDetectorOnGestureListenerC3228pi, s10, failureErrorCode);
        if (this.f26907s) {
            int iIndexOf = this.f26896h.indexOf(gestureDetectorOnGestureListenerC3228pi);
            a(iIndexOf, true);
            if (iIndexOf > 0 && this.f26890b == 6) {
                b((byte) 1);
                GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(this.f26904p);
                if (gestureDetectorOnGestureListenerC3228pi2 != null) {
                    gestureDetectorOnGestureListenerC3228pi2.a(false);
                }
            }
        }
        if (this.f26890b == 2) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                c3348u10.c(this.G, "Failed to load the Banner markup in the WebView for placement id: " + this.f26900l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
        }
    }

    @Override // com.inmobi.media.InterfaceC3391w0
    public final void b() {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "closeAll " + this);
        }
    }

    public final boolean b(int i10, GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "isInValidShowPodIndex " + i10 + " " + this.f26906r + " " + this.f26896h.indexOf(gestureDetectorOnGestureListenerC3228pi) + " " + this + " ");
        }
        if (!this.f26906r.contains(Integer.valueOf(i10)) || i10 <= this.f26896h.indexOf(gestureDetectorOnGestureListenerC3228pi) || this.f26896h.get(i10) == null) {
            return true;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = (GestureDetectorOnGestureListenerC3228pi) this.f26896h.get(i10);
        return (gestureDetectorOnGestureListenerC3228pi2 == null || gestureDetectorOnGestureListenerC3228pi2.C0) ? false : true;
    }

    public final void c(String str) {
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "setAdSize " + this);
        }
        C3365v0 c3365v0 = this.f26900l;
        kotlin.jvm.internal.s.e(str);
        c3365v0.getClass();
        kotlin.jvm.internal.s.h(str, "<set-?>");
        c3365v0.f27666h = str;
    }

    @Override // com.inmobi.media.AbstractC3107l1, com.inmobi.media.AbstractC3279ri
    public void i(GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.c(TAG, "onRenderViewVisible " + this);
        }
        super.i(renderView);
        Handler handler = this.f26898j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yh.y6
                @Override // java.lang.Runnable
                public final void run() {
                    C2824a2.d(this.f58022a);
                }
            });
        }
    }

    public final void b(boolean z10) {
        C3348u9 c3348u9;
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u10.a(TAG, "load " + this);
        }
        if (z10 && (c3348u9 = this.f26897i) != null) {
            c3348u9.c(this.G, "Initiating Banner refresh for placement id: " + this.f26900l);
        }
        this.H = z10;
        D();
    }

    @Override // com.inmobi.media.InterfaceC3391w0
    public final void a(int i10, GestureDetectorOnGestureListenerC3228pi renderView) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "loadPodAd " + this);
        }
        if (this.f26906r.contains(Integer.valueOf(i10)) && i10 > this.f26896h.indexOf(renderView)) {
            this.f26903o = i10;
            Handler handler = this.f26898j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: yh.u6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2824a2.a(this.f57955a);
                    }
                });
                return;
            }
            return;
        }
        C3348u9 c3348u10 = this.f26897i;
        if (c3348u10 != null) {
            String TAG2 = this.F;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            c3348u10.a(TAG2, dmHT.aKNoTMkkvorqnel);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f26896h;
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) copyOnWriteArrayList.get(copyOnWriteArrayList.indexOf(renderView));
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.a(false);
        }
    }

    public static final void a(C2824a2 c2824a2) {
        C3348u9 c3348u9 = c2824a2.f26897i;
        if (c3348u9 != null) {
            String TAG = c2824a2.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "start loading html ad");
        }
        c2824a2.O();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    public static final fl.g0 a(C2824a2 c2824a2, EnumC2931e6 errorCode) {
        short s10;
        kotlin.jvm.internal.s.h(errorCode, "it");
        C3348u9 c3348u9 = c2824a2.f26897i;
        if (c3348u9 != null) {
            String TAG = c2824a2.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.b(TAG, "loadWithRetry error - " + errorCode);
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        int iOrdinal = errorCode.ordinal();
        if (iOrdinal == 0) {
            s10 = 2122;
        } else if (iOrdinal != 21) {
            switch (iOrdinal) {
                case 12:
                    s10 = 2123;
                    break;
                case 13:
                    s10 = 2124;
                    break;
                case 14:
                    s10 = 2125;
                    break;
                case 15:
                    s10 = 2126;
                    break;
                case 16:
                    s10 = 2127;
                    break;
                default:
                    s10 = 2122;
                    break;
            }
        } else {
            s10 = 2229;
        }
        c2824a2.a(inMobiAdRequestStatus, true, s10);
        return fl.g0.f38750a;
    }

    @Override // com.inmobi.media.AbstractC3107l1, com.inmobi.media.InterfaceC3391w0
    public final void a(final int i10, final GestureDetectorOnGestureListenerC3228pi renderView, Context context) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        C3348u9 c3348u9 = this.f26897i;
        if (c3348u9 != null) {
            String TAG = this.F;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            c3348u9.a(TAG, "showPodAdAtIndex " + this + " index - " + i10);
        }
        if (!this.f26907s) {
            C3348u9 c3348u10 = this.f26897i;
            if (c3348u10 != null) {
                String TAG2 = this.F;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                c3348u10.b(TAG2, "Cannot show an pod ad as isPod is not set.");
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f26896h;
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) copyOnWriteArrayList.get(copyOnWriteArrayList.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC3228pi != null) {
                gestureDetectorOnGestureListenerC3228pi.b(false);
                return;
            }
            return;
        }
        if (b(i10, renderView)) {
            C3348u9 c3348u11 = this.f26897i;
            if (c3348u11 != null) {
                String TAG3 = this.F;
                kotlin.jvm.internal.s.g(TAG3, "TAG");
                c3348u11.b(TAG3, "Cannot show an pod ad with invalid index passed");
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f26896h;
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = (GestureDetectorOnGestureListenerC3228pi) copyOnWriteArrayList2.get(copyOnWriteArrayList2.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC3228pi2 != null) {
                gestureDetectorOnGestureListenerC3228pi2.b(false);
                return;
            }
            return;
        }
        super.a(i10, renderView, context);
        Handler handler = this.f26898j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yh.b7
                @Override // java.lang.Runnable
                public final void run() {
                    C2824a2.a(this.f57618a, renderView, i10);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public void a(V1 audioStatusInternal) {
        kotlin.jvm.internal.s.h(audioStatusInternal, "audioStatusInternal");
        AbstractC2978g1 abstractC2978g1N = n();
        if (abstractC2978g1N != null) {
            abstractC2978g1N.a(audioStatusInternal);
        }
        C2850b2 c2850b2 = this.J;
        c2850b2.getClass();
        kotlin.jvm.internal.s.h(audioStatusInternal, "audioStatusInternal");
        if (!c2850b2.f26243a && audioStatusInternal == V1.f25866e) {
            c2850b2.f26243a = true;
            C2883c9 c2883c9 = C2883c9.f26313c;
            c2883c9.f26525a = System.currentTimeMillis();
            c2883c9.f26526b++;
        }
    }

    @Override // com.inmobi.media.AbstractC3279ri
    public void a(boolean z10) {
        C2883c9 c2883c9 = C2883c9.f26313c;
        Context context = Xi.f26021a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        La laA = Ka.a(context, "banner_audio_pref_file");
        kotlin.jvm.internal.s.h("user_mute_count", "key");
        int i10 = laA.f25198a.getInt("user_mute_count", 0);
        laA.a("user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1, false);
    }

    @Override // com.inmobi.media.AbstractC3107l1, com.inmobi.media.AbstractC3279ri
    public final void a(GestureDetectorOnGestureListenerC3228pi renderView, boolean z10) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        super.a(renderView, z10);
        byte b10 = this.f26890b;
        short s10 = 2227;
        if (b10 != 4 && b10 != 6) {
            if (b10 == 7) {
                if (this.f26890b == 7) {
                    s10 = z10 ? (short) 2224 : (short) 2223;
                }
                renderView.a(z10, s10);
                return;
            }
            return;
        }
        byte b11 = this.f26890b;
        if (b11 == 4) {
            s10 = z10 ? (short) 2220 : (short) 2219;
        } else if (b11 == 6) {
            s10 = z10 ? (short) 2222 : (short) 2221;
        }
        K();
        renderView.a(z10, s10);
    }
}
