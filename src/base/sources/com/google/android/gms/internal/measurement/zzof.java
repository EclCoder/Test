package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzof extends zznp implements zznw {
    private volatile int zza;
    private zzps zzb;

    zzof(String str, String str2, zzph zzphVar) {
        super("com.google.android.gms.measurement", str2, zzphVar);
        this.zza = -1;
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    protected final Object zzb(zzlk zzlkVar) {
        return zzaA(this, zzlkVar, "");
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final int zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final zzps zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final void zzi(int i10) {
        this.zza = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final void zzj(zzps zzpsVar) {
        this.zzb = zzpsVar;
    }
}
