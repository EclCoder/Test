package com.mbridge.msdk.config.component.mat;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MatCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<Map<String, Object>> f28974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    d f28975i;

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        super.b(map);
        this.f28523f = "920001";
        Object obj = map.get(c.c("118"));
        if (obj instanceof List) {
            this.f28974h = (ArrayList) obj;
        }
        this.f28975i = new d();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0062  */
    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        boolean zEquals;
        super.d();
        ArrayList<Map<String, Object>> arrayList = this.f28974h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<Map<String, Object>> arrayList2 = this.f28974h;
        int size = arrayList2.size();
        Object objA = null;
        int i10 = 0;
        while (i10 < size) {
            Map<String, Object> map = arrayList2.get(i10);
            i10++;
            Map<String, Object> map2 = map;
            String strValueOf = String.valueOf(map2.get(c.c("142")));
            String strValueOf2 = String.valueOf(map2.get(c.c("118")));
            String strValueOf3 = String.valueOf(map2.get(c.c("143")));
            Object objA2 = this.f28975i.a(strValueOf, this.f28521d);
            if (objA2 instanceof Integer) {
                zEquals = true;
                if (((Integer) objA2).intValue() != 1) {
                    zEquals = false;
                }
            } else if (objA2 instanceof String) {
                zEquals = String.valueOf(objA2).equals("1");
            } else {
                zEquals = false;
            }
            if (zEquals) {
                objA = this.f28975i.a(strValueOf2, this.f28521d);
                if (strValueOf3.equals("N")) {
                    break;
                }
            }
        }
        HashMap map3 = new HashMap();
        map3.put(c.c(DataSchemeDataSource.SCHEME_DATA), objA);
        a(a("920002", (Map<String, Object>) map3));
    }
}
