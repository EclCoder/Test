package com.google.android.gms.internal.measurement;

import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaal {
    public static String zza(String str, String str2, boolean z10) {
        if (str2.length() > 23) {
            int i10 = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i10 = length;
                    break;
                }
            }
            str2 = str2.substring(i10 + 1);
        }
        String strConcat = "".concat(String.valueOf(str2));
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static int zzb(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }
}
