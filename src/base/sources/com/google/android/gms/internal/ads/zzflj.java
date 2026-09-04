package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzflj {
    public static zzbpq zza(final zzekg zzekgVar, final zzfsc zzfscVar, final zzctj zzctjVar, final zzdky zzdkyVar) {
        return new zzbpq() { // from class: com.google.android.gms.internal.ads.zzfli
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcku zzckuVar = (zzcku) obj;
                zzbpp.zzc(map, zzdkyVar);
                String str = (String) map.get("u");
                if (str == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    zzekg zzekgVar2 = zzekgVar;
                    zzfsc zzfscVar2 = zzfscVar;
                    zzhbw.zzr(zzbpp.zza(zzckuVar, str), new zzflg(zzckuVar, zzctjVar, zzfscVar2, zzekgVar2), zzcfr.zza);
                }
            }
        };
    }

    public static zzbpq zzb(final zzekg zzekgVar, final zzfsc zzfscVar) {
        return new zzbpq() { // from class: com.google.android.gms.internal.ads.zzflh
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzckl zzcklVar = (zzckl) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfkf zzfkfVarZzC = zzcklVar.zzC();
                if (zzfkfVarZzC != null && !zzfkfVarZzC.zzai) {
                    zzfscVar.zzb(str, zzfkfVarZzC.zzax, null, null);
                    return;
                }
                zzfki zzfkiVarZzaC = ((zzcmb) zzcklVar).zzaC();
                if (zzfkiVarZzaC != null) {
                    zzekgVar.zze(new zzeki(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), zzfkiVarZzaC.zzb, str, 2));
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
