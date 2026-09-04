package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzlu implements Handler.Callback, zzxh, zzabg, zzmq, zzjh, zzmu, zzcc, zzadr {
    private static final long zza = zzfl.zzr(10000);
    private final boolean zzA;
    private zzni zzB;
    private boolean zzD;
    private boolean zzE;
    private zzlt zzF;
    private int zzG;
    private zzms zzH;
    private zzlr zzI;
    private boolean zzJ;
    private boolean zzL;
    private boolean zzM;
    private boolean zzO;
    private boolean zzR;
    private int zzS;
    private zzlt zzT;
    private long zzU;
    private long zzV;
    private int zzW;
    private boolean zzX;
    private zzjk zzY;
    private zzju zzaa;
    private boolean zzac;
    private final zzjd zzae;
    private final zzne[] zzb;
    private final zznc[] zzc;
    private final boolean[] zzd;
    private final zzabh zze;
    private final zzabi zzf;
    private final zzly zzg;
    private final zzabq zzh;
    private final zzdz zzi;
    private final zzmt zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zzji zzo;
    private final ArrayList zzp;
    private final zzdo zzq;
    private final zzls zzr;
    private final zzmf zzs;
    private final zzmr zzt;
    private final long zzu;
    private final zzqf zzv;
    private final zznm zzw;
    private final zzdz zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzab = C.TIME_UNSET;
    private int zzP = 0;
    private boolean zzQ = false;
    private boolean zzK = false;
    private float zzad = 1.0f;
    private zznh zzC = zznh.zza;
    private long zzZ = C.TIME_UNSET;
    private long zzN = C.TIME_UNSET;

    public zzlu(Context context, zzna[] zznaVarArr, zzna[] zznaVarArr2, zzabh zzabhVar, zzabi zzabiVar, zzly zzlyVar, zzabq zzabqVar, int i10, boolean z10, zznm zznmVar, zzni zzniVar, zzjd zzjdVar, long j10, boolean z11, boolean z12, Looper looper, zzdo zzdoVar, zzls zzlsVar, zzqf zzqfVar, zzmt zzmtVar, zzju zzjuVar, final zzadr zzadrVar, boolean z13) {
        this.zzr = zzlsVar;
        this.zze = zzabhVar;
        this.zzf = zzabiVar;
        this.zzg = zzlyVar;
        this.zzh = zzabqVar;
        this.zzB = zzniVar;
        this.zzae = zzjdVar;
        this.zzu = j10;
        this.zzq = zzdoVar;
        this.zzv = zzqfVar;
        this.zzaa = zzjuVar;
        this.zzw = zznmVar;
        this.zzA = z13;
        this.zzn = zzlyVar.zzf(zzqfVar);
        zzlyVar.zzg(zzqfVar);
        zzbf zzbfVar = zzbf.zza;
        zzms zzmsVarZza = zzms.zza(zzabiVar);
        this.zzH = zzmsVarZza;
        this.zzI = new zzlr(zzmsVarZza);
        int length = zznaVarArr.length;
        this.zzc = new zznc[2];
        this.zzd = new boolean[2];
        zznb zznbVarZzg = zzabhVar.zzg();
        this.zzb = new zzne[2];
        boolean z14 = false;
        for (int i11 = 0; i11 < 2; i11++) {
            zznaVarArr[i11].zzc(i11, zzqfVar, zzdoVar);
            this.zzc[i11] = zznaVarArr[i11].zzb();
            this.zzc[i11].zzv(zznbVarZzg);
            zzna zznaVar = zznaVarArr2[i11];
            if (zznaVar != null) {
                zznaVar.zzc(i11, zzqfVar, zzdoVar);
                z14 = true;
            }
            this.zzb[i11] = new zzne(zznaVarArr[i11], zznaVarArr2[i11], i11);
        }
        this.zzy = z14;
        this.zzo = new zzji(this, zzdoVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbe();
        this.zzm = new zzbd();
        zzabhVar.zzs(this, zzabqVar);
        this.zzX = true;
        zzdz zzdzVarZzd = zzdoVar.zzd(looper, null);
        this.zzx = zzdzVarZzd;
        this.zzs = new zzmf(zznmVar, zzdzVarZzd, new zzln(this), zzjuVar);
        this.zzt = new zzmr(this, zznmVar, zzdzVarZzd, zzqfVar);
        zzmt zzmtVar2 = new zzmt(null);
        this.zzj = zzmtVar2;
        Looper looperZza = zzmtVar2.zza();
        this.zzk = looperZza;
        zzdz zzdzVarZzd2 = zzdoVar.zzd(looperZza, this);
        this.zzi = zzdzVarZzd2;
        this.zzz = new zzcd(context, looperZza, this);
        zzdzVarZzd2.zzd(35, new zzadr() { // from class: com.google.android.gms.internal.ads.zzlj
            @Override // com.google.android.gms.internal.ads.zzadr
            public final /* synthetic */ void zzcS(long j11, long j12, zzv zzvVar, MediaFormat mediaFormat) {
                this.zza.zzcS(j11, j12, zzvVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzA(IOException iOException, int i10) {
        zzmf zzmfVar = this.zzs;
        zzjk zzjkVarZza = zzjk.zza(iOException, i10);
        zzmc zzmcVarZzm = zzmfVar.zzm();
        if (zzmcVarZzm != null) {
            zzjkVarZza = zzjkVarZza.zzd(zzmcVarZzm.zzg.zza);
        }
        zzeg.zzf("ExoPlayerImplInternal", "Playback error", zzjkVarZza);
        zzW(false, false);
        this.zzH = this.zzH.zzf(zzjkVarZza);
    }

    private final void zzB(int i10) {
        zzms zzmsVar = this.zzH;
        if (zzmsVar.zze != i10) {
            if (i10 != 2) {
                this.zzZ = C.TIME_UNSET;
            }
            this.zzH = zzmsVar.zze(i10);
        }
    }

    private final void zzC() {
        this.zzI.zzb(this.zzH);
        if (this.zzI.zzd()) {
            this.zzr.zza(this.zzI);
            this.zzI = new zzlr(this.zzH);
        }
    }

    private final void zzD(float f10) {
        this.zzad = f10;
        float fZza = f10 * this.zzz.zza();
        int i10 = 0;
        while (true) {
            zzne[] zzneVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzneVarArr[i10].zzL(fZza);
            i10++;
        }
    }

    private final void zzE(boolean z10, int i10, boolean z11, int i11) {
        this.zzI.zza(z11 ? 1 : 0);
        zzG(z10, i10, i11);
    }

    private final void zzF() {
        zzms zzmsVar = this.zzH;
        zzG(zzmsVar.zzl, zzmsVar.zzn, zzmsVar.zzm);
    }

    private final void zzG(boolean z10, int i10, int i11) {
        zzH(z10, this.zzz.zzc(z10, this.zzH.zze), i10, i11);
    }

    private final void zzH(boolean z10, int i10, int i11, int i12) {
        boolean z11;
        if (!z10) {
            z11 = false;
        } else if (i10 != -1) {
            z11 = true;
        } else {
            i10 = -1;
            z11 = false;
        }
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        boolean z12 = this.zzD;
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = z12 ? 4 : 0;
        }
        zzms zzmsVar = this.zzH;
        if (zzmsVar.zzl == z11 && zzmsVar.zzn == i11 && zzmsVar.zzm == i12) {
            return;
        }
        this.zzH = zzmsVar.zzi(z11, i12, i11);
        zzaD(false, false);
        zzmf zzmfVar = this.zzs;
        for (zzmc zzmcVarZzm = zzmfVar.zzm(); zzmcVarZzm != null; zzmcVarZzm = zzmcVarZzm.zzp()) {
            for (zzaba zzabaVar : zzmcVarZzm.zzr().zzc) {
            }
        }
        if (!zzay()) {
            zzK();
            zzL();
            boolean z13 = this.zzH.zzp;
            zzmfVar.zzf(this.zzU);
            return;
        }
        int i13 = this.zzH.zze;
        if (i13 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i13 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzI(boolean z10) throws zzjk {
        zzxk zzxkVar = this.zzs.zzm().zzg.zza;
        long jZzT = zzT(zzxkVar, this.zzH.zzs, true, false);
        if (jZzT != this.zzH.zzs) {
            zzms zzmsVar = this.zzH;
            this.zzH = zzap(zzxkVar, jZzT, zzmsVar.zzc, zzmsVar.zzd, z10, 5);
        }
    }

    private final void zzJ() {
        zzmc zzmcVarZzm = this.zzs.zzm();
        if (zzmcVarZzm == null) {
            return;
        }
        zzabi zzabiVarZzr = zzmcVarZzm.zzr();
        int i10 = 0;
        while (true) {
            zzne[] zzneVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            if (zzabiVarZzr.zza(i10)) {
                zzneVarArr[i10].zzv();
            }
            i10++;
        }
    }

    private final void zzK() {
        this.zzo.zzb();
        int i10 = 0;
        while (true) {
            zzne[] zzneVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzneVarArr[i10].zzw();
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzL() {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlu.zzL():void");
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i10, final boolean z10) {
        boolean[] zArr = this.zzd;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i10, z10);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j10) {
        int i10 = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        if (zzbeVar.zzf == C.TIME_UNSET || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return C.TIME_UNSET;
        }
        long j11 = zzbeVar.zzg;
        String str = zzfl.zza;
        return zzfl.zzs((j11 == C.TIME_UNSET ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j10;
    }

    private final boolean zzP(zzbf zzbfVar, zzxk zzxkVar) {
        if (!zzxkVar.zzb() && !zzbfVar.zzg()) {
            int i10 = zzbfVar.zzo(zzxkVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i10, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != C.TIME_UNSET) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j10) {
        long jMin = 1000;
        if (zzw()) {
            jMin = this.zzH.zze != 3 ? zza : 1000L;
            zzne[] zzneVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                jMin = Math.min(jMin, zzfl.zzr(zzneVarArr[i10].zzk(this.zzU, this.zzV)));
            }
            if (this.zzH.zzj()) {
                zzmf zzmfVar = this.zzs;
                zzmc zzmcVarZzp = zzmfVar.zzm() != null ? zzmfVar.zzm().zzp() : null;
                if (zzmcVarZzp != null) {
                    if (this.zzU + (zzfl.zzs(jMin) * this.zzH.zzo.zzb) >= zzmcVarZzp.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzH.zze != 3 || zzay()) {
            jMin = zza;
        }
        this.zzi.zzj(2, j10 + jMin);
    }

    private final void zzR(zzlt zzltVar) throws Throwable {
        long jLongValue;
        zzxk zzxkVarZzy;
        boolean z10;
        boolean z11;
        long j10;
        long j11;
        long j12;
        long j13;
        long jZzk;
        zzms zzmsVar;
        int i10;
        if (this.zzE) {
            if (this.zzF != null) {
                this.zzG++;
                this.zzI.zza(1);
            }
            this.zzF = zzltVar;
            return;
        }
        this.zzI.zza(1);
        zzbf zzbfVar = this.zzH.zza;
        int i11 = this.zzP;
        boolean z12 = this.zzQ;
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzaE = zzaE(zzbfVar, zzltVar, true, i11, z12, zzbeVar, zzbdVar);
        long jMax = C.TIME_UNSET;
        if (pairZzaE == null) {
            Pair pairZzY = zzY(this.zzH.zza);
            zzxk zzxkVar = (zzxk) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            z10 = !this.zzH.zza.zzg();
            zzxkVarZzy = zzxkVar;
            jMax = -9223372036854775807L;
        } else {
            Object obj = pairZzaE.first;
            jLongValue = ((Long) pairZzaE.second).longValue();
            long j14 = zzltVar.zzc;
            if (j14 != C.TIME_UNSET) {
                jMax = jLongValue;
            }
            zzxkVarZzy = this.zzs.zzy(this.zzH.zza, obj, jLongValue);
            if (zzxkVarZzy.zzb()) {
                this.zzH.zza.zzo(zzxkVarZzy.zza, zzbdVar);
                int i12 = zzxkVarZzy.zzb;
                if (zzbdVar.zzd(i12) == zzxkVarZzy.zzc) {
                    zzbdVar.zzj();
                }
                long j15 = zzbdVar.zzg.zza(i12).zza;
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
            } else if (j14 != C.TIME_UNSET) {
                z10 = false;
            }
            z10 = true;
        }
        try {
            if (this.zzH.zza.zzg()) {
                this.zzT = zzltVar;
            } else if (pairZzaE == null) {
                if (this.zzH.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                if (zzxkVarZzy.equals(this.zzH.zzb)) {
                    zzmc zzmcVarZzm = this.zzs.zzm();
                    if (zzmcVarZzm == null || !zzmcVarZzm.zze || jLongValue == 0) {
                        jZzk = jLongValue;
                    } else {
                        zzxi zzxiVar = zzmcVarZzm.zza;
                        long j16 = zzbeVar.zzm;
                        if (this.zzD && j16 != jMax) {
                            Double d10 = this.zzC.zzc;
                        }
                        jZzk = zzxiVar.zzk(jLongValue, this.zzB);
                    }
                    long j17 = jZzk;
                    if (zzfl.zzr(jZzk) == zzfl.zzr(this.zzH.zzs) && ((i10 = (zzmsVar = this.zzH).zze) == 2 || i10 == 3)) {
                        jLongValue = zzmsVar.zzs;
                    } else {
                        j11 = j17;
                    }
                } else {
                    j11 = jLongValue;
                }
                if (this.zzD) {
                    zzne[] zzneVarArr = this.zzb;
                    for (int i13 = 0; i13 < 2; i13++) {
                        zzne zzneVar = zzneVarArr[i13];
                        if (zzneVar.zzM() && zzneVar.zze() == 2) {
                            this.zzE = true;
                            break;
                        }
                    }
                }
                long jZzS = zzS(zzxkVarZzy, j11, this.zzH.zze == 4);
                z11 = (jLongValue != jZzS) | z10;
                try {
                    zzms zzmsVar2 = this.zzH;
                    zzxk zzxkVar2 = zzxkVarZzy;
                    try {
                        zzbf zzbfVar2 = zzmsVar2.zza;
                        long j18 = jMax;
                        try {
                            zzag(zzbfVar2, zzxkVar2, zzbfVar2, zzmsVar2.zzb, j18, true);
                            zzxkVarZzy = zzxkVar2;
                            j12 = j18;
                            j13 = jZzS;
                            this.zzH = zzap(zzxkVarZzy, j13, j12, j13, z11, 2);
                        } catch (Throwable th2) {
                            th = th2;
                            zzxkVarZzy = zzxkVar2;
                            jMax = j18;
                            j10 = jZzS;
                            this.zzH = zzap(zzxkVarZzy, j10, jMax, j10, z11, 2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zzxkVarZzy = zzxkVar2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            z11 = z10;
            j12 = jMax;
            j13 = jLongValue;
            this.zzH = zzap(zzxkVarZzy, j13, j12, j13, z11, 2);
        } catch (Throwable th5) {
            th = th5;
            z11 = z10;
            j10 = jLongValue;
        }
    }

    private final long zzS(zzxk zzxkVar, long j10, boolean z10) {
        zzmf zzmfVar = this.zzs;
        return zzT(zzxkVar, j10, zzmfVar.zzm() != zzmfVar.zzn(), z10);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    private final long zzT(zzxk zzxkVar, long j10, boolean z10, boolean z11) throws zzjk {
        zzK();
        boolean z12 = true;
        zzaD(false, true);
        if (z11 || this.zzH.zze == 3) {
            zzB(2);
        }
        zzmf zzmfVar = this.zzs;
        zzmc zzmcVarZzm = zzmfVar.zzm();
        zzmc zzmcVarZzp = zzmcVarZzm;
        while (zzmcVarZzp != null && !zzxkVar.equals(zzmcVarZzp.zzg.zza)) {
            zzmcVarZzp = zzmcVarZzp.zzp();
        }
        if (z10 || zzmcVarZzm != zzmcVarZzp || (zzmcVarZzp != null && zzmcVarZzp.zza() + j10 < 0)) {
            zzaa();
            if (zzmcVarZzp != null) {
                while (zzmfVar.zzm() != zzmcVarZzp) {
                    zzmfVar.zzr();
                }
                zzmfVar.zzs(zzmcVarZzp);
                zzmcVarZzp.zzb(1000000000000L);
                zzaq();
                zzmcVarZzp.zzh = true;
            }
        }
        zzab();
        if (zzmcVarZzp != null) {
            zzmfVar.zzs(zzmcVarZzp);
            if (!zzmcVarZzp.zze) {
                zzmcVarZzp.zzg = zzmcVarZzp.zzg.zza(j10, C.TIME_UNSET);
            } else if (zzmcVarZzp.zzf) {
                if (this.zzD) {
                    boolean z13 = this.zzC.zzi;
                    if (this.zzH.zza.zzg() || !zzmcVarZzp.zzg.zza.equals(this.zzH.zzb)) {
                        zzxi zzxiVar = zzmcVarZzp.zza;
                        j10 = zzxiVar.zzj(j10);
                        zzxiVar.zzf(j10 - this.zzn, false);
                    } else {
                        long jZza = zzmcVarZzp.zza() + j10;
                        zzne[] zzneVarArr = this.zzb;
                        boolean zZzF = true;
                        for (int i10 = 0; i10 < 2; i10++) {
                            zzne zzneVar = zzneVarArr[i10];
                            if (zzneVar.zzM()) {
                                zZzF &= zzneVar.zzF(zzmcVarZzp, jZza);
                            }
                        }
                        if (zZzF) {
                            zzxi zzxiVar2 = zzmcVarZzp.zza;
                            long j11 = this.zzH.zzs;
                            zzni zzniVar = zzni.zzb;
                            if (zzxiVar2.zzk(j11, zzniVar) == zzxiVar2.zzk(j10, zzniVar)) {
                                z12 = false;
                            } else {
                                zzxi zzxiVar3 = zzmcVarZzp.zza;
                                j10 = zzxiVar3.zzj(j10);
                                zzxiVar3.zzf(j10 - this.zzn, false);
                            }
                        } else {
                            zzxi zzxiVar4 = zzmcVarZzp.zza;
                            j10 = zzxiVar4.zzj(j10);
                            zzxiVar4.zzf(j10 - this.zzn, false);
                        }
                    }
                } else {
                    zzxi zzxiVar5 = zzmcVarZzp.zza;
                    j10 = zzxiVar5.zzj(j10);
                    zzxiVar5.zzf(j10 - this.zzn, false);
                }
            }
            zzU(j10, z12);
            zzan();
        } else {
            zzmfVar.zzv();
            zzU(j10, true);
        }
        zzat(false);
        this.zzi.zzh(2);
        return j10;
    }

    private final void zzU(long j10, boolean z10) {
        zzmc zzmcVarZzm = this.zzs.zzm();
        long jZza = j10 + (zzmcVarZzm == null ? 1000000000000L : zzmcVarZzm.zza());
        this.zzU = jZza;
        this.zzo.zzc(jZza);
        zzne[] zzneVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            zzneVarArr[i10].zzE(zzmcVarZzm, this.zzU, z10);
        }
        for (zzmc zzmcVarZzm2 = r0.zzm(); zzmcVarZzm2 != null; zzmcVarZzm2 = zzmcVarZzm2.zzp()) {
            for (zzaba zzabaVar : zzmcVarZzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() {
        int i10 = 0;
        while (true) {
            zzne[] zzneVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzneVarArr[i10].zzz(this.zzD ? this.zzC : null);
            i10++;
        }
    }

    private final void zzW(boolean z10, boolean z11) {
        zzX(z10 || !this.zzR, false, true, false);
        this.zzI.zza(z11 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzH.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009d A[PHI: r2 r7 r9
      0x009d: PHI (r2v2 com.google.android.gms.internal.ads.zzxk) = (r2v1 com.google.android.gms.internal.ads.zzxk), (r2v11 com.google.android.gms.internal.ads.zzxk) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r9v2 long) = (r9v1 long), (r9v7 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v12 com.google.android.gms.internal.ads.zzbf)
      (r3v12 com.google.android.gms.internal.ads.zzbf)
     binds: [B:34:0x00aa, B:36:0x00ae, B:38:0x00bf, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzX(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        zzxk zzxkVar;
        zzbf zzbfVar;
        this.zzi.zzk(2);
        this.zzE = false;
        if (this.zzF != null) {
            this.zzI.zza(1);
            this.zzF = null;
        }
        this.zzY = null;
        zzaD(false, true);
        this.zzo.zzb();
        this.zzU = 1000000000000L;
        try {
            zzaa();
        } catch (zzjk | RuntimeException e10) {
            zzeg.zzf("ExoPlayerImplInternal", "Disable failed.", e10);
        }
        if (z10) {
            zzne[] zzneVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    zzneVarArr[i10].zzG();
                } catch (RuntimeException e11) {
                    zzeg.zzf("ExoPlayerImplInternal", "Reset failed.", e11);
                }
            }
        }
        this.zzS = 0;
        zzms zzmsVar = this.zzH;
        zzxk zzxkVar2 = zzmsVar.zzb;
        long jLongValue = zzmsVar.zzs;
        long j10 = (this.zzH.zzb.zzb() || zzaC(this.zzH, this.zzm)) ? this.zzH.zzc : this.zzH.zzs;
        if (z11) {
            this.zzT = null;
            Pair pairZzY = zzY(this.zzH.zza);
            zzxkVar2 = (zzxk) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            boolean zEquals = zzxkVar2.equals(this.zzH.zzb);
            j10 = C.TIME_UNSET;
            z14 = zEquals ? false : true;
        }
        long j11 = jLongValue;
        long j12 = j10;
        zzmf zzmfVar = this.zzs;
        zzmfVar.zzv();
        this.zzO = false;
        zzbf zzbfVarZzx = this.zzH.zza;
        if (z12 && (zzbfVarZzx instanceof zzmy)) {
            zzbfVarZzx = ((zzmy) zzbfVarZzx).zzx(this.zzt.zzq());
            if (zzxkVar2.zzb != -1) {
                Object obj = zzxkVar2.zza;
                zzbd zzbdVar = this.zzm;
                zzbfVarZzx.zzo(obj, zzbdVar);
                zzbe zzbeVar = this.zzl;
                zzbfVarZzx.zzb(zzbdVar.zzc, zzbeVar, 0L);
                if (zzbeVar.zzb()) {
                    zzbfVar = zzbfVarZzx;
                    zzxkVar = new zzxk(obj, zzxkVar2.zzd);
                } else {
                    zzxkVar = zzxkVar2;
                    zzbfVar = zzbfVarZzx;
                }
            } else {
                zzxkVar = zzxkVar2;
                zzbfVar = zzbfVarZzx;
            }
        } else {
            zzxkVar = zzxkVar2;
            zzbfVar = zzbfVarZzx;
        }
        zzms zzmsVar2 = this.zzH;
        int i11 = zzmsVar2.zze;
        zzjk zzjkVar = z13 ? null : zzmsVar2.zzf;
        zzzn zzznVar = z14 ? zzzn.zza : zzmsVar2.zzh;
        zzabi zzabiVar = z14 ? this.zzf : zzmsVar2.zzi;
        List listZzi = z14 ? zzgwm.zzi() : zzmsVar2.zzj;
        zzms zzmsVar3 = this.zzH;
        this.zzH = new zzms(zzbfVar, zzxkVar, j12, j11, i11, zzjkVar, false, zzznVar, zzabiVar, listZzi, zzxkVar, zzmsVar3.zzl, zzmsVar3.zzm, zzmsVar3.zzn, zzmsVar3.zzo, j11, 0L, j11, 0L, false);
        if (z12) {
            zzmfVar.zzj();
            this.zzt.zzg();
        }
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j10 = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzms.zzb(), 0L);
        }
        int iZzk = zzbfVar.zzk(this.zzQ);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, C.TIME_UNSET);
        zzxk zzxkVarZzy = this.zzs.zzy(zzbfVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzxkVarZzy.zzb()) {
            zzbfVar.zzo(zzxkVarZzy.zza, zzbdVar);
            if (zzxkVarZzy.zzc == zzbdVar.zzd(zzxkVarZzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(zzxkVarZzy, Long.valueOf(j10));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzlq) arrayList.get(size)).zzb;
            String str = zzfl.zza;
            throw null;
        }
    }

    private final boolean zzaA() {
        if (!this.zzy) {
            return false;
        }
        zzne[] zzneVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzneVarArr[i10].zzc()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzD) {
            return false;
        }
        boolean z10 = this.zzC.zzg;
        return true;
    }

    private static boolean zzaC(zzms zzmsVar, zzbd zzbdVar) {
        zzxk zzxkVar = zzmsVar.zzb;
        zzbf zzbfVar = zzmsVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzxkVar.zza, zzbdVar).zzf;
    }

    private final void zzaD(boolean z10, boolean z11) {
        this.zzM = z10;
        long jElapsedRealtime = C.TIME_UNSET;
        if (z10 && !z11) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzN = jElapsedRealtime;
    }

    private static Pair zzaE(zzbf zzbfVar, zzlt zzltVar, boolean z10, int i10, boolean z11, zzbe zzbeVar, zzbd zzbdVar) {
        zzbf zzbfVar2;
        zzbf zzbfVar3 = zzltVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        if (true == zzbfVar3.zzg()) {
            zzbfVar2 = zzbfVar3;
            zzbfVar2 = zzbfVar;
        }
        try {
            zzbfVar2 = zzbfVar3;
            Pair pairZzm = zzbfVar2.zzm(zzbeVar, zzbdVar, zzltVar.zzb, zzltVar.zzc);
            zzbf zzbfVar4 = zzbfVar2;
            if (zzbfVar.equals(zzbfVar4)) {
                return pairZzm;
            }
            if (zzbfVar.zze(pairZzm.first) != -1) {
                return (zzbfVar4.zzo(pairZzm.first, zzbdVar).zzf && zzbfVar4.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar4.zze(pairZzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(pairZzm.first, zzbdVar).zzc, zzltVar.zzc) : pairZzm;
            }
            int iZzr = zzr(zzbeVar, zzbdVar, i10, z11, pairZzm.first, zzbfVar4, zzbfVar);
            if (iZzr != -1) {
                return zzbfVar.zzm(zzbeVar, zzbdVar, iZzr, C.TIME_UNSET);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private static final void zzaF(zzmw zzmwVar) {
        zzmwVar.zzh();
        try {
            zzmwVar.zza().zzx(zzmwVar.zzc(), zzmwVar.zze());
        } finally {
            zzmwVar.zzi(true);
        }
    }

    private static final boolean zzaG(zzmc zzmcVar) {
        if (zzmcVar != null) {
            try {
                if (zzmcVar.zze) {
                    zzzc[] zzzcVarArr = zzmcVar.zzc;
                    for (int i10 = 0; i10 < 2; i10++) {
                        zzzc zzzcVar = zzzcVarArr[i10];
                        if (zzzcVar != null) {
                            zzzcVar.zzc();
                        }
                    }
                } else {
                    zzmcVar.zza.zzc();
                }
                if (zzmcVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() {
        int i10 = 0;
        while (true) {
            zzne[] zzneVarArr = this.zzb;
            if (i10 >= 2) {
                this.zzab = C.TIME_UNSET;
                return;
            }
            int iZzd = zzneVarArr[i10].zzd();
            zzneVarArr[i10].zzA(this.zzo);
            zzN(i10, false);
            this.zzS -= iZzd;
            i10++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaA()) {
            zzne[] zzneVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                zzne zzneVar = zzneVarArr[i10];
                int iZzd = zzneVar.zzd();
                zzneVar.zzC(this.zzo);
                this.zzS -= iZzd - zzneVar.zzd();
            }
            this.zzab = C.TIME_UNSET;
        }
    }

    private final void zzac() throws zzjk {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zzjk {
        zzabi zzabiVarZzk;
        zzabi zzabiVar;
        boolean z10;
        zzlu zzluVar;
        int i10;
        zzji zzjiVar = this.zzo;
        float f10 = zzjiVar.zzj().zzb;
        zzmf zzmfVar = this.zzs;
        zzmc zzmcVarZzm = zzmfVar.zzm();
        zzmc zzmcVarZzn = zzmfVar.zzn();
        zzabi zzabiVar2 = null;
        boolean z11 = true;
        loop0: while (true) {
            if (zzmcVarZzm == null || !zzmcVarZzm.zze) {
                return;
            }
            zzms zzmsVar = this.zzH;
            zzabiVarZzk = zzmcVarZzm.zzk(f10, zzmsVar.zza, zzmsVar.zzl);
            zzabiVar = zzmcVarZzm == zzmfVar.zzm() ? zzabiVarZzk : zzabiVar2;
            zzabi zzabiVarZzr = zzmcVarZzm.zzr();
            z10 = false;
            if (zzabiVarZzr == null) {
                break;
            }
            zzaba[] zzabaVarArr = zzabiVarZzk.zzc;
            if (zzabiVarZzr.zzc.length != zzabaVarArr.length) {
                break;
            }
            for (int i11 = 0; i11 < zzabaVarArr.length; i11++) {
                if (!zzabiVarZzk.zzb(zzabiVarZzr, i11)) {
                    break loop0;
                }
            }
            if (zzmcVarZzm != zzmcVarZzn) {
                z10 = true;
            }
            z11 &= z10;
            zzmcVarZzm = zzmcVarZzm.zzp();
            zzabiVar2 = zzabiVar;
        }
        if (z11) {
            zzmc zzmcVarZzm2 = zzmfVar.zzm();
            int iZzs = zzmfVar.zzs(zzmcVarZzm2) & 1;
            zzne[] zzneVarArr = this.zzb;
            boolean[] zArr = new boolean[2];
            zzabiVar.getClass();
            long jZzm = zzmcVarZzm2.zzm(zzabiVar, this.zzH.zzs, 1 == iZzs, zArr);
            zzms zzmsVar2 = this.zzH;
            if (zzmsVar2.zze != 4 && jZzm != zzmsVar2.zzs) {
                z10 = true;
            }
            zzms zzmsVar3 = this.zzH;
            i10 = 2;
            zzluVar = this;
            zzluVar.zzH = zzap(zzmsVar3.zzb, jZzm, zzmsVar3.zzc, zzmsVar3.zzd, z10, 5);
            if (z10) {
                zzluVar.zzU(jZzm, true);
            }
            zzluVar.zzab();
            boolean[] zArr2 = new boolean[2];
            for (int i12 = 0; i12 < 2; i12++) {
                int iZzd = zzneVarArr[i12].zzd();
                zArr2[i12] = zzneVarArr[i12].zzM();
                zzneVarArr[i12].zzD(zzmcVarZzm2.zzc[i12], zzjiVar, zzluVar.zzU, zArr[i12]);
                if (iZzd - zzneVarArr[i12].zzd() > 0) {
                    zzluVar.zzN(i12, false);
                }
                zzluVar.zzS -= iZzd - zzneVarArr[i12].zzd();
            }
            zzluVar.zzar(zArr2, zzluVar.zzU);
            zzmcVarZzm2.zzh = true;
        } else {
            zzluVar = this;
            i10 = 2;
            zzmfVar.zzs(zzmcVarZzm);
            if (zzmcVarZzm.zze) {
                long jMax = Math.max(zzmcVarZzm.zzg.zzb, zzluVar.zzU - zzmcVarZzm.zza());
                if (zzluVar.zzy && zzluVar.zzaA() && zzmfVar.zzo() == zzmcVarZzm) {
                    zzluVar.zzab();
                }
                zzmcVarZzm.zzl(zzabiVarZzk, jMax, false);
            }
        }
        zzluVar.zzat(true);
        if (zzluVar.zzH.zze != 4) {
            zzluVar.zzan();
            zzluVar.zzL();
            zzluVar.zzi.zzh(i10);
        }
    }

    private final boolean zzae() {
        zzmc zzmcVarZzm = this.zzs.zzm();
        long j10 = zzmcVarZzm.zzg.zzf;
        if (zzmcVarZzm.zze) {
            return j10 == C.TIME_UNSET || this.zzH.zzs < j10 || !zzay();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0237  */
    /* JADX WARN: Code duplicated, block: B:106:0x023e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0244  */
    /* JADX WARN: Code duplicated, block: B:109:0x0247  */
    /* JADX WARN: Code duplicated, block: B:111:0x0256  */
    /* JADX WARN: Code duplicated, block: B:113:0x025c  */
    /* JADX WARN: Code duplicated, block: B:121:0x027d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0283  */
    /* JADX WARN: Code duplicated, block: B:127:0x0294  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:179:0x0341  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:229:0x0427  */
    /* JADX WARN: Code duplicated, block: B:230:0x042a  */
    /* JADX WARN: Code duplicated, block: B:233:0x0434  */
    /* JADX WARN: Code duplicated, block: B:235:0x043c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x043e  */
    /* JADX WARN: Code duplicated, block: B:238:0x0444  */
    /* JADX WARN: Code duplicated, block: B:242:0x0469  */
    /* JADX WARN: Code duplicated, block: B:87:0x0208  */
    /* JADX WARN: Code duplicated, block: B:97:0x0223  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [com.google.android.gms.internal.ads.zzlt] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.google.android.gms.internal.ads.zzlt] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r34v0, types: [com.google.android.gms.internal.ads.zzlu] */
    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r16v2 int, still in use, count: 4, list:
          (r16v2 int) from MOVE (r16v20 ??) = (r16v2 int) A[SYNTHETIC]
          (r16v2 int) from MOVE (r16v21 ??) = (r16v2 int) A[SYNTHETIC]
          (r16v2 int) from MOVE (r16v22 ??) = (r16v2 int) A[SYNTHETIC]
          (r16v2 int) from MOVE (r16v23 ??) = (r16v2 int) A[SYNTHETIC]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyIf(SimplifyVisitor.java:298)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:138)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    private final void zzaf(com.google.android.gms.internal.ads.zzbf r35, boolean r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlu.zzaf(com.google.android.gms.internal.ads.zzbf, boolean):void");
    }

    private final void zzag(zzbf zzbfVar, zzxk zzxkVar, zzbf zzbfVar2, zzxk zzxkVar2, long j10, boolean z10) {
        if (!zzP(zzbfVar, zzxkVar)) {
            zzav zzavVar = zzxkVar.zzb() ? zzav.zza : this.zzH.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzam(this.zzH.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzxkVar.zza;
        zzbd zzbdVar = this.zzm;
        int i10 = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        zzjd zzjdVar = this.zzae;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfl.zza;
        zzjdVar.zza(zzafVar);
        if (j10 != C.TIME_UNSET) {
            zzjdVar.zzb(zzO(zzbfVar, obj, j10));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzxkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z10) {
            zzjdVar.zzb(C.TIME_UNSET);
        }
    }

    private final long zzah(zzmc zzmcVar) {
        if (zzmcVar == null) {
            return 0L;
        }
        long jZza = zzmcVar.zza();
        if (zzmcVar.zze) {
            int i10 = 0;
            while (true) {
                zzne[] zzneVarArr = this.zzb;
                if (i10 >= 2) {
                    break;
                }
                if (zzneVarArr[i10].zzp(zzmcVar)) {
                    long jZzf = zzneVarArr[i10].zzf(zzmcVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i10++;
            }
        }
        return jZza;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0218 A[LOOP:9: B:118:0x0216->B:119:0x0218, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0324  */
    /* JADX WARN: Code duplicated, block: B:63:0x0108 A[EDGE_INSN: B:63:0x0108->B:139:0x025d BREAK  A[LOOP:6: B:72:0x0128->B:76:0x0134]] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zzai() throws zzjk {
        int i10;
        int i11;
        boolean z10;
        zzmc zzmcVarZzm;
        zzmc zzmcVarZzp;
        boolean z11;
        zzne[] zzneVarArr;
        zzmc zzmcVarZzo;
        zzmd zzmdVarZzh;
        if (this.zzH.zza.zzg() || !this.zzt.zzb()) {
            return;
        }
        zzmf zzmfVar = this.zzs;
        zzmfVar.zzf(this.zzU);
        if (zzmfVar.zzg() && (zzmdVarZzh = zzmfVar.zzh(this.zzU, this.zzH)) != null) {
            zzmc zzmcVarZzi = zzmfVar.zzi(zzmdVarZzh);
            if (!zzmcVarZzi.zzd) {
                zzmcVarZzi.zzt(this, zzmdVarZzh.zzb);
            } else if (zzmcVarZzi.zze) {
                this.zzi.zzd(8, zzmcVarZzi.zza).zza();
            }
            if (zzmfVar.zzm() == zzmcVarZzi) {
                zzU(zzmdVarZzh.zzb, true);
            }
            zzat(false);
        }
        if (this.zzO) {
            this.zzO = zzaG(zzmfVar.zzk());
            zzao();
        } else {
            zzan();
        }
        if (!this.zzL && this.zzy && !this.zzac && !zzaA() && (zzmcVarZzo = zzmfVar.zzo()) != null && zzmcVarZzo == zzmfVar.zzn() && zzmcVarZzo.zzp() != null && zzmcVarZzo.zzp().zze && zzaw(zzmcVarZzo.zzp()) <= 10000000) {
            zzmfVar.zzq();
            zzmc zzmcVarZzo2 = zzmfVar.zzo();
            if (zzmcVarZzo2 != null) {
                zzabi zzabiVarZzr = zzmcVarZzo2.zzr();
                int i12 = 0;
                while (true) {
                    zzne[] zzneVarArr2 = this.zzb;
                    if (i12 >= 2) {
                        break;
                    }
                    if (zzabiVarZzr.zza(i12) && zzneVarArr2[i12].zza() && !zzneVarArr2[i12].zzc()) {
                        zzneVarArr2[i12].zzb();
                        zzas(zzmcVarZzo2, i12, false, zzmcVarZzo2.zzc());
                    }
                    i12++;
                }
                if (zzaA()) {
                    this.zzab = zzmcVarZzo2.zza.zzh();
                    if (!zzmcVarZzo2.zzd()) {
                        zzmfVar.zzs(zzmcVarZzo2);
                        zzat(false);
                        zzan();
                    }
                }
            }
        }
        zzmc zzmcVarZzn = zzmfVar.zzn();
        if (zzmcVarZzn == null) {
            i10 = 1;
            break;
        }
        if (zzmcVarZzn.zzp() != null && !this.zzL) {
            zzmc zzmcVarZzn2 = zzmfVar.zzn();
            if (!zzmcVarZzn2.zze) {
                i10 = 1;
                break;
            }
            int i13 = 0;
            while (true) {
                zzne[] zzneVarArr3 = this.zzb;
                if (i13 >= 2) {
                    if ((!zzaA() || zzmfVar.zzo() != zzmfVar.zzn()) && ((zzmcVarZzn.zzp().zze || this.zzU >= zzmcVarZzn.zzp().zzc()) && (!zzmcVarZzn.zzp().zze || zzaw(zzmcVarZzn.zzp()) <= 10000000))) {
                        zzabi zzabiVarZzr2 = zzmcVarZzn.zzr();
                        zzmc zzmcVarZzp2 = zzmfVar.zzp();
                        zzabi zzabiVarZzr3 = zzmcVarZzp2.zzr();
                        zzbf zzbfVar = this.zzH.zza;
                        i10 = 1;
                        zzag(zzbfVar, zzmcVarZzp2.zzg.zza, zzbfVar, zzmcVarZzn.zzg.zza, C.TIME_UNSET, false);
                        if (zzmcVarZzp2.zze && (((z10 = this.zzy) && this.zzab != C.TIME_UNSET) || zzmcVarZzp2.zza.zzh() != C.TIME_UNSET)) {
                            this.zzab = C.TIME_UNSET;
                            if (z10 && !this.zzac) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= 2) {
                                        for (i11 = 0; i11 < 2; i11++) {
                                            zzneVarArr3[i11].zzi(zzabiVarZzr2, zzabiVarZzr3, zzmcVarZzp2.zzc());
                                        }
                                        break;
                                        break;
                                    }
                                    if (zzabiVarZzr3.zza(i14)) {
                                        zzneVarArr3[i14].zze();
                                        zzaba[] zzabaVarArr = zzabiVarZzr3.zzc;
                                        if (zzas.zzd(zzabaVarArr[i14].zzc().zzp, zzabaVarArr[i14].zzc().zzk) || zzneVarArr3[i14].zzc()) {
                                        }
                                    }
                                    i14++;
                                }
                            }
                            long jZzc = zzmcVarZzp2.zzc();
                            for (int i15 = 0; i15 < 2; i15++) {
                                zzneVarArr3[i15].zzj(jZzc);
                            }
                            if (!zzmcVarZzp2.zzd()) {
                                zzmfVar.zzs(zzmcVarZzp2);
                                zzat(false);
                                zzan();
                                break;
                            }
                            break;
                        }
                        while (i11 < 2) {
                            zzneVarArr3[i11].zzi(zzabiVarZzr2, zzabiVarZzr3, zzmcVarZzp2.zzc());
                        }
                        break;
                    }
                } else if (zzneVarArr3[i13].zzr(zzmcVarZzn2)) {
                    i13++;
                }
                i10 = 1;
                break;
            }
        } else {
            i10 = 1;
            if (zzmcVarZzn.zzg.zzk || this.zzL) {
                zzne[] zzneVarArr4 = this.zzb;
                for (int i16 = 0; i16 < 2; i16++) {
                    zzne zzneVar = zzneVarArr4[i16];
                    if (zzneVar.zzp(zzmcVarZzn) && zzneVar.zzg(zzmcVarZzn)) {
                        long j10 = zzmcVarZzn.zzg.zzf;
                        zzneVar.zzh(zzmcVarZzn, (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? -9223372036854775807L : zzmcVarZzn.zza() + j10);
                    }
                }
            }
        }
        zzmc zzmcVarZzn3 = zzmfVar.zzn();
        if (zzmcVarZzn3 != null && zzmfVar.zzm() != zzmcVarZzn3 && !zzmcVarZzn3.zzh) {
            zzmc zzmcVarZzn4 = zzmfVar.zzn();
            zzabi zzabiVarZzr4 = zzmcVarZzn4.zzr();
            int i17 = i10;
            int i18 = 0;
            while (true) {
                zzneVarArr = this.zzb;
                if (i18 >= 2) {
                    break;
                }
                int iZzd = zzneVarArr[i18].zzd();
                int iZzH = zzneVarArr[i18].zzH(zzmcVarZzn4, zzabiVarZzr4, this.zzo);
                this.zzS -= iZzd - zzneVarArr[i18].zzd();
                i17 &= iZzH & 1;
                i18++;
            }
            if (i17 != 0) {
                for (int i19 = 0; i19 < 2; i19++) {
                    if (zzabiVarZzr4.zza(i19) && !zzneVarArr[i19].zzp(zzmcVarZzn4)) {
                        zzas(zzmcVarZzn4, i19, false, zzmcVarZzn4.zzc());
                    }
                }
                zzmfVar.zzn().zzh = i10;
            }
        }
        boolean z12 = false;
        while (zzay() && !this.zzL && (zzmcVarZzm = zzmfVar.zzm()) != null && (zzmcVarZzp = zzmcVarZzm.zzp()) != null && this.zzU >= zzmcVarZzp.zzc() && zzmcVarZzp.zzh) {
            if (z12) {
                zzC();
            }
            this.zzac = false;
            zzmc zzmcVarZzr = zzmfVar.zzr();
            zzmcVarZzr.getClass();
            if (this.zzH.zzb.zza.equals(zzmcVarZzr.zzg.zza.zza)) {
                zzxk zzxkVar = this.zzH.zzb;
                if (zzxkVar.zzb == -1) {
                    zzxk zzxkVar2 = zzmcVarZzr.zzg.zza;
                    if (zzxkVar2.zzb != -1 || zzxkVar.zze == zzxkVar2.zze) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            zzmd zzmdVar = zzmcVarZzr.zzg;
            boolean z13 = z11;
            zzxk zzxkVar3 = zzmdVar.zza;
            long j11 = zzmdVar.zzb;
            this.zzH = zzap(zzxkVar3, j11, zzmdVar.zzd, j11, !z13, 0);
            zzak();
            zzL();
            if (zzaA() && zzmcVarZzr == zzmfVar.zzo()) {
                zzne[] zzneVarArr5 = this.zzb;
                for (int i20 = 0; i20 < 2; i20++) {
                    zzneVarArr5[i20].zzB();
                }
            }
            if (this.zzH.zze == 3) {
                zzJ();
            }
            zzabi zzabiVarZzr5 = zzmfVar.zzm().zzr();
            int i21 = 0;
            while (true) {
                zzne[] zzneVarArr6 = this.zzb;
                if (i21 < 2) {
                    if (zzabiVarZzr5.zza(i21)) {
                        zzneVarArr6[i21].zzl();
                    }
                    i21++;
                }
            }
            z12 = true;
        }
        long j12 = this.zzaa.zzb;
    }

    private final void zzaj() {
        zzmf zzmfVar = this.zzs;
        zzmfVar.zzt();
        zzmc zzmcVarZzl = zzmfVar.zzl();
        if (zzmcVarZzl != null) {
            if (!zzmcVarZzl.zzd || zzmcVarZzl.zze) {
                zzxi zzxiVar = zzmcVarZzl.zza;
                if (zzxiVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzH.zza, zzmcVarZzl.zzg.zza, zzmcVarZzl.zze ? zzxiVar.zzi() : 0L)) {
                    if (!zzmcVarZzl.zzd) {
                        zzmcVarZzl.zzt(this, zzmcVarZzl.zzg.zzb);
                        return;
                    }
                    zzlz zzlzVar = new zzlz();
                    zzlzVar.zza(this.zzU - zzmcVarZzl.zza());
                    zzlzVar.zzb(this.zzo.zzj().zzb);
                    zzlzVar.zzc(this.zzN);
                    zzmcVarZzl.zzj(new zzma(zzlzVar, null));
                }
            }
        }
    }

    private final void zzak() {
        zzmc zzmcVarZzm = this.zzs.zzm();
        boolean z10 = false;
        if (zzmcVarZzm != null && zzmcVarZzm.zzg.zzj && this.zzK) {
            z10 = true;
        }
        this.zzL = z10;
    }

    private final void zzal(zzav zzavVar, boolean z10) {
        zzam(zzavVar, zzavVar.zzb, true, z10);
    }

    private final void zzam(zzav zzavVar, float f10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.zzI.zza(1);
            }
            zzms zzmsVar = this.zzH;
            this.zzH = new zzms(zzmsVar.zza, zzmsVar.zzb, zzmsVar.zzc, zzmsVar.zzd, zzmsVar.zze, zzmsVar.zzf, zzmsVar.zzg, zzmsVar.zzh, zzmsVar.zzi, zzmsVar.zzj, zzmsVar.zzk, zzmsVar.zzl, zzmsVar.zzm, zzmsVar.zzn, zzavVar, zzmsVar.zzq, zzmsVar.zzr, zzmsVar.zzs, zzmsVar.zzt, false);
        }
        float f11 = zzavVar.zzb;
        zzmc zzmcVarZzm = this.zzs.zzm();
        while (true) {
            i10 = 0;
            if (zzmcVarZzm == null) {
                break;
            }
            zzaba[] zzabaVarArr = zzmcVarZzm.zzr().zzc;
            int length = zzabaVarArr.length;
            while (i10 < length) {
                zzaba zzabaVar = zzabaVarArr[i10];
                i10++;
            }
            zzmcVarZzm = zzmcVarZzm.zzp();
        }
        zzne[] zzneVarArr = this.zzb;
        while (i10 < 2) {
            zzneVarArr[i10].zzm(f10, f11);
            i10++;
        }
    }

    private final void zzan() {
        long jZza;
        long jZza2;
        zzmf zzmfVar = this.zzs;
        boolean zZzh = false;
        if (zzaG(zzmfVar.zzk())) {
            zzmc zzmcVarZzk = zzmfVar.zzk();
            long jZzav = zzav(zzmcVarZzk.zzg());
            if (zzmcVarZzk == zzmfVar.zzm()) {
                jZza = this.zzU;
                jZza2 = zzmcVarZzk.zza();
            } else {
                jZza = this.zzU - zzmcVarZzk.zza();
                jZza2 = zzmcVarZzk.zzg.zzb;
            }
            zzlx zzlxVar = new zzlx(this.zzv, this.zzH.zza, zzmcVarZzk.zzg.zza, jZza - jZza2, jZzav, this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, zzP(this.zzH.zza, zzmcVarZzk.zzg.zza) ? this.zzae.zze() : C.TIME_UNSET, this.zzN);
            zzly zzlyVar = this.zzg;
            boolean zZzh2 = zzlyVar.zzh(zzlxVar);
            zzmc zzmcVarZzm = zzmfVar.zzm();
            if (zZzh2 || !zzmcVarZzm.zze || jZzav >= 500000 || this.zzn <= 0) {
                zZzh = zZzh2;
            } else {
                zzmcVarZzm.zza.zzf(this.zzH.zzs, false);
                zZzh = zzlyVar.zzh(zzlxVar);
            }
        }
        this.zzO = zZzh;
        if (zZzh) {
            zzmc zzmcVarZzk2 = zzmfVar.zzk();
            zzmcVarZzk2.getClass();
            zzlz zzlzVar = new zzlz();
            zzlzVar.zza(this.zzU - zzmcVarZzk2.zza());
            zzlzVar.zzb(this.zzo.zzj().zzb);
            zzlzVar.zzc(this.zzN);
            zzmcVarZzk2.zzj(new zzma(zzlzVar, null));
        }
        zzao();
    }

    private final void zzao() {
        zzmc zzmcVarZzk = this.zzs.zzk();
        boolean z10 = true;
        if (!this.zzO && (zzmcVarZzk == null || !zzmcVarZzk.zza.zzn())) {
            z10 = false;
        }
        zzms zzmsVar = this.zzH;
        if (z10 != zzmsVar.zzg) {
            this.zzH = zzmsVar.zzg(z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    private final zzms zzap(zzxk zzxkVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        zzabi zzabiVar;
        zzmc zzmcVarZzm;
        int i11 = 0;
        this.zzX = (!this.zzX && j10 == this.zzH.zzs && zzxkVar.equals(this.zzH.zzb)) ? false : true;
        zzak();
        zzms zzmsVar = this.zzH;
        zzzn zzznVar = zzmsVar.zzh;
        zzabi zzabiVar2 = zzmsVar.zzi;
        List listZzi = zzmsVar.zzj;
        if (this.zzt.zzb()) {
            zzmf zzmfVar = this.zzs;
            zzmc zzmcVarZzm2 = zzmfVar.zzm();
            zzzn zzznVarZzq = zzmcVarZzm2 == null ? zzzn.zza : zzmcVarZzm2.zzq();
            zzabi zzabiVarZzr = zzmcVarZzm2 == null ? this.zzf : zzmcVarZzm2.zzr();
            zzaba[] zzabaVarArr = zzabiVarZzr.zzc;
            zzgwj zzgwjVar = new zzgwj();
            boolean z11 = false;
            for (zzaba zzabaVar : zzabaVarArr) {
                if (zzabaVar != null) {
                    zzap zzapVar = zzabaVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgwjVar.zzf(new zzap(C.TIME_UNSET, new zzao[0]));
                    } else {
                        zzgwjVar.zzf(zzapVar);
                        z11 = true;
                    }
                }
            }
            zzgwm zzgwmVarZzi = z11 ? zzgwjVar.zzi() : zzgwm.zzi();
            if (zzmcVarZzm2 != null) {
                zzmd zzmdVar = zzmcVarZzm2.zzg;
                if (zzmdVar.zzd != j11) {
                    zzmcVarZzm2.zzg = zzmdVar.zzb(j11);
                }
            }
            if (zzmfVar.zzm() == zzmfVar.zzn() && (zzmcVarZzm = zzmfVar.zzm()) != null) {
                zzabi zzabiVarZzr2 = zzmcVarZzm.zzr();
                while (true) {
                    zzne[] zzneVarArr = this.zzb;
                    if (i11 >= 2) {
                        break;
                    }
                    if (zzabiVarZzr2.zza(i11)) {
                        if (zzneVarArr[i11].zze() != 1) {
                            break;
                        }
                        int i12 = zzabiVarZzr2.zzb[i11].zzb;
                    }
                    i11++;
                }
            }
            list = zzgwmVarZzi;
            zzznVar = zzznVarZzq;
            zzabiVar = zzabiVarZzr;
        } else {
            if (!zzxkVar.equals(this.zzH.zzb)) {
                zzabiVar2 = this.zzf;
                zzznVar = zzzn.zza;
                listZzi = zzgwm.zzi();
            }
            list = listZzi;
            zzabiVar = zzabiVar2;
        }
        if (z10) {
            this.zzI.zzc(i10);
        }
        return this.zzH.zzc(zzxkVar, j10, j11, j12, zzau(), zzznVar, zzabiVar, list);
    }

    private final void zzaq() throws zzjk {
        zzar(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzar(boolean[] zArr, long j10) throws zzjk {
        zzne[] zzneVarArr;
        long j11;
        zzmc zzmcVarZzn = this.zzs.zzn();
        zzabi zzabiVarZzr = zzmcVarZzn.zzr();
        int i10 = 0;
        while (true) {
            zzneVarArr = this.zzb;
            if (i10 >= 2) {
                break;
            }
            if (!zzabiVarZzr.zza(i10)) {
                zzneVarArr[i10].zzG();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < 2) {
            if (!zzabiVarZzr.zza(i11) || zzneVarArr[i11].zzp(zzmcVarZzn)) {
                j11 = j10;
            } else {
                j11 = j10;
                zzas(zzmcVarZzn, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    private final void zzas(zzmc zzmcVar, int i10, boolean z10, long j10) throws zzjk {
        zzne zzneVar = this.zzb[i10];
        if (zzneVar.zzM()) {
            return;
        }
        boolean z11 = zzmcVar == this.zzs.zzm();
        zzabi zzabiVarZzr = zzmcVar.zzr();
        zznd zzndVar = zzabiVarZzr.zzb[i10];
        zzaba zzabaVar = zzabiVarZzr.zzc[i10];
        boolean z12 = zzay() && this.zzH.zze == 3;
        boolean z13 = !z10 && z12;
        this.zzS++;
        zzneVar.zzx(zzndVar, zzabaVar, zzmcVar.zzc[i10], this.zzU, z13, z11, j10, zzmcVar.zza(), zzmcVar.zzg.zza, this.zzo);
        zzneVar.zzy(11, new zzli(this), zzmcVar);
        if (z12 && z11) {
            zzneVar.zzv();
        }
    }

    private final void zzat(boolean z10) {
        zzmc zzmcVarZzk = this.zzs.zzk();
        zzxk zzxkVar = zzmcVarZzk == null ? this.zzH.zzb : zzmcVarZzk.zzg.zza;
        boolean zEquals = this.zzH.zzk.equals(zzxkVar);
        if (!zEquals) {
            this.zzH = this.zzH.zzh(zzxkVar);
        }
        zzms zzmsVar = this.zzH;
        zzmsVar.zzq = zzmcVarZzk == null ? zzmsVar.zzs : zzmcVarZzk.zzf();
        this.zzH.zzr = zzau();
        if ((!zEquals || z10) && zzmcVarZzk != null && zzmcVarZzk.zze) {
            zzax(zzmcVarZzk.zzg.zza, zzmcVarZzk.zzq(), zzmcVarZzk.zzr());
        }
    }

    private final long zzau() {
        return zzav(this.zzH.zzq);
    }

    private final long zzav(long j10) {
        zzmc zzmcVarZzk = this.zzs.zzk();
        if (zzmcVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.zzU - zzmcVarZzk.zza()));
    }

    private final long zzaw(zzmc zzmcVar) {
        zzgtj.zzi(zzmcVar.zze);
        return (long) ((zzmcVar.zzc() - this.zzU) / this.zzo.zzj().zzb);
    }

    private final void zzax(zzxk zzxkVar, zzzn zzznVar, zzabi zzabiVar) {
        long jZza;
        long jZza2;
        zzmf zzmfVar = this.zzs;
        zzmc zzmcVarZzk = zzmfVar.zzk();
        zzmcVarZzk.getClass();
        if (zzmcVarZzk == zzmfVar.zzm()) {
            jZza = this.zzU;
            jZza2 = zzmcVarZzk.zza();
        } else {
            jZza = this.zzU - zzmcVarZzk.zza();
            jZza2 = zzmcVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzlx(this.zzv, this.zzH.zza, zzxkVar, jZza - jZza2, zzav(zzmcVarZzk.zzf()), this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, zzP(this.zzH.zza, zzmcVarZzk.zzg.zza) ? this.zzae.zze() : C.TIME_UNSET, this.zzN), zzznVar, zzabiVar.zzc);
    }

    private final boolean zzay() {
        zzms zzmsVar = this.zzH;
        return zzmsVar.zzl && zzmsVar.zzn == 0;
    }

    private final void zzaz(int i10) throws Throwable {
        zzne zzneVar = this.zzb[i10];
        try {
            zzmc zzmcVarZzm = this.zzs.zzm();
            if (zzmcVarZzm == null) {
                throw null;
            }
            zzneVar.zzu(zzmcVarZzm);
        } catch (IOException e10) {
            e = e10;
            zzneVar.zze();
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzneVar.zze();
            throw e;
        }
    }

    static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i10, boolean z10, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.zzb(zzbfVar3.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i11 = 0; i11 < zzbfVar2.zza(); i11++) {
            if (zzbfVar2.zzb(i11, zzbeVar, 0L).zzb.equals(obj2)) {
                return i11;
            }
        }
        int iZze = zzbfVar3.zze(obj);
        int iZzc = zzbfVar3.zzc();
        int iZze2 = -1;
        int i12 = 0;
        while (i12 < iZzc && iZze2 == -1) {
            zzbf zzbfVar4 = zzbfVar3;
            int iZzl = zzbfVar4.zzl(iZze, zzbdVar, zzbeVar, i10, z10);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbfVar2.zze(zzbfVar4.zzf(iZzl));
            i12++;
            zzbfVar3 = zzbfVar4;
            iZze = iZzl;
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(iZze2, zzbdVar, false).zzc;
    }

    static final /* synthetic */ void zzz(zzmw zzmwVar) {
        try {
            zzaF(zzmwVar);
        } catch (zzjk e10) {
            zzeg.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:261:0x0563 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0569 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:265:0x056d A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:266:0x0577 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x0579  */
    /* JADX WARN: Code duplicated, block: B:268:0x057f A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:270:0x0583 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:272:0x0595 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:273:0x059e  */
    /* JADX WARN: Code duplicated, block: B:279:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:285:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:290:0x0613 A[PHI: r35
      0x0613: PHI (r35v4 long) = (r35v2 long), (r9v2 long) binds: [B:291:0x0615, B:289:0x0611] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:294:0x0624 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:295:0x0631 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, PHI: r35 r37
      0x0631: PHI (r35v1 long) = (r35v0 long), (r9v2 long) binds: [B:267:0x0579, B:289:0x0611] A[DONT_GENERATE, DONT_INLINE]
      0x0631: PHI (r37v1 boolean) = (r37v0 boolean), (r8v4 boolean) binds: [B:267:0x0579, B:289:0x0611] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:297:0x0638 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:299:0x063c A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:301:0x0642  */
    /* JADX WARN: Code duplicated, block: B:302:0x0643 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:303:0x0645 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:305:0x0654 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:307:0x065a A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:309:0x0664 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, LOOP:7: B:308:0x0662->B:309:0x0664, LOOP_END, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:338:0x06d2 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0025, zzwk -> 0x0028, zzhq -> 0x002b, zzat -> 0x002e, zzuf -> 0x0031, zzjk -> 0x0034, TryCatch #7 {zzat -> 0x002e, zzhq -> 0x002b, zzjk -> 0x0034, zzuf -> 0x0031, zzwk -> 0x0028, IOException -> 0x0025, RuntimeException -> 0x0022, blocks: (B:3:0x000b, B:4:0x0012, B:6:0x0016, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0053, B:31:0x0057, B:33:0x005f, B:34:0x0064, B:36:0x0068, B:37:0x0072, B:39:0x007f, B:40:0x0086, B:41:0x008c, B:43:0x0095, B:44:0x009d, B:45:0x00a4, B:46:0x00b3, B:47:0x00c0, B:51:0x00d1, B:52:0x00d9, B:54:0x00e8, B:55:0x00f0, B:60:0x00ff, B:58:0x00f8, B:61:0x0104, B:65:0x0120, B:66:0x0138, B:67:0x0149, B:68:0x0161, B:69:0x0166, B:70:0x016b, B:74:0x0172, B:76:0x017b, B:78:0x0187, B:79:0x018f, B:80:0x019a, B:81:0x01ae, B:82:0x01c6, B:83:0x01dc, B:85:0x01eb, B:86:0x01ef, B:87:0x0200, B:89:0x020f, B:90:0x022b, B:91:0x023e, B:92:0x0247, B:94:0x0259, B:95:0x0265, B:96:0x0275, B:98:0x0281, B:101:0x028c, B:102:0x0293, B:103:0x029e, B:107:0x02a5, B:109:0x02ad, B:111:0x02b1, B:113:0x02b6, B:115:0x02c0, B:116:0x02c5, B:120:0x02cc, B:122:0x02dc, B:126:0x02e6, B:123:0x02e0, B:125:0x02e3, B:127:0x02eb, B:129:0x02fd, B:133:0x0307, B:130:0x0301, B:132:0x0304, B:134:0x030c, B:135:0x0311, B:137:0x031d, B:138:0x0327, B:140:0x032d, B:148:0x0348, B:155:0x0397, B:185:0x03dc, B:188:0x03e4, B:189:0x03e5, B:191:0x03ed, B:193:0x040a, B:194:0x040e, B:202:0x0442, B:204:0x0450, B:205:0x045d, B:206:0x045e, B:207:0x0465, B:208:0x046f, B:209:0x0483, B:210:0x048e, B:212:0x049d, B:213:0x04a0, B:219:0x04ad, B:220:0x04b0, B:222:0x04b8, B:223:0x04bd, B:225:0x04c9, B:226:0x04e5, B:228:0x04e9, B:230:0x04f1, B:245:0x051b, B:231:0x04f5, B:233:0x04fe, B:237:0x0507, B:243:0x0517, B:247:0x0528, B:249:0x0533, B:253:0x053b, B:255:0x0543, B:257:0x0547, B:258:0x0552, B:260:0x0558, B:313:0x0676, B:316:0x067d, B:318:0x0681, B:320:0x0689, B:321:0x068c, B:322:0x068f, B:324:0x0695, B:326:0x069e, B:328:0x06a8, B:330:0x06ae, B:332:0x06b4, B:339:0x06d6, B:341:0x06dc, B:345:0x06e6, B:355:0x06fe, B:352:0x06f7, B:354:0x06fb, B:333:0x06bb, B:336:0x06c9, B:337:0x06d1, B:338:0x06d2, B:261:0x0563, B:263:0x0569, B:265:0x056d, B:292:0x0618, B:294:0x0624, B:295:0x0631, B:297:0x0638, B:299:0x063c, B:303:0x0645, B:305:0x0654, B:307:0x065a, B:309:0x0664, B:310:0x0669, B:311:0x066e, B:312:0x0673, B:268:0x057f, B:270:0x0583, B:272:0x0595, B:274:0x05a0, B:276:0x05aa, B:280:0x05b3, B:282:0x05bd, B:288:0x05c8, B:246:0x0521, B:357:0x0704, B:361:0x070b), top: B:438:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:375:0x074f  */
    /* JADX WARN: Code duplicated, block: B:377:0x0753  */
    /* JADX WARN: Code duplicated, block: B:378:0x0756  */
    /* JADX WARN: Code duplicated, block: B:379:0x0759  */
    /* JADX WARN: Code duplicated, block: B:410:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:412:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:415:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:417:0x07fe A[LOOP:9: B:417:0x07fe->B:419:0x0808, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:419:0x0808 A[LOOP:9: B:417:0x07fe->B:419:0x0808, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:307:0x065a, please report this as an issue */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        zzjk zzjkVar;
        boolean z10;
        int i10;
        zzmf zzmfVar;
        zzxk zzxkVar;
        zzmc zzmcVarZzn;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        zzms zzmsVar;
        zzmc zzmcVarZzm;
        int i12;
        zzmc zzmcVarZzm2;
        long jZze;
        zzmc zzmcVarZzk;
        boolean z14;
        boolean z15;
        boolean zZzi;
        try {
            zzd zzdVar = null;
            switch (message.what) {
                case 1:
                    boolean z16 = message.arg1 != 0;
                    int i13 = message.arg2;
                    zzE(z16, i13 >> 4, true, i13 & 15);
                    z10 = true;
                    zzC();
                    return z10;
                case 2:
                    z11 = true;
                    boolean z17 = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    this.zzi.zzk(2);
                    boolean z18 = this.zzA;
                    if (!z18) {
                        zzai();
                    }
                    int i14 = this.zzH.zze;
                    if (i14 != 1 && i14 != 4) {
                        if (z18) {
                            zzai();
                        }
                        zzmf zzmfVar2 = this.zzs;
                        zzmc zzmcVarZzm3 = zzmfVar2.zzm();
                        if (zzmcVarZzm3 != null) {
                            Trace.beginSection("doSomeWork");
                            zzL();
                            if (zzmcVarZzm3.zze) {
                                this.zzV = zzfl.zzs(SystemClock.elapsedRealtime());
                                zzmcVarZzm3.zza.zzf(this.zzH.zzs - this.zzn, false);
                                z12 = true;
                                z13 = true;
                                int i15 = 0;
                                while (true) {
                                    zzne[] zzneVarArr = this.zzb;
                                    if (i15 < 2) {
                                        zzne zzneVar = zzneVarArr[i15];
                                        if (zzneVar.zzd() == 0) {
                                            zzN(i15, z17);
                                        } else {
                                            zzneVar.zzs(this.zzU, this.zzV);
                                            z12 = z12 && zzneVar.zzo();
                                            boolean zZzt = zzneVar.zzt(zzmcVarZzm3);
                                            zzN(i15, zZzt);
                                            boolean z19 = z13 && zZzt;
                                            if (!zZzt) {
                                                zzaz(i15);
                                            }
                                            z13 = z19;
                                        }
                                        i15++;
                                        z17 = false;
                                    }
                                }
                            } else {
                                zzmcVarZzm3.zza.zzc();
                                z12 = true;
                                z13 = true;
                            }
                            long j10 = zzmcVarZzm3.zzg.zzf;
                            long j11 = C.TIME_UNSET;
                            if (z12 && zzmcVarZzm3.zze && (j10 == C.TIME_UNSET || j10 <= this.zzH.zzs)) {
                                if (this.zzL) {
                                    this.zzL = false;
                                    zzE(false, this.zzH.zzn, false, 5);
                                }
                                if (zzmcVarZzm3.zzg.zzk) {
                                    zzB(4);
                                    zzK();
                                    j11 = -9223372036854775807L;
                                } else {
                                    zzmsVar = this.zzH;
                                    if (zzmsVar.zze != 2) {
                                        z13 = z13;
                                        j11 = -9223372036854775807L;
                                        if (this.zzH.zze == 3) {
                                            if (this.zzS == 0) {
                                                if (!zzae()) {
                                                    zzaD(zzay(), false);
                                                    zzB(2);
                                                    if (this.zzM) {
                                                        for (zzmcVarZzm = zzmfVar2.zzm(); zzmcVarZzm != null; zzmcVarZzm = zzmcVarZzm.zzp()) {
                                                            for (zzaba zzabaVar : zzmcVarZzm.zzr().zzc) {
                                                            }
                                                        }
                                                        this.zzae.zzc();
                                                    }
                                                    zzK();
                                                }
                                            } else if (!z13) {
                                                zzaD(zzay(), false);
                                                zzB(2);
                                                if (this.zzM) {
                                                    while (zzmcVarZzm != null) {
                                                        while (i12 < r7) {
                                                        }
                                                    }
                                                    this.zzae.zzc();
                                                }
                                                zzK();
                                            }
                                        }
                                    } else {
                                        if (this.zzS == 0) {
                                            zZzi = zzae();
                                        } else {
                                            if (z13) {
                                                if (zzmsVar.zzg) {
                                                    zzmcVarZzm2 = zzmfVar2.zzm();
                                                    if (zzP(this.zzH.zza, zzmcVarZzm2.zzg.zza)) {
                                                        jZze = this.zzae.zze();
                                                    } else {
                                                        jZze = -9223372036854775807L;
                                                    }
                                                    zzmcVarZzk = zzmfVar2.zzk();
                                                    if (zzmcVarZzk.zzd()) {
                                                        z14 = false;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (zzmcVarZzk.zzg.zza.zzb()) {
                                                        z15 = false;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    if (z14) {
                                                    }
                                                }
                                                j11 = -9223372036854775807L;
                                                zzB(3);
                                                this.zzY = null;
                                                if (zzay()) {
                                                    zzaD(false, false);
                                                    this.zzo.zza();
                                                    zzJ();
                                                }
                                            } else {
                                                z13 = z13;
                                                j11 = -9223372036854775807L;
                                            }
                                            if (this.zzH.zze == 3) {
                                                if (this.zzS == 0) {
                                                    if (!zzae()) {
                                                        zzaD(zzay(), false);
                                                        zzB(2);
                                                        if (this.zzM) {
                                                            while (zzmcVarZzm != null) {
                                                                while (i12 < r7) {
                                                                }
                                                            }
                                                            this.zzae.zzc();
                                                        }
                                                        zzK();
                                                    }
                                                } else if (!z13) {
                                                    zzaD(zzay(), false);
                                                    zzB(2);
                                                    if (this.zzM) {
                                                        while (zzmcVarZzm != null) {
                                                            while (i12 < r7) {
                                                            }
                                                        }
                                                        this.zzae.zzc();
                                                    }
                                                    zzK();
                                                }
                                            }
                                        }
                                        if (zZzi) {
                                            zzB(3);
                                            this.zzY = null;
                                            if (zzay()) {
                                                zzaD(false, false);
                                                this.zzo.zza();
                                                zzJ();
                                            }
                                        } else if (this.zzH.zze == 3) {
                                            if (this.zzS == 0) {
                                                if (!zzae()) {
                                                    zzaD(zzay(), false);
                                                    zzB(2);
                                                    if (this.zzM) {
                                                        while (zzmcVarZzm != null) {
                                                            while (i12 < r7) {
                                                            }
                                                        }
                                                        this.zzae.zzc();
                                                    }
                                                    zzK();
                                                }
                                            } else if (!z13) {
                                                zzaD(zzay(), false);
                                                zzB(2);
                                                if (this.zzM) {
                                                    while (zzmcVarZzm != null) {
                                                        while (i12 < r7) {
                                                        }
                                                    }
                                                    this.zzae.zzc();
                                                }
                                                zzK();
                                            }
                                        }
                                    }
                                }
                            } else {
                                zzmsVar = this.zzH;
                                if (zzmsVar.zze != 2) {
                                    z13 = z13;
                                    j11 = -9223372036854775807L;
                                    if (this.zzH.zze == 3) {
                                        if (this.zzS == 0) {
                                            if (!zzae()) {
                                                zzaD(zzay(), false);
                                                zzB(2);
                                                if (this.zzM) {
                                                    while (zzmcVarZzm != null) {
                                                        while (i12 < r7) {
                                                        }
                                                    }
                                                    this.zzae.zzc();
                                                }
                                                zzK();
                                            }
                                        } else if (!z13) {
                                            zzaD(zzay(), false);
                                            zzB(2);
                                            if (this.zzM) {
                                                while (zzmcVarZzm != null) {
                                                    while (i12 < r7) {
                                                    }
                                                }
                                                this.zzae.zzc();
                                            }
                                            zzK();
                                        }
                                    }
                                } else {
                                    if (this.zzS == 0) {
                                        zZzi = zzae();
                                    } else {
                                        if (z13) {
                                            z13 = z13;
                                            j11 = -9223372036854775807L;
                                        } else {
                                            if (zzmsVar.zzg) {
                                                zzmcVarZzm2 = zzmfVar2.zzm();
                                                if (zzP(this.zzH.zza, zzmcVarZzm2.zzg.zza)) {
                                                    jZze = this.zzae.zze();
                                                } else {
                                                    jZze = -9223372036854775807L;
                                                }
                                                zzmcVarZzk = zzmfVar2.zzk();
                                                if (zzmcVarZzk.zzd() || !zzmcVarZzk.zzg.zzk) {
                                                    z14 = false;
                                                } else {
                                                    z14 = true;
                                                }
                                                if (zzmcVarZzk.zzg.zza.zzb() || zzmcVarZzk.zze) {
                                                    z15 = false;
                                                } else {
                                                    z15 = true;
                                                }
                                                if (z14 && !z15) {
                                                    zZzi = this.zzg.zzi(new zzlx(this.zzv, this.zzH.zza, zzmcVarZzm2.zzg.zza, this.zzU - zzmcVarZzm2.zza(), zzav(zzmcVarZzk.zzf()), this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, jZze, this.zzN));
                                                }
                                                zzB(3);
                                                this.zzY = null;
                                                if (zzay()) {
                                                    zzaD(false, false);
                                                    this.zzo.zza();
                                                    zzJ();
                                                }
                                            }
                                            j11 = -9223372036854775807L;
                                            zzB(3);
                                            this.zzY = null;
                                            if (zzay()) {
                                                zzaD(false, false);
                                                this.zzo.zza();
                                                zzJ();
                                            }
                                        }
                                        if (this.zzH.zze == 3) {
                                            if (this.zzS == 0) {
                                                if (!zzae()) {
                                                    zzaD(zzay(), false);
                                                    zzB(2);
                                                    if (this.zzM) {
                                                        while (zzmcVarZzm != null) {
                                                            while (i12 < r7) {
                                                            }
                                                        }
                                                        this.zzae.zzc();
                                                    }
                                                    zzK();
                                                }
                                            } else if (!z13) {
                                                zzaD(zzay(), false);
                                                zzB(2);
                                                if (this.zzM) {
                                                    while (zzmcVarZzm != null) {
                                                        while (i12 < r7) {
                                                        }
                                                    }
                                                    this.zzae.zzc();
                                                }
                                                zzK();
                                            }
                                        }
                                    }
                                    if (zZzi) {
                                        zzB(3);
                                        this.zzY = null;
                                        if (zzay()) {
                                            zzaD(false, false);
                                            this.zzo.zza();
                                            zzJ();
                                        }
                                    } else if (this.zzH.zze == 3) {
                                        if (this.zzS == 0) {
                                            if (!zzae()) {
                                                zzaD(zzay(), false);
                                                zzB(2);
                                                if (this.zzM) {
                                                    while (zzmcVarZzm != null) {
                                                        while (i12 < r7) {
                                                        }
                                                    }
                                                    this.zzae.zzc();
                                                }
                                                zzK();
                                            }
                                        } else if (!z13) {
                                            zzaD(zzay(), false);
                                            zzB(2);
                                            if (this.zzM) {
                                                while (zzmcVarZzm != null) {
                                                    while (i12 < r7) {
                                                    }
                                                }
                                                this.zzae.zzc();
                                            }
                                            zzK();
                                        }
                                    }
                                }
                            }
                            if (this.zzH.zze == 2) {
                                int i16 = 0;
                                while (true) {
                                    zzne[] zzneVarArr2 = this.zzb;
                                    if (i16 < 2) {
                                        if (zzneVarArr2[i16].zzp(zzmcVarZzm3)) {
                                            zzaz(i16);
                                        }
                                        i16++;
                                    } else {
                                        zzms zzmsVar2 = this.zzH;
                                        if (zzmsVar2.zzg || zzmsVar2.zzr >= 500000 || !zzaG(zzmfVar2.zzk()) || !zzay()) {
                                            this.zzZ = j11;
                                        } else if (this.zzZ == j11) {
                                            this.zzZ = SystemClock.elapsedRealtime();
                                        } else if (SystemClock.elapsedRealtime() - this.zzZ >= 4000) {
                                            throw new zzfd(0, 4000);
                                        }
                                    }
                                }
                            } else {
                                this.zzZ = j11;
                            }
                            boolean z20 = zzay() && this.zzH.zze == 3;
                            zzms zzmsVar3 = this.zzH;
                            boolean z21 = zzmsVar3.zzp;
                            int i17 = zzmsVar3.zze;
                            if (i17 != 4 && (z20 || i17 == 2 || (i17 == 3 && this.zzS != 0))) {
                                zzQ(jUptimeMillis);
                            }
                            Trace.endSection();
                            z10 = true;
                            zzC();
                            return z10;
                        }
                        zzQ(jUptimeMillis);
                    }
                    z10 = z11;
                    zzC();
                    return z10;
                case 3:
                    z11 = true;
                    zzR((zzlt) message.obj);
                    z10 = z11;
                    zzC();
                    return z10;
                case 4:
                    z11 = true;
                    zzM((zzav) message.obj);
                    zzal(this.zzo.zzj(), true);
                    z10 = z11;
                    zzC();
                    return z10;
                case 5:
                    z11 = true;
                    this.zzB = (zzni) message.obj;
                    z10 = z11;
                    zzC();
                    return z10;
                case 6:
                    z11 = true;
                    zzW(false, true);
                    z10 = z11;
                    zzC();
                    return z10;
                case 7:
                    zzds zzdsVar = (zzds) message.obj;
                    try {
                        zzX(true, false, true, false);
                        int i18 = 0;
                        while (true) {
                            zzne[] zzneVarArr3 = this.zzb;
                            if (i18 >= 2) {
                                this.zzg.zzd(this.zzv);
                                this.zzz.zzd();
                                this.zze.zzb();
                                zzB(1);
                                return true;
                            }
                            this.zzc[i18].zzw();
                            zzneVarArr3[i18].zzI();
                            i18++;
                        }
                    } finally {
                        this.zzi.zzl(null);
                        this.zzj.zzb();
                        zzdsVar.zza();
                    }
                    break;
                case 8:
                    try {
                        zzxi zzxiVar = (zzxi) message.obj;
                        zzmf zzmfVar3 = this.zzs;
                        if (zzmfVar3.zzd(zzxiVar)) {
                            zzmc zzmcVarZzk2 = zzmfVar3.zzk();
                            if (zzmcVarZzk2 == null) {
                                throw null;
                            }
                            if (!zzmcVarZzk2.zze) {
                                float f10 = this.zzo.zzj().zzb;
                                zzms zzmsVar4 = this.zzH;
                                zzmcVarZzk2.zzh(f10, zzmsVar4.zza, zzmsVar4.zzl);
                            }
                            zzax(zzmcVarZzk2.zzg.zza, zzmcVarZzk2.zzq(), zzmcVarZzk2.zzr());
                            if (zzmcVarZzk2 == zzmfVar3.zzm()) {
                                zzU(zzmcVarZzk2.zzg.zzb, true);
                                zzaq();
                                zzmcVarZzk2.zzh = true;
                                zzms zzmsVar5 = this.zzH;
                                try {
                                    zzxk zzxkVar2 = zzmsVar5.zzb;
                                    long j12 = zzmcVarZzk2.zzg.zzb;
                                    z11 = true;
                                    this.zzH = zzap(zzxkVar2, j12, zzmsVar5.zzc, j12, false, 5);
                                } catch (zzat e10) {
                                    e = e10;
                                    if (e.zzb == 1) {
                                        i11 = 1000;
                                    } else if (true != e.zza) {
                                        i11 = 3003;
                                    } else {
                                        i11 = 3001;
                                    }
                                    zzA(e, i11);
                                    z10 = true;
                                } catch (zzhq e11) {
                                    e = e11;
                                    zzA(e, e.zza);
                                    z10 = true;
                                } catch (zzjk e12) {
                                    e = e12;
                                    if (e.zzc == 1 && (zzmcVarZzn = this.zzs.zzn()) != null && e.zzh == null) {
                                        e = e.zzd(zzmcVarZzn.zzg.zza);
                                    }
                                    if (e.zzc != 1 || (zzxkVar = e.zzh) == null) {
                                        zzjkVar = this.zzY;
                                        if (zzjkVar != null) {
                                            zzjkVar.addSuppressed(e);
                                            e = this.zzY;
                                        }
                                        if (e.zzc == 1) {
                                            zzmfVar = this.zzs;
                                            if (zzmfVar.zzm() != zzmfVar.zzn()) {
                                                while (zzmfVar.zzm() != zzmfVar.zzn()) {
                                                    zzmfVar.zzr();
                                                }
                                                zzmc zzmcVarZzm4 = zzmfVar.zzm();
                                                zzmcVarZzm4.getClass();
                                                zzC();
                                                zzmd zzmdVar = zzmcVarZzm4.zzg;
                                                zzxk zzxkVar3 = zzmdVar.zza;
                                                long j13 = zzmdVar.zzb;
                                                this.zzH = zzap(zzxkVar3, j13, zzmdVar.zzd, j13, true, 0);
                                            }
                                        }
                                        if (e.zzi || !(this.zzY == null || (i10 = e.zza) == 5004 || i10 == 5003)) {
                                            zzeg.zzf("ExoPlayerImplInternal", "Playback error", e);
                                            z10 = true;
                                            zzW(true, false);
                                            this.zzH = this.zzH.zzf(e);
                                        } else {
                                            zzeg.zzd("ExoPlayerImplInternal", "Recoverable renderer error", e);
                                            if (this.zzY == null) {
                                                this.zzY = e;
                                            }
                                            zzdz zzdzVar = this.zzi;
                                            zzdzVar.zzg(zzdzVar.zzd(25, e));
                                            z10 = true;
                                        }
                                    } else {
                                        int i19 = e.zze;
                                        zzmf zzmfVar4 = this.zzs;
                                        if (zzmfVar4.zzo() != null && zzmfVar4.zzo().zzg.zza.equals(zzxkVar) && this.zzb[i19].zzq(zzmfVar4.zzo())) {
                                            this.zzac = true;
                                            zzab();
                                            zzmc zzmcVarZzo = zzmfVar4.zzo();
                                            zzmc zzmcVarZzm5 = zzmfVar4.zzm();
                                            if (zzmfVar4.zzm() != zzmcVarZzo) {
                                                while (zzmcVarZzm5 != null && zzmcVarZzm5.zzp() != zzmcVarZzo) {
                                                    zzmcVarZzm5 = zzmcVarZzm5.zzp();
                                                }
                                            }
                                            zzmfVar4.zzs(zzmcVarZzm5);
                                            if (this.zzH.zze != 4) {
                                                zzan();
                                                this.zzi.zzh(2);
                                            }
                                        } else {
                                            zzjkVar = this.zzY;
                                            if (zzjkVar != null) {
                                                zzjkVar.addSuppressed(e);
                                                e = this.zzY;
                                            }
                                            if (e.zzc == 1) {
                                                zzmfVar = this.zzs;
                                                if (zzmfVar.zzm() != zzmfVar.zzn()) {
                                                    while (zzmfVar.zzm() != zzmfVar.zzn()) {
                                                        zzmfVar.zzr();
                                                    }
                                                    zzmc zzmcVarZzm6 = zzmfVar.zzm();
                                                    zzmcVarZzm6.getClass();
                                                    zzC();
                                                    zzmd zzmdVar2 = zzmcVarZzm6.zzg;
                                                    zzxk zzxkVar4 = zzmdVar2.zza;
                                                    long j14 = zzmdVar2.zzb;
                                                    this.zzH = zzap(zzxkVar4, j14, zzmdVar2.zzd, j14, true, 0);
                                                }
                                            }
                                            if (e.zzi) {
                                            }
                                            zzeg.zzf("ExoPlayerImplInternal", "Playback error", e);
                                            z10 = true;
                                            zzW(true, false);
                                            this.zzH = this.zzH.zzf(e);
                                        }
                                        z10 = true;
                                    }
                                } catch (zzuf e13) {
                                    e = e13;
                                    zzA(e, e.zza);
                                    z10 = true;
                                } catch (zzwk e14) {
                                    e = e14;
                                    zzA(e, 1002);
                                    z10 = true;
                                } catch (IOException e15) {
                                    e = e15;
                                    zzA(e, 2000);
                                    z10 = true;
                                } catch (RuntimeException e16) {
                                    e = e16;
                                    zzjk zzjkVarZzc = zzjk.zzc(e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                                    zzeg.zzf("ExoPlayerImplInternal", "Playback error", zzjkVarZzc);
                                    zzW(true, false);
                                    this.zzH = this.zzH.zzf(zzjkVarZzc);
                                    z10 = true;
                                }
                            } else {
                                z11 = true;
                            }
                            zzan();
                            if (e.zzb == 1) {
                                i11 = 1000;
                            } else if (true != e.zza) {
                                i11 = 3003;
                            } else {
                                i11 = 3001;
                            }
                            zzA(e, i11);
                            z10 = true;
                            zzC();
                            return z10;
                        }
                        z11 = true;
                        zzmc zzmcVarZzu = zzmfVar3.zzu(zzxiVar);
                        if (zzmcVarZzu != null) {
                            zzgtj.zzi(!zzmcVarZzu.zze);
                            float f11 = this.zzo.zzj().zzb;
                            zzms zzmsVar6 = this.zzH;
                            zzmcVarZzu.zzh(f11, zzmsVar6.zza, zzmsVar6.zzl);
                            if (zzmfVar3.zze(zzxiVar)) {
                                zzaj();
                            }
                        }
                        z10 = z11;
                    } catch (zzat e17) {
                        e = e17;
                    } catch (zzhq e18) {
                        e = e18;
                    } catch (zzjk e19) {
                        e = e19;
                    } catch (zzuf e20) {
                        e = e20;
                    } catch (zzwk e21) {
                        e = e21;
                    } catch (IOException e22) {
                        e = e22;
                    } catch (RuntimeException e23) {
                        e = e23;
                    }
                    zzC();
                    return z10;
                case 9:
                    zzxi zzxiVar2 = (zzxi) message.obj;
                    zzmf zzmfVar5 = this.zzs;
                    if (zzmfVar5.zzd(zzxiVar2)) {
                        zzmfVar5.zzf(this.zzU);
                        zzan();
                    } else if (zzmfVar5.zze(zzxiVar2)) {
                        zzaj();
                    }
                    z10 = true;
                    zzC();
                    return z10;
                case 10:
                    zzad();
                    z10 = true;
                    zzC();
                    return z10;
                case 11:
                    int i20 = message.arg1;
                    this.zzP = i20;
                    int iZza = this.zzs.zza(this.zzH.zza, i20);
                    if ((iZza & 1) != 0) {
                        zzI(true);
                    } else if ((iZza & 2) != 0) {
                        zzab();
                    }
                    zzat(false);
                    z10 = true;
                    zzC();
                    return z10;
                case 12:
                    boolean z22 = message.arg1 != 0;
                    this.zzQ = z22;
                    int iZzb = this.zzs.zzb(this.zzH.zza, z22);
                    if ((iZzb & 1) != 0) {
                        zzI(true);
                    } else if ((iZzb & 2) != 0) {
                        zzab();
                    }
                    zzat(false);
                    z10 = true;
                    zzC();
                    return z10;
                case 13:
                    boolean z23 = message.arg1 != 0;
                    zzds zzdsVar2 = (zzds) message.obj;
                    if (this.zzR != z23) {
                        this.zzR = z23;
                        if (!z23) {
                            zzne[] zzneVarArr4 = this.zzb;
                            for (int i21 = 0; i21 < 2; i21++) {
                                zzneVarArr4[i21].zzG();
                            }
                        }
                    }
                    if (zzdsVar2 != null) {
                        zzdsVar2.zza();
                    }
                    z10 = true;
                    zzC();
                    return z10;
                case 14:
                    zzmw zzmwVar = (zzmw) message.obj;
                    if (zzmwVar.zzf() == this.zzk) {
                        zzaF(zzmwVar);
                        int i22 = this.zzH.zze;
                        if (i22 == 3 || i22 == 2) {
                            this.zzi.zzh(2);
                        }
                    } else {
                        this.zzi.zzd(15, zzmwVar).zza();
                    }
                    z10 = true;
                    zzC();
                    return z10;
                case 15:
                    final zzmw zzmwVar2 = (zzmw) message.obj;
                    Looper looperZzf = zzmwVar2.zzf();
                    if (looperZzf.getThread().isAlive()) {
                        this.zzq.zzd(looperZzf, null).zzm(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzlm
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzlu.zzz(zzmwVar2);
                            }
                        });
                    } else {
                        zzeg.zzc("TAG", "Trying to send message on a dead thread.");
                        zzmwVar2.zzi(false);
                    }
                    z10 = true;
                    zzC();
                    return z10;
                case 16:
                    zzal((zzav) message.obj, false);
                    z10 = true;
                    zzC();
                    return z10;
                case 17:
                    zzlo zzloVar = (zzlo) message.obj;
                    this.zzI.zza(1);
                    if (zzloVar.zzb() != -1) {
                        this.zzT = new zzlt(new zzmy(zzloVar.zza(), zzloVar.zzd()), zzloVar.zzb(), zzloVar.zzc());
                    }
                    zzaf(this.zzt.zzl(zzloVar.zza(), zzloVar.zzd()), false);
                    z10 = true;
                    zzC();
                    return z10;
                case 18:
                    zzlo zzloVar2 = (zzlo) message.obj;
                    int iZzc = message.arg1;
                    this.zzI.zza(1);
                    zzmr zzmrVar = this.zzt;
                    if (iZzc == -1) {
                        iZzc = zzmrVar.zzc();
                    }
                    zzaf(zzmrVar.zzm(iZzc, zzloVar2.zza(), zzloVar2.zzd()), false);
                    z10 = true;
                    zzC();
                    return z10;
                case 19:
                    zzlp zzlpVar = (zzlp) message.obj;
                    this.zzI.zza(1);
                    zzmr zzmrVar2 = this.zzt;
                    int i23 = zzlpVar.zza;
                    zzaf(zzmrVar2.zzo(0, 0, 0, null), false);
                    z10 = true;
                    zzC();
                    return z10;
                case 20:
                    int i24 = message.arg1;
                    int i25 = message.arg2;
                    zzzf zzzfVar = (zzzf) message.obj;
                    this.zzI.zza(1);
                    zzaf(this.zzt.zzn(i24, i25, zzzfVar), false);
                    z10 = true;
                    zzC();
                    return z10;
                case 21:
                    zzzf zzzfVar2 = (zzzf) message.obj;
                    this.zzI.zza(1);
                    zzaf(this.zzt.zzp(zzzfVar2), false);
                    z10 = true;
                    zzC();
                    return z10;
                case 22:
                    zzaf(this.zzt.zzh(), true);
                    z10 = true;
                    zzC();
                    return z10;
                case 23:
                    this.zzK = message.arg1 != 0;
                    zzak();
                    if (this.zzL) {
                        zzmf zzmfVar6 = this.zzs;
                        if (zzmfVar6.zzn() != zzmfVar6.zzm()) {
                            zzI(true);
                            zzat(false);
                        }
                    }
                    z10 = true;
                    zzC();
                    return z10;
                case 24:
                default:
                    return false;
                case 25:
                    zzac();
                    z10 = true;
                    zzC();
                    return z10;
                case 26:
                    zzac();
                    z10 = true;
                    zzC();
                    return z10;
                case 27:
                    int i26 = message.arg1;
                    int i27 = message.arg2;
                    List list = (List) message.obj;
                    this.zzI.zza(1);
                    zzaf(this.zzt.zza(i26, i27, list), false);
                    z10 = true;
                    zzC();
                    return z10;
                case 28:
                    zzju zzjuVar = (zzju) message.obj;
                    this.zzaa = zzjuVar;
                    this.zzs.zzc(this.zzH.zza, zzjuVar);
                    z10 = true;
                    zzC();
                    return z10;
                case 29:
                    this.zzI.zza(1);
                    zzX(false, false, false, true);
                    this.zzg.zza(this.zzv);
                    zzB(true != this.zzH.zza.zzg() ? 2 : 4);
                    zzF();
                    this.zzt.zzd(this.zzh.zze());
                    this.zzi.zzh(2);
                    z10 = true;
                    zzC();
                    return z10;
                case 30:
                    Pair pair = (Pair) message.obj;
                    Object obj = pair.first;
                    zzds zzdsVar3 = (zzds) pair.second;
                    zzne[] zzneVarArr5 = this.zzb;
                    for (int i28 = 0; i28 < 2; i28++) {
                        zzneVarArr5[i28].zzJ(obj);
                    }
                    int i29 = this.zzH.zze;
                    if (i29 == 3 || i29 == 2) {
                        this.zzi.zzh(2);
                    }
                    if (zzdsVar3 != null) {
                        zzdsVar3.zza();
                    }
                    z10 = true;
                    zzC();
                    return z10;
                case 31:
                    zzd zzdVar2 = (zzd) message.obj;
                    int i30 = message.arg1;
                    this.zze.zze(zzdVar2);
                    zzcd zzcdVar = this.zzz;
                    if (i30 != 0) {
                        zzdVar = zzdVar2;
                    }
                    zzcdVar.zzb(zzdVar);
                    zzF();
                    z10 = true;
                    zzC();
                    return z10;
                case 32:
                    zzD(((Float) message.obj).floatValue());
                    z10 = true;
                    zzC();
                    return z10;
                case 33:
                    int i31 = message.arg1;
                    zzms zzmsVar7 = this.zzH;
                    zzH(zzmsVar7.zzl, i31, zzmsVar7.zzn, zzmsVar7.zzm);
                    z10 = true;
                    zzC();
                    return z10;
                case 34:
                    zzD(this.zzad);
                    z10 = true;
                    zzC();
                    return z10;
                case 35:
                    zzadr zzadrVar = (zzadr) message.obj;
                    zzne[] zzneVarArr6 = this.zzb;
                    for (int i32 = 0; i32 < 2; i32++) {
                        zzneVarArr6[i32].zzK(zzadrVar);
                    }
                    z10 = true;
                    zzC();
                    return z10;
                case 36:
                    boolean zBooleanValue = ((Boolean) message.obj).booleanValue();
                    if (!zBooleanValue) {
                        if (this.zzF != null && this.zzE && !this.zzi.zzb(37)) {
                            this.zzG++;
                        }
                        final int i33 = this.zzG;
                        if (i33 > 0) {
                            this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzll
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzv(i33);
                                }
                            });
                        }
                        this.zzG = 0;
                        this.zzE = false;
                        this.zzi.zzk(37);
                        zzlt zzltVar = this.zzF;
                        if (zzltVar != null) {
                            zzR(zzltVar);
                            this.zzF = null;
                            this.zzE = false;
                        }
                    }
                    this.zzD = zBooleanValue;
                    zzV();
                    z10 = true;
                    zzC();
                    return z10;
                case 37:
                    this.zzE = false;
                    zzlt zzltVar2 = this.zzF;
                    if (zzltVar2 != null) {
                        zzR(zzltVar2);
                        this.zzF = null;
                    }
                    z10 = true;
                    zzC();
                    return z10;
                case 38:
                    this.zzC = (zznh) message.obj;
                    zzV();
                    z10 = true;
                    zzC();
                    return z10;
            }
        } catch (zzat e24) {
            e = e24;
        } catch (zzhq e25) {
            e = e25;
        } catch (zzjk e26) {
            e = e26;
        } catch (zzuf e27) {
            e = e27;
        } catch (zzwk e28) {
            e = e28;
        } catch (IOException e29) {
            e = e29;
        } catch (RuntimeException e30) {
            e = e30;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f10) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i10) {
        this.zzi.zze(33, i10, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzcS(long j10, long j11, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzE) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z10, int i10, int i11) {
        this.zzi.zze(1, z10 ? 1 : 0, (i11 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i10, long j10) {
        this.zzi.zzd(3, new zzlt(zzbfVar, i10, j10)).zza();
    }

    public final void zzg(zznh zznhVar) {
        this.zzi.zzd(38, zznhVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z10) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f10) {
        this.zzi.zzd(32, Float.valueOf(f10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzk(zzmw zzmwVar) {
        if (!this.zzJ && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmwVar).zza();
        } else {
            zzeg.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmwVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j10) {
        if (this.zzJ || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzds zzdsVar = new zzds(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdsVar)).zza();
        if (j10 != C.TIME_UNSET) {
            return zzdsVar.zze(j10);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzJ || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzJ = true;
        zzds zzdsVar = new zzds(this.zzq);
        this.zzi.zzd(7, zzdsVar).zza();
        return zzdsVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmq
    public final void zzo() {
        zzdz zzdzVar = this.zzi;
        zzdzVar.zzk(2);
        zzdzVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzp(zzxi zzxiVar) {
        this.zzi.zzd(8, zzxiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final /* bridge */ /* synthetic */ void zzs(zzze zzzeVar) {
        this.zzi.zzd(9, (zzxi) zzzeVar).zza();
    }

    final /* synthetic */ zzmc zzt(zzmd zzmdVar, long j10) {
        zzabl zzablVarZze = this.zzg.zze(this.zzv);
        long j11 = this.zzaa.zzb;
        zzabi zzabiVar = this.zzf;
        zzmr zzmrVar = this.zzt;
        return new zzmc(this.zzc, j10, this.zze, zzablVarZze, zzmrVar, zzmdVar, zzabiVar, C.TIME_UNSET);
    }

    final /* synthetic */ void zzu(int i10, boolean z10) {
        this.zzw.zzB(i10, this.zzb[i10].zze(), z10);
    }

    final /* synthetic */ void zzv(int i10) {
        this.zzw.zzW(i10);
    }

    final /* synthetic */ zzdz zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i10, long j10, zzzf zzzfVar) {
        this.zzi.zzd(17, new zzlo(list, zzzfVar, i10, j10, null)).zza();
    }
}
