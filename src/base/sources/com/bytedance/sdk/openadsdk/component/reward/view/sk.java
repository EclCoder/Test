package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.uua;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    public static void hnj(FrameLayout frameLayout, as asVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.dkl.dse dseVar = new com.bytedance.sdk.openadsdk.core.dkl.dse(context);
        dseVar.setId(jip.tu);
        dseVar.setBackgroundColor(Color.parseColor("#F8F8F8"));
        frameLayout.addView(dseVar, new FrameLayout.LayoutParams(-1, -1));
        View bugVar = new com.bytedance.sdk.openadsdk.common.bug(context);
        bugVar.setId(jip.tgn);
        dseVar.addView(bugVar, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setId(jip.xyo);
        skVar.setOrientation(1);
        skVar.setVisibility(8);
        skVar.setGravity(1);
        skVar.setId(jip.orp);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        dseVar.addView(skVar, layoutParams);
        uua uuaVar = new uua(context);
        uuaVar.setId(jip.hqh);
        skVar.addView(uuaVar, new LinearLayout.LayoutParams(sq.hn(context, 80.0f), sq.hn(context, 80.0f)));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar.setId(jip.nyv);
        aqVar.setTextColor(Color.parseColor("#161823"));
        aqVar.setTextSize(2, 24.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = sq.hn(context, 12.0f);
        skVar.addView(aqVar, layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar2.setId(jip.pty);
        aqVar2.setGravity(17);
        aqVar2.setTextColor(Color.parseColor("#80161823"));
        aqVar2.setTextSize(2, 16.0f);
        aqVar2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        int iHn = sq.hn(context, 60.0f);
        layoutParams3.leftMargin = iHn;
        layoutParams3.rightMargin = iHn;
        layoutParams3.setMarginStart(iHn);
        layoutParams3.setMarginEnd(layoutParams3.rightMargin);
        layoutParams3.topMargin = sq.hn(context, 8.0f);
        skVar.addView(aqVar2, layoutParams3);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar3 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar3.setId(jip.f14659gm);
        aqVar3.setGravity(17);
        aqVar3.setTextColor(-1);
        aqVar3.setText(wu.hnj(context, "tt_video_mobile_go_detail"));
        aqVar3.setBackground(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(sq.hn(context, 255.0f), sq.hn(context, 44.0f));
        layoutParams4.topMargin = sq.hn(context, 32.0f);
        skVar.addView(aqVar3, layoutParams4);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar4 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar4.setId(jip.f14688vf);
        aqVar4.setGravity(17);
        aqVar4.setTextColor(-16777216);
        aqVar4.setText("Sorry,this AD fails to load...");
        aqVar4.setVisibility(8);
        aqVar4.setGravity(1);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(13);
        dseVar.addView(aqVar4, layoutParams5);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, asVar);
        viewCreatePAGLogoViewByMaterial.setId(jip.f14686ul);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, sq.hn(context, 14.0f));
        layoutParams6.addRule(12);
        int iHn2 = sq.hn(context, 16.0f);
        layoutParams6.leftMargin = iHn2;
        layoutParams6.setMarginStart(iHn2);
        layoutParams6.bottomMargin = sq.hn(context, 20.0f);
        dseVar.addView(viewCreatePAGLogoViewByMaterial, layoutParams6);
    }

    public static void hnj(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        View gjvVar = new gjv(context);
        gjvVar.setId(jip.mjg);
        gjvVar.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.addView(gjvVar, layoutParams);
        View skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setId(jip.f14657fc);
        skVar.setVisibility(8);
        frameLayout.addView(skVar, new FrameLayout.LayoutParams(-1, -1));
        View dklVar = new com.bytedance.sdk.component.ojm.dkl(context, true, com.bytedance.sdk.component.ojm.dkl.qor.ENDCARD);
        dklVar.setLayerType(2, null);
        dklVar.setVisibility(4);
        dklVar.setId(jip.jip);
        frameLayout.addView(dklVar, new FrameLayout.LayoutParams(-1, -1));
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(jip.uua);
        frameLayout2.setVisibility(4);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(new RFEndCardBackUpLayout(context), new FrameLayout.LayoutParams(-1, -1));
    }
}
