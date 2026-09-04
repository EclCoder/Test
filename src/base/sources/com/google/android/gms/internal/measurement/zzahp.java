package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzahp implements zzaho {

    @Deprecated
    public static final zzom zza;

    @Deprecated
    public static final zzom zzb;

    @Deprecated
    public static final zzom zzc;

    static {
        zzog zzogVarZzc = zzagr.zzc();
        zza = zzogVarZzc.zza("measurement.audience.refresh_event_count_filters_timestamp", false);
        zzb = zzogVarZzc.zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        zzc = zzogVarZzc.zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzb() {
        return ((Boolean) zza.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzc() {
        return ((Boolean) zzb.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzd() {
        return ((Boolean) zzc.get()).booleanValue();
    }
}
