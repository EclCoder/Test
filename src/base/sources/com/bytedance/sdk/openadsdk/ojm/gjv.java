package com.bytedance.sdk.openadsdk.ojm;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.ul;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class gjv extends hnj {
    public static qor hnj;

    public static String hnj(com.bytedance.sdk.component.dse.hn.qor qorVar, String str) {
        qor qorVarHnj;
        Map map;
        if (!ul.qor() || (qorVarHnj = hn.hnj("net")) == null || (map = (Map) qorVarHnj.hnj(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get(mDXVAtwcaFMHJ.tBVG);
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                qorVar.hn(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
