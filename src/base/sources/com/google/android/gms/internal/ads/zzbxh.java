package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c1.pGX.geAgcEazw;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbxh implements MediationAdLoadCallback {
    final /* synthetic */ zzbwp zza;
    final /* synthetic */ zzbvi zzb;

    zzbxh(zzbxo zzbxoVar, zzbwp zzbwpVar, zzbvi zzbviVar) {
        this.zza = zzbwpVar;
        this.zzb = zzbviVar;
        Objects.requireNonNull(zzbxoVar);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationInterscrollerAd mediationInterscrollerAd = (MediationInterscrollerAd) obj;
        if (mediationInterscrollerAd != null) {
            try {
                this.zza.zzh(new zzbwe(mediationInterscrollerAd));
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            }
            return new zzbxp(this.zzb);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzi(geAgcEazw.hQvRe);
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
            return null;
        }
    }
}
