package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.widget.FrameLayout;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj implements dse<com.bytedance.sdk.component.adexpress.dkl.dnm> {
    private final com.bytedance.sdk.component.adexpress.dkl.dnm hnj;

    public oj(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar) {
        com.bytedance.sdk.component.adexpress.dkl.dnm dnmVar = new com.bytedance.sdk.component.adexpress.dkl.dnm(context);
        this.hnj = dnmVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, dseVar.pv() > 0 ? dseVar.pv() : com.bytedance.sdk.component.adexpress.gjv.hn() ? 0 : AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
        dnmVar.setLayoutParams(layoutParams);
        dnmVar.setClipChildren(false);
        dnmVar.setText(dseVar.eta());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    /* JADX INFO: renamed from: gjv, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.dkl.dnm qor() {
        return this.hnj;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hn() {
        com.bytedance.sdk.component.adexpress.dkl.dnm dnmVar = this.hnj;
        if (dnmVar != null) {
            dnmVar.hn();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hnj() {
        com.bytedance.sdk.component.adexpress.dkl.dnm dnmVar = this.hnj;
        if (dnmVar != null) {
            dnmVar.hnj();
        }
    }
}
