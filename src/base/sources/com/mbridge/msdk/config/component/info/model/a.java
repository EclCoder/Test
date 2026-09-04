package com.mbridge.msdk.config.component.info.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f28738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f28739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<String> f28740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<String> f28741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28742f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28743g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28744h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.a f28745i;

    public a(Map<String, Object> map) {
        a(map);
        g();
    }

    private void g() {
        com.mbridge.msdk.config.component.info.provider.a aVar = new com.mbridge.msdk.config.component.info.provider.a(this.f28742f, this.f28743g, this.f28744h);
        this.f28745i = aVar;
        aVar.e();
        this.f28745i.c();
        this.f28745i.d();
    }

    public List<String> a() {
        return this.f28741e;
    }

    public List<String> b() {
        return this.f28740d;
    }

    public Map<String, Object> c() {
        Map<String, Object> mapC = this.f28745i.c();
        Map<String, Object> mapD = this.f28745i.d();
        HashMap map = new HashMap();
        map.putAll(mapC);
        map.putAll(mapD);
        return map;
    }

    public List<String> d() {
        return this.f28738b;
    }

    public List<String> e() {
        return this.f28739c;
    }

    public String f() {
        return this.f28737a;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("138"));
            if (obj != null) {
                this.f28737a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.c("199"));
            if (obj instanceof List) {
                this.f28738b = (List) obj2;
            }
            Object obj3 = map.get(c.c("140"));
            if (obj3 instanceof List) {
                this.f28739c = (List) obj3;
            }
            Object obj4 = map.get(c.c("196"));
            if (obj4 instanceof List) {
                this.f28740d = (List) obj4;
            }
            Object obj5 = map.get(c.c("197"));
            if (obj5 instanceof List) {
                this.f28741e = (List) obj5;
            }
            Object obj6 = map.get(c.c("139"));
            if (obj6 != null) {
                try {
                    this.f28742f = Integer.parseInt(String.valueOf(obj6));
                } catch (Throwable th2) {
                    q0.b("DeviceModel", th2.getMessage());
                }
            }
            Object obj7 = map.get(c.c("194"));
            if (obj7 != null) {
                try {
                    this.f28743g = Integer.parseInt(String.valueOf(obj7));
                } catch (Throwable th3) {
                    q0.b("DeviceModel", th3.getMessage());
                }
            }
            Object obj8 = map.get(c.c("195"));
            if (obj8 != null) {
                try {
                    this.f28744h = Integer.parseInt(String.valueOf(obj8));
                } catch (Throwable th4) {
                    q0.b("DeviceModel", th4.getMessage());
                }
            }
        }
    }

    public Object b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str);
    }

    private String a(String str) {
        return this.f28745i.a(str);
    }
}
