package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzbpl implements zzbpq {
    static final /* synthetic */ zzbpl zza = new zzbpl();

    private /* synthetic */ zzbpl() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcmg zzcmgVar = (zzcmg) obj;
        zzbpq zzbpqVar = zzbpp.zza;
        String str = (String) map.get("u");
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzg)).booleanValue() && str.isEmpty()) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty from httpTrack GMSG.");
        } else {
            zzckl zzcklVar = (zzckl) zzcmgVar;
            new com.google.android.gms.ads.internal.util.zzbt(zzcmgVar.getContext(), ((zzcmo) zzcmgVar).zzs().afmaVersion, str, null, zzcklVar.zzC() != null ? zzcklVar.zzC().zzax : null).zzb();
        }
    }
}
