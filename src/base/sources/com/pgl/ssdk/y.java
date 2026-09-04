package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f35425a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f35426b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f35427c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f35428d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f35429e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f35430f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f35431g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f35432h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static InputManager f35433i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f35435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35436c;

        a(String str, Context context, int i10) {
            this.f35434a = str;
            this.f35435b = context;
            this.f35436c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.f35431g) {
                com.pgl.ssdk.ces.a.meta(171, null, this.f35434a);
            }
            InputManager inputManagerB = y.b(this.f35435b);
            if (inputManagerB == null) {
                return;
            }
            InputDevice inputDevice = inputManagerB.getInputDevice(this.f35436c);
            y.h();
            if (inputDevice == null) {
                y.b();
                y.c();
                y.c("nihc");
            } else if (inputDevice.isVirtual()) {
                y.d();
                y.e();
                y.c("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                y.f();
                y.g();
                y.c("eihc");
            }
        }
    }

    static /* synthetic */ int b() {
        int i10 = f35427c;
        f35427c = i10 + 1;
        return i10;
    }

    static /* synthetic */ int c() {
        int i10 = f35430f;
        f35430f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int d() {
        int i10 = f35425a;
        f35425a = i10 + 1;
        return i10;
    }

    static /* synthetic */ int e() {
        int i10 = f35428d;
        f35428d = i10 + 1;
        return i10;
    }

    static /* synthetic */ int f() {
        int i10 = f35426b;
        f35426b = i10 + 1;
        return i10;
    }

    static /* synthetic */ int g() {
        int i10 = f35429e;
        f35429e = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (f35432h) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                f35430f = sharedPreferencesA.getInt("nihc", 0);
                f35429e = sharedPreferencesA.getInt("eihc", 0);
                f35428d = sharedPreferencesA.getInt("vihc", 0);
                f35432h = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        h();
        str.getClass();
        switch (str) {
            case "eic":
                return f35426b;
            case "nic":
                return f35427c;
            case "vic":
                return f35425a;
            case "eihc":
                return f35429e;
            case "nihc":
                return f35430f;
            case "vihc":
                return f35428d;
            default:
                return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public static void a(MotionEvent motionEvent, Context context) {
        String string;
        if (motionEvent == null || context == null) {
            return;
        }
        if (f35431g) {
            try {
                if (motionEvent.getToolType(0) == 0 || motionEvent.getSource() == 0 || motionEvent.getSource() == 2) {
                    string = Arrays.toString(new Exception().getStackTrace());
                    if (string.contains("android.view.InputEventReceiver") || string.contains("android.view.ViewRootImpl$WindowInputEventReceiver") || string.contains("android.view.ViewRootImpl$InputStage")) {
                        string = null;
                    }
                } else {
                    string = null;
                }
            } catch (Throwable unused) {
            }
        } else {
            string = null;
        }
        ar.b(new a(string, context, motionEvent.getDeviceId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (f35433i == null) {
            f35433i = (InputManager) context.getSystemService("input");
        }
        return f35433i;
    }
}
