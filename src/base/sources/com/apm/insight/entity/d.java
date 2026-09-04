package com.apm.insight.entity;

import android.os.Environment;
import com.apm.insight.e;
import com.apm.insight.l.f;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f10668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static JSONObject f10669b;

    private static void a() {
        if (f10668a == null) {
            f10668a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + e.g().getPackageName() + "/AutomationTestInfo.json";
        }
        if (f10669b == null) {
            try {
                f10669b = new JSONObject(f.a(f10668a, "\n"));
            } catch (IOException unused) {
                f10669b = new JSONObject();
            } catch (JSONException unused2) {
                f10669b = new JSONObject();
            }
        }
    }

    public static void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            a();
            JSONObject jSONObject2 = f10669b;
            if (jSONObject2 != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("slardar_filter");
                if (com.apm.insight.a.a(jSONObjectOptJSONObject)) {
                    return;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("filters");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("filters", jSONObjectOptJSONObject2);
                    } catch (JSONException unused) {
                    }
                }
                a.b(jSONObjectOptJSONObject2, jSONObjectOptJSONObject);
            }
        } catch (Throwable unused2) {
        }
    }

    public static void a(JSONObject jSONObject) {
        Object objOpt;
        if (jSONObject == null) {
            return;
        }
        try {
            a();
            JSONObject jSONObject2 = f10669b;
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!"slardar_filter".equals(next) && (objOpt = f10669b.opt(next)) != null) {
                        try {
                            jSONObject.put(next, objOpt);
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
