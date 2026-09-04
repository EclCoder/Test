package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzae<T> implements zzab<T> {
    private final Object zza = new Object();
    private final int zzb;
    private final zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private Exception zzg;
    private boolean zzh;

    public zzae(int i10, zzw zzwVar) {
        this.zzb = i10;
        this.zzc = zzwVar;
    }

    private final void zza() {
        int i10 = this.zzd + this.zze + this.zzf;
        int i11 = this.zzb;
        if (i10 == i11) {
            if (this.zzg == null) {
                if (this.zzh) {
                    this.zzc.zze();
                    return;
                } else {
                    this.zzc.zza(null);
                    return;
                }
            }
            zzw zzwVar = this.zzc;
            int i12 = this.zze;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 8 + String.valueOf(i11).length() + 24);
            sb2.append(i12);
            sb2.append(" out of ");
            sb2.append(i11);
            sb2.append(" underlying tasks failed");
            zzwVar.zzc(new ExecutionException(sb2.toString(), this.zzg));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t10) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
