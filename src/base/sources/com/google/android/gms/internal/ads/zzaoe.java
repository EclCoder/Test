package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaoe {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzaoe(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = i11;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115 A[Catch: RuntimeException -> 0x00b8, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00b8, blocks: (B:33:0x00be, B:35:0x00c4, B:39:0x00d4, B:41:0x00d8, B:45:0x00e7, B:47:0x00eb, B:51:0x00fc, B:53:0x0100, B:57:0x0111, B:59:0x0115, B:60:0x011d, B:68:0x013b, B:66:0x012e, B:28:0x009f, B:23:0x008b), top: B:73:0x0081, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0139  */
    public static zzaoe zza(String str, zzaoc zzaocVar) {
        float f10;
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int i15;
        String strTrim;
        int i16;
        zzgtj.zza(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i17 = zzaocVar.zzk;
        zzaoe zzaoeVar = null;
        if (length != i17) {
            Object[] objArr = {Integer.valueOf(i17), Integer.valueOf(length), str};
            String str2 = zzfl.zza;
            zzeg.zzc("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            String strTrim2 = strArrSplit[zzaocVar.zza].trim();
            int i18 = zzaocVar.zzb;
            int iZzd = i18 != -1 ? zzd(strArrSplit[i18].trim()) : -1;
            int i19 = zzaocVar.zzc;
            Integer numZzb = i19 != -1 ? zzb(strArrSplit[i19].trim()) : null;
            int i20 = zzaocVar.zzd;
            Integer numZzb2 = i20 != -1 ? zzb(strArrSplit[i20].trim()) : null;
            int i21 = zzaocVar.zze;
            try {
                if (i21 != -1) {
                    String strTrim3 = strArrSplit[i21].trim();
                    try {
                        f10 = Float.parseFloat(strTrim3);
                        zzaoeVar = null;
                    } catch (NumberFormatException e10) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strTrim3).length() + 29);
                        sb2.append("Failed to parse font size: '");
                        sb2.append(strTrim3);
                        sb2.append("'");
                        zzeg.zzd("SsaStyle", sb2.toString(), e10);
                        f10 = -3.4028235E38f;
                    }
                    i10 = zzaocVar.zzf;
                    boolean z13 = false;
                    if (i10 == -1 && zze(strArrSplit[i10].trim())) {
                        z13 = true;
                    }
                    i11 = zzaocVar.zzg;
                    if (i11 == -1 && zze(strArrSplit[i11].trim())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i12 = zzaocVar.zzh;
                    if (i12 == -1 && zze(strArrSplit[i12].trim())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i13 = zzaocVar.zzi;
                    if (i13 == -1 && zze(strArrSplit[i13].trim())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i14 = zzaocVar.zzj;
                    if (i14 != -1) {
                        strTrim = strArrSplit[i14].trim();
                        try {
                            i16 = Integer.parseInt(strTrim.trim());
                            if (i16 != 1 || i16 == 3) {
                                i15 = i16;
                            } else {
                                zzeg.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim)));
                                i15 = -1;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        i15 = -1;
                    }
                    return new zzaoe(strTrim2, iZzd, numZzb, numZzb2, f10, z13, z10, z11, z12, i15);
                }
                f10 = -3.4028235E38f;
                i10 = zzaocVar.zzf;
                boolean z14 = false;
                if (i10 == -1) {
                }
                i11 = zzaocVar.zzg;
                if (i11 == -1) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                i12 = zzaocVar.zzh;
                if (i12 == -1) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                i13 = zzaocVar.zzi;
                if (i13 == -1) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                i14 = zzaocVar.zzj;
                if (i14 != -1) {
                    strTrim = strArrSplit[i14].trim();
                    i16 = Integer.parseInt(strTrim.trim());
                    if (i16 != 1) {
                    }
                    i15 = i16;
                } else {
                    i15 = -1;
                }
                return new zzaoe(strTrim2, iZzd, numZzb, numZzb2, f10, z14, z10, z11, z12, i15);
            } catch (RuntimeException e11) {
                e = e11;
                StringBuilder sb3 = new StringBuilder(str.length() + 36);
                sb3.append("Skipping malformed 'Style:' line: '");
                sb3.append(str);
                sb3.append("'");
                zzeg.zzd("SsaStyle", sb3.toString(), e);
                return zzaoeVar;
            }
        } catch (RuntimeException e12) {
            e = e12;
            zzaoeVar = null;
        }
    }

    public static Integer zzb(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgtj.zza(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(zzhah.zza(((j10 >> 24) & 255) ^ 255), zzhah.zza(j10 & 255), zzhah.zza((j10 >> 8) & 255), zzhah.zza((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
            sb2.append("Failed to parse color expression: '");
            sb2.append(str);
            sb2.append("'");
            zzeg.zzd("SsaStyle", sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i10;
                default:
                    zzeg.zzc("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    private static boolean zze(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
            sb2.append("Failed to parse boolean value: '");
            sb2.append(str);
            sb2.append("'");
            zzeg.zzd("SsaStyle", sb2.toString(), e10);
            return false;
        }
    }
}
