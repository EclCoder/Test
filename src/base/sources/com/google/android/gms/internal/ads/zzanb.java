package com.google.android.gms.internal.ads;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzanb extends zzamz {
    private zzana zza;
    private int zzb;
    private boolean zzc;
    private zzhd zzd;
    private zzhb zze;

    zzanb() {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final void zza(boolean z10) {
        super.zza(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final long zzb(zzet zzetVar) {
        if ((zzetVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        zzana zzanaVar = this.zza;
        zzanaVar.getClass();
        byte b10 = zzetVar.zzi()[0];
        zzhd zzhdVar = zzanaVar.zza;
        zzhc[] zzhcVarArr = zzanaVar.zzd;
        int i10 = zzhcVarArr[(b10 >> 1) & (255 >>> (8 - zzhe.zza(zzhcVarArr.length + (-1))))].zza ? zzhdVar.zzf : zzhdVar.zze;
        int i11 = this.zzc ? (this.zzb + i10) / 4 : 0;
        if (zzetVar.zzj() < zzetVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzetVar.zzi(), zzetVar.zze() + 4);
            zzetVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzetVar.zzf(zzetVar.zze() + 4);
        }
        long j10 = i11;
        byte[] bArrZzi = zzetVar.zzi();
        bArrZzi[zzetVar.zze() - 4] = (byte) (j10 & 255);
        bArrZzi[zzetVar.zze() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrZzi[zzetVar.zze() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrZzi[zzetVar.zze() - 1] = (byte) ((j10 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final void zzj(long j10) {
        super.zzj(j10);
        this.zzc = j10 != 0;
        zzhd zzhdVar = this.zzd;
        this.zzb = zzhdVar != null ? zzhdVar.zze : 0;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x03eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:170:0x03ed  */
    @Override // com.google.android.gms.internal.ads.zzamz
    protected final boolean zzc(zzet zzetVar, long j10, zzamx zzamxVar) throws zzat {
        zzana zzanaVar;
        int i10;
        int iZzb;
        int i11;
        int[] iArr;
        if (this.zza != null) {
            zzamxVar.zza.getClass();
            return false;
        }
        zzhd zzhdVar = this.zzd;
        int i12 = 1;
        if (zzhdVar != null) {
            int i13 = 4;
            zzhb zzhbVar = this.zze;
            if (zzhbVar == null) {
                this.zze = zzhe.zzb(zzetVar, true, true);
            } else {
                byte[] bArr = new byte[zzetVar.zze()];
                System.arraycopy(zzetVar.zzi(), 0, bArr, 0, zzetVar.zze());
                int i14 = zzhdVar.zza;
                int i15 = 5;
                zzhe.zzc(5, zzetVar, false);
                int iZzs = zzetVar.zzs() + 1;
                zzha zzhaVar = new zzha(zzetVar.zzi());
                zzhaVar.zzc(zzetVar.zzg() * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 2;
                    int i18 = 16;
                    if (i16 >= iZzs) {
                        int i19 = i12;
                        int i20 = 6;
                        int iZzb2 = zzhaVar.zzb(6) + i19;
                        for (int i21 = 0; i21 < iZzb2; i21++) {
                            if (zzhaVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzhaVar.zzb(6) + i19;
                        int i22 = 0;
                        while (true) {
                            int i23 = 3;
                            if (i22 >= iZzb3) {
                                int i24 = 1;
                                int iZzb4 = zzhaVar.zzb(i20) + 1;
                                int i25 = 0;
                                while (i25 < iZzb4) {
                                    if (zzhaVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzhaVar.zzc(24);
                                    zzhaVar.zzc(24);
                                    zzhaVar.zzc(24);
                                    int iZzb5 = zzhaVar.zzb(i20) + i24;
                                    int i26 = 8;
                                    zzhaVar.zzc(8);
                                    int[] iArr2 = new int[iZzb5];
                                    for (int i27 = 0; i27 < iZzb5; i27++) {
                                        iArr2[i27] = ((zzhaVar.zza() ? zzhaVar.zzb(5) : 0) * 8) + zzhaVar.zzb(3);
                                    }
                                    int i28 = 0;
                                    while (i28 < iZzb5) {
                                        int i29 = 0;
                                        while (i29 < i26) {
                                            if ((iArr2[i28] & (1 << i29)) != 0) {
                                                zzhaVar.zzc(i26);
                                            }
                                            i29++;
                                            i26 = 8;
                                        }
                                        i28++;
                                        i26 = 8;
                                    }
                                    i25++;
                                    i20 = 6;
                                    i24 = 1;
                                }
                                int iZzb6 = zzhaVar.zzb(i20) + 1;
                                for (int i30 = 0; i30 < iZzb6; i30++) {
                                    int iZzb7 = zzhaVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb7).length() + 41);
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(iZzb7);
                                        zzeg.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzhaVar.zza()) {
                                            i10 = 1;
                                            iZzb = zzhaVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzhaVar.zza()) {
                                            int iZzb8 = zzhaVar.zzb(8) + i10;
                                            for (int i31 = 0; i31 < iZzb8; i31++) {
                                                int i32 = i14 - 1;
                                                zzhaVar.zzc(zzhe.zza(i32));
                                                zzhaVar.zzc(zzhe.zza(i32));
                                            }
                                        }
                                        if (zzhaVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i33 = 0; i33 < i14; i33++) {
                                                zzhaVar.zzc(4);
                                            }
                                        }
                                        for (int i34 = 0; i34 < iZzb; i34++) {
                                            zzhaVar.zzc(8);
                                            zzhaVar.zzc(8);
                                            zzhaVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzhaVar.zzb(6);
                                int i35 = iZzb9 + 1;
                                zzhc[] zzhcVarArr = new zzhc[i35];
                                for (int i36 = 0; i36 < i35; i36++) {
                                    zzhcVarArr[i36] = new zzhc(zzhaVar.zza(), zzhaVar.zzb(16), zzhaVar.zzb(16), zzhaVar.zzb(8));
                                }
                                if (!zzhaVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzanaVar = new zzana(zzhdVar, zzhbVar, bArr, zzhcVarArr, zzhe.zza(iZzb9));
                                break;
                            }
                            int iZzb10 = zzhaVar.zzb(i18);
                            if (iZzb10 == 0) {
                                int i37 = 8;
                                zzhaVar.zzc(8);
                                zzhaVar.zzc(16);
                                zzhaVar.zzc(16);
                                zzhaVar.zzc(6);
                                zzhaVar.zzc(8);
                                int iZzb11 = zzhaVar.zzb(4) + 1;
                                int i38 = 0;
                                while (i38 < iZzb11) {
                                    zzhaVar.zzc(i37);
                                    i38++;
                                    i37 = 8;
                                }
                            } else {
                                if (iZzb10 != i19) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb10).length() + 41);
                                    sb3.append(qEagQqzJZsd.XAnOEmaN);
                                    sb3.append(iZzb10);
                                    throw zzat.zzb(sb3.toString(), null);
                                }
                                int iZzb12 = zzhaVar.zzb(5);
                                int[] iArr3 = new int[iZzb12];
                                int i39 = -1;
                                for (int i40 = 0; i40 < iZzb12; i40++) {
                                    int iZzb13 = zzhaVar.zzb(4);
                                    iArr3[i40] = iZzb13;
                                    if (iZzb13 > i39) {
                                        i39 = iZzb13;
                                    }
                                }
                                int i41 = i39 + 1;
                                int[] iArr4 = new int[i41];
                                int i42 = 0;
                                while (i42 < i41) {
                                    int i43 = 1;
                                    iArr4[i42] = zzhaVar.zzb(i23) + 1;
                                    int iZzb14 = zzhaVar.zzb(2);
                                    if (iZzb14 > 0) {
                                        i11 = 8;
                                        zzhaVar.zzc(8);
                                    } else {
                                        i11 = 8;
                                    }
                                    int i44 = i41;
                                    int i45 = 0;
                                    while (true) {
                                        int i46 = i43 << iZzb14;
                                        iArr = iArr3;
                                        if (i45 < i46) {
                                            zzhaVar.zzc(i11);
                                            i45++;
                                            iArr3 = iArr;
                                            i11 = 8;
                                            i43 = 1;
                                        }
                                    }
                                    i42++;
                                    iArr3 = iArr;
                                    i41 = i44;
                                    i23 = 3;
                                }
                                int[] iArr5 = iArr3;
                                zzhaVar.zzc(2);
                                int iZzb15 = zzhaVar.zzb(4);
                                int i47 = 0;
                                int i48 = 0;
                                for (int i49 = 0; i49 < iZzb12; i49++) {
                                    i47 += iArr4[iArr5[i49]];
                                    while (i48 < i47) {
                                        zzhaVar.zzc(iZzb15);
                                        i48++;
                                    }
                                }
                            }
                            i22++;
                            i20 = 6;
                            i18 = 16;
                            i19 = 1;
                        }
                    } else {
                        if (zzhaVar.zzb(24) != 5653314) {
                            int iZzd = zzhaVar.zzd();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb4.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb4.append(iZzd);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        int iZzb16 = zzhaVar.zzb(16);
                        int iZzb17 = zzhaVar.zzb(24);
                        if (zzhaVar.zza()) {
                            zzhaVar.zzc(i15);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzhaVar.zzb(zzhe.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzhaVar.zza();
                            for (int i50 = 0; i50 < iZzb17; i50++) {
                                if (!zZza) {
                                    zzhaVar.zzc(i15);
                                } else if (zzhaVar.zza()) {
                                    zzhaVar.zzc(i15);
                                }
                            }
                        }
                        int i51 = i13;
                        int iZzb19 = zzhaVar.zzb(i51);
                        if (iZzb19 > 2) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb5.append("lookup type greater than 2 not decodable: ");
                            sb5.append(iZzb19);
                            throw zzat.zzb(sb5.toString(), null);
                        }
                        if (iZzb19 != i12) {
                            if (iZzb19 != 2) {
                                i12 = i12;
                            }
                            i16++;
                            i12 = i12;
                            i13 = 4;
                            i15 = 5;
                        } else {
                            i17 = iZzb19;
                        }
                        zzhaVar.zzc(32);
                        zzhaVar.zzc(32);
                        int iZzb20 = zzhaVar.zzb(i51) + i12;
                        zzhaVar.zzc(i12);
                        zzhaVar.zzc((int) ((i17 == i12 ? iZzb16 != 0 ? (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16))) : 0L : ((long) iZzb16) * ((long) iZzb17)) * ((long) iZzb20)));
                        i16++;
                        i12 = i12;
                        i13 = 4;
                        i15 = 5;
                    }
                }
            }
            this.zza = zzanaVar;
            if (zzanaVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzhd zzhdVar2 = zzanaVar.zza;
            arrayList.add(zzhdVar2.zzg);
            arrayList.add(zzanaVar.zzc);
            zzap zzapVarZzb = zzahm.zzb(zzgwm.zzr(zzanaVar.zzb.zza));
            zzt zztVar = new zzt();
            zztVar.zzn("audio/ogg");
            zztVar.zzo(MimeTypes.AUDIO_VORBIS);
            zztVar.zzi(zzhdVar2.zzd);
            zztVar.zzj(zzhdVar2.zzc);
            zztVar.zzG(zzhdVar2.zza);
            zztVar.zzH(zzhdVar2.zzb);
            zztVar.zzr(arrayList);
            zztVar.zzl(zzapVarZzb);
            zzamxVar.zza = zztVar.zzO();
            return true;
        }
        zzhe.zzc(1, zzetVar, false);
        int iZzI = zzetVar.zzI();
        int iZzs2 = zzetVar.zzs();
        int iZzI2 = zzetVar.zzI();
        int iZzC = zzetVar.zzC();
        int i52 = iZzC <= 0 ? -1 : iZzC;
        int iZzC2 = zzetVar.zzC();
        int i53 = iZzC2 <= 0 ? -1 : iZzC2;
        int iZzC3 = zzetVar.zzC();
        int i54 = iZzC3 <= 0 ? -1 : iZzC3;
        int iZzs3 = zzetVar.zzs();
        this.zzd = new zzhd(iZzI, iZzs2, iZzI2, i52, i53, i54, (int) Math.pow(2.0d, iZzs3 & 15), (int) Math.pow(2.0d, (iZzs3 & PsExtractor.VIDEO_STREAM_MASK) >> 4), 1 == (zzetVar.zzs() & 1), Arrays.copyOf(zzetVar.zzi(), zzetVar.zze()));
        zzanaVar = null;
        this.zza = zzanaVar;
        if (zzanaVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        zzhd zzhdVar3 = zzanaVar.zza;
        arrayList2.add(zzhdVar3.zzg);
        arrayList2.add(zzanaVar.zzc);
        zzap zzapVarZzb2 = zzahm.zzb(zzgwm.zzr(zzanaVar.zzb.zza));
        zzt zztVar2 = new zzt();
        zztVar2.zzn("audio/ogg");
        zztVar2.zzo(MimeTypes.AUDIO_VORBIS);
        zztVar2.zzi(zzhdVar3.zzd);
        zztVar2.zzj(zzhdVar3.zzc);
        zztVar2.zzG(zzhdVar3.zza);
        zztVar2.zzH(zzhdVar3.zzb);
        zztVar2.zzr(arrayList2);
        zztVar2.zzl(zzapVarZzb2);
        zzamxVar.zza = zztVar2.zzO();
        return true;
    }
}
