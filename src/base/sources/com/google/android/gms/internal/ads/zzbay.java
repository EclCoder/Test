package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbay extends zzazh {
    public long zza;
    public long zzb;

    public zzbay() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    protected final HashMap zza() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.zza));
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzbay(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap mapZzb = zzazh.zzb(str);
        if (mapZzb != null) {
            this.zza = ((Long) mapZzb.get(0)).longValue();
            this.zzb = ((Long) mapZzb.get(1)).longValue();
        }
    }
}
