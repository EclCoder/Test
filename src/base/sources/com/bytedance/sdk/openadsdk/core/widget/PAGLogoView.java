package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private com.bytedance.sdk.openadsdk.core.dkl.gjv mAdLogo;
    private com.bytedance.sdk.openadsdk.core.dkl.aq mAdText;

    public PAGLogoView(Context context) {
        this(context, null);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, as asVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(asVar);
        return pAGLogoView;
    }

    private void initView(Context context) {
        int iHn = sq.hn(context, 2.0f);
        this.containerHeight = sq.hn(getContext(), 12.0f);
        this.mAdLogo = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(sq.hn(context, 14.0f), sq.hn(context, 6.0f));
        layoutParams.leftMargin = iHn;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = iHn;
        layoutParams2.rightMargin = iHn;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iHn);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public void initData(as asVar) {
        if (asVar == null) {
            return;
        }
        initData(asVar.gmt());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.dkl.ojm.hnj(this, layoutParams));
    }

    public PAGLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void initData(com.bytedance.sdk.openadsdk.core.model.hn hnVar) {
        if (hnVar == null) {
            return;
        }
        if (hnVar.sk()) {
            this.mAdLogo.setImageDrawable(wu.qor(com.bytedance.sdk.openadsdk.core.oj.hnj(), "tt_ad_logo"));
        } else {
            String strHnj = hnVar.hnj();
            if (TextUtils.isEmpty(strHnj)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (strHnj.contains("logo")) {
                    this.mAdLogo.setImageDrawable(wu.qor(com.bytedance.sdk.openadsdk.core.oj.hnj(), "tt_ad_logo"));
                } else {
                    com.bytedance.sdk.openadsdk.ta.gjv.hnj(strHnj).qor(1).hnj(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String strHn = hnVar.hn();
        if (hnVar.sk()) {
            this.mAdText.setText(wu.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), "tt_logo_en"));
        } else if (TextUtils.isEmpty(strHn)) {
            this.mAdText.setVisibility(8);
        } else {
            this.mAdText.setText(strHn);
            this.mAdText.setVisibility(0);
        }
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initView(context);
    }
}
