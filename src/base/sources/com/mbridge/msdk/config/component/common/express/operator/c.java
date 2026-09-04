package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f28599a;

    public c(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f28599a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String strA;
        Object objB;
        Object objA = a(list);
        if (obj instanceof com.mbridge.msdk.config.component.common.express.entities.a) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar = (com.mbridge.msdk.config.component.common.express.entities.a) obj;
            strA = aVar.a();
            objB = aVar.b();
        } else {
            strA = "";
            objB = null;
        }
        if (TextUtils.isEmpty(strA) || !(objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        Object objB2 = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB).b((Object) strA);
        if (objB2 == null || TextUtils.isEmpty(strA)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB2).a(strA, objA);
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objA);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        String strTrim = str.trim();
        return strTrim.equals("=") ? b(strTrim, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
