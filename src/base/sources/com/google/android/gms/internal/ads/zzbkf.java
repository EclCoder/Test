package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbkf {
    public static final zzbka zza = zzbka.zzb("gads:app_permissions_caching_expiry_ms:expiry", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    public static final zzbka zzb = zzbka.zzb("gads:audio_caching_expiry_ms:expiry", 5000);
    public static final zzbka zzc = zzbka.zzb("gads:battery_caching_expiry_ms:expiry", 10000);
    public static final zzbka zzd = zzbka.zzb("gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final zzbka zze = zzbka.zzb("gads:hsdp_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);
    public static final zzbka zzf = zzbka.zzb("gads:memory_caching_expiry_ms:expiry", 5000);
    public static final zzbka zzg = zzbka.zzb("gads:sdk_environment_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);
    public static final zzbka zzh = zzbka.zzb("gads:telephony_caching_expiry_ms:expiry", 5000);
}
