package com.bytedance.adsdk.hnj.hn.gjv;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public enum gjv implements sk {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");

    private static final Map<String, gjv> dkl;
    private final String dse;

    static {
        HashMap map = new HashMap(128);
        dkl = map;
        for (gjv gjvVar : map.values()) {
            dkl.put(gjvVar.hnj(), gjvVar);
        }
    }

    gjv(String str) {
        this.dse = str;
    }

    public static boolean hnj(sk skVar) {
        return skVar instanceof gjv;
    }

    public String hnj() {
        return this.dse;
    }
}
