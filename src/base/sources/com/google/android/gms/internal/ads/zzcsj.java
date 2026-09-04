package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcsj implements zzcrt {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzh().zzo();

    public zzcsj(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean z10 = Boolean.parseBoolean(str);
        zzgVar.zzw(z10);
        if (z10) {
            com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
        }
    }
}
