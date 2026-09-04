package com.bytedance.sdk.component.adexpress.dynamic.sk;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm {
    public static String hn(String str, String str2) {
        if (!com.bytedance.sdk.component.adexpress.gjv.hn()) {
            return hnj.hnj(str);
        }
        if (str.indexOf(46) < 0) {
            str = str + ".png";
        }
        return str2 + "static/images/" + str;
    }

    public static void hnj(String str, JSONObject jSONObject) {
        JSONObject jSONObjectJo = com.bytedance.sdk.component.adexpress.hn.jo(str);
        if (jSONObjectJo == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectJo.optJSONObject("values");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        hnj(jSONObjectOptJSONObject, jSONObject);
    }

    public static JSONObject hnj(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectJo = com.bytedance.sdk.component.adexpress.hn.jo(str);
        if (jSONObjectJo == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return hnj(jSONObject2, jSONObjectJo.optJSONObject("themeValues"), jSONObject);
    }

    private static void hnj(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject hnj(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String hnj(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectJo = com.bytedance.sdk.component.adexpress.hn.jo(str);
        if (jSONObjectJo == null || (jSONObjectOptJSONObject = jSONObjectJo.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(DataSchemeDataSource.SCHEME_DATA);
    }

    public static String hnj(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectJo = com.bytedance.sdk.component.adexpress.hn.jo(str);
        if (jSONObjectJo == null || (jSONObjectOptJSONObject = jSONObjectJo.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static JSONObject hnj(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("values");
    }
}
