package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgcq extends zzhap {
    Object zza;

    zzgcq(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final boolean zza(Object obj) {
        return super.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final boolean zzb(Throwable th2) {
        return super.zzb(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final void zzc() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final String zzd() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }
}
