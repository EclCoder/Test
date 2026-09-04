package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzzb implements zzahk {
    private zzv zzA;
    private boolean zzC;
    private final zzyw zza;
    private final zzun zzd;
    private final zzui zze;
    private zzza zzf;
    private zzv zzg;
    private zzug zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzx;
    private final zzyx zzb = new zzyx();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzahj[] zzo = new zzahj[1000];
    private final zzzi zzc = new zzzi(zzyy.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzz = true;
    private boolean zzy = true;
    private boolean zzB = true;
    private int zzw = -1;

    protected zzzb(zzabl zzablVar, zzun zzunVar, zzui zzuiVar) {
        this.zzd = zzunVar;
        this.zze = zzuiVar;
        this.zza = new zzyw(zzablVar);
    }

    private final synchronized void zzB() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzC(zzlw zzlwVar, zziv zzivVar, boolean z10, boolean z11, zzyx zzyxVar) {
        boolean z12 = false;
        zzivVar.zzd = false;
        int i10 = this.zzq + this.zzs;
        if (this.zzw != -1 && i10 >= 0) {
            z12 = true;
        }
        if (zzI() && !z12) {
            zzv zzvVar = ((zzyz) this.zzc.zza(i10)).zza;
            if (!z10 && zzvVar == this.zzg) {
                int iZzN = zzN(this.zzs);
                if (!zzK(iZzN)) {
                    zzivVar.zzd = true;
                    return -3;
                }
                zzivVar.zzg(this.zzm[iZzN]);
                if (this.zzs == this.zzp - 1 && (z11 || this.zzx)) {
                    zzivVar.zzh(536870912);
                }
                zzivVar.zze = this.zzn[iZzN];
                zzyxVar.zza = this.zzl[iZzN];
                zzyxVar.zzb = this.zzk[iZzN];
                zzyxVar.zzc = this.zzo[iZzN];
                return -4;
            }
            zzJ(zzvVar, zzlwVar);
            return -5;
        }
        if (!z11 && !this.zzx && !z12) {
            zzv zzvVar2 = this.zzA;
            if (zzvVar2 == null || (!z10 && zzvVar2 == this.zzg)) {
                return -3;
            }
            zzJ(zzvVar2, zzlwVar);
            return -5;
        }
        zzivVar.zzg(4);
        zzivVar.zze = Long.MIN_VALUE;
        return -4;
    }

    private final synchronized boolean zzD(zzv zzvVar) {
        try {
            this.zzz = false;
            if (Objects.equals(zzvVar, this.zzA)) {
                return false;
            }
            zzzi zzziVar = this.zzc;
            if (zzziVar.zzf() || !((zzyz) zzziVar.zzc()).zza.equals(zzvVar)) {
                this.zzA = zzvVar;
            } else {
                this.zzA = ((zzyz) zzziVar.zzc()).zza;
            }
            boolean z10 = this.zzB;
            zzv zzvVar2 = this.zzA;
            String str = zzvVar2.zzp;
            this.zzB = z10 & (zzas.zzf(str) == 1 && zzas.zzd(str, zzvVar2.zzk));
            this.zzC = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    private final synchronized long zzE(long j10, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                int i10 = this.zzp;
                if (i10 != 0) {
                    long[] jArr = this.zzn;
                    int i11 = this.zzr;
                    if (j10 >= jArr[i11]) {
                        if (z11) {
                            try {
                                int i12 = this.zzs;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int iZzL = zzL(i11, i10, j10, false);
                        if (iZzL != -1) {
                            return zzM(iZzL);
                        }
                    }
                }
                return -1L;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private final synchronized long zzF() {
        int i10 = this.zzp;
        if (i10 == 0) {
            return -1L;
        }
        return zzM(i10);
    }

    private final void zzG() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzH(long j10, int i10, long j11, int i11, zzahj zzahjVar) {
        try {
            int i12 = this.zzp;
            if (i12 > 0) {
                int iZzN = zzN(i12 - 1);
                zzgtj.zza(this.zzk[iZzN] + ((long) this.zzl[iZzN]) <= j11);
            }
            this.zzx = (536870912 & i10) != 0;
            this.zzv = Math.max(this.zzv, j10);
            int iZzN2 = zzN(this.zzp);
            this.zzn[iZzN2] = j10;
            this.zzk[iZzN2] = j11;
            this.zzl[iZzN2] = i11;
            this.zzm[iZzN2] = i10;
            this.zzo[iZzN2] = zzahjVar;
            this.zzj[iZzN2] = 0;
            zzzi zzziVar = this.zzc;
            if (zzziVar.zzf() || !((zzyz) zzziVar.zzc()).zza.equals(this.zzA)) {
                zzv zzvVar = this.zzA;
                if (zzvVar == null) {
                    throw null;
                }
                zzziVar.zzb(this.zzq + this.zzp, new zzyz(zzvVar, zzum.zzb, null));
            }
            int i13 = this.zzp + 1;
            this.zzp = i13;
            int i14 = this.zzi;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                zzahj[] zzahjVarArr = new zzahj[i15];
                int i16 = this.zzr;
                int i17 = i14 - i16;
                System.arraycopy(this.zzk, i16, jArr2, 0, i17);
                System.arraycopy(this.zzn, this.zzr, jArr3, 0, i17);
                System.arraycopy(this.zzm, this.zzr, iArr, 0, i17);
                System.arraycopy(this.zzl, this.zzr, iArr2, 0, i17);
                System.arraycopy(this.zzo, this.zzr, zzahjVarArr, 0, i17);
                System.arraycopy(this.zzj, this.zzr, jArr, 0, i17);
                int i18 = this.zzr;
                System.arraycopy(this.zzk, 0, jArr2, i17, i18);
                System.arraycopy(this.zzn, 0, jArr3, i17, i18);
                System.arraycopy(this.zzm, 0, iArr, i17, i18);
                System.arraycopy(this.zzl, 0, iArr2, i17, i18);
                System.arraycopy(this.zzo, 0, zzahjVarArr, i17, i18);
                System.arraycopy(this.zzj, 0, jArr, i17, i18);
                this.zzk = jArr2;
                this.zzn = jArr3;
                this.zzm = iArr;
                this.zzl = iArr2;
                this.zzo = zzahjVarArr;
                this.zzj = jArr;
                this.zzr = 0;
                this.zzi = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final boolean zzI() {
        return this.zzs != this.zzp;
    }

    private final void zzJ(zzv zzvVar, zzlw zzlwVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzt;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzt;
        zzun zzunVar = this.zzd;
        zzlwVar.zzb = zzvVar.zzb(zzunVar.zzb(zzvVar));
        zzlwVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzug zzugVarZza = zzunVar.zza(this.zze, zzvVar);
            this.zzh = zzugVarZza;
            zzlwVar.zza = zzugVarZza;
        }
    }

    private final boolean zzK(int i10) {
        if (this.zzh == null) {
            return true;
        }
        int i11 = this.zzm[i10];
        return false;
    }

    private final int zzL(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.zzn[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.zzm[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.zzi) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final long zzM(int i10) {
        long j10 = this.zzu;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iZzN = zzN(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.zzn[iZzN]);
                if ((this.zzm[iZzN] & 1) != 0) {
                    break;
                }
                iZzN--;
                if (iZzN == -1) {
                    iZzN = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j10, jMax);
        this.zzp -= i10;
        int i12 = this.zzq + i10;
        this.zzq = i12;
        int i13 = this.zzr + i10;
        this.zzr = i13;
        int i14 = this.zzi;
        if (i13 >= i14) {
            this.zzr = i13 - i14;
        }
        int i15 = this.zzs - i10;
        this.zzs = i15;
        if (i15 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i12);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i16 = this.zzr;
        if (i16 == 0) {
            i16 = this.zzi;
        }
        int i17 = i16 - 1;
        return this.zzk[i17] + ((long) this.zzl[i17]);
    }

    private final int zzN(int i10) {
        int i11 = this.zzr + i10;
        int i12 = this.zzi;
        return i11 < i12 ? i11 : i11 - i12;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzA(zzv zzvVar) {
        boolean zZzD = zzD(zzvVar);
        zzza zzzaVar = this.zzf;
        if (zzzaVar == null || !zZzD) {
            return;
        }
        zzzaVar.zzy(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) {
        return this.zza.zzg(zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzd(zzet zzetVar, int i10, int i11) {
        this.zza.zzh(zzetVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zze(long j10, int i10, int i11, int i12, zzahj zzahjVar) {
        if (this.zzy) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.zzy = false;
            }
        }
        if (this.zzB) {
            if (j10 < this.zzt) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.zzC) {
                    zzeg.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzA)));
                    this.zzC = true;
                }
                i10 |= 1;
            }
        }
        int i13 = i10;
        zzH(j10, i13, (this.zza.zzf() - ((long) i11)) - ((long) i12), i11, zzahjVar);
    }

    public final void zzf() {
        zzg(true);
        zzG();
    }

    public final void zzg(boolean z10) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzw = -1;
        this.zzy = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzx = false;
        this.zzc.zze();
        if (z10) {
            this.zzA = null;
            this.zzz = true;
            this.zzB = true;
        }
    }

    public final void zzh(long j10) {
        this.zzt = j10;
    }

    public final synchronized void zzi(long j10) {
    }

    public final int zzj() {
        return this.zzq + this.zzp;
    }

    public final void zzk() {
        zzy();
        zzG();
    }

    public final void zzl() {
        zzug zzugVar = this.zzh;
        if (zzugVar != null) {
            throw zzugVar.zza();
        }
    }

    public final int zzm() {
        return this.zzq;
    }

    public final int zzn() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzv zzo() {
        if (this.zzz) {
            return null;
        }
        return this.zzA;
    }

    public final synchronized long zzp() {
        return this.zzv;
    }

    public final synchronized boolean zzq() {
        return this.zzx;
    }

    public final synchronized boolean zzr(boolean z10) {
        int i10 = this.zzq + this.zzs;
        boolean z11 = true;
        if (this.zzw != -1 && i10 >= 0) {
            return true;
        }
        if (zzI()) {
            if (((zzyz) this.zzc.zza(i10)).zza != this.zzg) {
                return true;
            }
            return zzK(zzN(this.zzs));
        }
        if (!z10 && !this.zzx) {
            zzv zzvVar = this.zzA;
            if (zzvVar == null) {
                z11 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z11;
    }

    public final int zzs(zzlw zzlwVar, zziv zzivVar, int i10, boolean z10) {
        boolean z11 = (i10 & 2) != 0;
        zzyx zzyxVar = this.zzb;
        int iZzC = zzC(zzlwVar, zzivVar, z11, z10, zzyxVar);
        if (iZzC != -4) {
            return iZzC;
        }
        if (!zzivVar.zzb()) {
            int i11 = i10 & 1;
            if ((i10 & 4) == 0) {
                if (i11 != 0) {
                    this.zza.zzd(zzivVar, zzyxVar);
                    return -4;
                }
                this.zza.zzc(zzivVar, zzyxVar);
            } else if (i11 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzt(int i10) {
        zzB();
        int i11 = this.zzq;
        if (i10 >= i11 && i10 <= this.zzp + i11 && (this.zzw == -1 || i10 < 0)) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i10 - i11;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    public final synchronized boolean zzu(long j10, boolean z10) throws Throwable {
        Throwable th2;
        zzzb zzzbVar;
        long j11;
        int iZzL;
        try {
            try {
                zzB();
                int i10 = this.zzs;
                int iZzN = zzN(i10);
                long j12 = this.zzv;
                if (zzI() && j10 >= this.zzn[iZzN]) {
                    if (j10 > j12) {
                        if (z10) {
                            z10 = true;
                        }
                    }
                    if (this.zzB) {
                        try {
                            int i11 = this.zzp - i10;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= i11) {
                                    if (!z10) {
                                        zzzbVar = this;
                                        j11 = j10;
                                        iZzL = -1;
                                        break;
                                    }
                                    j11 = j10;
                                    iZzL = i11;
                                    zzzbVar = this;
                                    break;
                                }
                                if (this.zzn[iZzN] >= j10) {
                                    zzzbVar = this;
                                    j11 = j10;
                                    iZzL = i12;
                                    break;
                                }
                                iZzN++;
                                if (iZzN == this.zzi) {
                                    iZzN = 0;
                                }
                                i12++;
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } else {
                        zzzbVar = this;
                        j11 = j10;
                        iZzL = zzzbVar.zzL(iZzN, this.zzp - i10, j11, true);
                    }
                    if (iZzL != -1) {
                        zzzbVar.zzt = j11;
                        zzzbVar.zzs += iZzL;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final synchronized int zzv(long j10, boolean z10) {
        Throwable th2;
        try {
            try {
                int i10 = this.zzs;
                int iZzN = zzN(i10);
                if (!zzI() || j10 < this.zzn[iZzN]) {
                    return 0;
                }
                if (j10 <= this.zzv || !z10) {
                    int iZzL = zzL(iZzN, this.zzp - i10, j10, true);
                    if (iZzL == -1) {
                        return 0;
                    }
                    return iZzL;
                }
                try {
                    return this.zzp - i10;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    public final synchronized void zzw(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzs + i10 <= this.zzp) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzgtj.zza(z10);
        this.zzs += i10;
    }

    public final void zzx(long j10, boolean z10, boolean z11) {
        this.zza.zze(zzE(j10, false, z11));
    }

    public final void zzy() {
        this.zza.zze(zzF());
    }

    public final void zzz(zzza zzzaVar) {
        this.zzf = zzzaVar;
    }
}
