package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfvl {
    private final zzfwz zza;
    private final String zzb;
    private final zzfur zzc;
    private final String zzd = "Ad overlay";

    public zzfvl(View view, zzfur zzfurVar, String str) {
        this.zza = new zzfwz(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfurVar;
    }

    public final zzfwz zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzfur zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
