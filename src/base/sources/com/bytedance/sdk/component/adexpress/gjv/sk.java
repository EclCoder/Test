package com.bytedance.sdk.component.adexpress.gjv;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    public static boolean hnj(String str) {
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
