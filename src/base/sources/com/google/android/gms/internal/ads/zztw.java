package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zztw implements zzsb {
    final /* synthetic */ zztx zza;

    /* synthetic */ zztw(zztx zztxVar, byte[] bArr) {
        Objects.requireNonNull(zztxVar);
        this.zza = zztxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsb
    public final void zza(Exception exc) {
        zzeg.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaz().zzi(exc);
    }
}
