package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzh extends zzbj {
    private final AdLoadCallback zza;
    private final Object zzb;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.zza = adLoadCallback;
        this.zzb = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        Object obj;
        AdLoadCallback adLoadCallback = this.zza;
        if (adLoadCallback == null || (obj = this.zzb) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(obj);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.zza;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
