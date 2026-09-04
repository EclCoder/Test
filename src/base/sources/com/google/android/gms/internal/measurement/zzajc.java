package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajc implements zzajb {

    @Deprecated
    public static final zzom zza = zzagr.zzc().zza("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zzajb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzajb
    public final boolean zzb() {
        return ((Boolean) zza.get()).booleanValue();
    }
}
