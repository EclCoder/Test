package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcyb implements zzepe {
    public final List zza;

    public zzcyb(List list) {
        this.zza = list;
    }

    public static zzels zza(zzeny zzenyVar) {
        return new zzelt(zzenyVar, zzcya.zza);
    }

    public static zzels zzb(zzels zzelsVar) {
        return new zzelt(zzelsVar, zzcxz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzepe
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzhbw.zzr((ListenableFuture) it.next(), new zzcxy(this), zzhcn.zza());
        }
    }

    public zzcyb(zzcxt zzcxtVar) {
        this.zza = Collections.singletonList(zzhbw.zza(zzcxtVar));
    }
}
