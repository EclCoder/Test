package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.internal.e1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15571d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ScheduledExecutorService f15572e = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.facebook.appevents.o0 f15574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15575c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle b(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }

        private a() {
        }
    }

    public c0(Context context, String applicationId) {
        PackageInfo packageInfo;
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(applicationId, "applicationId");
        this.f15573a = applicationId;
        this.f15574b = new com.facebook.appevents.o0(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(FbValidationUtils.FB_PACKAGE, 0)) == null) {
                return;
            }
            this.f15575c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void c(String str, Bundle bundle) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            e1.l0("LoginLogger", "Event: " + str + " | auth_logger_id=" + bundle.getString("0_auth_logger_id") + " | result=" + bundle.getString("2_result") + " | method=" + bundle.getString("3_method") + " | extras=" + bundle.getString("6_extras"));
            this.f15574b.g(str, bundle);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void h(String str) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            final Bundle bundleB = f15571d.b(str);
            f15572e.schedule(new Runnable() { // from class: com.facebook.login.b0
                @Override // java.lang.Runnable
                public final void run() {
                    c0.i(this.f15562a, bundleB);
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(c0 this$0, Bundle bundle) {
        if (x7.a.c(c0.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(this$0, "this$0");
            kotlin.jvm.internal.s.h(bundle, "$bundle");
            this$0.c("fb_mobile_login_heartbeat", bundle);
        } catch (Throwable th2) {
            x7.a.b(th2, c0.class);
        }
    }

    public static /* synthetic */ void l(c0 c0Var, String str, String str2, String str3, int i10, Object obj) {
        if (x7.a.c(c0.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        try {
            c0Var.k(str, str2, str3);
        } catch (Throwable th2) {
            x7.a.b(th2, c0.class);
        }
    }

    public final String b() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return this.f15573a;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final void d(String str, String str2, String str3, String str4, String str5, Map map, String str6) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            Bundle bundleB = f15571d.b(str);
            if (str3 != null) {
                bundleB.putString("2_result", str3);
            }
            if (str4 != null) {
                bundleB.putString("5_error_message", str4);
            }
            if (str5 != null) {
                bundleB.putString("4_error_code", str5);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                bundleB.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            bundleB.putString("3_method", str2);
            c(str6, bundleB);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void e(String str, String str2, String str3) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            Bundle bundleB = f15571d.b(str);
            bundleB.putString("3_method", str2);
            c(str3, bundleB);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void f(String str, String str2, String str3) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            Bundle bundleB = f15571d.b(str);
            bundleB.putString("3_method", str2);
            c(str3, bundleB);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void g(String str, Map loggingExtras, w.f.a aVar, Map map, Exception exc, String str2) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(loggingExtras, "loggingExtras");
            Bundle bundleB = f15571d.b(str);
            if (aVar != null) {
                bundleB.putString("2_result", aVar.g());
            }
            if ((exc != null ? exc.getMessage() : null) != null) {
                bundleB.putString("5_error_message", exc.getMessage());
            }
            JSONObject jSONObject = loggingExtras.isEmpty() ? null : new JSONObject(loggingExtras);
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        if (str3 != null) {
                            jSONObject.put(str3, str4);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleB.putString("6_extras", jSONObject.toString());
            }
            c(str2, bundleB);
            if (aVar == w.f.a.SUCCESS) {
                h(str);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void j(w.e pendingLoginRequest, String str) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(pendingLoginRequest, "pendingLoginRequest");
            Bundle bundleB = f15571d.b(pendingLoginRequest.c());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", pendingLoginRequest.q().toString());
                jSONObject.put("request_code", w.f15766m.b());
                jSONObject.put("permissions", TextUtils.join(",", pendingLoginRequest.v()));
                jSONObject.put("default_audience", pendingLoginRequest.j().toString());
                jSONObject.put("isReauthorize", pendingLoginRequest.B());
                String str2 = this.f15575c;
                if (str2 != null) {
                    jSONObject.put("facebookVersion", str2);
                }
                if (pendingLoginRequest.s() != null) {
                    jSONObject.put("target_app", pendingLoginRequest.s().toString());
                }
                bundleB.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused) {
            }
            c(str, bundleB);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void k(String str, String str2, String str3) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            Bundle bundleB = f15571d.b("");
            bundleB.putString("2_result", w.f.a.ERROR.g());
            bundleB.putString("5_error_message", str2);
            bundleB.putString("3_method", str3);
            c(str, bundleB);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
