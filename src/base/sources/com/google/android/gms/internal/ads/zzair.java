package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzair implements zzafy {
    private zzagb zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzaix zzg;
    private zzafz zzh;
    private zzahg zzi;
    private zzamc zzj;
    private final zzet zza = new zzet(2);
    private long zzf = -1;

    private final int zzh(zzafz zzafzVar) {
        zzet zzetVar = this.zza;
        zzetVar.zza(2);
        ((zzafp) zzafzVar).zzh(zzetVar.zzi(), 0, 2, false);
        return zzetVar.zzt();
    }

    private final int zzi(zzafz zzafzVar) {
        zzet zzetVar = this.zza;
        zzetVar.zza(2);
        zzafzVar.zzi(zzetVar.zzi(), 0, 2);
        return zzetVar.zzt() - 2;
    }

    private final void zzj() {
        zzagb zzagbVar = this.zzb;
        zzagbVar.getClass();
        zzagbVar.zzv();
        this.zzb.zzw(new zzaha(C.TIME_UNSET, 0L));
        this.zzc = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws EOFException, InterruptedIOException {
        int iZzi;
        if (zzh(zzafzVar) == 65496) {
            while (true) {
                int iZzh = zzh(zzafzVar);
                this.zzd = iZzh;
                if (iZzh == 65498 || (iZzi = zzi(zzafzVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    ((zzafp) zzafzVar).zzj(iZzi, false);
                } else {
                    zzet zzetVar = this.zza;
                    zzetVar.zza(iZzi);
                    ((zzafp) zzafzVar).zzh(zzetVar.zzi(), 0, iZzi, false);
                    if (!Objects.equals(zzetVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") ? false : zzaiu.zzb(zzetVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zzb = zzagbVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws zzat {
        String strZzM;
        zzait zzaitVarZza;
        zzaix zzaixVar;
        long j10;
        int i10 = this.zzc;
        long j11 = -1;
        if (i10 == 0) {
            zzet zzetVar = this.zza;
            zzetVar.zza(2);
            zzafzVar.zzc(zzetVar.zzi(), 0, 2);
            int iZzt = zzetVar.zzt();
            this.zzd = iZzt;
            if (iZzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzj();
                }
            } else if ((iZzt < 65488 || iZzt > 65497) && iZzt != 65281) {
                this.zzc = 1;
            }
            return 0;
        }
        if (i10 == 1) {
            this.zze = zzi(zzafzVar);
            zzafzVar.zzf(2);
            this.zzc = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzafzVar != this.zzh) {
                    this.zzh = zzafzVar;
                    this.zzi = new zzahg(zzafzVar, this.zzf);
                }
                zzamc zzamcVar = this.zzj;
                zzamcVar.getClass();
                int iZzd = zzamcVar.zzd(this.zzi, zzagyVar);
                if (iZzd == 1) {
                    zzagyVar.zza += this.zzf;
                }
                return iZzd;
            }
            long jZzn = zzafzVar.zzn();
            long j12 = this.zzf;
            if (jZzn != j12) {
                zzagyVar.zza = j12;
                return 1;
            }
            if (zzafzVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzafzVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzamc(zzanj.zza, 8);
                }
                zzahg zzahgVar = new zzahg(zzafzVar, this.zzf);
                this.zzi = zzahgVar;
                if (this.zzj.zza(zzahgVar)) {
                    zzamc zzamcVar2 = this.zzj;
                    long j13 = this.zzf;
                    zzagb zzagbVar = this.zzb;
                    zzagbVar.getClass();
                    zzamcVar2.zzc(new zzahi(j13, zzagbVar));
                    zzaix zzaixVar2 = this.zzg;
                    zzaixVar2.getClass();
                    zzagb zzagbVar2 = this.zzb;
                    zzagbVar2.getClass();
                    zzahk zzahkVarZzu = zzagbVar2.zzu(UserVerificationMethods.USER_VERIFY_ALL, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzn("image/jpeg");
                    zztVar.zzl(new zzap(C.TIME_UNSET, zzaixVar2));
                    zzahkVarZzu.zzA(zztVar.zzO());
                    this.zzc = 5;
                } else {
                    zzj();
                }
            } else {
                zzj();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzet zzetVar2 = new zzet(this.zze);
            zzafzVar.zzc(zzetVar2.zzi(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzetVar2.zzM((char) 0)) && (strZzM = zzetVar2.zzM((char) 0)) != null) {
                long jZzo = zzafzVar.zzo();
                if (jZzo == -1 || (zzaitVarZza = zzaiu.zza(strZzM)) == null) {
                    zzaixVar = null;
                } else {
                    List list = zzaitVarZza.zzb;
                    if (list.size() < 2) {
                        zzaixVar = null;
                    } else {
                        int size = list.size() - 1;
                        long j14 = -1;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        while (size >= 0) {
                            zzais zzaisVar = (zzais) list.get(size);
                            String str = zzaisVar.zza;
                            long j18 = j11;
                            boolean z10 = str.equals(MimeTypes.VIDEO_MP4) || str.equals("video/quicktime");
                            if (size == 0) {
                                jZzo -= zzaisVar.zzc;
                                j10 = 0;
                            } else {
                                j10 = jZzo - zzaisVar.zzb;
                            }
                            long j19 = j10;
                            long j20 = jZzo;
                            jZzo = j19;
                            if (z10 && jZzo != j20) {
                                j17 = j20 - jZzo;
                                j16 = jZzo;
                            }
                            if (size == 0) {
                                j15 = j20;
                            }
                            if (size == 0) {
                                j14 = jZzo;
                            }
                            size--;
                            j11 = j18;
                        }
                        long j21 = j11;
                        if (j16 == j21 || j17 == j21 || j14 == j21 || j15 == j21) {
                            zzaixVar = null;
                        } else {
                            zzaixVar = new zzaix(j14, j15, zzaitVarZza.zza, j16, j17);
                        }
                    }
                }
                this.zzg = zzaixVar;
                if (zzaixVar != null) {
                    this.zzf = zzaixVar.zzd;
                }
            }
        } else {
            zzafzVar.zzf(this.zze);
        }
        this.zzc = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        if (j10 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzamc zzamcVar = this.zzj;
            zzamcVar.getClass();
            zzamcVar.zze(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
