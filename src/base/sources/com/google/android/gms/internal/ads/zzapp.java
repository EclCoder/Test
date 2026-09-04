package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapp implements zzapt {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzahk zzi;
    private zzahk zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzahk zzw;
    private long zzx;
    private final zzes zzc = new zzes(new byte[7], 7);
    private final zzet zzd = new zzet(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = C.TIME_UNSET;
    private long zzv = C.TIME_UNSET;

    public zzapp(boolean z10, String str, int i10, String str2) {
        this.zzb = z10;
        this.zze = str;
        this.zzf = i10;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzet zzetVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzetVar.zzd(), i10 - this.zzl);
        zzetVar.zzm(bArr, this.zzl, iMin);
        int i11 = this.zzl + iMin;
        this.zzl = i11;
        return i11 == i10;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzahk zzahkVar, long j10, int i10, int i11) {
        this.zzk = 4;
        this.zzl = i10;
        this.zzw = zzahkVar;
        this.zzx = j10;
        this.zzu = i11;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 65280);
    }

    private static final boolean zzm(zzet zzetVar, byte[] bArr, int i10) {
        if (zzetVar.zzd() < i10) {
            return false;
        }
        zzetVar.zzm(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzv = C.TIME_UNSET;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(zzagb zzagbVar, zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzh = zzarhVar.zzc();
        zzahk zzahkVarZzu = zzagbVar.zzu(zzarhVar.zzb(), 1);
        this.zzi = zzahkVarZzu;
        this.zzw = zzahkVarZzu;
        if (!this.zzb) {
            this.zzj = new zzafv();
            return;
        }
        zzarhVar.zza();
        zzahk zzahkVarZzu2 = zzagbVar.zzu(zzarhVar.zzb(), 5);
        this.zzj = zzahkVarZzu2;
        zzt zztVar = new zzt();
        zztVar.zza(zzarhVar.zzc());
        zztVar.zzn(this.zzg);
        zztVar.zzo(MimeTypes.APPLICATION_ID3);
        zzahkVarZzu2.zzA(zztVar.zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j10, int i10) {
        this.zzv = j10;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x020d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0218  */
    /* JADX WARN: Code duplicated, block: B:77:0x021c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0220  */
    /* JADX WARN: Code duplicated, block: B:84:0x022f  */
    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(zzet zzetVar) {
        int i10;
        boolean z10;
        int i11;
        int iZzj;
        byte[] bArrZzi;
        int iZze;
        int i12;
        byte b10;
        int i13;
        int i14;
        int i15;
        byte b11;
        this.zzi.getClass();
        String str = zzfl.zza;
        while (zzetVar.zzd() > 0) {
            int i16 = this.zzk;
            char c10 = 7;
            int i17 = 3;
            int i18 = 2;
            if (i16 == 0) {
                byte[] bArrZzi2 = zzetVar.zzi();
                int iZzg = zzetVar.zzg();
                int iZze2 = zzetVar.zze();
                while (true) {
                    if (iZzg < iZze2) {
                        int i19 = iZzg + 1;
                        byte b12 = bArrZzi2[iZzg];
                        int i20 = b12 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        int i21 = i17;
                        if (this.zzm == 512 && zzl((byte) -1, (byte) i20)) {
                            if (!this.zzo) {
                                int i22 = iZzg - 1;
                                zzetVar.zzh(iZzg);
                                zzes zzesVar = this.zzc;
                                if (zzm(zzetVar, zzesVar.zza, 1)) {
                                    zzesVar.zzf(4);
                                    int iZzj2 = zzesVar.zzj(1);
                                    int i23 = this.zzp;
                                    if (i23 != -1 && iZzj2 != i23) {
                                        c10 = 7;
                                    } else if (this.zzq == -1) {
                                        if (zzm(zzetVar, zzesVar.zza, 4)) {
                                            zzesVar.zzf(14);
                                            iZzj = zzesVar.zzj(13);
                                            c10 = 7;
                                            if (iZzj >= 7) {
                                                bArrZzi = zzetVar.zzi();
                                                iZze = zzetVar.zze();
                                                i12 = i22 + iZzj;
                                                if (i12 >= iZze) {
                                                    b10 = bArrZzi[i12];
                                                    if (b10 == -1) {
                                                        i15 = i12 + 1;
                                                        if (i15 != iZze) {
                                                            b11 = bArrZzi[i15];
                                                            if (zzl((byte) -1, b11) || ((b11 & 8) >> 3) != iZzj2) {
                                                            }
                                                        }
                                                    } else if (b10 == 73 || ((i13 = i12 + 1) != iZze && (bArrZzi[i13] != 68 || ((i14 = i12 + 2) != iZze && bArrZzi[i14] != 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else if (zzm(zzetVar, zzesVar.zza, 1)) {
                                        zzesVar.zzf(i18);
                                        if (zzesVar.zzj(4) == this.zzq) {
                                            zzetVar.zzh(iZzg + 1);
                                            if (zzm(zzetVar, zzesVar.zza, 4)) {
                                                zzesVar.zzf(14);
                                                iZzj = zzesVar.zzj(13);
                                                c10 = 7;
                                                if (iZzj >= 7) {
                                                    bArrZzi = zzetVar.zzi();
                                                    iZze = zzetVar.zze();
                                                    i12 = i22 + iZzj;
                                                    if (i12 >= iZze) {
                                                        b10 = bArrZzi[i12];
                                                        if (b10 == -1) {
                                                            i15 = i12 + 1;
                                                            if (i15 != iZze) {
                                                                b11 = bArrZzi[i15];
                                                                if (zzl((byte) -1, b11)) {
                                                                }
                                                            }
                                                        } else if (b10 == 73) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c10 = 7;
                                        }
                                    }
                                } else {
                                    c10 = 7;
                                }
                            }
                            this.zzr = (b12 & 8) >> 3;
                            this.zzn = 1 == ((b12 & 1) ^ 1);
                            if (this.zzo) {
                                zzk();
                            } else {
                                this.zzk = 1;
                                this.zzl = 0;
                            }
                            zzetVar.zzh(i19);
                        } else {
                            c10 = c10;
                        }
                        int i24 = this.zzm;
                        int i25 = i24 | i20;
                        if (i25 == 329) {
                            i10 = 2;
                            z10 = false;
                            i11 = 768;
                        } else if (i25 == 511) {
                            i10 = 2;
                            z10 = false;
                            i11 = 512;
                        } else if (i25 == 836) {
                            i10 = 2;
                            z10 = false;
                            i11 = UserVerificationMethods.USER_VERIFY_ALL;
                        } else if (i25 == 1075) {
                            this.zzk = 2;
                            this.zzl = i21;
                            this.zzu = 0;
                            this.zzd.zzh(0);
                            zzetVar.zzh(i19);
                        } else if (i24 != 256) {
                            this.zzm = 256;
                            i17 = i21;
                            i18 = 2;
                        } else {
                            i21 = i21;
                            i10 = 2;
                            z10 = false;
                            iZzg = i19;
                            i17 = i21;
                            i18 = i10;
                        }
                        this.zzm = i11;
                        iZzg = i19;
                        i17 = i21;
                        i18 = i10;
                    } else {
                        zzetVar.zzh(iZzg);
                    }
                }
            } else if (i16 != 1) {
                if (i16 == 2) {
                    zzet zzetVar2 = this.zzd;
                    if (zzh(zzetVar, zzetVar2.zzi(), 10)) {
                        this.zzj.zzc(zzetVar2, 10);
                        zzetVar2.zzh(6);
                        zzj(this.zzj, 0L, 10, zzetVar2.zzG() + 10);
                    }
                } else if (i16 != 3) {
                    int iMin = Math.min(zzetVar.zzd(), this.zzu - this.zzl);
                    this.zzw.zzc(zzetVar, iMin);
                    int i26 = this.zzl + iMin;
                    this.zzl = i26;
                    if (i26 == this.zzu) {
                        zzgtj.zzi(this.zzv != C.TIME_UNSET);
                        this.zzw.zze(this.zzv, 1, this.zzu, 0, null);
                        this.zzv += this.zzx;
                        zzi();
                    }
                } else {
                    int i27 = true != this.zzn ? 5 : 7;
                    zzes zzesVar2 = this.zzc;
                    if (zzh(zzetVar, zzesVar2.zza, i27)) {
                        zzesVar2.zzf(0);
                        if (this.zzs) {
                            zzesVar2.zzh(10);
                        } else {
                            int iZzj3 = zzesVar2.zzj(2) + 1;
                            if (iZzj3 != 2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length() + 50);
                                sb2.append("Detected audio object type: ");
                                sb2.append(iZzj3);
                                sb2.append(", but assuming AAC LC.");
                                zzeg.zzc("AdtsReader", sb2.toString());
                            }
                            zzesVar2.zzh(5);
                            int iZzj4 = zzesVar2.zzj(3);
                            int i28 = this.zzq;
                            byte[] bArr = {(byte) (((i28 >> 1) & 7) | 16), (byte) (((iZzj4 << 3) & AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL) | ((i28 << 7) & 128))};
                            zzaev zzaevVarZza = zzaew.zza(bArr);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzh);
                            zztVar.zzn(this.zzg);
                            zztVar.zzo(MimeTypes.AUDIO_AAC);
                            zztVar.zzk(zzaevVarZza.zzc);
                            zztVar.zzG(zzaevVarZza.zzb);
                            zztVar.zzH(zzaevVarZza.zza);
                            zztVar.zzr(Collections.singletonList(bArr));
                            zztVar.zze(this.zze);
                            zztVar.zzg(this.zzf);
                            zzv zzvVarZzO = zztVar.zzO();
                            this.zzt = 1024000000 / ((long) zzvVarZzO.zzI);
                            this.zzi.zzA(zzvVarZzO);
                            this.zzs = true;
                        }
                        zzesVar2.zzh(4);
                        int iZzj5 = zzesVar2.zzj(13);
                        int i29 = iZzj5 - 7;
                        if (this.zzn) {
                            i29 = iZzj5 - 9;
                        }
                        zzj(this.zzi, this.zzt, 0, i29);
                    }
                }
            } else if (zzetVar.zzd() != 0) {
                zzes zzesVar3 = this.zzc;
                zzesVar3.zza[0] = zzetVar.zzi()[zzetVar.zzg()];
                zzesVar3.zzf(2);
                int iZzj6 = zzesVar3.zzj(4);
                int i30 = this.zzq;
                if (i30 == -1 || iZzj6 == i30) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = iZzj6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z10) {
    }
}
