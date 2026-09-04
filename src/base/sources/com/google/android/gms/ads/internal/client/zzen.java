package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzen extends zzca {
    final /* synthetic */ PreloadCallback zza;

    zzen(zzeu zzeuVar, PreloadCallback preloadCallback) {
        this.zza = preloadCallback;
        Objects.requireNonNull(zzeuVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zze(zzfp zzfpVar) {
        PreloadConfiguration preloadConfigurationZzt = com.google.android.gms.ads.internal.util.client.zzf.zzt(zzfpVar);
        if (preloadConfigurationZzt != null) {
            this.zza.onAdsAvailable(preloadConfigurationZzt);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzf(zzfp zzfpVar) {
        PreloadConfiguration preloadConfigurationZzt = com.google.android.gms.ads.internal.util.client.zzf.zzt(zzfpVar);
        if (preloadConfigurationZzt != null) {
            this.zza.onAdsExhausted(preloadConfigurationZzt);
        }
    }
}
