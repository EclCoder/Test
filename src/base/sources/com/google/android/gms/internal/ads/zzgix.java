package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgix implements zzgiw {
    private final String zza;
    private final String zzb;
    private final zzght zzc;
    private final zzaxm zzd;
    private final zzgqf zze;

    public zzgix(String str, String str2, zzaxm zzaxmVar, zzght zzghtVar, zzgqf zzgqfVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = zzaxmVar;
        this.zzc = zzghtVar;
        this.zze = zzgqfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            this.zze.zza();
            Method methodZzc = this.zzc.zzc(this.zza, this.zzb);
            if (methodZzc != null) {
                zza(methodZzc, this.zzd);
            }
            this.zze.zzc();
            return null;
        } catch (Throwable th2) {
            try {
                this.zze.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                this.zze.zzc();
                throw th3;
            }
        }
    }

    protected abstract void zza(Method method, zzaxm zzaxmVar);
}
