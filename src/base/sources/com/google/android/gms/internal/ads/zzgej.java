package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgej implements zzged {
    private final int zza;
    private final byte[] zzb;

    zzgej(int i10, byte[] bArr) {
        this.zza = i10;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzged
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzged
    public final String zzb() {
        return new String(this.zzb);
    }
}
