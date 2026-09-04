package com.bytedance.sdk.openadsdk.component.reward.hn;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.aq;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends hn {
    public qor(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        super(hnjVar);
    }

    private void hn(aq aqVar) {
        if (aqVar == null) {
            return;
        }
        Context context = aqVar.getContext();
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setOrientation(1);
        aqVar.addView(skVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar.setId(jip.f14685ua);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 100.0f;
        skVar.addView(qorVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar2 = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar2.setId(jip.bug);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        qorVar.addView(qorVar2, layoutParams2);
        qorVar2.addView(hn.hnj(context));
        if (this.f13412hn.qri() != 3 && this.f13412hn.qri() != 5) {
            com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
            gjvVar.setId(jip.zgl);
            gjvVar.setVisibility(8);
            gjvVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.gjv.hnj());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(sq.hn(context, 28.0f), sq.hn(context, 28.0f));
            layoutParams3.gravity = 8388693;
            layoutParams3.rightMargin = sq.hn(context, 20.0f);
            layoutParams3.bottomMargin = sq.hn(context, 10.0f);
            qorVar.addView(gjvVar, layoutParams3);
        }
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar3 = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar3.setId(jip.eum);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 0.0f;
        skVar.addView(qorVar3, layoutParams4);
        qorVar3.addView(gjv.hnj(context, this.hnj.f13456hn));
        com.bytedance.sdk.openadsdk.component.reward.view.sk.hnj(qorVar3, this.f13412hn);
        com.bytedance.sdk.openadsdk.component.reward.view.sk.hnj(qorVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public boolean gjv() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public void hnj(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public boolean sk() {
        return true;
    }

    public static boolean hnj(as asVar) {
        apu.qor(asVar);
        return apu.qor(asVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public void hnj(aq aqVar) {
        hn(aqVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public void dkl() {
    }
}
