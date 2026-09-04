package com.google.android.gms.internal.play_billing;

import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbo {
    public static String zza(String str) {
        if (zzbk.zza(str)) {
            return null;
        }
        return str;
    }

    public static String zzb(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(zze(objArr[i10]));
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i10 < length) {
            String str2 = " [";
            while (i10 < objArr.length) {
                sb2.append(str2);
                sb2.append(zze(objArr[i10]));
                i10++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String zzc(String str) {
        return str == null ? "" : str;
    }

    public static boolean zzd(String str) {
        return zzbk.zza(str);
    }

    private static String zze(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger(Lykgign.wQqwrMym).logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e10);
            return "<" + str + " threw " + e10.getClass().getName() + ">";
        }
    }
}
