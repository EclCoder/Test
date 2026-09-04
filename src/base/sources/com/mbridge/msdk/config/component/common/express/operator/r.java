package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f28630a;

    public r(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f28630a = cVar;
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        return (TextUtils.isEmpty(str) || !str.contains(com.mbridge.msdk.config.component.common.util.c.c("875"))) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(String.valueOf(System.currentTimeMillis()));
    }
}
