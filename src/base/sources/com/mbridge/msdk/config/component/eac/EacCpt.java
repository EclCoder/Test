package com.mbridge.msdk.config.component.eac;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class EacCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.eac.model.a f28731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f28732i;

    private void a(Iterable<?> iterable, int i10) {
        int i11 = 0;
        for (Object obj : iterable) {
            Object objA = this.f28732i.a(this.f28731h.b(), this.f28521d);
            if (!(objA instanceof Integer) || ((Integer) objA).intValue() == 1) {
                Object objA2 = this.f28732i.a(this.f28731h.a(), this.f28521d);
                if ((objA2 instanceof Integer) && ((Integer) objA2).intValue() == 1) {
                    break;
                }
                HashMap map = new HashMap();
                map.put(c.c("count"), i10 + "");
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    map.put(c.c("key"), entry.getKey().toString());
                    map.put(c.c(AppMeasurementSdk.ConditionalUserProperty.VALUE), entry.getValue());
                } else {
                    map.put(c.c("key"), i11 + "");
                    map.put(c.c(AppMeasurementSdk.ConditionalUserProperty.VALUE), obj);
                }
                a(a("921002", (Map<String, Object>) map));
            }
            i11++;
        }
        HashMap map2 = new HashMap();
        map2.put(c.c("count"), Integer.valueOf(i10));
        a(a("921003", (Map<String, Object>) map2));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f28523f = "921001";
        this.f28731h = new com.mbridge.msdk.config.component.eac.model.a(map);
        this.f28732i = new d();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object objC = this.f28731h.c();
        if (objC == null) {
            Map<String, Object> map = new HashMap<>();
            map.put(c.c("code"), "");
            map.put(c.c("reason"), "iterationData is null");
            map.put(c.c("count"), 0);
            a(a("921003", map));
            return;
        }
        if (objC instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objC;
            a(aVar.a(), aVar.f());
            return;
        }
        if (objC instanceof Map) {
            Map map2 = (Map) objC;
            a(map2.entrySet(), map2.size());
        } else {
            if (objC instanceof List) {
                List list = (List) objC;
                a(list, list.size());
                return;
            }
            Map<String, Object> map3 = new HashMap<>();
            map3.put(c.c("code"), "");
            map3.put(c.c("reason"), "iterationData type not match");
            map3.put(c.c("count"), 0);
            a(a("921003", map3));
        }
    }
}
