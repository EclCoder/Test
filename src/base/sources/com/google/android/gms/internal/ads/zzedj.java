package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzedj implements zzhbt {
    final /* synthetic */ zzedo zza;

    zzedj(zzedo zzedoVar) {
        Objects.requireNonNull(zzedoVar);
        this.zza = zzedoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzecf) obj).zze();
        this.zza.zzi().zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
    }
}
