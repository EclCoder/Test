package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f28586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f28587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<d> f28588c;

    public e(d dVar, String str, List<d> list) {
        this.f28586a = dVar;
        this.f28587b = str;
        this.f28588c = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.f28588c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList(com.mbridge.msdk.config.component.common.util.c.c("876"), com.mbridge.msdk.config.component.common.util.c.c("877"), com.mbridge.msdk.config.component.common.util.c.c("878")).contains(this.f28587b)) {
            arrayList.add(new com.mbridge.msdk.config.component.common.express.operator.parts.b(dVar, eVar, this.f28588c.get(0), aVar));
            for (int i10 = 1; i10 < this.f28588c.size(); i10++) {
                arrayList.add(this.f28588c.get(i10).a(dVar, eVar, aVar));
            }
        } else {
            Iterator<d> it = this.f28588c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(dVar, eVar, aVar));
            }
        }
        return dVar.a(this.f28586a.a(dVar, eVar, aVar), arrayList, this.f28587b, aVar);
    }
}
