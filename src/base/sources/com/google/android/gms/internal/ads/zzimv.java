package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimv implements zzimu, zzimo {
    private static final zzimv zza = new zzimv(null);
    private final Object zzb;

    private zzimv(Object obj) {
        this.zzb = obj;
    }

    public static zzimu zza(Object obj) {
        zzinc.zza(obj, "instance cannot be null");
        return new zzimv(obj);
    }

    public static zzimu zzc(Object obj) {
        return obj == null ? zza : new zzimv(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final Object zzb() {
        return this.zzb;
    }
}
