package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f30881a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f30882b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f30883c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f30884d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f30885e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f30886f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f30887g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f30888h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f30889i = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30890a;

        a(Context context) {
            this.f30890a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f30890a);
                    g.a(advertisingIdInfo.getId());
                    g.f30884d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    g.b(this.f30890a, advertisingIdInfo.getId(), g.f30884d);
                } catch (Exception unused) {
                    q0.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        c.b bVarA = new c().a(this.f30890a);
                        g.a(bVarA.a());
                        g.f30884d = bVarA.b() ? 1 : 0;
                        g.b(this.f30890a, bVarA.a(), g.f30884d);
                    } catch (Exception unused2) {
                        q0.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th2) {
                    q0.b("DomainSameDiTool", th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i10) {
        try {
            if (a1.b(str)) {
                y0.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            y0.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i10));
        } catch (Exception e10) {
            q0.b("DomainSameDiTool", e10.getMessage());
        }
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f30882b) ? "" : f30882b;
        }
        if (!TextUtils.isEmpty(f30882b)) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
                return f30882b;
            }
            return f30884d == 0 ? f30882b : "";
        }
        if (!f30883c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f30883c = true;
        }
        return "";
    }

    public static String d() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f30881a) ? "" : f30881a;
        }
        if (!TextUtils.isEmpty(f30881a)) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
                return f30881a;
            }
            return f30884d == 0 ? f30881a : "";
        }
        m0.l();
        if (!f30883c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f30883c = true;
        }
        return TextUtils.isEmpty(f30881a) ? "" : f30881a;
    }

    public static String e() {
        if (TextUtils.isEmpty(f30887g) && !f30886f) {
            b();
        }
        return f30887g;
    }

    public static int a() {
        return f30884d;
    }

    public static void a(int i10) {
        f30884d = i10;
    }

    public static void a(Context context) {
        new Thread(new a(context)).start();
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f30886f) {
            return f30885e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    f30887g = string2;
                    f30885e = k0.b(string2);
                }
            } catch (Settings.SettingNotFoundException e10) {
                q0.b("DomainSameDiTool", e10.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("DomainSameDiTool", th2.getMessage());
        }
        f30886f = true;
        return f30885e;
    }

    public static void a(String str) {
        f30882b = k0.b(str);
        f30881a = str;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean b(Context context) {
        try {
            if (f30889i) {
                return f30888h;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                f30888h = context.getPackageManager().checkPermission(k0.a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
            } else {
                f30888h = true;
            }
            f30889i = true;
            return f30888h;
        } catch (Exception unused) {
            f30888h = false;
        }
    }
}
