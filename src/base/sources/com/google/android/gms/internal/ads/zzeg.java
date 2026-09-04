package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeg {
    private static final Object zza = new Object();

    public static void zza(String str, String str2) {
        synchronized (zza) {
            Log.d(str, zzg(str2, null));
        }
    }

    public static void zzb(String str, String str2) {
        synchronized (zza) {
            Log.i(str, zzg(str2, null));
        }
    }

    public static void zzc(String str, String str2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, null));
        }
    }

    public static void zzd(String str, String str2, Throwable th2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, th2));
        }
    }

    public static void zze(String str, String str2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, null));
        }
    }

    public static void zzf(String str, String str2, Throwable th2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, th2));
        }
    }

    public static String zzg(String str, Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (zza) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(strReplace2).length() + 1);
        sb2.append(str);
        sb2.append("\n  ");
        sb2.append(strReplace2);
        sb2.append("\n");
        return sb2.toString();
    }
}
