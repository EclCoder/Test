package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzibb {
    private final zziaz zza;

    private zzibb(zziaz zziazVar) {
        this.zza = zziazVar;
    }

    public static zzibb zza(byte[] bArr, zzhel zzhelVar) {
        return new zzibb(zziaz.zza(bArr));
    }

    public static zzibb zzb(int i10) {
        return new zzibb(zziaz.zza(zzhnp.zza(i10)));
    }

    public final byte[] zzc(zzhel zzhelVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}
