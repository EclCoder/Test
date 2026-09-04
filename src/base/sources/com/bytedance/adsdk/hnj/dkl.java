package com.bytedance.adsdk.hnj;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl implements ojm {
    @Override // com.bytedance.adsdk.hnj.ojm
    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public String hnj(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strValueOf);
            String strValueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(strValueOf2)) {
                return null;
            }
            Object objHnj = com.bytedance.adsdk.hnj.hn.hnj.hnj(strValueOf2).hnj(jSONObject2);
            if (!TextUtils.isEmpty(String.valueOf(objHnj))) {
                return String.valueOf(objHnj);
            }
            if (objArr.length >= 3) {
                return String.valueOf(objArr[2]);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
