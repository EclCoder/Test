package com.bytedance.adsdk.ugeno.dse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class qor {
    public static float hnj(String str, float f10) {
        if (str == null) {
            return f10;
        }
        try {
            return Float.parseFloat(str);
        } catch (Throwable unused) {
            return f10;
        }
    }

    public static int hnj(String str, int i10) {
        if (str == null) {
            return i10;
        }
        try {
            return (int) Float.parseFloat(str);
        } catch (Throwable unused) {
            return i10;
        }
    }

    public static long hnj(String str, long j10) {
        if (str == null) {
            return j10;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return j10;
        }
    }

    public static double hnj(String str, double d10) {
        if (str == null) {
            return d10;
        }
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            return d10;
        }
    }

    public static boolean hnj(String str, boolean z10) {
        if (str == null) {
            return z10;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Throwable unused) {
            return z10;
        }
    }
}
