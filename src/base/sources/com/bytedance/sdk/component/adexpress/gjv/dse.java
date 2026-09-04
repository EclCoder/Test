package com.bytedance.sdk.component.adexpress.gjv;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.wu;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {
    private static float gjv(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int hn(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().hn();
        }
        float fGjv = gjv(context);
        if (fGjv <= 0.0f) {
            fGjv = 1.0f;
        }
        return (int) ((f10 / fGjv) + 0.5f);
    }

    public static int hnj(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static float qor(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().hn();
        }
        return f10 * gjv(context);
    }

    public static float hnj(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().hn();
        }
        return (f10 * gjv(context)) + 0.5f;
    }

    public static int hn(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().hn();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static String qor(Context context) {
        String language;
        try {
            Locale locale = wu.hn(context).getConfiguration().getLocales().get(0);
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            language = "";
        }
        return hnj(language);
    }

    public static int hnj(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().hn();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String hnj(String str) {
        str.getClass();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
