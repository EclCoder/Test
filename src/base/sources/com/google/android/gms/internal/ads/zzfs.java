package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfs {
    private boolean zza;

    public zzfs(Context context, Looper looper, zzdo zzdoVar) {
        context.getApplicationContext();
        zzdoVar.zzd(looper, null);
        zzdoVar.zzd(Looper.getMainLooper(), null);
    }

    public final void zza(boolean z10) {
        if (this.zza == z10) {
            return;
        }
        this.zza = z10;
    }
}
