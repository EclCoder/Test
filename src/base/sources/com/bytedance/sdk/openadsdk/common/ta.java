package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta extends RelativeLayout {
    public ta(Context context) {
        super(context);
        hnj();
    }

    private void hnj() {
        Context context = getContext();
        int iHn = sq.hn(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, sq.hn(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        gjvVar.setId(520093720);
        gjvVar.setClickable(true);
        gjvVar.setFocusable(true);
        gjvVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_leftbackicon_selector"));
        int iHn2 = sq.hn(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iHn2, iHn2);
        layoutParams.leftMargin = iHn;
        layoutParams.addRule(15);
        addView(gjvVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar2 = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        gjvVar2.setId(520093716);
        gjvVar2.setClickable(true);
        gjvVar2.setFocusable(true);
        gjvVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iHn2, iHn2);
        layoutParams2.leftMargin = iHn;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(gjvVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar3 = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.jip.f14689vh;
        gjvVar3.setId(i10);
        gjvVar3.setImageDrawable(wu.qor(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iHn2, iHn2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iHn;
        addView(gjvVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar.setId(com.bytedance.sdk.openadsdk.utils.jip.f14656dl);
        aqVar.setSingleLine(true);
        aqVar.setEllipsize(TextUtils.TruncateAt.END);
        aqVar.setGravity(17);
        aqVar.setTextColor(-16777216);
        aqVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(sq.hn(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i10);
        int iHn3 = sq.hn(context, 25.0f);
        layoutParams4.rightMargin = iHn3;
        layoutParams4.leftMargin = iHn3;
        addView(aqVar, layoutParams4);
    }
}
