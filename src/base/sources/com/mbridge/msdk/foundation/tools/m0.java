package com.mbridge.msdk.foundation.tools;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.reflect.Constructor;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class m0 extends v {
    private static int A = 0;
    private static String B = "";
    private static Object C = null;
    private static int D = 0;
    private static int E = 0;
    private static long F = -1;
    private static long G = -1;
    private static String H = "";
    private static String I = "";
    private static String J = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f30910j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f30911k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f30912l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String f30913m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f30914n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f30915o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f30916p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f30917q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f30918r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static String f30919s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile int f30920t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f30921u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static String f30922v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f30923w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f30924x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static String f30925y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f30926z = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30927a;

        a(Context context) {
            this.f30927a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.c(this.f30927a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30928a;

        b(Context context) {
            this.f30928a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String defaultUserAgent;
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(this.f30928a);
            } catch (Throwable unused) {
                defaultUserAgent = null;
            }
            try {
                if (TextUtils.isEmpty(defaultUserAgent) || defaultUserAgent.equals(m0.f30925y)) {
                    return;
                }
                String unused2 = m0.f30925y = defaultUserAgent;
                m0.H(this.f30928a);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30929a;

        c(Context context) {
            this.f30929a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f30929a.getSystemService("connectivity");
                if (connectivityManager != null && com.mbridge.msdk.foundation.same.a.f30504z) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        int unused = m0.f30920t = 0;
                        return;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        int unused2 = m0.f30920t = 9;
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) this.f30929a.getSystemService("phone");
                    if (telephonyManager == null) {
                        int unused3 = m0.f30920t = 0;
                    } else {
                        int unused4 = m0.f30920t = m0.c(telephonyManager.getNetworkType());
                    }
                }
            } catch (Exception unused5) {
                int unused6 = m0.f30920t = 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = m0.f30924x = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.util.c.a();
            } catch (Exception e10) {
                q0.b("SameDiTool", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    ActivityManager activityManager = (ActivityManager) contextD.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    long unused = m0.G = memoryInfo.totalMem;
                    long unused2 = m0.F = memoryInfo.availMem;
                }
            } catch (Throwable th2) {
                q0.b("SameDiTool", th2.getMessage());
            }
        }
    }

    private static void A(Context context) {
        try {
            new Thread(new b(context)).start();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static int B() {
        try {
            if (v0.i()) {
                return 1;
            }
            return v0.j() ? 2 : 0;
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage());
            return 0;
        }
    }

    public static int C() {
        return f30926z;
    }

    public static void D(Context context) {
        try {
            v.e(context);
            p();
            r();
            t(context);
            C(context);
            B(context);
            G(context);
            o();
            t();
            p(context);
            y();
            com.mbridge.msdk.foundation.same.a.B = false;
            com.mbridge.msdk.foundation.same.a.f30504z = v0.b("android.permission.ACCESS_NETWORK_STATE", context);
            x(context);
            m();
            g.b();
            g();
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
    }

    public static int E() {
        return f30917q;
    }

    public static boolean F(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static int G(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    private static void H() {
        String str = Build.VERSION.RELEASE;
        String strO = o();
        String str2 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strO)) {
            f30925y = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Mozilla/5.0 (Linux; Android ");
        sb2.append(str);
        sb2.append("; ");
        sb2.append(strO);
        sb2.append(" Build/");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
        f30925y = sb2.toString();
    }

    public static int c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public static Object d(String str) {
        if (C == null) {
            C = v0.g(str);
        }
        return C;
    }

    public static int e(String str) {
        if (E == 0) {
            E = v0.f(str);
        }
        return E;
    }

    public static void g(Context context) {
        try {
            c cVar = new c(context);
            if (com.mbridge.msdk.foundation.same.threadpool.a.d().getActiveCount() < 1) {
                com.mbridge.msdk.foundation.same.threadpool.a.d().execute(cVar);
            }
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
    }

    public static void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                g.c(context);
            } else {
                new Handler(context.getMainLooper()).post(new a(context));
            }
        } catch (Exception e10) {
            q0.b("SameDiTool", "", e10);
        }
    }

    public static String i() {
        if (TextUtils.isEmpty(f30925y)) {
            l(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        return f30925y;
    }

    public static String j() {
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA);
        return "";
    }

    public static String k(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) || context == null) {
                return "-1";
            }
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            String str = new DecimalFormat("0.0").format((audioManager != null ? audioManager.getStreamVolume(3) : -1) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
            return TextUtils.isEmpty(str) ? "-1" : str;
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
            return "-1";
        }
    }

    public static String l(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return null;
        }
        i(context);
        try {
            if (Looper.myLooper() != Looper.getMainLooper() || MBridgeConstans.DNT_GUA_ON_UI) {
                if (TextUtils.isEmpty(f30925y)) {
                    H();
                }
                A(context);
            } else if (TextUtils.isEmpty(f30925y)) {
                try {
                    f30925y = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(f30925y)) {
                    try {
                        Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                        declaredConstructor.setAccessible(true);
                        f30925y = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                        declaredConstructor.setAccessible(false);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    if (TextUtils.isEmpty(f30925y)) {
                        try {
                            f30925y = new WebView(context).getSettings().getUserAgentString();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                    if (TextUtils.isEmpty(f30925y)) {
                        H();
                    }
                }
            } else {
                A(context);
            }
        } catch (Throwable th4) {
            q0.b("SameDiTool", th4.getMessage(), th4);
        }
        H(context);
        return f30925y;
    }

    public static int m(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapV = v(context);
            return mapV.get("height") == null ? displayMetrics.heightPixels : ((Integer) mapV.get("height")).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int n(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapV = v(context);
            return mapV.get("width") == null ? displayMetrics.widthPixels : ((Integer) mapV.get("width")).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String o() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MODEL;
    }

    public static String p(Context context) {
        Locale locale;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f30916p)) {
            if (context == null) {
                return "en-US";
            }
            try {
                if (context.getResources() == null || context.getResources().getConfiguration() == null || (locale = context.getResources().getConfiguration().locale) == null) {
                    return "en-US";
                }
                String languageTag = locale.toLanguageTag();
                f30916p = languageTag;
                return languageTag;
            } catch (Throwable th2) {
                q0.a(XTkUEXuiK.FuHQdwzr, th2.getMessage());
                f30916p = "en-US";
            }
        }
        return f30916p;
    }

    public static String q(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f30918r = "";
            } else if (TextUtils.isEmpty(f30918r)) {
                if (context == null) {
                    f30918r = "";
                    return "";
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (v0.j(simOperator)) {
                    f30918r = simOperator.substring(0, Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f30918r = "";
        }
        return f30918r;
    }

    public static String r(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f30919s = "";
            } else if (TextUtils.isEmpty(f30919s)) {
                if (context == null) {
                    f30919s = "";
                    return f30918r;
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (v0.j(simOperator)) {
                    f30919s = simOperator.substring(Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f30919s = "";
        }
        return f30919s;
    }

    public static int s(Context context) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return f30920t;
            }
            if (contextD == null) {
                return f30920t;
            }
            if (f30920t != -1) {
                g(contextD);
                return f30920t;
            }
            f30920t = 0;
            return f30920t;
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
            f30920t = 0;
            return f30920t;
        }
    }

    public static String t(Context context) {
        if (context == null) {
            return f30922v;
        }
        try {
            if (!TextUtils.isEmpty(f30922v)) {
                return f30922v;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            f30922v = str;
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String u() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static HashMap v(Context context) {
        HashMap map = new HashMap();
        if (context == null) {
            return map;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            map.put("height", Integer.valueOf(displayMetrics.heightPixels));
            map.put("width", Integer.valueOf(displayMetrics.widthPixels));
            return map;
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
            return map;
        }
    }

    public static String w() {
        try {
            if (TextUtils.isEmpty(I)) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                long jA = l0.a();
                String strJ = j(contextD);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("1", strJ);
                    jSONObject.put(obFGmWgqyy.ffxXdjBmliy, String.valueOf(G));
                    jSONObject.put("3", String.valueOf(jA));
                    jSONObject.put("4", "");
                    jSONObject.put(CampaignEx.CLICKMODE_ON, "");
                } catch (Exception e10) {
                    q0.b("SameDiTool", e10.getMessage());
                }
                String strB = com.mbridge.msdk.foundation.tools.a.b(jSONObject.toString());
                I = strB;
                if (strB == null) {
                    I = "";
                }
            }
        } catch (Exception e11) {
            q0.b("SameDiTool", e11.getMessage());
        }
        return I;
    }

    public static int x() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        long j10 = G;
        if (j10 > 0) {
            return Long.valueOf((j10 / 1000) / 1000).intValue();
        }
        return -1;
    }

    public static String y(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
            return "";
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
            return "";
        }
    }

    public static String z(Context context) {
        return (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) && context != null) ? String.valueOf(G) : "";
    }

    public static String C(Context context) {
        if (context == null) {
            return B;
        }
        try {
            if (!TextUtils.isEmpty(B)) {
                return B;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            B = str;
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static int E(Context context) {
        if (f30912l == -1) {
            f30912l = v0.c(context, "com.tencent.mm") ? 1 : 0;
        }
        return f30912l;
    }

    public static int F() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return -1;
        }
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                String str3 = Build.HARDWARE;
                if (!str3.equals("goldfish") && !str3.equals("vbox86") && !str3.contains("qemu")) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static String a(Context context, int i10) {
        TelephonyManager telephonyManager;
        if (i10 != 0 && i10 != 9) {
            try {
                return (!com.mbridge.msdk.foundation.same.a.f30504z || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
            } catch (Throwable th2) {
                q0.b("SameDiTool", th2.getMessage(), th2);
            }
        }
        return "";
    }

    public static void f(String str) {
        J = str;
    }

    public static String j(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f30911k)) {
                    f30911k = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
                }
            } else {
                f30911k = "";
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f30911k = "";
        }
        return f30911k;
    }

    public static String z() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(H)) {
            long j10 = G;
            if (j10 > 0) {
                H = Math.ceil(Float.valueOf(j10 / 1.07374182E9f).doubleValue()) + "GB";
            }
        }
        return H;
    }

    public static int A() {
        try {
            if (!s0.a().a("v_a_d_p", false)) {
                return 0;
            }
            if (v0.i()) {
                f30915o = 1;
            } else if (v0.j()) {
                f30915o = 2;
            } else {
                f30915o = 0;
            }
        } catch (Exception e10) {
            f30915o = 0;
            q0.b("SameDiTool", e10.getMessage());
        }
        return f30915o;
    }

    public static int B(Context context) {
        if (context == null) {
            return A;
        }
        int i10 = A;
        if (i10 != 0) {
            return i10;
        }
        try {
            int i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            A = i11;
            return i11;
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static int G() {
        if (f30914n == -1) {
            f30914n = v0.g() ? 1 : 0;
        }
        return f30914n;
    }

    public static void d(int i10) {
        f30917q = i10;
    }

    private static void i(Context context) {
        if (TextUtils.isEmpty(f30925y)) {
            try {
                f30925y = y0.a(context, "mbridge_ua", "").toString();
            } catch (Throwable th2) {
                q0.b("SameDiTool", th2.getMessage(), th2);
            }
        }
    }

    public static float o(Context context) {
        Resources resources;
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) && context != null && (resources = context.getResources()) != null) {
                return resources.getConfiguration().fontScale;
            }
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
        return -1.0f;
    }

    public static int u(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) && context != null) {
                return ((PowerManager) context.getSystemService(Lykgign.DcKvBuwgT)).isPowerSaveMode() ? 1 : 0;
            }
            return -1;
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
            return -1;
        }
    }

    public static int x(Context context) {
        if (context == null) {
            return f30923w;
        }
        if (f30923w == 0) {
            try {
                f30923w = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e10) {
                q0.b("SameDiTool", e10.getMessage());
            }
        }
        return f30923w;
    }

    public static void g() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new e());
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
    }

    public static int h() {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return 0;
            }
            long j10 = F;
            if (j10 > 0) {
                return Long.valueOf((j10 / 1000) / 1000).intValue();
            }
            return -1;
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
            return -1;
        }
    }

    public static String m() {
        String str;
        if (!TextUtils.isEmpty(f30913m)) {
            return f30913m;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", null).invoke(cls, null);
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
            str = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod("getVersion", null).invoke(cls2, null));
                } catch (Throwable th3) {
                    q0.b("SameDiTool", th3.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th4) {
                    q0.b("SameDiTool", th4.getMessage());
                }
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = k0.b(string);
                }
                f30913m = string;
            } else {
                f30913m = "android";
            }
        } catch (Throwable th5) {
            q0.b("SameDiTool", th5.getMessage());
        }
        return f30913m;
    }

    public static int n() {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return Build.VERSION.SDK_INT;
        }
        return -1;
    }

    public static String y() {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                return "";
            }
            if (TextUtils.isEmpty(f30924x)) {
                new Thread(new d()).start();
                return f30924x;
            }
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
        }
        return f30924x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void H(Context context) {
        try {
            y0.b(context, "mbridge_ua", f30925y);
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
        }
    }

    public static String a(String str, Context context) {
        try {
            if (!TextUtils.isEmpty(f30910j)) {
                return f30910j;
            }
            if (!TextUtils.isEmpty(str) && context != null) {
                f30910j = context.getPackageManager().getInstallerPackageName(str);
                q0.a("SameDiTool", "PKGSource:" + f30910j);
            }
            return f30910j;
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
        }
    }

    public static String t() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.BRAND;
    }

    public static Map<String, String> k() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        HashMap map = new HashMap();
        map.put("model", o());
        map.put("brand", t());
        map.put("screen_size", n(contextD) + "x" + m(contextD));
        map.put("network_type", String.valueOf(f30920t));
        map.put("useragent", f30925y);
        map.put("language", p(contextD));
        map.put("os_version", r());
        map.put("timezone", y());
        map.put("coppa", String.valueOf(com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c()));
        map.put("platform", "1");
        map.put("gaid", g.d());
        map.put("gaid2", g.f30882b);
        map.put(CampaignEx.JSON_KEY_PACKAGE_NAME, t(contextD));
        map.put("app_version_name", C(contextD));
        map.put("app_version_code", String.valueOf(B(contextD)));
        map.put("pkg_source", a(t(contextD), contextD));
        map.put("version_flag", "1");
        map.put("dyview_type", "1");
        map.put("unknown_source", String.valueOf(C()));
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put("mcc", q(contextD));
        map.put("mnc", r(contextD));
        map.put("withGP", String.valueOf(E()));
        map.put("has_wx", String.valueOf(E(contextD)));
        map.put("opensdk_ver", String.valueOf(D()));
        map.put("adid_limit", String.valueOf(g.a()));
        map.put("orientation", String.valueOf(G(contextD)));
        map.put("network_str", a(contextD, s(contextD)));
        map.put("brt", w(contextD));
        map.put("dmf", String.valueOf(F));
        map.put("dmt", String.valueOf(G));
        map.put("font", String.valueOf(o(contextD)));
        map.put("fw_type", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        map.put("h", String.valueOf(t0.c()));
        map.put("i", String.valueOf(t0.a()));
        map.put("lpm", String.valueOf(u(contextD)));
        map.put("simu", String.valueOf(F()));
        map.put("target_os_version", String.valueOf(x(contextD)));
        map.put("vol", k(contextD));
        map.put("ui_orientation", String.valueOf(G(contextD)));
        map.put("tun", String.valueOf(A()));
        map.put("gp_version", v());
        map.put("os_api_version", String.valueOf(n()));
        map.put("manufacturer", q());
        map.put("weChatSupportApi", String.valueOf(e("")));
        map.put("hasWXOpenSDK", String.valueOf(G()));
        map.put("az_aid_info_origin", g.e());
        return map;
    }

    public static String v() {
        return J;
    }

    private static void p() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new f());
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
    }

    public static String q() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    public static String r() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f30921u)) {
            f30921u = s() + "";
        }
        return f30921u;
    }

    public static int s() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String w(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return String.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Exception unused) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
    }

    public static int D() {
        if (D == 0) {
            D = v0.e();
        }
        return D;
    }

    public static void l() {
        try {
            Object objA = y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), MBridgeConstans.SP_GA_ID, "");
            Object objA2 = y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), MBridgeConstans.SP_GA_ID_LIMIT, 0);
            if (objA instanceof String) {
                String str = (String) objA;
                if (!TextUtils.isEmpty(str)) {
                    g.a(str);
                }
                if (objA2 instanceof Integer) {
                    g.a(((Integer) objA2).intValue());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SameDiTool", e10.getMessage());
            }
        }
    }
}
