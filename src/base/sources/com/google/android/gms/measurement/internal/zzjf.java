package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzjf extends zzje {
    private boolean zza;

    zzjf(zzic zzicVar) {
        super(zzicVar);
        this.zzu.zzF();
    }

    protected abstract boolean zza();

    final boolean zzv() {
        return this.zza;
    }

    protected final void zzw() {
        if (!zzv()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzx() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zza()) {
            return;
        }
        this.zzu.zzG();
        this.zza = true;
    }

    public final void zzy() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzbb();
        this.zzu.zzG();
        this.zza = true;
    }

    protected void zzbb() {
    }
}
