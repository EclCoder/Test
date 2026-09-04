package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcdw implements zzbeq {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzcdw(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final void zza(boolean z10) {
        zzcdz zzcdzVarZzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.zza;
        if (zzcdzVarZzD.zza(context)) {
            synchronized (this.zzb) {
                try {
                    if (this.zzd == z10) {
                        return;
                    }
                    this.zzd = z10;
                    String str = this.zzc;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.zzd) {
                        com.google.android.gms.ads.internal.zzt.zzD().zzd(context, str);
                    } else {
                        com.google.android.gms.ads.internal.zzt.zzD().zze(context, str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final void zzdj(zzbep zzbepVar) {
        zza(zzbepVar.zzj);
    }
}
