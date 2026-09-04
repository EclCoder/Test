package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    public String dkl;
    public int dse;
    public ArrayList<Integer> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public int f13989hn;
    public String hnj;
    public int qor = 1;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public AdSlot f13990sk;

    public AdSlot gjv() {
        return this.f13990sk;
    }

    public int hn() {
        return this.f13989hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public int qor() {
        return this.qor;
    }

    public ArrayList<Integer> sk() {
        return this.gjv;
    }

    public void hn(int i10) {
        this.qor = i10;
    }

    public void hnj(String str) {
        this.hnj = str;
    }

    public void qor(int i10) {
        this.dse = i10;
    }

    public void hn(String str) {
        this.dkl = str;
    }

    public void hnj(int i10) {
        this.f13989hn = i10;
    }

    public void hnj(AdSlot adSlot) {
        this.f13990sk = adSlot;
    }

    public void hnj(ArrayList<Integer> arrayList) {
        this.gjv = arrayList;
    }

    public static void hnj(qor qorVar) {
        int iHn;
        if (qorVar == null || qorVar.gjv() == null || (iHn = qorVar.hn()) >= 0 || iHn == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.jip.gjv.hnj("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.core.model.qor.1
            @Override // com.bytedance.sdk.openadsdk.jip.hn
            public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", qor.this.qor());
                jSONObject.put("err_code", qor.this.hn());
                jSONObject.put("err_msg", qor.this.dkl);
                jSONObject.put("ext_from", qor.this.dse);
                jSONObject.put("server_res_str", qor.this.hnj());
                if (qor.this.sk() != null && qor.this.sk().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) qor.this.sk()).toString());
                }
                return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("rd_client_custom_error").hnj(qor.this.gjv().getDurationSlotType()).hn(jSONObject.toString());
            }
        });
    }
}
