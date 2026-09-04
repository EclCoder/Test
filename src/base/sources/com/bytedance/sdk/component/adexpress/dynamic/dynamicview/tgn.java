package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class tgn extends dse implements com.bytedance.sdk.component.adexpress.dynamic.qor {
    private boolean apu;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private boolean f12553hn;
    private boolean hnj;

    public tgn(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(aqVar.ta().hn())) {
            dynamicRootView.setTimedown(this.aq);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    public void dkl() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.orl.ta().hn()) && !TextUtils.equals("skip-with-time-countdown", this.orl.ta().hn())) {
            super.dkl();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.dse, this.aq);
        layoutParams.gravity = 8388627;
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            layoutParams.leftMargin = this.ojm;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor
    public void hnj(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        if (z11 || this.apu) {
            ((TextView) this.f12547fc).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (Integer.parseInt((String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (Exception unused) {
        }
        setVisibility(0);
        if (!z10 && this.mjg.getRenderRequest().hnj() && com.bytedance.sdk.component.adexpress.gjv.dkl.hn(this.mjg.getRenderRequest().gjv())) {
            if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                ((TextView) this.f12547fc).setText(i10 + "s");
            } else {
                ((TextView) this.f12547fc).setText(String.format(com.bytedance.sdk.component.utils.wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_reward_full_skip"), Integer.valueOf(i10)));
            }
            this.hnj = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.gjv.hn() && !"open_ad".equals(this.mjg.getRenderRequest().gjv()) && this.mjg.getRenderRequest().hnj()) {
            this.apu = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.orl.ta().hn())) {
            ((TextView) this.f12547fc).setText(charSequence);
            return;
        }
        ((TextView) this.f12547fc).setText(((Object) charSequence) + "s");
        this.f12553hn = true;
        if (this.hnj) {
            CharSequence text = ((TextView) this.f12547fc).getText();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.dynamic.sk.dnm.hn(text != null ? text.toString() : "", this.bug.sk(), true)[0] + com.bytedance.sdk.component.adexpress.gjv.dse.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.bug.qor() + this.bug.gjv())), this.aq);
            layoutParams.gravity = 8388629;
            this.f12547fc.setLayoutParams(layoutParams);
            this.hnj = false;
            requestLayout();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dse, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        super.ojm();
        if (com.bytedance.sdk.component.adexpress.gjv.dkl.hn(this.mjg.getRenderRequest().gjv())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.orl.ta().hn())) {
            ((TextView) this.f12547fc).setText(String.valueOf((int) Double.parseDouble(this.bug.ta())));
            return true;
        }
        ((TextView) this.f12547fc).setText(((int) Double.parseDouble(this.bug.ta())) + "s");
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.f12547fc).getText())) {
            setMeasuredDimension(0, this.aq);
        }
    }
}
