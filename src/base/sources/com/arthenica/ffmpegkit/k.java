package com.arthenica.ffmpegkit;

import android.os.Build;
import android.util.Log;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String[] f11100a = {"avutil", "swscale", "swresample", dOIDCKnIR.YHpe, "avformat", "avfilter", "avdevice"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String[] f11101b = {"chromaprint", "openh264", "rubberband", "snappy", "srt", "tesseract", "x265", NpmRNZ.eoetCcvyHWRePpB, "libilbc"};

    static String a() {
        return "brand: " + Build.BRAND + ", model: " + Build.MODEL + ", device: " + Build.DEVICE + ", api level: " + Build.VERSION.SDK_INT + ", abis: " + FFmpegKitConfig.c(Build.SUPPORTED_ABIS) + ", 32bit abis: " + FFmpegKitConfig.c(Build.SUPPORTED_32_BIT_ABIS) + ", 64bit abis: " + FFmpegKitConfig.c(Build.SUPPORTED_64_BIT_ABIS);
    }

    static boolean b() {
        return System.getProperty("enable.ffmpeg.kit.test.mode") == null;
    }

    static String c() {
        return b() ? AbiDetect.a() : a.ABI_X86_64.g();
    }

    static String d() {
        return b() ? FFmpegKitConfig.g() : new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
    }

    static boolean e() {
        return false;
    }

    static void f(boolean z10) {
        boolean z11 = false;
        if (!z10 && "arm-v7a".equals(k())) {
            try {
                i("ffmpegkit_armv7a_neon");
                z11 = true;
                AbiDetect.b();
            } catch (Error e10) {
                Log.i("ffmpeg-kit", String.format("NEON supported armeabi-v7a ffmpegkit library not found. Loading default armeabi-v7a library.%s", o5.a.a(e10)));
            }
        }
        if (z11) {
            return;
        }
        i("ffmpegkit");
    }

    static void g() {
        i("ffmpegkit_abidetect");
    }

    static boolean h() {
        if (b()) {
            return AbiDetect.isNativeLTSBuild();
        }
        return true;
    }

    private static void i(String str) {
        if (b()) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e10) {
                throw new Error(String.format("FFmpegKit failed to start on %s.", a()), e10);
            }
        }
    }

    static int j() {
        return b() ? FFmpegKitConfig.getNativeLogLevel() : g.AV_LOG_DEBUG.g();
    }

    private static String k() {
        return b() ? AbiDetect.getNativeAbi() : a.ABI_X86_64.g();
    }

    static String l() {
        return b() ? l.b() : "test";
    }

    static String m() {
        if (b()) {
            return FFmpegKitConfig.k();
        }
        return h() ? String.format("%s-lts", "6.0") : "6.0";
    }
}
