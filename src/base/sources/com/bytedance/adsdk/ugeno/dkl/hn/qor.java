package com.bytedance.adsdk.ugeno.dkl.hn;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements com.bytedance.adsdk.ugeno.aq.qor.sk {
    final float hnj = 0.8f;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    final float f12225hn = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.aq.qor.sk
    public void hnj(View view, float f10) {
        float f11 = ((f10 < 0.0f ? 0.19999999f : -0.19999999f) * f10) + 1.0f;
        float f12 = (f10 * (f10 < 0.0f ? 0.5f : -0.5f)) + 1.0f;
        if (f10 < 0.0f) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f11);
        view.setScaleY(f11);
        view.setAlpha(Math.abs(f12));
    }
}
