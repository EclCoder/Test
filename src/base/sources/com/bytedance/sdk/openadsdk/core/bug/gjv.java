package com.bytedance.sdk.openadsdk.core.bug;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.dnm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    public static String hnj(String str) {
        return TextUtils.isEmpty(str) ? str : hnj(dnm.hn().apu(), str);
    }

    public static String hnj(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith("http://") || str2.startsWith("https://")) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            return str + "/static/" + str2;
        }
        return str + "static/" + str2;
    }
}
