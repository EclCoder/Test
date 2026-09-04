package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcez extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcfd zza;

    zzcez(zzcfd zzcfdVar) {
        Objects.requireNonNull(zzcfdVar);
        this.zza = zzcfdVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcfd zzcfdVar = this.zza;
        zzbit zzbitVar = new zzbit(zzcfdVar.zzz(), zzcfdVar.zzA().afmaVersion);
        synchronized (zzcfdVar.zzy()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzm();
                zzbiw.zza(zzcfdVar.zzB(), zzbitVar);
            } catch (IllegalArgumentException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot config CSI reporter.", e10);
            }
        }
    }
}
