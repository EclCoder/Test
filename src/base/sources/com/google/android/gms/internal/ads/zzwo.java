package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwo implements zzxi, zzxh {
    public final zzxi zza;
    long zzb;
    private zzxh zzc;
    private zzwn[] zzd = new zzwn[0];
    private long zze = 0;
    private long zzf = C.TIME_UNSET;

    public zzwo(zzxi zzxiVar, boolean z10, long j10, long j11) {
        this.zza = zzxiVar;
        this.zzb = j11;
    }

    private static long zzt(long j10, long j11, long j12) {
        long jMax = Math.max(j10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }

    public final void zza(long j10, long j11) {
        this.zzb = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(zzxh zzxhVar, long j10) {
        this.zzc = zzxhVar;
        this.zza.zzb(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzc() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final zzzn zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zze(zzaba[] zzabaVarArr, boolean[] zArr, zzzc[] zzzcVarArr, boolean[] zArr2, long j10) {
        int length = zzzcVarArr.length;
        this.zzd = new zzwn[length];
        zzzc[] zzzcVarArr2 = new zzzc[length];
        int i10 = 0;
        while (true) {
            zzzc zzzcVar = null;
            if (i10 >= zzzcVarArr.length) {
                break;
            }
            zzwn[] zzwnVarArr = this.zzd;
            zzwn zzwnVar = (zzwn) zzzcVarArr[i10];
            zzwnVarArr[i10] = zzwnVar;
            if (zzwnVar != null) {
                zzzcVar = zzwnVar.zza;
            }
            zzzcVarArr2[i10] = zzzcVar;
            i10++;
        }
        long jZze = this.zza.zze(zzabaVarArr, zArr, zzzcVarArr2, zArr2, j10);
        long jZzt = zzt(jZze, j10, this.zzb);
        boolean zZzo = zzo();
        long j11 = C.TIME_UNSET;
        if (zZzo) {
            if (jZze < j10) {
                j11 = jZzt;
                break;
            }
            if (jZze != 0) {
                for (zzaba zzabaVar : zzabaVarArr) {
                    if (zzabaVar != null) {
                        zzv zzvVarZzc = zzabaVar.zzc();
                        if (!zzas.zzd(zzvVarZzc.zzp, zzvVarZzc.zzk)) {
                            j11 = jZzt;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j11;
        for (int i11 = 0; i11 < zzzcVarArr.length; i11++) {
            zzzc zzzcVar2 = zzzcVarArr2[i11];
            if (zzzcVar2 == null) {
                this.zzd[i11] = null;
            } else {
                zzwn[] zzwnVarArr2 = this.zzd;
                zzwn zzwnVar2 = zzwnVarArr2[i11];
                if (zzwnVar2 == null || zzwnVar2.zza != zzzcVar2) {
                    zzwnVarArr2[i11] = new zzwn(this, zzzcVar2);
                }
            }
            zzzcVarArr[i11] = this.zzd[i11];
        }
        return jZzt;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzf(long j10, boolean z10) {
        this.zza.zzf(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final void zzg(long j10) {
        this.zza.zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzh() {
        if (zzo()) {
            long j10 = this.zze;
            this.zze = C.TIME_UNSET;
            this.zzf = j10;
            long jZzh = zzh();
            return jZzh != C.TIME_UNSET ? jZzh : j10;
        }
        long jZzh2 = this.zza.zzh();
        if (jZzh2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long jZzt = zzt(jZzh2, 0L, this.zzb);
        if (jZzt == this.zzf) {
            return C.TIME_UNSET;
        }
        this.zzf = jZzt;
        return jZzt;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || jZzi < j10) {
                return jZzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzj(long j10) {
        this.zze = C.TIME_UNSET;
        for (zzwn zzwnVar : this.zzd) {
            if (zzwnVar != null) {
                zzwnVar.zza();
            }
        }
        return zzt(this.zza.zzj(j10), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzk(long j10, zzni zzniVar) {
        if (j10 == 0) {
            return 0L;
        }
        long j11 = zzniVar.zzd;
        String str = zzfl.zza;
        long jMax = Math.max(0L, Math.min(j11, j10));
        long j12 = zzniVar.zze;
        long j13 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j12, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10));
        if (jMax != j11 || jMax2 != j12) {
            zzniVar = new zzni(jMax, jMax2);
        }
        return this.zza.zzk(j10, zzniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || jZzl < j10) {
                return jZzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzm(zzma zzmaVar) {
        return this.zza.zzm(zzmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        return this.zza.zzn();
    }

    final boolean zzo() {
        return this.zze != C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzp(zzxi zzxiVar) {
        zzxh zzxhVar = this.zzc;
        zzxhVar.getClass();
        zzxhVar.zzp(this);
    }

    final /* synthetic */ long zzq() {
        return this.zzf;
    }

    final /* synthetic */ void zzr(long j10) {
        this.zzf = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final /* bridge */ /* synthetic */ void zzs(zzze zzzeVar) {
        zzxh zzxhVar = this.zzc;
        zzxhVar.getClass();
        zzxhVar.zzs(this);
    }
}
