package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzmk implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zznl zzb;

    zzmk(zznl zznlVar, zzr zzrVar, boolean z10) {
        this.zza = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzb;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            zznlVar.zzu.zzaW().zzb().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.zza;
            Preconditions.checkNotNull(zzrVar);
            zzic zzicVar = zznlVar.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzfx zzfxVar = zzfy.zzaW;
            if (zzalVarZzc.zzp(null, zzfxVar)) {
                zznlVar.zzm(zzgbVarZzZ, null, zzrVar);
            }
            zzgbVarZzZ.zzg(zzrVar);
            zznlVar.zzu.zzm().zzo();
            zzicVar.zzc().zzp(null, zzfxVar);
            zznlVar.zzm(zzgbVarZzZ, null, zzrVar);
            zznlVar.zzV();
        } catch (RemoteException e10) {
            this.zzb.zzu.zzaW().zzb().zzb("Failed to send app launch to the service", e10);
        }
    }
}
