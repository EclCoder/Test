package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhlh {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzhlh() {
    }

    public final zzhlh zza(Enum r10, Object obj) {
        this.zza.put(r10, obj);
        this.zzb.put(obj, r10);
        return this;
    }

    public final zzhli zzb() {
        return new zzhli(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    /* synthetic */ zzhlh(byte[] bArr) {
    }
}
