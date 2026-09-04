package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeiz {
    private final zzeiv zza;
    private final zzhcg zzb;

    public zzeiz(zzeiv zzeivVar, zzhcg zzhcgVar) {
        this.zza = zzeivVar;
        this.zzb = zzhcgVar;
    }

    public final void zza(zzfok zzfokVar) {
        final zzeiv zzeivVar = this.zza;
        Objects.requireNonNull(zzeivVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzeiy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeivVar.getWritableDatabase();
            }
        };
        zzhcg zzhcgVar = this.zzb;
        zzhbw.zzr(zzhcgVar.submit(callable), new zzeix(this, zzfokVar), zzhcgVar);
    }
}
