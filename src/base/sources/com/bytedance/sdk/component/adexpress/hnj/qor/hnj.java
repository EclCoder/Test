package com.bytedance.sdk.component.adexpress.hnj.qor;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private String dkl;
    private Map<String, hnj> dse = new ConcurrentHashMap();
    private List<C0184hnj> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f12726hn;
    private String hnj;
    private String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private hn f12727sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hn {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private String f12728hn;
        private String hnj;
        private List<Pair<String, String>> qor;

        public void hn(String str) {
            this.f12728hn = str;
        }

        public String hnj() {
            return this.hnj;
        }

        public List<Pair<String, String>> hn() {
            return this.qor;
        }

        public void hnj(String str) {
            this.hnj = str;
        }

        public void hnj(List<Pair<String, String>> list) {
            this.qor = list;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.hnj.qor.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0184hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private String f12729hn;
        private String hnj;
        private int qor;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0184hnj)) {
                return super.equals(obj);
            }
            String str2 = this.hnj;
            if (str2 != null) {
                C0184hnj c0184hnj = (C0184hnj) obj;
                if (str2.equals(c0184hnj.hnj()) && (str = this.f12729hn) != null && str.equals(c0184hnj.hn())) {
                    return true;
                }
            }
            return false;
        }

        public String hn() {
            return this.f12729hn;
        }

        public String hnj() {
            return this.hnj;
        }

        public int qor() {
            return this.qor;
        }

        public void hn(String str) {
            this.f12729hn = str;
        }

        public void hnj(String str) {
            this.hnj = str;
        }

        public void hnj(int i10) {
            this.qor = i10;
        }
    }

    public boolean aq() {
        return (TextUtils.isEmpty(gjv()) || TextUtils.isEmpty(qor()) || TextUtils.isEmpty(hn())) ? false : true;
    }

    public List<C0184hnj> dkl() {
        if (this.gjv == null) {
            this.gjv = new ArrayList();
        }
        return this.gjv;
    }

    public String dse() {
        return this.dkl;
    }

    public String gjv() {
        return this.qor;
    }

    public String hn() {
        return this.hnj;
    }

    public Map<String, hnj> hnj() {
        return this.dse;
    }

    public JSONObject ojm() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", hn());
            jSONObject.putOpt("version", qor());
            jSONObject.putOpt("main", gjv());
            if (!TextUtils.isEmpty(this.dkl)) {
                jSONObject.put("template_fetch_url", this.dkl);
            }
            JSONArray jSONArray = new JSONArray();
            if (dkl() != null) {
                for (C0184hnj c0184hnj : dkl()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0184hnj.hnj());
                    jSONObject2.putOpt("md5", c0184hnj.hn());
                    jSONObject2.putOpt("level", Integer.valueOf(c0184hnj.qor()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.dse.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z10 = false;
                for (String str : this.dse.keySet()) {
                    hnj hnjVar = this.dse.get(str);
                    if (hnjVar != null) {
                        jSONObject3.put(str, hnjVar.ojm());
                        z10 = true;
                    }
                }
                if (z10) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            hn hnVarSk = sk();
            if (hnVarSk != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", hnVarSk.hnj);
                jSONObject4.put("md5", hnVarSk.f12728hn);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listHn = hnVarSk.hn();
                if (listHn != null) {
                    for (Pair<String, String> pair : listHn) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String qor() {
        return this.f12726hn;
    }

    public hn sk() {
        return this.f12727sk;
    }

    public String ta() {
        JSONObject jSONObjectOjm;
        if (!aq() || (jSONObjectOjm = ojm()) == null) {
            return null;
        }
        return jSONObjectOjm.toString();
    }

    public static hnj sk(String str) {
        if (str == null) {
            return null;
        }
        try {
            return hnj(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void gjv(String str) {
        this.dkl = str;
    }

    public void hn(String str) {
        this.f12726hn = str;
    }

    public void hnj(String str) {
        this.hnj = str;
    }

    public void qor(String str) {
        this.qor = str;
    }

    public void hnj(hn hnVar) {
        this.f12727sk = hnVar;
    }

    public void hnj(List<C0184hnj> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.gjv = list;
    }

    public static hnj hnj(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        hnj hnjVar = new hnj();
        hnjVar.hnj(jSONObject.optString("name"));
        hnjVar.hn(jSONObject.optString("version"));
        hnjVar.qor(jSONObject.optString("main"));
        hnjVar.gjv(jSONObject.optString("template_fetch_url", ""));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                C0184hnj c0184hnj = new C0184hnj();
                c0184hnj.hnj(jSONObjectOptJSONObject2.optString("url"));
                c0184hnj.hn(jSONObjectOptJSONObject2.optString("md5"));
                c0184hnj.hnj(jSONObjectOptJSONObject2.optInt("level"));
                arrayList.add(c0184hnj);
            }
        }
        hnjVar.hnj(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    hnj hnjVarHnj = hnj(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (hnjVarHnj != null) {
                        hnjVar.hnj().put(next, hnjVarHnj);
                    }
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            hn hnVar = new hn();
            hnVar.hnj(jSONObjectOptJSONObject.optString("url"));
            hnVar.hn(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair<>(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                hnVar.hnj(arrayList2);
            }
            hnjVar.hnj(hnVar);
        }
        if (hnjVar.aq()) {
            return hnjVar;
        }
        return null;
    }
}
