package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.inmobi.media.U5;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class U5 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f25805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z5 f25807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public X5 f25808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC3282rl f25809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC3322t9 f25810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Oo f25811g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5(Activity activity) {
        super(activity);
        kotlin.jvm.internal.s.h(activity, "activity");
        this.f25805a = activity;
        this.f25806b = -1;
    }

    public final void a(String expandInput, V5 inputType, boolean z10, long j10, String placementType, String impressionId, String creativeId, C2988gb c2988gb) {
        kotlin.jvm.internal.s.h(expandInput, "expandInput");
        kotlin.jvm.internal.s.h(inputType, "inputType");
        kotlin.jvm.internal.s.h(placementType, "placementType");
        kotlin.jvm.internal.s.h(impressionId, "impressionId");
        kotlin.jvm.internal.s.h(creativeId, "creativeId");
        if (this.f25807c == null) {
            Context context = getContext();
            kotlin.jvm.internal.s.g(context, "getContext(...)");
            Z5 z11 = new Z5(context, j10, placementType, impressionId, creativeId, new Function1() { // from class: yh.u4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return U5.a(this.f57951a, (JSONObject) obj);
                }
            }, this.f25810f);
            this.f25807c = z11;
            z11.setId(65517);
        }
        Z5 z12 = this.f25807c;
        if (z12 != null) {
            z12.setLandingPageTelemetryControlInfo(c2988gb);
        }
        if (this.f25806b != expandInput.hashCode()) {
            if (inputType == V5.URL) {
                Z5 z13 = this.f25807c;
                if (z13 != null) {
                    z13.loadUrl(expandInput);
                }
            } else {
                Z5 z14 = this.f25807c;
                if (z14 != null) {
                    z14.loadData(expandInput, "text/html", com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                }
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            layoutParams.addRule(2, 65533);
            Z5 z15 = this.f25807c;
            if (z15 != null) {
                z15.setLayoutParams(layoutParams);
            }
            if (findViewById(65517) == null) {
                addView(this.f25807c, layoutParams);
            }
        }
        this.f25806b = expandInput.hashCode();
        if (!z10) {
            View viewFindViewById = findViewById(65533);
            if (viewFindViewById != null) {
                removeView(viewFindViewById);
                return;
            }
            return;
        }
        if (findViewById(65533) != null) {
            return;
        }
        float f10 = N5.d().f25465c;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setId(65533);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(R.drawable.bottom_bar);
        linearLayout.setBackgroundColor(-7829368);
        setBackgroundColor(-7829368);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48 * f10));
        layoutParams2.addRule(12);
        addView(linearLayout, layoutParams2);
        if (J3.a(this.f25805a)) {
            Oo oo2 = this.f25811g;
            if (oo2 != null) {
                oo2.a();
            }
            this.f25811g = new Oo(this.f25805a, new T5(layoutParams2), this.f25810f);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams3.weight = 25.0f;
        b(linearLayout, layoutParams3);
        d(linearLayout, layoutParams3);
        a(linearLayout, layoutParams3);
        c(linearLayout, layoutParams3);
    }

    public final void b(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        C3163n5 c3163n5 = new C3163n5(context, (byte) 2, this.f25810f);
        c3163n5.setId(65516);
        c3163n5.setOnTouchListener(new View.OnTouchListener() { // from class: yh.r4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return U5.b(this.f57904a, view, motionEvent);
            }
        });
        linearLayout.addView(c3163n5, layoutParams);
    }

    public final void c(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        C3163n5 c3163n5 = new C3163n5(context, (byte) 6, this.f25810f);
        c3163n5.setId(1048283);
        c3163n5.setOnTouchListener(new View.OnTouchListener() { // from class: yh.t4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return U5.c(this.f57935a, view, motionEvent);
            }
        });
        linearLayout.addView(c3163n5, layoutParams);
    }

    public final void d(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        C3163n5 c3163n5 = new C3163n5(context, (byte) 3, this.f25810f);
        c3163n5.setId(65502);
        c3163n5.setOnTouchListener(new View.OnTouchListener() { // from class: yh.s4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return U5.d(this.f57920a, view, motionEvent);
            }
        });
        linearLayout.addView(c3163n5, layoutParams);
    }

    public final InterfaceC3282rl getUserLeftApplicationListener() {
        return this.f25809e;
    }

    public final void setEmbeddedBrowserUpdateListener(X5 browserUpdateListener) {
        kotlin.jvm.internal.s.h(browserUpdateListener, "browserUpdateListener");
        this.f25808d = browserUpdateListener;
    }

    public final void setLogger(InterfaceC3322t9 logger) {
        kotlin.jvm.internal.s.h(logger, "logger");
        this.f25810f = logger;
    }

    public final void setUserLeftApplicationListener(InterfaceC3282rl interfaceC3282rl) {
        this.f25809e = interfaceC3282rl;
    }

    public static final boolean b(U5 u10, View view, MotionEvent motionEvent) {
        Y5 y10;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            Z5 z10 = u10.f25807c;
            if (z10 != null && (y10 = z10.f26120h) != null) {
                Y5.a(y10, 5, true, null, 12);
            }
            X5 x10 = u10.f25808d;
            if (x10 != null) {
                R8.a(((Q8) x10).f25543a);
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean c(U5 u10, View view, MotionEvent motionEvent) {
        Z5 z10 = u10.f25807c;
        if (z10 == null) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (z10.canGoForward()) {
                z10.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(U5 u10, View view, MotionEvent motionEvent) {
        Y5 y10;
        Y5 y11;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            Z5 z10 = u10.f25807c;
            if (z10 != null && (y11 = z10.f26120h) != null) {
                Y5.a(y11, 6, true, null, 12);
            }
            Z5 z11 = u10.f25807c;
            if (z11 != null && (y10 = z11.f26120h) != null) {
                Y5.a(y10, 6, true, null, 12);
            }
            Z5 z12 = u10.f25807c;
            if (z12 != null) {
                z12.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final fl.g0 a(U5 u10, JSONObject jsonObject) {
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        X5 x10 = u10.f25808d;
        if (x10 != null) {
            kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
            C c10 = ((Q8) x10).f25543a.f25615b;
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = c10 instanceof GestureDetectorOnGestureListenerC3228pi ? (GestureDetectorOnGestureListenerC3228pi) c10 : null;
            if (gestureDetectorOnGestureListenerC3228pi != null) {
                gestureDetectorOnGestureListenerC3228pi.c(jsonObject);
            }
        }
        return fl.g0.f38750a;
    }

    public final void a(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        C3163n5 c3163n5 = new C3163n5(context, (byte) 4, this.f25810f);
        c3163n5.setId(65503);
        c3163n5.setOnTouchListener(new View.OnTouchListener() { // from class: yh.q4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return U5.a(this.f57888a, view, motionEvent);
            }
        });
        linearLayout.addView(c3163n5, layoutParams);
    }

    public static final boolean a(U5 u10, View view, MotionEvent motionEvent) {
        Z5 z10 = u10.f25807c;
        if (z10 == null) {
            X5 x10 = u10.f25808d;
            if (x10 != null) {
                R8.a(((Q8) x10).f25543a);
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (z10.canGoBack()) {
                z10.goBack();
            } else {
                X5 x11 = u10.f25808d;
                if (x11 != null) {
                    R8.a(((Q8) x11).f25543a);
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
