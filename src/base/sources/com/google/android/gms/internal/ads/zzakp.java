package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzakp implements zzafy {
    public static final /* synthetic */ int zza = 0;
    private final zzet zzb;
    private final zzagv zzc;
    private final zzagr zzd;
    private final zzagt zze;
    private final zzahk zzf;
    private zzagb zzg;
    private zzahk zzh;
    private zzahk zzi;
    private int zzj;
    private zzap zzk;
    private zzap zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private zzakt zzr;
    private boolean zzs;

    static {
        int i10 = zzakn.zza;
    }

    public zzakp() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080 A[PHI: r19
      0x0080: PHI (r19v7 long) = (r5v0 long), (r5v0 long), (r19v9 long) binds: [B:59:0x013b, B:66:0x0154, B:33:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:57:0x012c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    /* JADX WARN: Code duplicated, block: B:65:0x0152  */
    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    private final int zzi(zzafz zzafzVar) throws Throwable {
        Throwable th2;
        int iZzB;
        zzakv zzakvVarZza;
        zzagr zzagrVar;
        zzakr zzakrVar;
        zzap zzapVar;
        long jZzn;
        long jZzo;
        long jZzb;
        long j10;
        int i10;
        zzakt zzakkVar;
        long j11;
        long j12;
        int i11;
        int i12;
        zzajr zzajrVar;
        zzakm zzakmVarZze;
        if (this.zzj == 0) {
            try {
                zzk(zzafzVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        zzakt zzaktVar = this.zzr;
        long j13 = C.TIME_UNSET;
        if (zzaktVar == null) {
            zzagv zzagvVar = this.zzc;
            zzet zzetVar = new zzet(zzagvVar.zzc);
            zzafzVar.zzi(zzetVar.zzi(), 0, zzagvVar.zzc);
            int i13 = 21;
            if ((zzagvVar.zza & 1) != 0) {
                if (zzagvVar.zze != 1) {
                    i13 = 36;
                }
            } else if (zzagvVar.zze == 1) {
                i13 = 13;
            }
            th2 = null;
            if (zzetVar.zze() >= i13 + 4) {
                zzetVar.zzh(i13);
                iZzB = zzetVar.zzB();
                if (iZzB != 1483304551) {
                    if (iZzB == 1231971951) {
                        iZzB = 1231971951;
                    } else if (zzetVar.zze() >= 40) {
                        zzetVar.zzh(36);
                        if (zzetVar.zzB() == 1447187017) {
                            iZzB = 1447187017;
                        } else {
                            iZzB = 0;
                        }
                    } else {
                        iZzB = 0;
                    }
                }
            } else if (zzetVar.zze() >= 40) {
                zzetVar.zzh(36);
                if (zzetVar.zzB() == 1447187017) {
                    iZzB = 1447187017;
                } else {
                    iZzB = 0;
                }
            } else {
                iZzB = 0;
            }
            if (iZzB == 1231971951) {
                zzakvVarZza = zzakv.zza(zzagvVar, zzetVar);
                zzagrVar = this.zzd;
                if (!zzagrVar.zzb() && (i11 = zzakvVarZza.zze) != -1 && (i12 = zzakvVarZza.zzf) != -1) {
                    zzagrVar.zza = i11;
                    zzagrVar.zzb = i12;
                }
                zzakrVar = zzakvVarZza.zzd;
                if (zzakrVar != null) {
                    zzapVar = new zzap(C.TIME_UNSET, zzakrVar);
                } else {
                    zzapVar = null;
                }
                this.zzl = zzapVar;
                jZzn = zzafzVar.zzn();
                if (zzafzVar.zzo() != -1) {
                    j11 = zzakvVarZza.zzc;
                    if (j11 != -1) {
                        j12 = j11 + jZzn;
                        if (zzafzVar.zzo() != j12) {
                            long jZzo2 = zzafzVar.zzo();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(jZzo2).length() + 53 + String.valueOf(j12).length() + 20);
                            sb2.append("Data size mismatch between stream (");
                            sb2.append(jZzo2);
                            sb2.append(") and Xing frame (");
                            sb2.append(j12);
                            sb2.append("), using Xing value.");
                            zzeg.zzb("Mp3Extractor", sb2.toString());
                        }
                    }
                }
                zzafzVar.zzf(zzagvVar.zzc);
                if (iZzB == 1483304551) {
                    zzakkVar = zzakw.zze(zzakvVarZza, jZzn);
                } else {
                    jZzo = zzafzVar.zzo();
                    jZzb = zzakvVarZza.zzb();
                    if (jZzb != j13) {
                        zzakkVar = null;
                    } else {
                        j10 = zzakvVarZza.zzc;
                        if (j10 != -1) {
                            jZzo = jZzn + j10;
                            i10 = zzakvVarZza.zza.zzc;
                        } else if (jZzo != -1) {
                            j10 = jZzo - jZzn;
                            i10 = zzakvVarZza.zza.zzc;
                        } else {
                            zzakkVar = null;
                        }
                        long j14 = j10 - ((long) i10);
                        long j15 = jZzo;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        zzakkVar = new zzakk(j15, jZzn + ((long) zzakvVarZza.zza.zzc), zzhah.zza(zzfl.zzv(j14, 8000000L, jZzb, roundingMode)), zzhah.zza(zzhab.zza(j14, zzakvVarZza.zzb, roundingMode)), false);
                    }
                }
            } else if (iZzB != 1447187017) {
                if (iZzB != 1483304551) {
                    zzafzVar.zzl();
                    j13 = -9223372036854775807L;
                } else {
                    zzakvVarZza = zzakv.zza(zzagvVar, zzetVar);
                    zzagrVar = this.zzd;
                    if (!zzagrVar.zzb()) {
                        zzagrVar.zza = i11;
                        zzagrVar.zzb = i12;
                    }
                    zzakrVar = zzakvVarZza.zzd;
                    if (zzakrVar != null) {
                        zzapVar = new zzap(C.TIME_UNSET, zzakrVar);
                    } else {
                        zzapVar = null;
                    }
                    this.zzl = zzapVar;
                    jZzn = zzafzVar.zzn();
                    if (zzafzVar.zzo() != -1) {
                        j11 = zzakvVarZza.zzc;
                        if (j11 != -1) {
                            j12 = j11 + jZzn;
                            if (zzafzVar.zzo() != j12) {
                                long jZzo3 = zzafzVar.zzo();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(jZzo3).length() + 53 + String.valueOf(j12).length() + 20);
                                sb3.append("Data size mismatch between stream (");
                                sb3.append(jZzo3);
                                sb3.append(") and Xing frame (");
                                sb3.append(j12);
                                sb3.append("), using Xing value.");
                                zzeg.zzb("Mp3Extractor", sb3.toString());
                            }
                        }
                    }
                    zzafzVar.zzf(zzagvVar.zzc);
                    if (iZzB == 1483304551) {
                        zzakkVar = zzakw.zze(zzakvVarZza, jZzn);
                    } else {
                        jZzo = zzafzVar.zzo();
                        jZzb = zzakvVarZza.zzb();
                        if (jZzb != j13) {
                            j10 = zzakvVarZza.zzc;
                            if (j10 != -1) {
                                jZzo = jZzn + j10;
                                i10 = zzakvVarZza.zza.zzc;
                            } else if (jZzo != -1) {
                                j10 = jZzo - jZzn;
                                i10 = zzakvVarZza.zza.zzc;
                            }
                            long j16 = j10 - ((long) i10);
                            long j17 = jZzo;
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            zzakkVar = new zzakk(j17, jZzn + ((long) zzakvVarZza.zza.zzc), zzhah.zza(zzfl.zzv(j16, 8000000L, jZzb, roundingMode2)), zzhah.zza(zzhab.zza(j16, zzakvVarZza.zzb, roundingMode2)), false);
                        }
                    }
                }
                zzakkVar = null;
            } else {
                zzakkVar = zzaku.zze(zzafzVar.zzo(), zzafzVar.zzn(), zzagvVar, zzetVar);
                zzagvVar = zzagvVar;
                zzafzVar.zzf(zzagvVar.zzc);
                j13 = -9223372036854775807L;
            }
            zzap zzapVar2 = this.zzk;
            long jZzn2 = zzafzVar.zzn();
            if (zzapVar2 == null || (zzajrVar = (zzajr) zzapVar2.zzc(zzajr.class, zzgtn.zza())) == null) {
                zzakmVarZze = null;
            } else {
                zzajt zzajtVar = (zzajt) zzapVar2.zzc(zzajt.class, zzako.zza);
                zzakmVarZze = zzakm.zze(jZzn2, zzajrVar, zzajtVar == null ? j13 : zzfl.zzs(Long.parseLong((String) zzajtVar.zzb.get(0))));
            }
            if (this.zzs) {
                zzakkVar = new zzaks();
            } else {
                if (zzakmVarZze != null) {
                    zzakkVar = zzakmVarZze;
                } else if (zzakkVar == null) {
                    zzakkVar = null;
                }
                if (zzakkVar == null) {
                    zzet zzetVar2 = this.zzb;
                    zzafzVar.zzi(zzetVar2.zzi(), 0, 4);
                    zzetVar2.zzh(0);
                    zzagvVar.zza(zzetVar2.zzB());
                    zzakkVar = new zzakk(zzafzVar.zzo(), zzafzVar.zzn(), zzagvVar, false);
                }
                this.zzh.zzO(zzakkVar.zza());
            }
            this.zzr = zzakkVar;
            this.zzg.zzw(zzakkVar);
            zzap zzapVarZzf = this.zzk;
            if (zzapVarZzf != null) {
                zzap zzapVar3 = this.zzl;
                if (zzapVar3 != null) {
                    zzapVarZzf = zzapVarZzf.zzf(zzapVar3);
                }
            } else {
                zzapVarZzf = this.zzl;
            }
            zzt zztVar = new zzt();
            zztVar.zzn(MimeTypes.AUDIO_MPEG);
            zztVar.zzo(zzagvVar.zzb);
            zztVar.zzp(4096);
            zztVar.zzG(zzagvVar.zze);
            zztVar.zzH(zzagvVar.zzd);
            zzagr zzagrVar2 = this.zzd;
            zztVar.zzJ(zzagrVar2.zza);
            zztVar.zzK(zzagrVar2.zzb);
            zztVar.zzl(zzapVarZzf);
            if (this.zzr.zzh() != -2147483647) {
                zztVar.zzi(this.zzr.zzh());
            }
            this.zzi.zzA(zztVar.zzO());
            this.zzo = zzafzVar.zzn();
        } else {
            j13 = -9223372036854775807L;
            th2 = null;
            long j18 = this.zzo;
            if (j18 != 0) {
                long jZzn3 = zzafzVar.zzn();
                if (jZzn3 < j18) {
                    zzafzVar.zzf((int) (j18 - jZzn3));
                }
            }
        }
        int i14 = this.zzq;
        if (i14 == 0) {
            zzafzVar.zzl();
            if (zzl(zzafzVar)) {
                return -1;
            }
            zzet zzetVar3 = this.zzb;
            zzetVar3.zzh(0);
            int iZzB2 = zzetVar3.zzB();
            if (!zzn(iZzB2, this.zzj) || zzagw.zza(iZzB2) == -1) {
                zzafzVar.zzf(1);
                this.zzj = 0;
                return 0;
            }
            zzagv zzagvVar2 = this.zzc;
            zzagvVar2.zza(iZzB2);
            if (this.zzm == j13) {
                this.zzm = this.zzr.zzf(zzafzVar.zzn());
            }
            i14 = zzagvVar2.zzc;
            this.zzq = i14;
            this.zzp = zzafzVar.zzn() + ((long) i14);
            if (this.zzr instanceof zzakl) {
                zzj(this.zzn + ((long) zzagvVar2.zzg));
                throw th2;
            }
        }
        int iZza = this.zzi.zza(zzafzVar, i14, true);
        if (iZza == -1) {
            return -1;
        }
        int i15 = this.zzq - iZza;
        this.zzq = i15;
        if (i15 > 0) {
            return 0;
        }
        zzahk zzahkVar = this.zzi;
        long jZzj = zzj(this.zzn);
        zzagv zzagvVar3 = this.zzc;
        zzahkVar.zze(jZzj, 1, zzagvVar3.zzc, 0, null);
        this.zzn += (long) zzagvVar3.zzg;
        this.zzq = 0;
        return 0;
    }

    private final long zzj(long j10) {
        return this.zzm + ((j10 * 1000000) / ((long) this.zzc.zzd));
    }

    private final boolean zzk(zzafz zzafzVar, boolean z10) throws EOFException {
        int iZzm;
        int i10;
        int iZza;
        zzafzVar.zzl();
        if (zzafzVar.zzn() == 0) {
            zzap zzapVarZza = this.zze.zza(zzafzVar, null, 131072);
            this.zzk = zzapVarZza;
            if (zzapVarZza != null) {
                this.zzd.zza(zzapVarZza);
            }
            iZzm = (int) zzafzVar.zzm();
            if (!z10) {
                zzafzVar.zzf(iZzm);
            }
            i10 = 0;
        } else {
            iZzm = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (zzl(zzafzVar)) {
                if (i11 > 0) {
                    break;
                }
                zzm();
                throw new EOFException();
            }
            zzet zzetVar = this.zzb;
            zzetVar.zzh(0);
            int iZzB = zzetVar.zzB();
            if ((i10 == 0 || zzn(iZzB, i10)) && (iZza = zzagw.zza(iZzB)) != -1) {
                i11++;
                if (i11 != 1) {
                    if (i11 == 4) {
                        break;
                    }
                } else {
                    this.zzc.zza(iZzB);
                    i10 = iZzB;
                }
                zzafzVar.zzk(iZza - 4);
            } else {
                int i13 = i12 + 1;
                if (i12 == 131072) {
                    if (z10) {
                        return false;
                    }
                    zzm();
                    throw new EOFException();
                }
                if (z10) {
                    zzafzVar.zzl();
                    zzafzVar.zzk(iZzm + i13);
                } else {
                    zzafzVar.zzf(1);
                }
                i11 = 0;
                i12 = i13;
                i10 = 0;
            }
        }
        if (z10) {
            zzafzVar.zzf(iZzm + i12);
        } else {
            zzafzVar.zzl();
        }
        this.zzj = i10;
        return true;
    }

    private final boolean zzl(zzafz zzafzVar) {
        zzakt zzaktVar = this.zzr;
        if (zzaktVar != null) {
            long jZzg = zzaktVar.zzg();
            if (jZzg != -1 && zzafzVar.zzm() > jZzg - 4) {
                return true;
            }
        }
        try {
            return !zzafzVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzakt zzaktVar = this.zzr;
        if ((zzaktVar instanceof zzakk) && zzaktVar.zzb()) {
            long j10 = this.zzp;
            if (j10 == -1 || j10 == this.zzr.zzg()) {
                return;
            }
            this.zzr = ((zzakk) this.zzr).zzi(this.zzp);
            zzagb zzagbVar = this.zzg;
            zzagbVar.getClass();
            zzagbVar.zzw(this.zzr);
            this.zzh.getClass();
            this.zzr.zza();
        }
    }

    private static boolean zzn(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) {
        return zzk(zzafzVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zzg = zzagbVar;
        zzahk zzahkVarZzu = zzagbVar.zzu(0, 1);
        this.zzh = zzahkVarZzu;
        this.zzi = zzahkVarZzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws Throwable {
        this.zzh.getClass();
        String str = zzfl.zza;
        int iZzi = zzi(zzafzVar);
        if (iZzi == -1 && (this.zzr instanceof zzakl)) {
            if (this.zzr.zza() != zzj(this.zzn)) {
                throw null;
            }
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzj = 0;
        this.zzm = C.TIME_UNSET;
        this.zzn = 0L;
        this.zzq = 0;
        this.zzp = -1L;
        if (this.zzr instanceof zzakl) {
            throw null;
        }
    }

    public final void zzh() {
        this.zzs = true;
    }

    public zzakp(int i10) {
        this.zzb = new zzet(10);
        this.zzc = new zzagv();
        this.zzd = new zzagr();
        this.zzm = C.TIME_UNSET;
        this.zze = new zzagt();
        zzafv zzafvVar = new zzafv();
        this.zzf = zzafvVar;
        this.zzi = zzafvVar;
        this.zzp = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
