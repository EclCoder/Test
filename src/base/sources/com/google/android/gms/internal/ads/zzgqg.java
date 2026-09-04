package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgqg implements zzhbt {
    final /* synthetic */ zzgqf zza;

    zzgqg(zzgqh zzgqhVar, zzgqf zzgqfVar) {
        this.zza = zzgqfVar;
        Objects.requireNonNull(zzgqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        zzgqf zzgqfVar = this.zza;
        zzgqfVar.zzb(th2);
        zzgqfVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}
