package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbkv {
    public static final zzbka zza = zzbka.zza("gads:delegating_web_view_client_recursion_detection:enabled", false);
    public static final zzbka zzb = zzbka.zza("gads:paw_app_signals:document_start_js:enabled", false);
    public static final zzbka zzc = zzbka.zza("gads:paw_app_signals:enabled", false);
    public static final zzbka zzd = zzbka.zza("gads:paw_delegate_web_view_client:enabled", false);
    public static final zzbka zze = zzbka.zza("gads:paw_cache:enabled", false);
    public static final zzbka zzf = zzbka.zzb("gads:paw_cache:refresh_interval_seconds", 30);
    public static final zzbka zzg = zzbka.zzb("gads:paw_cache:retry_delay_seconds", 10);
    public static final zzbka zzh = zzbka.zzb("gads:paw_cache:ttl_ms", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
}
