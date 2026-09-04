package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzec {
    public final Object zza;
    private zzr zzb = new zzr();
    private boolean zzc;
    private boolean zzd;

    public zzec(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzec.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzec) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i10, zzea zzeaVar) {
        if (this.zzd) {
            return;
        }
        if (i10 != -1) {
            this.zzb.zza(i10);
        }
        this.zzc = true;
        zzeaVar.zza(this.zza);
    }

    public final void zzb(zzeb zzebVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzs zzsVarZzb = this.zzb.zzb();
        this.zzb = new zzr();
        this.zzc = false;
        zzebVar.zza(this.zza, zzsVarZzb);
    }

    final /* synthetic */ void zzc(zzeb zzebVar) {
        this.zzd = true;
        if (zzebVar == null || !this.zzc) {
            return;
        }
        this.zzc = false;
        zzebVar.zza(this.zza, this.zzb.zzb());
    }
}
