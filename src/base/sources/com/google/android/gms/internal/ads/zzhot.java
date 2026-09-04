package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhot {
    public static final zzhot zza = new zzhot("SHA1");
    public static final zzhot zzb = new zzhot("SHA224");
    public static final zzhot zzc = new zzhot("SHA256");
    public static final zzhot zzd = new zzhot("SHA384");
    public static final zzhot zze = new zzhot("SHA512");
    private final String zzf;

    private zzhot(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
