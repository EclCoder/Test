package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbtt extends zzcgd {
    private final com.google.android.gms.ads.internal.util.zzbc zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbtt(com.google.android.gms.ads.internal.util.zzbc zzbcVar) {
        this.zzb = zzbcVar;
    }

    public final zzbto zza() {
        zzbto zzbtoVar = new zzbto(this);
        com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Lock acquired");
            zze(new zzbtp(this, zzbtoVar), new zzbtq(this, zzbtoVar));
            Preconditions.checkState(this.zzd >= 0);
            this.zzd++;
        }
        com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Lock released");
        return zzbtoVar;
    }

    protected final void zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Lock acquired");
            Preconditions.checkState(this.zzd > 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzd();
        }
        com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Lock released");
    }

    public final void zzc() {
        com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Lock acquired");
            Preconditions.checkState(this.zzd >= 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzd();
        }
        com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Lock released");
    }

    protected final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Lock acquired");
                Preconditions.checkState(this.zzd >= 0);
                if (this.zzc && this.zzd == 0) {
                    com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                    zze(new zzbts(this), new zzcfz());
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Lock released");
    }
}
