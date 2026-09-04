package com.bytedance.sdk.openadsdk.hnj.hn.hnj;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.jip;
import com.bytedance.sdk.openadsdk.core.ojm.apu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.sdk.openadsdk.core.ojm.hnj {
    private com.bytedance.sdk.openadsdk.hnj.hn.hnj bug;
    private apu hnj;

    public hnj(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ojm.hnj
    protected void hnj(View view, int i10, jip jipVar) {
        apu apuVar = this.hnj;
        if (apuVar != null) {
            apuVar.hnj(view, i10, jipVar);
        }
    }

    public void setExtraFuncationHelper(com.bytedance.sdk.openadsdk.hnj.hn.hnj hnjVar) {
        this.bug = hnjVar;
    }

    public void hnj(apu apuVar) {
        this.hnj = apuVar;
        apuVar.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
