package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzift implements zzigh {
    private final zzifp zza;
    private final zzigt zzb;
    private final boolean zzc;
    private final zzidp zzd;

    private zzift(zzigt zzigtVar, zzidp zzidpVar, zzifp zzifpVar) {
        this.zzb = zzigtVar;
        this.zzc = zzifpVar instanceof zziea;
        this.zzd = zzidpVar;
        this.zza = zzifpVar;
    }

    static zzift zzh(zzigt zzigtVar, zzidp zzidpVar, zzifp zzifpVar) {
        return new zzift(zzigtVar, zzidpVar, zzifpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final Object zza() {
        zzifp zzifpVar = this.zza;
        return zzifpVar instanceof zziee ? ((zziee) zzifpVar).zzbg() : zzifpVar.zzcY().zzbt();
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final boolean zzb(Object obj, Object obj2) {
        if (!((zziee) obj).zzt.equals(((zziee) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zziea) obj).zza.equals(((zziea) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final int zzc(Object obj) {
        int iHashCode = ((zziee) obj).zzt.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zziea) obj).zza.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzd(Object obj, Object obj2) {
        zzigi.zzI(this.zzb, obj, obj2);
        if (this.zzc) {
            zzigi.zzH(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final int zze(Object obj) {
        int iZzh = ((zziee) obj).zzt.zzh();
        return this.zzc ? iZzh + ((zziea) obj).zza.zzg() : iZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzf(Object obj, zzihi zzihiVar) {
        Iterator itZzc = ((zziea) obj).zza.zzc();
        while (itZzc.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzc.next();
            zzids zzidsVar = (zzids) entry.getKey();
            if (zzidsVar.zzc() != zzihh.MESSAGE || zzidsVar.zzd() || zzidsVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zziew) {
                zzihiVar.zzv(zzidsVar.zza(), ((zziew) entry).zza().zzc());
            } else {
                zzihiVar.zzv(zzidsVar.zza(), entry.getValue());
            }
        }
        ((zziee) obj).zzt.zzf(zzihiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzg(Object obj, zzigc zzigcVar, zzido zzidoVar) {
        this.zzb.zzh(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzj(Object obj, byte[] bArr, int i10, int i11, zzico zzicoVar) {
        zziee zzieeVar = (zziee) obj;
        if (zzieeVar.zzt == zzigu.zza()) {
            zzieeVar.zzt = zzigu.zzb();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzk(Object obj) {
        this.zzb.zzj(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final boolean zzl(Object obj) {
        return ((zziea) obj).zza.zze();
    }
}
