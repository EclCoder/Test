package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug {
    private static Context hnj;

    private static Configuration hn(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }

    public static void hnj(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            hnj = context.createConfigurationContext(hn(context, str, str2));
        } catch (Throwable th2) {
            th2.getMessage();
        }
        wu.hnj(hnj);
    }
}
