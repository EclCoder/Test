package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.hqh;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.tgn;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class aq extends PAGInterstitialAd {
    private final orl gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.hnj.qor.hn f13385hn;
    private final com.bytedance.sdk.openadsdk.core.model.hnj hnj;
    private final String qor = tgn.hnj();

    aq(Context context, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        this.hnj = hnjVar;
        this.gjv = new orl(context, hnjVar, "fullscreen_interstitial_ad", new orl.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.aq.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.orl.hnj
            public Intent hnj(Context context2, as asVar, Activity activity) {
                if (asVar.dzo()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                return asVar.dkl() ? new Intent(context2, (Class<?>) TTFullScreenExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTFullScreenVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.orl.hnj
            public void hnj(Intent intent, Activity activity, as asVar, boolean z10) {
                com.bytedance.sdk.openadsdk.component.reward.hnj.hn.hnj(intent, activity, aq.this.gjv.qor(), aq.this.hnj, aq.this.qor);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.orl.hnj
            public void hnj(boolean z10) {
                if (aq.this.f13385hn == null) {
                    return;
                }
                if (z10) {
                    hqh.hnj().hnj(aq.this.qor, aq.this.f13385hn);
                } else {
                    hqh.hnj().hnj(aq.this.f13385hn);
                }
                aq.this.f13385hn = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.orl.hnj
            public void hnj(as asVar) {
                hn.hnj(asVar, aq.this.gjv.qor(), false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.gjv.hnj(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.gjv.hn();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        this.gjv.hnj(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.f13385hn = new com.bytedance.sdk.openadsdk.component.qor.hnj(pAGInterstitialAdInteractionCallback, this.hnj);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.f13385hn = new com.bytedance.sdk.openadsdk.component.qor.hnj(pAGInterstitialAdInteractionListener, this.hnj);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        this.gjv.hnj(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        this.gjv.hnj(d10);
    }

    public void hnj() {
        this.gjv.hnj();
    }
}
