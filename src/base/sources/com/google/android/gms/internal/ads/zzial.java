package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzial implements zzhqd {
    final zzhqd zza;
    final zzhqd zzb;

    /* synthetic */ zzial(zzhqd zzhqdVar, zzhqd zzhqdVar2, byte[] bArr) {
        this.zza = zzhqdVar;
        this.zzb = zzhqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhqd
    public final byte[] zza(byte[] bArr, int i10) {
        return bArr.length <= 64 ? this.zza.zza(bArr, i10) : this.zzb.zza(bArr, i10);
    }
}
