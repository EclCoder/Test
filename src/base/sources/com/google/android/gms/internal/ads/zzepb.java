package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzepb implements zzhbt {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfki zzb;
    final /* synthetic */ zzfkf zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfry zze;
    final /* synthetic */ zzfkq zzf;
    final /* synthetic */ zzepd zzg;

    zzepb(zzepd zzepdVar, long j10, zzfki zzfkiVar, zzfkf zzfkfVar, String str, zzfry zzfryVar, zzfkq zzfkqVar) {
        this.zza = j10;
        this.zzb = zzfkiVar;
        this.zzc = zzfkfVar;
        this.zzd = str;
        this.zze = zzfryVar;
        this.zzf = zzfkqVar;
        Objects.requireNonNull(zzepdVar);
        this.zzg = zzepdVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006a A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0096 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1 A[Catch: all -> 0x007c, DONT_GENERATE, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:39:0x0080, B:40:0x0084, B:42:0x0096, B:43:0x00ab, B:45:0x00b1, B:47:0x00b3, B:55:0x00eb, B:56:0x00f2, B:50:0x00d0, B:52:0x00d4, B:54:0x00de), top: B:60:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        int i10;
        int i11;
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        Integer numValueOf;
        com.google.android.gms.ads.internal.client.zze zzeVarZza;
        int i12;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzepd zzepdVar = this.zzg;
        long jElapsedRealtime = zzepdVar.zzj().elapsedRealtime() - this.zza;
        if (!(th2 instanceof TimeoutException)) {
            if (th2 instanceof zzeol) {
                i10 = 3;
            } else if (th2 instanceof CancellationException) {
                i11 = 4;
            } else {
                if (!(th2 instanceof zzflf)) {
                    if (th2 instanceof zzeed) {
                        i11 = zzfma.zza(th2).zza == 3 ? 1 : 6;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcn)).booleanValue() && (th2 instanceof zzelw) && (zzeVarZzb = ((zzelw) th2).zzb()) != null) {
                            numValueOf = Integer.valueOf(zzeVarZzb.zza);
                            i10 = i11;
                        }
                    } else {
                        i10 = 6;
                    }
                    synchronized (zzepdVar) {
                        try {
                            if (zzepdVar.zzn()) {
                                zzepdVar.zzk().zza(this.zzb, this.zzc, i10, th2 instanceof zzelw ? (zzelw) th2 : null, jElapsedRealtime);
                                jElapsedRealtime = jElapsedRealtime;
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjE)).booleanValue()) {
                                zzfsc zzfscVarZzl = zzepdVar.zzl();
                                zzfry zzfryVar = this.zze;
                                zzfkq zzfkqVar = this.zzf;
                                zzfkf zzfkfVar = this.zzc;
                                zzfscVarZzl.zza(zzfryVar.zza(zzfkqVar, zzfkfVar, zzfkfVar.zzn), zzfkfVar.zzax);
                            }
                            if (zzepdVar.zzp()) {
                                return;
                            }
                            LinkedHashMap linkedHashMapZzm = zzepdVar.zzm();
                            zzfkf zzfkfVar2 = this.zzc;
                            linkedHashMapZzm.put(zzfkfVar2, new zzepc(this.zzd, zzfkfVar2.zzaf, i10, jElapsedRealtime, numValueOf));
                            zzeVarZza = zzfma.zza(th2);
                            i12 = zzeVarZza.zza;
                            if ((i12 != 3 || i12 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                            }
                            zzepdVar.zzo().zze(zzfkfVar2, jElapsedRealtime, zzeVarZza);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                i11 = 5;
            }
            numValueOf = null;
            synchronized (zzepdVar) {
                if (zzepdVar.zzn()) {
                    zzepdVar.zzk().zza(this.zzb, this.zzc, i10, th2 instanceof zzelw ? (zzelw) th2 : null, jElapsedRealtime);
                    jElapsedRealtime = jElapsedRealtime;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjE)).booleanValue()) {
                    zzfsc zzfscVarZzl2 = zzepdVar.zzl();
                    zzfry zzfryVar2 = this.zze;
                    zzfkq zzfkqVar2 = this.zzf;
                    zzfkf zzfkfVar3 = this.zzc;
                    zzfscVarZzl2.zza(zzfryVar2.zza(zzfkqVar2, zzfkfVar3, zzfkfVar3.zzn), zzfkfVar3.zzax);
                }
                if (zzepdVar.zzp()) {
                    return;
                }
                LinkedHashMap linkedHashMapZzm2 = zzepdVar.zzm();
                zzfkf zzfkfVar4 = this.zzc;
                linkedHashMapZzm2.put(zzfkfVar4, new zzepc(this.zzd, zzfkfVar4.zzaf, i10, jElapsedRealtime, numValueOf));
                zzeVarZza = zzfma.zza(th2);
                i12 = zzeVarZza.zza;
                zzeVarZza = i12 != 3 ? zzfma.zza(new zzelw(13, zzeVarZza.zzd)) : zzfma.zza(new zzelw(13, zzeVarZza.zzd));
                zzepdVar.zzo().zze(zzfkfVar4, jElapsedRealtime, zzeVarZza);
            }
        }
        i11 = 2;
        i10 = i11;
        numValueOf = null;
        synchronized (zzepdVar) {
            if (zzepdVar.zzn()) {
                zzepdVar.zzk().zza(this.zzb, this.zzc, i10, th2 instanceof zzelw ? (zzelw) th2 : null, jElapsedRealtime);
                jElapsedRealtime = jElapsedRealtime;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjE)).booleanValue()) {
                zzfsc zzfscVarZzl3 = zzepdVar.zzl();
                zzfry zzfryVar3 = this.zze;
                zzfkq zzfkqVar3 = this.zzf;
                zzfkf zzfkfVar5 = this.zzc;
                zzfscVarZzl3.zza(zzfryVar3.zza(zzfkqVar3, zzfkfVar5, zzfkfVar5.zzn), zzfkfVar5.zzax);
            }
            if (zzepdVar.zzp()) {
                return;
            }
            LinkedHashMap linkedHashMapZzm3 = zzepdVar.zzm();
            zzfkf zzfkfVar6 = this.zzc;
            linkedHashMapZzm3.put(zzfkfVar6, new zzepc(this.zzd, zzfkfVar6.zzaf, i10, jElapsedRealtime, numValueOf));
            zzeVarZza = zzfma.zza(th2);
            i12 = zzeVarZza.zza;
            if (i12 != 3) {
            }
            zzepdVar.zzo().zze(zzfkfVar6, jElapsedRealtime, zzeVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(Object obj) {
        long j10;
        zzepd zzepdVar = this.zzg;
        long jElapsedRealtime = zzepdVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzepdVar) {
            try {
                if (zzepdVar.zzn()) {
                    j10 = jElapsedRealtime;
                    zzepdVar.zzk().zza(this.zzb, this.zzc, 0, null, j10);
                } else {
                    j10 = jElapsedRealtime;
                }
                if (zzepdVar.zzp()) {
                    return;
                }
                zzfkf zzfkfVar = this.zzc;
                if (zzepdVar.zzi(zzfkfVar)) {
                    ((zzepc) zzepdVar.zzm().get(zzfkfVar)).zzd = j10;
                } else {
                    long j11 = j10;
                    j10 = j11;
                    zzepdVar.zzm().put(zzfkfVar, new zzepc(this.zzd, zzfkfVar.zzaf, 0, j11, null));
                }
                zzepdVar.zzo().zzd(zzfkfVar, j10, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
