package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MediationConfiguration {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
    private final AdFormat zza;
    private final Bundle zzb;

    public MediationConfiguration(AdFormat adFormat, Bundle bundle) {
        this.zza = adFormat;
        this.zzb = bundle;
    }

    public AdFormat getFormat() {
        return this.zza;
    }

    public Bundle getServerParameters() {
        return this.zzb;
    }
}
