package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcns implements zzimu {
    private final zzcnl zza;

    private zzcns(zzcnl zzcnlVar) {
        this.zza = zzcnlVar;
    }

    public static zzcns zzc(zzcnl zzcnlVar) {
        return new zzcns(zzcnlVar);
    }

    public static Context zzd(zzcnl zzcnlVar) {
        Context contextZza = zzcnlVar.zza();
        zzinc.zzb(contextZza);
        return contextZza;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
