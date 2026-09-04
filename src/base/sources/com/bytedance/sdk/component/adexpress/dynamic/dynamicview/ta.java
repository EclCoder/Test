package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta extends dkl {
    public ta(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            ImageView imageView = new ImageView(context);
            this.f12547fc = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.dse = this.aq;
        } else {
            this.f12547fc = new TextView(context);
        }
        this.f12547fc.setTag(3);
        addView(this.f12547fc, getWidgetLayoutParams());
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().aq() && dynamicRootView.getRenderRequest().tgn()) {
                return;
            }
            this.f12547fc.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        super.ojm();
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            Drawable drawableHnj = com.bytedance.sdk.component.adexpress.gjv.qor.hnj(getContext(), this.bug);
            if (drawableHnj != null) {
                ((ImageView) this.f12547fc).setBackground(drawableHnj);
            }
            ((ImageView) this.f12547fc).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int iGjv = com.bytedance.sdk.component.utils.wu.gjv(getContext(), "tt_reward_full_feedback");
            if (iGjv > 0) {
                ((ImageView) this.f12547fc).setImageResource(iGjv);
            }
        }
        return true;
    }
}
