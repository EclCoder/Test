package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcdb extends zzcco {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzcdc zzb;

    public zzcdb(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcdc zzcdcVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzcdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zze() {
        zzcdc zzcdcVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzcdcVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzcdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzf(int i10) {
    }
}
