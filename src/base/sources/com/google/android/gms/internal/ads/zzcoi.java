package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcoi implements zzimu {
    private final zzcnl zza;

    private zzcoi(zzcnl zzcnlVar) {
        this.zza = zzcnlVar;
    }

    public static zzcoi zzc(zzcnl zzcnlVar) {
        return new zzcoi(zzcnlVar);
    }

    public static VersionInfoParcel zzd(zzcnl zzcnlVar) {
        VersionInfoParcel versionInfoParcelZzd = zzcnlVar.zzd();
        zzinc.zzb(versionInfoParcelZzd);
        return versionInfoParcelZzd;
    }

    public final VersionInfoParcel zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
