package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzepm {
    private zzepd zza;

    zzepm() {
    }

    public static zzepm zza(zzepd zzepdVar) {
        return new zzepm(zzepdVar);
    }

    public final zzepd zzb(Clock clock, zzepf zzepfVar, zzelx zzelxVar, zzfsc zzfscVar) {
        zzepd zzepdVar = this.zza;
        return zzepdVar != null ? zzepdVar : new zzepd(clock, zzepfVar, zzelxVar, zzfscVar);
    }

    private zzepm(zzepd zzepdVar) {
        this.zza = zzepdVar;
    }
}
