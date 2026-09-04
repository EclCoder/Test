package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbgu implements zzbfk {
    final /* synthetic */ zzbgx zza;

    zzbgu(zzbgx zzbgxVar) {
        Objects.requireNonNull(zzbgxVar);
        this.zza = zzbgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zza(boolean z10) {
        if (z10) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }
}
