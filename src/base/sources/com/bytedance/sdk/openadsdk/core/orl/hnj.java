package com.bytedance.sdk.openadsdk.core.orl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private double aq;
    private String bug;
    private String dkl;
    private String dse;
    private String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    hn f14121hn;
    private int ojm;
    qor qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f14122sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f14123ta;
    final com.bytedance.sdk.openadsdk.core.model.gjv hnj = new com.bytedance.sdk.openadsdk.core.model.gjv();
    private String dnm = "VAST_ACTION_BUTTON";

    public double aq() {
        return this.aq;
    }

    public Set<ta> bug() {
        return this.hnj.hn();
    }

    public String dkl() {
        return this.dkl;
    }

    public int dnm() {
        return this.f14123ta;
    }

    public String dse() {
        return this.dse;
    }

    public String gjv() {
        return this.gjv;
    }

    public hn hn() {
        return this.f14121hn;
    }

    public gjv hnj() {
        return this.hnj.hnj();
    }

    public String ojm() {
        qor qorVar;
        String str = this.dkl;
        if (!TextUtils.isEmpty(this.bug)) {
            String str2 = this.bug;
            this.bug = null;
            return str2;
        }
        String str3 = this.dnm;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            hn hnVar = this.f14121hn;
            if (hnVar != null && !TextUtils.isEmpty(hnVar.aq)) {
                str = this.f14121hn.aq;
            }
        } else if (str3.equals("VAST_END_CARD") && (qorVar = this.qor) != null && !TextUtils.isEmpty(qorVar.aq)) {
            str = this.qor.aq;
        }
        this.dnm = "VAST_ACTION_BUTTON";
        return str;
    }

    public com.bytedance.sdk.openadsdk.core.model.gjv orl() {
        return this.hnj;
    }

    public qor qor() {
        return this.qor;
    }

    public String sk() {
        return this.f14122sk;
    }

    public int ta() {
        return this.ojm;
    }

    public void dkl(String str) {
        this.bug = str;
    }

    public void gjv(String str) {
        this.dse = str;
    }

    public void hn(String str) {
        this.f14122sk = str;
    }

    public void hnj(hn hnVar) {
        if (hnVar != null) {
            hnVar.hnj(this.dse);
        }
        this.f14121hn = hnVar;
    }

    public void qor(String str) {
        this.dkl = str;
    }

    public void sk(String str) {
        this.dnm = str;
    }

    public void hn(int i10) {
        this.f14123ta = i10;
    }

    public void hnj(qor qorVar) {
        if (qorVar != null) {
            qorVar.hnj(this.dse);
        }
        this.qor = qorVar;
    }

    public void hnj(String str) {
        this.gjv = str;
    }

    public void hnj(double d10) {
        this.aq = d10;
    }

    public static hnj hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        hnj hnjVar = new hnj();
        gjv gjvVarHnj = hnjVar.hnj.hnj();
        if (gjvVarHnj == null) {
            gjvVarHnj = new gjv();
            hnjVar.hnj.hnj(gjvVarHnj);
        }
        gjvVarHnj.hnj(jSONObject.optJSONObject("videoTrackers"));
        hnjVar.f14121hn = hn.hnj(jSONObject.optJSONObject("vastIcon"));
        hnjVar.qor = qor.hn(jSONObject.optJSONObject("endCard"));
        hnjVar.gjv = jSONObject.optString(CampaignEx.JSON_KEY_TITLE);
        hnjVar.f14122sk = jSONObject.optString("description");
        hnjVar.dkl = jSONObject.optString("clickThroughUrl");
        hnjVar.dse = jSONObject.optString("videoUrl");
        hnjVar.aq = jSONObject.optDouble("videDuration");
        hnjVar.ojm = jSONObject.optInt("videoWidth");
        hnjVar.ojm = jSONObject.optInt("videoHeight");
        Set<ta> setHn = hnjVar.hnj.hn();
        if (setHn == null) {
            setHn = new HashSet<>();
            hnjVar.hnj.hnj(setHn);
        }
        setHn.addAll(ta.hnj(jSONObject.optJSONArray("viewabilityVendor")));
        return hnjVar;
    }

    public void hnj(as asVar) {
        this.hnj.hnj(asVar);
        hn hnVar = this.f14121hn;
        if (hnVar != null) {
            hnVar.hnj(asVar);
        }
        qor qorVar = this.qor;
        if (qorVar != null) {
            qorVar.hnj(asVar);
        }
    }

    public void hnj(int i10) {
        this.ojm = i10;
    }

    public void hnj(Set<ta> set) {
        this.hnj.hn(set);
    }
}
