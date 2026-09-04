package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements dse {
    com.bytedance.sdk.component.adexpress.dkl.sk hnj;

    public qor(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar) {
        this.hnj = new com.bytedance.sdk.component.adexpress.dkl.sk(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(skVar.getDynamicHeight(), skVar.getDynamicHeight());
        layoutParams.gravity = 17;
        this.hnj.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    /* JADX INFO: renamed from: gjv, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.dkl.sk qor() {
        return this.hnj;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hn() {
        this.hnj.hn();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hnj() {
        this.hnj.hnj();
    }
}
