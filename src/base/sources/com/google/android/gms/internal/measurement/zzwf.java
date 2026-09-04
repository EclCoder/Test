package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzwf extends zzvt implements zzvs {
    private final Exception zza;
    private final boolean zzb;

    zzwf(String str, zzvs zzvsVar, zzwl zzwlVar, boolean z10, zzwq zzwqVar) {
        super("<missing root>:".concat(str), zzvsVar, zzwl.zza(zzwlVar, zzwk.zzb), zzwqVar);
        this.zza = zzvsVar.zzf();
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final Exception zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final zzws zzg(String str, zzwl zzwlVar, boolean z10, zzwq zzwqVar) {
        if (z10 && !this.zzb) {
            int i10 = zzvy.zzb;
        }
        boolean z11 = true;
        if ((!z10 || this.zzb) && !this.zzb) {
            z11 = false;
        }
        return new zzwf(str, this, zzwlVar, z11, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzj(String str, String str2, String str3, int i10, zzwl zzwlVar, zzwq zzwqVar) {
        int i11 = zzvy.zzb;
        return zzg(str, zzwlVar, true, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final long zzk() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        return zzwk.zza;
    }

    zzwf(UUID uuid, String str, String str2, zzwl zzwlVar, Exception exc, boolean z10, boolean z11, zzwq zzwqVar) {
        super("<missing root>:".concat(str2), uuid, str, zzwl.zza(zzwlVar, zzwk.zzb), zzwqVar);
        this.zza = exc;
        this.zzb = false;
    }
}
