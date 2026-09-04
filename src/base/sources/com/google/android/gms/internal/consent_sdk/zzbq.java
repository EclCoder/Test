package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import rc.b;
import rc.c;
import rc.e;
import rc.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbq {
    private final zztm zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    zzbq(zztm zztmVar, Executor executor) {
        this.zza = zztmVar;
        this.zzb = executor;
    }

    public static /* synthetic */ void zza(zzbq zzbqVar, zzbe zzbeVar) {
        final AtomicReference atomicReference = zzbqVar.zzd;
        Objects.requireNonNull(atomicReference);
        zzbeVar.zzf(new f.b() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
            @Override // rc.f.b
            public final void onConsentFormLoadSuccess(b bVar) {
                atomicReference.set(bVar);
            }
        }, new f.a() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
            @Override // rc.f.a
            public final void onConsentFormLoadFailure(e eVar) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(eVar.b())));
            }
        });
    }

    public final void zzb(f.b bVar, f.a aVar, boolean z10) {
        zzcz.zza();
        zzbs zzbsVar = (zzbs) this.zzc.get();
        if (zzbsVar == null) {
            aVar.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
            return;
        }
        zzbe zzbeVarZza = ((zzay) this.zza.zzb()).zza(zzbsVar).zzb().zza();
        zzbeVarZza.zzb = z10;
        zzbeVarZza.zzf(bVar, aVar);
    }

    public final void zzc() {
        zzbs zzbsVar = (zzbs) this.zzc.get();
        if (zzbsVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final zzbe zzbeVarZza = ((zzay) this.zza.zzb()).zza(zzbsVar).zzb().zza();
        zzbeVarZza.zza = true;
        zzcz.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
            @Override // java.lang.Runnable
            public final void run() {
                zzbq.zza(this.zza, zzbeVarZza);
            }
        });
    }

    public final void zzd(zzbs zzbsVar) {
        this.zzc.set(zzbsVar);
    }

    public final void zze(Activity activity, final b.a aVar) {
        zzcz.zza();
        zzj zzjVarZzb = zza.zza(activity).zzb();
        if (zzjVarZzb == null) {
            zzcz.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(new zzg(1, "No consentInformation.").zza());
                }
            });
            return;
        }
        if (!zzjVarZzb.isConsentFormAvailable() && zzjVarZzb.getPrivacyOptionsRequirementStatus() != c.EnumC0792c.NOT_REQUIRED) {
            zzcz.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(new zzg(3, "No valid response received yet.").zza());
                }
            });
            zzjVarZzb.zza(activity);
        } else {
            if (zzjVarZzb.getPrivacyOptionsRequirementStatus() == c.EnumC0792c.NOT_REQUIRED) {
                zzcz.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(new zzg(3, "Privacy options form is not required.").zza());
                    }
                });
                return;
            }
            b bVar = (b) this.zzd.get();
            if (bVar == null) {
                zzcz.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(new zzg(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
            } else {
                bVar.show(activity, aVar);
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
