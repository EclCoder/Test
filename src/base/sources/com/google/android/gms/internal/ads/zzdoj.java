package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdoj implements zzbpq {
    private final WeakReference zza;

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        zzdon zzdonVar = (zzdon) this.zza.get();
        if (zzdonVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzdonVar.zzD().onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmh)).booleanValue()) {
                zzdonVar.zzE().zzdu();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdonVar.zzE().zzdR();
            }
        }
    }
}
