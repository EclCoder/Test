package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm extends FrameLayout {
    private String aq;
    private com.bytedance.sdk.openadsdk.core.dkl.aq dkl;
    private as dse;
    private jip gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private uua f14260hn;
    private boolean hnj;
    private com.bytedance.sdk.openadsdk.core.qor.hnj ojm;
    private TextView qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private PAGLogoView f14261sk;

    public dnm(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.jip.jle);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar) {
        this.ojm = hnjVar;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            hnj();
        }
    }

    private void hn() {
        Context context = getContext();
        boolean z10 = this.dse.zf() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setGravity(1);
        skVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z10 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(sq.hn(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iHn = sq.hn(context, 24.0f);
        layoutParams.rightMargin = iHn;
        layoutParams.leftMargin = iHn;
        addView(skVar, layoutParams);
        uua uuaVar = new uua(context);
        this.f14260hn = uuaVar;
        uuaVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(sq.hn(context, 80.0f), sq.hn(context, 80.0f));
        layoutParams2.bottomMargin = sq.hn(context, 12.0f);
        skVar.addView(this.f14260hn, layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.qor = aqVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aqVar.setEllipsize(truncateAt);
        this.qor.setGravity(17);
        this.qor.setMaxLines(2);
        this.qor.setMaxWidth(sq.hn(context, 180.0f));
        this.qor.setTextColor(-1);
        this.qor.setTextSize(2, 24.0f);
        skVar.addView(this.qor, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.dkl = aqVar2;
        aqVar2.setEllipsize(truncateAt);
        this.dkl.setGravity(17);
        this.dkl.setMaxLines(2);
        this.dkl.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.dkl.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = sq.hn(context, 8.0f);
        skVar.addView(this.dkl, layoutParams3);
        this.gjv = new jip(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, sq.hn(context, 16.0f));
        layoutParams4.topMargin = sq.hn(context, 12.0f);
        this.gjv.setVisibility(8);
        skVar.addView(this.gjv, layoutParams4);
        this.f14261sk = PAGLogoView.createPAGLogoViewByMaterial(context, this.dse);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, sq.hn(context, 14.0f));
        layoutParams5.gravity = 8388691;
        layoutParams5.leftMargin = sq.hn(context, 18.0f);
        if (z10) {
            layoutParams5.bottomMargin = sq.hn(context, 61.0f);
        } else {
            layoutParams5.bottomMargin = sq.hn(context, 24.0f);
        }
        addView(this.f14261sk, layoutParams5);
    }

    public void hnj(as asVar, String str, com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar) {
        this.dse = asVar;
        this.aq = str;
        this.ojm = hnjVar;
    }

    private void hnj() {
        if (this.hnj) {
            return;
        }
        this.hnj = true;
        hn();
        if (this.f14260hn != null && this.dse.mn() != null && !TextUtils.isEmpty(this.dse.mn().hnj())) {
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.dse.mn(), this.f14260hn, this.dse);
        }
        jip jipVar = this.gjv;
        if (jipVar != null) {
            sq.hnj((TextView) null, jipVar, this.dse);
            if (this.dse.zyh() != null) {
                this.gjv.setVisibility(0);
            }
        }
        if (this.qor != null) {
            if (this.dse.zyh() != null && !TextUtils.isEmpty(this.dse.zyh().hn())) {
                this.qor.setText(this.dse.zyh().hn());
            } else if (!TextUtils.isEmpty(this.dse.mw())) {
                this.qor.setText(this.dse.mw());
            } else {
                this.qor.setVisibility(8);
            }
        }
        if (this.dkl != null) {
            String strKby = this.dse.kby();
            if (!TextUtils.isEmpty(strKby)) {
                this.dkl.setText(strKby);
            } else {
                this.dkl.setVisibility(8);
            }
        }
        this.f14261sk.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.dnm.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.hnj(dnm.this.getContext(), dnm.this.dse, dnm.this.aq);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
