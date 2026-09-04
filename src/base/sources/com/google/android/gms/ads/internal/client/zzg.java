package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzg extends zzbg {
    private final AdListener zza;

    public zzg(AdListener adListener) {
        this.zza = adListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd(zze zzeVar) {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final AdListener zzk() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(int i10) {
    }
}
