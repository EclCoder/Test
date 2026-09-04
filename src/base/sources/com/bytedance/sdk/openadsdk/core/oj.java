package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static volatile as<com.bytedance.sdk.openadsdk.gjv.hnj> f14020hn = null;
    private static volatile Context hnj = null;
    private static int qor = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj {
        private static volatile Application hnj;

        static {
            try {
                Object objHn = hn();
                hnj = (Application) objHn.getClass().getMethod("getApplication", null).invoke(objHn, null);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.hnj("MyApplication", "application get failed", th2);
            }
        }

        private static Object hn() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.apu.hnj("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th2);
                return null;
            }
        }

        public static Application hnj() {
            return hnj;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.settings.dnm gjv() {
        return com.bytedance.sdk.openadsdk.core.settings.dnm.hn();
    }

    public static void hn(Context context) {
        if (hnj == null) {
            synchronized (oj.class) {
                try {
                    if (hnj == null) {
                        if (context != null) {
                            hnj = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                hnj = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationHnj = hnj.hnj();
                            if (applicationHnj != null) {
                                hnj = applicationHnj;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static Context hnj() {
        if (hnj == null) {
            hn(null);
        }
        return hnj;
    }

    public static as<com.bytedance.sdk.openadsdk.gjv.hnj> qor() {
        if (f14020hn == null) {
            synchronized (oj.class) {
                try {
                    if (f14020hn == null) {
                        f14020hn = new Cdo(hnj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f14020hn;
    }

    public static com.bytedance.sdk.openadsdk.jip.hn.qor sk() {
        return !com.bytedance.sdk.openadsdk.core.settings.dse.hnj() ? com.bytedance.sdk.openadsdk.jip.hn.gjv.hnj() : com.bytedance.sdk.openadsdk.gjv.hnj.hn.hnj();
    }

    public static Context hnj(Context context) {
        if (context == null) {
            context = hnj();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int hn() {
        Context contextHnj;
        if (qor < 0 && (contextHnj = hnj()) != null) {
            qor = ViewConfiguration.get(contextHnj).getScaledTouchSlop();
        }
        return qor;
    }
}
