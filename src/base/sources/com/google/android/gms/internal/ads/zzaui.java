package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaui implements zzatz {
    final /* synthetic */ Context zza;
    private File zzb = null;

    zzaui(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
