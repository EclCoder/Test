package com.bytedance.sdk.openadsdk.api;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface PAGExpressAdWrapperListener extends PAGAdWrapperListener {
    void onAdDismissed();

    void onAdShow(View view, int i10);

    void onRenderFail(View view, String str, int i10);

    void onRenderSuccess(View view, float f10, float f11);
}
