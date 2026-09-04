package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzyn extends zzyq {
    final /* synthetic */ zzyq zza;
    final /* synthetic */ zzyq zzb;

    zzyn(zzyq zzyqVar, zzyq zzyqVar2) {
        this.zza = zzyqVar;
        this.zzb = zzyqVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void zzb() {
        try {
            this.zza.zzb();
        } finally {
            this.zzb.zzb();
        }
    }
}
