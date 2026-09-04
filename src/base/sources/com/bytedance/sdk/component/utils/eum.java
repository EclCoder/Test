package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class eum {
    private static String hnj;

    public static String hn(Context context) {
        if (!TextUtils.isEmpty(hnj)) {
            return hnj;
        }
        String strHnj = hnj();
        hnj = strHnj;
        if (!TextUtils.isEmpty(strHnj)) {
            return hnj;
        }
        String strHn = hn();
        hnj = strHn;
        return !TextUtils.isEmpty(strHn) ? hnj : hnj;
    }

    public static boolean hnj(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), hn(context));
    }

    public static String qor(Context context) {
        String strHn = hn(context);
        return (TextUtils.isEmpty(strHn) || !strHn.contains(":")) ? strHn : strHn.replace(":", "_");
    }

    private static String hnj() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String hn() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
