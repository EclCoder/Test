package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfah implements zzfci {
    public final zzfke zza;

    public zzfah(zzfke zzfkeVar) {
        this.zza = zzfkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfke zzfkeVar = this.zza;
        if (zzfkeVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zznt)).booleanValue()) {
                return;
            }
            bundle.putBoolean("render_in_browser", zzfkeVar.zzb());
            bundle.putBoolean("disable_ml", zzfkeVar.zzc());
        }
    }
}
