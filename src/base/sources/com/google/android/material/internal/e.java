package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import n0.e1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int iB = ac.a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z11) {
                num = Integer.valueOf(iB);
            }
            if (z12) {
                num2 = Integer.valueOf(iB);
            }
        }
        e1.b(window, !z10);
        int iD = d(window.getContext(), z10);
        int iB2 = b(window.getContext(), z10);
        i(window, iD);
        h(window, iB2);
        g(window, e(iD, ac.a.h(num.intValue())));
        f(window, e(iB2, ac.a.h(num2.intValue())));
    }

    private static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return e0.a.k(ac.a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return ac.a.b(context, R.attr.navigationBarColor, -16777216);
    }

    public static int c(Window window) {
        if (Build.VERSION.SDK_INT < 35) {
            return window.getNavigationBarColor();
        }
        return 0;
    }

    private static int d(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return ac.a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean e(int i10, boolean z10) {
        if (ac.a.h(i10)) {
            return true;
        }
        return i10 == 0 && z10;
    }

    public static void f(Window window, boolean z10) {
        e1.a(window, window.getDecorView()).c(z10);
    }

    public static void g(Window window, boolean z10) {
        e1.a(window, window.getDecorView()).d(z10);
    }

    public static void h(Window window, int i10) {
        if (Build.VERSION.SDK_INT < 35) {
            window.setNavigationBarColor(i10);
        }
    }

    public static void i(Window window, int i10) {
        if (Build.VERSION.SDK_INT < 35) {
            window.setStatusBarColor(i10);
        }
    }
}
