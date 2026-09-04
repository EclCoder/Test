package com.bytedance.sdk.openadsdk.wu.hn;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private List<C0256hnj> f14780hn;
    private String hnj;
    private List<C0256hnj> qor;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.wu.hn.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0256hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private String f14781hn;
        private String hnj;
        private int qor;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0256hnj)) {
                return super.equals(obj);
            }
            String str2 = this.hnj;
            if (str2 != null) {
                C0256hnj c0256hnj = (C0256hnj) obj;
                if (str2.equals(c0256hnj.hnj) && (str = this.f14781hn) != null && str.equals(c0256hnj.f14781hn)) {
                    return true;
                }
            }
            return false;
        }

        public static C0256hnj hnj(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0256hnj c0256hnj = new C0256hnj();
            c0256hnj.hnj = jSONObject.optString("url");
            c0256hnj.f14781hn = jSONObject.optString("md5");
            c0256hnj.qor = jSONObject.optInt("type");
            return c0256hnj;
        }

        public String hnj() {
            return this.hnj;
        }
    }

    public void hn(List<C0256hnj> list) {
        this.qor = list;
    }

    public void hnj(String str) {
        this.hnj = str;
    }

    public List<C0256hnj> qor() {
        return this.qor;
    }

    public List<C0256hnj> hn() {
        return this.f14780hn;
    }

    public void hnj(List<C0256hnj> list) {
        this.f14780hn = list;
    }

    public static hnj hn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            hnj hnjVar = new hnj();
            hnjVar.hnj(jSONObject.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    C0256hnj c0256hnjHnj = C0256hnj.hnj(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (c0256hnjHnj != null) {
                        if (c0256hnjHnj.qor != 1) {
                            if (c0256hnjHnj.qor == 2 && arrayList2.size() < 10) {
                                arrayList2.add(c0256hnjHnj);
                            }
                        } else {
                            arrayList.add(c0256hnjHnj);
                        }
                    }
                }
            }
            hnjVar.hnj(arrayList);
            hnjVar.hn(arrayList2);
            return hnjVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String hnj() {
        return this.hnj;
    }
}
