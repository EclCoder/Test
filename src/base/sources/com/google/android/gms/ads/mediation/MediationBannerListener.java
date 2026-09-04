package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface MediationBannerListener {
    void onAdClicked(MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(MediationBannerAdapter mediationBannerAdapter);

    @Deprecated
    void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i10);

    void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError);

    void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter);

    void onAdLoaded(MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(MediationBannerAdapter mediationBannerAdapter);

    void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2);
}
