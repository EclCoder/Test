package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.do, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Cdo extends dkl {
    private int hnj;

    public Cdo(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        this.hnj = 0;
        com.bytedance.sdk.component.adexpress.dkl.as asVar = new com.bytedance.sdk.component.adexpress.dkl.as(context, null);
        this.f12547fc = asVar;
        asVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.f12547fc, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    public void dkl() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.dse, this.aq);
        layoutParams.topMargin = this.f12551ta;
        int i10 = this.ojm + this.hnj;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iHnj = (int) ((com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.sk()) * 5.0f) + com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.qor() + com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.gjv())));
        if (this.dse > iHnj && 4 == this.bug.aq()) {
            this.hnj = (this.dse - iHnj) / 2;
        }
        this.dse = iHnj;
        return new FrameLayout.LayoutParams(this.dse, this.aq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        DynamicRootView dynamicRootView;
        super.ojm();
        double dOrl = this.bug.orl();
        if (com.bytedance.sdk.component.adexpress.gjv.hn() && (dOrl < 0.0d || dOrl > 5.0d || ((dynamicRootView = this.mjg) != null && dynamicRootView.getRenderRequest() != null && this.mjg.getRenderRequest().ta() != 4))) {
            this.f12547fc.setVisibility(8);
            return true;
        }
        double d10 = (dOrl < 0.0d || dOrl > 5.0d) ? 5.0d : dOrl;
        this.f12547fc.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.dkl.as) this.f12547fc).hnj(d10, this.bug.dse(), (int) this.bug.sk(), ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.hn())) + ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.hnj())) + ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.sk())));
        return true;
    }
}
