package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class nyv {
    public static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, Double d10) {
        if (asVar == null || asVar.jd() == null) {
            return;
        }
        Map<String, Object> mapJd = asVar.jd();
        try {
            Object obj = asVar.jd().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapJd.get("nurl");
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d10 != null) {
                    strReplace = strReplace.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d10));
                }
                com.bytedance.sdk.openadsdk.core.oj.qor().hnj(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.apu.qor("report Win error", new Object[0]);
        }
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.model.as asVar, Double d10, String str, String str2) {
        if (asVar == null || asVar.jd() == null) {
            return;
        }
        Map<String, Object> mapJd = asVar.jd();
        try {
            Object obj = asVar.jd().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapJd.get("lurl");
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d10 != null) {
                    strReplace = strReplace.replace("${AUCTION_PRICE}", String.valueOf(d10));
                }
                if (str != null) {
                    strReplace = strReplace.replace("${AUCTION_LOSS}", str);
                }
                if (str2 != null) {
                    strReplace = strReplace.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.oj.qor().hnj(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.apu.qor("report Loss error", new Object[0]);
        }
    }
}
