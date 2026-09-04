package com.bytedance.adsdk.hnj;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements com.bytedance.adsdk.ugeno.qor.hnj {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class hnj implements com.bytedance.adsdk.ugeno.qor.hnj.InterfaceC0174hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private String f12162hn;
        private com.bytedance.adsdk.hnj.hn.hnj hnj;

        private hnj(String str) {
            this.f12162hn = str;
            this.hnj = com.bytedance.adsdk.hnj.hn.hnj.hnj(str);
        }

        public static hnj hnj(String str) {
            return new hnj(str);
        }

        @Override // com.bytedance.adsdk.ugeno.qor.hnj.InterfaceC0174hnj
        public Object hnj(JSONObject jSONObject) {
            com.bytedance.adsdk.hnj.hn.hnj hnjVar = this.hnj;
            if (hnjVar == null) {
                return this.f12162hn;
            }
            Object objHnj = hnjVar.hnj(jSONObject);
            if (objHnj instanceof String) {
                return objHnj;
            }
            if (objHnj instanceof com.bytedance.adsdk.hnj.hn.hnj.hnj) {
                return String.valueOf(jip.hnj((com.bytedance.adsdk.hnj.hn.hnj.hnj) objHnj));
            }
            if (objHnj == null || !objHnj.getClass().isArray()) {
                return String.valueOf(objHnj);
            }
            try {
                return new JSONArray(objHnj).toString();
            } catch (JSONException unused) {
                return String.valueOf(objHnj);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qor.hnj
    public com.bytedance.adsdk.ugeno.qor.hnj.InterfaceC0174hnj hnj(String str) {
        return hnj.hnj(str);
    }
}
