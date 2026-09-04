package com.mbridge.msdk.config.component.trans;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class TransCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.trans.model.a f29152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f29153i;

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f28523f = "911001";
        if (this.f28518a.containsKey(c.c("50")) && (this.f28518a.get(c.c("50")) instanceof Map)) {
            this.f29153i = (Map) this.f28518a.get(c.c("50"));
        }
        this.f29152h = new com.mbridge.msdk.config.component.trans.model.a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object objA = new d().a(this.f29152h.a(), this.f28521d);
        HashMap map = new HashMap();
        if (objA != null) {
            map.put(c.c("500"), objA);
        }
        a(a("911002", (Map<String, Object>) map));
    }
}
