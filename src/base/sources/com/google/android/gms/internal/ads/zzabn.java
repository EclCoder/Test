package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzabn {
    private final Handler zza;
    private final zzabp zzb;
    private boolean zzc;

    public zzabn(Handler handler, zzabp zzabpVar) {
        this.zza = handler;
        this.zzb = zzabpVar;
    }

    public final void zza() {
        this.zzc = true;
    }

    final /* synthetic */ Handler zzb() {
        return this.zza;
    }

    final /* synthetic */ zzabp zzc() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzc;
    }
}
