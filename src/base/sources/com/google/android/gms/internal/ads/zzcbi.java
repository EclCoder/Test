package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcbi implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcbk zzb;

    zzcbi(zzcbk zzcbkVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzcbkVar);
        this.zzb = zzcbkVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzcbh zzcbhVarZza;
        zzcbk zzcbkVar = this.zzb;
        WeakHashMap weakHashMapZzb = zzcbkVar.zzb();
        Context context = this.zza;
        zzcbj zzcbjVar = (zzcbj) weakHashMapZzb.get(context);
        if (zzcbjVar != null) {
            if (zzcbjVar.zza + ((Long) zzbkf.zzd.zze()).longValue() < com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) {
                zzcbhVarZza = new zzcbg(context).zza();
            } else {
                zzcbhVarZza = new zzcbg(context, zzcbjVar.zzb).zza();
            }
        } else {
            zzcbhVarZza = new zzcbg(context).zza();
        }
        zzcbkVar.zzb().put(context, new zzcbj(zzcbkVar, zzcbhVarZza));
        return zzcbhVarZza;
    }
}
