package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdlk;
import com.google.android.gms.internal.ads.zzdzg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzr implements zzdlk {
    private final zzdzg zza;
    private final zzq zzb;
    private final String zzc;

    public zzr(zzdzg zzdzgVar, zzq zzqVar, String str) {
        this.zza = zzdzgVar;
        this.zzb = zzqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zzd(zzbc zzbcVar) {
        if (zzbcVar == null) {
            return;
        }
        this.zzb.zza(this.zzc, zzbcVar.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zze(String str) {
    }
}
