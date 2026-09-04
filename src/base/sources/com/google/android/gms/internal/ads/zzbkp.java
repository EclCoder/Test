package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbkp {
    public static final zzbka zza = new zzbka("gads:gma_attestation:click:macro_string", "@click_attok@", 4);
    public static final zzbka zzb = new zzbka("gads:gma_attestation:click:query_param", "attok", 4);
    public static final zzbka zzc = zzbka.zzb("gads:gma_attestation:click:timeout", 2000);
    public static final zzbka zzd = zzbka.zza("gads:gma_attestation:click:enable", false);
    public static final zzbka zze = zzbka.zzb("gads:gma_attestation:click:enable_dynamite_version", Long.MAX_VALUE);
    public static final zzbka zzf = zzbka.zza("gads:gma_attestation:click:qualification:enable", true);
    public static final zzbka zzg = zzbka.zza("gads:gma_attestation:image_hash", false);
    public static final zzbka zzh = zzbka.zza("gads:gma_attestation:impression:enable", false);
    public static final zzbka zzi;

    static {
        zzbka.zza("gads:gma_attestation:request:enable_javascript", false);
        zzbka.zza("gads:gma_attestation:request:enable", true);
        zzi = zzbka.zza("gads:gma_attestation:click:report_error", true);
    }
}
