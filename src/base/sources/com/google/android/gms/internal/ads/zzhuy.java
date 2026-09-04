package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhuy extends zzhxk {
    private final zzhuu zza;
    private final ECPoint zzb;
    private final zziaz zzc;
    private final Integer zzd;

    /* synthetic */ zzhuy(zzhuu zzhuuVar, ECPoint eCPoint, zziaz zziazVar, Integer num, byte[] bArr) {
        this.zza = zzhuuVar;
        this.zzb = eCPoint;
        this.zzc = zziazVar;
        this.zzd = num;
    }

    public static zzhux zzc() {
        return new zzhux(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhxk, com.google.android.gms.internal.ads.zzhdq
    public final /* synthetic */ zzheh zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    public final Integer zzb() {
        return this.zzd;
    }

    public final ECPoint zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxk
    public final zziaz zze() {
        return this.zzc;
    }

    public final zzhuu zzf() {
        return this.zza;
    }
}
