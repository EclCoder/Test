package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta extends dnm {
    public ta(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        super(hnjVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.dnm
    protected boolean hnj() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.dnm
    public void hnj(int i10, int i11) {
        super.hnj(i10, i11);
        if (as.sk(this.gjv) && this.gjv.krm() == 3 && this.gjv.vh() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.qor.fvt.findViewById(jip.bug);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.gjv.zf() == 1) {
                    int iHn = sq.hn(oj.hnj(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = iHn;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
