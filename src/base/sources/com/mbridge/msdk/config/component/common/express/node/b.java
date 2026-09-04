package com.mbridge.msdk.config.component.common.express.node;

import be.l;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<String> f28579d = l.a(new Object[]{"=", "+=", "-=", "*=", "/=", "%="});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f28580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f28581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f28582c;

    public b(String str, d dVar, d dVar2) {
        this.f28580a = str;
        this.f28581b = dVar;
        this.f28582c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f28581b.a(dVar, com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT, aVar);
        Object objA2 = this.f28582c.a(dVar, eVar, aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(objA2);
        return dVar.a(objA, arrayList, this.f28580a, aVar);
    }
}
