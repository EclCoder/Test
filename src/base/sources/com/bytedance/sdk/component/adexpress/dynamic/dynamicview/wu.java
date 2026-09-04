package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class wu extends dkl implements com.bytedance.sdk.component.adexpress.dynamic.qor {
    private int apu;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12556hn;
    private int hnj;

    public wu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        hnj();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    public void dkl() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i10 = this.ojm;
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = this.f12551ta;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor
    public void hnj(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        this.apu = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.qor()), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.hn()), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.gjv()), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.hnj()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.apu == 0) {
            setMeasuredDimension(this.f12556hn, this.aq);
        } else {
            setMeasuredDimension(this.hnj, this.aq);
        }
    }

    private void hnj() {
        List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> listDnm = this.orl.dnm();
        if (listDnm == null || listDnm.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar : listDnm) {
            if (aqVar.ta().hnj() == 21) {
                this.hnj = (int) (this.dse - com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, aqVar.aq()));
            }
            if (aqVar.ta().hnj() == 20) {
                this.f12556hn = (int) (this.dse - com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, aqVar.aq()));
            }
        }
    }
}
