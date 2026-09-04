package com.bytedance.adsdk.ugeno.dse;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class gjv {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static Resources f12237hn;
    private static String hnj;
    private static Context qor;

    public static int hn(Context context, String str) {
        return hnj(context, str, "drawable");
    }

    public static void hnj(String str) {
        hnj = str;
    }

    private static String hnj(Context context) {
        if (hnj == null) {
            hnj = context.getPackageName();
        }
        return hnj;
    }

    private static int hnj(Context context, String str, String str2) {
        if (f12237hn == null) {
            f12237hn = context.getResources();
        }
        return f12237hn.getIdentifier(str, str2, hnj(context));
    }

    public static int hnj(Context context, String str) {
        return hnj(context, str, "raw");
    }
}
