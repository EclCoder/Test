package com.mbridge.msdk.config.component.base;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<?, ?> f28518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f28519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.mbridge.msdk.config.dynamic.binddata.wrapper.a f28521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f28522e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f28523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f28524g;

    private void d(Map<?, ?> map) {
        Map map2;
        Map map3;
        Map map4;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f28518a == null) {
            this.f28518a = map;
            return;
        }
        try {
            HashMap map5 = new HashMap();
            map5.putAll(map);
            HashMap map6 = new HashMap();
            Map map7 = (Map) map.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
            if ((map7 instanceof Map) && (map4 = (Map) map7.get(com.mbridge.msdk.config.component.common.util.c.c("13"))) != null) {
                map6.putAll(map4);
            }
            if ((map.get(com.mbridge.msdk.config.component.common.util.c.c("13")) instanceof Map) && (map3 = (Map) map.get(com.mbridge.msdk.config.component.common.util.c.c("13"))) != null) {
                map6.putAll(map3);
            }
            HashMap map8 = new HashMap();
            Map map9 = (Map) this.f28518a.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
            if ((map9 instanceof Map) && (map2 = (Map) map9.get(com.mbridge.msdk.config.component.common.util.c.c("13"))) != null) {
                map8.putAll(map2);
            }
            com.mbridge.msdk.config.component.common.util.c.a(map8, map6);
            Object obj = map5.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
            if (obj instanceof Map) {
                Map map10 = (Map) obj;
                if (!map10.isEmpty()) {
                    map10.put(com.mbridge.msdk.config.component.common.util.c.c("13"), map8);
                }
            } else {
                HashMap map11 = new HashMap();
                map11.put(com.mbridge.msdk.config.component.common.util.c.c("13"), map8);
                map5.put(com.mbridge.msdk.config.component.common.util.c.c("16"), map11);
            }
            this.f28518a = map5;
        } catch (Throwable th2) {
            q0.b("BaseComponent", th2.getMessage(), th2);
        }
    }

    public void a() {
    }

    protected void b(Map<String, Object> map) {
    }

    protected void c(Map<String, Object> map) {
    }

    public ViewGroup e() {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f28521d;
        if (aVar == null) {
            return null;
        }
        Object objB = aVar.b((Object) com.mbridge.msdk.config.component.common.util.c.c("sdk_context"));
        if (!(objB instanceof Map)) {
            return null;
        }
        Object obj = ((Map) objB).get(com.mbridge.msdk.config.component.common.util.c.c("rootView"));
        if (obj instanceof ViewGroup) {
            return (ViewGroup) obj;
        }
        return null;
    }

    protected void f() {
        a(a(this.f28523f, (Map<String, Object>) new HashMap()));
    }

    private Map<String, Object> b(String str) {
        Map<?, ?> map = this.f28518a;
        if (map != null && !map.isEmpty()) {
            Object obj = this.f28518a.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.c("13"));
                if (obj2 instanceof Map) {
                    Object obj3 = ((Map) obj2).get(str);
                    if (obj3 instanceof Map) {
                        Map<String, Object> map2 = (Map) obj3;
                        if (!map2.isEmpty()) {
                            Map<String, Object> mapA = com.mbridge.msdk.config.component.common.util.c.a(map2, this.f28521d);
                            return !mapA.isEmpty() ? mapA : map2;
                        }
                    }
                }
            }
        }
        return null;
    }

    private void c() {
        Map<?, ?> map = this.f28518a;
        if (map == null) {
            q0.b("BaseComponent", "Execute config is null");
            return;
        }
        this.f28520c = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c("15")));
        Object obj = this.f28518a.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
        if (!(obj instanceof Map)) {
            q0.b("BaseComponent", "Component config is not instance of Map");
            return;
        }
        Map<String, Object> map2 = (Map) obj;
        b(map2);
        if (map2.containsKey(com.mbridge.msdk.config.component.common.util.c.c("13"))) {
            Object obj2 = map2.get(com.mbridge.msdk.config.component.common.util.c.c("13"));
            if (obj2 instanceof Map) {
                c((Map) obj2);
            } else {
                q0.b("BaseComponent", "Component event is not instance of Map");
            }
        }
    }

    public void a(Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str) {
        if (map == null) {
            return;
        }
        this.f28524g = str;
        this.f28521d = aVar;
        d(map);
        b();
        c();
        a();
    }

    protected void a(String str, HashMap<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(a(str, (Map<String, Object>) map));
    }

    public void a(c cVar) {
        this.f28519b = cVar;
    }

    public void a(b bVar) {
        c cVar;
        if (bVar == null) {
            q0.b("BaseComponent", "baseComponentOut cannot be null");
            return;
        }
        bVar.a(this.f28520c);
        bVar.c(this.f28524g);
        String strC = bVar.c();
        if (strC != null && !strC.isEmpty()) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            if (bVar.b() != null) {
                map.putAll(bVar.b());
                map2.put("event_gen_data", new HashMap(bVar.b()));
            }
            Map<String, Object> mapB = b(strC);
            if (mapB != null && !mapB.isEmpty()) {
                map.putAll(mapB);
                map2.put("event_replace_data", mapB);
            }
            bVar.b().clear();
            map.put(com.mbridge.msdk.config.component.common.util.c.c("event_name"), strC);
            bVar.b().put(com.mbridge.msdk.config.component.common.util.c.c("50"), map);
            boolean zA = a(mapB, com.mbridge.msdk.config.component.common.util.c.c("17"));
            boolean zA2 = a(mapB, com.mbridge.msdk.config.component.common.util.c.c("19"));
            Map<?, ?> map3 = this.f28518a;
            if (map3 != null && !map3.isEmpty()) {
                bVar.b().put(com.mbridge.msdk.config.component.common.util.c.c("52"), this.f28518a.get(com.mbridge.msdk.config.component.common.util.c.c("16")));
            }
            if (this.f28521d != null) {
                bVar.b().put(com.mbridge.msdk.config.component.common.util.c.c("51"), this.f28521d.b((Object) com.mbridge.msdk.config.component.common.util.c.c("51")));
                bVar.b().put(com.mbridge.msdk.config.component.common.util.c.c("sdk_context"), this.f28521d.b((Object) com.mbridge.msdk.config.component.common.util.c.c("sdk_context")));
            }
            if (zA2) {
                a(bVar, map2);
            }
            if (!zA || (cVar = this.f28519b) == null) {
                return;
            }
            cVar.a(bVar);
            return;
        }
        q0.b("BaseComponent", "eventName cannot be null or empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void b() {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar;
        if (!(this instanceof com.mbridge.msdk.config.component.vc.inter.a) || (aVar = this.f28521d) == null) {
            return;
        }
        try {
            Object objB = aVar.b((Object) com.mbridge.msdk.config.component.common.util.c.c("sdk_context"));
            if (objB instanceof Map) {
                Map map = (Map) objB;
                if (map.containsKey("lifecycleListeners")) {
                    List list = (List) map.get("lifecycleListeners");
                    if (list == null || list.contains(this)) {
                        return;
                    }
                    list.add((com.mbridge.msdk.config.component.vc.inter.a) this);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add((com.mbridge.msdk.config.component.vc.inter.a) this);
                map.put("lifecycleListeners", arrayList);
            }
        } catch (Throwable th2) {
            q0.b("BaseComponent", "Error in addLifecycleListener", th2);
        }
    }

    public void d() {
        f();
    }

    private boolean a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || TextUtils.isEmpty(str) || !map.containsKey(str) || (obj = map.get(str)) == null) {
            return false;
        }
        return String.valueOf(obj).equals("1");
    }

    public b a(String str, Map<String, Object> map) {
        b bVar = new b();
        bVar.b(str);
        if (map == null) {
            map = new HashMap<>();
        }
        bVar.a(map);
        return bVar;
    }

    private void a(b bVar, Map<String, Object> map) {
        try {
            Map<String, Object> mapA = com.mbridge.msdk.config.component.common.metrics.b.a(bVar, map, this.f28521d);
            if (mapA.isEmpty()) {
                return;
            }
            com.mbridge.msdk.config.component.common.metrics.a.a().a(mapA);
        } catch (Throwable th2) {
            q0.b("BaseComponent", th2.getMessage());
        }
    }

    public void a(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.c("code"), str2);
        map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), str3);
        a(a(str, (Map<String, Object>) map));
    }
}
