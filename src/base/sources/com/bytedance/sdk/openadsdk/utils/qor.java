package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    public static int hnj = -1;

    public static int hnj(Context context, int i10, int i11) {
        int iRound;
        int iHnj = hnj(context, i11);
        if (iHnj == -1) {
            return hnj;
        }
        int iMin = Math.min(90, Math.round(iHnj * 0.15f));
        if (i10 > 655) {
            iRound = Math.round((i10 / 728.0f) * 90.0f);
        } else if (i10 > 632) {
            iRound = 81;
        } else if (i10 > 526) {
            iRound = Math.round((i10 / 468.0f) * 60.0f);
        } else {
            iRound = i10 > 432 ? 68 : Math.round((i10 / 320.0f) * 50.0f);
        }
        return Math.max(Math.min(iRound, iMin), 50);
    }

    public static int hnj(Context context, int i10) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context != null) {
            try {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && (configuration = resources.getConfiguration()) != null) {
                    int i11 = configuration.orientation;
                    if (i10 == 0) {
                        i10 = i11;
                    }
                    if (i10 == i11) {
                        return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                    }
                    return Math.round(displayMetrics.widthPixels / displayMetrics.density);
                }
            } catch (Throwable unused) {
                return hnj;
            }
        }
        return hnj;
    }
}
