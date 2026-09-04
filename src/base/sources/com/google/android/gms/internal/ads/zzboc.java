package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzboc implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu zzb;
    final /* synthetic */ zzbod zzc;

    zzboc(zzbod zzbodVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
        Objects.requireNonNull(zzbodVar);
        this.zzc = zzbodVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdManagerAdView adManagerAdView = this.zza;
        if (adManagerAdView.zza(this.zzb)) {
            this.zzc.zzc().onAdManagerAdViewLoaded(adManagerAdView);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not bind.");
        }
    }
}
