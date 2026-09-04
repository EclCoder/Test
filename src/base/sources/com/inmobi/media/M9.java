package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class M9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f25254a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f25255b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f25256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f25257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static JSONObject f25258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static JSONObject f25259f;

    public static final void a(JSONObject jSONObject) {
        synchronized (f25255b) {
            try {
                Objects.toString(f25259f);
                Objects.toString(jSONObject);
                f25259f = jSONObject;
                f25257d = true;
                Context context = Xi.f26021a;
                if (context != null) {
                    ConcurrentHashMap concurrentHashMap = La.f25197b;
                    La laA = Ka.a(context, "unified_id_info_store");
                    JSONObject jSONObject2 = f25259f;
                    if (jSONObject2 == null) {
                        laA.a("publisher_provided_unified_id");
                    } else {
                        laA.a("publisher_provided_unified_id", String.valueOf(jSONObject2), false);
                        fl.g0 g0Var = fl.g0.f38750a;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final JSONObject b() {
        synchronized (f25254a) {
            if (f25256c) {
                return f25258e;
            }
            f25256c = true;
            Context context = Xi.f26021a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                La laA = Ka.a(context, "unified_id_info_store");
                kotlin.jvm.internal.s.h("ufids", "key");
                String string = laA.f25198a.getString("ufids", null);
                if (string != null) {
                    try {
                        f25258e = new JSONObject(string);
                    } catch (JSONException e10) {
                        e10.getMessage();
                    }
                    return f25258e;
                }
            }
            return null;
        }
    }

    public static final JSONObject a() {
        synchronized (f25255b) {
            if (f25257d) {
                Objects.toString(f25259f);
                return f25259f;
            }
            f25257d = true;
            Context context = Xi.f26021a;
            String string = null;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                La laA = Ka.a(context, "unified_id_info_store");
                kotlin.jvm.internal.s.h("publisher_provided_unified_id", "key");
                string = laA.f25198a.getString("publisher_provided_unified_id", null);
            }
            try {
                try {
                    f25259f = new JSONObject(string);
                } catch (JSONException e10) {
                    e10.getMessage();
                }
            } catch (NullPointerException e11) {
                e11.getMessage();
            }
            Objects.toString(f25259f);
            return f25259f;
        }
    }

    public static final void b(JSONObject jSONObject) {
        synchronized (f25254a) {
            try {
                f25258e = jSONObject;
                f25256c = true;
                Context context = Xi.f26021a;
                if (context != null) {
                    ConcurrentHashMap concurrentHashMap = La.f25197b;
                    La laA = Ka.a(context, "unified_id_info_store");
                    JSONObject jSONObject2 = f25258e;
                    if (jSONObject2 == null) {
                        laA.a("ufids");
                    } else {
                        laA.a("ufids", String.valueOf(jSONObject2), false);
                    }
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                    JSONObject jSONObject3 = f25258e;
                    if (jSONObject3 == null) {
                        editorEdit.remove("InMobi_unifiedId");
                    } else {
                        editorEdit.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                    }
                    editorEdit.apply();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
