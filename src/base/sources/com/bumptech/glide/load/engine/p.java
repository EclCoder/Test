package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11445a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f11446b = new HashMap();

    p() {
    }

    private Map b(boolean z10) {
        return z10 ? this.f11446b : this.f11445a;
    }

    k a(r5.e eVar, boolean z10) {
        return (k) b(z10).get(eVar);
    }

    void c(r5.e eVar, k kVar) {
        b(kVar.p()).put(eVar, kVar);
    }

    void d(r5.e eVar, k kVar) {
        Map mapB = b(kVar.p());
        if (kVar.equals(mapB.get(eVar))) {
            mapB.remove(eVar);
        }
    }
}
