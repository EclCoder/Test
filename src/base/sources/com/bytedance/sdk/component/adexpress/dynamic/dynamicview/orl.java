package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl extends dkl {
    public orl(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        TextView textView = new TextView(context);
        this.f12547fc = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.f12547fc, getWidgetLayoutParams());
    }

    private boolean hnj() {
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.bug.f12599hn) && this.bug.f12599hn.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.sk.dnm.hn();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk
    public void dkl() {
        com.bytedance.sdk.component.adexpress.hn.orl renderRequest = this.mjg.getRenderRequest();
        if (renderRequest == null || !TextUtils.isEmpty(renderRequest.xyo())) {
            super.dkl();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.dse, this.aq);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0080  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        com.bytedance.sdk.component.adexpress.hn.orl renderRequest;
        super.ojm();
        this.f12547fc.setTextAlignment(this.bug.aq());
        ((TextView) this.f12547fc).setTextColor(this.bug.dse());
        ((TextView) this.f12547fc).setTextSize(this.bug.sk());
        if (!com.bytedance.sdk.component.adexpress.gjv.hn()) {
            if (!hnj()) {
                ((TextView) this.f12547fc).setText(com.bytedance.sdk.component.utils.wu.hn(getContext(), "tt_logo_cn"));
                return true;
            }
            if (com.bytedance.sdk.component.adexpress.dynamic.sk.dnm.hn()) {
                ((TextView) this.f12547fc).setText(com.bytedance.sdk.component.adexpress.dynamic.sk.dnm.hnj());
                return true;
            }
            ((TextView) this.f12547fc).setText(com.bytedance.sdk.component.adexpress.dynamic.sk.dnm.hnj(this.bug.f12599hn));
            return true;
        }
        int i10 = 0;
        ((TextView) this.f12547fc).setIncludeFontPadding(false);
        ((TextView) this.f12547fc).setTextSize(Math.min(((com.bytedance.sdk.component.adexpress.gjv.dse.hn(com.bytedance.sdk.component.adexpress.gjv.hnj(), this.aq) - this.bug.hn()) - this.bug.hnj()) - 0.5f, this.bug.sk()));
        DynamicRootView dynamicRootView = this.mjg;
        if (dynamicRootView == null || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
            i10 = 8;
        } else {
            String strVf = renderRequest.vf();
            if (TextUtils.isEmpty(strVf)) {
                i10 = 8;
            } else {
                ((TextView) this.f12547fc).setText(strVf);
            }
        }
        ((TextView) this.f12547fc).setVisibility(i10);
        return true;
    }
}
