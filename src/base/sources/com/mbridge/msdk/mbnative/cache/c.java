package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<Integer, b<String, List<Campaign>>> f31395a = new HashMap();

    public static b<String, List<Campaign>> a(int i10) {
        if (f31395a.containsKey(Integer.valueOf(i10))) {
            return f31395a.get(Integer.valueOf(i10));
        }
        a aVar = new a(i10);
        f31395a.put(Integer.valueOf(i10), aVar);
        return aVar;
    }
}
