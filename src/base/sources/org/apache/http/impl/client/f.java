package org.apache.http.impl.client;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class f implements fo.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f49283a = new ConcurrentHashMap();

    @Override // fo.g
    public void a(eo.f fVar, eo.j jVar) {
        ip.a.h(fVar, "Authentication scope");
        this.f49283a.put(fVar, jVar);
    }

    public String toString() {
        return this.f49283a.toString();
    }
}
