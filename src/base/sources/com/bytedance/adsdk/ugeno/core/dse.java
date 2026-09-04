package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.coremedia.iso.boxes.MetaBox;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class dse {
    private float aq;
    private JSONObject dkl;
    private boolean dse;
    private JSONObject gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private JSONObject f12193hn;
    private JSONObject hnj;
    private float ojm;
    private String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f12194sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static class hnj {
        private String aq;
        private hnj dkl;
        private String dse;
        private JSONObject gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private String f12195hn;
        private String hnj;
        private boolean ojm;
        private JSONObject qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private LinkedList<hnj> f12196sk;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private boolean f12197ta;

        public JSONObject dkl() {
            return this.gjv;
        }

        public List<hnj> sk() {
            return this.f12196sk;
        }

        public String toString() {
            return "UGNode{id='" + this.hnj + "', name='" + this.f12195hn + "'}";
        }

        public JSONObject gjv() {
            return this.qor;
        }

        public String hn() {
            return this.dse;
        }

        public String qor() {
            return this.f12195hn;
        }

        public void hn(boolean z10) {
            this.f12197ta = z10;
        }

        public String hnj() {
            return this.hnj;
        }

        public void hn(hnj hnjVar) {
            if (this.f12196sk == null) {
                this.f12196sk = new LinkedList<>();
            }
            this.f12196sk.addLast(hnjVar);
        }

        public void hnj(String str) {
            this.f12195hn = str;
        }

        public void hnj(boolean z10) {
            this.ojm = z10;
        }

        public void hnj(hnj hnjVar) {
            if (this.f12196sk == null) {
                this.f12196sk = new LinkedList<>();
            }
            this.f12196sk.add(hnjVar);
        }

        public void hnj(int i10, hnj hnjVar) {
            if (this.f12196sk == null) {
                this.f12196sk = new LinkedList<>();
            }
            this.f12196sk.add(i10, hnjVar);
        }
    }

    public dse(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    private hnj sk() {
        if (!gjv()) {
            return hnj(this.hnj, (hnj) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f10 = this.aq;
            if (f10 > 0.0f) {
                jSONObject.put("width", f10);
            }
            float f11 = this.ojm;
            if (f11 > 0.0f) {
                jSONObject.put("height", f11);
            }
            JSONObject jSONObject2 = this.gjv;
            if (jSONObject2 != null) {
                String strOptString = jSONObject2.optString("xSize");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject3 = new JSONObject(strOptString);
                    if (jSONObject3.optInt("width") > 0) {
                        jSONObject.put("width", jSONObject3.optInt("width"));
                    }
                    if (jSONObject3.optInt("height") > 0) {
                        jSONObject.put("height", jSONObject3.optInt("height"));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        hnj hnjVar = new hnj();
        hnjVar.f12195hn = "View";
        hnjVar.hnj = "virtualNode";
        hnjVar.qor = jSONObject;
        hnjVar.dkl = null;
        hnjVar.dse = this.qor;
        hnjVar.aq = this.f12194sk;
        hnjVar.hnj(hnj(this.hnj, hnjVar));
        return hnjVar;
    }

    public boolean gjv() {
        return this.dse;
    }

    public String hn() {
        return this.qor;
    }

    public hnj hnj() {
        return sk();
    }

    public List<hnj> qor() {
        if (this.f12193hn == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.f12193hn.keys();
        while (itKeys.hasNext()) {
            hnj hnjVarHnj = hnj(this.f12193hn.optJSONObject(itKeys.next()), (hnj) null);
            if (hnjVarHnj != null) {
                arrayList.add(hnjVarHnj);
            }
        }
        return arrayList;
    }

    public dse(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject.has(TtmlNode.TAG_BODY)) {
                this.hnj = jSONObject.optJSONObject(TtmlNode.TAG_BODY);
            } else {
                this.hnj = jSONObject.optJSONObject("main_template");
            }
            this.f12193hn = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has(MetaBox.TYPE) ? jSONObject.optJSONObject(MetaBox.TYPE) : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has(TtmlNode.TAG_BODY)) {
                    this.dse = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.qor = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.qor = "3.0";
                    }
                } else {
                    this.qor = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.f12194sk = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has(TtmlNode.TAG_BODY)) {
                this.qor = "3.0";
                this.dse = true;
            }
            this.gjv = jSONObject2;
            this.dkl = jSONObject3;
        }
    }

    public static boolean gjv(hnj hnjVar) {
        return (hnjVar == null || hnjVar.qor == null) ? false : true;
    }

    public boolean hn(hnj hnjVar) {
        JSONObject jSONObjectGjv;
        if (hnjVar == null || (jSONObjectGjv = hnjVar.gjv()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectGjv.optString("height"), "match_parent");
    }

    public void hnj(float f10, float f11) {
        this.aq = f10;
        this.ojm = f11;
    }

    private hnj hnj(JSONObject jSONObject, hnj hnjVar) {
        String strOptString;
        String strOptString2;
        hnj hnjVarHnj;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has("type")) {
            strOptString = jSONObject.optString("type");
        } else {
            strOptString = jSONObject.optString("name");
        }
        String strOptString3 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        hnj hnjVar2 = new hnj();
        hnjVar2.hnj = strOptString3;
        if (!this.dse || !TextUtils.equals("Video", strOptString)) {
            hnjVar2.f12195hn = strOptString;
        } else {
            hnjVar2.f12195hn = strOptString + "V3";
        }
        hnjVar2.qor = jSONObject2;
        hnjVar2.dkl = hnjVar;
        hnjVar2.dse = this.qor;
        hnjVar2.aq = this.f12194sk;
        if (jSONObject2.has("i18n")) {
            hnjVar2.gjv = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            hnj(jSONObject, hnjVar2.qor);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObject.has("type")) {
                    strOptString2 = jSONObject.optString("type");
                } else {
                    strOptString2 = jSONObject.optString("name");
                }
                String strHnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(jSONObjectOptJSONObject.optString("id"), this.gjv);
                if (TextUtils.equals(strOptString2, "Template")) {
                    JSONObject jSONObject3 = this.f12193hn;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strHnj);
                        hnjVarHnj = hnj(jSONObjectOptJSONObject, hnjVar2);
                    } else {
                        hnjVarHnj = null;
                    }
                } else {
                    hnjVarHnj = hnj(jSONObjectOptJSONObject, hnjVar2);
                }
                if (hnjVarHnj != null) {
                    hnjVarHnj.hn(hn(hnjVarHnj));
                    hnjVarHnj.hnj(hnj(hnjVarHnj));
                }
                if (qor(hnjVarHnj)) {
                    i10++;
                    hnjVar2.hn(hnjVarHnj);
                } else if (hnjVarHnj != null) {
                    hnjVar2.hnj(i11 - i10, hnjVarHnj);
                }
            }
        }
        return hnjVar2;
    }

    public boolean qor(hnj hnjVar) {
        JSONObject jSONObjectGjv;
        if (hnjVar == null || (jSONObjectGjv = hnjVar.gjv()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectGjv.optString("position"), "absolute");
    }

    public boolean hnj(hnj hnjVar) {
        JSONObject jSONObjectGjv;
        if (hnjVar == null || (jSONObjectGjv = hnjVar.gjv()) == null) {
            return false;
        }
        return TextUtils.equals(jSONObjectGjv.optString("width"), Saucuwx.BpoSZgLdyKfxPI);
    }

    private void hnj(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.dkl == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.dkl.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (objOpt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.dse.hn.hnj(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
                        }
                    } else {
                        jSONObject3.put(next, objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException unused) {
        }
    }
}
