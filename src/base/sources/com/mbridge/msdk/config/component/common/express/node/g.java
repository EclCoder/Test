package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f28591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f28592b;

    public g(d dVar, d dVar2) {
        this.f28591a = dVar;
        this.f28592b = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f28591a.a(dVar, eVar, aVar);
        Object objA2 = this.f28592b.a(dVar, eVar, aVar);
        HashMap map = new HashMap();
        map.put(objA, objA2);
        return map;
    }
}
