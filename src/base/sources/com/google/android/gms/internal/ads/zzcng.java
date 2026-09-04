package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcng {
    private String zza;
    private zziht zzb;
    private zzilq zzc;
    private final ScheduledExecutorService zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    zzcng(zzcmt zzcmtVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            String strI = x4.g.a("GET_VARIATIONS_HEADER") ? x4.f.i() : null;
            if (strI != null && !strI.isEmpty()) {
                this.zza = strI;
                byte[] bArrDecode = Base64.decode(strI, 10);
                this.zzb = zziht.zzc(bArrDecode, zzido.zzb());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzki)).booleanValue()) {
                    this.zzc = zzilq.zzc(bArrDecode, zzido.zzb());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkg)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkf)).booleanValue()) {
                        this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnf
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze();
                            }
                        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkh)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zziet e10) {
            e = e10;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        } catch (IllegalArgumentException e11) {
            e = e11;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkf)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    public final String zzb() {
        zzilq zzilqVar = this.zzc;
        if (zzilqVar != null) {
            return Base64.encodeToString(zzilqVar.zzaN(), 10);
        }
        return null;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zziht zzd() {
        return this.zzb;
    }
}
