package com.google.android.gms.internal.ads;

import com.hecorat.screenrecorder.free.models.Ke.Lykgign;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbct extends zzbdf {
    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdN);
        bool.booleanValue();
        zzbay zzbayVar = new zzbay((String) this.zze.invoke(null, this.zza.zzb(), bool));
        zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzaxmVar.zzc(zzbayVar.zza);
            zzaxmVar.zzP(zzbayVar.zzb);
        }
    }

    public zzbct(zzbbs zzbbsVar, String str, String str2, zzaxm zzaxmVar, int i10, int i11) {
        super(zzbbsVar, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", Lykgign.CULoHwHZhYlwd, zzaxmVar, i10, 3);
    }
}
