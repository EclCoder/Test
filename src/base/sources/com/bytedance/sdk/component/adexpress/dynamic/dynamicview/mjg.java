package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg extends dkl {
    public mjg(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        ImageView imageView = new ImageView(context);
        this.f12547fc = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            this.aq = Math.max(dynamicRootView.getLogoUnionHeight(), this.aq);
        }
        addView(this.f12547fc, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        super.ojm();
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            ((ImageView) this.f12547fc).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        DynamicRootView dynamicRootView = this.mjg;
        if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || TextUtils.isEmpty(this.mjg.getRenderRequest().xyo())) {
            setVisibility(8);
        } else {
            String strXyo = this.mjg.getRenderRequest().xyo();
            if (strXyo.equals("logo")) {
                ((ImageView) this.f12547fc).setImageResource(com.bytedance.sdk.component.utils.wu.gjv(getContext(), "tt_ad_logo"));
            } else {
                com.bytedance.sdk.component.sk.ta taVarSk = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().sk().hnj(strXyo).hnj(this.dse).hn(this.aq).gjv(this.dse).sk(this.aq);
                String strMjg = this.mjg.getRenderRequest().mjg();
                if (!TextUtils.isEmpty(strMjg)) {
                    taVarSk.hn(strMjg);
                }
                taVarSk.hnj((ImageView) this.f12547fc);
            }
        }
        ((ImageView) this.f12547fc).setColorFilter(this.bug.dse(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
