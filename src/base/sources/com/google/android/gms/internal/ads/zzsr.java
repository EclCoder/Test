package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzsr implements zzte {
    final /* synthetic */ zzsy zza;

    /* synthetic */ zzsr(zzsy zzsyVar, byte[] bArr) {
        Objects.requireNonNull(zzsyVar);
        this.zza = zzsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zza(long j10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 41);
        sb2.append("Ignoring impossibly large audio latency: ");
        sb2.append(j10);
        zzeg.zzc("AudioTrackAudioOutput", sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzb(final long j10) {
        zzsy zzsyVar = this.zza;
        if (zzsyVar.zzu().zzb()) {
            zzef zzefVarZzu = zzsyVar.zzu();
            zzefVarZzu.zze(-1, new zzea() { // from class: com.google.android.gms.internal.ads.zzsq
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj) {
                    ((zzqt) obj).zza(j10);
                }
            });
            zzefVarZzu.zzf();
        }
    }
}
