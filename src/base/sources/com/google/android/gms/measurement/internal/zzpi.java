package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzpi {
    private long zza;
    private com.google.android.gms.internal.measurement.zzib zzb;
    private String zzc;
    private Map zzd;
    private zzls zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private int zzi;

    zzpi() {
    }

    public final zzpj zza() {
        return new zzpj(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, null);
    }

    public final zzpi zzb(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzpi zzc(com.google.android.gms.internal.measurement.zzib zzibVar) {
        this.zzb = zzibVar;
        return this;
    }

    public final zzpi zzd(String str) {
        this.zzc = str;
        return this;
    }

    public final zzpi zze(Map map) {
        this.zzd = map;
        return this;
    }

    public final zzpi zzf(zzls zzlsVar) {
        this.zze = zzlsVar;
        return this;
    }

    public final zzpi zzg(long j10) {
        this.zzf = j10;
        return this;
    }

    public final zzpi zzh(long j10) {
        this.zzg = j10;
        return this;
    }

    public final zzpi zzi(long j10) {
        this.zzh = j10;
        return this;
    }

    public final zzpi zzj(int i10) {
        this.zzi = i10;
        return this;
    }
}
