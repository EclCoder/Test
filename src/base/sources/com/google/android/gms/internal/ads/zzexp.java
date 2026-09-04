package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzexp implements zzimu {
    public static zzexp zza() {
        return zzexo.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbih zzbihVar = zzbiq.zznj;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).split(","));
        }
        zzinc.zzb(arrayList);
        return arrayList;
    }
}
