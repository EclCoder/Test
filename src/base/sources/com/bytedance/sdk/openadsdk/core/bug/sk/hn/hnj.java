package com.bytedance.sdk.openadsdk.core.bug.sk.hn;

import android.content.Context;
import com.bytedance.adsdk.ugeno.gjv.dnm;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.adsdk.ugeno.gjv.gjv.qor {
    private boolean dnm;

    public hnj(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.gjv.qor
    public boolean hnj(Object... objArr) {
        Map<String, String> map = this.f12244sk;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = objArr[0];
                if (obj == null) {
                    return false;
                }
                int iHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(obj.toString(), -1);
                if (this.f12244sk.containsKey("remainingSeconds")) {
                    int iHnj2 = com.bytedance.adsdk.ugeno.dse.qor.hnj(this.f12244sk.get("remainingSeconds"), -1);
                    if (iHnj >= 0 && iHnj2 >= 0 && iHnj == iHnj2 && !this.dnm) {
                        this.dnm = true;
                        dnm dnmVar = this.hnj;
                        if (dnmVar != null) {
                            dnmVar.hnj(this.f12243hn, this.dkl, this.qor.hn());
                        }
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
