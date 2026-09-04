package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhcl extends zzhap.zzf implements Runnable {
    private final Runnable zza;

    zzhcl(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th2) {
            zzb(th2);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final String zzd() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 7);
        sb2.append("task=[");
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
