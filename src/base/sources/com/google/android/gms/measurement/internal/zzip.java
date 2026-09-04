package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzip implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zzjd zzb;

    zzip(zzjd zzjdVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zzjdVar);
        this.zzb = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.zzb;
        zzjdVar.zzL().zzaa();
        zzpg zzpgVarZzL = zzjdVar.zzL();
        zzpgVarZzL.zzaX().zzg();
        zzpgVarZzL.zzu();
        zzr zzrVar = this.zza;
        Preconditions.checkNotEmpty(zzrVar.zza);
        zzpgVarZzL.zzv(zzrVar);
        zzpgVarZzL.zzw(zzrVar);
    }
}
