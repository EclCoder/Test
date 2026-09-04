package com.bytedance.sdk.openadsdk.fc;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.dkl.dkl;
import com.bytedance.sdk.openadsdk.core.dkl.dse;
import com.bytedance.sdk.openadsdk.utils.dnm;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends dse {
    public gjv(Context context) {
        this(context, null);
    }

    private void hnj(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int iHn = sq.hn(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        qorVar.setId(jip.hw);
        qorVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        qorVar.setBackgroundColor(0);
        addView(qorVar);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        gjvVar.setId(jip.f14674qi);
        gjvVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        gjvVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        qorVar.addView(gjvVar);
        dkl dklVar = new dkl(context);
        dklVar.setId(jip.f14669mn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iHn, iHn);
        layoutParams.gravity = 17;
        dklVar.setLayoutParams(layoutParams);
        dklVar.setIndeterminateDrawable(dnm.hnj(context, "tt_video_loading_progress_bar"));
        qorVar.addView(dklVar);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar2 = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        gjvVar2.setId(jip.tq);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        gjvVar2.setLayoutParams(layoutParams2);
        gjvVar2.setScaleType(ImageView.ScaleType.CENTER);
        gjvVar2.setImageDrawable(dnm.hnj(context, "tt_play_movebar_textpage"));
        gjvVar2.setVisibility(8);
        addView(gjvVar2);
        View hnVar = new hn(context);
        hnVar.setId(jip.f14677sg);
        hnVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(hnVar);
    }

    public gjv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public gjv(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        hnj(context);
    }
}
