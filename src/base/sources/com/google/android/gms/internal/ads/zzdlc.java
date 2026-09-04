package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdlc {
    private final List zza;
    private final zzfsc zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private boolean zzd;

    public zzdlc(zzfkf zzfkfVar, zzfsc zzfscVar) {
        this.zza = zzfkfVar.zzp;
        this.zzb = zzfscVar;
        this.zzc = zzfkfVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zza(this.zza, this.zzc);
        this.zzd = true;
    }
}
