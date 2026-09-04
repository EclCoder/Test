package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaos implements zzanl {
    public static final zzand zza = new zzand(zzgwm.zzi(), C.TIME_UNSET, C.TIME_UNSET);
    private final zzet zzb = new zzet();
    private final zzet zzc = new zzet();
    private final zzaor zzd;
    private Inflater zze;

    public zzaos(List list) {
        zzaor zzaorVar = new zzaor();
        this.zzd = zzaorVar;
        zzaorVar.zza(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i10, int i11, zzank zzankVar, zzdt zzdtVar) {
        zzand zzandVar;
        zzet zzetVar = this.zzb;
        zzetVar.zzb(bArr, i11 + i10);
        zzetVar.zzh(i10);
        if (this.zze == null) {
            this.zze = new Inflater();
        }
        zzet zzetVar2 = this.zzc;
        if (zzfl.zzO(zzetVar, zzetVar2, this.zze)) {
            zzetVar.zzb(zzetVar2.zzi(), zzetVar2.zze());
        }
        zzaor zzaorVar = this.zzd;
        zzaorVar.zzc();
        int iZzd = zzetVar.zzd();
        if (iZzd < 2 || zzetVar.zzt() != iZzd) {
            zzandVar = zza;
        } else {
            zzaorVar.zzd(zzetVar);
            long jZzf = zzaorVar.zzf();
            zzcx zzcxVarZzb = zzaorVar.zzb(zzetVar);
            long jZzf2 = C.TIME_UNSET;
            if (jZzf != C.TIME_UNSET) {
                if (zzaorVar.zze() != C.TIME_UNSET) {
                    if (zzaorVar.zzf() > zzaorVar.zze()) {
                        jZzf2 = zzaorVar.zzf() - zzaorVar.zze();
                    } else {
                        jZzf2 = zzaorVar.zzf();
                    }
                } else {
                    jZzf2 = zzaorVar.zzf();
                }
            }
            zzandVar = new zzand(zzcxVarZzb != null ? zzgwm.zzj(zzcxVarZzb) : zzgwm.zzi(), zzaorVar.zze(), jZzf2);
        }
        zzdtVar.zza(zzandVar);
    }
}
