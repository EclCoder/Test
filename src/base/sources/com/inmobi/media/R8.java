package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.R8;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class R8 implements Of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f25614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C f25615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3372v7 f25616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f25617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public U5 f25618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Lf f25619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f25620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3322t9 f25621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Q8 f25622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final P8 f25623j;

    public R8(InMobiAdActivity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        this.f25614a = new WeakReference(activity);
        this.f25619f = Mf.a(N5.g());
        this.f25620g = 1.0f;
        this.f25622i = new Q8(this);
        this.f25623j = new P8(this);
    }

    public final void a(Intent intent, SparseArray adContainers) {
        U5 u10;
        Window window;
        kotlin.jvm.internal.s.h(intent, "intent");
        kotlin.jvm.internal.s.h(adContainers, "adContainers");
        if (!intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            Activity activity = (Activity) this.f25614a.get();
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).b();
                return;
            }
            return;
        }
        C c10 = (C) adContainers.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
        if (c10 == null) {
            Activity activity2 = (Activity) this.f25614a.get();
            if (activity2 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity2).b();
                return;
            }
            return;
        }
        int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
        if (intExtra == 0) {
            B fullScreenEventsListener = ((GestureDetectorOnGestureListenerC3228pi) c10).getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                ((C3046ii) fullScreenEventsListener).a();
            }
            Activity activity3 = (Activity) this.f25614a.get();
            if (activity3 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity3).b();
                return;
            }
            return;
        }
        if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.f25614a.get() instanceof InMobiAdActivity)) {
            Object obj = this.f25614a.get();
            kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            if (!((InMobiAdActivity) obj).f24412g) {
                Object obj2 = this.f25614a.get();
                kotlin.jvm.internal.s.f(obj2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((InMobiAdActivity) obj2).f24412g = true;
                if (!(c10 instanceof GestureDetectorOnGestureListenerC3228pi) ? false : ((GestureDetectorOnGestureListenerC3228pi) c10).X0) {
                    InterfaceC3322t9 interfaceC3322t9 = this.f25621h;
                    if (interfaceC3322t9 != null) {
                        ((C3348u9) interfaceC3322t9).a("InMobiActivityViewHandler", "showInImmersiveMode");
                    }
                    Object obj3 = this.f25614a.get();
                    InMobiAdActivity inMobiAdActivity = obj3 instanceof InMobiAdActivity ? (InMobiAdActivity) obj3 : null;
                    if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                        B5.f24500a.getClass();
                        if (B5.t()) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.layoutInDisplayCutoutMode = 3;
                            window.setAttributes(attributes);
                            n0.e1.b(window, false);
                        } else if (B5.r()) {
                            WindowManager.LayoutParams attributes2 = window.getAttributes();
                            attributes2.layoutInDisplayCutoutMode = 1;
                            window.setAttributes(attributes2);
                            n0.e1.b(window, false);
                        }
                        if (B5.t()) {
                            n0.o1 o1VarA = n0.e1.a(window, window.getDecorView());
                            kotlin.jvm.internal.s.g(o1VarA, "getInsetsController(...)");
                            o1VarA.e(2);
                            o1VarA.a(n0.k1.s.g());
                            o1VarA.a(n0.k1.s.a());
                        } else if (B5.w()) {
                            window.getDecorView().setSystemUiVisibility(5638);
                        }
                    }
                } else {
                    Activity activity4 = (Activity) this.f25614a.get();
                    if (activity4 != null) {
                        kotlin.jvm.internal.s.h(activity4, "<this>");
                        try {
                            activity4.requestWindowFeature(1);
                            activity4.getWindow().setFlags(UserVerificationMethods.USER_VERIFY_ALL, UserVerificationMethods.USER_VERIFY_ALL);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if ((200 == intExtra && !kotlin.jvm.internal.s.c("html", ((GestureDetectorOnGestureListenerC3228pi) c10).getMarkupType())) || ((202 == intExtra && !kotlin.jvm.internal.s.c("htmlUrl", ((GestureDetectorOnGestureListenerC3228pi) c10).getMarkupType())) || (201 == intExtra && !kotlin.jvm.internal.s.c("inmobiJson", ((GestureDetectorOnGestureListenerC3228pi) c10).getMarkupType())))) {
            B fullScreenEventsListener2 = ((GestureDetectorOnGestureListenerC3228pi) c10).getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                ((C3046ii) fullScreenEventsListener2).a();
            }
            Activity activity5 = (Activity) this.f25614a.get();
            if (activity5 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity5).b();
                return;
            }
            return;
        }
        try {
            this.f25615b = c10;
            ((GestureDetectorOnGestureListenerC3228pi) c10).setFullScreenActivityContext((Activity) this.f25614a.get());
            a();
            Activity activity6 = (Activity) this.f25614a.get();
            if (activity6 != null) {
                RelativeLayout relativeLayout = new RelativeLayout(activity6);
                relativeLayout.setId(65534);
                this.f25617d = relativeLayout;
            }
            a(c10);
            C3372v7 c3372v7 = this.f25616c;
            if (c3372v7 != null) {
                c3372v7.d();
            }
            Activity activity7 = (Activity) this.f25614a.get();
            if (activity7 != null) {
                FrameLayout frameLayout = (FrameLayout) activity7.findViewById(R.id.content);
                RelativeLayout relativeLayout2 = frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null;
                RelativeLayout relativeLayout3 = this.f25617d;
                if (relativeLayout3 != null && relativeLayout2 != null) {
                    RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout2.findViewById(65534);
                    if (relativeLayout4 != null) {
                        relativeLayout2.removeView(relativeLayout4);
                    }
                    relativeLayout2.addView(relativeLayout3);
                    C3372v7 c3372v8 = this.f25616c;
                    if (c3372v8 != null) {
                        c3372v8.c();
                    }
                }
            }
            if (c10 instanceof GestureDetectorOnGestureListenerC3228pi) {
                ((GestureDetectorOnGestureListenerC3228pi) c10).setEmbeddedBrowserJsCallbacks(this.f25623j);
            }
            if (!(c10 instanceof GestureDetectorOnGestureListenerC3228pi) || (u10 = this.f25618e) == null) {
                return;
            }
            u10.setUserLeftApplicationListener(((GestureDetectorOnGestureListenerC3228pi) c10).getListener());
        } catch (Exception e10) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) c10;
            gestureDetectorOnGestureListenerC3228pi.setFullScreenActivityContext(null);
            B fullScreenEventsListener3 = gestureDetectorOnGestureListenerC3228pi.getFullScreenEventsListener();
            if (fullScreenEventsListener3 != null) {
                ((C3046ii) fullScreenEventsListener3).a();
            }
            Activity activity8 = (Activity) this.f25614a.get();
            if (activity8 instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity8).b();
            }
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }

    public final void b(Lf lf2) {
        Objects.toString(lf2);
        this.f25619f = lf2;
    }

    public final void c() {
        try {
            final U5 u10 = this.f25618e;
            if (u10 != null) {
                ViewParent parent = u10.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(u10);
                }
                ViewParent parent2 = u10.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.post(new Runnable() { // from class: yh.w3
                        @Override // java.lang.Runnable
                        public final void run() {
                            R8.a(u10);
                        }
                    });
                }
            }
            U5 u11 = this.f25618e;
            if (u11 != null) {
                Z5 z10 = u11.f25807c;
                if (z10 != null) {
                    z10.destroy();
                }
                u11.f25807c = null;
                u11.f25808d = null;
                u11.f25809e = null;
                Oo oo2 = u11.f25811g;
                if (oo2 != null) {
                    oo2.a();
                }
                u11.removeAllViews();
            }
            this.f25618e = null;
            GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
            a(Vh.a("IN_CUSTOM_EXPAND", "onClose"));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    public final void b() {
        P5 p5D;
        Activity activity;
        if (this.f25618e == null) {
            return;
        }
        C c10 = this.f25615b;
        if (c10 != null) {
            if ((!(c10 instanceof GestureDetectorOnGestureListenerC3228pi) ? false : ((GestureDetectorOnGestureListenerC3228pi) c10).X0) || ((activity = (Activity) this.f25614a.get()) != null && J3.a(activity))) {
                p5D = N5.h();
            } else {
                p5D = N5.d();
            }
        } else {
            p5D = N5.d();
        }
        float f10 = p5D.f25463a;
        float f11 = p5D.f25465c;
        float f12 = f10 * f11;
        float f13 = p5D.f25464b * f11;
        if (Mf.b(this.f25619f)) {
            a(vl.a.b((1 - this.f25620g) * f12), -1);
        } else {
            a(-1, vl.a.b((1 - this.f25620g) * f13));
        }
    }

    public final void a() {
        Activity activity = (Activity) this.f25614a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        if ((frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void a(C c10) {
        RelativeLayout relativeLayout;
        if (((Activity) this.f25614a.get()) == null || (relativeLayout = this.f25617d) == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = (GestureDetectorOnGestureListenerC3228pi) c10;
        String markupType = gestureDetectorOnGestureListenerC3228pi.getMarkupType();
        if (!kotlin.jvm.internal.s.c(markupType, "html") && !kotlin.jvm.internal.s.c(markupType, "htmlUrl")) {
            throw new IllegalArgumentException("InMobiActivityViewHandler: Unknown Markup type");
        }
        C3372v7 c3372v7 = new C3372v7(this.f25614a, gestureDetectorOnGestureListenerC3228pi, relativeLayout);
        this.f25616c = c3372v7;
        c3372v7.a(this.f25619f);
        c3372v7.f27690c = this.f25620g;
        c3372v7.f27691d = gestureDetectorOnGestureListenerC3228pi.X0;
    }

    public final void a(JSONObject jsonObject) {
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        C c10 = this.f25615b;
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = c10 instanceof GestureDetectorOnGestureListenerC3228pi ? (GestureDetectorOnGestureListenerC3228pi) c10 : null;
        if (gestureDetectorOnGestureListenerC3228pi != null) {
            gestureDetectorOnGestureListenerC3228pi.c(jsonObject);
        }
    }

    @Override // com.inmobi.media.Of
    public final void a(Lf orientation) {
        kotlin.jvm.internal.s.h(orientation, "orientation");
        if (((Activity) this.f25614a.get()) == null) {
            return;
        }
        C3372v7 c3372v7 = this.f25616c;
        if (c3372v7 != null) {
            c3372v7.a(orientation);
        }
        Lf lf2 = this.f25619f;
        if (lf2 != orientation && Mf.b(lf2) != Mf.b(orientation)) {
            b(orientation);
            C3372v7 c3372v8 = this.f25616c;
            if (c3372v8 != null) {
                c3372v8.c();
            }
            b();
            return;
        }
        b(orientation);
    }

    public static final void a(R8 r10) {
        r10.f25620g = 1.0f;
        C3372v7 c3372v7 = r10.f25616c;
        if (c3372v7 != null) {
            c3372v7.f27690c = 1.0f;
            c3372v7.c();
        }
        U5 u10 = r10.f25618e;
        if (u10 != null) {
            u10.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        r10.c();
    }

    public static final void a(U5 u10) {
        u10.getParent().requestLayout();
    }

    public final void a(int i10, int i11) {
        RelativeLayout.LayoutParams layoutParams;
        Activity activity = (Activity) this.f25614a.get();
        if (activity == null) {
            return;
        }
        Mf.b(this.f25619f);
        if (Mf.b(this.f25619f)) {
            layoutParams = new RelativeLayout.LayoutParams(i10, i11);
            layoutParams.addRule(11);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(i10, i11);
            layoutParams.addRule(12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(R.id.content)).findViewById(65519);
        kotlin.jvm.internal.s.e(relativeLayout);
        if (((RelativeLayout) relativeLayout.findViewById(65518)) != null) {
            U5 u10 = this.f25618e;
            if (u10 != null) {
                u10.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        U5 u11 = this.f25618e;
        if (u11 != null) {
            relativeLayout.addView(u11, layoutParams);
        }
    }
}
