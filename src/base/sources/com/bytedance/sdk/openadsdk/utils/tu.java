package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class tu {
    public static String hnj(Context context) {
        int iHnj = com.bytedance.sdk.component.utils.tgn.hnj(context, 0L);
        if (iHnj == 2) {
            return "2g";
        }
        if (iHnj == 3) {
            return "3g";
        }
        if (iHnj == 4) {
            return "wifi";
        }
        if (iHnj != 5) {
            return iHnj != 6 ? "mobile" : "5g";
        }
        return "4g";
    }
}
