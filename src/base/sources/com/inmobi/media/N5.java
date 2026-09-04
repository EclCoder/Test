package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.hardware.display.DisplayManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import com.inmobi.media.N5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import o4.Wz.OGoz;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class N5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f25315c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static JSONObject f25318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Integer f25319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Float f25320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f25321i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P5 f25313a = new P5(0, 0, 2.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M5 f25314b = new M5(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static float f25316d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f25317e = true;

    static {
        B5.f24500a.getClass();
        f25321i = B5.w();
    }

    public static String a() {
        Display displayA;
        Context context = Xi.f26021a;
        if (context == null || (displayA = a(context)) == null) {
            return "0x0";
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        return displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
    }

    public static float b() {
        Display displayA;
        if (f25316d == -1.0f) {
            Context context = Xi.f26021a;
            if (context == null || (displayA = a(context)) == null) {
                return 2.0f;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayA.getMetrics(displayMetrics);
            float f10 = displayMetrics.density;
            if (f10 == 0.0f) {
                return 2.0f;
            }
            f25316d = f10;
        }
        return f25316d;
    }

    public static HashMap c() {
        HashMap map = new HashMap();
        try {
            map.put("d-device-screen-density", String.valueOf(b()));
            map.put("d-device-screen-size", e());
            map.put("d-density-dependent-screen-size", a());
            map.put("d-orientation", String.valueOf((int) g()));
            Float f10 = f25320h;
            map.put("d-textsize", String.valueOf(f10 != null ? f10.floatValue() : 37.0f));
            return map;
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("N5", "TAG");
            e10.getMessage();
            return map;
        }
    }

    public static P5 d() {
        Context context = Xi.f26021a;
        if (context == null) {
            return f25313a;
        }
        Display displayA = a(context);
        if (displayA == null) {
            return f25313a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new P5((int) (displayMetrics.widthPixels / f10), (int) (displayMetrics.heightPixels / f10), f10);
    }

    public static String e() {
        P5 p5D = d();
        return p5D.f25463a + "X" + p5D.f25464b;
    }

    public static Integer f() {
        Context context = Xi.f26021a;
        if (context == null) {
            return null;
        }
        int i10 = Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", -1);
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return i10 != 2 ? null : 1;
    }

    public static byte g() {
        Display displayA;
        int rotation;
        Context context = Xi.f26021a;
        if (context == null || (displayA = a(context)) == null || (rotation = displayA.getRotation()) == 0) {
            return (byte) 1;
        }
        if (rotation == 1) {
            return (byte) 3;
        }
        if (rotation == 2) {
            return (byte) 2;
        }
        if (rotation == 3) {
            return (byte) 4;
        }
        kotlin.jvm.internal.s.g("N5", "TAG");
        return (byte) 1;
    }

    public static P5 h() {
        Context context = Xi.f26021a;
        if (context == null) {
            return f25313a;
        }
        Display displayA = a(context);
        if (displayA == null) {
            return f25313a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getRealMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new P5((int) (displayMetrics.widthPixels / f10), (int) (displayMetrics.heightPixels / f10), f10);
    }

    public static void i() {
        if (f25321i) {
            if (f() != null) {
                kotlin.jvm.internal.s.g("N5", "TAG");
                return;
            }
            Context context = Xi.f26021a;
            if (context == null) {
                return;
            }
            ConcurrentHashMap concurrentHashMap = La.f25197b;
            La laA = Ka.a(context, "display_info_store");
            kotlin.jvm.internal.s.h("nav_bar_type", "key");
            int i10 = laA.f25198a.getInt("nav_bar_type", -1);
            Integer numValueOf = Integer.valueOf(i10);
            f25319g = numValueOf;
            if (i10 == -1) {
                numValueOf = null;
            }
            f25319g = numValueOf;
            kotlin.jvm.internal.s.g("N5", "TAG");
        }
    }

    public static void j() {
        Context context;
        if (f25321i && (context = Xi.f26021a) != null) {
            ConcurrentHashMap concurrentHashMap = La.f25197b;
            La laA = Ka.a(context, "display_info_store");
            kotlin.jvm.internal.s.h("safe_area", "key");
            JSONObject jSONObject = null;
            String string = laA.f25198a.getString("safe_area", null);
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    kotlin.jvm.internal.s.g("N5", "TAG");
                }
            }
            f25318f = jSONObject;
            kotlin.jvm.internal.s.g("N5", "TAG");
            Objects.toString(f25318f);
        }
    }

    public static final void b(WindowInsets windowInsets, Context context) {
        try {
            String string = windowInsets.getSystemGestureInsets().toString();
            kotlin.jvm.internal.s.g(string, "toString(...)");
            String[] strArr = (String[]) new bm.o("Insets").j(string, 0).toArray(new String[0]);
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr.length > 1) {
                String[] strArr2 = (String[]) new bm.o(",").j(new bm.o("[^0-9,=a-zA-Z]*").i(strArr[1], ""), 0).toArray(new String[0]);
                stringBuffer.append("{");
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String[] strArr3 = (String[]) new bm.o("=").j(strArr2[i10], 0).toArray(new String[0]);
                    if (strArr3.length == 2) {
                        stringBuffer.append("\"" + strArr3[0] + "\"");
                        stringBuffer.append(":");
                        stringBuffer.append(J3.b(((float) Integer.parseInt(strArr3[1])) / b()));
                        if (i10 < strArr2.length - 1) {
                            stringBuffer.append(", ");
                        }
                    }
                }
                stringBuffer.append("}");
            }
            if (stringBuffer.length() > 0) {
                f25315c = stringBuffer.toString();
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                kotlin.jvm.internal.s.e(context);
                Ka.a(context, "display_info_store").a("gesture_margin", stringBuffer.toString(), false);
            }
        } catch (Exception unused) {
            kotlin.jvm.internal.s.g("N5", "TAG");
        }
    }

    public static void a(final Integer num) {
        final Context context = Xi.f26021a;
        if (context == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: yh.p2
            @Override // java.lang.Runnable
            public final void run() {
                N5.a(num, context);
            }
        };
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static final void c(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if (f25317e || !(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        a(rootWindowInsets, context);
    }

    public static void a(final LinkedHashMap value) {
        kotlin.jvm.internal.s.h(value, "value");
        final Context context = Xi.f26021a;
        if (context == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: yh.r2
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                N5.a(value, context);
            }
        };
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static void a(final WindowInsets insets, final Context context) {
        kotlin.jvm.internal.s.h(insets, "insets");
        if (f25317e) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: yh.q2
            @Override // java.lang.Runnable
            public final void run() {
                N5.b(insets, context);
            }
        };
        Context context2 = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, OGoz.oog);
        Xi.f26027g.submit(runnable);
    }

    public static Display a(Context context) {
        B5.f24500a.getClass();
        Object systemService = context.getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        if (displayManager != null) {
            return displayManager.getDisplay(0);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    public static int a(WindowInsets insets) {
        int i10;
        kotlin.jvm.internal.s.h(insets, "insets");
        B5.f24500a.getClass();
        if (B5.t()) {
            Lf lfA = Mf.a(g());
            Insets insets2 = insets.getInsets(n0.k1.s.h());
            kotlin.jvm.internal.s.g(insets2, "getInsets(...)");
            int iOrdinal = lfA.ordinal();
            i10 = 1;
            if (iOrdinal == 0) {
                if (insets2.left == 0 && insets2.right == 0) {
                    i10 = 0;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        if (insets2.right == 0 && insets2.bottom == 0) {
                            i10 = 0;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (insets2.left == 0) {
                    i10 = 0;
                }
            } else if (insets2.left == 0 && insets2.bottom == 0) {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        kotlin.jvm.internal.s.g("N5", "TAG");
        return i10;
    }

    public static final void a(Map map, Context context) throws JSONException {
        kotlin.jvm.internal.s.g("N5", "TAG");
        Objects.toString(map);
        if (f25318f == null) {
            f25318f = new JSONObject();
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            JSONObject jSONObject = f25318f;
            if (jSONObject != null) {
                jSONObject.put(String.valueOf(iIntValue), map.get(Integer.valueOf(iIntValue)));
            }
        }
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        La laA = Ka.a(context, "display_info_store");
        JSONObject jSONObject2 = f25318f;
        laA.a("safe_area", jSONObject2 != null ? jSONObject2.toString() : null, false);
    }

    public static M5 b(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        Display displayA = a(context);
        if (displayA == null) {
            return f25314b;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getRealMetrics(displayMetrics);
        return new M5(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static final void a(Integer num, Context context) {
        kotlin.jvm.internal.s.g("N5", "TAG");
        f25319g = num;
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        Ka.a(context, "display_info_store").a("nav_bar_type", num != null ? num.intValue() : -1, false);
    }
}
