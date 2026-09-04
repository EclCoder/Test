package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hqh extends dkl implements com.bytedance.sdk.component.adexpress.dynamic.qor {
    private boolean hnj;

    public hqh(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        this.dse = this.aq;
        ImageView imageView = new ImageView(context);
        this.f12547fc = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.f12547fc, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            if (!dynamicRootView.getRenderRequest().tgn()) {
                this.f12547fc.setVisibility(8);
                setVisibility(8);
            }
            this.hnj = dynamicRootView.getRenderRequest().orl();
        }
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
        super.ojm();
        View view = this.f12547fc;
        if (view != null) {
            ((ImageView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
            Drawable drawableHnj = com.bytedance.sdk.component.adexpress.gjv.qor.hnj(getContext(), this.bug);
            if (drawableHnj != null) {
                ((ImageView) this.f12547fc).setBackground(drawableHnj);
            }
            Drawable drawableQor = this.hnj ? com.bytedance.sdk.component.utils.wu.qor(getContext(), "tt_close_btn") : com.bytedance.sdk.component.utils.wu.qor(getContext(), "tt_skip_btn");
            if (drawableQor != null) {
                drawableQor.setAutoMirrored(true);
                ((ImageView) this.f12547fc).setImageDrawable(drawableQor);
            }
            int iHnj = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.hn());
            this.f12547fc.setPadding(iHnj, iHnj, iHnj, iHnj);
        }
        setVisibility(8);
        return true;
    }
}
