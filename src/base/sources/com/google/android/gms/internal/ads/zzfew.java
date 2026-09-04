package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfew implements zzimu {
    public static zzfcn zza(Context context, zzces zzcesVar, zzcet zzcetVar, Object obj, zzfdp zzfdpVar, zzfej zzfejVar, zzimo zzimoVar, zzimo zzimoVar2, zzimo zzimoVar3, zzimo zzimoVar4, zzimo zzimoVar5, zzimo zzimoVar6, zzimo zzimoVar7, Executor executor, zzfqg zzfqgVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzfec) obj);
        hashSet.add(zzfdpVar);
        hashSet.add(zzfejVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgM)).booleanValue()) {
            hashSet.add((zzfck) zzimoVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgN)).booleanValue()) {
            hashSet.add((zzfck) zzimoVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgP)).booleanValue()) {
            hashSet.add((zzfck) zzimoVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgQ)).booleanValue()) {
            hashSet.add((zzfck) zzimoVar5.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdV)).booleanValue()) {
            hashSet.add((zzfck) zzimoVar7.zzb());
        }
        return new zzfcn(context, executor, hashSet, zzfqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
