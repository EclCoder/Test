package com.google.android.gms.measurement.internal;

import com.google.firebase.installations.ktx.gUsI.dmHT;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzg extends zzf {
    private boolean zza;

    zzg(zzic zzicVar) {
        super(zzicVar);
        this.zzu.zzF();
    }

    final boolean zza() {
        return this.zza;
    }

    protected final void zzb() {
        if (!zza()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzc() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zze()) {
            return;
        }
        this.zzu.zzG();
        this.zza = true;
    }

    protected abstract boolean zze();

    protected void zzf() {
    }

    public final void zzd() {
        if (this.zza) {
            throw new IllegalStateException(dmHT.NKzhbLgLCavA);
        }
        zzf();
        this.zzu.zzG();
        this.zza = true;
    }
}
