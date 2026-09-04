package com.bytedance.sdk.openadsdk.core.bug.hn.gjv;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.gjv.dnm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends com.bytedance.adsdk.ugeno.gjv.gjv.qor {
    private boolean bug;
    private float dnm;

    public hn(Context context) {
        super(context);
        this.dnm = 100.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.gjv.qor
    public boolean hnj(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (com.bytedance.adsdk.ugeno.dse.qor.hnj(String.valueOf(objArr[1]), 0.0f) <= 0.0f) {
                dnm dnmVar = this.hnj;
                if (dnmVar != null && !this.bug) {
                    this.bug = true;
                    dnmVar.hnj(this.f12243hn, this.dkl, this.qor.hn());
                }
                return true;
            }
            this.dnm = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("rate"), 100);
            float fHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(String.valueOf(objArr[0]), 100.0f);
            Log.d("UGBaseEventMonitor", "monitor: progress=" + fHnj + " mTargetProgress=" + this.dnm);
            if (fHnj >= this.dnm) {
                dnm dnmVar2 = this.hnj;
                if (dnmVar2 != null && !this.bug) {
                    this.bug = true;
                    dnmVar2.hnj(this.f12243hn, this.dkl, this.qor.hn());
                }
                return true;
            }
        }
        return false;
    }
}
