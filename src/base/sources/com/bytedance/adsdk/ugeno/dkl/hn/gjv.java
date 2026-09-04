package com.bytedance.adsdk.ugeno.dkl.hn;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv implements com.bytedance.adsdk.ugeno.aq.qor.sk {
    private String hnj;

    public void hnj(String str) {
        this.hnj = str;
    }

    @Override // com.bytedance.adsdk.ugeno.aq.qor.sk
    public void hnj(View view, float f10) {
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f10));
            view.setTranslationY(view.getHeight() * f10);
        }
        if (TextUtils.equals(this.hnj, "cube")) {
            float height = f10 < 0.0f ? view.getHeight() : 0.0f;
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f10 * (-90.0f));
        }
    }
}
