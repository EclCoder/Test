package com.bytedance.sdk.component.adexpress.dynamic.gjv;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    public String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public String f12601hn;
    public List<hnj> hnj;
    public String qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        public JSONObject f12602hn;
        public int hnj;
    }

    public static gjv hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        gjv gjvVar = new gjv();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    hnj hnjVar = new hnj();
                    hnjVar.hnj = jSONObjectOptJSONObject.optInt("id");
                    hnjVar.f12602hn = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(hnjVar);
                }
            }
        } catch (JSONException unused) {
        }
        gjvVar.hnj = arrayList;
        gjvVar.f12601hn = jSONObject.optString("diff_data");
        gjvVar.qor = jSONObject.optString("style_diff");
        gjvVar.gjv = jSONObject.optString("tag_diff");
        return gjvVar;
    }
}
