package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzepf {
    private final zzflr zza;
    private final zzdwz zzb;
    private final zzdzl zzc;

    public zzepf(zzflr zzflrVar, zzdwz zzdwzVar, zzdzl zzdzlVar) {
        this.zza = zzflrVar;
        this.zzb = zzdwzVar;
        this.zzc = zzdzlVar;
    }

    public final void zza(zzfki zzfkiVar, zzfkf zzfkfVar, int i10, zzelw zzelwVar, long j10) {
        zzdwy zzdwyVarZzc;
        zzdzk zzdzkVarZza = this.zzc.zza();
        zzdzkVarZza.zza(zzfkiVar);
        zzdzkVarZza.zzb(zzfkfVar);
        zzdzkVarZza.zzc("action", "adapter_status");
        zzdzkVarZza.zzc("adapter_l", String.valueOf(j10));
        zzdzkVarZza.zzc("sc", Integer.toString(i10));
        if (zzelwVar != null) {
            zzdzkVarZza.zzc("arec", Integer.toString(zzelwVar.zzb().zza));
            String strZza = this.zza.zza(zzelwVar.getMessage());
            if (strZza != null) {
                zzdzkVarZza.zzc("areec", strZza);
            }
        }
        zzdwz zzdwzVar = this.zzb;
        Iterator it = zzfkfVar.zzt.iterator();
        do {
            if (!it.hasNext()) {
                zzdwyVarZzc = null;
                break;
            }
            zzdwyVarZzc = zzdwzVar.zzc((String) it.next());
        } while (zzdwyVarZzc == null);
        if (zzdwyVarZzc != null) {
            zzdzkVarZza.zzc("ancn", zzdwyVarZzc.zza);
            zzbxq zzbxqVar = zzdwyVarZzc.zzb;
            if (zzbxqVar != null) {
                zzdzkVarZza.zzc("adapter_v", zzbxqVar.toString());
            }
            zzbxq zzbxqVar2 = zzdwyVarZzc.zzc;
            if (zzbxqVar2 != null) {
                zzdzkVarZza.zzc("adapter_sv", zzbxqVar2.toString());
            }
        }
        zzdzkVarZza.zzd();
    }
}
