package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzoz implements Callable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zzpg zzb;

    zzoz(zzpg zzpgVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zzpgVar);
        this.zzb = zzpgVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzr zzrVar = this.zza;
        String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        zzpg zzpgVar = this.zzb;
        zzjl zzjlVarZzB = zzpgVar.zzB(str);
        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
        if (zzjlVarZzB.zzo(zzjkVar) && zzjl.zzf(zzrVar.zzs, 100).zzo(zzjkVar)) {
            return zzpgVar.zzap(zzrVar).zzd();
        }
        zzpgVar.zzaW().zzk().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
