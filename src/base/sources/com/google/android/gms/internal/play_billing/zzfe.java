package com.google.android.gms.internal.play_billing;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfe {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i10, zzfd zzfdVar) throws zzhb {
        int iZzi = zzi(bArr, i10, zzfdVar);
        int i11 = zzfdVar.zza;
        if (i11 < 0) {
            throw new zzhb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZzi) {
            throw new zzhb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zzfdVar.zzc = zzfp.zza;
            return iZzi;
        }
        zzfdVar.zzc = zzfp.zzk(bArr, iZzi, i11);
        return iZzi + i11;
    }

    static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int zzc(zzib zzibVar, byte[] bArr, int i10, int i11, int i12, zzfd zzfdVar) throws zzhb {
        Object objZze = zzibVar.zze();
        int iZzm = zzm(objZze, zzibVar, bArr, i10, i11, i12, zzfdVar);
        zzibVar.zzf(objZze);
        zzfdVar.zzc = objZze;
        return iZzm;
    }

    static int zzd(zzib zzibVar, byte[] bArr, int i10, int i11, zzfd zzfdVar) throws zzhb {
        Object objZze = zzibVar.zze();
        int iZzn = zzn(objZze, zzibVar, bArr, i10, i11, zzfdVar);
        zzibVar.zzf(objZze);
        zzfdVar.zzc = objZze;
        return iZzn;
    }

    static int zze(zzib zzibVar, int i10, byte[] bArr, int i11, int i12, zzgu zzguVar, zzfd zzfdVar) throws zzhb {
        int iZzd = zzd(zzibVar, bArr, i11, i12, zzfdVar);
        zzguVar.add(zzfdVar.zzc);
        while (iZzd < i12) {
            int iZzi = zzi(bArr, iZzd, zzfdVar);
            if (i10 != zzfdVar.zza) {
                break;
            }
            iZzd = zzd(zzibVar, bArr, iZzi, i12, zzfdVar);
            zzguVar.add(zzfdVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i10, zzgu zzguVar, zzfd zzfdVar) throws zzhb {
        zzgq zzgqVar = (zzgq) zzguVar;
        int iZzi = zzi(bArr, i10, zzfdVar);
        int i11 = zzfdVar.zza;
        if (i11 < 0) {
            throw new zzhb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZzi) {
            throw new zzhb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = i11 + iZzi;
        while (iZzi < i12) {
            iZzi = zzi(bArr, iZzi, zzfdVar);
            zzgqVar.zzh(zzfdVar.zza);
        }
        if (iZzi == i12) {
            return iZzi;
        }
        throw new zzhb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(byte[] bArr, int i10, zzfd zzfdVar) throws zzhb {
        int i11;
        int iZzi = zzi(bArr, i10, zzfdVar);
        int i12 = zzfdVar.zza;
        if (i12 < 0) {
            throw new zzhb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            zzfdVar.zzc = "";
            return iZzi;
        }
        int i13 = zzjc.zza;
        int length = bArr.length;
        if ((((length - iZzi) - i12) | iZzi | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzi), Integer.valueOf(i12)));
        }
        int i14 = iZzi + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (iZzi < i14) {
            byte b10 = bArr[iZzi];
            if (!zziy.zzd(b10)) {
                break;
            }
            iZzi++;
            cArr[i15] = (char) b10;
            i15++;
        }
        int i16 = i15;
        while (iZzi < i14) {
            int i17 = iZzi + 1;
            byte b11 = bArr[iZzi];
            if (zziy.zzd(b11)) {
                cArr[i16] = (char) b11;
                i16++;
                iZzi = i17;
                while (iZzi < i14) {
                    byte b12 = bArr[iZzi];
                    if (!zziy.zzd(b12)) {
                        break;
                    }
                    iZzi++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
            } else {
                if (b11 < -32) {
                    if (i17 >= i14) {
                        throw new zzhb("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    iZzi += 2;
                    zziy.zzc(b11, bArr[i17], cArr, i16);
                } else if (b11 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new zzhb("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    int i18 = iZzi + 2;
                    iZzi += 3;
                    zziy.zzb(b11, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new zzhb("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i17];
                    int i19 = iZzi + 3;
                    byte b14 = bArr[iZzi + 2];
                    iZzi += 4;
                    zziy.zza(b11, b13, b14, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i11;
            }
        }
        zzfdVar.zzc = new String(cArr, 0, i16);
        return i14;
    }

    static int zzh(int i10, byte[] bArr, int i11, int i12, zzir zzirVar, zzfd zzfdVar) throws zzhb {
        if ((i10 >>> 3) == 0) {
            throw new zzhb("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzl = zzl(bArr, i11, zzfdVar);
            zzirVar.zzj(i10, Long.valueOf(zzfdVar.zzb));
            return iZzl;
        }
        if (i13 == 1) {
            zzirVar.zzj(i10, Long.valueOf(zzp(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzi = zzi(bArr, i11, zzfdVar);
            int i14 = zzfdVar.zza;
            if (i14 < 0) {
                throw new zzhb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iZzi) {
                throw new zzhb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                zzirVar.zzj(i10, zzfp.zza);
            } else {
                zzirVar.zzj(i10, zzfp.zzk(bArr, iZzi, i14));
            }
            return iZzi + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzhb("Protocol message contained an invalid tag (zero).");
            }
            zzirVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzir zzirVarZzf = zzir.zzf();
        int i16 = zzfdVar.zze + 1;
        zzfdVar.zze = i16;
        zzq(i16);
        int i17 = 0;
        while (i11 < i12) {
            int iZzi2 = zzi(bArr, i11, zzfdVar);
            int i18 = zzfdVar.zza;
            if (i18 == i15) {
                i17 = i18;
                i11 = iZzi2;
                break;
            }
            i11 = zzh(i18, bArr, iZzi2, i12, zzirVarZzf, zzfdVar);
            i17 = i18;
        }
        zzfdVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zzhb("Failed to parse the message.");
        }
        zzirVar.zzj(i10, zzirVarZzf);
        return i11;
    }

    static int zzi(byte[] bArr, int i10, zzfd zzfdVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzj(b10, bArr, i11, zzfdVar);
        }
        zzfdVar.zza = b10;
        return i11;
    }

    static int zzj(int i10, byte[] bArr, int i11, zzfd zzfdVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        if (b10 >= 0) {
            zzfdVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzfdVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzfdVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzfdVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzfdVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int zzk(int i10, byte[] bArr, int i11, int i12, zzgu zzguVar, zzfd zzfdVar) {
        zzgq zzgqVar = (zzgq) zzguVar;
        int iZzi = zzi(bArr, i11, zzfdVar);
        zzgqVar.zzh(zzfdVar.zza);
        while (iZzi < i12) {
            int iZzi2 = zzi(bArr, iZzi, zzfdVar);
            if (i10 != zzfdVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzfdVar);
            zzgqVar.zzh(zzfdVar.zza);
        }
        return iZzi;
    }

    static int zzl(byte[] bArr, int i10, zzfd zzfdVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzfdVar.zzb = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        zzfdVar.zzb = j11;
        return i12;
    }

    static int zzm(Object obj, zzib zzibVar, byte[] bArr, int i10, int i11, int i12, zzfd zzfdVar) throws zzhb {
        int i13 = zzfdVar.zze + 1;
        zzfdVar.zze = i13;
        zzq(i13);
        int iZzc = ((zzhu) zzibVar).zzc(obj, bArr, i10, i11, i12, zzfdVar);
        zzfdVar.zze--;
        zzfdVar.zzc = obj;
        return iZzc;
    }

    static int zzn(Object obj, zzib zzibVar, byte[] bArr, int i10, int i11, zzfd zzfdVar) throws zzhb {
        int iZzj = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzj = zzj(i12, bArr, iZzj, zzfdVar);
            i12 = zzfdVar.zza;
        }
        int i13 = iZzj;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzhb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zzfdVar.zze + 1;
        zzfdVar.zze = i14;
        zzq(i14);
        int i15 = i13 + i12;
        zzibVar.zzh(obj, bArr, i13, i15, zzfdVar);
        zzfdVar.zze--;
        zzfdVar.zzc = obj;
        return i15;
    }

    static int zzo(int i10, byte[] bArr, int i11, int i12, zzfd zzfdVar) throws zzhb {
        if ((i10 >>> 3) == 0) {
            throw new zzhb("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzl(bArr, i11, zzfdVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzi(bArr, i11, zzfdVar) + zzfdVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzhb("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = zzfdVar.zze + 1;
        zzfdVar.zze = i15;
        zzq(i15);
        int i16 = 0;
        while (i11 < i12) {
            i11 = zzi(bArr, i11, zzfdVar);
            i16 = zzfdVar.zza;
            if (i16 == i14) {
                break;
            }
            i11 = zzo(i16, bArr, i11, i12, zzfdVar);
        }
        zzfdVar.zze--;
        if (i11 > i12 || i16 != i14) {
            throw new zzhb("Failed to parse the message.");
        }
        return i11;
    }

    static long zzp(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    private static void zzq(int i10) throws zzhb {
        if (i10 >= zzb) {
            throw new zzhb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
