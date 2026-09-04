package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.vf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends com.bytedance.sdk.openadsdk.core.dkl.dse {
    private boolean dkl;
    private com.bytedance.sdk.openadsdk.core.dkl.aq gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.dkl.aq f14262hn;
    private uua hnj;
    private aq qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f14263sk;

    public dse(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (hnj()) {
            hn();
        }
    }

    public com.bytedance.sdk.openadsdk.core.dkl.aq getDownloadButton() {
        return this.gjv;
    }

    public aq getLoadingProgressBar() {
        return this.qor;
    }

    public void hn() {
        if (this.f14263sk) {
            return;
        }
        this.f14263sk = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        uua uuaVar = new uua(context);
        this.hnj = uuaVar;
        uuaVar.setId(520093745);
        int iHn = sq.hn(context, 64.0f);
        this.hnj.setLayoutParams(new RelativeLayout.LayoutParams(iHn, iHn));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.f14262hn = aqVar;
        aqVar.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(sq.hn(context, 219.0f), -2);
        layoutParams2.topMargin = sq.hn(context, 16.0f);
        this.f14262hn.setLayoutParams(layoutParams2);
        this.f14262hn.setEllipsize(TextUtils.TruncateAt.END);
        this.f14262hn.setGravity(17);
        this.f14262hn.setMaxWidth(sq.hn(context, 150.0f));
        this.f14262hn.setMaxLines(2);
        this.f14262hn.setTextColor(-1);
        this.f14262hn.setTextSize(1, 16.0f);
        aq aqVar2 = new aq(context);
        this.qor = aqVar2;
        aqVar2.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(sq.hn(context, 219.0f), sq.hn(context, 6.0f));
        layoutParams3.topMargin = sq.hn(context, 24.0f);
        this.qor.setLayoutParams(layoutParams3);
        this.gjv = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(sq.hn(context, 138.0f), sq.hn(context, 42.0f));
        layoutParams4.topMargin = sq.hn(context, 48.0f);
        this.gjv.setLayoutParams(layoutParams4);
        this.gjv.setTextColor(-1);
        this.gjv.setTextSize(16.0f);
        this.gjv.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.gjv.setBackground(gradientDrawable);
        linearLayout.addView(this.hnj);
        linearLayout.addView(this.f14262hn);
        linearLayout.addView(this.qor);
        linearLayout.addView(this.gjv);
        addView(linearLayout);
    }

    protected boolean hnj() {
        return true;
    }

    public void setProgress(int i10) {
        aq aqVar = this.qor;
        if (aqVar != null) {
            aqVar.setProgress(i10);
        }
    }

    public void hnj(as asVar, int i10) {
        if (!this.f14263sk || asVar == null || this.dkl) {
            return;
        }
        this.dkl = true;
        boolean zHw = asVar.hw();
        if (zHw || asVar.mn() == null || TextUtils.isEmpty(asVar.mn().hnj())) {
            this.hnj.setVisibility(8);
        } else {
            try {
                com.bytedance.sdk.openadsdk.ta.gjv.hnj(asVar.mn()).qor(1).hnj(new com.bytedance.sdk.openadsdk.ta.hn(asVar, asVar.mn().hnj(), new vf(this.hnj)));
            } catch (Throwable unused) {
                this.hnj.setVisibility(8);
            }
        }
        if (zHw) {
            this.f14262hn.setText("Loading");
        } else if (TextUtils.isEmpty(asVar.kby())) {
            this.f14262hn.setVisibility(8);
        } else {
            this.f14262hn.setText(asVar.kby());
        }
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = this.gjv;
        if (aqVar != null) {
            aqVar.setText(asVar.cq());
        }
    }
}
