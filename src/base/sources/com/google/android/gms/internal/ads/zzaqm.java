package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaqm implements zzari {
    private final zzapt zza;
    private final zzes zzb = new zzes(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfi zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaqm(zzapt zzaptVar) {
        this.zza = zzaptVar;
    }

    private final void zze(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zzf(zzet zzetVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzetVar.zzd(), i10 - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzetVar.zzk(iMin);
        } else {
            zzetVar.zzm(bArr, this.zzd, iMin);
        }
        int i11 = this.zzd + iMin;
        this.zzd = i11;
        return i11 == i10;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zza(zzfi zzfiVar, zzagb zzagbVar, zzarh zzarhVar) {
        this.zze = zzfiVar;
        this.zza.zzb(zzagbVar, zzarhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzc(zzet zzetVar, int i10) {
        int i11;
        int i12;
        long jZze;
        this.zze.getClass();
        int i13 = -1;
        int i14 = 2;
        if ((i10 & 1) != 0) {
            int i15 = this.zzc;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2) {
                    int i16 = this.zzj;
                    if (i16 != -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 48);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i16);
                        sb2.append(" more bytes");
                        zzeg.zzc("PesReader", sb2.toString());
                    }
                    this.zza.zze(zzetVar.zze() == 0);
                } else {
                    zzeg.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i17 = i10;
        while (zzetVar.zzd() > 0) {
            int i18 = this.zzc;
            if (i18 == 0) {
                i11 = i14;
                zzetVar.zzk(zzetVar.zzd());
            } else if (i18 != 1) {
                if (i18 != i14) {
                    int iZzd = zzetVar.zzd();
                    int i19 = this.zzj;
                    int i20 = i19 == i13 ? 0 : iZzd - i19;
                    if (i20 > 0) {
                        iZzd -= i20;
                        zzetVar.zzf(zzetVar.zzg() + iZzd);
                    }
                    zzapt zzaptVar = this.zza;
                    zzaptVar.zzd(zzetVar);
                    int i21 = this.zzj;
                    if (i21 != i13) {
                        int i22 = i21 - iZzd;
                        this.zzj = i22;
                        if (i22 == 0) {
                            zzaptVar.zze(false);
                            zze(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.zzi);
                    zzes zzesVar = this.zzb;
                    if (zzf(zzetVar, zzesVar.zza, iMin) && zzf(zzetVar, null, this.zzi)) {
                        zzesVar.zzf(0);
                        if (this.zzf) {
                            zzesVar.zzh(4);
                            long jZzj = zzesVar.zzj(3);
                            zzesVar.zzh(1);
                            int iZzj = zzesVar.zzj(15) << 15;
                            zzesVar.zzh(1);
                            long jZzj2 = zzesVar.zzj(15);
                            zzesVar.zzh(1);
                            if (!this.zzh && this.zzg) {
                                zzesVar.zzh(4);
                                long jZzj3 = ((long) zzesVar.zzj(3)) << 30;
                                zzesVar.zzh(1);
                                int iZzj2 = zzesVar.zzj(15) << 15;
                                zzesVar.zzh(1);
                                long jZzj4 = zzesVar.zzj(15);
                                zzesVar.zzh(1);
                                this.zze.zze(jZzj3 | ((long) iZzj2) | jZzj4);
                                this.zzh = true;
                            }
                            jZze = this.zze.zze(jZzj2 | (jZzj << 30) | ((long) iZzj));
                        } else {
                            jZze = C.TIME_UNSET;
                        }
                        i17 |= true != this.zzk ? 0 : 4;
                        this.zza.zzc(jZze, i17);
                        zze(3);
                        i13 = -1;
                        i14 = 2;
                    }
                }
                i11 = i14;
            } else {
                zzes zzesVar2 = this.zzb;
                if (zzf(zzetVar, zzesVar2.zza, 9)) {
                    zzesVar2.zzf(0);
                    int iZzj3 = zzesVar2.zzj(24);
                    if (iZzj3 != 1) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj3).length() + 30);
                        sb3.append("Unexpected start code prefix: ");
                        sb3.append(iZzj3);
                        zzeg.zzc("PesReader", sb3.toString());
                        i13 = -1;
                        this.zzj = -1;
                        i12 = 0;
                        i11 = 2;
                    } else {
                        zzesVar2.zzh(8);
                        int iZzj4 = zzesVar2.zzj(16);
                        zzesVar2.zzh(5);
                        this.zzk = zzesVar2.zzi();
                        i11 = 2;
                        zzesVar2.zzh(2);
                        this.zzf = zzesVar2.zzi();
                        this.zzg = zzesVar2.zzi();
                        zzesVar2.zzh(6);
                        int iZzj5 = zzesVar2.zzj(8);
                        this.zzi = iZzj5;
                        if (iZzj4 == 0) {
                            this.zzj = -1;
                            i13 = -1;
                        } else {
                            int i23 = (iZzj4 - 3) - iZzj5;
                            this.zzj = i23;
                            if (i23 < 0) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i23).length() + 36);
                                sb4.append("Found negative packet payload size: ");
                                sb4.append(i23);
                                zzeg.zzc("PesReader", sb4.toString());
                                i13 = -1;
                                this.zzj = -1;
                            } else {
                                i13 = -1;
                            }
                        }
                        i12 = 2;
                    }
                    zze(i12);
                } else {
                    i13 = -1;
                    i11 = 2;
                }
            }
            i14 = i11;
        }
    }

    public final boolean zzd(boolean z10) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
