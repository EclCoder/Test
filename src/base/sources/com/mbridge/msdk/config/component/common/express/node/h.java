package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<d> f28593a;

    public h(List<d> list) {
        this.f28593a = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        HashMap map = new HashMap();
        Iterator<d> it = this.f28593a.iterator();
        while (it.hasNext()) {
            Object objA = it.next().a(dVar, eVar, aVar);
            map.putAll(objA instanceof Map ? (HashMap) objA : new HashMap());
        }
        return map;
    }
}
