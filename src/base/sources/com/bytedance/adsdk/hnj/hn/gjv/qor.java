package com.bytedance.adsdk.hnj.hn.gjv;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public enum qor implements sk {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);


    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private final String f12153oj;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private final int f12154xn;
    private static final Map<String, qor> jip = new HashMap(128);
    private static final Set<qor> uua = new HashSet();

    static {
        for (qor qorVar : values()) {
            jip.put(qorVar.hnj(), qorVar);
            uua.add(qorVar);
        }
    }

    qor(String str, int i10) {
        this.f12153oj = str;
        this.f12154xn = i10;
    }

    public static qor hnj(String str) {
        return jip.get(str);
    }

    public int hn() {
        return this.f12154xn;
    }

    public static boolean hnj(sk skVar) {
        return skVar instanceof qor;
    }

    public String hnj() {
        return this.f12153oj;
    }
}
