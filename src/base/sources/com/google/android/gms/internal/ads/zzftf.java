package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzftf implements zzbfk {
    final /* synthetic */ zzfth zza;

    zzftf(zzfth zzfthVar) {
        Objects.requireNonNull(zzfthVar);
        this.zza = zzfthVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zza(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzz)).booleanValue()) {
            this.zza.zzj(z10);
        }
    }
}
