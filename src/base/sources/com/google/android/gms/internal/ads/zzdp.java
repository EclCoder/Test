package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdp {
    public static final zzdp zza = new zzdp(0, 0, false);
    private final int zzb;
    private final int zzc;
    private final boolean zzd;

    private zzdp(int i10, int i11, boolean z10) {
        this.zzd = z10;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final int zza() {
        zzgtj.zzi(this.zzd);
        return this.zzb;
    }

    public final int zzb() {
        zzgtj.zzi(this.zzd);
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    public zzdp(int i10, int i11) {
        this(i10, i11, true);
    }
}
