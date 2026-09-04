package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhlm {
    public static boolean zza(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char cCharAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i10 = i11;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                    return false;
                }
                i10 += 2;
            }
        }
        return true;
    }

    public static zzibg zzb(String str) throws IOException {
        try {
            zzicd zzicdVar = new zzicd(new StringReader(str));
            zzicdVar.zza(zzibl.LEGACY_STRICT);
            return zzhlk.zza(zzicdVar);
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    public static long zzc(Number number) {
        if (number instanceof zzhll) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }
}
