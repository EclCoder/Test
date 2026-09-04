package com.google.android.gms.common.util;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MapUtils {
    public static void writeStringMapToJson(StringBuilder sb2, HashMap<String, String> map) {
        sb2.append("{");
        boolean z10 = true;
        for (String str : map.keySet()) {
            if (!z10) {
                sb2.append(",");
            }
            String str2 = map.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z10 = false;
        }
        sb2.append("}");
    }
}
