package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class vf {
    private int aq;
    private String dkl;
    private int dnm;
    private String dse;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f14008hn;
    private String hnj;
    private String ojm;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f14009sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private String f14010ta;

    public boolean aq() {
        return this.gjv == 2;
    }

    public void dkl(String str) {
        this.hnj = str;
    }

    public void dse(String str) {
        this.f14008hn = str;
    }

    public String gjv() {
        return this.f14009sk;
    }

    public int hn() {
        return this.aq;
    }

    public String hnj() {
        return this.dse;
    }

    public boolean ojm() {
        return this.dnm == 1;
    }

    public String qor() {
        return this.ojm;
    }

    public String sk() {
        return this.dkl;
    }

    public String ta() {
        return this.qor == 2 ? this.f14008hn : this.hnj;
    }

    public int dkl() {
        return this.gjv;
    }

    public JSONObject dnm() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.hnj)) {
                jSONObject.put("market_dpl", this.hnj);
            }
            if (!TextUtils.isEmpty(this.f14008hn)) {
                jSONObject.put("market_dpl_auto", this.f14008hn);
            }
            if (!TextUtils.isEmpty(this.f14009sk)) {
                jSONObject.put("market_pkg", this.f14009sk);
            }
            if (!TextUtils.isEmpty(this.dse)) {
                jSONObject.put("app_pkg", this.dse);
            }
            if (!TextUtils.isEmpty(this.dkl)) {
                jSONObject.put("regex", this.dkl);
            }
            jSONObject.put("exec_type", this.qor);
            jSONObject.put("oem_vendor_type", this.gjv);
            jSONObject.put("overlay", this.aq);
            jSONObject.put("gp_card", this.dnm);
            if (!TextUtils.isEmpty(this.ojm)) {
                jSONObject.put("caller_id", this.ojm);
            }
            if (!TextUtils.isEmpty(this.f14010ta)) {
                jSONObject.put(lkCBSIFlvmyGX.LGiFZueWyL, this.f14010ta);
            }
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("OemModel", th2.getMessage());
            return null;
        }
    }

    public boolean dse() {
        return this.gjv == 1;
    }

    public void gjv(String str) {
        this.f14009sk = str;
    }

    public void hn(int i10) {
        this.aq = i10;
    }

    public void hnj(String str) {
        this.dse = str;
    }

    public void qor(String str) {
        this.f14010ta = str;
    }

    public void sk(String str) {
        this.dkl = str;
    }

    public void gjv(int i10) {
        this.gjv = i10;
    }

    public void hn(String str) {
        this.ojm = str;
    }

    public void hnj(int i10) {
        this.dnm = i10;
    }

    public void qor(int i10) {
        this.qor = i10;
    }

    public static vf hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        vf vfVar = new vf();
        try {
            vfVar.dkl(jSONObject.optString("market_dpl", ""));
            vfVar.dse(jSONObject.optString("market_dpl_auto", ""));
            vfVar.qor(jSONObject.optInt("exec_type", 0));
            vfVar.gjv(jSONObject.optInt("oem_vendor_type", 0));
            vfVar.gjv(jSONObject.optString("market_pkg", ""));
            vfVar.sk(jSONObject.optString("regex", ""));
            vfVar.hn(jSONObject.optInt("overlay", 1));
            vfVar.hn(jSONObject.optString("caller_id", ""));
            vfVar.qor(jSONObject.optString("ext_map", null));
            vfVar.hnj(jSONObject.optInt("gp_card", 0));
            vfVar.hnj(jSONObject.optString("app_pkg", ""));
            return vfVar;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("OemModel", th2.getMessage());
            return vfVar;
        }
    }

    public void hnj(Intent intent) {
        if (TextUtils.isEmpty(this.f14010ta)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f14010ta);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
