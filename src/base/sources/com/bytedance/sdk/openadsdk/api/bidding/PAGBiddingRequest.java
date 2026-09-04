package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PAGBiddingRequest {
    private PAGBannerSize hnj = null;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f13221hn = null;
    private String qor = null;

    public String getAdxId() {
        return this.qor;
    }

    public PAGBannerSize getBannerSize() {
        return this.hnj;
    }

    public String getSlotId() {
        return this.f13221hn;
    }

    public void setAdxId(String str) {
        this.qor = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.hnj = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.f13221hn = str;
    }
}
