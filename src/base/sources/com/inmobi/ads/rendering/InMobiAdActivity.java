package com.inmobi.ads.rendering;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.inmobi.ads.R;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.B;
import com.inmobi.media.B5;
import com.inmobi.media.C;
import com.inmobi.media.C2988gb;
import com.inmobi.media.C3022hj;
import com.inmobi.media.C3046ii;
import com.inmobi.media.C3163n5;
import com.inmobi.media.C3348u9;
import com.inmobi.media.C3372v7;
import com.inmobi.media.EnumC2970fj;
import com.inmobi.media.GestureDetectorOnGestureListenerC3228pi;
import com.inmobi.media.Gi;
import com.inmobi.media.InterfaceC3322t9;
import com.inmobi.media.J3;
import com.inmobi.media.Nf;
import com.inmobi.media.Oo;
import com.inmobi.media.R8;
import com.inmobi.media.T8;
import com.inmobi.media.U5;
import com.inmobi.media.V8;
import com.inmobi.media.Vh;
import com.inmobi.media.W8;
import com.inmobi.media.Xa;
import com.inmobi.media.Y5;
import com.inmobi.media.Z5;
import com.inmobi.media.core.config.models.AdConfig;
import em.b2;
import em.c1;
import em.o0;
import em.p0;
import em.u2;
import em.z1;
import fl.k;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/inmobi/ads/rendering/InMobiAdActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/inmobi/media/U8", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class InMobiAdActivity extends Activity {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseArray f24404t = new SparseArray();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static GestureDetectorOnGestureListenerC3228pi f24405u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T8 f24406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public R8 f24407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3228pi f24408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3322t9 f24413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Oo f24414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OnBackInvokedCallback f24415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o0 f24417l = p0.a(u2.b(null, 1, null).plus(c1.c().X0()));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z1 f24418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RelativeLayout f24421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public FrameLayout f24422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C2988gb f24423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f24424s;

    public static final void a(InMobiAdActivity inMobiAdActivity) {
        inMobiAdActivity.c();
    }

    public static final boolean b(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        Y5 y10;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = inMobiAdActivity.f24408c;
        if (gestureDetectorOnGestureListenerC3228pi != null && (y10 = gestureDetectorOnGestureListenerC3228pi.E0) != null) {
            Y5.a(y10, 6, true, null, 12);
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = inMobiAdActivity.f24408c;
        if (gestureDetectorOnGestureListenerC3228pi2 != null) {
            gestureDetectorOnGestureListenerC3228pi2.reload();
        }
        return true;
    }

    public static final boolean c(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        Y5 y10;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = inMobiAdActivity.f24408c;
        if (gestureDetectorOnGestureListenerC3228pi == null || !gestureDetectorOnGestureListenerC3228pi.canGoBack()) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = inMobiAdActivity.f24408c;
            if (gestureDetectorOnGestureListenerC3228pi2 != null && (y10 = gestureDetectorOnGestureListenerC3228pi2.E0) != null) {
                Y5.a(y10, 5, true, null, 12);
            }
            inMobiAdActivity.f24410e = true;
            inMobiAdActivity.b();
        } else {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi3 = inMobiAdActivity.f24408c;
            if (gestureDetectorOnGestureListenerC3228pi3 != null) {
                gestureDetectorOnGestureListenerC3228pi3.goBack();
            }
        }
        return true;
    }

    public static final boolean d(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = inMobiAdActivity.f24408c;
        if (gestureDetectorOnGestureListenerC3228pi2 != null && gestureDetectorOnGestureListenerC3228pi2.canGoForward() && (gestureDetectorOnGestureListenerC3228pi = inMobiAdActivity.f24408c) != null) {
            gestureDetectorOnGestureListenerC3228pi.goForward();
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        s.h(newConfig, "newConfig");
        InterfaceC3322t9 interfaceC3322t9 = this.f24413h;
        if (interfaceC3322t9 != null) {
            s.g("InMobiAdActivity", "TAG");
            ((C3348u9) interfaceC3322t9).c("InMobiAdActivity", "onConfigChanged");
        }
        super.onConfigurationChanged(newConfig);
        T8 t10 = this.f24406a;
        if (t10 != null) {
            t10.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0155, code lost:
    
        r0 = null;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r33) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.rendering.InMobiAdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        R8 r10;
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi;
        Y5 y10;
        B fullScreenEventsListener;
        InterfaceC3322t9 interfaceC3322t9 = this.f24413h;
        if (interfaceC3322t9 != null) {
            s.g("InMobiAdActivity", "TAG");
            ((C3348u9) interfaceC3322t9).c("InMobiAdActivity", "onDestroy");
        }
        int i10 = this.f24409d;
        if (100 == i10) {
            a();
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = f24405u;
            if (gestureDetectorOnGestureListenerC3228pi2 != null) {
                GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
                gestureDetectorOnGestureListenerC3228pi2.c(Vh.a("IN_CUSTOM_BROWSER", "onClose"));
            }
            f24405u = null;
        } else if (102 == i10 && (r10 = this.f24407b) != null && r10.f25618e != null) {
            GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
            r10.a(Vh.a("IN_CUSTOM_EXPAND", "onClose"));
        }
        if (this.f24410e) {
            int i11 = this.f24409d;
            if (100 == i11) {
                GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi3 = this.f24408c;
                if (gestureDetectorOnGestureListenerC3228pi3 != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC3228pi3.getFullScreenEventsListener()) != null) {
                    try {
                        C3046ii c3046ii = (C3046ii) fullScreenEventsListener;
                        InterfaceC3322t9 interfaceC3322t10 = c3046ii.f26753a.f27233i;
                        if (interfaceC3322t10 != null) {
                            String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
                            s.g(str, "access$getTAG$cp(...)");
                            ((C3348u9) interfaceC3322t10).a(str, "onAdScreenDismissed");
                        }
                        if (s.c("Default", c3046ii.f26753a.getViewState())) {
                            c3046ii.f26753a.setAndUpdateViewState("Hidden");
                        }
                        c3046ii.f26753a.W();
                        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi4 = this.f24408c;
                        s.e(gestureDetectorOnGestureListenerC3228pi4);
                        gestureDetectorOnGestureListenerC3228pi4.b();
                        T8 t10 = this.f24406a;
                        if (t10 == null) {
                            s.w("orientationHandler");
                            t10 = null;
                        }
                        GestureDetectorOnGestureListenerC3228pi orientationListener = this.f24408c;
                        s.e(orientationListener);
                        t10.getClass();
                        s.h(orientationListener, "orientationListener");
                        t10.f25740b.remove(orientationListener);
                        t10.a();
                        this.f24408c = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i11) {
                R8 orientationListener2 = this.f24407b;
                if (orientationListener2 != null) {
                    T8 t11 = this.f24406a;
                    if (t11 == null) {
                        s.w("orientationHandler");
                        t11 = null;
                    }
                    t11.getClass();
                    s.h(orientationListener2, "orientationListener");
                    t11.f25740b.remove(orientationListener2);
                    t11.a();
                    C3372v7 c3372v7 = orientationListener2.f25616c;
                    if (c3372v7 != null) {
                        c3372v7.b();
                    }
                    RelativeLayout relativeLayout = orientationListener2.f25617d;
                    if (relativeLayout != null) {
                        relativeLayout.removeAllViews();
                    }
                    U5 u10 = orientationListener2.f25618e;
                    if (u10 != null) {
                        Z5 z10 = u10.f25807c;
                        if (z10 != null) {
                            z10.destroy();
                        }
                        u10.f25807c = null;
                        u10.f25808d = null;
                        u10.f25809e = null;
                        Oo oo2 = u10.f25811g;
                        if (oo2 != null) {
                            oo2.a();
                        }
                        u10.removeAllViews();
                    }
                    orientationListener2.f25614a.clear();
                    orientationListener2.f25615b = null;
                    orientationListener2.f25616c = null;
                    orientationListener2.f25617d = null;
                    orientationListener2.f25618e = null;
                }
                this.f24407b = null;
            }
        } else {
            int i12 = this.f24409d;
            if (100 != i12 && 102 == i12) {
                R8 orientationListener3 = this.f24407b;
                if (orientationListener3 != null) {
                    T8 t12 = this.f24406a;
                    if (t12 == null) {
                        s.w("orientationHandler");
                        t12 = null;
                    }
                    t12.getClass();
                    s.h(orientationListener3, "orientationListener");
                    t12.f25740b.remove(orientationListener3);
                    t12.a();
                    C3372v7 c3372v8 = orientationListener3.f25616c;
                    if (c3372v8 != null) {
                        c3372v8.b();
                    }
                    RelativeLayout relativeLayout2 = orientationListener3.f25617d;
                    if (relativeLayout2 != null) {
                        relativeLayout2.removeAllViews();
                    }
                    U5 u11 = orientationListener3.f25618e;
                    if (u11 != null) {
                        Z5 z11 = u11.f25807c;
                        if (z11 != null) {
                            z11.destroy();
                        }
                        u11.f25807c = null;
                        u11.f25808d = null;
                        u11.f25809e = null;
                        Oo oo3 = u11.f25811g;
                        if (oo3 != null) {
                            oo3.a();
                        }
                        u11.removeAllViews();
                    }
                    orientationListener3.f25614a.clear();
                    orientationListener3.f25615b = null;
                    orientationListener3.f25616c = null;
                    orientationListener3.f25617d = null;
                    orientationListener3.f25618e = null;
                }
                this.f24407b = null;
            }
            if (100 == this.f24409d && (gestureDetectorOnGestureListenerC3228pi = this.f24408c) != null && (y10 = gestureDetectorOnGestureListenerC3228pi.E0) != null) {
                Y5.a(y10, 9, true, null, 12);
                C3022hj c3022hj = y10.f26065m;
                if (!c3022hj.f26692f && c3022hj.f26687a > 0) {
                    c3022hj.f26692f = true;
                    c3022hj.f26693g = EnumC2970fj.DONE;
                    c3022hj.a();
                }
                p0.c(c3022hj.f26690d, null, 1, null);
            }
        }
        Oo oo4 = this.f24414i;
        if (oo4 != null) {
            oo4.a();
        }
        this.f24414i = null;
        p0.c(this.f24417l, null, 1, null);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        R8 r10;
        T8 t10;
        InterfaceC3322t9 interfaceC3322t9 = this.f24413h;
        if (interfaceC3322t9 != null) {
            s.g("InMobiAdActivity", "TAG");
            ((C3348u9) interfaceC3322t9).c("InMobiAdActivity", "multiWindow mode - " + z10);
        }
        super.onMultiWindowModeChanged(z10);
        if (z10 || (r10 = this.f24407b) == null) {
            return;
        }
        C c10 = r10.f25615b;
        Nf orientationProperties = (c10 == null || !(c10 instanceof GestureDetectorOnGestureListenerC3228pi)) ? null : ((GestureDetectorOnGestureListenerC3228pi) c10).getOrientationProperties();
        if (orientationProperties == null || (t10 = this.f24406a) == null) {
            return;
        }
        t10.a(orientationProperties);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        s.h(intent, "intent");
        InterfaceC3322t9 interfaceC3322t9 = this.f24413h;
        if (interfaceC3322t9 != null) {
            s.g("InMobiAdActivity", "TAG");
            ((C3348u9) interfaceC3322t9).c("InMobiAdActivity", "onNewIntent");
        }
        super.onNewIntent(intent);
        this.f24411f = false;
        this.f24408c = null;
        setIntent(intent);
        R8 r10 = this.f24407b;
        if (r10 != null) {
            SparseArray adContainers = f24404t;
            s.h(intent, "intent");
            s.h(adContainers, "adContainers");
            r10.a(intent, adContainers);
            C3372v7 c3372v7 = r10.f25616c;
            if (c3372v7 != null) {
                c3372v7.e();
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        R8 r10;
        super.onPause();
        int i10 = this.f24409d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = f24405u;
            if (gestureDetectorOnGestureListenerC3228pi != null) {
                GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
                gestureDetectorOnGestureListenerC3228pi.c(Vh.a("IN_CUSTOM_BROWSER", "onHidden"));
                return;
            }
            return;
        }
        if (102 != i10 || (r10 = this.f24407b) == null || r10.f25618e == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
        r10.a(Vh.a("IN_CUSTOM_EXPAND", "onHidden"));
    }

    @Override // android.app.Activity
    public final void onResume() {
        C3372v7 c3372v7;
        B fullScreenEventsListener;
        InterfaceC3322t9 interfaceC3322t9 = this.f24413h;
        if (interfaceC3322t9 != null) {
            s.g("InMobiAdActivity", "TAG");
            ((C3348u9) interfaceC3322t9).c("InMobiAdActivity", "onResume");
        }
        super.onResume();
        if (this.f24410e) {
            return;
        }
        int i10 = this.f24409d;
        if (100 == i10) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24408c;
            if (gestureDetectorOnGestureListenerC3228pi != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC3228pi.getFullScreenEventsListener()) != null) {
                try {
                    if (!this.f24411f) {
                        this.f24411f = true;
                        ((C3046ii) fullScreenEventsListener).b();
                    }
                } catch (Exception unused) {
                }
            }
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = f24405u;
            if (gestureDetectorOnGestureListenerC3228pi2 != null) {
                GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
                gestureDetectorOnGestureListenerC3228pi2.c(Vh.a("IN_CUSTOM_BROWSER", "onVisible"));
                return;
            }
            return;
        }
        if (102 == i10) {
            R8 r10 = this.f24407b;
            if (r10 != null && (c3372v7 = r10.f25616c) != null && !c3372v7.f27695h) {
                try {
                    c3372v7.f27695h = true;
                    B fullScreenEventsListener2 = c3372v7.f27693f.getFullScreenEventsListener();
                    if (fullScreenEventsListener2 != null) {
                        ((C3046ii) fullScreenEventsListener2).b();
                    }
                } catch (Exception unused2) {
                }
            }
            R8 r11 = this.f24407b;
            if (r11 == null || r11.f25618e == null) {
                return;
            }
            GestureDetectorOnGestureListenerC3228pi.f27208g1.getClass();
            r11.a(Vh.a("IN_CUSTOM_EXPAND", "onVisible"));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        R8 r10;
        Window window;
        InterfaceC3322t9 interfaceC3322t9 = this.f24413h;
        if (interfaceC3322t9 != null) {
            s.g("InMobiAdActivity", "TAG");
            ((C3348u9) interfaceC3322t9).c("InMobiAdActivity", "onStart");
        }
        super.onStart();
        B5.f24500a.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.f24415j == null) {
                this.f24415j = new OnBackInvokedCallback() { // from class: xh.e
                    public final void onBackInvoked() {
                        InMobiAdActivity.a(this.f56856a);
                    }
                };
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.f24415j;
            if (onBackInvokedCallback == null) {
                s.w("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
        if (this.f24410e || 102 != this.f24409d || (r10 = this.f24407b) == null) {
            return;
        }
        C3372v7 c3372v7 = r10.f25616c;
        if (c3372v7 != null) {
            c3372v7.e();
        }
        C c10 = r10.f25615b;
        if (c10 != null) {
            if ((c10 instanceof GestureDetectorOnGestureListenerC3228pi ? ((GestureDetectorOnGestureListenerC3228pi) c10).X0 : false) && !B5.t() && B5.w()) {
                Object obj = r10.f25614a.get();
                InMobiAdActivity inMobiAdActivity = obj instanceof InMobiAdActivity ? (InMobiAdActivity) obj : null;
                if (inMobiAdActivity == null || (window = inMobiAdActivity.getWindow()) == null) {
                    return;
                }
                window.getDecorView().setSystemUiVisibility(5638);
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        InterfaceC3322t9 interfaceC3322t9 = this.f24413h;
        if (interfaceC3322t9 != null) {
            s.g("InMobiAdActivity", "TAG");
            ((C3348u9) interfaceC3322t9).c("InMobiAdActivity", "onStop");
        }
        super.onStop();
        B5.f24500a.getClass();
        if (Build.VERSION.SDK_INT >= 33 && this.f24415j != null) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.f24415j;
            if (onBackInvokedCallback == null) {
                s.w("backInvokedCallback");
                onBackInvokedCallback = null;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }
        if (this.f24409d == 100) {
            a("ACTIVITY_STOP");
        }
    }

    public final void a(AdConfig.FormatCustomBrowserConfig formatCustomBrowserConfig) {
        View viewInflate = getLayoutInflater().inflate(R.layout.inmobi_in_app_browser_activity, (ViewGroup) null);
        if (viewInflate == null) {
            return;
        }
        this.f24421p = (RelativeLayout) viewInflate.findViewById(R.id.inmobi_in_app_browser_webview_container);
        this.f24422q = (FrameLayout) viewInflate.findViewById(R.id.inmobi_in_app_browser_loader_overlay);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        layoutParams.addRule(2, R.id.inmobi_in_app_browser_bottom_bar);
        ViewGroup viewGroup = this.f24421p;
        if (viewGroup != null) {
            viewGroup.addView(this.f24408c, layoutParams);
            a(viewGroup);
            long loaderTimeout = formatCustomBrowserConfig.getLoaderTimeout();
            if (!this.f24420o || loaderTimeout <= 0) {
                FrameLayout frameLayout = this.f24422q;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            } else {
                viewGroup.setVisibility(8);
                FrameLayout frameLayout2 = this.f24422q;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                this.f24416k = true;
                if (this.f24419n) {
                    Window window = getWindow();
                    s.g(window, "getWindow(...)");
                    k kVar = Gi.f24873a;
                    s.h(window, "<this>");
                    B5.f24500a.getClass();
                    if (B5.t()) {
                        Gi.a(window, 3);
                    } else if (B5.r()) {
                        Gi.a(window, 1);
                    }
                    Window window2 = getWindow();
                    s.g(window2, "getWindow(...)");
                    Gi.a(window2);
                }
                this.f24424s = SystemClock.elapsedRealtime();
                Xa.a("InAppBrowserLoaderShown", this.f24423r, (String) null, (Long) null);
                long loaderTimeout2 = formatCustomBrowserConfig.getLoaderTimeout();
                if (this.f24416k) {
                    a();
                    this.f24418m = em.k.d(this.f24417l, null, null, new W8(loaderTimeout2, this, null), 3, null);
                }
            }
        }
        setContentView(viewInflate);
    }

    public final void b() {
        if (isTaskRoot()) {
            B5.f24500a.getClass();
            if (B5.x()) {
                finishAndRemoveTask();
                return;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        s.h(newConfig, "newConfig");
        super.onMultiWindowModeChanged(z10, newConfig);
        onMultiWindowModeChanged(z10);
    }

    public final void c() {
        Y5 y10;
        C3372v7 c3372v7;
        InterfaceC3322t9 interfaceC3322t9 = this.f24413h;
        if (interfaceC3322t9 != null) {
            s.g("InMobiAdActivity", "TAG");
            ((C3348u9) interfaceC3322t9).c("InMobiAdActivity", "onBackPressed");
        }
        int i10 = this.f24409d;
        if (i10 == 102) {
            InterfaceC3322t9 interfaceC3322t10 = this.f24413h;
            if (interfaceC3322t10 != null) {
                s.g("InMobiAdActivity", "TAG");
                ((C3348u9) interfaceC3322t10).c("InMobiAdActivity", "back pressed on ad");
            }
            R8 r10 = this.f24407b;
            if (r10 == null || (c3372v7 = r10.f25616c) == null) {
                return;
            }
            c3372v7.a();
            return;
        }
        if (i10 != 100 || this.f24416k) {
            return;
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f24413h;
        if (interfaceC3322t11 != null) {
            s.g("InMobiAdActivity", "TAG");
            ((C3348u9) interfaceC3322t11).c("InMobiAdActivity", "back pressed in browser");
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24408c;
        if (gestureDetectorOnGestureListenerC3228pi != null && (y10 = gestureDetectorOnGestureListenerC3228pi.E0) != null) {
            Y5.a(y10, 7, true, null, 12);
        }
        this.f24410e = true;
        b();
    }

    public final void a(String reason) {
        Y5 y10;
        C3022hj c3022hj;
        boolean z10;
        s.h(reason, "reason");
        if (this.f24416k) {
            InterfaceC3322t9 interfaceC3322t9 = this.f24413h;
            if (interfaceC3322t9 != null) {
                s.g("InMobiAdActivity", "TAG");
                ((C3348u9) interfaceC3322t9).a("InMobiAdActivity", "hideLoaderAndShowWebView reason=" + reason);
            }
            FrameLayout frameLayout = this.f24422q;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.f24421p;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            if (this.f24419n) {
                Window window = getWindow();
                s.g(window, "getWindow(...)");
                Gi.b(window);
                Window window2 = getWindow();
                s.g(window2, "getWindow(...)");
                Gi.c(window2);
            }
            this.f24416k = false;
            a();
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f24408c;
            if (gestureDetectorOnGestureListenerC3228pi != null && (y10 = gestureDetectorOnGestureListenerC3228pi.E0) != null && !(z10 = (c3022hj = y10.f26065m).f26692f) && !z10 && c3022hj.f26687a > 0) {
                c3022hj.f26692f = true;
                c3022hj.f26693g = EnumC2970fj.DONE;
                c3022hj.a();
            }
            Xa.a("InAppBrowserLoaderHidden", this.f24423r, reason, Long.valueOf(SystemClock.elapsedRealtime() - this.f24424s));
        }
    }

    public final void a() {
        try {
            z1 z1Var = this.f24418m;
            if (z1Var != null) {
                b2.g(z1Var);
            }
            z1 z1Var2 = this.f24418m;
            if (z1Var2 != null) {
                z1.c0(z1Var2, null, 1, null);
            }
        } catch (Exception unused) {
        }
        this.f24418m = null;
    }

    public final void a(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_bottom_bar)).getLayoutParams();
        s.f(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (J3.a(this)) {
            Oo oo2 = this.f24414i;
            if (oo2 != null) {
                oo2.a();
            }
            this.f24414i = new Oo(this, new V8(layoutParams2), this.f24413h);
        }
        C3163n5 c3163n5 = new C3163n5(this, (byte) 2, this.f24413h);
        c3163n5.setOnTouchListener(new View.OnTouchListener() { // from class: xh.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.a(this.f56852a, view, motionEvent);
            }
        });
        C3163n5 c3163n6 = new C3163n5(this, (byte) 3, this.f24413h);
        c3163n6.setOnTouchListener(new View.OnTouchListener() { // from class: xh.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.b(this.f56853a, view, motionEvent);
            }
        });
        C3163n5 c3163n7 = new C3163n5(this, (byte) 4, this.f24413h);
        c3163n7.setOnTouchListener(new View.OnTouchListener() { // from class: xh.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.c(this.f56854a, view, motionEvent);
            }
        });
        C3163n5 c3163n8 = new C3163n5(this, (byte) 6, this.f24413h);
        c3163n8.setOnTouchListener(new View.OnTouchListener() { // from class: xh.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.d(this.f56855a, view, motionEvent);
            }
        });
        try {
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_close_slot)).addView(c3163n5);
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_refresh_slot)).addView(c3163n6);
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_back_slot)).addView(c3163n7);
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_forward_slot)).addView(c3163n8);
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t9 = this.f24413h;
            if (interfaceC3322t9 != null) {
                s.g("InMobiAdActivity", "TAG");
                ((C3348u9) interfaceC3322t9).a("InMobiAdActivity", "Error setting up bottom bar buttons", e10);
            }
        }
    }

    public static final boolean a(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        Y5 y10;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = inMobiAdActivity.f24408c;
            if (gestureDetectorOnGestureListenerC3228pi != null && (y10 = gestureDetectorOnGestureListenerC3228pi.E0) != null) {
                Y5.a(y10, 5, true, null, 12);
            }
            inMobiAdActivity.f24410e = true;
            inMobiAdActivity.b();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
