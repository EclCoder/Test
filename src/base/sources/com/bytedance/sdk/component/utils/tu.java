package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class tu {
    private static volatile String hnj;

    public static String hnj() {
        if (!TextUtils.isEmpty(hnj)) {
            return hnj;
        }
        String str = Build.MODEL;
        hnj = str;
        return str;
    }

    public static int hnj(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception unused) {
            return 0;
        }
    }
}
