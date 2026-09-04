package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private as bug;
    private tu dkl;
    private String dnm;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13966hn;
    private String hnj;
    private int ojm;
    private String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private as f13967sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private wu f13968ta;
    private List<as> gjv = new ArrayList();
    private JSONObject dse = new JSONObject();
    private volatile boolean aq = false;

    public boolean aq() {
        return this.ojm == 1;
    }

    public as bug() {
        return this.f13967sk;
    }

    public as dkl() {
        if (this.gjv.size() > 0) {
            return this.gjv.get(0);
        }
        return null;
    }

    public String dnm() {
        return this.dnm;
    }

    public wu dse() {
        return this.f13968ta;
    }

    public List<as> gjv() {
        return this.gjv;
    }

    public String hn() {
        as asVarDkl = dkl();
        return asVarDkl != null ? asVarDkl.jp() : "";
    }

    public JSONObject hnj() {
        return this.dse;
    }

    public as ojm() {
        return this.bug;
    }

    public int qor() {
        return this.f13966hn;
    }

    public boolean sk() {
        List<as> list = this.gjv;
        return list != null && list.size() > 0;
    }

    public tu ta() {
        return this.dkl;
    }

    public void hnj(JSONObject jSONObject) {
        this.dse = jSONObject;
    }

    public void qor(String str) {
        this.dnm = str;
    }

    public void hnj(String str) {
        this.hnj = str;
    }

    public void hn(String str) {
        this.qor = str;
    }

    public void hnj(int i10) {
        this.f13966hn = i10;
    }

    public void hn(int i10) {
        this.ojm = i10;
    }

    public void hnj(as asVar) {
        this.gjv.add(asVar);
        if (this.bug == null) {
            this.bug = asVar;
        }
    }

    public static hnj hn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            hnj hnjVar = new hnj();
            hnjVar.hnj(wu.hnj(jSONObject.optJSONObject("loop_config")));
            hnjVar.hn(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    as asVarHnj = com.bytedance.sdk.openadsdk.core.hn.hnj(jSONArrayOptJSONArray.optJSONObject(i10), null, null, hnjVar, i10);
                    if (asVarHnj != null) {
                        arrayList.add(asVarHnj);
                    }
                }
                hnjVar.hnj(arrayList);
            }
            hnjVar.hnj(jSONObject.optString("request_id", ""));
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                hnjVar.hnj(tu.hnj(strOptString));
            }
            return hnjVar;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.hnj("AdInfo", "fromJson: ", th2);
            return null;
        }
    }

    public void hnj(List<as> list) {
        this.gjv = list;
        if (list.isEmpty()) {
            return;
        }
        this.bug = list.get(0);
    }

    public static Map<String, as> hnj(hnj hnjVar) {
        if (hnjVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (as asVar : hnjVar.gjv()) {
            if (!TextUtils.isEmpty(asVar.rx())) {
                map.put(asVar.rx(), asVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public void hnj(wu wuVar) {
        this.f13968ta = wuVar;
    }

    public void hnj(tu tuVar) {
        this.dkl = tuVar;
    }

    public void hn(as asVar) {
        this.f13967sk = asVar;
    }
}
