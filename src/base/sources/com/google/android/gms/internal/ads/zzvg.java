package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzvg {
    public final zzvm zza;
    public final MediaFormat zzb;
    public final zzv zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzvf zzf;

    private zzvg(zzvm zzvmVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto, zzvf zzvfVar) {
        this.zza = zzvmVar;
        this.zzb = mediaFormat;
        this.zzc = zzvVar;
        this.zzd = surface;
        this.zzf = zzvfVar;
    }

    public static zzvg zza(zzvm zzvmVar, MediaFormat mediaFormat, zzv zzvVar, MediaCrypto mediaCrypto, zzvf zzvfVar) {
        return new zzvg(zzvmVar, mediaFormat, zzvVar, null, null, zzvfVar);
    }

    public static zzvg zzb(zzvm zzvmVar, MediaFormat mediaFormat, zzv zzvVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzvg(zzvmVar, mediaFormat, zzvVar, surface, null, null);
    }
}
