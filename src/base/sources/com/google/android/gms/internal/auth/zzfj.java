package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfj extends zzfl {
    /* synthetic */ zzfj(zzfi zzfiVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zza(Object obj, long j10) {
        ((zzez) zzhj.zzf(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zzb(Object obj, Object obj2, long j10) {
        zzez zzezVarZzd = (zzez) zzhj.zzf(obj, j10);
        zzez zzezVar = (zzez) zzhj.zzf(obj2, j10);
        int size = zzezVarZzd.size();
        int size2 = zzezVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzezVarZzd.zzc()) {
                zzezVarZzd = zzezVarZzd.zzd(size2 + size);
            }
            zzezVarZzd.addAll(zzezVar);
        }
        if (size > 0) {
            zzezVar = zzezVarZzd;
        }
        zzhj.zzp(obj, j10, zzezVar);
    }

    private zzfj() {
        super(null);
    }
}
