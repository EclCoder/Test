package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PAGRewardItem {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f13239hn;
    private final int hnj;

    public PAGRewardItem(int i10, String str) {
        this.hnj = i10;
        this.f13239hn = str;
    }

    public int getRewardAmount() {
        return this.hnj;
    }

    public String getRewardName() {
        return this.f13239hn;
    }
}
