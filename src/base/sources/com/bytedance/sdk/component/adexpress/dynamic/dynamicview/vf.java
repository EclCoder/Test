package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class vf extends dkl implements com.bytedance.sdk.component.adexpress.dynamic.qor {
    private boolean hnj;

    public vf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        if (dynamicRootView.getRenderRequest() != null) {
            this.hnj = dynamicRootView.getRenderRequest().orl();
        }
        this.dse = this.aq;
        ImageView imageView = new ImageView(context);
        this.f12547fc = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.f12547fc, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().tgn()) {
            return;
        }
        this.f12547fc.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor
    public void hnj(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        int i11 = 0;
        if (!z10 && !z11) {
            i11 = 8;
        }
        setVisibility(i11);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        Drawable drawableQor;
        super.ojm();
        ((ImageView) this.f12547fc).setScaleType(ImageView.ScaleType.CENTER_CROP);
        Drawable drawableHnj = com.bytedance.sdk.component.adexpress.gjv.qor.hnj(getContext(), this.bug);
        if (drawableHnj != null) {
            ((ImageView) this.f12547fc).setBackground(drawableHnj);
        }
        if (this.hnj) {
            drawableQor = com.bytedance.sdk.component.utils.wu.qor(getContext(), "tt_close_btn");
        } else {
            drawableQor = com.bytedance.sdk.component.utils.wu.qor(getContext(), "tt_skip_btn");
            if (drawableQor != null) {
                drawableQor.setAutoMirrored(true);
            }
        }
        if (drawableQor != null) {
            ((ImageView) this.f12547fc).setImageDrawable(drawableQor);
        }
        setVisibility(8);
        return true;
    }
}
