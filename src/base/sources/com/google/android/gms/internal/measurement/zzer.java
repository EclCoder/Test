package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzer extends zzeo {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ Activity zzb;
    final /* synthetic */ zzey zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzer(zzey zzeyVar, Bundle bundle, Activity activity) {
        super(zzeyVar.zza, true);
        this.zza = bundle;
        this.zzb = activity;
        Objects.requireNonNull(zzeyVar);
        this.zzc = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    final void zza() {
        Bundle bundle;
        Bundle bundle2 = this.zza;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzcp zzcpVar = (zzcp) Preconditions.checkNotNull(this.zzc.zza.zzS());
        Activity activity = this.zzb;
        zzcpVar.onActivityCreatedByScionActivityInfo(zzdd.zza(activity), bundle, this.zzj);
    }
}
