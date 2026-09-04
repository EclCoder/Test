package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzamb {
    public final zzami zza;
    public final zzaml zzb;
    public final zzahk zzc;
    public final zzahl zzd;
    public int zze;
    public zzv zzf;

    public zzamb(zzami zzamiVar, zzaml zzamlVar, zzahk zzahkVar) {
        this.zza = zzamiVar;
        this.zzb = zzamlVar;
        this.zzc = zzahkVar;
        this.zzd = MimeTypes.AUDIO_TRUEHD.equals(zzamiVar.zzg.zzp) ? new zzahl() : null;
    }
}
