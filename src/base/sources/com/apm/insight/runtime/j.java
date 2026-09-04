package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MonitorCrash f10988a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10989b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10990c;

    public static MonitorCrash a() {
        if (f10988a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f10988a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f10988a;
    }

    public static void a(Throwable th2, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f10989b == -1) {
            f10989b = 5;
        }
        int i10 = f10990c;
        if (i10 < f10989b) {
            f10990c = i10 + 1;
            a().reportCustomErr(str, "INNER", th2);
        }
    }
}
