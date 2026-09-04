package com.bykv.vk.openvk.preload.geckox.statistic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Long, a> f11855a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, com.bykv.vk.openvk.preload.geckox.statistic.model.a> f11856b = new HashMap();

    a() {
    }

    static a a(long j10) {
        a aVar;
        Map<Long, a> map = f11855a;
        synchronized (map) {
            try {
                aVar = map.get(Long.valueOf(j10));
                if (aVar == null) {
                    aVar = new a();
                    map.put(Long.valueOf(j10), aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    final com.bykv.vk.openvk.preload.geckox.statistic.model.a a(String str) {
        com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar;
        synchronized (this.f11856b) {
            try {
                aVar = this.f11856b.get(str);
                if (aVar == null) {
                    aVar = new com.bykv.vk.openvk.preload.geckox.statistic.model.a();
                    this.f11856b.put(str, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    final List<com.bykv.vk.openvk.preload.geckox.statistic.model.a> a() {
        ArrayList arrayList;
        synchronized (this.f11856b) {
            arrayList = new ArrayList(this.f11856b.values());
        }
        return arrayList;
    }
}
