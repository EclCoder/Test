package com.bytedance.sdk.openadsdk.core.bug.hn.qor;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.adsdk.ugeno.ojm.hn.hnj {
    private final com.bytedance.adsdk.ugeno.ojm.hn.hnj hnj;

    public hnj(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.ojm.hn.hnj hnjVar = new com.bytedance.adsdk.ugeno.ojm.hn.hnj(context);
        this.hnj = hnjVar;
        addView(hnjVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.ojm.hn.hnj getPlayableView() {
        return this.hnj;
    }
}
