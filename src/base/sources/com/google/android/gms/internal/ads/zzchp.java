package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzchp implements Runnable {
    private final zzchb zza;
    private boolean zzb = false;

    zzchp(zzchb zzchbVar) {
        this.zza = zzchbVar;
    }

    private final void zzc() {
        zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzgamVar.removeCallbacks(this);
        zzgamVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzF();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzF();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
