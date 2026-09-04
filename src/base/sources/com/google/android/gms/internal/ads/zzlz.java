package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzlz {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlz() {
        this.zza = C.TIME_UNSET;
        this.zzb = -3.4028235E38f;
        this.zzc = C.TIME_UNSET;
    }

    public final zzlz zza(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzlz zzb(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        zzgtj.zza(z10);
        this.zzb = f10;
        return this;
    }

    public final zzlz zzc(long j10) {
        boolean z10 = true;
        if (j10 < 0) {
            if (j10 == C.TIME_UNSET) {
                j10 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        zzgtj.zza(z10);
        this.zzc = j10;
        return this;
    }

    public final zzma zzd() {
        return new zzma(this, null);
    }

    final /* synthetic */ long zze() {
        return this.zza;
    }

    final /* synthetic */ float zzf() {
        return this.zzb;
    }

    final /* synthetic */ long zzg() {
        return this.zzc;
    }

    /* synthetic */ zzlz(zzma zzmaVar, byte[] bArr) {
        this.zza = zzmaVar.zza;
        this.zzb = zzmaVar.zzb;
        this.zzc = zzmaVar.zzc;
    }
}
