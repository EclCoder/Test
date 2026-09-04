package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzeh extends zzej {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* synthetic */ zzeh(byte[] bArr, int i10, int i11, boolean z10, zzeg zzegVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i10) {
        int i11 = this.zze;
        this.zze = 0;
        int i12 = this.zzc + this.zzd;
        this.zzc = i12;
        if (i12 <= 0) {
            this.zzd = 0;
            return i11;
        }
        this.zzd = i12;
        this.zzc = 0;
        return i11;
    }
}
