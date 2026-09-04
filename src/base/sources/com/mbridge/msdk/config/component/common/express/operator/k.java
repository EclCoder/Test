package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f28615a;

    public k(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f28615a = cVar;
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str) || !(str.contains(com.mbridge.msdk.config.component.common.util.c.c("882")) || str.contains(com.mbridge.msdk.config.component.common.util.c.c("883")))) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        boolean z10 = false;
        boolean zA = (list == null || list.isEmpty()) ? false : a(list.get(0));
        boolean zA2 = a(obj);
        if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("882"))) {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("883"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(zA2 || zA));
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (zA2 && zA) {
            z10 = true;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(z10));
    }

    private boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (!(obj instanceof String)) {
            return (obj instanceof Number) && ((Number) obj).intValue() == 1;
        }
        String str = (String) obj;
        return "1".equals(str) || "true".equalsIgnoreCase(str);
    }
}
