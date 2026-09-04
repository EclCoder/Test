package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdnv implements zzcxw {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzinj zzd;
    private final zzdqd zze;

    zzdnv(Map map, Map map2, Map map3, zzinj zzinjVar, zzdqd zzdqdVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzinjVar;
        this.zze = zzdqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final zzels zza(int i10, String str) {
        zzels zzelsVarZza;
        zzels zzelsVar = (zzels) this.zza.get(str);
        if (zzelsVar != null) {
            return zzelsVar;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            zzeny zzenyVar = (zzeny) this.zzc.get(str);
            if (zzenyVar != null) {
                return zzcyb.zza(zzenyVar);
            }
            zzelsVarZza = (zzels) this.zzb.get(str);
            if (zzelsVarZza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zzelsVarZza = ((zzcxw) this.zzd.zzb()).zza(i10, str)) == null) {
            return null;
        }
        return zzcyb.zzb(zzelsVarZza);
    }
}
