package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfzi extends zzfzo {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzfzi() {
    }

    public final zzfzo zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    public final zzfzo zzb(boolean z10) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    public final zzfzp zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzfzj(this.zza, false, this.zzc, null, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb2.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    final zzfzo zzd(int i10) {
        this.zzc = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    public final zzfzo zze(int i10) {
        this.zzd = 1;
        return this;
    }
}
