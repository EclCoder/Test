package com.bytedance.sdk.openadsdk.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sq {
    private static volatile sq hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Map<String, Map<String, String>> f14203hn = new ConcurrentHashMap();

    private sq() {
    }

    public static sq hnj() {
        if (hnj == null) {
            synchronized (sq.class) {
                try {
                    if (hnj == null) {
                        hnj = new sq();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public boolean hn(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f14203hn;
        if (map2 == null || !map2.containsKey(str) || (map = this.f14203hn.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    public boolean qor(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f14203hn;
        if (map2 == null || !map2.containsKey(str) || (map = this.f14203hn.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    public void hnj(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.f14203hn;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.f14203hn.put(str, concurrentHashMap);
    }

    public String hnj(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f14203hn;
        if (map2 == null || !map2.containsKey(str) || (map = this.f14203hn.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public void hnj(String str) {
        Map<String, Map<String, String>> map = this.f14203hn;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.f14203hn.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.f14203hn.remove(str);
        }
    }
}
