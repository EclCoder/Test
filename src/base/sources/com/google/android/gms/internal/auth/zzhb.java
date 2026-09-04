package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhb extends zzgz {
    zzhb() {
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarZzd = zzha.zzd();
        zzevVar.zzc = zzhaVarZzd;
        return zzhaVarZzd;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* synthetic */ Object zzb(Object obj) {
        return ((zzev) obj).zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* bridge */ /* synthetic */ Object zzc(Object obj, Object obj2) {
        if (!zzha.zza().equals(obj2)) {
            if (zzha.zza().equals(obj)) {
                return zzha.zzc((zzha) obj, (zzha) obj2);
            }
            ((zzha) obj).zzb((zzha) obj2);
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, long j10) {
        ((zzha) obj).zzh(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final void zze(Object obj) {
        ((zzev) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    final /* synthetic */ void zzf(Object obj, Object obj2) {
        ((zzev) obj).zzc = (zzha) obj2;
    }
}
