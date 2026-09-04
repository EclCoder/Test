package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class J9 extends Wn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Xn f25053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3346u7 f25054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3322t9 f25055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25056g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9(GestureDetectorOnGestureListenerC3228pi container, Xn mViewableAd, C3346u7 htmlAdTracker, InterfaceC3322t9 interfaceC3322t9) {
        super(container);
        kotlin.jvm.internal.s.h(container, "container");
        kotlin.jvm.internal.s.h(mViewableAd, "mViewableAd");
        kotlin.jvm.internal.s.h(htmlAdTracker, "htmlAdTracker");
        this.f25053d = mViewableAd;
        this.f25054e = htmlAdTracker;
        this.f25055f = interfaceC3322t9;
        this.f25056g = J9.class.getSimpleName();
    }

    @Override // com.inmobi.media.Wn
    public final void a(Map map) {
        InterfaceC3322t9 interfaceC3322t9 = this.f25055f;
        if (interfaceC3322t9 != null) {
            String TAG = this.f25056g;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        View view = this.f25053d.b();
        if (view != null) {
            InterfaceC3322t9 interfaceC3322t10 = this.f25055f;
            if (interfaceC3322t10 != null) {
                String TAG2 = this.f25056g;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t10).a(TAG2, "start tracking");
            }
            AdConfig.ViewabilityConfig viewabilityConfig = this.f25983c.getViewability();
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f25981a;
            kotlin.jvm.internal.s.f(gestureDetectorOnGestureListenerC3228pi, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC3228pi.setFriendlyViews(map);
            C3346u7 c3346u7 = this.f25054e;
            c3346u7.getClass();
            kotlin.jvm.internal.s.h(view, "view");
            kotlin.jvm.internal.s.h(view, "token");
            kotlin.jvm.internal.s.h(viewabilityConfig, "viewabilityConfig");
            InterfaceC3322t9 interfaceC3322t11 = c3346u7.f27607f;
            if (interfaceC3322t11 != null) {
                ((C3348u9) interfaceC3322t11).c("HtmlAdTracker", "startTrackingForImpression");
            }
            if (c3346u7.f27602a == 0) {
                InterfaceC3322t9 interfaceC3322t12 = c3346u7.f27607f;
                if (interfaceC3322t12 != null) {
                    ((C3348u9) interfaceC3322t12).b("HtmlAdTracker", "impression type is loaded. return");
                }
            } else if (kotlin.jvm.internal.s.c(c3346u7.f27603b, MimeTypes.BASE_TYPE_VIDEO) || kotlin.jvm.internal.s.c(c3346u7.f27603b, MimeTypes.BASE_TYPE_AUDIO)) {
                InterfaceC3322t9 interfaceC3322t13 = c3346u7.f27607f;
                if (interfaceC3322t13 != null) {
                    ((C3348u9) interfaceC3322t13).b("HtmlAdTracker", "creative type is video and audio. return");
                }
            } else {
                N8 n8A = c3346u7.a(c3346u7.f27602a, viewabilityConfig);
                InterfaceC3322t9 interfaceC3322t14 = c3346u7.f27607f;
                if (interfaceC3322t14 != null) {
                    ((C3348u9) interfaceC3322t14).c("HtmlAdTracker", "impression tracker add view");
                }
                int i10 = c3346u7.f27605d;
                int i11 = c3346u7.f27604c;
                kotlin.jvm.internal.s.h(view, "view");
                kotlin.jvm.internal.s.h(view, "token");
                L8 l10 = (L8) n8A.f25324a.get(view);
                if (!kotlin.jvm.internal.s.c(l10 != null ? l10.f25192a : null, view)) {
                    kotlin.jvm.internal.s.h(view, "view");
                    n8A.f25324a.remove(view);
                    n8A.f25325b.remove(view);
                    n8A.f25326c.a(view);
                    n8A.f25324a.put(view, new L8(view, i10, i11));
                    X7 x10 = n8A.f25326c;
                    x10.getClass();
                    kotlin.jvm.internal.s.h(view, "view");
                    x10.a(view, view, view, i10);
                }
            }
            this.f25054e.a(view, view, gestureDetectorOnGestureListenerC3228pi.getVISIBILITY_CHANGE_LISTENER(), viewabilityConfig, false);
            this.f25053d.getClass();
        }
    }

    @Override // com.inmobi.media.Wn
    public final View b() {
        return this.f25053d.b();
    }

    @Override // com.inmobi.media.Wn
    public final View c() {
        return this.f25053d.c();
    }

    @Override // com.inmobi.media.Wn
    public final void d() {
        InterfaceC3322t9 interfaceC3322t9 = this.f25055f;
        if (interfaceC3322t9 != null) {
            String TAG = this.f25056g;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "stopTrackingForImpression");
        }
        View viewB = this.f25053d.b();
        if (viewB != null) {
            this.f25054e.a(viewB);
            this.f25053d.getClass();
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.s.h(childView, "childView");
        kotlin.jvm.internal.s.h(obstructionCode, "obstructionCode");
        if (childView instanceof C3435xi) {
            InterfaceC3322t9 interfaceC3322t9 = this.f25055f;
            if (interfaceC3322t9 != null) {
                String TAG = this.f25056g;
                kotlin.jvm.internal.s.g(TAG, "TAG");
                ((C3348u9) interfaceC3322t9).a(TAG, "Ignoring RenderViewSibling as friendly view");
                return;
            }
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f25055f;
        if (interfaceC3322t10 != null) {
            String TAG2 = this.f25056g;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            ((C3348u9) interfaceC3322t10).a(TAG2, "Adding friendly view: " + childView.getClass().getSimpleName() + " with obstruction code: " + obstructionCode);
        }
        this.f25053d.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.Wn
    public final void a(View childView) {
        kotlin.jvm.internal.s.h(childView, "childView");
        if (childView instanceof C3435xi) {
            return;
        }
        this.f25053d.a(childView);
    }

    @Override // com.inmobi.media.Wn
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.s.h(context, "context");
        InterfaceC3322t9 interfaceC3322t9 = this.f25055f;
        if (interfaceC3322t9 != null) {
            String TAG = this.f25056g;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "onActivityStateChanged - state - " + ((int) b10));
        }
        try {
            if (b10 == 0) {
                this.f25054e.a();
            } else if (b10 == 1) {
                C3346u7 c3346u7 = this.f25054e;
                InterfaceC3322t9 interfaceC3322t10 = c3346u7.f27607f;
                if (interfaceC3322t10 != null) {
                    ((C3348u9) interfaceC3322t10).c("HtmlAdTracker", "onActivityStopped");
                }
                N8 n10 = c3346u7.f27608g;
                if (n10 != null) {
                    kotlin.jvm.internal.s.g(n10.f25327d, "TAG");
                    n10.f25326c.a();
                    n10.f25328e.removeCallbacksAndMessages(null);
                    n10.f25325b.clear();
                }
                X7 x10 = c3346u7.f27609h;
                if (x10 != null) {
                    x10.e();
                }
            } else if (b10 == 2) {
                C3346u7 c3346u8 = this.f25054e;
                InterfaceC3322t9 interfaceC3322t11 = c3346u8.f27607f;
                if (interfaceC3322t11 != null) {
                    ((C3348u9) interfaceC3322t11).c("HtmlAdTracker", "onActivityDestroyed");
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
            } else {
                kotlin.jvm.internal.s.g(this.f25056g, "TAG");
            }
            this.f25053d.getClass();
            kotlin.jvm.internal.s.h(context, "context");
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t12 = this.f25055f;
            if (interfaceC3322t12 != null) {
                String TAG2 = this.f25056g;
                kotlin.jvm.internal.s.g(TAG2, "TAG");
                ((C3348u9) interfaceC3322t12).b(TAG2, "Exception in onActivityStateChanged with message : " + e10.getMessage());
            }
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
        } finally {
            this.f25053d.getClass();
            kotlin.jvm.internal.s.h(context, "context");
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a() {
        InterfaceC3322t9 interfaceC3322t9 = this.f25055f;
        if (interfaceC3322t9 != null) {
            String TAG = this.f25056g;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            ((C3348u9) interfaceC3322t9).a(TAG, "destroy");
        }
        View viewB = this.f25053d.b();
        if (viewB != null) {
            this.f25054e.a(viewB);
            this.f25054e.b(viewB);
        }
        WeakReference weakReference = this.f25982b;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference weakReference2 = this.f25053d.f25982b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
    }
}
