package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f35293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f35294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f35295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f35296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f35297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f35298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f35299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f35300h;

    public static int a(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.touchscreen;
            }
            return 666666;
        } catch (Throwable unused) {
            return 666666;
        }
    }

    private static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f35298f = (int) displayMetrics.density;
            f35297e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f35299g = (int) displayMetrics.xdpi;
            f35300h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f35293a = displayMetrics.widthPixels;
            f35294b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f35295c = mode.getPhysicalWidth();
            f35296d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        int i10 = -1;
        if (context != null) {
            try {
                i10 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i10);
    }

    public static String f(Context context) {
        try {
            d(context);
            b(context);
            c(context);
        } catch (Throwable unused) {
        }
        return f35297e + "[<!>]" + f35293a + "," + f35294b + "[<!>]" + f35295c + "x" + f35296d + "[<!>]";
    }
}
