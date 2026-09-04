package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbos implements zzbpq {
    zzbos() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcku zzckuVar = (zzcku) obj;
        try {
            zzgck.zzh(zzckuVar.getContext()).zzk();
            zzgcl.zzh(zzckuVar.getContext()).zzj();
            zzgcm.zza(zzckuVar.getContext()).zzb(null);
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
