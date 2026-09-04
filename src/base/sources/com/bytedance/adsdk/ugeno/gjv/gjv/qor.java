package com.bytedance.adsdk.ugeno.gjv.gjv;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qor {
    protected String aq;
    protected String dkl;
    protected String dse;
    protected com.bytedance.adsdk.ugeno.gjv.dkl.hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.hn.qor f12243hn;
    protected com.bytedance.adsdk.ugeno.gjv.dnm hnj;
    protected String ojm;
    protected com.bytedance.adsdk.ugeno.gjv.dkl qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected Map<String, String> f12244sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected Context f12245ta;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        public static qor hnj(Context context, com.bytedance.adsdk.ugeno.hn.qor qorVar, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.gjv.dkl dklVarHnj;
            com.bytedance.adsdk.ugeno.gjv.dkl.hnj hnjVarHnj;
            if (qorVar == null || jSONObject == null || (dklVarHnj = com.bytedance.adsdk.ugeno.gjv.dkl.hnj(jSONObject, jSONObject2)) == null || (hnjVarHnj = dklVarHnj.hnj()) == null) {
                return null;
            }
            String strHnj = hnjVarHnj.hnj();
            if (TextUtils.equals(strHnj, "custom")) {
                gjv gjvVar = new gjv(context);
                gjvVar.hnj(qorVar);
                gjvVar.hnj(dklVarHnj);
                gjvVar.qor();
                return gjvVar;
            }
            com.bytedance.adsdk.ugeno.gjv.dse dseVarHnj = (TextUtils.isEmpty(strHnj) || TextUtils.equals(strHnj, "global")) ? com.bytedance.adsdk.ugeno.gjv.ta.hnj(hnjVarHnj.hn()) : com.bytedance.adsdk.ugeno.gjv.ta.hnj(hnjVarHnj.sk());
            if (dseVarHnj == null) {
                return null;
            }
            qor qorVarHnj = dseVarHnj.hnj(context);
            qorVarHnj.hnj(qorVar);
            qorVarHnj.hnj(dklVarHnj);
            qorVarHnj.qor();
            return qorVarHnj;
        }
    }

    public qor(Context context) {
        this.f12245ta = context;
    }

    public String dkl() {
        return this.ojm;
    }

    public com.bytedance.adsdk.ugeno.gjv.dkl dse() {
        return this.qor;
    }

    public String gjv() {
        return this.dkl;
    }

    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        this.f12243hn = qorVar;
    }

    public abstract boolean hnj(Object... objArr);

    public void qor() {
        this.gjv = this.qor.hnj();
        com.bytedance.adsdk.ugeno.gjv.dkl dklVar = this.qor;
        if (dklVar == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.gjv.dkl.hnj hnjVarHnj = dklVar.hnj();
        this.gjv = hnjVarHnj;
        if (hnjVarHnj == null) {
            return;
        }
        this.f12244sk = hnjVarHnj.qor();
        this.dkl = this.gjv.hn();
        this.dse = this.gjv.hnj();
        this.aq = this.gjv.gjv();
        this.ojm = this.gjv.sk();
    }

    public String sk() {
        return this.aq;
    }

    public void hnj(com.bytedance.adsdk.ugeno.gjv.dkl dklVar) {
        this.qor = dklVar;
    }

    public void hnj(com.bytedance.adsdk.ugeno.gjv.dnm dnmVar) {
        this.hnj = dnmVar;
    }
}
