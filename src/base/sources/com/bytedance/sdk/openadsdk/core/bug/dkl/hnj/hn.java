package com.bytedance.sdk.openadsdk.core.bug.dkl.hnj;

import com.bytedance.sdk.openadsdk.core.model.as;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hn {
    protected as hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        public static hn hnj(as asVar, com.bytedance.sdk.openadsdk.core.bug.dkl.hnj hnjVar) {
            if (asVar == null) {
                return null;
            }
            int iXf = asVar.xf();
            if (iXf == 1) {
                return new com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.hnj(asVar, hnjVar);
            }
            if (iXf == 3) {
                return new gjv(asVar, hnjVar);
            }
            if (iXf == 7 || iXf == 8) {
                return new sk(asVar, hnjVar);
            }
            return null;
        }
    }

    public hn(as asVar) {
        this.hnj = asVar;
    }

    public abstract JSONObject hn();

    public abstract String hnj();

    public void hnj(JSONObject jSONObject) {
    }
}
