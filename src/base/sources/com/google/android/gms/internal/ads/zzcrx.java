package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcrx implements zzcrt {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcrx(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final void zza(Map map) {
        this.zza.zzd(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
