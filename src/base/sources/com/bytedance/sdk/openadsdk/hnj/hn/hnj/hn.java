package com.bytedance.sdk.openadsdk.hnj.hn.hnj;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.ojm.apu;
import com.bytedance.sdk.openadsdk.core.ojm.xn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends qor {
    public hn(Context context, as asVar, AdSlot adSlot) {
        super(context, asVar, adSlot);
    }

    public com.bytedance.sdk.openadsdk.xn.qor.hnj hn() {
        apu apuVar = this.f14518ta;
        if (apuVar != null) {
            return ((xn) apuVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.hnj.hn.hnj.qor
    protected void hnj() {
        xn xnVar = new xn(((qor) this).aq, this.f14506hn, ((qor) this).ojm, this.dnm, false);
        this.f14518ta = xnVar;
        this.hnj.hnj(xnVar.getVideoController());
        qor();
    }
}
