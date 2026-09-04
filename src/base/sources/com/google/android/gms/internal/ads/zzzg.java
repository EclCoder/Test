package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzzg extends zzbf {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final zzak zzf;
    private final zzaf zzg;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("SinglePeriodTimeline");
        zzzVar.zzb(Uri.EMPTY);
        zzzVar.zzc();
    }

    public zzzg(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, zzak zzakVar, zzaf zzafVar) {
        this.zzc = j13;
        this.zzd = j14;
        this.zze = z10;
        zzakVar.getClass();
        this.zzf = zzakVar;
        this.zzg = zzafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i10, zzbe zzbeVar, long j10) {
        zzgtj.zzm(i10, 1, "index");
        boolean z10 = this.zze;
        zzbeVar.zza(zzbe.zza, this.zzf, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, z10, false, this.zzg, 0L, this.zzd, 0, 0, 0L);
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        zzgtj.zzm(i10, 1, "index");
        zzbdVar.zza(null, z10 ? zzb : null, 0, this.zzc, 0L, zzc.zza, false);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i10) {
        zzgtj.zzm(i10, 1, "index");
        return zzb;
    }
}
