package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcoh implements zzimu {
    private final zzcnl zza;

    private zzcoh(zzcnl zzcnlVar) {
        this.zza = zzcnlVar;
    }

    public static zzcoh zza(zzcnl zzcnlVar) {
        return new zzcoh(zzcnlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        String strZze = this.zza.zze();
        zzinc.zzb(strZze);
        return strZze;
    }
}
