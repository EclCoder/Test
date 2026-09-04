package com.mbridge.msdk.config.component.inner.model;

import android.content.Context;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f28786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f28787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f28788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f28789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f28790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Map<String, Object> f28791f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        Map<String, Object> mapB;
        if (map != null) {
            Object obj = map.get(c.c("117"));
            if (obj != null) {
                d(String.valueOf(obj));
            }
            Object obj2 = map.get(c.c("116"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("159"));
            if (obj3 instanceof Map) {
                mapB = (Map) obj3;
            } else {
                mapB = obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a ? ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b() : null;
            }
            b(mapB);
            if (mapB != null && !mapB.isEmpty()) {
                c(String.valueOf(mapB.get(c.c("160"))));
            }
            Object obj4 = map.get(c.c(StatisticData.ERROR_CODE_NOT_FOUND));
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
        }
    }

    public void b(String str) {
        this.f28788c = str;
    }

    public void c(String str) {
        this.f28789d = str;
    }

    public void d(String str) {
        this.f28787b = str;
    }

    public String e() {
        return this.f28789d;
    }

    public String f() {
        return this.f28787b;
    }

    public Map<String, Object> b() {
        return this.f28791f;
    }

    public String c() {
        return this.f28790e;
    }

    public String d() {
        return this.f28788c;
    }

    public void b(Map<String, Object> map) {
        this.f28791f = map;
    }

    public Context a() {
        return this.f28786a;
    }

    public void a(Context context) {
        this.f28786a = context;
    }

    public void a(String str) {
        this.f28790e = str;
    }
}
