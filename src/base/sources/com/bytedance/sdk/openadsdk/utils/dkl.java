package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {
    public static String hnj(String str) {
        if (!com.bytedance.sdk.component.utils.fc.qor() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.ta taVar = new com.bytedance.sdk.openadsdk.core.model.ta(com.bytedance.sdk.openadsdk.core.ta.hn().bug());
        StringBuilder sb2 = new StringBuilder(str);
        Iterator<String> it = taVar.hn().iterator();
        while (it.hasNext()) {
            if (sb2.toString().contains(it.next())) {
                if (sb2.toString().contains("?")) {
                    sb2.append("&");
                    sb2.append(taVar.hnj());
                } else {
                    sb2.append("?");
                    sb2.append(taVar.hnj());
                }
            }
        }
        return sb2.toString();
    }
}
