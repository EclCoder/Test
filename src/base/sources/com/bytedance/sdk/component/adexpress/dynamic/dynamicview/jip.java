package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip extends dkl implements com.bytedance.sdk.component.adexpress.dynamic.hn {
    public jip(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        ImageView imageView = new ImageView(context);
        this.f12547fc = imageView;
        imageView.setTag(5);
        addView(this.f12547fc, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().tgn()) {
            return;
        }
        this.f12547fc.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        super.ojm();
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            ((ImageView) this.f12547fc).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.f12547fc).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.mjg.mIsMute);
        if (!com.bytedance.sdk.component.adexpress.gjv.hn()) {
            ((ImageView) this.f12547fc).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.gjv.aq.hnj(0, Integer.valueOf(this.bug.vf()), new int[]{this.aq / 2}, null, null, null));
            return true;
        }
        Drawable drawableHnj = com.bytedance.sdk.component.adexpress.gjv.qor.hnj(getContext(), this.bug);
        if (drawableHnj == null) {
            return true;
        }
        ((ImageView) this.f12547fc).setBackground(drawableHnj);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.hn
    public void setSoundMute(boolean z10) {
        ((ImageView) this.f12547fc).setImageResource(z10 ? com.bytedance.sdk.component.utils.wu.gjv(getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.wu.gjv(getContext(), "tt_reward_full_unmute"));
        if (((ImageView) this.f12547fc).getDrawable() != null) {
            ((ImageView) this.f12547fc).getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    public boolean sk() {
        return true;
    }
}
