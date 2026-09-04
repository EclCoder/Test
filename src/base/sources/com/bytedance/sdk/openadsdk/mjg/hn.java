package com.bytedance.sdk.openadsdk.mjg;

import android.app.Activity;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static void hnj(Activity activity) {
        if (activity == null || Build.VERSION.SDK_INT == 26) {
            return;
        }
        try {
            if (activity.getRequestedOrientation() == 1) {
                return;
            }
            activity.setRequestedOrientation(1);
        } catch (Throwable unused) {
        }
    }
}
