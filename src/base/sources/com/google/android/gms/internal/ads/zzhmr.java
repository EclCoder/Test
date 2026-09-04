package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhmr {
    private static final zzhmr zza = (zzhmr) zzhny.zza(zzhmq.zza);
    private final AtomicReference zzb = new AtomicReference(new zzhnw(new zzhnt(), null));

    public static zzhmr zza() {
        return zza;
    }

    public final synchronized void zzb(zzhlu zzhluVar) {
        AtomicReference atomicReference = this.zzb;
        zzhnt zzhntVar = new zzhnt((zzhnw) atomicReference.get());
        zzhntVar.zza(zzhluVar);
        atomicReference.set(new zzhnw(zzhntVar, null));
    }

    public final synchronized void zzc(zzhlr zzhlrVar) {
        AtomicReference atomicReference = this.zzb;
        zzhnt zzhntVar = new zzhnt((zzhnw) atomicReference.get());
        zzhntVar.zzb(zzhlrVar);
        atomicReference.set(new zzhnw(zzhntVar, null));
    }

    public final synchronized void zzd(zzhmy zzhmyVar) {
        AtomicReference atomicReference = this.zzb;
        zzhnt zzhntVar = new zzhnt((zzhnw) atomicReference.get());
        zzhntVar.zzc(zzhmyVar);
        atomicReference.set(new zzhnw(zzhntVar, null));
    }

    public final synchronized void zze(zzhmv zzhmvVar) {
        AtomicReference atomicReference = this.zzb;
        zzhnt zzhntVar = new zzhnt((zzhnw) atomicReference.get());
        zzhntVar.zzd(zzhmvVar);
        atomicReference.set(new zzhnw(zzhntVar, null));
    }

    public final boolean zzf(zzhns zzhnsVar) {
        return ((zzhnw) this.zzb.get()).zza(zzhnsVar);
    }

    public final zzhdq zzg(zzhns zzhnsVar, zzhel zzhelVar) {
        return ((zzhnw) this.zzb.get()).zzb(zzhnsVar, zzhelVar);
    }

    public final zzhns zzh(zzhdq zzhdqVar, Class cls, zzhel zzhelVar) {
        return ((zzhnw) this.zzb.get()).zzc(zzhdqVar, cls, zzhelVar);
    }

    public final boolean zzi(zzhns zzhnsVar) {
        return ((zzhnw) this.zzb.get()).zzd(zzhnsVar);
    }

    public final zzheh zzj(zzhns zzhnsVar) {
        return ((zzhnw) this.zzb.get()).zze(zzhnsVar);
    }

    public final zzhns zzk(zzheh zzhehVar, Class cls) {
        return ((zzhnw) this.zzb.get()).zzf(zzhehVar, cls);
    }
}
