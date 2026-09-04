package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzabp extends zzabn {
    private static final String zza;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
            if (!property.matches("\\n|\\r(?:\\n)?")) {
                property = "\n";
            }
        } catch (SecurityException unused) {
        }
        zza = property;
    }

    static int zze(String str, int i10) {
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            if (str.charAt(i10) != '%') {
                i10 = i11;
            } else {
                if (i11 >= str.length()) {
                    throw zzabo.zzc("trailing unquoted '%' character", str, i10);
                }
                char cCharAt = str.charAt(i11);
                if (cCharAt != '%' && cCharAt != 'n') {
                    return i10;
                }
                i10 += 2;
            }
        }
        return -1;
    }

    abstract int zzb(zzabm zzabmVar, int i10, String str, int i11, int i12, int i13);

    @Override // com.google.android.gms.internal.measurement.zzabn
    protected final void zzc(zzabm zzabmVar) {
        int i10;
        char cCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        String strZzi = zzabmVar.zzi();
        int iZze = zze(strZzi, 0);
        int i15 = 0;
        int i16 = -1;
        while (iZze >= 0) {
            int i17 = iZze + 1;
            int i18 = i17;
            int i19 = 0;
            while (true) {
                if (i18 >= strZzi.length()) {
                    throw zzabo.zzc("unterminated parameter", strZzi, iZze);
                }
                i10 = i18 + 1;
                cCharAt = strZzi.charAt(i18);
                char c10 = (char) (cCharAt - '0');
                if (c10 < '\n') {
                    i19 = (i19 * 10) + c10;
                    if (i19 >= 1000000) {
                        throw zzabo.zza("index too large", strZzi, iZze, i10);
                    }
                    i18 = i10;
                }
            }
            if (cCharAt == '$') {
                if (i18 - i17 == 0) {
                    throw zzabo.zza("missing index", strZzi, iZze, i10);
                }
                if (strZzi.charAt(i17) == '0') {
                    throw zzabo.zza("index has leading zero", strZzi, iZze, i10);
                }
                int i20 = i19 - 1;
                if (i10 == strZzi.length()) {
                    throw zzabo.zzc("unterminated parameter", strZzi, iZze);
                }
                strZzi.charAt(i10);
                i14 = i15;
                i13 = i18 + 2;
                i11 = i10;
                i12 = i20;
            } else if (cCharAt != '<') {
                int i21 = i15 + 1;
                i11 = i17;
                i12 = i15;
                i13 = i10;
                i14 = i21;
            } else {
                if (i16 == -1) {
                    throw zzabo.zza("invalid relative parameter", strZzi, iZze, i10);
                }
                if (i10 == strZzi.length()) {
                    throw zzabo.zzc("unterminated parameter", strZzi, iZze);
                }
                strZzi.charAt(i10);
                i14 = i15;
                i13 = i18 + 2;
                i11 = i10;
                i12 = i16;
            }
            int i22 = i13 - 1;
            while (true) {
                if (i22 >= strZzi.length()) {
                    throw zzabo.zzc("unterminated parameter", strZzi, iZze);
                }
                if (((char) ((strZzi.charAt(i22) & (-33)) - 65)) < 26) {
                    break;
                } else {
                    i22++;
                }
            }
            zzabm zzabmVar2 = zzabmVar;
            iZze = zze(strZzi, zzb(zzabmVar2, i12, strZzi, iZze, i11, i22));
            zzabmVar = zzabmVar2;
            i16 = i12;
            i15 = i14;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzabn
    public final void zzd(StringBuilder sb2, String str, int i10, int i11) {
        int i12 = i10;
        while (i10 < i11) {
            int i13 = i10 + 1;
            if (str.charAt(i10) == '%') {
                if (i13 == i11) {
                    break;
                }
                char cCharAt = str.charAt(i13);
                if (cCharAt == '%') {
                    sb2.append((CharSequence) str, i12, i13);
                } else if (cCharAt == 'n') {
                    sb2.append((CharSequence) str, i12, i10);
                    sb2.append(zza);
                }
                i12 = i10 + 2;
                i10 = i12;
            }
            i10 = i13;
        }
        if (i12 < i11) {
            sb2.append((CharSequence) str, i12, i11);
        }
    }
}
