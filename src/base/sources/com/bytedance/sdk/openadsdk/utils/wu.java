package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class wu {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public static int f14721hn = Integer.MIN_VALUE;
    public static int hnj = Integer.MIN_VALUE;
    public static final String[] qor = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    public static synchronized void hn() {
        if (f14721hn == 0) {
            return;
        }
        f14721hn = 0;
        com.bytedance.sdk.openadsdk.core.ta.hn(0);
    }

    public static String hnj() {
        if (hnj == Integer.MIN_VALUE) {
            hnj = com.bytedance.sdk.openadsdk.core.ta.sk();
        }
        if (hnj < 0) {
            hnj = 0;
        }
        String[] strArr = qor;
        try {
            return strArr[hnj % strArr.length];
        } catch (Throwable unused) {
            return strArr[0];
        }
    }

    public static synchronized void hnj(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                try {
                    String[] strArr = qor;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if (str.contains(strArr[i10])) {
                        int i11 = hnj + 1;
                        hnj = i11;
                        com.bytedance.sdk.openadsdk.core.ta.hnj(i11);
                        break;
                    }
                    i10++;
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (str.contains("/api/ad/union/sdk/settings/") || str.contains("/api/ad/union/sdk/strategies/adn")) {
            if (f14721hn == Integer.MIN_VALUE) {
                f14721hn = com.bytedance.sdk.openadsdk.core.ta.dkl();
            }
            int i12 = f14721hn + 1;
            f14721hn = i12;
            if (i12 >= 3) {
                final String strFf = com.bytedance.sdk.openadsdk.core.settings.dnm.hn().ff();
                final int i13 = f14721hn;
                com.bytedance.sdk.openadsdk.core.settings.dnm.hn().dlk();
                f14721hn = 0;
                com.bytedance.sdk.openadsdk.jip.gjv.hnj("clear_domain", false, new com.bytedance.sdk.openadsdk.jip.hn() { // from class: com.bytedance.sdk.openadsdk.utils.wu.1
                    @Override // com.bytedance.sdk.openadsdk.jip.hn
                    public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("domain", strFf);
                            jSONObject.put("times", i13);
                        } catch (Exception unused) {
                        }
                        return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("clear_domain").hn(jSONObject.toString());
                    }
                });
            }
            com.bytedance.sdk.openadsdk.core.ta.hn(f14721hn);
        }
    }

    public static void hnj(com.bytedance.sdk.component.ojm.dkl dklVar, String str) {
        HashMap map = new HashMap();
        map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
        dklVar.hnj(str, map);
    }
}
