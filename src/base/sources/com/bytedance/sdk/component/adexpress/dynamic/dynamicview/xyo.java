package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xyo extends dkl implements com.bytedance.sdk.component.adexpress.dynamic.qor {
    private int apu;
    private int eum;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    boolean f12558hn;
    int hnj;
    private boolean wu;

    public xyo(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        this.eum = 0;
        setTag(Integer.valueOf(getClickArea()));
        hnj();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().tgn()) {
            return;
        }
        View view = this.f12547fc;
        if (view != null) {
            view.setVisibility(8);
        }
        setVisibility(8);
    }

    private void hnj() {
        List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> listDnm = this.orl.dnm();
        if (listDnm == null || listDnm.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar : listDnm) {
            if (TextUtils.equals("skip-with-time-skip-btn", aqVar.ta().hn())) {
                int iHnj = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, aqVar.aq() + (com.bytedance.sdk.component.adexpress.gjv.hn() ? aqVar.orl() : 0));
                this.apu = iHnj;
                this.hnj = this.dse - iHnj;
                break;
            }
        }
        this.eum = this.dse - this.hnj;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    public void dkl() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.f12558hn) {
            layoutParams.leftMargin = this.ojm;
        } else {
            layoutParams.leftMargin = this.ojm + this.eum;
        }
        if (this.wu && this.bug != null) {
            layoutParams.leftMargin = ((this.ojm + this.eum) - ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.qor()))) - ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.gjv()));
        }
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            layoutParams.topMargin = this.f12551ta - ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.hn()));
        } else {
            layoutParams.topMargin = this.f12551ta;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        if (com.bytedance.sdk.component.adexpress.gjv.dkl.hn(this.mjg.getRenderRequest().gjv())) {
            return true;
        }
        super.ojm();
        setPadding((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.qor()), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.hn()), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.gjv()), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.hnj()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.wu && this.bug != null) {
            setMeasuredDimension(this.apu + ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.qor())) + ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.gjv())), this.aq);
        } else if (this.f12558hn) {
            setMeasuredDimension(this.dse, this.aq);
        } else {
            setMeasuredDimension(this.hnj, this.aq);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor
    public void hnj(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        if (z11 && this.wu != z11) {
            this.wu = z11;
            dkl();
            return;
        }
        if (z10 && this.f12558hn != z10) {
            this.f12558hn = z10;
            dkl();
        }
        this.f12558hn = z10;
    }
}
