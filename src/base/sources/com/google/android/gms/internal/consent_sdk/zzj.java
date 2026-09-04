package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import rc.c;
import rc.d;
import rc.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzj implements c {
    private final zzaq zza;
    private final zzw zzb;
    private final zzbq zzc;
    private final zzcr zzf;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzg = false;
    private boolean zzh = false;
    private d zzi = new d.a().a();

    public zzj(zzaq zzaqVar, zzw zzwVar, zzbq zzbqVar, zzcr zzcrVar) {
        this.zza = zzaqVar;
        this.zzb = zzwVar;
        this.zzc = zzbqVar;
        this.zzf = zzcrVar;
    }

    public final boolean canRequestAds() {
        zzaq zzaqVar = this.zza;
        if (!zzaqVar.zzk()) {
            int iZza = !zzc() ? 0 : zzaqVar.zza();
            if (iZza != 1 && iZza != 3) {
                return false;
            }
        }
        return true;
    }

    public final int getConsentStatus() {
        if (zzc()) {
            return this.zza.zza();
        }
        return 0;
    }

    @Override // rc.c
    public final c.EnumC0792c getPrivacyOptionsRequirementStatus() {
        return !zzc() ? c.EnumC0792c.UNKNOWN : this.zza.zzb();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    @Override // rc.c
    public final void requestConsentInfoUpdate(Activity activity, d dVar, c.b bVar, c.a aVar) {
        synchronized (this.zzd) {
            this.zzg = true;
        }
        this.zzi = dVar;
        this.zzf.zzh();
        this.zzb.zzc(activity, dVar, bVar, aVar);
    }

    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzg = false;
        }
    }

    public final void zza(Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzi, new c.b() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // rc.c.b
                public final void onConsentInfoUpdateSuccess() {
                    this.zza.zzb(false);
                }
            }, new c.a() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // rc.c.a
                public final void onConsentInfoUpdateFailure(e eVar) {
                    this.zza.zzb(false);
                }
            });
            return;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zzc() + ", retryRequestIsInProgress=" + zzd());
    }

    public final void zzb(boolean z10) {
        synchronized (this.zze) {
            this.zzh = z10;
        }
    }

    public final boolean zzc() {
        boolean z10;
        synchronized (this.zzd) {
            z10 = this.zzg;
        }
        return z10;
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzh;
        }
        return z10;
    }
}
