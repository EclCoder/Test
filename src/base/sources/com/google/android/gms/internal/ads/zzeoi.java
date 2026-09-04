package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzeoi extends zzbwu {
    final /* synthetic */ zzeoj zza;
    private final zzelv zzb;

    /* synthetic */ zzeoi(zzeoj zzeojVar, zzelv zzelvVar, byte[] bArr) {
        Objects.requireNonNull(zzeojVar);
        this.zza = zzeojVar;
        this.zzb = zzelvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zze(zzbvr zzbvrVar) {
        this.zza.zzc(zzbvrVar);
        ((zzenh) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zzf(String str) {
        ((zzenh) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ((zzenh) this.zzb.zzc).zzx(zzeVar);
    }
}
