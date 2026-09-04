package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdbp implements zzdef, zzddm {
    private final zzfkf zza;

    public zzdbp(Context context, zzfkf zzfkfVar, zzbzg zzbzgVar) {
        this.zza = zzfkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        zzbzh zzbzhVar = this.zza.zzad;
        if (zzbzhVar == null || !zzbzhVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbzhVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zza(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzb(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzc(Context context) {
    }
}
