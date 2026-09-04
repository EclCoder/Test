package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class AuthProxyOptions implements Api.ApiOptions.Optional {
    public static final AuthProxyOptions zza = new AuthProxyOptions(new Bundle(), null);
    private final Bundle zzb;

    /* synthetic */ AuthProxyOptions(Bundle bundle, zzb zzbVar) {
        this.zzb = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AuthProxyOptions) {
            return Objects.checkBundlesEquality(this.zzb, ((AuthProxyOptions) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb);
    }

    public final Bundle zza() {
        return new Bundle(this.zzb);
    }
}
