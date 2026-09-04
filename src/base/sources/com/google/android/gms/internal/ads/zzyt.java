package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzyt implements zzxj {
    private final zzho zza;
    private final zzyc zzb;
    private int zzc;
    private final zzabu zzd;

    public zzyt(zzho zzhoVar, final zzage zzageVar) {
        zzyc zzycVar = new zzyc() { // from class: com.google.android.gms.internal.ads.zzys
            @Override // com.google.android.gms.internal.ads.zzyc
            public final /* synthetic */ zzyd zza(zzqf zzqfVar) {
                return new zzwm(zzageVar);
            }
        };
        zzabu zzabuVar = new zzabu(-1);
        this.zza = zzhoVar;
        this.zzb = zzycVar;
        this.zzd = zzabuVar;
        this.zzc = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
    }

    public final zzyt zza(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzyu zzb(zzak zzakVar) {
        zzakVar.zzb.getClass();
        return new zzyu(zzakVar, this.zza, this.zzb, zzun.zza, this.zzd, this.zzc, false, 0, null, null, null);
    }
}
