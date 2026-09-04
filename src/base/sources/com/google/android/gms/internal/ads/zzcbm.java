package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcbm extends zzcbo {
    private final String zza;
    private final int zzb;

    public zzcbm(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcbm)) {
            return false;
        }
        zzcbm zzcbmVar = (zzcbm) obj;
        if (Objects.equal(this.zza, zzcbmVar.zza)) {
            if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzcbmVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzc() {
        return this.zzb;
    }
}
