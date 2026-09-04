package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class oj implements TTClientBidding {
    private final aq hnj;

    oj(Context context, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        this.hnj = new aq(context, hnjVar);
    }

    public void hn() {
        this.hnj.hnj();
    }

    public aq hnj() {
        return this.hnj;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
        this.hnj.loss(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
        this.hnj.win(d10);
    }
}
