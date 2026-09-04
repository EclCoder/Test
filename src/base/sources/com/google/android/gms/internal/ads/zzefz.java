package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzefz implements zzhbt {
    final /* synthetic */ Context zza;

    zzefz(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        if (((Boolean) zzbki.zzh.zze()).booleanValue() && (th2 instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbib.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbki.zzj.zze()).booleanValue()) {
            zzbib.zze(this.zza);
        }
    }
}
