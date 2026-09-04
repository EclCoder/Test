package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface PAGLoadCallback<Ad> {
    void onAdLoaded(Ad ad2);

    void onError(PAGErrorModel pAGErrorModel);
}
