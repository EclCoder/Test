package com.bytedance.sdk.openadsdk.gjv.sk.hn;

import com.bytedance.sdk.openadsdk.core.model.as;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private boolean dkl = false;
    private JSONObject gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f14468hn;
    private as hnj;
    private JSONObject qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private qor f14469sk;

    public hnj(as asVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.hnj = asVar;
        this.f14468hn = str;
        this.qor = jSONObject;
        this.gjv = jSONObject2;
    }

    public boolean dkl() {
        return this.dkl;
    }

    public void dse() {
        qor qorVar = this.f14469sk;
        if (qorVar != null) {
            qorVar.hnj(this);
        }
    }

    public JSONObject gjv() {
        if (this.gjv == null) {
            this.gjv = new JSONObject();
        }
        return this.gjv;
    }

    public String hn() {
        return this.f14468hn;
    }

    public as hnj() {
        return this.hnj;
    }

    public JSONObject qor() {
        if (this.qor == null) {
            this.qor = new JSONObject();
        }
        return this.qor;
    }

    public qor sk() {
        return this.f14469sk;
    }

    public void hnj(qor qorVar) {
        this.f14469sk = qorVar;
    }

    public void hnj(boolean z10) {
        this.dkl = z10;
    }
}
