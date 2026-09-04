package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbwc implements MediationAdLoadCallback {
    final /* synthetic */ zzbvi zza;
    final /* synthetic */ zzbwd zzb;

    zzbwc(zzbwd zzbwdVar, zzbvi zzbviVar) {
        this.zza = zzbviVar;
        Objects.requireNonNull(zzbwdVar);
        this.zzb = zzbwdVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzU((MediationAppOpenAd) obj);
            this.zza.zzj();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
        return new zzbvt(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        String str = giNWGaNAgVQoO.THnIb;
        try {
            String canonicalName = this.zzb.zzb().getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(code).length() + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
            sb2.append(canonicalName);
            sb2.append(str);
            sb2.append(code);
            sb2.append(". ErrorMessage = ");
            sb2.append(message);
            sb2.append(". ErrorDomain = ");
            sb2.append(domain);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
            zzbvi zzbviVar = this.zza;
            zzbviVar.zzx(adError.zza());
            zzbviVar.zzw(adError.getCode(), adError.getMessage());
            zzbviVar.zzg(adError.getCode());
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }
}
