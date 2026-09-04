package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzafb {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:147:0x020c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0212  */
    /* JADX WARN: Code duplicated, block: B:156:0x0226  */
    /* JADX WARN: Code duplicated, block: B:158:0x023a A[LOOP:2: B:157:0x0238->B:158:0x023a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x0249  */
    /* JADX WARN: Code duplicated, block: B:163:0x0252  */
    /* JADX WARN: Code duplicated, block: B:165:0x025c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0261  */
    /* JADX WARN: Code duplicated, block: B:170:0x026c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0272  */
    /* JADX WARN: Code duplicated, block: B:179:0x029e  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:183:0x02af  */
    /* JADX WARN: Code duplicated, block: B:184:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:185:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:187:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:188:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:189:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:190:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:191:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:192:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:193:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:205:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:208:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:209:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:210:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:212:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:214:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:217:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:219:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:221:0x0300  */
    /* JADX WARN: Code duplicated, block: B:223:0x0303  */
    /* JADX WARN: Code duplicated, block: B:225:0x0306  */
    /* JADX WARN: Code duplicated, block: B:227:0x0309  */
    /* JADX WARN: Code duplicated, block: B:229:0x0330  */
    /* JADX WARN: Code duplicated, block: B:230:0x0332  */
    /* JADX WARN: Code duplicated, block: B:231:0x0335  */
    /* JADX WARN: Code duplicated, block: B:232:0x0337  */
    /* JADX WARN: Code duplicated, block: B:233:0x0339  */
    /* JADX WARN: Code duplicated, block: B:235:0x033d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0382  */
    public static zzv zza(zzet zzetVar, String str, String str2, zzq zzqVar) throws zzat {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int i19;
        boolean zZzi;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int i20;
        boolean z11;
        int i21;
        int i22;
        int i23;
        int i24;
        int iZzc;
        int iZzj4;
        int i25;
        zzes zzesVar = new zzes();
        zzesVar.zza(zzetVar);
        int iZzc2 = zzesVar.zzc();
        int iZzj5 = zzesVar.zzj(3);
        if (iZzj5 > 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj5).length() + 30);
            sb2.append("Unsupported AC-4 DSI version: ");
            sb2.append(iZzj5);
            throw zzat.zzc(sb2.toString());
        }
        int iZzj6 = zzesVar.zzj(7);
        int i26 = true != zzesVar.zzi() ? 44100 : 48000;
        zzesVar.zzh(4);
        int iZzj7 = zzesVar.zzj(9);
        if (iZzj6 > 1) {
            if (iZzj5 == 0) {
                throw zzat.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzesVar.zzi()) {
                zzesVar.zzh(16);
                if (zzesVar.zzi()) {
                    zzesVar.zzh(128);
                }
            }
        }
        if (iZzj5 == 1) {
            if (!zzg(zzesVar)) {
                throw zzat.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzesVar.zzm();
        }
        zzaez zzaezVar = new zzaez(null);
        int i27 = 0;
        while (true) {
            if (i27 < iZzj7) {
                if (iZzj5 == 0) {
                    zZzi = zzesVar.zzi();
                    iZzj = zzesVar.zzj(5);
                    iZzj2 = zzesVar.zzj(5);
                    iZzj3 = 0;
                    i20 = 0;
                    z11 = false;
                } else {
                    int iZzj8 = zzesVar.zzj(8);
                    iZzj3 = zzesVar.zzj(8);
                    if (iZzj3 == 255) {
                        iZzj3 = zzesVar.zzj(16) + 255;
                    }
                    if (iZzj8 > 2) {
                        zzesVar.zzh(iZzj3 * 8);
                        i27++;
                    } else {
                        int iZzc3 = (iZzc2 - zzesVar.zzc()) / 8;
                        iZzj = zzesVar.zzj(5);
                        iZzj2 = iZzj8;
                        z11 = iZzj == 31;
                        i20 = iZzc3;
                        zZzi = false;
                    }
                }
                zzaezVar.zzf = iZzj2;
                if (zZzi || z11 || iZzj != 6) {
                    zzaezVar.zzg = zzesVar.zzj(3);
                    if (zzesVar.zzi()) {
                        zzesVar.zzh(5);
                    }
                    zzesVar.zzh(2);
                    if (iZzj5 == 1) {
                        if (iZzj2 != 1) {
                            if (iZzj2 == 2) {
                                iZzj2 = 2;
                                zzesVar.zzh(2);
                            }
                            if (iZzj2 <= 0) {
                                i10 = 8;
                                i11 = 5;
                            } else {
                                if (!zzesVar.zzi() && !zzg(zzesVar)) {
                                    throw zzat.zzc("Can't parse bitrate DSI.");
                                }
                                if (zzesVar.zzi()) {
                                    zzesVar.zzm();
                                    zzesVar.zzo(zzesVar.zzj(16));
                                    i11 = 5;
                                    iZzj4 = zzesVar.zzj(5);
                                    for (i25 = 0; i25 < iZzj4; i25++) {
                                        zzesVar.zzh(3);
                                        zzesVar.zzh(8);
                                    }
                                    i10 = 8;
                                } else {
                                    i10 = 8;
                                    i11 = 5;
                                }
                            }
                            zzesVar.zzm();
                            if (iZzj5 == 1) {
                                iZzc = ((i21 - zzesVar.zzc()) / i10) - i20;
                                if (iZzj3 < iZzc) {
                                    throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                                }
                                zzesVar.zzo(iZzj3 - iZzc);
                            }
                            if (zzaezVar.zza) {
                                i13 = -1;
                                if (zzaezVar.zzb == -1) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(i27).length() + 45);
                                    sb3.append("Can't determine channel mode of presentation ");
                                    sb3.append(i27);
                                    throw zzat.zzc(sb3.toString());
                                }
                            }
                            if (zzaezVar.zza) {
                                i18 = zzaezVar.zzb;
                                z10 = zzaezVar.zzd;
                                i19 = zzaezVar.zze;
                                switch (i18) {
                                    case 0:
                                        i13 = 1;
                                        break;
                                    case 1:
                                        i13 = 2;
                                        break;
                                    case 2:
                                        i13 = 3;
                                        break;
                                    case 3:
                                        i13 = i11;
                                        break;
                                    case 4:
                                        i13 = 6;
                                        break;
                                    case 5:
                                    case 7:
                                    case 9:
                                        i13 = i12;
                                        break;
                                    case 6:
                                    case 8:
                                    case 10:
                                        i13 = i10;
                                        break;
                                    case 11:
                                        i13 = 11;
                                        break;
                                    case 12:
                                        i13 = 12;
                                        break;
                                    case 13:
                                        i13 = 13;
                                        break;
                                    case 14:
                                        i13 = 14;
                                        break;
                                    case 15:
                                        i13 = 24;
                                        break;
                                }
                                if (i18 != 11 || i18 == 12 || i18 == 13 || i18 == 14) {
                                    if (!z10) {
                                        i13 -= 2;
                                    }
                                    i17 = i13;
                                    if (i19 == 0) {
                                        i17 -= 4;
                                    } else if (i19 == 1) {
                                        i17 -= 2;
                                    }
                                } else {
                                    i17 = i13;
                                }
                            } else {
                                i14 = zzaezVar.zzc;
                                if (i14 > 0) {
                                    i17 = i14 + 1;
                                    if (zzaezVar.zzg == 4 && i17 == 17) {
                                        i17 = 21;
                                    }
                                } else {
                                    i15 = zzaezVar.zzg;
                                    if (i15 != 0) {
                                        i16 = 2;
                                    } else if (i15 != 1) {
                                        i16 = 2;
                                        if (i15 != 2) {
                                            i17 = i10;
                                        } else if (i15 != 3) {
                                            i17 = 10;
                                        } else if (i15 != 4) {
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(i15).length() + 33);
                                            sb4.append("AC-4 level ");
                                            sb4.append(i15);
                                            sb4.append(" has not been defined.");
                                            zzeg.zzc("Ac4Util", sb4.toString());
                                        } else {
                                            i17 = 12;
                                        }
                                    } else {
                                        i17 = 6;
                                    }
                                    i17 = i16;
                                }
                            }
                            if (i17 > 0) {
                                throw zzat.zzc("Cannot determine channel count of presentation.");
                            }
                            Object[] objArr = {Integer.valueOf(iZzj6), Integer.valueOf(zzaezVar.zzf), Integer.valueOf(zzaezVar.zzg)};
                            String str3 = zzfl.zza;
                            String str4 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                            zzt zztVar = new zzt();
                            zztVar.zza(str);
                            zztVar.zzo("audio/ac4");
                            zztVar.zzG(i17);
                            zztVar.zzH(i26);
                            zztVar.zzs(zzqVar);
                            zztVar.zze(str2);
                            zztVar.zzk(str4);
                            return zztVar.zzO();
                        }
                        zzesVar.zzh(2);
                    }
                    zzesVar.zzh(5);
                    zzesVar.zzh(10);
                    if (iZzj5 == 1) {
                        if (iZzj2 > 0) {
                            zzaezVar.zza = zzesVar.zzi();
                        }
                        if (zzaezVar.zza) {
                            if (iZzj2 != 1) {
                                i22 = 2;
                                if (iZzj2 == 2) {
                                    i24 = 2;
                                } else {
                                    i21 = iZzc2;
                                    i24 = iZzj2;
                                }
                                zzesVar.zzh(24);
                                i23 = 1;
                            } else {
                                i24 = 1;
                            }
                            i21 = iZzc2;
                            int iZzj9 = zzesVar.zzj(5);
                            if (iZzj9 >= 0 && iZzj9 <= 15) {
                                zzaezVar.zzb = iZzj9;
                            }
                            if (iZzj9 < 11 || iZzj9 > 14) {
                                i22 = 2;
                            } else {
                                zzaezVar.zzd = zzesVar.zzi();
                                i22 = 2;
                                zzaezVar.zze = zzesVar.zzj(2);
                            }
                            zzesVar.zzh(24);
                            i23 = 1;
                        } else {
                            i21 = iZzc2;
                            i22 = 2;
                            i23 = 1;
                            i24 = iZzj2;
                        }
                        if (iZzj2 == i23 || iZzj2 == i22) {
                            if (zzesVar.zzi() && zzesVar.zzi()) {
                                zzesVar.zzh(i22);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzg();
                                int i28 = 8;
                                int iZzj10 = zzesVar.zzj(8);
                                int i29 = 0;
                                while (i29 < iZzj10) {
                                    zzesVar.zzh(i28);
                                    i29++;
                                    i28 = 8;
                                }
                            }
                        }
                        iZzj2 = i24;
                    } else {
                        i21 = iZzc2;
                    }
                    if (!zZzi && !z11) {
                        zzesVar.zzg();
                        if (iZzj == 0 || iZzj == 1 || iZzj == 2) {
                            if (iZzj2 == 0) {
                                for (int i30 = 0; i30 < 2; i30++) {
                                    zzd(zzesVar, zzaezVar);
                                }
                                iZzj2 = 0;
                            } else {
                                for (int i31 = 0; i31 < 2; i31++) {
                                    zze(zzesVar, zzaezVar);
                                }
                            }
                        } else if (iZzj == 3 || iZzj == 4) {
                            if (iZzj2 == 0) {
                                for (int i32 = 0; i32 < 3; i32++) {
                                    zzd(zzesVar, zzaezVar);
                                }
                                iZzj2 = 0;
                            } else {
                                for (int i33 = 0; i33 < 3; i33++) {
                                    zze(zzesVar, zzaezVar);
                                }
                            }
                        } else if (iZzj != 5) {
                            int iZzj11 = zzesVar.zzj(7);
                            for (int i34 = 0; i34 < iZzj11; i34++) {
                                zzesVar.zzh(8);
                            }
                        } else if (iZzj2 == 0) {
                            zzd(zzesVar, zzaezVar);
                            iZzj2 = 0;
                        } else {
                            int iZzj12 = zzesVar.zzj(3);
                            for (int i35 = 0; i35 < iZzj12 + 2; i35++) {
                                zze(zzesVar, zzaezVar);
                            }
                        }
                    } else if (iZzj2 == 0) {
                        zzd(zzesVar, zzaezVar);
                        iZzj2 = 0;
                    } else {
                        zze(zzesVar, zzaezVar);
                    }
                    zzesVar.zzg();
                    if (!zzesVar.zzi()) {
                        i12 = 7;
                    }
                    if (iZzj2 <= 0) {
                        i10 = 8;
                        i11 = 5;
                    } else {
                        if (!zzesVar.zzi()) {
                        }
                        if (zzesVar.zzi()) {
                            zzesVar.zzm();
                            zzesVar.zzo(zzesVar.zzj(16));
                            i11 = 5;
                            iZzj4 = zzesVar.zzj(5);
                            while (i25 < iZzj4) {
                                zzesVar.zzh(3);
                                zzesVar.zzh(8);
                            }
                            i10 = 8;
                        } else {
                            i10 = 8;
                            i11 = 5;
                        }
                    }
                    zzesVar.zzm();
                    if (iZzj5 == 1) {
                        iZzc = ((i21 - zzesVar.zzc()) / i10) - i20;
                        if (iZzj3 < iZzc) {
                            throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                        }
                        zzesVar.zzo(iZzj3 - iZzc);
                    }
                    if (zzaezVar.zza) {
                        i13 = -1;
                        if (zzaezVar.zzb == -1) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(i27).length() + 45);
                            sb5.append("Can't determine channel mode of presentation ");
                            sb5.append(i27);
                            throw zzat.zzc(sb5.toString());
                        }
                    }
                    if (zzaezVar.zza) {
                        i18 = zzaezVar.zzb;
                        z10 = zzaezVar.zzd;
                        i19 = zzaezVar.zze;
                        switch (i18) {
                            case 0:
                                i13 = 1;
                                break;
                            case 1:
                                i13 = 2;
                                break;
                            case 2:
                                i13 = 3;
                                break;
                            case 3:
                                i13 = i11;
                                break;
                            case 4:
                                i13 = 6;
                                break;
                            case 5:
                            case 7:
                            case 9:
                                i13 = i12;
                                break;
                            case 6:
                            case 8:
                            case 10:
                                i13 = i10;
                                break;
                            case 11:
                                i13 = 11;
                                break;
                            case 12:
                                i13 = 12;
                                break;
                            case 13:
                                i13 = 13;
                                break;
                            case 14:
                                i13 = 14;
                                break;
                            case 15:
                                i13 = 24;
                                break;
                        }
                        if (i18 != 11) {
                            if (!z10) {
                                i13 -= 2;
                            }
                            i17 = i13;
                            if (i19 == 0) {
                                i17 -= 4;
                            } else if (i19 == 1) {
                                i17 -= 2;
                            }
                        } else {
                            if (!z10) {
                                i13 -= 2;
                            }
                            i17 = i13;
                            if (i19 == 0) {
                                i17 -= 4;
                            } else if (i19 == 1) {
                                i17 -= 2;
                            }
                        }
                    } else {
                        i14 = zzaezVar.zzc;
                        if (i14 > 0) {
                            i17 = i14 + 1;
                            if (zzaezVar.zzg == 4) {
                                i17 = 21;
                            }
                        } else {
                            i15 = zzaezVar.zzg;
                            if (i15 != 0) {
                                i16 = 2;
                            } else if (i15 != 1) {
                                i16 = 2;
                                if (i15 != 2) {
                                    i17 = i10;
                                } else if (i15 != 3) {
                                    i17 = 10;
                                } else if (i15 != 4) {
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(i15).length() + 33);
                                    sb6.append("AC-4 level ");
                                    sb6.append(i15);
                                    sb6.append(" has not been defined.");
                                    zzeg.zzc("Ac4Util", sb6.toString());
                                } else {
                                    i17 = 12;
                                }
                            } else {
                                i17 = 6;
                            }
                            i17 = i16;
                        }
                    }
                    if (i17 > 0) {
                        throw zzat.zzc("Cannot determine channel count of presentation.");
                    }
                    Object[] objArr2 = {Integer.valueOf(iZzj6), Integer.valueOf(zzaezVar.zzf), Integer.valueOf(zzaezVar.zzg)};
                    String str5 = zzfl.zza;
                    String str6 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr2);
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzo("audio/ac4");
                    zztVar2.zzG(i17);
                    zztVar2.zzH(i26);
                    zztVar2.zzs(zzqVar);
                    zztVar2.zze(str2);
                    zztVar2.zzk(str6);
                    return zztVar2.zzO();
                }
                i21 = iZzc2;
                i12 = 7;
                int iZzj13 = zzesVar.zzj(7);
                for (int i36 = 0; i36 < iZzj13; i36++) {
                    zzesVar.zzh(15);
                }
                if (iZzj2 <= 0) {
                    i10 = 8;
                    i11 = 5;
                } else {
                    if (!zzesVar.zzi()) {
                    }
                    if (zzesVar.zzi()) {
                        zzesVar.zzm();
                        zzesVar.zzo(zzesVar.zzj(16));
                        i11 = 5;
                        iZzj4 = zzesVar.zzj(5);
                        while (i25 < iZzj4) {
                            zzesVar.zzh(3);
                            zzesVar.zzh(8);
                        }
                        i10 = 8;
                    } else {
                        i10 = 8;
                        i11 = 5;
                    }
                }
                zzesVar.zzm();
                if (iZzj5 == 1) {
                    iZzc = ((i21 - zzesVar.zzc()) / i10) - i20;
                    if (iZzj3 < iZzc) {
                        throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                    }
                    zzesVar.zzo(iZzj3 - iZzc);
                }
                if (zzaezVar.zza) {
                    i13 = -1;
                    if (zzaezVar.zzb == -1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i27).length() + 45);
                        sb7.append("Can't determine channel mode of presentation ");
                        sb7.append(i27);
                        throw zzat.zzc(sb7.toString());
                    }
                }
                if (zzaezVar.zza) {
                    i18 = zzaezVar.zzb;
                    z10 = zzaezVar.zzd;
                    i19 = zzaezVar.zze;
                    switch (i18) {
                        case 0:
                            i13 = 1;
                            break;
                        case 1:
                            i13 = 2;
                            break;
                        case 2:
                            i13 = 3;
                            break;
                        case 3:
                            i13 = i11;
                            break;
                        case 4:
                            i13 = 6;
                            break;
                        case 5:
                        case 7:
                        case 9:
                            i13 = i12;
                            break;
                        case 6:
                        case 8:
                        case 10:
                            i13 = i10;
                            break;
                        case 11:
                            i13 = 11;
                            break;
                        case 12:
                            i13 = 12;
                            break;
                        case 13:
                            i13 = 13;
                            break;
                        case 14:
                            i13 = 14;
                            break;
                        case 15:
                            i13 = 24;
                            break;
                    }
                    if (i18 != 11) {
                        if (!z10) {
                            i13 -= 2;
                        }
                        i17 = i13;
                        if (i19 == 0) {
                            i17 -= 4;
                        } else if (i19 == 1) {
                            i17 -= 2;
                        }
                    } else {
                        if (!z10) {
                            i13 -= 2;
                        }
                        i17 = i13;
                        if (i19 == 0) {
                            i17 -= 4;
                        } else if (i19 == 1) {
                            i17 -= 2;
                        }
                    }
                } else {
                    i14 = zzaezVar.zzc;
                    if (i14 > 0) {
                        i17 = i14 + 1;
                        if (zzaezVar.zzg == 4) {
                            i17 = 21;
                        }
                    } else {
                        i15 = zzaezVar.zzg;
                        if (i15 != 0) {
                            i16 = 2;
                        } else if (i15 != 1) {
                            i16 = 2;
                            if (i15 != 2) {
                                i17 = i10;
                            } else if (i15 != 3) {
                                i17 = 10;
                            } else if (i15 != 4) {
                                StringBuilder sb8 = new StringBuilder(String.valueOf(i15).length() + 33);
                                sb8.append("AC-4 level ");
                                sb8.append(i15);
                                sb8.append(" has not been defined.");
                                zzeg.zzc("Ac4Util", sb8.toString());
                            } else {
                                i17 = 12;
                            }
                        } else {
                            i17 = 6;
                        }
                        i17 = i16;
                    }
                }
                if (i17 > 0) {
                    throw zzat.zzc("Cannot determine channel count of presentation.");
                }
                Object[] objArr3 = {Integer.valueOf(iZzj6), Integer.valueOf(zzaezVar.zzf), Integer.valueOf(zzaezVar.zzg)};
                String str7 = zzfl.zza;
                String str8 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr3);
                zzt zztVar3 = new zzt();
                zztVar3.zza(str);
                zztVar3.zzo("audio/ac4");
                zztVar3.zzG(i17);
                zztVar3.zzH(i26);
                zztVar3.zzs(zzqVar);
                zztVar3.zze(str2);
                zztVar3.zzk(str8);
                return zztVar3.zzO();
            }
            i10 = 8;
            i11 = 5;
            i12 = 7;
            i13 = -1;
            if (zzaezVar.zza) {
                i18 = zzaezVar.zzb;
                z10 = zzaezVar.zzd;
                i19 = zzaezVar.zze;
                switch (i18) {
                    case 0:
                        i13 = 1;
                        break;
                    case 1:
                        i13 = 2;
                        break;
                    case 2:
                        i13 = 3;
                        break;
                    case 3:
                        i13 = i11;
                        break;
                    case 4:
                        i13 = 6;
                        break;
                    case 5:
                    case 7:
                    case 9:
                        i13 = i12;
                        break;
                    case 6:
                    case 8:
                    case 10:
                        i13 = i10;
                        break;
                    case 11:
                        i13 = 11;
                        break;
                    case 12:
                        i13 = 12;
                        break;
                    case 13:
                        i13 = 13;
                        break;
                    case 14:
                        i13 = 14;
                        break;
                    case 15:
                        i13 = 24;
                        break;
                }
                if (i18 != 11) {
                    if (!z10) {
                        i13 -= 2;
                    }
                    i17 = i13;
                    if (i19 == 0) {
                        i17 -= 4;
                    } else if (i19 == 1) {
                        i17 -= 2;
                    }
                } else {
                    if (!z10) {
                        i13 -= 2;
                    }
                    i17 = i13;
                    if (i19 == 0) {
                        i17 -= 4;
                    } else if (i19 == 1) {
                        i17 -= 2;
                    }
                }
            } else {
                i14 = zzaezVar.zzc;
                if (i14 > 0) {
                    i17 = i14 + 1;
                    if (zzaezVar.zzg == 4) {
                        i17 = 21;
                    }
                } else {
                    i15 = zzaezVar.zzg;
                    if (i15 != 0) {
                        i16 = 2;
                    } else if (i15 != 1) {
                        i16 = 2;
                        if (i15 != 2) {
                            i17 = i10;
                        } else if (i15 != 3) {
                            i17 = 10;
                        } else if (i15 != 4) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(i15).length() + 33);
                            sb9.append("AC-4 level ");
                            sb9.append(i15);
                            sb9.append(" has not been defined.");
                            zzeg.zzc("Ac4Util", sb9.toString());
                        } else {
                            i17 = 12;
                        }
                    } else {
                        i17 = 6;
                    }
                    i17 = i16;
                }
            }
            if (i17 > 0) {
                throw zzat.zzc("Cannot determine channel count of presentation.");
            }
            Object[] objArr4 = {Integer.valueOf(iZzj6), Integer.valueOf(zzaezVar.zzf), Integer.valueOf(zzaezVar.zzg)};
            String str9 = zzfl.zza;
            String str10 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr4);
            zzt zztVar4 = new zzt();
            zztVar4.zza(str);
            zztVar4.zzo("audio/ac4");
            zztVar4.zzG(i17);
            zztVar4.zzH(i26);
            zztVar4.zzs(zzqVar);
            zztVar4.zze(str2);
            zztVar4.zzk(str10);
            return zztVar4.zzO();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    public static zzafa zzb(zzes zzesVar) {
        int i10;
        int iZzj;
        int iZzj2 = zzesVar.zzj(16);
        int iZzj3 = zzesVar.zzj(16);
        if (iZzj3 == 65535) {
            iZzj3 = zzesVar.zzj(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i11 = iZzj3 + i10;
        if (iZzj2 == 44097) {
            i11 += 2;
        }
        int i12 = i11;
        int iZzj4 = zzesVar.zzj(2);
        int i13 = 0;
        if (iZzj4 == 3) {
            int i14 = 0;
            while (true) {
                iZzj = i14 + zzesVar.zzj(2);
                if (!zzesVar.zzi()) {
                    break;
                }
                i14 = (iZzj + 1) << 2;
            }
            iZzj4 = iZzj + 3;
        }
        int i15 = iZzj4;
        int iZzj5 = zzesVar.zzj(10);
        if (zzesVar.zzi() && zzesVar.zzj(3) > 0) {
            zzesVar.zzh(2);
        }
        int i16 = 48000;
        if (true != zzesVar.zzi()) {
            i16 = 44100;
        }
        int iZzj6 = zzesVar.zzj(4);
        if (i16 == 44100 && iZzj6 == 13) {
            i13 = zzb[13];
        } else if (i16 == 48000 && iZzj6 < 14) {
            i13 = zzb[iZzj6];
            int i17 = iZzj5 % 5;
            if (i17 == 1) {
                if (iZzj6 != 3 || iZzj6 == 8) {
                    i13++;
                }
            } else if (i17 != 2) {
                if (i17 != 3) {
                    if (i17 == 4 && (iZzj6 == 3 || iZzj6 == 8 || iZzj6 == 11)) {
                        i13++;
                    }
                } else if (iZzj6 != 3) {
                    i13++;
                } else {
                    i13++;
                }
            } else if (iZzj6 == 8 || iZzj6 == 11) {
                i13++;
            }
        }
        return new zzafa(i15, 2, i16, i12, i13, null);
    }

    public static void zzc(int i10, zzet zzetVar) {
        zzetVar.zza(7);
        byte[] bArrZzi = zzetVar.zzi();
        bArrZzi[0] = -84;
        bArrZzi[1] = 64;
        bArrZzi[2] = -1;
        bArrZzi[3] = -1;
        bArrZzi[4] = (byte) ((i10 >> 16) & 255);
        bArrZzi[5] = (byte) ((i10 >> 8) & 255);
        bArrZzi[6] = (byte) (i10 & 255);
    }

    private static void zzd(zzes zzesVar, zzaez zzaezVar) throws zzat {
        int iZzj = zzesVar.zzj(5);
        zzesVar.zzh(2);
        if (zzesVar.zzi()) {
            zzesVar.zzh(5);
        }
        if (iZzj >= 7 && iZzj <= 10) {
            zzesVar.zzg();
        }
        if (zzesVar.zzi()) {
            int iZzj2 = zzesVar.zzj(3);
            if (zzaezVar.zzb == -1 && iZzj >= 0 && iZzj <= 15 && (iZzj2 == 0 || iZzj2 == 1)) {
                zzaezVar.zzb = iZzj;
            }
            if (zzesVar.zzi()) {
                zzf(zzesVar);
            }
        }
    }

    private static void zze(zzes zzesVar, zzaez zzaezVar) throws zzat {
        zzesVar.zzh(2);
        boolean zZzi = zzesVar.zzi();
        int iZzj = zzesVar.zzj(8);
        for (int i10 = 0; i10 < iZzj; i10++) {
            zzesVar.zzh(2);
            if (zzesVar.zzi()) {
                zzesVar.zzh(5);
            }
            if (zZzi) {
                zzesVar.zzh(24);
            } else {
                if (zzesVar.zzi()) {
                    if (!zzesVar.zzi()) {
                        zzesVar.zzh(4);
                    }
                    zzaezVar.zzc = zzesVar.zzj(6) + 1;
                }
                zzesVar.zzh(4);
            }
        }
        if (zzesVar.zzi()) {
            zzesVar.zzh(3);
            if (zzesVar.zzi()) {
                zzf(zzesVar);
            }
        }
    }

    private static void zzf(zzes zzesVar) throws zzat {
        int iZzj = zzesVar.zzj(6);
        if (iZzj < 2 || iZzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzj)));
        }
        zzesVar.zzh(iZzj * 8);
    }

    private static boolean zzg(zzes zzesVar) {
        if (zzesVar.zzc() < 66) {
            return false;
        }
        zzesVar.zzh(66);
        return true;
    }
}
