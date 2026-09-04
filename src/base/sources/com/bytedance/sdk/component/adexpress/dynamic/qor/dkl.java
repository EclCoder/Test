package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dkl.eum;
import com.inmobi.media.core.config.models.AdConfig;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends uua<com.bytedance.sdk.component.adexpress.dkl.dkl> {
    public dkl(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, skVar, dseVar);
        this.f12658hn = context;
        this.gjv = dseVar;
        this.qor = skVar;
        hnj(i10, i11, i12, jSONObject, dseVar);
    }

    private void hnj(int i10, int i11, int i12, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar) {
        int iPv;
        this.hnj = new com.bytedance.sdk.component.adexpress.dkl.dkl(this.f12658hn, i10, i11, i12, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.f12658hn, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.f12658hn;
        if (dseVar.pv() > 0) {
            iPv = dseVar.pv();
        } else {
            iPv = com.bytedance.sdk.component.adexpress.gjv.hn() ? 0 : AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, iPv);
        this.hnj.setLayoutParams(layoutParams);
        this.hnj.setClipChildren(false);
        this.hnj.setSlideText(this.gjv.eta());
        eum eumVar = this.hnj;
        if (eumVar instanceof com.bytedance.sdk.component.adexpress.dkl.dkl) {
            ((com.bytedance.sdk.component.adexpress.dkl.dkl) eumVar).setShakeText(this.gjv.ka());
            final com.bytedance.sdk.component.adexpress.dkl.xn shakeView = ((com.bytedance.sdk.component.adexpress.dkl.dkl) this.hnj).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.dkl.oj.hnj() { // from class: com.bytedance.sdk.component.adexpress.dynamic.qor.dkl.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.qor.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.uua
    protected void gjv() {
    }
}
