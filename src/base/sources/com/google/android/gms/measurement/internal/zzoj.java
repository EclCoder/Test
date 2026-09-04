package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzoj extends zzaz {
    final /* synthetic */ zzok zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzoj(zzok zzokVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zzokVar);
        this.zza = zzokVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zza() {
        zzok zzokVar = this.zza;
        zzokVar.zzf();
        zzokVar.zzu.zzaW().zzk().zza("Starting upload from DelayedRunnable");
        zzokVar.zzg.zzM();
    }
}
