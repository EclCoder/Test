package com.bytedance.sdk.openadsdk.component.ojm;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jip;
import com.bytedance.sdk.openadsdk.core.widget.uua;
import com.bytedance.sdk.openadsdk.utils.dnm;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends qor {
    private final jip mjg;
    private final com.bytedance.sdk.openadsdk.core.dkl.sk orl;

    public dkl(Context context, as asVar) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        this.orl = skVar;
        skVar.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = sq.hn(context, 24.0f);
        layoutParams.topMargin = sq.hn(context, 56.0f);
        skVar.setLayoutParams(layoutParams);
        skVar.setClickable(false);
        skVar.setGravity(16);
        skVar.setOrientation(0);
        uua uuaVar = new uua(context);
        this.dkl = uuaVar;
        uuaVar.setId(520093759);
        this.dkl.setLayoutParams(new LinearLayout.LayoutParams(sq.hn(context, 24.0f), sq.hn(context, 24.0f)));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.dse = aqVar;
        aqVar.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = sq.hn(context, 8.0f);
        this.dse.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = this.dse;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aqVar2.setEllipsize(truncateAt);
        this.dse.setMaxLines(2);
        this.dse.setTextColor(Color.parseColor("#161823"));
        this.dse.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.dkl.dse dseVar = new com.bytedance.sdk.openadsdk.core.dkl.dse(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(sq.hn(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = sq.hn(context, 24.0f);
        layoutParams3.rightMargin = sq.hn(context, 24.0f);
        dseVar.setLayoutParams(layoutParams3);
        uua uuaVar2 = new uua(context);
        this.ojm = uuaVar2;
        int i10 = com.bytedance.sdk.openadsdk.utils.jip.ux;
        uuaVar2.setId(i10);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(sq.hn(context, 80.0f), sq.hn(context, 80.0f));
        layoutParams4.addRule(14);
        this.ojm.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar3 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.f13373ta = aqVar3;
        int i11 = com.bytedance.sdk.openadsdk.utils.jip.cbn;
        aqVar3.setId(i11);
        this.f13373ta.setTextSize(24.0f);
        this.f13373ta.setTextColor(Color.parseColor("#161823"));
        this.f13373ta.setGravity(17);
        this.f13373ta.setMaxLines(1);
        this.f13373ta.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i10);
        layoutParams5.topMargin = sq.hn(context, 12.0f);
        layoutParams5.addRule(14);
        this.f13373ta.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar4 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.dnm = aqVar4;
        int i12 = com.bytedance.sdk.openadsdk.utils.jip.xyb;
        aqVar4.setId(i12);
        this.dnm.setTextSize(16.0f);
        this.dnm.setTextColor(Color.parseColor("#80161823"));
        this.dnm.setGravity(17);
        this.dnm.setMaxLines(2);
        this.dnm.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i11);
        layoutParams6.topMargin = sq.hn(context, 4.0f);
        layoutParams6.addRule(14);
        this.dnm.setLayoutParams(layoutParams6);
        jip jipVar = new jip(context);
        this.mjg = jipVar;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(14);
        layoutParams7.topMargin = sq.hn(context, 12.0f);
        jipVar.setLayoutParams(layoutParams7);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar5 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.f13372sk = aqVar5;
        aqVar5.setId(520093717);
        this.f13372sk.setBackground(dnm.hnj(context, "tt_reward_full_video_backup_btn_bg"));
        this.f13372sk.setEllipsize(truncateAt);
        this.f13372sk.setLines(1);
        this.f13372sk.setGravity(17);
        this.f13372sk.setTextColor(-1);
        this.f13372sk.setTextSize(16.0f);
        this.f13372sk.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, sq.hn(context, 44.0f));
        layoutParams8.addRule(3, i12);
        layoutParams8.topMargin = sq.hn(context, 54.0f);
        layoutParams8.addRule(14);
        this.f13372sk.setLayoutParams(layoutParams8);
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, asVar);
        this.gjv = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, sq.hn(context, 14.0f));
        layoutParams9.leftMargin = sq.hn(context, 16.0f);
        layoutParams9.bottomMargin = sq.hn(context, 24.0f);
        layoutParams9.addRule(12);
        this.gjv.setLayoutParams(layoutParams9);
        addView(this.aq);
        skVar.addView(this.dkl);
        skVar.addView(this.dse);
        addView(skVar);
        dseVar.addView(this.ojm);
        dseVar.addView(this.f13373ta);
        dseVar.addView(this.dnm);
        dseVar.addView(jipVar);
        dseVar.addView(this.f13372sk);
        addView(dseVar);
        addView(this.gjv);
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public com.bytedance.sdk.openadsdk.core.dkl.gjv getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public com.bytedance.sdk.openadsdk.core.dkl.aq getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public jip getScoreBar() {
        return this.mjg;
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public View getUserInfo() {
        return this.orl;
    }
}
