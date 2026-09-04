package com.bytedance.sdk.openadsdk.p000do;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.orl;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.mbridge.msdk.MBridgeConstans;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private static int hnj(int i10) {
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                i11 = 4;
                if (i10 != 4) {
                    i11 = 5;
                    if (i10 != 5 && i10 != 15) {
                        return -1;
                    }
                }
            }
        }
        return i11;
    }

    public static List<String> hnj(List<String> list, boolean z10) {
        String strHnj = orl.hnj(oj.hnj());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strHnj)) {
                next = next.replace("{UID}", strHnj).replace("__UID__", strHnj);
            }
            if (z10) {
                next = hnj(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String hnj(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception e10) {
                apu.qor("TrackAdUrlUtils", e10.getMessage());
            }
        }
        return str;
    }

    public static List<String> hnj(List<String> list, boolean z10, as asVar) {
        String strHnj = orl.hnj(oj.hnj());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strHnj)) {
                next = next.replace("{UID}", strHnj).replace("__UID__", strHnj);
            }
            if (next.contains("__CID__") && asVar != null && !TextUtils.isEmpty(asVar.sp())) {
                next = next.replace("__CID__", asVar.sp());
            }
            if (next.contains("__CTYPE__") && asVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(hnj(asVar.qri())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.eum.hnj.hn.hnj.hnj().hn());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(orp.gjv()));
            }
            if (z10) {
                next = hnj(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
