package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzye extends zzagn {
    final /* synthetic */ zzyq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzye(zzyq zzyqVar, zzahb zzahbVar) {
        super(zzahbVar);
        Objects.requireNonNull(zzyqVar);
        this.zza = zzyqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagn, com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zza.zzQ();
    }
}
