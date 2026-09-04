package com.mbridge.msdk.config.component.url.model;

import android.content.Context;
import com.mbridge.msdk.config.component.common.util.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f29157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f29160d;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("160"));
            if (obj != null) {
                a(String.valueOf(obj));
            }
            Object obj2 = map.get(c.c("151"));
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get(c.c("109"));
            if (obj3 instanceof Map) {
                b((Map<String, Object>) obj3);
            } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                b(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b());
            }
        }
    }

    public void b(String str) {
        this.f29159c = str;
    }

    public String c() {
        return this.f29158b;
    }

    public String d() {
        return this.f29159c;
    }

    public Map<String, Object> b() {
        return this.f29160d;
    }

    public void b(Map<String, Object> map) {
        this.f29160d = map;
    }

    public Context a() {
        return this.f29157a;
    }

    public void a(Context context) {
        this.f29157a = context;
    }

    public void a(String str) {
        this.f29158b = str;
    }
}
