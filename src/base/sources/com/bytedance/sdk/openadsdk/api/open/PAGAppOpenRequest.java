package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int hnj;

    public int getTimeout() {
        return this.hnj;
    }

    public void setTimeout(int i10) {
        this.hnj = i10;
    }
}
