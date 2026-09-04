package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Locale;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.do, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Cdo {
    public static boolean hnj() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            return i10 >= 32 && hnj(RequestConfiguration.MAX_AD_CONTENT_RATING_T, Build.VERSION.CODENAME);
        }
        return true;
    }

    public static boolean hnj(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }
}
