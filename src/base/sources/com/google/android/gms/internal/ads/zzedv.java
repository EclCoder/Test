package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedv {
    private final Context zza;
    private zzarx zzb;

    zzedv(Context context) {
        this.zza = context;
    }

    public final void zza() {
        this.zzb = zzarw.zza(this.zza);
    }

    public final void zzb(zzasa zzasaVar) {
        this.zzb.zzb(zzasaVar);
    }

    public final void zzc() {
        this.zzb.zzc();
    }

    public final zzasb zzd() {
        try {
            zzarx zzarxVar = this.zzb;
            if (zzarxVar == null || !zzarxVar.zza()) {
                return null;
            }
            return zzarxVar.zzd();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
