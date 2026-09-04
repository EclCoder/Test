package com.bytedance.sdk.openadsdk.fc;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.core.dkl.aq;
import com.bytedance.sdk.openadsdk.core.dkl.dse;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends dse {
    public sk(Context context) {
        this(context, null);
    }

    private void hnj(Context context) {
        setId(jip.qri);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        aq aqVar = new aq(context);
        int i10 = jip.f14695yl;
        aqVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        aqVar.setLayoutParams(layoutParams);
        aqVar.setIncludeFontPadding(false);
        aqVar.setText(wu.hnj(context, "tt_video_without_wifi_tips"));
        aqVar.setTextColor(Color.parseColor("#cacaca"));
        aqVar.setTextSize(2, 14.0f);
        addView(aqVar);
        dse dseVar = new dse(context);
        dseVar.setId(jip.rx);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i10);
        layoutParams2.addRule(13);
        dseVar.setLayoutParams(layoutParams2);
        addView(dseVar);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        gjvVar.setId(jip.jpm);
        int iHn = sq.hn(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iHn, iHn);
        layoutParams3.addRule(15);
        gjvVar.setLayoutParams(layoutParams3);
        gjvVar.setImageDrawable(wu.qor(context, "tt_new_play_video"));
        gjvVar.setScaleType(ImageView.ScaleType.FIT_XY);
        dseVar.addView(gjvVar);
    }

    public sk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public sk(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        hnj(context);
    }
}
