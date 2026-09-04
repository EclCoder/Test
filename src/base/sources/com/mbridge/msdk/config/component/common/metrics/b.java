package com.mbridge.msdk.config.component.common.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static Map<String, Object> a(com.mbridge.msdk.config.component.base.b bVar, Map<String, Object> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Map<String, Object> mapA;
        Map<String, Object> mapA2;
        Map<String, Object> mapA3;
        Map<String, Object> mapA4;
        Object obj;
        HashMap map2 = new HashMap();
        try {
            boolean zA = a(bVar.b(), com.mbridge.msdk.config.component.common.util.c.c("20"));
            boolean zA2 = a(bVar.b(), com.mbridge.msdk.config.component.common.util.c.c("21"));
            boolean zA3 = a(bVar.b(), com.mbridge.msdk.config.component.common.util.c.c("22"));
            boolean zA4 = a(bVar.b(), com.mbridge.msdk.config.component.common.util.c.c("23"));
            map2.put(com.mbridge.msdk.config.component.common.util.c.c("key"), bVar.c());
            if (zA && (mapA4 = a(aVar.b((Object) com.mbridge.msdk.config.component.common.util.c.c("50")))) != null && (obj = mapA4.get(com.mbridge.msdk.config.component.common.util.c.c("event_name"))) != null) {
                map2.put(com.mbridge.msdk.config.component.common.util.c.c("e_s_name"), String.valueOf(obj));
            }
            HashMap map3 = null;
            Map<String, Object> mapA5 = map != null ? a(map.get("event_gen_data")) : null;
            Map<String, Object> mapA6 = map != null ? a(map.get("event_replace_data")) : null;
            if (mapA6 != null && mapA6.containsKey(com.mbridge.msdk.config.component.common.util.c.c("24")) && (mapA3 = a(mapA6.get(com.mbridge.msdk.config.component.common.util.c.c("24")))) != null && !mapA3.isEmpty()) {
                map3 = new HashMap(mapA3);
                mapA6.remove(com.mbridge.msdk.config.component.common.util.c.c("24"));
            }
            if (zA2 && mapA5 != null) {
                map2.put(com.mbridge.msdk.config.component.common.util.c.c("e_output"), mapA5);
            }
            if (zA3) {
                map2.put(com.mbridge.msdk.config.component.common.util.c.c("execute_c_config"), a(a(bVar.b().get(com.mbridge.msdk.config.component.common.util.c.c("52")))));
                if (mapA6 != null && !mapA6.isEmpty()) {
                    mapA6.remove(com.mbridge.msdk.config.component.common.util.c.c("pre_action"));
                    map2.put(com.mbridge.msdk.config.component.common.util.c.c("execute_e_config"), mapA6);
                }
            }
            if (zA4 && (mapA = a(bVar.b().get(com.mbridge.msdk.config.component.common.util.c.c("51")))) != null && (mapA2 = a(mapA.get(com.mbridge.msdk.config.component.common.util.c.c("metrics")))) != null && !mapA2.isEmpty()) {
                map2.putAll(mapA2);
            }
            if (map3 != null && !map3.isEmpty()) {
                map2.putAll(com.mbridge.msdk.config.component.common.util.c.a((Map<String, Object>) map3));
            }
            return map2;
        } catch (Throwable th2) {
            q0.b("MetricsUtil", th2.getMessage());
            return map2;
        }
    }

    private static boolean a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || TextUtils.isEmpty(str) || !map.containsKey(str) || (obj = map.get(str)) == null) {
            return true;
        }
        return String.valueOf(obj).equals("1");
    }

    private static Map<String, Object> a(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b();
        }
        return null;
    }

    private static Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getKey().equals(com.mbridge.msdk.config.component.common.util.c.c("25")) && !entry.getKey().equals(com.mbridge.msdk.config.component.common.util.c.c("13"))) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    public static void a(String str, Map<String, Object> map) {
        try {
            e eVar = new e();
            eVar.a(map);
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.a(str, eVar);
            d.b().a(str, cVar);
        } catch (Throwable th2) {
            q0.b("MetricsUtil", th2.getMessage());
        }
    }
}
