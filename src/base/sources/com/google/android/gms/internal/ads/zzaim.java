package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzaim {
    protected final zzahk zza;

    protected zzaim(zzahk zzahkVar) {
        this.zza = zzahkVar;
    }

    protected abstract boolean zza(zzet zzetVar);

    protected abstract boolean zzb(zzet zzetVar, long j10);

    public final boolean zzf(zzet zzetVar, long j10) {
        return zza(zzetVar) && zzb(zzetVar, j10);
    }
}
