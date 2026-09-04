package com.mbridge.msdk.dycreator.viewobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends com.mbridge.msdk.dycreator.observable.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f30063a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ConcurrentHashMap<Integer, Object> f30064b = new ConcurrentHashMap<>();

    public synchronized void a(Object obj, int i10) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f30064b;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f30064b.put(Integer.valueOf(i10), obj);
            }
        }
    }

    public synchronized void a() {
        this.f30064b.clear();
    }
}
