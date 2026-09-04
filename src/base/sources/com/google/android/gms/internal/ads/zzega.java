package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzega extends zzcat {
    final /* synthetic */ zzegc zza;

    protected zzega(zzegc zzegcVar) {
        Objects.requireNonNull(zzegcVar);
        this.zza = zzegcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzegc zzegcVar = this.zza;
        zzegcVar.zza.zzc(new zzegs(autoCloseInputStream, zzegcVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcbd zzcbdVar) {
        this.zza.zza.zzc(new zzegs(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbdVar));
    }
}
