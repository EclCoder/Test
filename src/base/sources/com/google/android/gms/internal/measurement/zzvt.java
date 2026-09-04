package com.google.android.gms.internal.measurement;

import java.util.UUID;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzvt extends zzvn {
    private final zzwl zza;

    zzvt(String str, zzws zzwsVar, zzwl zzwlVar, zzwq zzwqVar) {
        super(str, zzwsVar, zzwqVar);
        p.d(zzwlVar.zze());
        this.zza = zzwlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzh() {
        return zzwl.zza(this.zza, zzl());
    }

    zzvt(String str, UUID uuid, String str2, zzwl zzwlVar, zzwq zzwqVar) {
        super(str, uuid, str2, zzwqVar);
        p.d(zzwlVar.zze());
        this.zza = zzwlVar;
    }
}
