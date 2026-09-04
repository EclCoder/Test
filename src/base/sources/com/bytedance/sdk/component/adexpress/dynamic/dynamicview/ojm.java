package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm extends dkl {
    public ojm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            this.f12547fc = new ImageView(context);
        } else {
            this.f12547fc = new com.bytedance.sdk.component.adexpress.dkl.ojm(context);
        }
        this.f12547fc.setTag(3);
        addView(this.f12547fc, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        super.ojm();
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            Drawable drawableHnj = com.bytedance.sdk.component.adexpress.gjv.qor.hnj(getContext(), this.bug);
            if (drawableHnj != null) {
                this.f12547fc.setBackground(drawableHnj);
            }
            int iGjv = com.bytedance.sdk.component.utils.wu.gjv(getContext(), "tt_close_btn");
            if (iGjv > 0) {
                ((ImageView) this.f12547fc).setImageResource(iGjv);
            }
            ((ImageView) this.f12547fc).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iHnj = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.uua());
        View view = this.f12547fc;
        if (view instanceof com.bytedance.sdk.component.adexpress.dkl.ojm) {
            ((com.bytedance.sdk.component.adexpress.dkl.ojm) view).setRadius((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.fc()));
            ((com.bytedance.sdk.component.adexpress.dkl.ojm) this.f12547fc).setStrokeWidth(iHnj);
            ((com.bytedance.sdk.component.adexpress.dkl.ojm) this.f12547fc).setStrokeColor(this.bug.jip());
            ((com.bytedance.sdk.component.adexpress.dkl.ojm) this.f12547fc).setBgColor(this.bug.vf());
            ((com.bytedance.sdk.component.adexpress.dkl.ojm) this.f12547fc).setDislikeColor(this.bug.dse());
            ((com.bytedance.sdk.component.adexpress.dkl.ojm) this.f12547fc).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, 1.0f));
        }
        return true;
    }
}
