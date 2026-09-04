package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class K9 extends Wn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3435xi f25107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3346u7 f25108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3348u9 f25109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25110g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K9(C3435xi container, C3435xi renderView, C3346u7 htmlAdTracker, C3348u9 c3348u9) {
        super(container);
        kotlin.jvm.internal.s.h(container, "container");
        kotlin.jvm.internal.s.h(renderView, "renderView");
        kotlin.jvm.internal.s.h(htmlAdTracker, "htmlAdTracker");
        this.f25107d = renderView;
        this.f25108e = htmlAdTracker;
        this.f25109f = c3348u9;
        this.f25110g = K9.class.getSimpleName();
    }

    @Override // com.inmobi.media.Wn
    public final void a(Map map) {
        View viewB;
        C3348u9 c3348u9 = this.f25109f;
        if (c3348u9 != null) {
            String tag = this.f25110g;
            kotlin.jvm.internal.s.g(tag, "tag");
            c3348u9.a(tag, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        this.f25107d.setFriendlyViews(map);
        C3348u9 c3348u10 = this.f25109f;
        if (c3348u10 != null) {
            String tag2 = this.f25110g;
            kotlin.jvm.internal.s.g(tag2, "tag");
            c3348u10.a(tag2, "startTrackingVisibility");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f25981a;
        C3435xi c3435xi = gestureDetectorOnGestureListenerC3228pi instanceof C3435xi ? (C3435xi) gestureDetectorOnGestureListenerC3228pi : null;
        if (c3435xi == null) {
            return;
        }
        C3346u7 c3346u7 = this.f25108e;
        View viewB2 = b();
        if (viewB2 == null || (viewB = b()) == null) {
            return;
        }
        c3346u7.a(viewB2, viewB, c3435xi.getVISIBILITY_CHANGE_LISTENER(), this.f25983c.getViewability(), true);
    }

    @Override // com.inmobi.media.Wn
    public final View c() {
        this.f25982b = new WeakReference(this.f25107d);
        return this.f25107d;
    }

    @Override // com.inmobi.media.Wn
    public final void d() {
        C3348u9 c3348u9 = this.f25109f;
        if (c3348u9 != null) {
            String tag = this.f25110g;
            kotlin.jvm.internal.s.g(tag, "tag");
            c3348u9.a(tag, "stopTrackingForImpression");
        }
        C3348u9 c3348u10 = this.f25109f;
        if (c3348u10 != null) {
            String tag2 = this.f25110g;
            kotlin.jvm.internal.s.g(tag2, "tag");
            c3348u10.a(tag2, "stopTrackingForVisibility");
        }
        C3346u7 c3346u7 = this.f25108e;
        View viewB = b();
        if (viewB == null) {
            return;
        }
        c3346u7.b(viewB);
    }

    @Override // com.inmobi.media.Wn
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.s.h(childView, "childView");
        kotlin.jvm.internal.s.h(obstructionCode, "obstructionCode");
        C3348u9 c3348u9 = this.f25109f;
        if (c3348u9 != null) {
            String tag = this.f25110g;
            kotlin.jvm.internal.s.g(tag, "tag");
            c3348u9.a(tag, "addFriendlyView - childView: " + childView + ", obstructionCode: " + obstructionCode);
        }
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f25107d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        U exposureTracker = this.f25107d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(childView);
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(View childView) {
        kotlin.jvm.internal.s.h(childView, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f25107d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        U exposureTracker = this.f25107d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(childView);
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.s.h(context, "context");
        C3348u9 c3348u9 = this.f25109f;
        if (c3348u9 != null) {
            String tag = this.f25110g;
            kotlin.jvm.internal.s.g(tag, "tag");
            c3348u9.a(tag, "onActivityStateChanged - state - " + ((int) b10));
        }
        try {
            if (b10 == 0) {
                this.f25108e.a();
                return;
            }
            if (b10 == 1) {
                C3346u7 c3346u7 = this.f25108e;
                InterfaceC3322t9 interfaceC3322t9 = c3346u7.f27607f;
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).c("HtmlAdTracker", "onActivityStopped");
                }
                N8 n10 = c3346u7.f27608g;
                if (n10 != null) {
                    String TAG = n10.f25327d;
                    kotlin.jvm.internal.s.g(TAG, "TAG");
                    n10.f25326c.a();
                    n10.f25328e.removeCallbacksAndMessages(null);
                    n10.f25325b.clear();
                }
                X7 x10 = c3346u7.f27609h;
                if (x10 != null) {
                    x10.e();
                    return;
                }
                return;
            }
            if (b10 == 2) {
                C3346u7 c3346u8 = this.f25108e;
                InterfaceC3322t9 interfaceC3322t10 = c3346u8.f27607f;
                if (interfaceC3322t10 != null) {
                    ((C3348u9) interfaceC3322t10).c("HtmlAdTracker", "onActivityDestroyed");
                }
                N8 n11 = c3346u8.f27608g;
                if (n11 != null) {
                    n11.f25324a.clear();
                    n11.f25325b.clear();
                    n11.f25326c.a();
                    n11.f25328e.removeMessages(0);
                    n11.f25326c.b();
                }
                c3346u8.f27608g = null;
                X7 x11 = c3346u8.f27609h;
                if (x11 != null) {
                    x11.b();
                }
                c3346u8.f27609h = null;
                return;
            }
            kotlin.jvm.internal.s.g(this.f25110g, "tag");
        } catch (Exception e10) {
            C3348u9 c3348u10 = this.f25109f;
            if (c3348u10 != null) {
                String tag2 = this.f25110g;
                kotlin.jvm.internal.s.g(tag2, "tag");
                c3348u10.b(tag2, "Exception in onActivityStateChanged with message : " + e10.getMessage());
            }
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a() {
        C3348u9 c3348u9 = this.f25109f;
        if (c3348u9 != null) {
            String tag = this.f25110g;
            kotlin.jvm.internal.s.g(tag, "tag");
            c3348u9.a(tag, "destroy");
        }
        if (b() != null) {
            C3348u9 c3348u10 = this.f25109f;
            if (c3348u10 != null) {
                String tag2 = this.f25110g;
                kotlin.jvm.internal.s.g(tag2, "tag");
                c3348u10.a(tag2, "stopTrackingForVisibility");
            }
            C3346u7 c3346u7 = this.f25108e;
            View viewB = b();
            if (viewB != null) {
                c3346u7.b(viewB);
            }
        }
        WeakReference weakReference = this.f25982b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
