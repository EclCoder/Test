package com.arthenica.ffmpegkit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class AbiDetect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f11033a = false;

    static {
        k.g();
    }

    public static String a() {
        return f11033a ? "arm-v7a-neon" : getNativeAbi();
    }

    static void b() {
        f11033a = true;
    }

    static native String getNativeAbi();

    static native String getNativeBuildConf();

    static native String getNativeCpuAbi();

    static native boolean isNativeLTSBuild();
}
