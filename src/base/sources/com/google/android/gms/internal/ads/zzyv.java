package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzyv implements zzabk {
    public long zza;
    public long zzb;
    public zzabj zzc;
    public zzyv zzd;

    public zzyv(long j10, int i10) {
        zza(j10, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    public final void zza(long j10, int i10) {
        zzgtj.zzi(this.zzc == null);
        this.zza = j10;
        this.zzb = j10 + 65536;
    }

    public final int zzb(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    public final zzyv zzc() {
        this.zzc = null;
        zzyv zzyvVar = this.zzd;
        this.zzd = null;
        return zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final zzabj zzd() {
        zzabj zzabjVar = this.zzc;
        zzabjVar.getClass();
        return zzabjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final zzabk zze() {
        zzyv zzyvVar = this.zzd;
        if (zzyvVar == null || zzyvVar.zzc == null) {
            return null;
        }
        return zzyvVar;
    }
}
