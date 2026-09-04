package com.bykv.vk.openvk.preload.geckox.logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class GeckoLogger {
    private static boolean DEBUG = false;
    private static Logger sLogger = new DefaultLogger();

    public static void d(String str, Object... objArr) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.d(str, objArr);
    }

    public static void disable() {
        DEBUG = false;
    }

    public static void e(String str, String str2, Throwable th2) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.e(str, str2, th2);
    }

    public static void enable() {
        DEBUG = true;
    }

    public static boolean isDebug() {
        return DEBUG;
    }

    public static void redirect(Logger logger) {
        sLogger = logger;
    }

    public static void w(String str, String str2, Throwable th2) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.w(str, str2, th2);
    }

    public static void w(String str, String str2) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.w(str, str2);
    }
}
