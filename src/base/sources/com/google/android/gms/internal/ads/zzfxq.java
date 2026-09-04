package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfxq {
    private final Context zza;
    private final Looper zzb;

    public zzfxq(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfya zzfyaVarZza = zzfyc.zza();
        Context context = this.zza;
        zzfyaVarZza.zza(context.getPackageName());
        zzfyaVarZza.zzc(2);
        zzfxy zzfxyVarZza = zzfxz.zza();
        zzfxyVarZza.zza(str);
        zzfxyVarZza.zzb(2);
        zzfyaVarZza.zzb(zzfxyVarZza);
        new zzfxr(context, this.zzb, (zzfyc) zzfyaVarZza.zzbu()).zza();
    }
}
