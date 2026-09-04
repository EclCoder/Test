package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgqt extends zzgru {
    private int zza;
    private String zzb;
    private int zzc;
    private byte zzd;

    zzgqt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final zzgru zza(int i10) {
        this.zza = i10;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final zzgru zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final zzgru zzc(int i10) {
        this.zzc = i10;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final zzgrv zzd() {
        if (this.zzd == 3) {
            return new zzgqu(this.zza, this.zzb, this.zzc, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb2.append(" statusCode");
        }
        if ((this.zzd & 2) == 0) {
            sb2.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
