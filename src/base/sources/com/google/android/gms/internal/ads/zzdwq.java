package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwq implements zzddm {
    private final zzcku zza;

    zzdwq(zzcku zzckuVar) {
        this.zza = zzckuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zza(Context context) {
        zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzb(Context context) {
        zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzc(Context context) {
        zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.destroy();
        }
    }
}
