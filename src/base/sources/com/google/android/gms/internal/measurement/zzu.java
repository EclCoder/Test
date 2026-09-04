package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzu extends zzai {
    private final Callable zza;

    public zzu(String str, Callable callable) {
        super("internal.appMetadata");
        this.zza = callable;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        try {
            return zzi.zza(this.zza.call());
        } catch (Exception unused) {
            return zzao.zzf;
        }
    }
}
