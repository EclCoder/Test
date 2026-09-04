package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhmb {
    private HashMap zza = new HashMap();

    public final zzhmc zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzhmc zzhmcVar = new zzhmc(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzhmcVar;
    }
}
