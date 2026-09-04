package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbs implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzfkq zzc;
    private final zzfkf zzd;
    private final Clock zze;
    private final zzdzl zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();
    final zzfrc zza = zzfrd.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    zzdbs(zzfkq zzfkqVar, zzfkf zzfkfVar, Clock clock, zzdzl zzdzlVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfkqVar;
        this.zzd = zzfkfVar;
        this.zze = clock;
        this.zzf = zzdzlVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            try {
                zzdzl zzdzlVar = this.zzf;
                String str = this.zzc.zzb.zzb.zzb;
                String strEncodeToString = Base64.encodeToString(((zzfrd) this.zza.zzbu()).zzaN(), 1);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoq)).booleanValue()) {
                    zzdzk zzdzkVarZza = zzdzlVar.zza();
                    zzdzkVarZza.zzc("action", "pclma");
                    zzdzkVarZza.zzc("pclmd", strEncodeToString);
                    zzdzkVarZza.zzc("gqi", str);
                    zzdzkVarZza.zzf();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzo(int i10) {
        synchronized (this.zzb) {
            try {
                if (!this.zzi && this.zzh) {
                    zzfrc zzfrcVar = this.zza;
                    zzfpu zzfpuVarZza = zzfpv.zza();
                    zzfpuVarZza.zzb(i10);
                    zzfpuVarZza.zza(this.zze.currentTimeMillis());
                    zzfrcVar.zza((zzfpv) zzfpuVarZza.zzbu());
                    if (i10 == 10) {
                        zzn();
                        this.zzi = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzo(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzo(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzo(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzo(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        zzo(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        zzo(10);
    }

    public final void zzl() {
        synchronized (this.zzb) {
            int i10 = this.zzd.zzaE;
            if (i10 > 0 && !this.zzh) {
                this.zza.zzb(this.zze.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzm();
                    }
                }, i10, TimeUnit.MILLISECONDS);
            }
        }
    }

    final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            try {
                if (this.zzi) {
                    return;
                }
                this.zzi = true;
                zzn();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i10) {
    }
}
