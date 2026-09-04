package com.bytedance.adsdk.ugeno.dkl.hn;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements com.bytedance.adsdk.ugeno.aq.qor.sk {
    @Override // com.bytedance.adsdk.ugeno.aq.qor.sk
    public void hnj(View view, float f10) {
        float width = f10 < 0.0f ? view.getWidth() : 0.0f;
        float height = view.getHeight() * 0.5f;
        view.setPivotX(width);
        view.setPivotY(height);
        view.setRotationY(f10 * 90.0f);
    }
}
