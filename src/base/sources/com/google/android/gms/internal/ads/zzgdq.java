package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgdq implements zzind {
    final /* synthetic */ zzgdr zza;

    zzgdq(zzgdr zzgdrVar) {
        Objects.requireNonNull(zzgdrVar);
        this.zza = zzgdrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgdr zzgdrVar = this.zza;
        return new zzgdu(zzgdrVar.zzb(), zzgdrVar.zzc(), null);
    }
}
