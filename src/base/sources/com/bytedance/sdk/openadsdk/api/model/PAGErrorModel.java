package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PAGErrorModel {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f13230hn;
    private final int hnj;

    public PAGErrorModel(int i10, String str) {
        this.hnj = i10;
        this.f13230hn = str;
    }

    public int getErrorCode() {
        return this.hnj;
    }

    public String getErrorMessage() {
        return this.f13230hn;
    }
}
