package com.bytedance.sdk.openadsdk.core.model;

import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private gjv f13991hn;
    private ArrayList<hnj> hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        private Set<com.bytedance.sdk.openadsdk.core.orl.ta> gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final String f13992hn;
        private final String hnj;
        private com.bytedance.sdk.openadsdk.core.orl.gjv qor;

        public hnj(JSONObject jSONObject) {
            this.hnj = jSONObject.optString("vast_url");
            this.f13992hn = jSONObject.optString("vast_content");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (jSONObjectOptJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.orl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.orl.gjv();
                this.qor = gjvVar;
                gjvVar.hnj(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (jSONArrayOptJSONArray != null) {
                this.gjv = com.bytedance.sdk.openadsdk.core.orl.ta.hnj(jSONArrayOptJSONArray);
            }
        }

        public String gjv() {
            return this.f13992hn;
        }

        public Set<com.bytedance.sdk.openadsdk.core.orl.ta> hn() {
            return this.gjv;
        }

        public com.bytedance.sdk.openadsdk.core.orl.gjv hnj() {
            return this.qor;
        }

        public String qor() {
            return this.hnj;
        }

        public void hnj(com.bytedance.sdk.openadsdk.core.orl.gjv gjvVar) {
            this.qor = gjvVar;
        }

        public void hnj(Set<com.bytedance.sdk.openadsdk.core.orl.ta> set) {
            this.gjv = set;
        }
    }

    public sk(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            hnj hnjVar = new hnj(jSONArray.optJSONObject(i10));
            if (this.hnj == null) {
                this.hnj = new ArrayList<>();
            }
            this.hnj.add(hnjVar);
        }
    }

    public static boolean hnj(as asVar) {
        if (asVar == null || asVar.nyv()) {
            return false;
        }
        int iIz = asVar.iz();
        int iQri = asVar.qri();
        return (iIz == 3 || iIz == 7 || iIz == 8) && (iQri == 5 || iQri == 15 || iQri == 50);
    }

    public gjv hn() {
        if (this.f13991hn == null) {
            this.f13991hn = new gjv();
            ArrayList<hnj> arrayList = this.hnj;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    hnj hnjVar = arrayList.get(i10);
                    i10++;
                    hnj hnjVar2 = hnjVar;
                    com.bytedance.sdk.openadsdk.core.orl.gjv gjvVarHnj = hnjVar2.hnj();
                    Set<com.bytedance.sdk.openadsdk.core.orl.ta> setHn = hnjVar2.hn();
                    if (gjvVarHnj != null) {
                        this.f13991hn.hnj().hnj(gjvVarHnj);
                    }
                    if (setHn != null) {
                        this.f13991hn.hn().addAll(setHn);
                    }
                }
            }
        }
        return this.f13991hn;
    }

    public boolean qor() {
        ArrayList<hnj> arrayList = this.hnj;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public ArrayList<hnj> hnj() {
        return this.hnj;
    }
}
