package com.google.android.gms.internal.measurement;

import sc.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzqp implements g {
    static final /* synthetic */ zzqp zza = new zzqp();

    private /* synthetic */ zzqp() {
    }

    @Override // sc.g
    public final /* synthetic */ Object apply(Object obj) {
        zzmg zzmgVar = (zzmg) obj;
        zzqu zzquVarZzh = zzqv.zzh();
        if (zzmgVar == null) {
            return (zzqv) zzquVarZzh.zzbd();
        }
        for (zzmi zzmiVar : zzmgVar.zze()) {
            zzqw zzqwVarZzh = zzqx.zzh();
            zzqwVarZzh.zza(zzmiVar.zza());
            int iZzq = zzmiVar.zzq();
            int i10 = iZzq - 1;
            if (iZzq == 0) {
                throw null;
            }
            if (i10 == 0) {
                zzqwVarZzh.zzb(zzmiVar.zzb());
            } else if (i10 == 1) {
                zzqwVarZzh.zzc(zzmiVar.zzc());
            } else if (i10 == 2) {
                zzqwVarZzh.zzd(zzmiVar.zzd());
            } else if (i10 == 3) {
                zzqwVarZzh.zze(zzmiVar.zze());
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("No known flag type");
                }
                zzqwVarZzh.zzf(zzmiVar.zzf());
            }
            zzquVarZzh.zze((zzqx) zzqwVarZzh.zzbd());
        }
        zzquVarZzh.zzc(zzmgVar.zzd());
        zzquVarZzh.zza(zzmgVar.zza());
        zzquVarZzh.zzd(zzmgVar.zzf());
        if (zzmgVar.zzb()) {
            zzquVarZzh.zzb(zzmgVar.zzc());
        }
        return (zzqv) zzquVarZzh.zzbd();
    }
}
