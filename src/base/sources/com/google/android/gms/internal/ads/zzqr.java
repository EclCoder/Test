package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqr {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzqr zza(boolean z10) {
        this.zza = z10;
        return this;
    }

    public final zzqr zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzqr zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzqs zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqs(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    final /* synthetic */ boolean zze() {
        return this.zza;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
