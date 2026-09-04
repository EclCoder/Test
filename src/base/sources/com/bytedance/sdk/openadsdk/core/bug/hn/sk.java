package com.bytedance.sdk.openadsdk.core.bug.hn;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends com.bytedance.adsdk.ugeno.hn.qor<FrameLayout> {
    public sk(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    /* JADX INFO: renamed from: qor, reason: merged with bridge method [inline-methods] */
    public FrameLayout hnj() {
        FrameLayout frameLayout = new FrameLayout(this.f12280hn);
        com.bytedance.sdk.openadsdk.core.model.hn hnVar = new com.bytedance.sdk.openadsdk.core.model.hn();
        hnVar.hnj(true);
        PAGLogoView pAGLogoView = new PAGLogoView(this.f12280hn);
        pAGLogoView.initData(hnVar);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }
}
