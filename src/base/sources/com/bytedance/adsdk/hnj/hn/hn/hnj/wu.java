package com.bytedance.adsdk.hnj.hn.hn.hnj;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class wu implements com.bytedance.adsdk.hnj.hn.hn.hnj {
    private final String hnj;

    public wu(String str) {
        this.hnj = str;
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public String hn() {
        return this.hnj;
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public Object hnj(Map<String, JSONObject> map) {
        Object objHnj;
        if (map == null || map.size() <= 0 || (objHnj = hnj(this.hnj, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objHnj;
    }

    public String toString() {
        return "VariableNode [literals=" + this.hnj + "]";
    }

    @Override // com.bytedance.adsdk.hnj.hn.hn.hnj
    public com.bytedance.adsdk.hnj.hn.gjv.sk hnj() {
        return com.bytedance.adsdk.hnj.hn.gjv.dkl.VARIABLE;
    }

    public Object hnj(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return hnj(str.split("\\."), 0, jSONObject);
    }

    private Object hnj(String[] strArr, int i10, JSONObject jSONObject) {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i10 < strArr.length && jSONObject != null) {
            String str = strArr[i10];
            int iIndexOf = str.indexOf("[");
            int iIndexOf2 = str.indexOf("]");
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i11 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i11) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                objOpt = jSONObject.opt(str);
            }
            if (i10 == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return hnj(strArr, i10 + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return hnj(strArr, i10 + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }
}
