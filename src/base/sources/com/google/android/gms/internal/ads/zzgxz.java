package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgxz extends zzgxy {
    final /* synthetic */ zzgya zza;

    zzgxz(zzgya zzgyaVar, int i10) {
        Objects.requireNonNull(zzgyaVar);
        this.zza = zzgyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final zzgxh zza() {
        return new zzgyc(this.zza.zza(), new zzgxx(2));
    }
}
