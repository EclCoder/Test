package com.mbridge.msdk.config.component.common.express.node;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f28595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f28596b;

    public j(d dVar, String str) {
        this.f28595a = dVar;
        this.f28596b = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (eVar == com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
            com.mbridge.msdk.config.component.common.express.entities.a aVar3 = (com.mbridge.msdk.config.component.common.express.entities.a) this.f28595a.a(dVar, eVar, aVar);
            aVar2.a(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) aVar3.b()).b((Object) aVar3.a()));
            aVar2.a(this.f28596b);
            return aVar2;
        }
        Object objA = this.f28595a.a(dVar, eVar, aVar);
        if (objA instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objA).b((Object) this.f28596b);
        }
        if (objA instanceof Map) {
            return ((Map) objA).get(this.f28596b);
        }
        return null;
    }
}
