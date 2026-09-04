package com.bytedance.adsdk.ugeno.gjv.gjv;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends qor implements com.bytedance.adsdk.ugeno.hnj.hn {
    private String dnm;

    public hn(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hn
    public void hn() {
        com.bytedance.adsdk.ugeno.gjv.dnm dnmVar;
        if ((TextUtils.equals(this.dnm, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || TextUtils.isEmpty(this.dnm)) && (dnmVar = this.hnj) != null) {
            dnmVar.hnj(this.f12243hn, this.dkl, this.qor.hn());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.gjv.gjv.qor
    public boolean hnj(Object... objArr) {
        com.bytedance.adsdk.ugeno.hn.qor qorVar;
        com.bytedance.adsdk.ugeno.hn.qor qorVarHn;
        com.bytedance.adsdk.ugeno.hnj.hnj hnjVarBug;
        Map<String, String> map = this.f12244sk;
        if (map != null && map.size() > 0) {
            String str = this.f12244sk.get("name");
            this.dnm = this.f12244sk.get("state");
            if (!TextUtils.isEmpty(str) && (qorVarHn = (qorVar = this.f12243hn).hn(qorVar)) != null && (hnjVarBug = qorVarHn.aq(str).bug(str)) != null) {
                hnjVarBug.hnj(this);
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hn
    public void hnj() {
        com.bytedance.adsdk.ugeno.gjv.dnm dnmVar;
        if ((TextUtils.equals(this.dnm, "start") || TextUtils.isEmpty(this.dnm)) && (dnmVar = this.hnj) != null) {
            dnmVar.hnj(this.f12243hn, this.dkl, this.qor.hn());
        }
    }
}
