package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzegb extends zzcat {
    private final zzcfw zza;
    private final zzcbd zzb;

    zzegb(zzcfw zzcfwVar, zzcbd zzcbdVar) {
        this.zza = zzcfwVar;
        this.zzb = zzcbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzegs(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcbd zzcbdVar) {
        this.zza.zzc(new zzegs(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbdVar));
    }
}
