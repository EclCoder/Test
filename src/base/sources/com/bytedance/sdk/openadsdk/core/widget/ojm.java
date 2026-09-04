package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends FrameLayout {
    private as aq;
    private PAGLogoView dkl;
    private com.bytedance.sdk.openadsdk.core.qor.hnj dnm;
    private com.bytedance.sdk.openadsdk.core.dkl.aq dse;
    private jip gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private uua f14298hn;
    private boolean hnj;
    private String ojm;
    private TextView qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private TextView f14299sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private boolean f14300ta;

    public ojm(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.jip.aip);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar) {
        this.dnm = hnjVar;
        TextView textView = this.f14299sk;
        if (textView != null) {
            textView.setOnClickListener(hnjVar);
            this.f14299sk.setOnTouchListener(this.dnm);
        }
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
        boolean z10 = this.aq.zf() == 1;
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
        this.f14298hn = uuaVar;
        uuaVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(sq.hn(context, 80.0f), sq.hn(context, 80.0f));
        layoutParams2.bottomMargin = sq.hn(context, 12.0f);
        skVar.addView(this.f14298hn, layoutParams2);
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
        this.dse = aqVar2;
        aqVar2.setEllipsize(truncateAt);
        this.dse.setGravity(17);
        this.dse.setMaxLines(2);
        this.dse.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.dse.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = sq.hn(context, 8.0f);
        skVar.addView(this.dse, layoutParams3);
        this.gjv = new jip(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, sq.hn(context, 16.0f));
        layoutParams4.topMargin = sq.hn(context, 12.0f);
        this.gjv.setVisibility(8);
        skVar.addView(this.gjv, layoutParams4);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar3 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.f14299sk = aqVar3;
        aqVar3.setId(520093707);
        this.f14299sk.setGravity(17);
        this.f14299sk.setText(wu.hnj(context, "tt_video_download_apk"));
        this.f14299sk.setTextColor(-1);
        this.f14299sk.setTextSize(2, 16.0f);
        this.f14299sk.setBackground(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, sq.hn(context, 44.0f));
        layoutParams5.topMargin = sq.hn(context, 54.0f);
        skVar.addView(this.f14299sk, layoutParams5);
        if (!this.f14300ta && this.aq.xj() && hqh.qor(this.aq)) {
            this.f14299sk.setVisibility(8);
        }
        this.dkl = PAGLogoView.createPAGLogoViewByMaterial(context, this.aq);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, sq.hn(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = sq.hn(context, 18.0f);
        if (z10) {
            layoutParams6.bottomMargin = sq.hn(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = sq.hn(context, 24.0f);
        }
        addView(this.dkl, layoutParams6);
    }

    public void hnj(as asVar, String str, com.bytedance.sdk.openadsdk.core.qor.hnj hnjVar, boolean z10) {
        this.aq = asVar;
        this.ojm = str;
        this.f14300ta = z10;
        this.dnm = hnjVar;
    }

    private void hnj() {
        if (this.hnj) {
            return;
        }
        this.hnj = true;
        hn();
        this.f14299sk.setOnClickListener(this.dnm);
        this.f14299sk.setOnTouchListener(this.dnm);
        String strCq = this.aq.cq();
        if (!TextUtils.isEmpty(strCq)) {
            this.f14299sk.setText(strCq);
        }
        if (this.f14298hn != null && this.aq.mn() != null && !TextUtils.isEmpty(this.aq.mn().hnj())) {
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.aq.mn(), this.f14298hn, this.aq);
        }
        jip jipVar = this.gjv;
        if (jipVar != null) {
            sq.hnj((TextView) null, jipVar, this.aq);
            if (this.aq.zyh() != null) {
                this.gjv.setVisibility(0);
            }
        }
        if (this.qor != null) {
            if (this.aq.zyh() != null && !TextUtils.isEmpty(this.aq.zyh().hn())) {
                this.qor.setText(this.aq.zyh().hn());
            } else if (!TextUtils.isEmpty(this.aq.mw())) {
                this.qor.setText(this.aq.mw());
            } else {
                this.qor.setVisibility(8);
            }
        }
        if (this.dse != null) {
            String strKby = this.aq.kby();
            if (!TextUtils.isEmpty(strKby)) {
                this.dse.setText(strKby);
            } else {
                this.dse.setVisibility(8);
            }
        }
        this.dkl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ojm.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.hnj(ojm.this.getContext(), ojm.this.aq, ojm.this.ojm);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
