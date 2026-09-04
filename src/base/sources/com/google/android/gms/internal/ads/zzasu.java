package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzasu implements Runnable {
    private final zzate zza;
    private final zzatk zzb;
    private final Runnable zzc;

    public zzasu(zzate zzateVar, zzatk zzatkVar, Runnable runnable) {
        this.zza = zzateVar;
        this.zzb = zzatkVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzate zzateVar = this.zza;
        zzateVar.zzl();
        zzatk zzatkVar = this.zzb;
        if (zzatkVar.zzc()) {
            zzateVar.zzs(zzatkVar.zza);
        } else {
            zzateVar.zzt(zzatkVar.zzc);
        }
        if (zzatkVar.zzd) {
            zzateVar.zzc("intermediate-response");
        } else {
            zzateVar.zzd("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
