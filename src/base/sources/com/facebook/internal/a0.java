package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f15117a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f15118b = a0.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f15119c = gl.r.o("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", "app_events_config.os_version(" + Build.VERSION.RELEASE + ')');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f15120d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference f15121e = new AtomicReference(a.NOT_LOADED);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ConcurrentLinkedQueue f15122f = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f15123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile JSONArray f15124h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a();

        void b(w wVar);
    }

    private a0() {
    }

    public static final void d(b callback) {
        kotlin.jvm.internal.s.h(callback, "callback");
        f15122f.add(callback);
        h();
    }

    private final JSONObject e(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f15119c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        com.facebook.j0 j0VarX = com.facebook.j0.f15486n.x(null, MBridgeConstans.DYNAMIC_VIEW_WX_APP, null);
        j0VarX.D(true);
        j0VarX.G(bundle);
        JSONObject jSONObjectD = j0VarX.k().d();
        return jSONObjectD == null ? new JSONObject() : jSONObjectD;
    }

    public static final w f(String str) {
        if (str != null) {
            return (w) f15120d.get(str);
        }
        return null;
    }

    public static final Map g() {
        JSONObject jSONObject;
        Context contextM = com.facebook.h0.m();
        String strN = com.facebook.h0.n();
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strN}, 1));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        String string = contextM.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(str, null);
        if (!e1.e0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                e1.k0("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                return f15117a.p(jSONObject);
            }
        }
        return null;
    }

    public static final void h() {
        final Context contextM = com.facebook.h0.m();
        final String strN = com.facebook.h0.n();
        if (e1.e0(strN)) {
            f15121e.set(a.ERROR);
            f15117a.s();
            return;
        }
        if (f15120d.containsKey(strN)) {
            f15121e.set(a.SUCCESS);
            f15117a.s();
            return;
        }
        AtomicReference atomicReference = f15121e;
        a aVar = a.NOT_LOADED;
        a aVar2 = a.LOADING;
        if (!androidx.lifecycle.b.a(atomicReference, aVar, aVar2) && !androidx.lifecycle.b.a(atomicReference, a.ERROR, aVar2)) {
            f15117a.s();
            return;
        }
        kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
        final String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strN}, 1));
        kotlin.jvm.internal.s.g(str, "format(format, *args)");
        com.facebook.h0.v().execute(new Runnable() { // from class: com.facebook.internal.x
            @Override // java.lang.Runnable
            public final void run() {
                a0.i(contextM, str, strN);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Context context, String settingsKey, String applicationId) {
        JSONObject jSONObject;
        kotlin.jvm.internal.s.h(context, "$context");
        kotlin.jvm.internal.s.h(settingsKey, "$settingsKey");
        kotlin.jvm.internal.s.h(applicationId, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        w wVarJ = null;
        String string = sharedPreferences.getString(settingsKey, null);
        if (!e1.e0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                e1.k0("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                wVarJ = f15117a.j(applicationId, jSONObject);
            }
        }
        a0 a0Var = f15117a;
        JSONObject jSONObjectE = a0Var.e(applicationId);
        if (jSONObjectE != null) {
            a0Var.j(applicationId, jSONObjectE);
            sharedPreferences.edit().putString(settingsKey, jSONObjectE.toString()).apply();
        }
        if (wVarJ != null) {
            String strU = wVarJ.u();
            if (!f15123g && strU != null && strU.length() > 0) {
                f15123g = true;
                Log.w(f15118b, strU);
            }
        }
        v.n(applicationId, true);
        n7.k.h();
        f15121e.set(f15120d.containsKey(applicationId) ? a.SUCCESS : a.ERROR);
        a0Var.s();
    }

    private final List k(JSONObject jSONObject, String str) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (kotlin.jvm.internal.s.c(jSONObject2.getString("key"), "prod_keys")) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    if (kotlin.jvm.internal.s.c(jSONObject3.getString("key"), str)) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        ArrayList arrayList = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i12 = 0; i12 < length3; i12++) {
                            arrayList.add(jSONArray3.getJSONObject(i12).getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList);
                        return arrayList2;
                    }
                }
            }
        }
        return null;
    }

    private final ArrayList l(JSONObject jSONObject, boolean z10) {
        JSONArray jSONArray;
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
                return arrayList2;
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList3 = null;
        int i10 = 0;
        while (i10 < length) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            String string = jSONObject2.getString("key");
            if ((!kotlin.jvm.internal.s.c(string, "prod_keys") || !z10) && (!kotlin.jvm.internal.s.c(string, "test_keys") || z10)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int length2 = jSONArray2.length();
                int i11 = 0;
                while (i11 < length2) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    String string2 = jSONObject3.getString("key");
                    if (kotlin.jvm.internal.s.c(string2, "_valueToSum") || kotlin.jvm.internal.s.c(string2, "fb_currency")) {
                        arrayList = arrayList2;
                    } else {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        ArrayList arrayList4 = new ArrayList();
                        int length3 = jSONArray3.length();
                        int i12 = 0;
                        while (i12 < length3) {
                            ArrayList arrayList5 = arrayList2;
                            try {
                                arrayList4.add(jSONArray3.getJSONObject(i12).getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                                i12++;
                                arrayList2 = arrayList5;
                            } catch (Exception unused2) {
                                return arrayList5;
                            }
                        }
                        arrayList = arrayList2;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(new fl.q(string2, arrayList4));
                    }
                    i11++;
                    arrayList2 = arrayList;
                }
            }
            i10++;
            arrayList2 = arrayList2;
        }
        return arrayList3;
    }

    static /* synthetic */ ArrayList m(a0 a0Var, JSONObject jSONObject, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a0Var.l(jSONObject, z10);
    }

    private final Long n(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return Long.valueOf(jSONObject.optLong("iap_manual_and_auto_log_dedup_window_millis"));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final Map o(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(DataSchemeDataSource.SCHEME_DATA)) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                w.b.a aVar = w.b.f15459e;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                kotlin.jvm.internal.s.g(jSONObjectOptJSONObject, "dialogConfigData.optJSONObject(i)");
                w.b bVarA = aVar.a(jSONObjectOptJSONObject);
                if (bVarA != null) {
                    String strA = bVarA.a();
                    Map map2 = (Map) map.get(strA);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(strA, map2);
                    }
                    map2.put(bVarA.b(), bVarA);
                }
            }
        }
        return map;
    }

    private final Map p(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e10) {
                e1.k0("FacebookSDK", e10);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e11) {
                e1.k0("FacebookSDK", e11);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    private final JSONArray q(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    private final String r(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.isNull("vvp_config")) {
            return null;
        }
        return jSONObject.optString("vvp_config", null);
    }

    private final synchronized void s() {
        a aVar = (a) f15121e.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            final w wVar = (w) f15120d.get(com.facebook.h0.n());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f15122f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final b bVar = (b) concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            a0.t(bVar);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f15122f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final b bVar2 = (b) concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            a0.u(bVar2, wVar);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(b bVar) {
        bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(b bVar, w wVar) {
        bVar.b(wVar);
    }

    public static final w v(String applicationId, boolean z10) {
        kotlin.jvm.internal.s.h(applicationId, "applicationId");
        if (!z10) {
            Map map = f15120d;
            if (map.containsKey(applicationId)) {
                return (w) map.get(applicationId);
            }
        }
        a0 a0Var = f15117a;
        w wVarJ = a0Var.j(applicationId, a0Var.e(applicationId));
        if (kotlin.jvm.internal.s.c(applicationId, com.facebook.h0.n())) {
            f15121e.set(a.SUCCESS);
            a0Var.s();
        }
        return wVarJ;
    }

    public final w j(String applicationId, JSONObject settingsJSON) {
        kotlin.jvm.internal.s.h(applicationId, "applicationId");
        kotlin.jvm.internal.s.h(settingsJSON, "settingsJSON");
        JSONArray jSONArrayOptJSONArray = settingsJSON.optJSONArray("android_sdk_error_categories");
        o.a aVar = o.f15331g;
        o oVarA = aVar.a(jSONArrayOptJSONArray);
        if (oVarA == null) {
            oVarA = aVar.b();
        }
        o oVar = oVarA;
        int iOptInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        boolean z10 = (iOptInt & 8) != 0;
        boolean z11 = (iOptInt & 16) != 0;
        boolean z12 = (iOptInt & 32) != 0;
        boolean z13 = (iOptInt & 256) != 0;
        boolean z14 = (iOptInt & 16384) != 0;
        JSONArray jSONArrayOptJSONArray2 = settingsJSON.optJSONArray("auto_event_mapping_android");
        f15124h = jSONArrayOptJSONArray2;
        if (f15124h != null && o0.b()) {
            f7.e.c(jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.toString() : null);
        }
        JSONObject jSONObjectOptJSONObject = settingsJSON.optJSONObject("app_events_config");
        boolean zOptBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString = settingsJSON.optString("gdpv4_nux_content", "");
        kotlin.jvm.internal.s.g(strOptString, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = settingsJSON.optInt("app_events_session_timeout", n7.l.a());
        EnumSet enumSetA = y0.f15472b.a(settingsJSON.optLong("seamless_login"));
        Map mapO = o(settingsJSON.optJSONObject("android_dialog_configs"));
        String strOptString2 = settingsJSON.optString("smart_login_bookmark_icon_url");
        kotlin.jvm.internal.s.g(strOptString2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString3 = settingsJSON.optString("smart_login_menu_icon_url");
        kotlin.jvm.internal.s.g(strOptString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString4 = settingsJSON.optString("sdk_update_message");
        kotlin.jvm.internal.s.g(strOptString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        w wVar = new w(zOptBoolean, strOptString, zOptBoolean2, iOptInt2, enumSetA, mapO, z10, oVar, strOptString2, strOptString3, z11, z12, jSONArrayOptJSONArray2, strOptString4, z13, z14, settingsJSON.optString("aam_rules"), settingsJSON.optString("suggested_events_setting"), settingsJSON.optString("restrictive_data_filter_params"), q(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params"), q(settingsJSON.optJSONObject("protected_mode_rules"), "maca_rules"), p(settingsJSON), q(settingsJSON.optJSONObject("protected_mode_rules"), "blocklist_events"), q(settingsJSON.optJSONObject("protected_mode_rules"), "redacted_events"), q(settingsJSON.optJSONObject("protected_mode_rules"), "sensitive_params"), q(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params_schema"), q(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params_blocked"), r(settingsJSON.optJSONObject("protected_mode_rules")), k(jSONObjectOptJSONObject, "fb_currency"), k(jSONObjectOptJSONObject, "_valueToSum"), m(this, jSONObjectOptJSONObject, false, 2, null), l(jSONObjectOptJSONObject, true), n(settingsJSON.optJSONObject("app_events_config")));
        f15120d.put(applicationId, wVar);
        return wVar;
    }
}
