package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzasb {
    private final Bundle zza;

    public zzasb(Bundle bundle) {
        this.zza = bundle;
    }

    public final String zza() {
        return this.zza.getString("install_referrer");
    }

    public final long zzb() {
        return this.zza.getLong("referrer_click_timestamp_seconds");
    }

    public final long zzc() {
        return this.zza.getLong("install_begin_timestamp_seconds");
    }

    public final boolean zzd() {
        return this.zza.getBoolean("google_play_instant");
    }

    public final long zze() {
        return this.zza.getLong("referrer_click_timestamp_server_seconds");
    }

    public final long zzf() {
        return this.zza.getLong("install_begin_timestamp_server_seconds");
    }

    public final String zzg() {
        return this.zza.getString("install_version");
    }
}
