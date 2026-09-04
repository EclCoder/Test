package com.bytedance.sdk.openadsdk.core.bug.sk.hn;

import android.content.Context;
import com.bytedance.adsdk.ugeno.gjv.dnm;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends com.bytedance.adsdk.ugeno.gjv.gjv.qor {
    private boolean dnm;

    public gjv(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.gjv.qor
    public boolean hnj(Object... objArr) {
        Map<String, String> map = this.f12244sk;
        if (map == null || map.isEmpty()) {
            return false;
        }
        long jLongValue = ((Long) objArr[0]).longValue() / 1000;
        long jLongValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (jLongValue <= 0) {
            this.dnm = false;
        }
        if (this.f12244sk.containsKey("percent")) {
            float fHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("percent"), -1.0f);
            if (fHnj >= 0.0f && jLongValue >= (fHnj / 100.0f) * jLongValue2 && !this.dnm) {
                this.dnm = true;
                dnm dnmVar = this.hnj;
                if (dnmVar != null) {
                    dnmVar.hnj(this.f12243hn, this.dkl, this.qor.hn());
                }
            }
        } else if (jLongValue >= com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("interval"), -1) && !this.dnm) {
            this.dnm = true;
            dnm dnmVar2 = this.hnj;
            if (dnmVar2 != null) {
                dnmVar2.hnj(this.f12243hn, this.dkl, this.qor.hn());
            }
        }
        return true;
    }
}
