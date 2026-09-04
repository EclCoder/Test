package com.bytedance.adsdk.ugeno.hnj;

import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    public static Interpolator hn(String str) {
        switch (str.hashCode()) {
            case -1965072618:
                if (str.equals("ease_in")) {
                    return new AccelerateInterpolator();
                }
                break;
            case -1102672091:
                str.equals("linear");
                break;
            case -787702915:
                if (str.equals("ease_out")) {
                    return new DecelerateInterpolator();
                }
                break;
            case 1065009829:
                if (str.equals("ease_in_out")) {
                    return new AccelerateDecelerateInterpolator();
                }
                break;
        }
        return new LinearInterpolator();
    }

    public static int hnj(int i10) {
        if (i10 < 0) {
            return -1;
        }
        if (i10 == 0) {
            return Integer.MIN_VALUE;
        }
        return i10 - 1;
    }

    public static float[] qor(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray jSONArrayHnj = com.bytedance.adsdk.ugeno.dse.hn.hnj(str, (JSONArray) null);
        if (jSONArrayHnj != null && jSONArrayHnj.length() == 2) {
            fArr[0] = (float) jSONArrayHnj.optDouble(0);
            fArr[1] = (float) jSONArrayHnj.optDouble(1);
        }
        return fArr;
    }

    public static List<qor> hnj(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(hnj(jSONObjectOptJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static qor.hnj hn(String str, JSONObject jSONObject) {
        JSONArray jSONArrayHnj;
        if (TextUtils.isEmpty(str) || (jSONArrayHnj = com.bytedance.adsdk.ugeno.dse.hn.hnj(str, (JSONArray) null)) == null || jSONArrayHnj.length() != 2) {
            return null;
        }
        qor.hnj hnjVar = new qor.hnj();
        hnjVar.hnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONArrayHnj.optString(0), jSONObject);
        hnjVar.f12334hn = com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONArrayHnj.optString(1), jSONObject);
        return hnjVar;
    }

    public static qor hnj(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        qor qorVar = new qor();
        qorVar.hn(com.bytedance.adsdk.ugeno.dse.qor.hnj(com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObject.optString("delay"), jSONObject2), 0L));
        qorVar.qor(com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObject.optString("name"), jSONObject2));
        qorVar.hn(com.bytedance.adsdk.ugeno.dse.qor.hnj(com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObject.optString("playState"), jSONObject2), 1));
        qorVar.hnj(Math.max(com.bytedance.adsdk.ugeno.dse.qor.hnj(com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObject.optString("duration"), jSONObject2), 0L), 0L));
        qorVar.hnj(com.bytedance.adsdk.ugeno.dse.qor.hnj(com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObject.optString("playCount"), jSONObject2), 1));
        qorVar.hnj(com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObject.optString("playDirection"), jSONObject2));
        qorVar.hnj(hn(jSONObject.optString("transformOrigin"), jSONObject2));
        qorVar.hn(com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        qorVar.hnj(jSONObject.optJSONObject("effect"));
        qorVar.hnj(hnj(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return qorVar;
    }

    public static Map<String, TreeMap<Float, String>> hnj(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("offset");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    TreeMap treeMap = (TreeMap) map.get(next);
                    if (!TextUtils.equals(next, "offset")) {
                        if (map.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObjectOptJSONObject.optString(next), jSONObject));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            treeMap2.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObjectOptJSONObject.optString(next), jSONObject));
                            map.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static int hnj(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1408024454) {
            return str.equals("alternate") ? 2 : 1;
        }
        if (iHashCode != -1039745817) {
            return 1;
        }
        str.equals("normal");
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int hnj(String str, int i10) {
        int i11 = i10 / 2;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "bottom":
                case "right":
                    return i10;
                case "center":
                    break;
                case "top":
                case "left":
                    return 0;
                default:
                    if (str.endsWith("%")) {
                        try {
                            return (int) ((i10 * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                        } catch (NumberFormatException unused) {
                        }
                        break;
                    } else {
                        try {
                            return Integer.parseInt(str);
                        } catch (NumberFormatException unused2) {
                            return i11;
                        }
                    }
                    break;
            }
        }
        return i11;
    }
}
