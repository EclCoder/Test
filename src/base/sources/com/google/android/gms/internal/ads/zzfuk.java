package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfuk {
    public static zzfuk zze(zzful zzfulVar, zzfum zzfumVar) {
        zzfwi.zza();
        return new zzfuo(zzfulVar, zzfumVar, UUID.randomUUID().toString());
    }

    public abstract void zza();

    public abstract void zzb(View view);

    public abstract void zzc();

    public abstract void zzd(View view, zzfur zzfurVar, String str);
}
