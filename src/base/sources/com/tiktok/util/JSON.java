package com.tiktok.util;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class JSON {
    private static final String TAG = "JSON";

    public static JSONObject build() {
        return new JSONObject();
    }

    public static JSONArray buildArr() {
        return new JSONArray();
    }

    public static boolean getBoolean(JSONObject jSONObject, String str) {
        return getBoolean(jSONObject, str, false);
    }

    public static double getDouble(JSONObject jSONObject, String str) {
        return getDouble(jSONObject, str, 0.0d);
    }

    public static int getInt(JSONObject jSONObject, String str) {
        return getInt(jSONObject, str, 0);
    }

    public static JSONObject getJSONObject(JSONArray jSONArray, int i10) {
        try {
            return jSONArray.getJSONObject(i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray getJsonArray(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return jSONObject.optJSONArray(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject getJsonObject(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return jSONObject.optJSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Iterator<String> getKeys(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.keys();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long getLong(JSONObject jSONObject, String str) {
        return getLong(jSONObject, str, 0L);
    }

    public static Object getObject(JSONObject jSONObject, String str) {
        return getObject(jSONObject, str, null);
    }

    public static String getString(JSONObject jSONObject, String str) {
        return getString(jSONObject, str, "");
    }

    public static void putArr(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || obj == null) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Throwable unused) {
        }
    }

    public static void putBoolean(JSONObject jSONObject, String str, boolean z10) {
        if (jSONObject != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                jSONObject.put(str, z10);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putDouble(JSONObject jSONObject, String str, double d10) {
        if (jSONObject != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                jSONObject.put(str, d10);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putInt(JSONObject jSONObject, String str, int i10) {
        if (jSONObject != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                jSONObject.put(str, i10);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putLong(JSONObject jSONObject, String str, long j10) {
        if (jSONObject != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                jSONObject.put(str, j10);
            } catch (Throwable unused) {
            }
        }
    }

    public static void putObject(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                jSONObject.put(str, obj);
            } catch (Throwable unused) {
            }
        }
    }

    public static JSONArray remove(JSONArray jSONArray, int i10) {
        JSONArray jSONArray2 = new JSONArray();
        if (i10 < 0 || i10 >= jSONArray.length()) {
            return jSONArray;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                jSONArray2.put(jSONArray.getJSONObject(i11));
            } catch (JSONException unused) {
            }
        }
        while (true) {
            i10++;
            if (i10 >= jSONArray.length()) {
                return jSONArray2;
            }
            try {
                jSONArray2.put(jSONArray.getJSONObject(i10));
            } catch (Throwable unused2) {
            }
        }
    }

    public static JSONObject build(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray buildArr(String str) {
        try {
            return new JSONArray(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean getBoolean(JSONObject jSONObject, String str, boolean z10) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return jSONObject.optBoolean(str, z10);
                }
            } catch (Throwable unused) {
            }
        }
        return z10;
    }

    public static double getDouble(JSONObject jSONObject, String str, double d10) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return jSONObject.optDouble(str, d10);
                }
            } catch (Throwable unused) {
            }
        }
        return d10;
    }

    public static int getInt(JSONObject jSONObject, String str, int i10) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return jSONObject.optInt(str, i10);
                }
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    public static long getLong(JSONObject jSONObject, String str, long j10) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return jSONObject.optLong(str, j10);
                }
            } catch (Throwable unused) {
            }
        }
        return j10;
    }

    public static Object getObject(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return jSONObject.opt(str);
                }
            } catch (Throwable unused) {
            }
        }
        return obj;
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return jSONObject.optString(str, str2);
                }
            } catch (Throwable unused) {
            }
        }
        return str2;
    }

    public static JSONObject build(Map<String, String> map) {
        try {
            return new JSONObject(map);
        } catch (Throwable unused) {
            return null;
        }
    }
}
