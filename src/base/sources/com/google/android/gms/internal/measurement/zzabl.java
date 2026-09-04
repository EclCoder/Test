package com.google.android.gms.internal.measurement;

import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabl extends zzabp {
    private static final zzabp zza = new zzabl();

    private zzabl() {
    }

    public static zzabp zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzabp
    public final int zzb(zzabm zzabmVar, int i10, String str, int i11, int i12, int i13) {
        boolean z10;
        zzabh zzabhVarZza;
        char cCharAt = str.charAt(i13);
        if ((cCharAt & ' ') == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzza zzzaVarZzb = zzza.zzb(str, i12, i13, z10);
        zzyz zzyzVarZza = zzyz.zza(cCharAt);
        int i14 = i13 + 1;
        if (zzyzVarZza != null) {
            if (zzzaVarZzb.zzi(zzyzVarZza)) {
                zzabhVarZza = zzabj.zza(i10, zzyzVarZza, zzzaVarZzb);
            } else {
                throw zzabo.zza("invalid format specifier", str, i11, i14);
            }
        } else if (cCharAt != 't' && cCharAt != 'T') {
            if (cCharAt != 'h' && cCharAt != 'H') {
                throw zzabo.zza("invalid format specification", str, i11, i14);
            }
            if (zzzaVarZzb.zzh(160, false)) {
                zzabhVarZza = new zzabk(zzzaVarZzb, i10, zzzaVarZzb);
            } else {
                throw zzabo.zza("invalid format specification", str, i11, i14);
            }
        } else if (zzzaVarZzb.zzh(160, false)) {
            int i15 = i13 + 2;
            if (i15 <= str.length()) {
                zzabf zzabfVarZza = zzabf.zza(str.charAt(i14));
                if (zzabfVarZza != null) {
                    zzabhVarZza = zzabg.zza(zzabfVarZza, zzzaVarZzb, i10);
                    i14 = i15;
                } else {
                    throw zzabo.zzb("illegal date/time conversion", str, i14);
                }
            } else {
                throw zzabo.zzb(YSHErhbVu.bqrEqKmVRlCvDL, str, i11);
            }
        } else {
            throw zzabo.zza("invalid format specification", str, i11, i14);
        }
        zzabmVar.zzk(i11, i14, zzabhVarZza);
        return i14;
    }
}
