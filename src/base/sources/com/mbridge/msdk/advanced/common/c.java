package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f28120a = new HashMap();

    public static void a(String str, boolean z10) {
        f28120a.put(str, Boolean.valueOf(z10));
    }

    public static void b(String str) {
        f28120a.remove(str);
    }

    public static boolean a(String str) {
        if (f28120a.containsKey(str)) {
            return f28120a.get(str).booleanValue();
        }
        return false;
    }
}
