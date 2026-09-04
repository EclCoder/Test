package com.apm.insight.runtime;

import java.util.HashMap;
import org.json.JSONObject;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, d> f10968a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f10969b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f10970c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10971d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10972e;

    private d(JSONObject jSONObject, String str) {
        this.f10972e = str;
        a(jSONObject);
        f10968a.put(this.f10972e, this);
        com.apm.insight.a.a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f10969b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f10971d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    public static JSONObject b(String str) {
        d dVar = f10968a.get(str);
        if (dVar != null) {
            return dVar.f10969b;
        }
        return null;
    }

    public static d c(String str) {
        return f10968a.get(str);
    }

    public static long d(String str) {
        d dVar = f10968a.get(str);
        if (dVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.a.a(dVar.f10969b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean e(String str) {
        JSONObject jSONObject;
        d dVar = f10968a.get(str);
        return (dVar == null || (jSONObject = dVar.f10969b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean g(String str) {
        JSONObject jSONObject;
        d dVar = f10968a.get(str);
        return (dVar == null || (jSONObject = dVar.f10969b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean f(String str) {
        JSONObject jSONObject;
        d dVar = f10968a.get(str);
        return (dVar == null || (jSONObject = dVar.f10969b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", YSHErhbVu.NVXOdRR)) ? false : true;
    }

    public final boolean a() {
        if (this.f10969b == null) {
            return false;
        }
        return this.f10971d;
    }

    public static boolean a(String str) {
        return f10968a.get(str) != null;
    }

    public static void a(String str, JSONObject jSONObject) {
        d dVar = f10968a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new d(jSONObject, str);
        }
    }
}
