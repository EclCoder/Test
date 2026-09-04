package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static String a(String str, t<?> tVar) {
        if (TextUtils.isEmpty(str) || tVar == null) {
            return "";
        }
        byte[] bArrB = tVar.b();
        if (bArrB == null || bArrB.length == 0) {
            return str;
        }
        if (str.endsWith("?")) {
            return str + new String(bArrB);
        }
        return str + "?" + new String(bArrB);
    }
}
