package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f28583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f28584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f28585c;

    public c(String str, d dVar, d dVar2) {
        this.f28583a = str;
        this.f28584b = dVar;
        this.f28585c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f28584b.a(dVar, eVar, aVar);
        Object objA2 = this.f28585c.a(dVar, eVar, aVar);
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            List<Object> arrayList = new ArrayList<>();
            arrayList.add(objA2);
            return dVar.a(objA, arrayList, this.f28583a, aVar);
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        if (!(objA instanceof com.mbridge.msdk.config.component.common.express.entities.a)) {
            return null;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar3 = (com.mbridge.msdk.config.component.common.express.entities.a) objA;
        String strA = aVar3.a();
        List<Object> arrayList2 = new ArrayList<>();
        arrayList2.add(objA2);
        Object objA3 = dVar.a(aVar3, arrayList2, this.f28583a, aVar);
        aVar2.a(strA);
        aVar2.a(objA3);
        return aVar2;
    }
}
