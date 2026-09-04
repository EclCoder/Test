package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zzahk {
    void zzA(zzv zzvVar);

    default int zza(zzj zzjVar, int i10, boolean z10) {
        return zzb(zzjVar, i10, z10, 0);
    }

    int zzb(zzj zzjVar, int i10, boolean z10, int i11);

    default void zzc(zzet zzetVar, int i10) {
        zzd(zzetVar, i10, 0);
    }

    void zzd(zzet zzetVar, int i10, int i11);

    void zze(long j10, int i10, int i11, int i12, zzahj zzahjVar);

    default void zzO(long j10) {
    }
}
