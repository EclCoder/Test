package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhu implements zzho {
    private final Context zza;
    private final zzho zzb;

    public zzhu(Context context) {
        zzhw zzhwVar = new zzhw();
        this.zza = context.getApplicationContext();
        this.zzb = zzhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzho
    public final /* bridge */ /* synthetic */ zzhp zza() {
        return new zzhv(this.zza, this.zzb.zza());
    }
}
