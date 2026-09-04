package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzmq extends zzaz {
    final /* synthetic */ zznl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmq(zznl zznlVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zznlVar);
        this.zza = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zza() {
        this.zza.zzu.zzaW().zze().zza("Tasks have been queued for a long time");
    }
}
