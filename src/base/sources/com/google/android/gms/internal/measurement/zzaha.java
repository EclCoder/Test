package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaha implements zzagz {

    @Deprecated
    public static final zzom zza;

    @Deprecated
    public static final zzom zzb;

    static {
        zzog zzogVarZzc = zzagr.zzc();
        zza = zzogVarZzc.zza("measurement.set_default_event_parameters.fix_app_update_logging", true);
        zzb = zzogVarZzc.zza("measurement.set_default_event_parameters.fix_service_request_ordering", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzagz
    public final boolean zza() {
        return ((Boolean) zza.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagz
    public final boolean zzb() {
        return ((Boolean) zzb.get()).booleanValue();
    }
}
