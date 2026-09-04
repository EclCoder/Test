package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzafi {
    public static final zzafi zza = new zzafi(-3, C.TIME_UNSET, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzafi(int i10, long j10, long j11) {
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzafi zza(long j10, long j11) {
        return new zzafi(-1, j10, j11);
    }

    public static zzafi zzb(long j10, long j11) {
        return new zzafi(-2, j10, j11);
    }

    public static zzafi zzc(long j10) {
        return new zzafi(0, C.TIME_UNSET, j10);
    }

    final /* synthetic */ int zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
