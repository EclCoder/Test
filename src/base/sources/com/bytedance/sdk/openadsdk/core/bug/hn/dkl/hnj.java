package com.bytedance.sdk.openadsdk.core.bug.hn.dkl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.adsdk.ugeno.ojm.hn.hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.adsdk.ugeno.ojm.hn.hnj f13628hn;
    private final com.bytedance.adsdk.ugeno.ojm.hn.hnj hnj;

    public hnj(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.ojm.hn.hnj hnjVar = new com.bytedance.adsdk.ugeno.ojm.hn.hnj(context);
        this.hnj = hnjVar;
        addView(hnjVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.ojm.hn.hnj hnjVar2 = new com.bytedance.adsdk.ugeno.ojm.hn.hnj(context);
        this.f13628hn = hnjVar2;
        hnjVar2.setBackgroundColor(0);
        addView(hnjVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.ojm.hn.hnj getMarkView() {
        return this.f13628hn;
    }

    public com.bytedance.adsdk.ugeno.ojm.hn.hnj getVideoView() {
        return this.hnj;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13628hn.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f13628hn.setOnTouchListener(onTouchListener);
    }
}
