package com.mbridge.msdk.config.component.eac.model;

import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f28733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28735c;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("135"));
            if (obj != null) {
                a(obj);
            }
            Object obj2 = map.get(c.c("136"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("137"));
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
        }
    }

    public String b() {
        return this.f28734b;
    }

    public Object c() {
        return this.f28733a;
    }

    public void b(String str) {
        this.f28734b = str;
    }

    public void a(Object obj) {
        this.f28733a = obj;
    }

    public String a() {
        return this.f28735c;
    }

    public void a(String str) {
        this.f28735c = str;
    }
}
