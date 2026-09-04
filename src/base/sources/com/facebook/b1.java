package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.e1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f15023a = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15024b = b1.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f15025c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f15026d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15027e = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15028f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f15029g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f15030h = new a(false, "auto_event_setup_enabled");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f15031i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static SharedPreferences f15032j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f15034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f15035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f15036d;

        public a(boolean z10, String key) {
            kotlin.jvm.internal.s.h(key, "key");
            this.f15033a = z10;
            this.f15034b = key;
        }

        public final boolean a() {
            return this.f15033a;
        }

        public final String b() {
            return this.f15034b;
        }

        public final long c() {
            return this.f15036d;
        }

        public final Boolean d() {
            return this.f15035c;
        }

        public final boolean e() {
            Boolean bool = this.f15035c;
            return bool != null ? bool.booleanValue() : this.f15033a;
        }

        public final void f(long j10) {
            this.f15036d = j10;
        }

        public final void g(Boolean bool) {
            this.f15035c = bool;
        }
    }

    private final boolean b() {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            Map mapG = com.facebook.internal.a0.g();
            if (mapG != null && !mapG.isEmpty()) {
                Boolean bool = (Boolean) mapG.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) mapG.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean boolC = c();
                if (boolC != null) {
                    return boolC.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return f15028f.e();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    private final Boolean c() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            Boolean boolR = r();
            if (boolR != null) {
                return boolR;
            }
            Boolean boolM = m();
            if (boolM != null) {
                return boolM;
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final Boolean d() {
        if (x7.a.c(b1.class)) {
            return null;
        }
        try {
            f15023a.k();
            SharedPreferences sharedPreferences = f15032j;
            if (sharedPreferences == null) {
                kotlin.jvm.internal.s.w("userSettingPref");
                sharedPreferences = null;
            }
            if (!sharedPreferences.contains("com.facebook.sdk.AddToMessagingCustomerBaseForWhatsApp")) {
                return null;
            }
            SharedPreferences sharedPreferences2 = f15032j;
            if (sharedPreferences2 == null) {
                kotlin.jvm.internal.s.w("userSettingPref");
                sharedPreferences2 = null;
            }
            return Boolean.valueOf(sharedPreferences2.getBoolean("com.facebook.sdk.AddToMessagingCustomerBaseForWhatsApp", false));
        } catch (Throwable th2) {
            x7.a.b(th2, b1.class);
            return null;
        }
    }

    public static final boolean e() {
        if (x7.a.c(b1.class)) {
            return false;
        }
        try {
            f15023a.k();
            return f15029g.e();
        } catch (Throwable th2) {
            x7.a.b(th2, b1.class);
            return false;
        }
    }

    public static final boolean f() {
        if (x7.a.c(b1.class)) {
            return false;
        }
        try {
            f15023a.k();
            return f15027e.e();
        } catch (Throwable th2) {
            x7.a.b(th2, b1.class);
            return false;
        }
    }

    public static final boolean g() {
        if (x7.a.c(b1.class)) {
            return false;
        }
        try {
            b1 b1Var = f15023a;
            b1Var.k();
            return b1Var.b();
        } catch (Throwable th2) {
            x7.a.b(th2, b1.class);
            return false;
        }
    }

    public static final boolean h() {
        if (x7.a.c(b1.class)) {
            return false;
        }
        try {
            f15023a.k();
            return f15030h.e();
        } catch (Throwable th2) {
            x7.a.b(th2, b1.class);
            return false;
        }
    }

    private final void i() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            a aVar = f15030h;
            s(aVar);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.d() == null || jCurrentTimeMillis - aVar.c() >= 604800000) {
                aVar.g(null);
                aVar.f(0L);
                if (f15026d.compareAndSet(false, true)) {
                    h0.v().execute(new Runnable() { // from class: com.facebook.a1
                        @Override // java.lang.Runnable
                        public final void run() {
                            b1.j(jCurrentTimeMillis);
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final void j(long j10) {
        com.facebook.internal.w wVarV;
        if (x7.a.c(b1.class)) {
            return;
        }
        try {
            if (f15029g.e() && (wVarV = com.facebook.internal.a0.v(h0.n(), false)) != null && wVarV.d()) {
                com.facebook.internal.b bVarE = com.facebook.internal.b.f15130f.e(h0.m());
                String strH = (bVarE == null || bVarE.h() == null) ? null : bVarE.h();
                if (strH != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("advertiser_id", strH);
                    bundle.putString("fields", "auto_event_setup_enabled");
                    j0 j0VarX = j0.f15486n.x(null, MBridgeConstans.DYNAMIC_VIEW_WX_APP, null);
                    j0VarX.G(bundle);
                    JSONObject jSONObjectC = j0VarX.k().c();
                    if (jSONObjectC != null) {
                        a aVar = f15030h;
                        aVar.g(Boolean.valueOf(jSONObjectC.optBoolean("auto_event_setup_enabled", false)));
                        aVar.f(j10);
                        f15023a.u(aVar);
                    }
                }
            }
            f15026d.set(false);
        } catch (Throwable th2) {
            x7.a.b(th2, b1.class);
        }
    }

    private final void k() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (h0.K() && f15025c.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = h0.m().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                kotlin.jvm.internal.s.g(sharedPreferences, "getApplicationContext()\n…GS, Context.MODE_PRIVATE)");
                f15032j = sharedPreferences;
                l(f15028f, f15029g, f15027e);
                i();
                q();
                p();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void l(a... aVarArr) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            for (a aVar : aVarArr) {
                if (aVar == f15030h) {
                    i();
                } else if (aVar.d() == null) {
                    s(aVar);
                    if (aVar.d() == null) {
                        n(aVar);
                    }
                } else {
                    u(aVar);
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final Boolean m() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            t();
            try {
                Context contextM = h0.m();
                ApplicationInfo applicationInfo = contextM.getPackageManager().getApplicationInfo(contextM.getPackageName(), 128);
                kotlin.jvm.internal.s.g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    a aVar = f15028f;
                    if (bundle.containsKey(aVar.b())) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                e1.k0(f15024b, e10);
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final void n(a aVar) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            t();
            try {
                Context contextM = h0.m();
                ApplicationInfo applicationInfo = contextM.getPackageManager().getApplicationInfo(contextM.getPackageName(), 128);
                kotlin.jvm.internal.s.g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(aVar.b())) {
                    return;
                }
                aVar.g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
                return;
            } catch (PackageManager.NameNotFoundException e10) {
                e1.k0(f15024b, e10);
                return;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
        x7.a.b(th2, this);
    }

    public static final void o() {
        if (x7.a.c(b1.class)) {
            return;
        }
        try {
            Context contextM = h0.m();
            ApplicationInfo applicationInfo = contextM.getPackageManager().getApplicationInfo(contextM.getPackageName(), 128);
            kotlin.jvm.internal.s.g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            com.facebook.appevents.o0 o0Var = new com.facebook.appevents.o0(contextM);
            Bundle bundle2 = new Bundle();
            if (!e1.W()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(f15024b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            o0Var.d("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            x7.a.b(th2, b1.class);
        }
    }

    private final void p() {
        int i10;
        int i11;
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (f15025c.get() && h0.K()) {
                Context contextM = h0.m();
                int i12 = (f15027e.e() ? 1 : 0) | ((f15028f.e() ? 1 : 0) << 1) | ((f15029g.e() ? 1 : 0) << 2) | ((f15031i.e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f15032j;
                SharedPreferences sharedPreferences2 = null;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.s.w("userSettingPref");
                    sharedPreferences = null;
                }
                int i13 = 0;
                int i14 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i14 != i12) {
                    SharedPreferences sharedPreferences3 = f15032j;
                    if (sharedPreferences3 == null) {
                        kotlin.jvm.internal.s.w("userSettingPref");
                    } else {
                        sharedPreferences2 = sharedPreferences3;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i12).apply();
                    try {
                        ApplicationInfo applicationInfo = contextM.getPackageManager().getApplicationInfo(contextM.getPackageName(), 128);
                        kotlin.jvm.internal.s.g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            i11 = 0;
                            i10 = 0;
                            while (i13 < 4) {
                                try {
                                    i10 |= (applicationInfo.metaData.containsKey(strArr[i13]) ? 1 : 0) << i13;
                                    i11 |= (applicationInfo.metaData.getBoolean(strArr[i13], zArr[i13]) ? 1 : 0) << i13;
                                    i13++;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    i13 = i11;
                                    i11 = i13;
                                    i13 = i10;
                                    com.facebook.appevents.o0 o0Var = new com.facebook.appevents.o0(contextM);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("usage", i13);
                                    bundle.putInt("initial", i11);
                                    bundle.putInt("previous", i14);
                                    bundle.putInt("current", i12);
                                    o0Var.b(bundle);
                                }
                            }
                            i13 = i10;
                        } else {
                            i11 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i10 = 0;
                    }
                    com.facebook.appevents.o0 o0Var2 = new com.facebook.appevents.o0(contextM);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i13);
                    bundle2.putInt("initial", i11);
                    bundle2.putInt("previous", i14);
                    bundle2.putInt("current", i12);
                    o0Var2.b(bundle2);
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void q() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            Context contextM = h0.m();
            ApplicationInfo applicationInfo = contextM.getPackageManager().getApplicationInfo(contextM.getPackageName(), 128);
            kotlin.jvm.internal.s.g(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f15024b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (e()) {
                    return;
                }
                Log.w(f15024b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final Boolean r() {
        String str = "";
        if (x7.a.c(b1.class)) {
            return null;
        }
        try {
            f15023a.t();
            try {
                SharedPreferences sharedPreferences = f15032j;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.s.w("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(f15028f.b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
            } catch (JSONException e10) {
                e1.k0(f15024b, e10);
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, b1.class);
            return null;
        }
    }

    private final void s(a aVar) {
        String str = "";
        if (x7.a.c(this)) {
            return;
        }
        try {
            t();
            try {
                SharedPreferences sharedPreferences = f15032j;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.s.w("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(aVar.b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.g(Boolean.valueOf(jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE)));
                    aVar.f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e10) {
                e1.k0(f15024b, e10);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void t() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (f15025c.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void u(a aVar) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            t();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, aVar.d());
                jSONObject.put("last_timestamp", aVar.c());
                SharedPreferences sharedPreferences = f15032j;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.s.w("userSettingPref");
                    sharedPreferences = null;
                }
                sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                p();
            } catch (Exception e10) {
                e1.k0(f15024b, e10);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
