package com.bytedance.sdk.openadsdk.component.reward.hn;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.aq;
import com.bytedance.sdk.openadsdk.component.reward.view.dnm;
import com.bytedance.sdk.openadsdk.core.model.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.mjg;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends hn {
    public gjv(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        super(hnjVar);
    }

    private static LinearLayout hn(Context context) {
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setId(jip.as);
        skVar.setOrientation(1);
        skVar.setVisibility(8);
        skVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return skVar;
    }

    public static boolean hnj(as asVar) {
        return apu.hn(asVar) || apu.gjv(asVar) || apu.dse(asVar);
    }

    private static ImageView qor(Context context) {
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        gjvVar.setScaleType(ImageView.ScaleType.FIT_XY);
        gjvVar.setImageResource(wu.gjv(context, "tt_up_slide"));
        gjvVar.setId(jip.f51do);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(sq.hn(context, 18.0f), sq.hn(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = sq.hn(context, 45.0f);
        gjvVar.setLayoutParams(layoutParams);
        return gjvVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public void dnm() {
        dnm dnmVar;
        apu apuVar;
        if (apu.hn(this.hnj.f13456hn) && (dnmVar = this.hnj.f13464ua) != null && (apuVar = dnmVar.f13541fc) != null) {
            if (apuVar.gjv()) {
                this.hnj.f13464ua.hn(0);
                this.hnj.orl.set(true);
            } else {
                this.hnj.mjg.set(true);
                hnj(true, false, true, 80);
            }
        }
        if (apu.gjv(this.hnj.f13456hn) || apu.dse(this.hnj.f13456hn)) {
            hnj(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public RFEndCardBackUpLayout dse() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public boolean gjv() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public boolean sk() {
        if (apu.hn(this.hnj.f13456hn)) {
            return true;
        }
        return (apu.gjv(this.hnj.f13456hn) || apu.dse(this.hnj.f13456hn)) ? false : true;
    }

    public static void hnj(as asVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        if (apu.hn(asVar)) {
            hnj(frameLayout, asVar);
        } else if (apu.gjv(asVar) || apu.dse(asVar)) {
            hn(frameLayout, asVar);
        } else {
            hn.hnj(frameLayout, hnjVar);
        }
    }

    static void hn(FrameLayout frameLayout, as asVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar.setId(jip.eum);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = sq.hn(oj.hnj(), 58.0f);
        frameLayout.addView(qorVar, layoutParams);
        qorVar.addView(hnj(context, asVar));
        LinearLayout linearLayoutHn = hn(context);
        linearLayoutHn.setBackgroundColor(Color.parseColor("#99161823"));
        qorVar.addView(linearLayoutHn);
        linearLayoutHn.addView(qor(context));
        com.bytedance.sdk.openadsdk.component.reward.view.sk.hnj(qorVar, asVar);
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar2 = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar2.setId(jip.f14685ua);
        frameLayout.addView(qorVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar3 = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar3.setId(jip.bug);
        qorVar2.addView(qorVar3, new FrameLayout.LayoutParams(-1, -1));
        qorVar3.addView(hn.hnj(context));
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar4 = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar4.setId(jip.f14693xn);
        qorVar4.setVisibility(8);
        qorVar4.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        qorVar3.addView(qorVar4, layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        gjvVar.setId(jip.apu);
        gjvVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        qorVar4.addView(gjvVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.sk.hnj(qorVar2);
    }

    static void hnj(FrameLayout frameLayout, as asVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setOrientation(1);
        frameLayout.addView(skVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar.setId(jip.f14685ua);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        skVar.addView(qorVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar2 = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar2.setId(jip.bug);
        qorVar.addView(qorVar2, new FrameLayout.LayoutParams(-1, -1));
        qorVar2.addView(hn.hnj(context));
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar3 = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar3.setId(jip.f14693xn);
        qorVar3.setVisibility(8);
        qorVar3.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        qorVar2.addView(qorVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        gjvVar.setId(jip.apu);
        gjvVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        qorVar3.addView(gjvVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.sk.hnj(qorVar);
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar4 = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar4.setId(jip.eum);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        skVar.addView(qorVar4, layoutParams3);
        qorVar4.addView(hnj(context, asVar));
        LinearLayout linearLayoutHn = hn(context);
        linearLayoutHn.setBackgroundColor(Color.parseColor("#70161823"));
        qorVar4.addView(linearLayoutHn);
        linearLayoutHn.addView(qor(context));
        com.bytedance.sdk.openadsdk.component.reward.view.sk.hnj(qorVar4, asVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public void dkl() {
    }

    protected static com.bytedance.sdk.component.ojm.dkl hnj(Context context, as asVar) {
        com.bytedance.sdk.component.ojm.dkl dklVarHn = com.bytedance.sdk.openadsdk.mjg.hnj.hnj().hn(asVar);
        if (dklVarHn != null) {
            dklVarHn.setLpPreRender(true);
            ViewGroup viewGroup = (ViewGroup) dklVarHn.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(dklVarHn);
            }
        } else {
            dklVarHn = new com.bytedance.sdk.component.ojm.dkl(context, true, com.bytedance.sdk.component.ojm.dkl.qor.LANDING_PAGE_LOADING);
            dklVarHn.setLayerType(2, null);
        }
        sq.hnj((View) dklVarHn, 0);
        dklVarHn.setId(jip.wu);
        dklVarHn.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return dklVarHn;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public void hnj(aq aqVar) {
        hnj(this.f13412hn, aqVar, this.hnj);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.hn.hn
    public void hnj(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar;
        mjg mjgVar;
        if (!apu.gjv(this.hnj.f13456hn) || this.hnj.f13456hn.dzo() || (mjgVar = (hnjVar = this.hnj).f13455gn) == null) {
            return;
        }
        mjgVar.hnj(hnjVar.f13456hn.m31do().hn() * 1000);
    }
}
