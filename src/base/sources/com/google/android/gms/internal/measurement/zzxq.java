package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzxq extends zzxo implements zzxp {
    final /* synthetic */ zzxs zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzxq(zzxs zzxsVar, Level level, boolean z10) {
        super(level, false);
        Objects.requireNonNull(zzxsVar);
        this.zza = zzxsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzxz
    protected final /* synthetic */ zzxi zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzxz
    protected final /* bridge */ /* synthetic */ zzyi zzd() {
        return this;
    }
}
