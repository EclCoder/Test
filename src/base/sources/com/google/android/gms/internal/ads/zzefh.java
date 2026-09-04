package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzefh implements zzhbt {
    final /* synthetic */ zzefk zza;

    zzefh(zzefk zzefkVar) {
        Objects.requireNonNull(zzefkVar);
        this.zza = zzefkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhh)).booleanValue()) {
            Matcher matcher = zzefk.zzh.matcher(th2.getMessage());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                zzefk zzefkVar = this.zza;
                zzefkVar.zzc().zzc(Integer.parseInt(strGroup));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfkq zzfkqVar = (zzfkq) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhh)).booleanValue()) {
            zzefk zzefkVar = this.zza;
            zzfki zzfkiVar = zzfkqVar.zzb.zzb;
            zzefkVar.zzc().zzc(zzfkiVar.zzf);
            zzefkVar.zzc().zze(zzfkiVar.zzg);
        }
    }
}
