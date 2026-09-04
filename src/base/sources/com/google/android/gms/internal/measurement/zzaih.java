package com.google.android.gms.internal.measurement;

import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaih implements zzaig {
    private static final zzpo zza = new zzpo(zzagr.zzc(), 11);

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzb() {
        return ((Boolean) zza.zza(1, "measurement.rb.attribution.client2", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzc() {
        return ((Boolean) zza.zza(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzd() {
        return ((Boolean) zza.zza(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zze() {
        return ((Boolean) zza.zza(6, "measurement.rb.attribution.service", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzf() {
        return ((Boolean) zza.zza(7, "measurement.rb.attribution.enable_trigger_redaction", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaig
    public final boolean zzg() {
        return ((Boolean) zza.zza(8, mTFeqtajA.iWRHEzuZwcD, true).get()).booleanValue();
    }
}
