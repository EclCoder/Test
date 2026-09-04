package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzegk implements zzdfx {
    private final Context zza;
    private final zzcdz zzb;

    zzegk(Context context, zzcdz zzcdzVar) {
        this.zza = context;
        this.zzb = zzcdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(zzfkq zzfkqVar) {
        String str = zzfkqVar.zzb.zzb.zze;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzcdz zzcdzVar = this.zzb;
        Context context = this.zza;
        zzcdzVar.zzc(context, zzfkqVar.zza.zza.zzd);
        zzcdzVar.zzm(context, str);
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(zzcbd zzcbdVar) {
    }
}
