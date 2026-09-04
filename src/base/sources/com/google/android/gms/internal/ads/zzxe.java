package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzxe extends zzbf {
    private final zzak zzb;

    public zzxe(zzak zzakVar) {
        this.zzb = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i10, zzbe zzbeVar, long j10) {
        zzbeVar.zza(zzbe.zza, this.zzb, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
        zzbeVar.zzk = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        zzbdVar.zza(z10 ? 0 : null, z10 ? zzxd.zzc : null, 0, C.TIME_UNSET, 0L, zzc.zza, true);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        return obj == zzxd.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i10) {
        return zzxd.zzc;
    }
}
