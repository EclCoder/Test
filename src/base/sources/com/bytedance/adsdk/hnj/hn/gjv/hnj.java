package com.bytedance.adsdk.hnj.hn.gjv;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public enum hnj implements sk {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, hnj> gjv = new HashMap(128);

    static {
        for (hnj hnjVar : values()) {
            gjv.put(hnjVar.name().toLowerCase(), hnjVar);
        }
    }

    public static hnj hnj(String str) {
        return gjv.get(str.toLowerCase());
    }
}
