package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class eum extends dse implements com.bytedance.sdk.component.adexpress.dynamic.qor {
    private int apu;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12533hn;
    private int[] hnj;

    public eum(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    public void dkl() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.dse, this.aq);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor
    public void hnj(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        String strHnj = com.bytedance.sdk.component.utils.wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_reward_screen_skip_tx");
        if (i10 == 0) {
            this.f12547fc.setVisibility(0);
            ((TextView) this.f12547fc).setText("| ".concat(String.valueOf(strHnj)));
            this.f12547fc.measure(-2, -2);
            this.hnj = new int[]{this.f12547fc.getMeasuredWidth() + 1, this.f12547fc.getMeasuredHeight()};
            View view = this.f12547fc;
            int[] iArr = this.hnj;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.f12547fc).setGravity(17);
            ((TextView) this.f12547fc).setIncludeFontPadding(false);
            hnj();
            this.f12547fc.setPadding(this.bug.qor(), this.f12533hn, this.bug.gjv(), this.apu);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dse, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        super.ojm();
        ((TextView) this.f12547fc).setText("");
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.f12547fc).getText())) {
            setMeasuredDimension(0, this.aq);
        } else {
            setMeasuredDimension(this.dse, this.aq);
        }
    }

    private void hnj() {
        int iHnj = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.sk());
        this.f12533hn = ((this.aq - iHnj) / 2) - this.bug.hnj();
        this.apu = 0;
    }
}
