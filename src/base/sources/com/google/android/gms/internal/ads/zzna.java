package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zzna extends zzmv {
    String zzU();

    default long zzV(long j10, long j11) {
        if (zze() == 1) {
            return (zzaa() || zzab()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    default boolean zzW(long j10) {
        return false;
    }

    void zzZ(long j10, long j11);

    int zza();

    boolean zzaa();

    boolean zzab();

    zznc zzb();

    void zzc(int i10, zzqf zzqfVar, zzdo zzdoVar);

    void zzcT();

    void zzcU(zzv[] zzvVarArr, zzzc zzzcVar, long j10, long j11, zzxk zzxkVar);

    zzzc zzcV();

    boolean zzcW();

    zzmb zzd();

    int zze();

    void zzf(zznd zzndVar, zzv[] zzvVarArr, zzzc zzzcVar, long j10, boolean z10, boolean z11, long j11, long j12, zzxk zzxkVar);

    long zzk();

    void zzl();

    boolean zzm();

    void zzn();

    void zzo(zzbf zzbfVar);

    void zzp(long j10, boolean z10);

    void zzq();

    void zzr();

    void zzs();

    default void zzY() {
    }

    default void zzt() {
    }

    default void zzX(float f10, float f11) {
    }
}
