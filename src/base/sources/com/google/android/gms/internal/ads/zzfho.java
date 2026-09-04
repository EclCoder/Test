package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfho implements zzgta {
    final /* synthetic */ zzfhs zza;

    zzfho(zzfhs zzfhsVar) {
        Objects.requireNonNull(zzfhsVar);
        this.zza = zzfhsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", (zzegr) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfhs zzfhsVar = this.zza;
        zzfhsVar.zzd(new zzfhq(null, zzfhsVar.zzb(), null));
        return zzfhsVar.zzc();
    }
}
