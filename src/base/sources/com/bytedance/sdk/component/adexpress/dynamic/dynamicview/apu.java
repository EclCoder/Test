package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu extends dse implements com.bytedance.sdk.component.adexpress.dynamic.qor {
    public apu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    public void dkl() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.dse, this.aq);
        int i10 = this.ojm;
        layoutParams.leftMargin = i10;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dse, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor
    public void hnj(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        if (i10 != 0) {
            ((TextView) this.f12547fc).setText(" | " + String.format(com.bytedance.sdk.component.utils.wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_reward_full_skip_count_down"), Integer.valueOf(i10)));
        } else if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.f12547fc).getText())) {
            setMeasuredDimension(0, this.aq);
        }
    }
}
