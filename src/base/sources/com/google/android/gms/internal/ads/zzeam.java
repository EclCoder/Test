package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzeam extends zzeaq {
    private long zza;
    private int zzb;
    private byte zzc;

    zzeam() {
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final zzeaq zza(long j10) {
        this.zza = j10;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final zzeaq zzb(int i10) {
        this.zzb = i10;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final zzear zzc() {
        if (this.zzc == 3) {
            return new zzean(this.zza, this.zzb, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb2.append(" id");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
