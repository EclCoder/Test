package com.mbridge.msdk.config.component.style.model;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<a> f29142e;

    public b(Map<String, Object> map) {
        a(map);
    }

    private a b(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        a aVar = new a();
        Object obj = map.get(c.c("130"));
        if (obj != null) {
            aVar.a(String.valueOf(obj));
        }
        Object obj2 = map.get(c.c("123"));
        if (obj2 != null) {
            aVar.c(String.valueOf(obj2));
        }
        Object obj3 = map.get(c.c("131"));
        if (obj3 != null) {
            aVar.a(obj3);
        }
        Object obj4 = map.get(c.c("134"));
        if (obj4 != null) {
            aVar.b(String.valueOf(obj4));
        }
        Object obj5 = map.get(c.c("132"));
        if (obj5 != null) {
            aVar.e(String.valueOf(obj5));
        }
        Object obj6 = map.get(c.c("133"));
        if (obj6 != null) {
            aVar.d(String.valueOf(obj6));
        }
        return aVar;
    }

    public void a(Map<String, Object> map) {
        com.mbridge.msdk.config.component.common.file.b bVarA;
        if (map != null) {
            try {
                Object obj = map.get(c.c("116"));
                if (obj != null) {
                    d(String.valueOf(obj));
                }
                Object obj2 = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
                if (obj2 != null) {
                    a(String.valueOf(obj2));
                }
                Object obj3 = map.get(c.c("129"));
                if (obj3 != null) {
                    a(obj3);
                }
                Object obj4 = map.get(c.c("156"));
                if (obj4 != null) {
                    c(String.valueOf(obj4));
                } else {
                    c(String.valueOf(m0.G(com.mbridge.msdk.foundation.controller.c.n().d())));
                }
            } catch (Exception e10) {
                q0.b("XMLViewModel", e10.getMessage());
                return;
            }
        }
        if (TextUtils.isEmpty(d()) || (bVarA = com.mbridge.msdk.config.component.common.file.a.a(d(), 2, c())) == null || !bVarA.e()) {
            return;
        }
        b(bVarA.d());
    }

    public String c() {
        return this.f29141d;
    }

    public String d() {
        return this.f29138a;
    }

    public List<a> e() {
        return this.f29142e;
    }

    public void c(String str) {
        this.f29141d = str;
    }

    public void d(String str) {
        this.f29138a = str;
    }

    public String b() {
        return this.f29139b;
    }

    public void b(String str) {
        this.f29139b = str;
    }

    private void a(Object obj) {
        a aVarB;
        a aVarB2;
        if (obj == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof Map) {
                    a aVarB3 = b((Map<String, Object>) obj2);
                    if (aVarB3 != null) {
                        arrayList.add(aVarB3);
                    }
                } else if ((obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) && (aVarB2 = b(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b())) != null) {
                    arrayList.add(aVarB2);
                }
            }
        } else if (obj instanceof Map) {
            a aVarB4 = b((Map<String, Object>) obj);
            if (aVarB4 != null) {
                arrayList.add(aVarB4);
            }
        } else if ((obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) && (aVarB = b(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b())) != null) {
            arrayList.add(aVarB);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a((List<a>) arrayList);
    }

    public String a() {
        return this.f29140c;
    }

    public void a(String str) {
        this.f29140c = str;
    }

    public void a(List<a> list) {
        this.f29142e = list;
    }
}
