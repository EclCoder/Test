package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzmp implements Runnable {
    final /* synthetic */ zzbh zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcs zzc;
    final /* synthetic */ zznl zzd;

    zzmp(zznl zznlVar, zzbh zzbhVar, String str, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        this.zza = zzbhVar;
        this.zzb = str;
        this.zzc = zzcsVar;
        Objects.requireNonNull(zznlVar);
        this.zzd = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcs zzcsVar;
        zzpp zzppVarZzk;
        byte[] bArrZzk = null;
        try {
            try {
                zznl zznlVar = this.zzd;
                zzgb zzgbVarZzZ = zznlVar.zzZ();
                if (zzgbVarZzZ == null) {
                    zzic zzicVar = zznlVar.zzu;
                    zzicVar.zzaW().zzb().zza("Discarding data. Failed to send event to service to bundle");
                    zzppVarZzk = zzicVar.zzk();
                    zzcsVar = this.zzc;
                } else {
                    bArrZzk = zzgbVarZzZ.zzk(this.zza, this.zzb);
                    zznlVar.zzV();
                    zznl zznlVar2 = this.zzd;
                    zzcsVar = this.zzc;
                    zzppVarZzk = zznlVar2.zzu.zzk();
                }
            } catch (RemoteException e10) {
                this.zzd.zzu.zzaW().zzb().zzb("Failed to send event to the service to bundle", e10);
            }
            zzppVarZzk.zzar(zzcsVar, bArrZzk);
        } catch (Throwable th2) {
            zznl zznlVar3 = this.zzd;
            zznlVar3.zzu.zzk().zzar(this.zzc, null);
            throw th2;
        }
    }
}
