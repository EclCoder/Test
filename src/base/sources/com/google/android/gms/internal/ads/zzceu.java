package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzceu implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcfw zzb;

    zzceu(zzcev zzcevVar, Context context, zzcfw zzcfwVar) {
        this.zza = context;
        this.zzb = zzcfwVar;
        Objects.requireNonNull(zzcevVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            this.zzb.zzd(e10);
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception while getting advertising Id info", e10);
        }
    }
}
