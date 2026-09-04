package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzacx {
    private boolean zzc;
    private int zze;
    private zzacw zza = new zzacw();
    private zzacw zzb = new zzacw();
    private long zzd = C.TIME_UNSET;

    public final void zza() {
        this.zza.zza();
        this.zzb.zza();
        this.zzc = false;
        this.zzd = C.TIME_UNSET;
        this.zze = 0;
    }

    public final void zzb(long j10) {
        this.zza.zzf(j10);
        if (this.zza.zzb()) {
            this.zzc = false;
        } else if (this.zzd != C.TIME_UNSET) {
            if (!this.zzc || this.zzb.zzc()) {
                this.zzb.zza();
                this.zzb.zzf(this.zzd);
            }
            this.zzc = true;
            this.zzb.zzf(j10);
        }
        if (this.zzc && this.zzb.zzb()) {
            zzacw zzacwVar = this.zza;
            this.zza = this.zzb;
            this.zzb = zzacwVar;
            this.zzc = false;
        }
        this.zzd = j10;
        this.zze = this.zza.zzb() ? 0 : this.zze + 1;
    }

    public final boolean zzc() {
        return this.zza.zzb();
    }

    public final int zzd() {
        return this.zze;
    }

    public final long zze() {
        return this.zza.zzb() ? this.zza.zzd() : C.TIME_UNSET;
    }

    public final long zzf() {
        return this.zza.zzb() ? this.zza.zze() : C.TIME_UNSET;
    }

    public final float zzg() {
        if (this.zza.zzb()) {
            return (float) (1.0E9d / this.zza.zze());
        }
        return -1.0f;
    }
}
