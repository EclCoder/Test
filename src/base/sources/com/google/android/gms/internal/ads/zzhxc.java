package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhxc extends zzhxk {
    private final zzhwy zza;
    private final BigInteger zzb;
    private final zziaz zzc;
    private final Integer zzd;

    /* synthetic */ zzhxc(zzhwy zzhwyVar, BigInteger bigInteger, zziaz zziazVar, Integer num, byte[] bArr) {
        this.zza = zzhwyVar;
        this.zzb = bigInteger;
        this.zzc = zziazVar;
        this.zzd = num;
    }

    public static zzhxb zzc() {
        return new zzhxb(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhxk, com.google.android.gms.internal.ads.zzhdq
    public final /* synthetic */ zzheh zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    public final Integer zzb() {
        return this.zzd;
    }

    public final BigInteger zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxk
    public final zziaz zze() {
        return this.zzc;
    }

    public final zzhwy zzf() {
        return this.zza;
    }
}
