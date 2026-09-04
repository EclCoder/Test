package com.googlecode.mp4parser.util;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Logger {
    public static Logger getLogger(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new AndroidLogger(cls.getSimpleName()) : new JuliLogger(cls.getSimpleName());
    }

    public abstract void logDebug(String str);

    public abstract void logError(String str);

    public abstract void logWarn(String str);
}
