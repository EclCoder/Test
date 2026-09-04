package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzmo implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzbf zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zznl zze;

    zzmo(zznl zznlVar, boolean z10, zzr zzrVar, boolean z11, zzbf zzbfVar, Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = z11;
        this.zzc = zzbfVar;
        this.zzd = bundle;
        Objects.requireNonNull(zznlVar);
        this.zze = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zze;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            zznlVar.zzu.zzaW().zzb().zza("Failed to send default event parameters to service");
            return;
        }
        if (zznlVar.zzu.zzc().zzp(null, zzfy.zzaW)) {
            zzr zzrVar = this.zza;
            Preconditions.checkNotNull(zzrVar);
            zznlVar.zzm(zzgbVarZzZ, this.zzb ? null : this.zzc, zzrVar);
            return;
        }
        try {
            zzr zzrVar2 = this.zza;
            Preconditions.checkNotNull(zzrVar2);
            zzgbVarZzZ.zzu(this.zzd, zzrVar2);
            zznlVar.zzV();
        } catch (RemoteException e10) {
            this.zze.zzu.zzaW().zzb().zzb("Failed to send default event parameters to service", e10);
        }
    }
}
