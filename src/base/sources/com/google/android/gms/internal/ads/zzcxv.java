package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxv implements zzcxw {
    private final Map zza;

    zzcxv(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final zzels zza(int i10, String str) {
        return (zzels) this.zza.get(str);
    }
}
