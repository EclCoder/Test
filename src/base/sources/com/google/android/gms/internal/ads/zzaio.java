package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaio implements zzafy {
    private zzagb zzb;
    private zzaix zzc;
    private zzafz zzd;
    private zzahg zze;
    private zzamc zzf;
    private int zzh;
    private long zzi;
    private int zzj;
    private final zzet zza = new zzet(16);
    private long zzk = -1;
    private int zzg = 0;

    private final void zzh() {
        zzagb zzagbVar = this.zzb;
        zzagbVar.getClass();
        zzagbVar.zzv();
        this.zzb.zzw(new zzaha(C.TIME_UNSET, 0L));
        this.zzg = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws EOFException, InterruptedIOException {
        int i10;
        zzet zzetVar = new zzet(16);
        boolean z10 = true;
        while (true) {
            zzetVar.zza(8);
            if (!zzafzVar.zzh(zzetVar.zzi(), 0, 8, true)) {
                return false;
            }
            long jZzz = zzetVar.zzz();
            int iZzB = zzetVar.zzB();
            if (jZzz != 1) {
                i10 = 8;
            } else {
                if (!zzafzVar.zzh(zzetVar.zzi(), 8, 8, true)) {
                    return false;
                }
                jZzz = zzetVar.zzJ();
                i10 = 16;
            }
            long j10 = i10;
            if (jZzz < j10) {
                return false;
            }
            int i11 = (int) (jZzz - j10);
            if (z10) {
                if (iZzB != 1718909296 || i11 < 8) {
                    return false;
                }
                zzetVar.zza(4);
                zzafp zzafpVar = (zzafp) zzafzVar;
                zzafpVar.zzh(zzetVar.zzi(), 0, 4, false);
                if (zzetVar.zzB() != 1751476579) {
                    return false;
                }
                zzafpVar.zzj(i11 - 4, false);
            } else {
                if (iZzB == 1836086884) {
                    return true;
                }
                if (i11 != 0) {
                    ((zzafp) zzafzVar).zzj(i11, false);
                }
            }
            z10 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zzb = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws zzat {
        while (true) {
            int i10 = this.zzg;
            if (i10 == 0) {
                if (this.zzj == 0) {
                    zzet zzetVar = this.zza;
                    if (!zzafzVar.zzb(zzetVar.zzi(), 0, 8, true)) {
                        zzh();
                        return -1;
                    }
                    this.zzj = 8;
                    zzetVar.zzh(0);
                    this.zzi = zzetVar.zzz();
                    this.zzh = zzetVar.zzB();
                }
                long jZzJ = this.zzi;
                if (jZzJ == 1) {
                    zzet zzetVar2 = this.zza;
                    zzafzVar.zzc(zzetVar2.zzi(), 8, 8);
                    this.zzj += 8;
                    jZzJ = zzetVar2.zzJ();
                    this.zzi = jZzJ;
                }
                if (this.zzh == 1836086884) {
                    long jZzn = zzafzVar.zzn();
                    this.zzk = jZzn;
                    long j10 = this.zzj;
                    zzaix zzaixVar = new zzaix(0L, jZzn - j10, C.TIME_UNSET, jZzn, jZzJ - j10);
                    this.zzc = zzaixVar;
                    zzagb zzagbVar = this.zzb;
                    zzagbVar.getClass();
                    zzahk zzahkVarZzu = zzagbVar.zzu(UserVerificationMethods.USER_VERIFY_ALL, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzn("image/heic");
                    zztVar.zzl(new zzap(C.TIME_UNSET, zzaixVar));
                    zzahkVarZzu.zzA(zztVar.zzO());
                    this.zzg = 2;
                } else {
                    this.zzg = 1;
                }
            } else if (i10 == 1) {
                zzafzVar.zzf((int) (this.zzi - ((long) this.zzj)));
                this.zzj = 0;
                this.zzg = 0;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return -1;
                    }
                    if (this.zze == null || zzafzVar != this.zzd) {
                        this.zzd = zzafzVar;
                        this.zze = new zzahg(zzafzVar, this.zzk);
                    }
                    zzamc zzamcVar = this.zzf;
                    zzamcVar.getClass();
                    int iZzd = zzamcVar.zzd(this.zze, zzagyVar);
                    if (iZzd == 1) {
                        zzagyVar.zza += this.zzk;
                    }
                    return iZzd;
                }
                if (this.zzf == null) {
                    this.zzf = new zzamc(zzanj.zza, 8);
                }
                zzahg zzahgVar = new zzahg(zzafzVar, this.zzk);
                this.zze = zzahgVar;
                if (this.zzf.zza(zzahgVar)) {
                    zzamc zzamcVar2 = this.zzf;
                    long j11 = this.zzk;
                    zzagb zzagbVar2 = this.zzb;
                    zzagbVar2.getClass();
                    zzamcVar2.zzc(new zzahi(j11, zzagbVar2));
                    this.zzg = 3;
                } else {
                    zzh();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        if (j10 != 0) {
            if (this.zzg == 3) {
                zzamc zzamcVar = this.zzf;
                zzamcVar.getClass();
                zzamcVar.zze(j10, j11);
                return;
            }
            return;
        }
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1L;
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
        if (this.zzf != null) {
            this.zzf = null;
        }
    }
}
