package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class RtbSignalData {
    private final Context zza;
    private final List zzb;
    private final Bundle zzc;
    private final AdSize zzd;

    public RtbSignalData(Context context, List<MediationConfiguration> list, Bundle bundle, AdSize adSize) {
        this.zza = context;
        this.zzb = list;
        this.zzc = bundle;
        this.zzd = adSize;
    }

    public AdSize getAdSize() {
        return this.zzd;
    }

    public List<MediationConfiguration> getConfigurations() {
        return this.zzb;
    }

    public Context getContext() {
        return this.zza;
    }

    public Bundle getNetworkExtras() {
        return this.zzc;
    }
}
