package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfkc extends zzcbr {
    private final zzfjs zza;
    private final zzfjj zzb;
    private final zzfkr zzc;
    private zzdvm zzd;
    private boolean zze = false;

    public zzfkc(zzfjs zzfjsVar, zzfjj zzfjjVar, zzfkr zzfkrVar) {
        this.zza = zzfjsVar;
        this.zzb = zzfjjVar;
        this.zzc = zzfkrVar;
    }

    private final synchronized boolean zzy() {
        zzdvm zzdvmVar = this.zzd;
        return (zzdvmVar == null || zzdvmVar.zze()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgy)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzcbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzcbw r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbih r1 = com.google.android.gms.internal.ads.zzbiq.zzgw     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L62
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzcfd r2 = com.google.android.gms.ads.internal.zzt.zzh()     // Catch: java.lang.Throwable -> L20
            r2.zzg(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzbih r0 = com.google.android.gms.internal.ads.zzbiq.zzgy     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.zzfjl r0 = new com.google.android.gms.internal.ads.zzfjl     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.zzd = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfjs r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzm r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfka r3 = new com.google.android.gms.internal.ads.zzfka     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.zza(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkc.zzb(com.google.android.gms.internal.ads.zzcbw):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzc() {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzd(zzcbv zzcbvVar) {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzcbvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final boolean zze() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzh() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized String zzl() {
        zzdvm zzdvmVar = this.zzd;
        if (zzdvmVar == null || zzdvmVar.zzn() == null) {
            return null;
        }
        return zzdvmVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzm(String str) {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzn(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfkb(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final Bundle zzo() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdvm zzdvmVar = this.zzd;
        return zzdvmVar != null ? zzdvmVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) {
        try {
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (iObjectWrapper != null) {
                    Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                    if (objUnwrap instanceof Activity) {
                        activity = (Activity) objUnwrap;
                    }
                }
                this.zzd.zza(this.zze, activity);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzq(String str) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzr(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final boolean zzs() {
        zzdvm zzdvmVar = this.zzd;
        return zzdvmVar != null && zzdvmVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzt() {
        zzdvm zzdvmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhI)).booleanValue() && (zzdvmVar = this.zzd) != null) {
            return zzdvmVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzu(zzcbq zzcbqVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzq(zzcbqVar);
    }

    final /* synthetic */ zzfkr zzv() {
        return this.zzc;
    }

    final /* synthetic */ zzdvm zzw() {
        return this.zzd;
    }

    final /* synthetic */ void zzx(zzdvm zzdvmVar) {
        this.zzd = zzdvmVar;
    }
}
