package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnc {
    private static final zziaz zza = zziaz.zza(new byte[0]);
    private final Map zzb;

    public final Iterable zza(byte[] bArr) {
        Map map = this.zzb;
        List list = (List) map.get(zza);
        List list2 = bArr.length >= 5 ? (List) map.get(zziaz.zzb(bArr, 0, 5)) : null;
        if (list == null && list2 == null) {
            return new ArrayList();
        }
        if (list == null) {
            return list2;
        }
        return list2 == null ? list : new zzhmz(this, list2, list);
    }
}
