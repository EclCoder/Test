package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.hqh;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.tgn;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class ta extends PAGRewardedAd {
    private final String gjv = tgn.hnj();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final AdSlot f13537hn;
    private final com.bytedance.sdk.openadsdk.core.model.hnj hnj;
    private com.bytedance.sdk.openadsdk.hnj.sk.hnj qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final orl f13538sk;

    ta(Context context, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, AdSlot adSlot) {
        this.hnj = hnjVar;
        this.f13537hn = adSlot;
        this.f13538sk = new orl(context, hnjVar, "rewarded_video", new orl.hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.ta.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.orl.hnj
            public Intent hnj(Context context2, as asVar, Activity activity) {
                if (asVar.dzo()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                return asVar.dkl() ? new Intent(context2, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTRewardVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.orl.hnj
            public void hnj(Intent intent, Activity activity, as asVar, boolean z10) {
                com.bytedance.sdk.openadsdk.component.reward.hnj.hn.hnj(intent, activity, ta.this.f13538sk.qor(), ta.this.hnj, ta.this.gjv);
                intent.putExtra("media_extra", ta.this.f13537hn.getMediaExtra());
                intent.putExtra("user_id", ta.this.f13537hn.getUserID());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.orl.hnj
            public void hnj(boolean z10) {
                if (ta.this.qor == null) {
                    return;
                }
                if (z10) {
                    hqh.hnj().hnj(ta.this.gjv, ta.this.qor);
                } else {
                    hqh.hnj().hnj(ta.this.qor);
                }
                ta.this.qor = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.orl.hnj
            public void hnj(as asVar) {
                hn.hnj(asVar, ta.this.f13538sk.qor(), true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.f13538sk.hnj(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.f13538sk.hn();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        this.f13538sk.hnj(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.qor = new dnm(pAGRewardedAdInteractionCallback, this.hnj);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.qor = new dnm(pAGRewardedAdInteractionListener, this.hnj);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(Activity activity) {
        this.f13538sk.hnj(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        this.f13538sk.hnj(d10);
    }

    public void hnj() {
        this.f13538sk.hnj();
    }
}
