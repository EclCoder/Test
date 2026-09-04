package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdx {
    public static boolean zzb() {
        return zzf("EGL_KHR_surfaceless_context");
    }

    public static boolean zzc(int i10) {
        if (i10 == 6) {
            return zzd();
        }
        if (i10 == 7) {
            return zzf("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    public static boolean zzd() {
        return Build.VERSION.SDK_INT >= 33 && zzf("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static void zze(boolean z10, String str) throws zzdw {
        if (!z10) {
            throw new zzdw(str, zzgwm.zzi());
        }
    }

    private static boolean zzf(String str) throws zzdw {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        zze(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        zze(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new zzdw("Error in getDefaultEglDisplay, error code: 0x".concat(String.valueOf(Integer.toHexString(iEglGetError))), zzgwm.zzj(Integer.valueOf(iEglGetError)));
    }

    public static boolean zza(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzf(vHmGJpUTWNVV.pskVbfpBntk);
        }
        return false;
    }
}
