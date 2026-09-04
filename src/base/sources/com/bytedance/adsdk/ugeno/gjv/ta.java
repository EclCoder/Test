package com.bytedance.adsdk.ugeno.gjv;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ta {
    private static Map<String, dse> hnj = new HashMap();

    public static void hnj(List<dse> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (dse dseVar : list) {
            if (dseVar != null) {
                hnj.put(dseVar.hnj(), dseVar);
            }
        }
    }

    public static dse hnj(String str) {
        return hnj.get(str);
    }
}
