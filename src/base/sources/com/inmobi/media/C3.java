package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3228pi f24575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3322t9 f24578d;

    public C3(GestureDetectorOnGestureListenerC3228pi renderView, boolean z10, boolean z11, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(renderView, "renderView");
        this.f24575a = renderView;
        this.f24576b = z10;
        this.f24577c = z11;
        this.f24578d = interfaceC3322t9;
    }

    public final void a(final Mo insets) {
        final ViewGroup viewGroup;
        Handler handler;
        kotlin.jvm.internal.s.h(insets, "insets");
        if (!(this.f24575a.getContainerContext() instanceof InMobiAdActivity) || (viewGroup = (ViewGroup) this.f24575a.getRootView().findViewById(65534)) == null || (handler = viewGroup.getHandler()) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: yh.w
            @Override // java.lang.Runnable
            public final void run() {
                C3.a(this.f57979a, viewGroup, insets);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    public static final void a(C3 c10, ViewGroup viewGroup, Mo mo2) {
        InterfaceC3322t9 interfaceC3322t9;
        fl.g0 g0Var;
        Wn viewableAd;
        Wn viewableAd2;
        fl.q qVarA = c10.a();
        View.OnClickListener onClickListener = (View.OnClickListener) qVarA.d();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) qVarA.g();
        fl.g0 g0Var2 = null;
        if (c10.f24576b) {
            View viewFindViewById = viewGroup != null ? viewGroup.findViewById(65532) : null;
            if (viewFindViewById != null) {
                InterfaceC3322t9 interfaceC3322t10 = c10.f24578d;
                if (interfaceC3322t10 != null) {
                    ((C3348u9) interfaceC3322t10).c("CloseButtonHandler", "Close button already present, not adding again");
                }
                c10.a(viewFindViewById);
            } else {
                Context context = c10.f24575a.getContext();
                kotlin.jvm.internal.s.g(context, "getContext(...)");
                View c3163n5 = new C3163n5(context, (byte) 0, c10.f24578d);
                c3163n5.setId(65532);
                B5.f24500a.getClass();
                if (B5.x()) {
                    c3163n5.setElevation(1.7014117E38f);
                }
                c3163n5.setOnClickListener(onClickListener);
                c10.a(c3163n5);
                if (viewGroup != null) {
                    viewGroup.addView(c3163n5, layoutParams);
                }
                layoutParams.setMargins(0, mo2.f25296b, mo2.f25297c, 0);
            }
        } else {
            View viewFindViewById2 = c10.f24575a.getRootView().findViewById(65532);
            if (viewFindViewById2 != null) {
                Bo webViewFactory = c10.f24575a.getWebViewFactory();
                webViewFactory.getClass();
                kotlin.jvm.internal.s.h("default", "id");
                GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) webViewFactory.f24572b.get("default");
                if (gestureDetectorOnGestureListenerC3228pi != null && (viewableAd = gestureDetectorOnGestureListenerC3228pi.getViewableAd()) != null) {
                    viewableAd.a(viewFindViewById2);
                }
                ViewParent parent = viewFindViewById2.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(viewFindViewById2);
                    g0Var = fl.g0.f38750a;
                } else {
                    g0Var = null;
                }
                if (g0Var == null) {
                    interfaceC3322t9 = c10.f24578d;
                    if (interfaceC3322t9 != null) {
                        ((C3348u9) interfaceC3322t9).c("CloseButtonHandler", "Close button not present, not removing");
                        fl.g0 g0Var3 = fl.g0.f38750a;
                    }
                }
            } else {
                interfaceC3322t9 = c10.f24578d;
                if (interfaceC3322t9 != null) {
                    ((C3348u9) interfaceC3322t9).c("CloseButtonHandler", "Close button not present, not removing");
                    fl.g0 g0Var4 = fl.g0.f38750a;
                }
            }
        }
        if (c10.f24577c) {
            View viewFindViewById3 = viewGroup != null ? viewGroup.findViewById(65531) : null;
            if (viewFindViewById3 != null) {
                InterfaceC3322t9 interfaceC3322t11 = c10.f24578d;
                if (interfaceC3322t11 != null) {
                    ((C3348u9) interfaceC3322t11).c("CloseButtonHandler", "Close region already present, not adding again");
                }
                c10.a(viewFindViewById3);
                return;
            }
            Context context2 = c10.f24575a.getContext();
            kotlin.jvm.internal.s.g(context2, "getContext(...)");
            View c3163n6 = new C3163n5(context2, (byte) 1, c10.f24578d);
            c3163n6.setId(65531);
            B5.f24500a.getClass();
            if (B5.x()) {
                c3163n6.setElevation(1.7014117E38f);
            }
            c3163n6.setOnClickListener(onClickListener);
            c10.a(c3163n6);
            if (viewGroup != null) {
                viewGroup.addView(c3163n6, layoutParams);
            }
            layoutParams.setMargins(0, mo2.f25296b, mo2.f25297c, 0);
            return;
        }
        View viewFindViewById4 = c10.f24575a.getRootView().findViewById(65531);
        if (viewFindViewById4 != null) {
            Bo webViewFactory2 = c10.f24575a.getWebViewFactory();
            webViewFactory2.getClass();
            kotlin.jvm.internal.s.h("default", "id");
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = (GestureDetectorOnGestureListenerC3228pi) webViewFactory2.f24572b.get("default");
            if (gestureDetectorOnGestureListenerC3228pi2 != null && (viewableAd2 = gestureDetectorOnGestureListenerC3228pi2.getViewableAd()) != null) {
                viewableAd2.a(viewFindViewById4);
            }
            ViewParent parent2 = viewFindViewById4.getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(viewFindViewById4);
                g0Var2 = fl.g0.f38750a;
            }
            if (g0Var2 != null) {
                return;
            }
        }
        InterfaceC3322t9 interfaceC3322t12 = c10.f24578d;
        if (interfaceC3322t12 != null) {
            ((C3348u9) interfaceC3322t12).c("CloseButtonHandler", "Close region not present, not removing");
            fl.g0 g0Var5 = fl.g0.f38750a;
        }
    }

    public final void a(View view) {
        Wn viewableAd;
        Bo webViewFactory = this.f24575a.getWebViewFactory();
        webViewFactory.getClass();
        kotlin.jvm.internal.s.h("default", "id");
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) webViewFactory.f24572b.get("default");
        if (gestureDetectorOnGestureListenerC3228pi == null || (viewableAd = gestureDetectorOnGestureListenerC3228pi.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(view, FriendlyObstructionPurpose.CLOSE_AD);
    }

    public final fl.q a() {
        float f10 = N5.d().f25465c;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: yh.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3.a(this.f57995a, view);
            }
        };
        int i10 = (int) (50 * f10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(11);
        return fl.w.a(onClickListener, layoutParams);
    }

    public static final void a(C3 c10, View view) {
        try {
            c10.f24575a.n();
        } catch (Exception e10) {
            e10.getMessage();
            Sb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }
}
