package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dkl.eum;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends uua<com.bytedance.sdk.component.adexpress.dkl.dse> {
    public gjv(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar) {
        super(context, skVar, dseVar);
        hnj(dseVar);
    }

    private void hnj(com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar) {
        this.hnj = new com.bytedance.sdk.component.adexpress.dkl.dse(this.f12658hn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.f12658hn, dseVar.pv());
        this.hnj.setLayoutParams(layoutParams);
        this.hnj.setSlideText(this.gjv.eta());
        eum eumVar = this.hnj;
        if (eumVar instanceof com.bytedance.sdk.component.adexpress.dkl.dse) {
            ((com.bytedance.sdk.component.adexpress.dkl.dse) eumVar).setButtonText(this.gjv.ta());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.uua, com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hn() {
        this.hnj.hn();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.uua, com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hnj() {
        this.hnj.hnj();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.uua
    protected void gjv() {
    }
}
