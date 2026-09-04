package com.bytedance.sdk.openadsdk.hnj;

import android.text.TextUtils;
import com.bytedance.sdk.component.aq.hn.qor;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.ojm;
import com.bytedance.sdk.openadsdk.core.settings.dse;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.core.ta.hn;
import com.bytedance.sdk.openadsdk.oj.gjv;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.ua;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.f;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    public static boolean hnj(PAGLoadListener pAGLoadListener) {
        if (dse.hnj()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your AM");
        return true;
    }

    public static void hnj(final qor qorVar, final PAGLoadListener pAGLoadListener, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnj.hnj.1
            @Override // java.lang.Runnable
            public void run() {
                if (!fc.sk()) {
                    PAGLoadListener pAGLoadListener2 = pAGLoadListener;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                if (!hn.hnj().dnm() || !ta.hn().dnm()) {
                    com.bytedance.sdk.openadsdk.oj.qor.hnj(new gjv() { // from class: com.bytedance.sdk.openadsdk.hnj.hnj.1.1
                        @Override // com.bytedance.sdk.openadsdk.oj.gjv
                        public com.bytedance.sdk.openadsdk.oj.hn.hnj hnj() {
                            com.bytedance.sdk.openadsdk.oj.hn.hnj hnjVar = new com.bytedance.sdk.openadsdk.oj.hn.hnj();
                            hnjVar.hn(f.LOAD_AD);
                            hnjVar.qor(adSlot.getCodeId());
                            hnjVar.gjv(orp.qor(adSlot.getDurationSlotType()));
                            hnjVar.hnj(BuildConfig.VERSION_NAME);
                            hnjVar.dse(orp.hnj(adSlot).toString());
                            return hnjVar;
                        }
                    });
                    ua.qor(qorVar);
                } else {
                    PAGLoadListener pAGLoadListener3 = pAGLoadListener;
                    if (pAGLoadListener3 != null) {
                        pAGLoadListener3.onError(10004, ojm.hnj(10004));
                    }
                }
            }
        };
        if (fc.sk()) {
            runnable.run();
        } else {
            fc.hn().post(runnable);
        }
    }

    public static void hnj(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!fc.sk() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
        }
        if (extraInfo.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID) != null) {
            builder.setCreativeId(extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID).toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static boolean hnj(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
        if (TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        }
        if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        }
        pAGLoadListener.onError(2, PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
        return true;
    }
}
