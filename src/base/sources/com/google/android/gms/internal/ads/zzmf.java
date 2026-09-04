package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzmf {
    private final zznm zzc;
    private final zzdz zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzju zzh;
    private zzmc zzi;
    private zzmc zzj;
    private zzmc zzk;
    private zzmc zzl;
    private zzmc zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzln zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    public zzmf(zznm zznmVar, zzdz zzdzVar, zzln zzlnVar, zzju zzjuVar) {
        this.zzc = zznmVar;
        this.zzd = zzdzVar;
        this.zzr = zzlnVar;
        this.zzh = zzjuVar;
    }

    private static zzxk zzA(zzbf zzbfVar, Object obj, long j10, long j11, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int iZze = zzbdVar.zze(j10);
        return iZze == -1 ? new zzxk(obj, j11, zzbdVar.zzf(j10)) : new zzxk(obj, iZze, zzbdVar.zzd(iZze), j11);
    }

    private final void zzB() {
        int i10 = zzgwm.zzd;
        final zzgwj zzgwjVar = new zzgwj();
        for (zzmc zzmcVarZzp = this.zzi; zzmcVarZzp != null; zzmcVarZzp = zzmcVarZzp.zzp()) {
            zzgwjVar.zzf(zzmcVarZzp.zzg.zza);
        }
        zzmc zzmcVar = this.zzj;
        final zzxk zzxkVar = zzmcVar == null ? null : zzmcVar.zzg.zza;
        this.zzd.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzme
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgwjVar, zzxkVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            zzmc zzmcVar = (zzmc) this.zzq.get(i10);
            if (zzmcVar.zzb.equals(obj)) {
                return zzmcVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbf zzbfVar) {
        zzbf zzbfVar2;
        zzmc zzmcVarZzp = this.zzi;
        if (zzmcVarZzp == null) {
            return 0;
        }
        int iZze = zzbfVar.zze(zzmcVarZzp.zzb);
        while (true) {
            zzbfVar2 = zzbfVar;
            iZze = zzbfVar2.zzl(iZze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzmcVarZzp.getClass();
                if (zzmcVarZzp.zzp() == null || zzmcVarZzp.zzg.zzi) {
                    break;
                }
                zzmcVarZzp = zzmcVarZzp.zzp();
            }
            zzmc zzmcVarZzp2 = zzmcVarZzp.zzp();
            if (iZze == -1 || zzmcVarZzp2 == null || zzbfVar2.zze(zzmcVarZzp2.zzb) != iZze) {
                break;
            }
            zzmcVarZzp = zzmcVarZzp2;
            zzbfVar = zzbfVar2;
        }
        int iZzs = zzs(zzmcVarZzp);
        zzmcVarZzp.zzg = zzx(zzbfVar2, zzmcVarZzp.zzg);
        return iZzs;
    }

    private final zzmd zzE(zzbf zzbfVar, zzmc zzmcVar, long j10) {
        zzbf zzbfVar2;
        long j11;
        long j12;
        zzbe zzbeVar;
        long j13;
        long j14;
        Object obj;
        long j15;
        long j16;
        zzmd zzmdVar = zzmcVar.zzg;
        long jZza = zzmcVar.zza();
        long j17 = zzmdVar.zzf;
        long j18 = (jZza + j17) - j10;
        long j19 = 0;
        if (!zzmdVar.zzi) {
            zzxk zzxkVar = zzmdVar.zza;
            Object obj2 = zzxkVar.zza;
            zzbd zzbdVar = this.zza;
            zzbfVar.zzo(obj2, zzbdVar);
            if (!zzxkVar.zzb()) {
                int i10 = zzxkVar.zze;
                if (i10 != -1) {
                    zzbdVar.zzi(i10);
                }
                int iZzd = zzbdVar.zzd(i10);
                zzbdVar.zzk(i10);
                if (iZzd != zzbdVar.zzg(i10)) {
                    return zzG(zzbfVar, obj2, i10, iZzd, j17, zzxkVar.zzd, false);
                }
                zzK(zzbfVar, obj2, i10);
                return zzH(zzbfVar, obj2, 0L, C.TIME_UNSET, j17, zzxkVar.zzd, false);
            }
            int i11 = zzxkVar.zzb;
            if (zzbdVar.zzg(i11) == -1) {
                return null;
            }
            int iZza = zzbdVar.zzg.zza(i11).zza(zzxkVar.zzc);
            if (iZza < 0) {
                return zzG(zzbfVar, obj2, i11, iZza, zzmdVar.zzd, zzxkVar.zzd, false);
            }
            long jLongValue = zzmdVar.zzd;
            if (jLongValue == C.TIME_UNSET) {
                zzbe zzbeVar2 = this.zzb;
                long jMax = zzL(zzbfVar, zzbdVar.zzc, zzbdVar.zzd, zzbeVar2) ? Math.max(0L, j18) : -9223372036854775807L;
                zzbfVar2 = zzbfVar;
                Pair pairZzn = zzbfVar2.zzn(zzbeVar2, zzbdVar, zzbdVar.zzc, C.TIME_UNSET, jMax);
                if (pairZzn == null) {
                    return null;
                }
                jLongValue = ((Long) pairZzn.second).longValue();
                j12 = jMax;
                j11 = -9223372036854775807L;
            } else {
                zzbfVar2 = zzbfVar;
                j11 = jLongValue;
                j12 = -9223372036854775807L;
            }
            zzK(zzbfVar2, obj2, i11);
            return zzH(zzbfVar2, obj2, Math.max(0L, jLongValue), j12, j11, zzxkVar.zzd, false);
        }
        zzxk zzxkVar2 = zzmdVar.zza;
        Object obj3 = zzxkVar2.zza;
        int iZze = zzbfVar.zze(obj3);
        int i12 = this.zzf;
        boolean z10 = this.zzg;
        zzbe zzbeVar3 = this.zzb;
        zzbd zzbdVar2 = this.zza;
        int iZzl = zzbfVar.zzl(iZze, zzbdVar2, zzbeVar3, i12, z10);
        if (iZzl == -1) {
            return null;
        }
        int i13 = zzbfVar.zzd(iZzl, zzbdVar2, true).zzc;
        Object obj4 = zzbdVar2.zzb;
        obj4.getClass();
        long j20 = zzxkVar2.zzd;
        if (zzbfVar.zzb(i13, zzbeVar3, 0L).zzn == iZzl) {
            long jMax2 = zzL(zzbfVar, zzbdVar2.zzc, zzbdVar2.zzd, zzbeVar3) ? Math.max(0L, j18) : -9223372036854775807L;
            Pair pairZzn2 = zzbfVar.zzn(zzbeVar3, zzbdVar2, i13, C.TIME_UNSET, jMax2);
            if (pairZzn2 == null) {
                return null;
            }
            Object obj5 = pairZzn2.first;
            long jLongValue2 = ((Long) pairZzn2.second).longValue();
            zzmc zzmcVarZzp = zzmcVar.zzp();
            if (zzmcVarZzp == null || !zzmcVarZzp.zzb.equals(obj5)) {
                long jZzC = zzC(obj5);
                if (jZzC == -1) {
                    jZzC = this.zze;
                    this.zze = 1 + jZzC;
                }
                j16 = jZzC;
            } else {
                j16 = zzmcVarZzp.zzg.zza.zzd;
            }
            long j21 = jMax2;
            zzbeVar = zzbeVar3;
            obj = obj5;
            j13 = j16;
            j15 = j21;
            j14 = jLongValue2;
            j19 = -9223372036854775807L;
        } else {
            zzbeVar = zzbeVar3;
            j13 = j20;
            j14 = 0;
            obj = obj4;
            j15 = -9223372036854775807L;
        }
        zzxk zzxkVarZzA = zzA(zzbfVar, obj, j14, j13, zzbeVar, zzbdVar2);
        long j22 = j14;
        if (j19 != C.TIME_UNSET && zzmdVar.zzd != C.TIME_UNSET) {
            zzbfVar.zzo(obj3, zzbdVar2).zzb();
            int i14 = zzbdVar2.zzg.zzd;
        }
        return zzF(zzbfVar, zzxkVarZzA, j19, j22, j15);
    }

    private final zzmd zzF(zzbf zzbfVar, zzxk zzxkVar, long j10, long j11, long j12) {
        Object obj = zzxkVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzxkVar.zzb() ? zzG(zzbfVar, obj, zzxkVar.zzb, zzxkVar.zzc, j10, zzxkVar.zzd, false) : zzH(zzbfVar, obj, j11, j12, j10, zzxkVar.zzd, false);
    }

    private final zzmd zzG(zzbf zzbfVar, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        zzxk zzxkVar = new zzxk(obj, i10, i11, j11);
        Object obj2 = zzxkVar.zza;
        int i12 = zzxkVar.zzb;
        int i13 = zzxkVar.zzc;
        zzbd zzbdVar = this.zza;
        long jZzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i12, i13);
        if (i11 == zzbdVar.zzd(i10)) {
            zzbdVar.zzj();
        }
        zzbdVar.zzk(i12);
        long jMax = 0;
        if (jZzh != C.TIME_UNSET && jZzh <= 0) {
            jMax = Math.max(0L, (-1) + jZzh);
        }
        return new zzmd(zzxkVar, jMax, C.TIME_UNSET, j10, C.TIME_UNSET, jZzh, false, false, false, false, false);
    }

    private final zzmd zzH(zzbf zzbfVar, Object obj, long j10, long j11, long j12, long j13, boolean z10) {
        long j14;
        long j15;
        long j16;
        long jMax = j10;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int iZzf = zzbdVar.zzf(jMax);
        if (iZzf == -1) {
            zzbdVar.zzb();
        } else {
            zzbdVar.zzk(iZzf);
        }
        zzxk zzxkVar = new zzxk(obj, j13, iZzf);
        boolean zZzM = zzM(zzxkVar);
        boolean zZzI = zzI(zzbfVar, zzxkVar);
        boolean zZzJ = zzJ(zzbfVar, zzxkVar, zZzM);
        if (iZzf != -1) {
            zzbdVar.zzk(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzi(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzc(iZzf);
            j14 = 0;
        } else {
            j14 = -9223372036854775807L;
        }
        if (j14 != C.TIME_UNSET) {
            j16 = j14;
            j15 = j16;
        } else {
            j15 = zzbdVar.zzd;
            j16 = -9223372036854775807L;
        }
        if (j15 != C.TIME_UNSET && jMax >= j15) {
            jMax = Math.max(0L, j15 - 1);
        }
        return new zzmd(zzxkVar, jMax, j11, j12, j16, j15, false, false, zZzM, zZzI, zZzJ);
    }

    private final boolean zzI(zzbf zzbfVar, zzxk zzxkVar) {
        if (!zzM(zzxkVar)) {
            return false;
        }
        Object obj = zzxkVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(zzbf zzbfVar, zzxk zzxkVar, boolean z10) {
        int iZze = zzbfVar.zze(zzxkVar.zza);
        zzbd zzbdVar = this.zza;
        int i10 = zzbfVar.zzd(iZze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i10, zzbeVar, 0L).zzi && zzbfVar.zzl(iZze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z10;
    }

    private final long zzK(zzbf zzbfVar, Object obj, int i10) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i10);
        long j10 = zzbdVar.zzg.zza(i10).zzi;
        return 0L;
    }

    private static boolean zzL(zzbf zzbfVar, int i10, long j10, zzbe zzbeVar) {
        if (j10 == C.TIME_UNSET) {
            zzbfVar.zzb(i10, zzbeVar, 0L);
            if (zzbeVar.zzi && !zzbeVar.zzk) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzM(zzxk zzxkVar) {
        return !zzxkVar.zzb() && zzxkVar.zze == -1;
    }

    public final int zza(zzbf zzbfVar, int i10) {
        this.zzf = i10;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z10) {
        this.zzg = z10;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzju zzjuVar) {
        this.zzh = zzjuVar;
        long j10 = zzjuVar.zzb;
        zzj();
    }

    public final boolean zzd(zzxi zzxiVar) {
        zzmc zzmcVar = this.zzl;
        return zzmcVar != null && zzmcVar.zza == zzxiVar;
    }

    public final boolean zze(zzxi zzxiVar) {
        zzmc zzmcVar = this.zzm;
        return zzmcVar != null && zzmcVar.zza == zzxiVar;
    }

    public final void zzf(long j10) {
        zzmc zzmcVar = this.zzl;
        if (zzmcVar != null) {
            zzmcVar.zzi(j10);
        }
    }

    public final boolean zzg() {
        zzmc zzmcVar = this.zzl;
        if (zzmcVar != null) {
            return !zzmcVar.zzg.zzk && zzmcVar.zzd() && this.zzl.zzg.zzf != C.TIME_UNSET && this.zzn < 100;
        }
        return true;
    }

    public final zzmd zzh(long j10, zzms zzmsVar) {
        zzmc zzmcVar = this.zzl;
        return zzmcVar == null ? zzF(zzmsVar.zza, zzmsVar.zzb, zzmsVar.zzc, zzmsVar.zzs, C.TIME_UNSET) : zzE(zzmsVar.zza, zzmcVar, j10);
    }

    public final zzmc zzi(zzmd zzmdVar) {
        zzmc zzmcVarZza;
        zzmc zzmcVar = this.zzl;
        long jZza = zzmcVar == null ? 1000000000000L : (zzmcVar.zza() + zzmcVar.zzg.zzf) - zzmdVar.zzb;
        int i10 = 0;
        while (true) {
            if (i10 >= this.zzq.size()) {
                zzmcVarZza = null;
                break;
            }
            zzmd zzmdVar2 = ((zzmc) this.zzq.get(i10)).zzg;
            long j10 = zzmdVar2.zzf;
            long j11 = zzmdVar.zzf;
            if ((j10 == C.TIME_UNSET || j10 == j11) && zzmdVar2.zzb == zzmdVar.zzb && zzmdVar2.zza.equals(zzmdVar.zza)) {
                zzmcVarZza = (zzmc) this.zzq.remove(i10);
                break;
            }
            i10++;
        }
        if (zzmcVarZza == null) {
            zzmcVarZza = this.zzr.zza(zzmdVar, jZza);
        } else {
            zzmcVarZza.zzg = zzmdVar;
            zzmcVarZza.zzb(jZza);
        }
        zzmc zzmcVar2 = this.zzl;
        if (zzmcVar2 != null) {
            zzmcVar2.zzo(zzmcVarZza);
        } else {
            this.zzi = zzmcVarZza;
            this.zzj = zzmcVarZza;
            this.zzk = zzmcVarZza;
        }
        this.zzo = null;
        this.zzl = zzmcVarZza;
        this.zzn++;
        zzB();
        return zzmcVarZza;
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            ((zzmc) this.zzq.get(i10)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzmc zzk() {
        return this.zzl;
    }

    public final zzmc zzl() {
        return this.zzm;
    }

    public final zzmc zzm() {
        return this.zzi;
    }

    public final zzmc zzn() {
        return this.zzj;
    }

    public final zzmc zzo() {
        return this.zzk;
    }

    public final zzmc zzp() {
        zzmc zzmcVar = this.zzk;
        zzmc zzmcVar2 = this.zzj;
        if (zzmcVar == zzmcVar2) {
            zzmcVar2.getClass();
            this.zzk = zzmcVar2.zzp();
        }
        zzmcVar2.getClass();
        this.zzj = zzmcVar2.zzp();
        zzB();
        zzmc zzmcVar3 = this.zzj;
        zzmcVar3.getClass();
        return zzmcVar3;
    }

    public final zzmc zzq() {
        zzmc zzmcVar = this.zzk;
        zzmcVar.getClass();
        this.zzk = zzmcVar.zzp();
        zzB();
        zzmc zzmcVar2 = this.zzk;
        zzmcVar2.getClass();
        return zzmcVar2;
    }

    public final zzmc zzr() {
        zzmc zzmcVar = this.zzi;
        if (zzmcVar == null) {
            return null;
        }
        if (zzmcVar == this.zzj) {
            this.zzj = zzmcVar.zzp();
        }
        if (zzmcVar == this.zzk) {
            this.zzk = zzmcVar.zzp();
        }
        zzmcVar.zzn();
        int i10 = this.zzn - 1;
        this.zzn = i10;
        if (i10 == 0) {
            this.zzl = null;
            zzmc zzmcVar2 = this.zzi;
            this.zzo = zzmcVar2.zzb;
            this.zzp = zzmcVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final int zzs(zzmc zzmcVar) {
        zzmcVar.getClass();
        int i10 = 0;
        if (zzmcVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzmcVar;
        while (zzmcVar.zzp() != null) {
            zzmcVar = zzmcVar.zzp();
            zzmcVar.getClass();
            if (zzmcVar == this.zzj) {
                zzmc zzmcVar2 = this.zzi;
                this.zzj = zzmcVar2;
                this.zzk = zzmcVar2;
                i10 = 3;
            }
            if (zzmcVar == this.zzk) {
                this.zzk = this.zzj;
                i10 |= 2;
            }
            zzmcVar.zzn();
            this.zzn--;
        }
        zzmc zzmcVar3 = this.zzl;
        zzmcVar3.getClass();
        zzmcVar3.zzo(null);
        zzB();
        return i10;
    }

    public final void zzt() {
        zzmc zzmcVar = this.zzm;
        if (zzmcVar == null || zzmcVar.zze()) {
            this.zzm = null;
            for (int i10 = 0; i10 < this.zzq.size(); i10++) {
                zzmc zzmcVar2 = (zzmc) this.zzq.get(i10);
                if (!zzmcVar2.zze()) {
                    this.zzm = zzmcVar2;
                    return;
                }
            }
        }
    }

    public final zzmc zzu(zzxi zzxiVar) {
        for (int i10 = 0; i10 < this.zzq.size(); i10++) {
            zzmc zzmcVar = (zzmc) this.zzq.get(i10);
            if (zzmcVar.zza == zzxiVar) {
                return zzmcVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzmc zzmcVarZzp = this.zzi;
        zzmcVarZzp.getClass();
        this.zzo = zzmcVarZzp.zzb;
        this.zzp = zzmcVarZzp.zzg.zza.zzd;
        while (zzmcVarZzp != null) {
            zzmcVarZzp.zzn();
            zzmcVarZzp = zzmcVarZzp.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    public final int zzw(zzbf zzbfVar, long j10, long j11, long j12) {
        zzmd zzmdVarZzE;
        long j13;
        int i10;
        zzmd zzmdVar;
        int i11;
        zzmc zzmcVarZzp = this.zzi;
        zzmc zzmcVar = null;
        while (zzmcVarZzp != null) {
            zzmd zzmdVar2 = zzmcVarZzp.zzg;
            if (zzmcVar != null) {
                zzmdVarZzE = zzE(zzbfVar, zzmcVar, j10);
                if (zzmdVarZzE != null && zzmdVar2.zza.equals(zzmdVarZzE.zza)) {
                    long j14 = zzmdVar2.zzb;
                    long j15 = zzmdVarZzE.zzb;
                    if (j14 == j15) {
                        j13 = C.TIME_UNSET;
                        i10 = 0;
                    } else {
                        j13 = C.TIME_UNSET;
                        long j16 = zzmdVar2.zzc;
                        if (j16 != C.TIME_UNSET) {
                            i10 = 0;
                            long j17 = zzmdVarZzE.zzc;
                            if (j17 != C.TIME_UNSET) {
                                if (Math.abs((j15 - j17) - (j14 - j16)) >= 5000000) {
                                }
                            }
                        }
                    }
                    if (j14 != j15) {
                        zzmdVar = zzmdVar2;
                        zzmdVarZzE = zzmdVarZzE.zza(j14, zzmdVar.zzc);
                    } else {
                        zzmdVar = zzmdVar2;
                    }
                }
                return zzs(zzmcVar);
            }
            zzmdVarZzE = zzx(zzbfVar, zzmdVar2);
            zzmdVar = zzmdVar2;
            j13 = C.TIME_UNSET;
            i10 = 0;
            zzmcVarZzp.zzg = zzmdVarZzE.zzb(zzmdVar.zzd);
            long j18 = zzmdVar.zzf;
            long j19 = zzmdVarZzE.zzf;
            if (j18 != j19) {
                zzmcVarZzp.zzs();
                long jZza = j19 == j13 ? Long.MAX_VALUE : j19 + zzmcVarZzp.zza();
                if (zzmcVarZzp == this.zzj) {
                    boolean z10 = zzmcVarZzp.zzg.zzh;
                    if (j11 == Long.MIN_VALUE || j11 >= jZza) {
                        i11 = 1;
                    } else {
                        i11 = i10;
                    }
                } else {
                    i11 = i10;
                }
                int i12 = (zzmcVarZzp != this.zzk || (j12 != Long.MIN_VALUE && j12 < jZza)) ? i10 : 1;
                int iZzs = zzs(zzmcVarZzp);
                if (iZzs != 0) {
                    return iZzs;
                }
                if (j18 == j13) {
                    j18 = j13;
                }
                int i13 = (i11 == 0 || j18 == j13) ? i10 : 1;
                return i12 != 0 ? i13 | 2 : i13;
            }
            zzmcVar = zzmcVarZzp;
            zzmcVarZzp = zzmcVarZzp.zzp();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    public final zzmd zzx(zzbf zzbfVar, zzmd zzmdVar) {
        long j10;
        long jZzh;
        long j11;
        long j12;
        int i10;
        int i11;
        zzxk zzxkVar = zzmdVar.zza;
        boolean zZzM = zzM(zzxkVar);
        boolean zZzI = zzI(zzbfVar, zzxkVar);
        boolean zZzJ = zzJ(zzbfVar, zzxkVar, zZzM);
        Object obj = zzxkVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzxkVar.zzb() || (i11 = zzxkVar.zze) == -1) {
            j10 = -9223372036854775807L;
        } else {
            zzbdVar.zzc(i11);
            j10 = 0;
        }
        if (!zzxkVar.zzb()) {
            if (j10 != C.TIME_UNSET) {
                j11 = 0;
                j12 = 0;
            } else {
                jZzh = zzbdVar.zzd;
            }
            if (zzxkVar.zzb()) {
                zzbdVar.zzk(zzxkVar.zzb);
            } else {
                i10 = zzxkVar.zze;
                if (i10 != -1) {
                    zzbdVar.zzk(i10);
                }
            }
            return new zzmd(zzxkVar, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzd, j11, j12, false, false, zZzM, zZzI, zZzJ);
        }
        jZzh = zzbdVar.zzh(zzxkVar.zzb, zzxkVar.zzc);
        j11 = j10;
        j12 = jZzh;
        if (zzxkVar.zzb()) {
            zzbdVar.zzk(zzxkVar.zzb);
        } else {
            i10 = zzxkVar.zze;
            if (i10 != -1) {
                zzbdVar.zzk(i10);
            }
        }
        return new zzmd(zzxkVar, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzd, j11, j12, false, false, zZzM, zZzI, zZzJ);
    }

    public final zzxk zzy(zzbf zzbfVar, Object obj, long j10) {
        long jZzC;
        int iZze;
        zzbd zzbdVar = this.zza;
        int i10 = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(iZze, zzbdVar, false).zzc != i10) {
            zzmc zzmcVarZzp = this.zzi;
            while (true) {
                if (zzmcVarZzp == null) {
                    zzmc zzmcVarZzp2 = this.zzi;
                    while (true) {
                        if (zzmcVarZzp2 == null) {
                            jZzC = zzC(obj);
                            if (jZzC != -1) {
                                break;
                            }
                            jZzC = this.zze;
                            this.zze = 1 + jZzC;
                            if (this.zzi != null) {
                                break;
                            }
                            this.zzo = obj;
                            this.zzp = jZzC;
                            break;
                        }
                        int iZze2 = zzbfVar.zze(zzmcVarZzp2.zzb);
                        if (iZze2 != -1 && zzbfVar.zzd(iZze2, zzbdVar, false).zzc == i10) {
                            jZzC = zzmcVarZzp2.zzg.zza.zzd;
                            break;
                        }
                        zzmcVarZzp2 = zzmcVarZzp2.zzp();
                    }
                } else {
                    if (zzmcVarZzp.zzb.equals(obj)) {
                        jZzC = zzmcVarZzp.zzg.zza.zzd;
                        break;
                    }
                    zzmcVarZzp = zzmcVarZzp.zzp();
                }
            }
        } else {
            jZzC = this.zzp;
        }
        long j11 = jZzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i11 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i11, zzbeVar, 0L);
        Object obj3 = obj;
        for (int iZze3 = zzbfVar.zze(obj); iZze3 >= zzbeVar.zzn; iZze3--) {
            zzbfVar.zzd(iZze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j10, j11, zzbeVar, zzbdVar);
    }

    final /* synthetic */ void zzz(zzgwj zzgwjVar, zzxk zzxkVar) {
        this.zzc.zzz(zzgwjVar.zzi(), zzxkVar);
    }
}
