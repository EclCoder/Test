package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbko {
    public static final zzbka zza = zzbka.zza("gads:init:init_on_bg_thread", true);
    public static final zzbka zzb = zzbka.zza("gads:init:init_on_single_bg_thread", false);
    public static final zzbka zzc = zzbka.zza("gads:adloader_load_bg_thread", true);
    public static final zzbka zzd = zzbka.zza("gads:appopen_load_on_bg_thread", true);
    public static final zzbka zze = zzbka.zza("gads:banner_destroy_bg_thread", false);
    public static final zzbka zzf = zzbka.zza("gads:banner_load_bg_thread", true);
    public static final zzbka zzg = zzbka.zza("gads:banner_pause_bg_thread", false);
    public static final zzbka zzh = zzbka.zza("gads:banner_resume_bg_thread", false);
    public static final zzbka zzi = zzbka.zza("gads:interstitial_load_on_bg_thread", true);
    public static final zzbka zzj;
    public static final zzbka zzk;

    static {
        zzbka.zza("gads:persist_flags_on_bg_thread", true);
        zzj = zzbka.zza("gads:query_info_bg_thread", true);
        zzk = zzbka.zza("gads:rewarded_load_bg_thread", true);
    }
}
