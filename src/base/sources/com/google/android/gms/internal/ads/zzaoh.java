package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaoh {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgww zze = zzgww.zzj("auto", DevicePublicKeyStringDef.NONE);
    private static final zzgww zzf = zzgww.zzk("dot", "sesame", "circle");
    private static final zzgww zzg = zzgww.zzj("filled", com.vungle.ads.internal.presenter.g.OPEN);
    private static final zzgww zzh = zzgww.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaoh(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    public static zzaoh zza(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        String strZza = zzgss.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzgww zzgwwVarZzq = zzgww.zzq(TextUtils.split(strZza, zzd));
        String str2 = (String) zzgxa.zzb(zzgyw.zza(zzh, zzgwwVarZzq), "outside");
        int iHashCode = str2.hashCode();
        int i11 = 1;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                i10 = 2;
            } else {
                i10 = 1;
            }
        } else if (str2.equals("outside")) {
            i10 = -2;
        } else {
            i10 = 1;
        }
        zzgyv zzgyvVarZza = zzgyw.zza(zze, zzgwwVarZzq);
        int i12 = 0;
        if (zzgyvVarZza.isEmpty()) {
            zzgyv zzgyvVarZza2 = zzgyw.zza(zzg, zzgwwVarZzq);
            zzgyv zzgyvVarZza3 = zzgyw.zza(zzf, zzgwwVarZzq);
            if (zzgyvVarZza2.isEmpty() && zzgyvVarZza3.isEmpty()) {
                i11 = -1;
            } else {
                String str3 = (String) zzgxa.zzb(zzgyvVarZza2, "filled");
                i12 = (str3.hashCode() == 3417674 && str3.equals(com.vungle.ads.internal.presenter.g.OPEN)) ? 2 : 1;
                String str4 = (String) zzgxa.zzb(zzgyvVarZza3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i11 = 2;
                    }
                } else if (str4.equals("sesame")) {
                    i11 = 3;
                }
            }
        } else {
            String str5 = (String) zzgyvVarZza.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals(DevicePublicKeyStringDef.NONE)) {
                i11 = 0;
            } else {
                i11 = -1;
            }
        }
        return new zzaoh(i11, i12, i10);
    }
}
