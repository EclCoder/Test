package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class zzny extends zzof {
    private volatile boolean zza;

    zzny(String str, String str2, zzph zzphVar) {
        super("com.google.android.gms.measurement", str2, zzphVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    protected final /* synthetic */ Object zzc(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    protected final /* synthetic */ Object zzd(Object obj) {
        return (Boolean) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final /* synthetic */ Object zze() {
        return Boolean.valueOf(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final /* synthetic */ void zzh(Object obj) {
        this.zza = ((Boolean) obj).booleanValue();
    }
}
