package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class RewardedVideoAd implements FullScreenAd {
    public static final int UNSET_VIDEO_DURATION = -1;
    private final RewardedVideoAdApi mRewardedVideoAdApi;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface RewardedVideoAdLoadConfigBuilder extends Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        RewardedVideoLoadAdConfig build();

        RewardedVideoAdLoadConfigBuilder withAdExperience(AdExperienceType adExperienceType);

        RewardedVideoAdLoadConfigBuilder withAdListener(RewardedVideoAdListener rewardedVideoAdListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        RewardedVideoAdLoadConfigBuilder withBid(String str);

        RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z10);

        RewardedVideoAdLoadConfigBuilder withRewardData(RewardData rewardData);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface RewardedVideoAdShowConfigBuilder extends FullScreenAd.ShowConfigBuilder {
        @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
        RewardedVideoShowAdConfig build();

        RewardedVideoAdShowConfigBuilder withAppOrientation(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface RewardedVideoLoadAdConfig extends Ad.LoadAdConfig {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface RewardedVideoShowAdConfig extends FullScreenAd.ShowAdConfig {
    }

    public RewardedVideoAd(Context context, String str) {
        this.mRewardedVideoAdApi = DynamicLoaderFactory.makeLoader(context).createRewardedVideoAd(context, str, this);
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.mRewardedVideoAdApi.destroy();
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.mRewardedVideoAdApi.getPlacementId();
    }

    public int getVideoDuration() {
        return this.mRewardedVideoAdApi.getVideoDuration();
    }

    @Override // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mRewardedVideoAdApi.isAdInvalidated();
    }

    public boolean isAdLoaded() {
        return this.mRewardedVideoAdApi.isAdLoaded();
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        this.mRewardedVideoAdApi.loadAd();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mRewardedVideoAdApi.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.FullScreenAd
    public boolean show() {
        return this.mRewardedVideoAdApi.show();
    }

    @Override // com.facebook.ads.FullScreenAd
    public RewardedVideoAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mRewardedVideoAdApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.FullScreenAd
    public RewardedVideoAdShowConfigBuilder buildShowAdConfig() {
        return this.mRewardedVideoAdApi.buildShowAdConfig();
    }

    public void loadAd(RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        this.mRewardedVideoAdApi.loadAd(rewardedVideoLoadAdConfig);
    }

    public boolean show(RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        return this.mRewardedVideoAdApi.show(rewardedVideoShowAdConfig);
    }
}
