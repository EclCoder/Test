package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends dkl {
    public dse(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.hnj hnjVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.hnj(context);
        this.f12547fc = hnjVar;
        hnjVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.f12547fc, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (!com.bytedance.sdk.component.adexpress.gjv.hn() || !"fillButton".equals(this.orl.ta().hn())) {
            return super.getWidgetLayoutParams();
        }
        ((TextView) this.f12547fc).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView) this.f12547fc).setMaxLines(1);
        FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
        widgetLayoutParams.width -= this.bug.oj() * 2;
        widgetLayoutParams.height -= this.bug.oj() * 2;
        widgetLayoutParams.topMargin += this.bug.oj();
        int iOj = widgetLayoutParams.leftMargin + this.bug.oj();
        widgetLayoutParams.leftMargin = iOj;
        widgetLayoutParams.setMarginStart(iOj);
        widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
        return widgetLayoutParams;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        super.ojm();
        if (TextUtils.equals("download-progress-button", this.orl.ta().hn()) && TextUtils.isEmpty(this.bug.ta())) {
            this.f12547fc.setVisibility(4);
            return true;
        }
        this.f12547fc.setTextAlignment(this.bug.aq());
        ((TextView) this.f12547fc).setText(this.bug.ta());
        ((TextView) this.f12547fc).setTextColor(this.bug.dse());
        ((TextView) this.f12547fc).setTextSize(this.bug.sk());
        ((TextView) this.f12547fc).setGravity(17);
        ((TextView) this.f12547fc).setIncludeFontPadding(false);
        if ("fillButton".equals(this.orl.ta().hn())) {
            this.f12547fc.setPadding(0, 0, 0, 0);
        } else {
            this.f12547fc.setPadding(this.bug.qor(), this.bug.hn(), this.bug.gjv(), this.bug.hnj());
        }
        return true;
    }
}
