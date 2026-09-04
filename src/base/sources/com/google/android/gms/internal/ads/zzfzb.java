package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfzb {
    final /* synthetic */ zzfzc zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfzb(zzfzc zzfzcVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzfzcVar);
        this.zza = zzfzcVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzfzc zzfzcVar = this.zza;
            if (zzfzcVar.zzb) {
                zzfzf zzfzfVar = zzfzcVar.zza;
                zzfzfVar.zzg(this.zzb);
                zzfzfVar.zzh(this.zzc);
                zzfzfVar.zzi(this.zzd);
                zzfzfVar.zzf(null);
                zzfzfVar.zze();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }

    public final zzfzb zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzfzb zzc(int i10) {
        this.zzd = i10;
        return this;
    }
}
