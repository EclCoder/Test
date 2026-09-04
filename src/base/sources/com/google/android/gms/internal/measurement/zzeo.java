package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzeo implements Runnable {
    final long zzi;
    final long zzj;
    final boolean zzk;
    final /* synthetic */ zzez zzl;

    zzeo(zzez zzezVar, boolean z10) {
        Objects.requireNonNull(zzezVar);
        this.zzl = zzezVar;
        this.zzi = zzezVar.zza.currentTimeMillis();
        this.zzj = zzezVar.zza.elapsedRealtime();
        this.zzk = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzl.zzR()) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e10) {
            this.zzl.zzN(e10, false, this.zzk);
            zzb();
        }
    }

    abstract void zza();

    protected void zzb() {
    }
}
