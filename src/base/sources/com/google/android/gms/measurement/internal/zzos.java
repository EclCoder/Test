package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzos extends zzol {
    private boolean zza;

    zzos(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzg.zzaf();
    }

    final boolean zzax() {
        return this.zza;
    }

    protected final void zzay() {
        if (!zzax()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzaz() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzbc();
        this.zzg.zzag();
        this.zza = true;
    }

    protected abstract boolean zzbc();
}
