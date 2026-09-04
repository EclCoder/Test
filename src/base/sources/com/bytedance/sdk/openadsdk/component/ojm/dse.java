package com.bytedance.sdk.openadsdk.component.ojm;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends com.bytedance.sdk.openadsdk.core.dkl.dse {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.dkl.gjv f13364hn;
    private final com.bytedance.sdk.openadsdk.core.dkl.gjv hnj;
    private final com.bytedance.sdk.openadsdk.core.dkl.aq qor;

    public dse(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int iHn = sq.hn(context, 12.0f);
        int iHn2 = sq.hn(context, 16.0f);
        int iHn3 = sq.hn(context, 20.0f);
        int iHn4 = sq.hn(context, 24.0f);
        int iHn5 = sq.hn(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        this.hnj = gjvVar;
        gjvVar.setId(520093713);
        int iHn6 = sq.hn(getContext(), 5.0f);
        gjvVar.setPadding(iHn6, iHn6, iHn6, iHn6);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        gjvVar.setScaleType(scaleType);
        gjvVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.gjv.hnj());
        gjvVar.setImageResource(wu.gjv(oj.hnj(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iHn5, iHn5);
        layoutParams.topMargin = iHn3;
        layoutParams.leftMargin = iHn2;
        layoutParams.setMarginStart(iHn2);
        gjvVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar2 = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        this.f13364hn = gjvVar2;
        gjvVar2.setId(520093714);
        gjvVar2.setPadding(iHn6, iHn6, iHn6, iHn6);
        gjvVar2.setScaleType(scaleType);
        gjvVar2.setBackground(com.bytedance.sdk.openadsdk.core.widget.gjv.hnj());
        gjvVar2.setImageResource(wu.gjv(oj.hnj(), "tt_close_btn"));
        if (gjvVar2.getDrawable() != null) {
            gjvVar2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iHn5, iHn5);
        layoutParams2.topMargin = iHn3;
        layoutParams2.rightMargin = iHn2;
        layoutParams2.setMarginEnd(iHn2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        gjvVar2.setLayoutParams(layoutParams2);
        gjvVar2.setVisibility(4);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.qor = aqVar;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, iHn4);
        layoutParams3.topMargin = iHn3;
        layoutParams3.rightMargin = iHn2;
        layoutParams3.addRule(11);
        layoutParams3.setMarginEnd(iHn2);
        layoutParams3.addRule(21);
        aqVar.setLayoutParams(layoutParams3);
        aqVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.gjv.hn());
        aqVar.setGravity(17);
        aqVar.setPadding(iHn, 0, iHn, 0);
        aqVar.setTextColor(-1);
        aqVar.setTextSize(1, 14.0f);
        aqVar.setVisibility(4);
        addView(gjvVar);
        addView(aqVar);
        addView(gjvVar2);
    }

    public com.bytedance.sdk.openadsdk.core.dkl.aq getTopCountDown() {
        return this.qor;
    }

    public View getTopDislike() {
        return this.hnj;
    }

    public com.bytedance.sdk.openadsdk.core.dkl.gjv getTopSkip() {
        return this.f13364hn;
    }
}
