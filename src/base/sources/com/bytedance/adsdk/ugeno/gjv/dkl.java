package com.bytedance.adsdk.ugeno.gjv;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private List<hnj> f12240hn;
    private hnj hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        private Map<String, Object> dkl;
        private String gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private String f12241hn;
        private String hnj;
        private String qor = "global";

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private Map<String, String> f12242sk;

        public String gjv() {
            return this.hnj;
        }

        public String hn() {
            return this.gjv;
        }

        public String hnj() {
            return this.qor;
        }

        public Map<String, String> qor() {
            return this.f12242sk;
        }

        public String sk() {
            return this.f12241hn;
        }

        public String toString() {
            return "Action{scheme='" + this.qor + "', name='" + this.gjv + "', params=" + this.f12242sk + ", host='" + this.f12241hn + "', origin='" + this.hnj + "', extra=" + this.dkl + '}';
        }

        public void gjv(String str) {
            this.f12241hn = str;
        }

        public void hn(String str) {
            this.gjv = str;
        }

        public void hnj(String str) {
            this.qor = str;
        }

        public void qor(String str) {
            this.hnj = str;
        }

        public void hn(Map<String, Object> map) {
            this.dkl = map;
        }

        public void hnj(Map<String, String> map) {
            this.f12242sk = map;
        }
    }

    public List<hnj> hn() {
        return this.f12240hn;
    }

    public hnj hnj() {
        return this.hnj;
    }

    public static dkl hnj(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        dkl dklVar = new dkl();
        String strOptString = jSONObject.optString("on");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        dklVar.hnj = bug.hnj(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            hnj hnjVarHnj = bug.hnj(jSONArrayOptJSONArray.optString(i10), jSONObject2);
            if (hnjVarHnj != null) {
                arrayList.add(hnjVarHnj);
            }
        }
        dklVar.f12240hn = arrayList;
        return dklVar;
    }
}
