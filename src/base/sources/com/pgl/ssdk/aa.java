package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f35281a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f35282b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f35283c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f35284d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f35285e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f35286f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f35287g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static DisplayManager f35288h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements DisplayManager.DisplayListener {
        a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
            aa.b(i10, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            aa.b(i10, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
            aa.b(i10, 2);
        }
    }

    public static void b(Context context) {
        Handler handlerB;
        if (f35282b) {
            return;
        }
        if (f35281a == null) {
            f35281a = new a();
        }
        if (f35288h == null) {
            f35288h = (DisplayManager) context.getSystemService("display");
        }
        if (f35288h == null || (handlerB = ar.b()) == null) {
            return;
        }
        try {
            f35288h.registerDisplayListener(f35281a, handlerB);
            f35282b = true;
        } catch (Exception unused) {
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        boolean z10 = false;
        Object objA = av.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = av.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = av.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        if (objA != null && objA3 != null && ((Integer) objA).intValue() == ((Integer) objA3).intValue()) {
            z10 = true;
        }
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf(z10));
    }

    private static String a(int i10) {
        Display display = f35288h.getDisplay(i10);
        return display != null ? a(display) : "pd";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        try {
            String strA = a(i10);
            if (i11 == 1) {
                if (strA.equals(f35283c)) {
                    return;
                }
                f35283c = strA;
            } else {
                if (i11 != 2) {
                    if (i11 != 3 || strA.equals(f35285e)) {
                        return;
                    }
                    f35285e = strA;
                    return;
                }
                if (strA.equals(f35284d)) {
                    return;
                }
                f35284d = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (f35282b && (f35283c != null || f35284d != null || f35285e != null)) {
            return true;
        }
        if (f35282b && f35286f) {
            return f35287g;
        }
        if (context == null) {
            return false;
        }
        if (f35288h == null) {
            f35288h = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f35288h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            for (Display display : displays) {
                if (display != null && display.getDisplayId() != 0) {
                    f35287g = true;
                    break;
                }
            }
        }
        f35286f = true;
        return f35287g;
    }
}
