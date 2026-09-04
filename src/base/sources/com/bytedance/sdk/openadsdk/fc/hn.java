package com.bytedance.sdk.openadsdk.fc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.dkl.aq;
import com.bytedance.sdk.openadsdk.core.dkl.dse;
import com.bytedance.sdk.openadsdk.utils.dnm;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends dse {
    public hn(Context context) {
        this(context, null);
    }

    private void hnj(Context context) {
        setId(jip.f14677sg);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(getContext());
        gjvVar.setId(jip.wxi);
        gjvVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        gjvVar.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        gjvVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        gjvVar.setBackgroundColor(Color.parseColor("#7f000000"));
        gjvVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(gjvVar);
        dse dseVar = new dse(context);
        dseVar.setId(jip.f14676rg);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        dseVar.setLayoutParams(layoutParams);
        addView(dseVar);
        int iHn = sq.hn(context, 44.0f);
        com.bytedance.sdk.openadsdk.core.widget.hnj hnjVar = new com.bytedance.sdk.openadsdk.core.widget.hnj(context);
        int i10 = jip.xad;
        hnjVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iHn, iHn);
        layoutParams2.addRule(14);
        hnjVar.setLayoutParams(layoutParams2);
        hnjVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        dseVar.addView(hnjVar);
        aq aqVar = new aq(context);
        aqVar.setId(jip.f14654cm);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iHn, iHn);
        layoutParams3.addRule(8, i10);
        layoutParams3.addRule(19, i10);
        layoutParams3.addRule(5, i10);
        layoutParams3.addRule(7, i10);
        layoutParams3.addRule(18, i10);
        layoutParams3.addRule(6, i10);
        layoutParams3.addRule(14);
        aqVar.setLayoutParams(layoutParams3);
        aqVar.setBackground(dnm.hnj(context, "tt_circle_solid_mian"));
        aqVar.setGravity(17);
        aqVar.setTextColor(-1);
        aqVar.setTextSize(2, 19.0f);
        aqVar.setTypeface(Typeface.defaultFromStyle(1));
        aqVar.setVisibility(8);
        dseVar.addView(aqVar);
        aq aqVar2 = new aq(context);
        int i11 = jip.dzo;
        aqVar2.setId(i11);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, i10);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = sq.hn(context, 6.0f);
        aqVar2.setLayoutParams(layoutParams4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aqVar2.setEllipsize(truncateAt);
        aqVar2.setMaxLines(1);
        aqVar2.setTextColor(-1);
        aqVar2.setTextSize(2, 12.0f);
        dseVar.addView(aqVar2);
        aq aqVar3 = new aq(context);
        aqVar3.setId(jip.pnz);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(sq.hn(context, 100.0f), sq.hn(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, i11);
        layoutParams5.topMargin = sq.hn(context, 20.0f);
        aqVar3.setLayoutParams(layoutParams5);
        aqVar3.setMinWidth(sq.hn(context, 72.0f));
        aqVar3.setMaxLines(1);
        aqVar3.setEllipsize(truncateAt);
        aqVar3.setTextColor(-1);
        aqVar3.setTextSize(2, 14.0f);
        aqVar3.setBackground(dnm.hnj(context, "tt_ad_cover_btn_begin_bg"));
        aqVar3.setGravity(17);
        int iHn2 = sq.hn(context, 10.0f);
        int iHn3 = sq.hn(context, 2.0f);
        aqVar3.setPadding(iHn2, iHn3, iHn2, iHn3);
        aqVar3.setVisibility(8);
        dseVar.addView(aqVar3);
    }

    public hn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public hn(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        hnj(context);
    }
}
