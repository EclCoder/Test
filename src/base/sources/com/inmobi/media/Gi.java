package com.inmobi.media;

import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.inmobi.media.Gi;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fl.k f24873a = fl.l.b(new tl.a() { // from class: yh.s1
        @Override // tl.a
        public final Object invoke() {
            return Gi.a();
        }
    });

    public static final JSONObject a(String str, int i10) throws JSONException {
        JSONObject jSONObjectA = AbstractC3073jj.a(str, "targetViewId", "id", str);
        jSONObjectA.put("errorCode", i10);
        return jSONObjectA;
    }

    public static final Mo b(WindowInsets windowInsets) {
        kotlin.jvm.internal.s.h(windowInsets, "<this>");
        Mo moE = e(windowInsets);
        Mo moC = c(windowInsets);
        Mo moD = d(windowInsets);
        kotlin.jvm.internal.s.h(windowInsets, "<this>");
        Insets insets = windowInsets.getInsets(n0.k1.s.e());
        kotlin.jvm.internal.s.g(insets, "getInsets(...)");
        return a(moE, moC, moD, new Mo(insets.left, insets.top, insets.right, insets.bottom));
    }

    public static final Mo c(WindowInsets windowInsets) {
        kotlin.jvm.internal.s.h(windowInsets, "<this>");
        B5.f24500a.getClass();
        if (B5.t()) {
            Insets insets = windowInsets.getInsets(n0.k1.s.a());
            kotlin.jvm.internal.s.g(insets, "getInsets(...)");
            return new Mo(insets.left, insets.top, insets.right, insets.bottom);
        }
        if (!B5.r()) {
            return (Mo) f24873a.getValue();
        }
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        int safeInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        int safeInsetTop = displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0;
        DisplayCutout displayCutout3 = windowInsets.getDisplayCutout();
        int safeInsetRight = displayCutout3 != null ? displayCutout3.getSafeInsetRight() : 0;
        DisplayCutout displayCutout4 = windowInsets.getDisplayCutout();
        return new Mo(safeInsetLeft, safeInsetTop, safeInsetRight, displayCutout4 != null ? displayCutout4.getSafeInsetBottom() : 0);
    }

    public static final Mo d(WindowInsets windowInsets) {
        int iSin;
        int iSin2;
        int iSin3;
        kotlin.jvm.internal.s.h(windowInsets, "<this>");
        B5.f24500a.getClass();
        if (!B5.u()) {
            return (Mo) f24873a.getValue();
        }
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(3);
        int iSin4 = 0;
        RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(0);
        RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(1);
        RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(2);
        if (roundedCorner != null) {
            iSin = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner.getRadius()));
        } else {
            iSin = 0;
        }
        if (roundedCorner2 != null) {
            iSin2 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner2.getRadius()));
        } else {
            iSin2 = 0;
        }
        if (roundedCorner3 != null) {
            iSin3 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner3.getRadius()));
        } else {
            iSin3 = 0;
        }
        if (roundedCorner4 != null) {
            iSin4 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner4.getRadius()));
        }
        return new Mo(Math.max(iSin, iSin2), Math.max(iSin2, iSin3), Math.max(iSin4, iSin3), Math.max(iSin, iSin4));
    }

    public static final Mo e(WindowInsets windowInsets) {
        kotlin.jvm.internal.s.h(windowInsets, "<this>");
        B5.f24500a.getClass();
        if (!B5.t()) {
            return B5.s() ? new Mo(windowInsets.getSystemGestureInsets().left, windowInsets.getSystemGestureInsets().top, windowInsets.getSystemGestureInsets().right, windowInsets.getSystemGestureInsets().bottom) : (Mo) f24873a.getValue();
        }
        Insets insets = windowInsets.getInsets(n0.k1.s.h());
        kotlin.jvm.internal.s.g(insets, "getInsets(...)");
        return new Mo(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final Mo a() {
        return new Mo(0, 0, 0, 0);
    }

    public static final Mo a(WindowInsets windowInsets) {
        kotlin.jvm.internal.s.h(windowInsets, "<this>");
        return a(e(windowInsets), c(windowInsets), d(windowInsets), (Mo) f24873a.getValue());
    }

    public static final Mo a(Mo area, Mo display, Mo roundedCorner, Mo navigationBar) {
        kotlin.jvm.internal.s.h(area, "area");
        kotlin.jvm.internal.s.h(display, "display");
        kotlin.jvm.internal.s.h(roundedCorner, "roundedCorner");
        kotlin.jvm.internal.s.h(navigationBar, "navigationBar");
        return new Mo(jl.a.e(area.f25295a, display.f25295a, roundedCorner.f25295a, navigationBar.f25295a), jl.a.e(area.f25296b, display.f25296b, roundedCorner.f25296b, navigationBar.f25296b), jl.a.e(area.f25297c, display.f25297c, roundedCorner.f25297c, navigationBar.f25297c), jl.a.e(area.f25298d, display.f25298d, roundedCorner.f25298d, navigationBar.f25298d));
    }

    public static final void b(Window window) {
        kotlin.jvm.internal.s.h(window, "<this>");
        B5.f24500a.getClass();
        if (B5.r()) {
            kotlin.jvm.internal.s.h(window, "<this>");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 0;
            window.setAttributes(attributes);
            n0.e1.b(window, true);
        }
    }

    public static final void a(Window window) {
        kotlin.jvm.internal.s.h(window, "<this>");
        B5.f24500a.getClass();
        if (B5.t()) {
            kotlin.jvm.internal.s.h(window, "<this>");
            n0.o1 o1VarA = n0.e1.a(window, window.getDecorView());
            kotlin.jvm.internal.s.g(o1VarA, "getInsetsController(...)");
            o1VarA.e(2);
            o1VarA.a(n0.k1.s.g());
            o1VarA.a(n0.k1.s.a());
            return;
        }
        if (B5.w()) {
            kotlin.jvm.internal.s.h(window, "<this>");
            window.getDecorView().setSystemUiVisibility(5638);
        }
    }

    public static final void c(Window window) {
        kotlin.jvm.internal.s.h(window, "<this>");
        B5.f24500a.getClass();
        if (B5.t()) {
            kotlin.jvm.internal.s.h(window, "<this>");
            n0.o1 o1VarA = n0.e1.a(window, window.getDecorView());
            kotlin.jvm.internal.s.g(o1VarA, "getInsetsController(...)");
            o1VarA.f(n0.k1.s.g());
            o1VarA.f(n0.k1.s.a());
            return;
        }
        if (B5.w()) {
            kotlin.jvm.internal.s.h(window, "<this>");
            window.getDecorView().setSystemUiVisibility(0);
        }
    }

    public static final void a(Window window, int i10) {
        kotlin.jvm.internal.s.h(window, "<this>");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = i10;
        window.setAttributes(attributes);
        n0.e1.b(window, false);
    }
}
