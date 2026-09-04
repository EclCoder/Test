package com.bytedance.sdk.openadsdk.gjv;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.apu;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {
    private static Method gjv = null;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static Class<?> f14345hn = null;
    private static Method hnj = null;
    private static Method qor = null;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private static boolean f14346sk = false;

    static {
        hn();
    }

    private static void hn() {
        int i10;
        if (f14346sk || (i10 = Build.VERSION.SDK_INT) < 35) {
            return;
        }
        try {
            if (qor()) {
                hnj = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                f14345hn = cls;
                gjv = cls.getMethod("getReason", null);
                if (i10 >= 36) {
                    qor = f14345hn.getMethod("getStartComponent", null);
                }
                f14346sk = true;
            }
        } catch (Throwable th2) {
            apu.qor(th2.getMessage(), new Object[0]);
        }
    }

    public static JSONObject hnj() {
        Method method;
        List list;
        Method method2;
        Method method3;
        int i10 = Build.VERSION.SDK_INT;
        JSONObject jSONObject = null;
        if (i10 >= 35 && qor()) {
            hn();
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.oj.hnj().getSystemService(ActivityManager.class);
                    if (activityManager != null && (method = hnj) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                        Object obj = list.get(0);
                        if (i10 >= 36 && obj != null && (method3 = qor) != null) {
                            jSONObject2.put("start_component", ((Integer) method3.invoke(obj, null)).intValue());
                        }
                        if (obj != null && (method2 = gjv) != null) {
                            jSONObject2.put("start_reason", ((Integer) method2.invoke(obj, null)).intValue());
                        }
                    }
                    return jSONObject2;
                } catch (Throwable th2) {
                    th = th2;
                    jSONObject = jSONObject2;
                    apu.qor(th.getMessage(), new Object[0]);
                    return jSONObject;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return jSONObject;
    }

    private static boolean qor() {
        return com.bytedance.sdk.openadsdk.as.sk.hnj("s_i_e", 0) == 1;
    }
}
